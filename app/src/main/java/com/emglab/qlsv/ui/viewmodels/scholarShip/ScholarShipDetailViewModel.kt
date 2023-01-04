package com.emglab.qlsv.ui.viewmodels.scholarShip

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.ScholarShipRepository
import javax.inject.Inject

class ScholarShipDetailViewModel @Inject constructor(
    private val scholarShipRepository: ScholarShipRepository
) : ViewModel() {
    private lateinit var liveDataApplyScholarShip: LiveData<Resource<MyCTSVCap>>
    val applyScholarShip: MediatorLiveData<Resource<MyCTSVCap>> = MediatorLiveData()

    fun applyScholarShip(scholarShipID: Int){
        liveDataApplyScholarShip = scholarShipRepository.applyScholarShip(scholarShipID)
        applyScholarShip.removeSource(liveDataApplyScholarShip)
        applyScholarShip.addSource(liveDataApplyScholarShip){
            applyScholarShip.value = it
        }
    }
}