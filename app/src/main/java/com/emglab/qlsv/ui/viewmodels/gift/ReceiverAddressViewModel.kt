package com.emglab.qlsv.ui.viewmodels.gift

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.UserAddress
import com.emglab.qlsv.repositories.user.UserRepository
import javax.inject.Inject

class ReceiverAddressViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {
    val addresses = MediatorLiveData<Resource<List<UserAddress>>>()
    private lateinit var liveDataGetListAddresses: LiveData<Resource<List<UserAddress>>>

    fun getListAddress(){
        liveDataGetListAddresses = userRepository.getListUserAddress()
        addresses.removeSource(liveDataGetListAddresses)
        addresses.addSource(liveDataGetListAddresses){
            addresses.value = it
        }
    }
}