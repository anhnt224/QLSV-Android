package com.emglab.qlsv.modules.searchMotel.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.Motel
import com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository
import javax.inject.Inject

class MotelRegistrationCompleteViewModel @Inject constructor(
    private val motelRegistrationRepository: MotelRegistrationRepository
) : ViewModel() {
    private val _registerID = MutableLiveData<Int>()

    fun getListMotel(registerID: Int){
        _registerID.value = registerID
    }

    fun retry(){
        _registerID.value = _registerID.value
    }

    val motelList: LiveData<Resource<List<Motel>>> = _registerID.switchMap {
        motelRegistrationRepository.getListMotelResults(it)
    }
}