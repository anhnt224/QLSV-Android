package com.emglab.qlsv.ui.fragments.user


import android.content.Intent
import android.os.Bundle
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
import javax.inject.Inject


class LoginFragment : androidx.fragment.app.Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: LoginViewModel
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private var binding by autoCleared<FragmentLoginBinding>()
    private var email: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
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

        binding.apply {
            lifecycleOwner = this@LoginFragment

            btnLogin.setOnClickListener {
                login()
            }

            btnLostPassword.setOnClickListener {
                Navigation.findNavController(it).
                    navigate(LoginFragmentDirections.actionLoginFragmentToLostPasswordFragment())
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

        if (userCode != "hung.phammanh@hust.du.vn" && userCode != "quang.dv193066@sis.hust.edu.vn"){
            showToast("Tài khoản không tồn tại")
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
}
