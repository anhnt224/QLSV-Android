package com.emglab.qlsv

import androidx.lifecycle.ViewModelProvider
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.ui.viewmodels.user.LoginViewModel
import com.emglab.qlsv.extension.showToast
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class LoginActivity : AppCompatActivity(), HasSupportFragmentInjector, Injectable {

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<androidx.fragment.app.Fragment>
    override fun supportFragmentInjector(): AndroidInjector<androidx.fragment.app.Fragment> = dispatchingAndroidInjector
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: LoginViewModel
    @Inject lateinit var sharedPrefsHelper: SharedPrefsHelper

    companion object {
        val LOGOUT = "LOGOUT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        val logoutState = sharedPrefsHelper.get(
            SharedPrefsHelper.LOGOUT,
            SharedPrefsHelper.LOGOUT_DEFAULT)

        if (logoutState != SharedPrefsHelper.LOGOUT_DEFAULT) {
//            viewModel = ViewModelProviders.of(this, viewModelFactory).get(LoginViewModel::class.java)
//            viewModel.deleteRoom()
            sharedPrefsHelper.put(
                SharedPrefsHelper.LOGOUT,
                SharedPrefsHelper.LOGOUT_DEFAULT)
            if (logoutState == SharedPrefsHelper.LOGOUT_ERROR_TOKEN){
                showToast(resources.getString(R.string.error_token_text))
            }
        }
    }
}
