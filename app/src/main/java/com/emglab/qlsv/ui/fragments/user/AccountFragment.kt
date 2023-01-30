package com.emglab.qlsv.ui.fragments.user

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
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
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import java.lang.Exception
import javax.inject.Inject

class AccountFragment : Fragment(), Injectable {

    @Inject lateinit var sharedPrefsHelper: SharedPrefsHelper

    private lateinit var viewModel: AccountViewModel
    private lateinit var binding: AccountFragmentBinding
    private var remoteConfig = FirebaseRemoteConfig.getInstance()

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.account_fragment, container, false)
        (activity as MainActivity).supportActionBar?.hide()

        binding.apply {
            textVersion.text = "Phiên bản ${BuildConfig.VERSION_NAME}"

            viewLogout.setOnClickListener {
                logout()
            }
            viewUserInfo.setOnClickListener {
                Navigation.findNavController(requireView()).navigate(AccountFragmentDirections.actionAccountFragmentToUserInfoFragment())
            }
            viewChangePassword.setOnClickListener {
                Navigation.findNavController(requireView()).navigate(AccountFragmentDirections.actionAccountFragmentToChangePasswordFragment())
            }
            viewAddress.setOnClickListener {
                Navigation.findNavController(requireView()).navigate(AccountFragmentDirections.actionAccountFragmentToListAddressFragment())
            }
            viewFeedback.setOnClickListener {
                val link = remoteConfig.getString("feedback_link")
                openLink(link)
            }
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AccountViewModel::class.java)
    }

    private fun logout(){
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Bạn có chắc chắn muốn đăng xuất không?")
            .setNegativeButton("Đăng xuất"){_, _ ->
                logoutClick(sharedPrefsHelper)
            }.setPositiveButton("Hủy", null).show()
    }

    private fun openLink(link: String){
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
            startActivity(intent)
        }catch (e: Exception){

        }
    }
}