package com.emglab.qlsv.teacher.viewmodel.motel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.Motel
import com.emglab.qlsv.repositories.MotelRepository
import com.google.android.gms.maps.model.LatLng
import javax.inject.Inject

class TSearchMotelViewModel @Inject constructor(
    private val motelRepository: MotelRepository
) : ViewModel() {
    val motelList = MediatorLiveData<Resource<List<Motel>>>()
    private lateinit var motelListLiveData: LiveData<Resource<List<Motel>>>

    val latLng = MediatorLiveData<LatLng>()
    val radiusLiveData = MediatorLiveData<Double>()

    fun setRadius(rd: Double){
        radiusLiveData.value = rd
    }

    fun getRadius(): Double? {
        return radiusLiveData.value
    }

    fun getListMotel(latitude: Double, longitude: Double, distance: Int){
        motelListLiveData = motelRepository.getListMotel(latitude, longitude, distance)
        motelList.removeSource(motelListLiveData)
        motelList.addSource(motelListLiveData){
            motelList.value = it
        }
        Log.v("_SearchMotelViewModel", "This is: ${motelList.value!!.data}")
    }
}