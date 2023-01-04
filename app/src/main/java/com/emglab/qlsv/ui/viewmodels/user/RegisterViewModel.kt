package com.emglab.qlsv.ui.viewmodels.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.user.UserRepository
import javax.inject.Inject

class RegisterViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    var isSuccess = false
    val userRegisterResource = MediatorLiveData<Resource<MyCTSVCap>>()
    private lateinit var _userRegisterResource: LiveData<Resource<MyCTSVCap>>

    fun userRegister(userName: String,email : String,mobile: String) {
        isSuccess = true
        _userRegisterResource = userRepository.userRegister(userName,email,mobile)
        userRegisterResource.removeSource(_userRegisterResource)
        userRegisterResource.addSource(_userRegisterResource) {
            userRegisterResource.value = it
        }
    }
}
