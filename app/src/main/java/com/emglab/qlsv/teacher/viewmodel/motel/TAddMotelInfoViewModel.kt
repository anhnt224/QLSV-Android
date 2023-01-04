package com.emglab.qlsv.teacher.viewmodel.motel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.Motel
import com.emglab.qlsv.models.entity.UserAddress
import com.emglab.qlsv.models.res.UpdateStudentContactResp
import com.emglab.qlsv.repositories.user.UserRepository
import javax.inject.Inject

class TAddMotelInfoViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    val updateUserAddress = MediatorLiveData<Resource<UpdateStudentContactResp>>()
    private lateinit var liveDaraUpdateUserAddress: LiveData<Resource<UpdateStudentContactResp>>

    fun updateUserAddress(userAddress: UserAddress, motelInfo: Motel){
        liveDaraUpdateUserAddress = userRepository.updateUserAddress(userAddress, motelInfo)
        updateUserAddress.removeSource(liveDaraUpdateUserAddress)
        updateUserAddress.addSource(liveDaraUpdateUserAddress){
            updateUserAddress.value = it
        }
    }
}