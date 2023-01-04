package com.emglab.qlsv.ui.viewmodels.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.user.UserRepository
import javax.inject.Inject

class LostPasswordViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    var isSuccess = false
    val lostPasswordResource = MediatorLiveData<Resource<MyCTSVCap>>()
    private lateinit var _lostPasswordResource: LiveData<Resource<MyCTSVCap>>

    fun lostPassword(userName: String) {
        isSuccess = true
        _lostPasswordResource = userRepository.lostPassword(userName,"","")
        lostPasswordResource.removeSource(_lostPasswordResource)
        lostPasswordResource.addSource(_lostPasswordResource) {
            lostPasswordResource.value = it
        }
    }
}
