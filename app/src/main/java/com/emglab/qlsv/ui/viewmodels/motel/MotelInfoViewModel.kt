package com.emglab.qlsv.ui.viewmodels.motel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.ImageMotel2
import com.emglab.qlsv.repositories.MotelRepository
import javax.inject.Inject

class MotelInfoViewModel @Inject constructor(
    private val motelRepository: MotelRepository
) : ViewModel() {
    val motelImageList = MediatorLiveData<Resource<List<ImageMotel2>>>()
    private lateinit var motelImageListLiveData: LiveData<Resource<List<ImageMotel2>>>

    fun getListMotel(motelID: Int){
        motelImageListLiveData = motelRepository.getMotelListImage(motelID)
        motelImageList.removeSource(motelImageListLiveData)
        motelImageList.addSource(motelImageListLiveData){
            motelImageList.value = it
        }
    }
}