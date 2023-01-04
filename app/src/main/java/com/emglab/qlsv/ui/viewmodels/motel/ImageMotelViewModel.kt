package com.emglab.qlsv.ui.viewmodels.motel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.ImageMotel
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.MotelRepository
import javax.inject.Inject

class ImageMotelViewModel @Inject constructor(
    private val imageMotelRepository: MotelRepository
) : ViewModel() {
    val deleteImageMotel = MediatorLiveData<Resource<MyCTSVCap>>()
    private lateinit var liveDataDeleteImage: LiveData<Resource<MyCTSVCap>>

    fun getAllImage(idMotel: Int) = imageMotelRepository.getAllImageMotel(idMotel)

    fun deleteImage(imageMotel: ImageMotel) = imageMotelRepository.deleteImageMotel(imageMotel)

    fun insertImage(imageMotel: ImageMotel) = imageMotelRepository.insertImage(imageMotel)

    fun deleteImage( username: String, token: String ,motelID: Int, type: Int) {
        liveDataDeleteImage = imageMotelRepository.deleteImageMotel(username, token, motelID, type)
        deleteImageMotel.removeSource(liveDataDeleteImage)
        deleteImageMotel.addSource(liveDataDeleteImage){
            deleteImageMotel.value = it
        }
    }

}