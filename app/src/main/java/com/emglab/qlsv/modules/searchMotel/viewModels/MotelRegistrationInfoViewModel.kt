package com.emglab.qlsv.modules.searchMotel.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository
import javax.inject.Inject

class MotelRegistrationInfoViewModel @Inject constructor(
    private val motelRegistrationRepository: MotelRegistrationRepository
) : ViewModel() {
    private val docId = MutableLiveData<Int>()
    fun deleteMotelRegistration(id: Int){
        docId.value = id
    }

    val deleteResp: LiveData<Resource<MyCTSVCap>> = docId.switchMap {
        motelRegistrationRepository.deleteMotelRegistration(it)
    }
}