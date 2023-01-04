package com.emglab.qlsv.teacher.fragment.account

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.observe
import com.emglab.qlsv.R
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.TChangePasswordFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.extension.logoutClick
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.teacher.viewmodel.account.TChangePasswordViewModel
import com.emglab.qlsv.utilities.autoCleared
import javax.inject.Inject

class TChangePasswordFragment : Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var viewModel: TChangePasswordViewModel
    private var binding by autoCleared<TChangePasswordFragmentBinding>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.t_change_password_fragment, container, false)
        setupViewModel()
        subscribeUi()

        binding.apply {
            lifecycleOwner = this@TChangePasswordFragment

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
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(TChangePasswordViewModel::class.java)
    }

    private fun subscribeUi() {
        with(viewModel){
            changePasswordResource.observe(viewLifecycleOwner){ resource ->
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
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.clear()

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                activity!!.onBackPressed()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }

    }
}