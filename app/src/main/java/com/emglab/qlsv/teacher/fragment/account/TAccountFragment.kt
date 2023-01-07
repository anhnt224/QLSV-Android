package com.emglab.qlsv.teacher.fragment.account

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
import com.emglab.qlsv.R
import com.emglab.qlsv.TeacherActivity
import com.emglab.qlsv.databinding.TAccountFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.extension.logoutClick
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.teacher.viewmodel.account.TAccountViewModel
import com.emglab.qlsv.ui.fragments.user.AccountFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import java.lang.Exception
import javax.inject.Inject

class TAccountFragment : Fragment(), Injectable {

    companion object {
        fun newInstance() = AccountFragment()
    }
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper

    private lateinit var viewModel: TAccountViewModel
    private lateinit var binding: TAccountFragmentBinding

    private val remoteConfig = Firebase.remoteConfig

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.t_account_fragment, container, false)
        (activity as TeacherActivity).supportActionBar?.hide()

        binding.apply {
            textVersion.text = "Phiên bản ${BuildConfig.VERSION_NAME}"

            viewLogout.setOnClickListener {
                logout()
            }

            viewUserInfo.setOnClickListener {
                Navigation.findNavController(requireView()).navigate(TAccountFragmentDirections.actionTAccountFragmentToTeacherInfoFragment())
            }

            viewChangePassword.setOnClickListener {
                Navigation.findNavController(requireView()).navigate(TAccountFragmentDirections.actionTAccountFragmentToTChangePasswordFragment())
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
        viewModel = ViewModelProvider(this).get(TAccountViewModel::class.java)
    }

    private fun logout(){
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Bạn có chắc chắn muốn đăng xuất không?")
            .setNegativeButton("Đăng xuất"){_, _ ->
                logoutClick(sharedPrefsHelper)
            }.setPositiveButton("Hủy"){_, _ ->

            }.show()
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