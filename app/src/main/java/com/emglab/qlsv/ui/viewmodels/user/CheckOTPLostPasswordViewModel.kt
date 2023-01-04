package com.emglab.qlsv.ui.viewmodels.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.user.UserRepository
import javax.inject.Inject

class CheckOTPLostPasswordViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    var isSuccess = false
    val checkOTPLostPasswordResource = MediatorLiveData<Resource<MyCTSVCap>>()
    private lateinit var _checkOTPLostPasswordResource: LiveData<Resource<MyCTSVCap>>

    fun checkOTPLostPassword(userName: String,otp: String) {
        isSuccess = true
        _checkOTPLostPasswordResource = userRepository.checkOTPLostPassword(userName,"",otp,"")
        checkOTPLostPasswordResource.removeSource(_checkOTPLostPasswordResource)
        checkOTPLostPasswordResource.addSource(_checkOTPLostPasswordResource) {
            checkOTPLostPasswordResource.value = it
        }
    }
}
