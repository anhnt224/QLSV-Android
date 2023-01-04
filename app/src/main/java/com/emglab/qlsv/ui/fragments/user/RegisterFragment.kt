package com.emglab.qlsv.ui.fragments.user


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

import com.emglab.qlsv.R
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.FragmentRegisterBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.ui.viewmodels.user.RegisterViewModel
import com.emglab.qlsv.utilities.*
import kotlinx.android.synthetic.main.fragment_register.*
import javax.inject.Inject

class RegisterFragment : androidx.fragment.app.Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: RegisterViewModel
    private var binding by autoCleared<FragmentRegisterBinding>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_register, container, false)
        setupViewModel()
        subscribeUi()

        binding.apply {
            lifecycleOwner = this@RegisterFragment

            btnRegister.setOnClickListener {
                register()
            }
        }
        return binding.root
    }

    private fun setupViewModel() {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(RegisterViewModel::class.java)
    }

    private fun subscribeUi() {
        with(viewModel){
            userRegisterResource.observe(viewLifecycleOwner, Observer { resource ->
                binding.registerResource = resource
                if (resource.data != null && isSuccess){
                    if (resource.status == Status.SUCCESS_NETWORK){
                        showToast("Kiểm tra email để nhận mật khẩu")
                        isSuccess = false
                        activity!!.onBackPressed()
                    }
                    if (resource.status == Status.ERROR){
                        showToast(resource.respText!!)
                        isSuccess = false
                    }
                }
            })
        }
    }

    fun register() {
        val mobile = edtMobile.text.toString()
        val userCode = edtUserCode.text.toString()
        val email = edtEmail.text.toString()
        if (userCode.equals("")){
            showToast("Nhập tài khoản")
            return
        }
        if (email.equals("")){
            showToast("Nhập email")
            return
        }
        if (mobile.equals("")){
            showToast("Nhập số điện thoại")
            return
        }

        viewModel.userRegister(userCode,email,mobile)
    }

}
