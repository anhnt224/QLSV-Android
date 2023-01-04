package com.emglab.qlsv.ui.fragments.user

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.FragmentLostPasswordBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.ui.viewmodels.user.LostPasswordViewModel
import com.emglab.qlsv.utilities.autoCleared


import javax.inject.Inject


class LostPasswordFragment : androidx.fragment.app.Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: LostPasswordViewModel
    private var userCode = ""
    private var binding by autoCleared<FragmentLostPasswordBinding>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_lost_password, container, false)
        setupViewModel()
//        setupToolbar()
        subscribeUi()

        binding.apply {
            lifecycleOwner = this@LostPasswordFragment

            btnSendOTP.setOnClickListener {
                sendOTP()
            }
        }
        return binding.root
    }

    private fun setupViewModel() {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(LostPasswordViewModel::class.java)
    }

    private fun subscribeUi() {
        with(viewModel){
            lostPasswordResource.observe(viewLifecycleOwner, Observer { resource ->
                binding.lostPasswordResource = resource
                if (resource.data != null && isSuccess){
                    if (resource.status == Status.SUCCESS_NETWORK){
                        showToast("Kiểm tra email để nhận mã OTP")
                        Navigation.findNavController(view!!).
                            navigate(LostPasswordFragmentDirections.actionLostPasswordFragmentToCheckOTPLostPasswordFragment(userCode))
                        isSuccess = false
                    }
                    if (resource.status == Status.ERROR){
                        showToast(resource.respText!!)
                        isSuccess = false
                    }
                }
            })
        }
    }

    fun sendOTP() {
        userCode = binding.edtUserCode.text.toString()
        if (userCode.equals("")){
            showToast("Nhập tài khoản")
            return
        }
        viewModel.lostPassword(userCode)
    }

}
