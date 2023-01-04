package com.emglab.qlsv.ui.viewmodels.scholarShip

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.ScholarShip
import com.emglab.qlsv.repositories.ScholarShipRepository
import javax.inject.Inject

class ListScholarShipAppliedViewModel @Inject constructor(
    private val scholarShipRepository: ScholarShipRepository
) : ViewModel() {
    val listScholarShipsApplied: MediatorLiveData<Resource<List<ScholarShip>>> = MediatorLiveData()
    private lateinit var liveDataGetListScholarShipsApplied: LiveData<Resource<List<ScholarShip>>>
    fun getListScholarShips(){
        liveDataGetListScholarShipsApplied = scholarShipRepository.getListScholarShipsApplied(0, 1000)
        listScholarShipsApplied.removeSource(liveDataGetListScholarShipsApplied)
        listScholarShipsApplied.addSource(liveDataGetListScholarShipsApplied){
            listScholarShipsApplied.value = it
        }
    }
}