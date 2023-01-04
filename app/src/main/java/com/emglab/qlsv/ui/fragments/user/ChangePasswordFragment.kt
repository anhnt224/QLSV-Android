package com.emglab.qlsv.ui.fragments.user


import android.annotation.SuppressLint
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import com.emglab.qlsv.R
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.FragmentChangePasswordBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.extension.*
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.utilities.*
import com.emglab.qlsv.ui.viewmodels.user.ChangePasswordViewModel

import javax.inject.Inject


class ChangePasswordFragment : androidx.fragment.app.Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var viewModel: ChangePasswordViewModel
    private var binding by autoCleared<FragmentChangePasswordBinding>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_change_password, container, false)
        setupViewModel()
        subscribeUi()

        binding.apply {
            lifecycleOwner = this@ChangePasswordFragment

            btnChangePassword.setOnClickListener {
                changePasword()
            }
        }

        return binding.root
    }

    private fun changePasword() {
        val oldPassword = binding.edtOldPassword.text.toString()
        val newPassword1 = binding.edtNewPassword1.text.toString()
        val newPassword2 = binding.edtNewPassword2.text.toString()
        if (oldPassword == ""){
            showToast("Nhập mật khẩu cũ")
            return
        }
        if (newPassword1 == ""){
            showToast("Nhập mật mới")
            return
        }
        if (newPassword2 == ""){
            showToast("Nhập xác nhận mật khẩu mới")
            return
        }
        if (newPassword1 != newPassword2){
            showToast("Xác nhận sai mật khẩu")
            return
        }
        viewModel.changePassword(oldPassword,newPassword1)
    }

    private fun setupViewModel() {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ChangePasswordViewModel::class.java)
    }

    private fun subscribeUi() {
        with(viewModel){
            changePasswordResource.observe(viewLifecycleOwner, Observer { resource ->
                binding.changePasswordResource = resource
                if (resource.data != null && isSuccess){
                    if (resource.status == Status.SUCCESS_NETWORK){
                        showToast("Đổi mật khẩu thành công, đăng nhập lại")
                        isSuccess = false
                        logoutClick(sharedPrefsHelper)
                    }
                    if (resource.status == Status.ERROR){
                        showToast(resource.respText!!)
                        isSuccess = false
                    }
                }
            })
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.clear()

    }

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            android.R.id.home -> {
                activity!!.onBackPressed()
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }

    }
}
