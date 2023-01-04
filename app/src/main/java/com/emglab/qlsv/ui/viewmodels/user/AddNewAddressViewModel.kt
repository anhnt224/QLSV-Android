package com.emglab.qlsv.ui.viewmodels.user

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.UserAddress
import com.emglab.qlsv.models.res.UpdateStudentContactResp
import com.emglab.qlsv.repositories.user.UserRepository
import com.emglab.qlsv.utilities.DEFAULT_CITY
import javax.inject.Inject

class AddNewAddressViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {
    private var address: MutableLiveData<UserAddress> = MutableLiveData()
    val mediatorLiveGetListCities = MediatorLiveData<Resource<List<String>>>()
    val mediatorLiveGetListDistricts = MediatorLiveData<Resource<List<String>>>()
    val mediatorLiveGetListWards = MediatorLiveData<Resource<List<String>>>()
    val updateUserAddress = MediatorLiveData<Resource<UpdateStudentContactResp>>()

    private lateinit var liveDataGetListCities: LiveData<Resource<List<String>>>
    private lateinit var liveDataGetListDistricts: LiveData<Resource<List<String>>>
    private lateinit var liveDataGetListWards: LiveData<Resource<List<String>>>
    private lateinit var liveDaraUpdateUserAddress: LiveData<Resource<UpdateStudentContactResp>>

    init {
        address.value = UserAddress()
        getListCities()
        getListDistricts(DEFAULT_CITY)
    }

    fun setAddress(address: UserAddress){
        this.address.value = address
    }

    fun getAddress(): LiveData<UserAddress>{
        return address
    }

    private fun getListCities(){
        liveDataGetListCities = userRepository.getListCities()
        mediatorLiveGetListCities.removeSource(liveDataGetListCities)
        mediatorLiveGetListCities.addSource(liveDataGetListCities){
            mediatorLiveGetListCities.value = it
        }
    }

    fun getListDistricts(city: String){
        liveDataGetListDistricts = userRepository.getListDistricts(city)
        mediatorLiveGetListDistricts.removeSource(liveDataGetListDistricts)
        mediatorLiveGetListDistricts.addSource(liveDataGetListDistricts){
            Log.d("_DISTRICTS", it.toString())
            mediatorLiveGetListDistricts.value = it
        }
    }

    fun getListWards(city: String, district: String){
        liveDataGetListWards = userRepository.getListWards(city, district)
        mediatorLiveGetListWards.removeSource(liveDataGetListWards)
        mediatorLiveGetListWards.addSource(liveDataGetListWards){
            mediatorLiveGetListWards.value = it
        }
    }

    fun updateUserAddress(userAddress: UserAddress){
        liveDaraUpdateUserAddress = userRepository.updateUserAddress(userAddress, null)
        updateUserAddress.removeSource(liveDaraUpdateUserAddress)
        updateUserAddress.addSource(liveDaraUpdateUserAddress){
            updateUserAddress.value = it
        }
    }

}