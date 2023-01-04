package com.emglab.qlsv.ui.viewmodels.motel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.Motel
import com.emglab.qlsv.repositories.MotelRepository
import com.emglab.qlsv.ui.fragments.motel.SearchMotelDistance
import com.emglab.qlsv.ui.fragments.motel.SearchMotelFooterState
import com.google.android.gms.maps.model.LatLng
import javax.inject.Inject


class SearchMotelViewModel @Inject constructor(
    private val motelRepository: MotelRepository
) : ViewModel() {
    val motelList = MediatorLiveData<Resource<List<Motel>>>()
    private lateinit var motelListLiveData: LiveData<Resource<List<Motel>>>

    private var _latLng = MediatorLiveData<LatLng>()
    val latLng: MediatorLiveData<LatLng>
        get() = _latLng

    fun setLatLng(latLng: LatLng){
        _latLng.value = latLng
    }

    private val _radius = MediatorLiveData<SearchMotelDistance>()
    val radius: MediatorLiveData<SearchMotelDistance>
        get() = _radius

    fun setRadius(searchMotelDistance: SearchMotelDistance){
        _radius.value = searchMotelDistance
    }

    val zoomLevel = MediatorLiveData<Float>()
    val mapCenter = MediatorLiveData<LatLng>()

    private val _footerState = MediatorLiveData<SearchMotelFooterState>()
    val footerState: MediatorLiveData<SearchMotelFooterState>
    get() = _footerState

    fun changeFooterState(){
        if (footerState.value == SearchMotelFooterState.COLLAPSE){
            footerState.value = SearchMotelFooterState.EXPAND
        }else{
            footerState.value = SearchMotelFooterState.COLLAPSE
        }
    }

    init {
        setRadius(searchMotelDistance = SearchMotelDistance.ONE)
        zoomLevel.value = 15f
//        footerState.value = SearchMotelFooterState.COLLAPSE
    }
    fun getListMotel(){
        if (_latLng.value == null || _radius.value == null){
            return
        }
        motelListLiveData = motelRepository.getListMotel(
            latitude = _latLng.value!!.latitude,
            longitude = _latLng.value!!.longitude,
            distance = _radius.value!!.distance.toInt()
        )
        motelList.removeSource(motelListLiveData)
        motelList.addSource(motelListLiveData){
            motelList.value = it
        }
    }
}