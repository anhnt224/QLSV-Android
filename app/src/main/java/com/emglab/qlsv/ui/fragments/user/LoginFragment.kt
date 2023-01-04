package com.emglab.qlsv.ui.fragments.user


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.emglab.qlsv.MainActivity
import com.emglab.qlsv.R
import com.emglab.qlsv.TeacherActivity
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.FragmentLoginBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.ui.viewmodels.user.LoginViewModel
import com.emglab.qlsv.utilities.autoCleared
import com.emglab.qlsv.utilities.runOnIoThread
import com.microsoft.identity.client.*
import com.microsoft.identity.client.exception.MsalException
import javax.inject.Inject


class LoginFragment : androidx.fragment.app.Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: LoginViewModel
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private var binding by autoCleared<FragmentLoginBinding>()
    private var mAccount: IAccount? = null
    private var mSingleAccountApp: ISingleAccountPublicClientApplication? = null
    private val TAG = "_LOGIN_WITH_MS"
    private var email: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false)

        val email = sharedPrefsHelper.getEmail()
        if (email.contains("@sis.hust.edu.vn")){
            nextToMainActivity()
        }

        if(email.contains("@hust.edu.vn")){
            nextToTeacherActivity()
        }

        setupViewModel()
        subscribeUi()

        PublicClientApplication.createSingleAccountPublicClientApplication(requireContext(), R.raw.auth_config_single_account, object: IPublicClientApplication.ISingleAccountApplicationCreatedListener {
            override fun onCreated(application: ISingleAccountPublicClientApplication?) {
                mSingleAccountApp = application
                loadAccount()
            }

            override fun onError(exception: MsalException?) {
                Log.d(TAG, "$exception")
            }

        })

        binding.apply {
            lifecycleOwner = this@LoginFragment

            btnLogin.setOnClickListener {
                login()
            }

            btnLostPassword.setOnClickListener {
                Navigation.findNavController(it).
                    navigate(LoginFragmentDirections.actionLoginFragmentToLostPasswordFragment())
            }

            viewLoginWithMs.setOnClickListener {
                if(mSingleAccountApp == null){
                    return@setOnClickListener
                }

                mSingleAccountApp!!.signIn(requireActivity(), null, arrayOf("ea31a64a-f14a-454a-b749-a872f78caf3b/access_as_user"), getAuthInteractiveCallback())
            }
        }

        return binding.root
    }

    private fun setupViewModel() {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(LoginViewModel::class.java)
    }

    private fun subscribeUi() {
        with(viewModel){
            mediatorliveLoginResource.observe(viewLifecycleOwner, Observer { resource ->
                binding.loginResource = resource
                if (resource.data != null && isSuccess){
                    if (resource.status == Status.SUCCESS_NETWORK){
                        if(email.contains("@hust.edu.vn")){
                            isSuccess = false
                            nextToTeacherActivity()
                        }else{
                            isSuccess = false
                            nextToMainActivity()
                        }
                    }
                    if (resource.status == Status.ERROR){
                        runOnIoThread {
                            if(mSingleAccountApp != null && mSingleAccountApp!!.currentAccount != null){
                                mSingleAccountApp!!.signOut()
                            }
                        }

                        showToast(resource.respText!!)
                        isSuccess = false
                    }
                }

            })
        }
    }

    private fun login() {
        val userCode = binding.edtUserCode.text.toString()
        val password = binding.edtPassword.text.toString()
        if (userCode == ""){
            showToast("Nhập tài khoản")
            return
        }
        if (password == ""){
            showToast("Nhập mật khẩu")
            return
        }

        email = userCode
        viewModel.login(userCode,password)

    }

    private fun nextToMainActivity() {
        startActivity(Intent(context, MainActivity::class.java))
        requireActivity().finish()
    }

    private fun nextToTeacherActivity(){
        startActivity(Intent(context, TeacherActivity::class.java))
        requireActivity().finish()
    }

    /**
     * Load current account in caches
     */
    private fun loadAccount(){
        if (mSingleAccountApp == null){
            return
        }

        mSingleAccountApp!!.getCurrentAccountAsync(object: ISingleAccountPublicClientApplication.CurrentAccountCallback {
            override fun onAccountLoaded(activeAccount: IAccount?) {
                mAccount = activeAccount
                updateUI()
            }

            override fun onAccountChanged(priorAccount: IAccount?, currentAccount: IAccount?) {
                Log.d(TAG, "Account changed")
            }

            override fun onError(exception: MsalException) {
                Log.d(TAG,"ASYNC error: $exception")
            }

        })
    }

    /**
     * Updates UI base on the current account
     */
    private fun updateUI(){
        if(mAccount != null){
            email = mAccount!!.username
        }
    }

    /**
     *
     */
    private fun getAuthInteractiveCallback(): AuthenticationCallback {
        return object: AuthenticationCallback {
            override fun onSuccess(authenticationResult: IAuthenticationResult) {
                mAccount = authenticationResult.account
                Log.d(TAG, "Access Token: ${authenticationResult.accessToken}")
                email = authenticationResult.account.username
                val accessToken = authenticationResult.accessToken
                viewModel.loginWithMSAccount(mapOf("Authorization" to "Bearer $accessToken"))
            }

            override fun onCancel() {
                Log.d(TAG, "User cancelled login.")
            }

            override fun onError(exception: MsalException?) {
                runOnIoThread {
                    try{
                        if(mAccount != null){
                            mSingleAccountApp!!.signOut()
                        }
                    }catch (e: Exception){

                    }
                }
            }
        }
    }
}
