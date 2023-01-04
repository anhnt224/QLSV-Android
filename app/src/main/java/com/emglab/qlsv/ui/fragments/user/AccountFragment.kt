package com.emglab.qlsv.ui.fragments.user

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.emglab.qlsv.BuildConfig
import com.emglab.qlsv.MainActivity
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.AccountFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.extension.logoutClick
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.ui.viewmodels.user.AccountViewModel
import com.emglab.qlsv.utilities.runOnIoThread
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.microsoft.identity.client.IAccount
import com.microsoft.identity.client.IPublicClientApplication
import com.microsoft.identity.client.ISingleAccountPublicClientApplication
import com.microsoft.identity.client.PublicClientApplication
import com.microsoft.identity.client.exception.MsalException
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception
import javax.inject.Inject

class AccountFragment : Fragment(), Injectable {

    companion object {
        fun newInstance() = AccountFragment()
    }
    @Inject lateinit var sharedPrefsHelper: SharedPrefsHelper

    private lateinit var viewModel: AccountViewModel
    private lateinit var binding: AccountFragmentBinding
    private val remoteConfig = Firebase.remoteConfig
    private var mSingleAccountApp: ISingleAccountPublicClientApplication? = null
    private var mAccount: IAccount? = null


    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.account_fragment, container, false)
        (activity as MainActivity).supportActionBar?.hide()

        binding.apply {
            textVersion.text = "Phiên bản ${BuildConfig.VERSION_NAME}"
            textFullName.text = sharedPrefsHelper.getFullName()
            textStudentID.text = sharedPrefsHelper.getUserName()
            getImageStudent()


            viewLogout.setOnClickListener {
                logout()
            }
            viewQRStudent.setOnClickListener {
                Navigation.findNavController(requireView()).navigate(AccountFragmentDirections.actionAccountFragmentToQrStudentFragment())
            }
            viewUserInfo.setOnClickListener {
                Navigation.findNavController(requireView()).navigate(AccountFragmentDirections.actionAccountFragmentToUserInfoFragment())
            }
            viewChangePassword.setOnClickListener {
                Navigation.findNavController(requireView()).navigate(AccountFragmentDirections.actionAccountFragmentToChangePasswordFragment())
            }
            viewBook.setOnClickListener {
                openLink(remoteConfig.getString("book"))
            }
            viewFeedback.setOnClickListener {
                openLink(remoteConfig.getString("feedback"))
            }
            viewError.setOnClickListener {
                openLink(remoteConfig.getString("error"))
            }
            viewAbout.setOnClickListener {
                openLink(remoteConfig.getString("aboutCTSV"))
            }
            viewAddress.setOnClickListener {
                Navigation.findNavController(requireView()).navigate(AccountFragmentDirections.actionAccountFragmentToListAddressFragment())
                //Navigation.findNavController(requireView()).navigate(AccountFragmentDirections.actionAccountFragmentToImageMotelFragment(2))
            }
            viewNotes.setOnClickListener {
                Navigation.findNavController(requireView()).navigate(AccountFragmentDirections.actionAccountFragmentToNotesFragment())
            }
            runningView.setOnClickListener {
                openRunningFragment()
            }
        }

        PublicClientApplication.createSingleAccountPublicClientApplication(requireContext(), R.raw.auth_config_single_account, object: IPublicClientApplication.ISingleAccountApplicationCreatedListener {
            override fun onCreated(application: ISingleAccountPublicClientApplication?) {
                mSingleAccountApp = application
                loadAccount()
            }

            override fun onError(exception: MsalException?) {
                Log.d("_LOGIN_WITH_MS", "$exception")
            }

        })

        return binding.root
    }

    private fun openRunningFragment() {
        Navigation.findNavController(requireView())
            .navigate(AccountFragmentDirections.actionAccountFragmentToRunDashboardFragment())

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AccountViewModel::class.java)
    }

    private fun logout(){
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Bạn có chắc chắn muốn đăng xuất không?")
            .setNegativeButton("Đăng xuất"){_, _ ->
                runOnIoThread {
                    logoutMicrosoftAccount()
                }
                logoutClick(sharedPrefsHelper)
            }.setPositiveButton("Hủy"){_, _ ->

            }.show()
    }

    private fun logoutMicrosoftAccount(){
        if(mAccount == null){
            return
        }

        /**
         * Removes the signed-in account and cached tokens from this app
         */
        mSingleAccountApp!!.signOut()
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
            }

            override fun onAccountChanged(priorAccount: IAccount?, currentAccount: IAccount?) {

            }

            override fun onError(exception: MsalException) {

            }

        })
    }

    private fun getImageStudent(){
        Picasso.get().load("https://ctt-sis.hust.edu.vn/Content/Anh/anh_${sharedPrefsHelper.getUserName()}.PNG").into(binding.imageStudent, object: Callback {
            override fun onSuccess() {

            }

            override fun onError(e: Exception?) {
                Picasso.get().load("https://ctt-sis.hust.edu.vn/Content/Anh/anh_${sharedPrefsHelper.getUserName()}.JPEG").into(binding.imageStudent, object: Callback {
                    override fun onSuccess() {

                    }

                    override fun onError(e: Exception?) {
                        Picasso.get().load("https://ctt-sis.hust.edu.vn/Content/Anh/anh_${sharedPrefsHelper.getUserName()}.JPG").into(binding.imageStudent, object: Callback {
                            override fun onSuccess() {

                            }

                            override fun onError(e: Exception?) {

                            }

                        })
                    }

                })
            }

        })
    }

    private fun openLink(link: String){
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
            startActivity(intent)
        }catch (e: Exception){
            showToast(e.message.toString())
        }
    }
}