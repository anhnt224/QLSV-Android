package com.emglab.qlsv.teacher.viewmodel.scholarShip

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.ScholarShip
import com.emglab.qlsv.repositories.ScholarShipRepository
import javax.inject.Inject

class TListScholarShipsViewModel @Inject constructor(
    private val scholarShipRepository: ScholarShipRepository
) : ViewModel() {
    private lateinit var liveDataGetListScholarShip: LiveData<Resource<List<ScholarShip>>>
    val listScholarShips: MediatorLiveData<Resource<List<ScholarShip>>> = MediatorLiveData()

    init {
        getListScholarShips(0, 1000)
    }

    fun getListScholarShips(page: Int, row: Int){
        liveDataGetListScholarShip = scholarShipRepository.getListScholarShips(page, row)
        listScholarShips.removeSource(liveDataGetListScholarShip)
        listScholarShips.addSource(liveDataGetListScholarShip){
            listScholarShips.value = it
        }
    }
}