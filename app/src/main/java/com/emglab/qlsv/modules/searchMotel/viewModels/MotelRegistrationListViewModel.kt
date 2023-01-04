package com.emglab.qlsv.modules.searchMotel.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.extension.getTimeQuery
import com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistration
import java.util.*
import javax.inject.Inject

class MotelRegistrationListViewModel @Inject constructor(
    private val motelRegistrationRepository: MotelRegistrationRepository
) : ViewModel() {

    val motelRegistrationList = MediatorLiveData<Resource<List<MotelRegistration>>>()
    private lateinit var motelRegistrationListLiveData: LiveData<Resource<List<MotelRegistration>>>

    init {
        getMotelRegistrationList()
    }

    fun getMotelRegistrationList() {
        val startTime = "2022-11-07 00:00:00"
        val endTime = Calendar.getInstance().time.getTimeQuery()

        motelRegistrationListLiveData =
            motelRegistrationRepository.getMotelRegistrationList(startTime, endTime)
        motelRegistrationList.removeSource(motelRegistrationListLiveData)
        motelRegistrationList.addSource(motelRegistrationListLiveData) {
            motelRegistrationList.value = it
        }
    }
}