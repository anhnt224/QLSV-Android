package com.emglab.qlsv.ui.viewmodels.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.res.user.CTSVUserLoginRes
import com.emglab.qlsv.repositories.user.UserRepository
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    var isSuccess = false
    val mediatorliveLoginResource = MediatorLiveData<Resource<CTSVUserLoginRes>>()
    private lateinit var liveLoginResource: LiveData<Resource<CTSVUserLoginRes>>

    fun login(userName: String,password: String) {
        isSuccess = true
        liveLoginResource = userRepository.login(userName,password)
        mediatorliveLoginResource.removeSource(liveLoginResource)
        mediatorliveLoginResource.addSource(liveLoginResource) {
            mediatorliveLoginResource.value = it
        }
    }

    fun loginWithMSAccount(headers: Map<String, String>){
        isSuccess = true
        liveLoginResource = userRepository.loginWithMSAccount(headers)
        mediatorliveLoginResource.removeSource(liveLoginResource)
        mediatorliveLoginResource.addSource(liveLoginResource) {
            mediatorliveLoginResource.value = it
        }
    }
}
