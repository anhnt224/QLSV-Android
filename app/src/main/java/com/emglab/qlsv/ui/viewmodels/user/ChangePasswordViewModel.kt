package com.emglab.qlsv.ui.viewmodels.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.user.UserRepository
import javax.inject.Inject

class ChangePasswordViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    var isSuccess = false
    val changePasswordResource = MediatorLiveData<Resource<MyCTSVCap>>()
    private lateinit var _changePasswordResource: LiveData<Resource<MyCTSVCap>>

    fun changePassword(password: String,newPassword: String) {
        isSuccess = true
        _changePasswordResource = userRepository.changePassword(password,newPassword)
        changePasswordResource.removeSource(_changePasswordResource)
        changePasswordResource.addSource(_changePasswordResource) {
            changePasswordResource.value = it
        }
    }
}
