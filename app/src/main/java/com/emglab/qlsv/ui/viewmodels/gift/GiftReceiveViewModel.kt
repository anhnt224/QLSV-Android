package com.emglab.qlsv.ui.viewmodels.gift

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.repositories.GiftRepository
import javax.inject.Inject

class GiftReceiveViewModel @Inject constructor(
    private val giftRepository: GiftRepository
) : ViewModel() {
    val giftsRegistered = MediatorLiveData<Resource<List<Gift>>>()
    private lateinit var getGiftsRegistered: LiveData<Resource<List<Gift>>>

    init {
        getGiftsRegistered()
    }
    fun getGiftsRegistered(){
        getGiftsRegistered = giftRepository.getGiftsRegistered()
        giftsRegistered.removeSource(getGiftsRegistered)
        giftsRegistered.addSource(getGiftsRegistered){
            giftsRegistered.value = it
        }
    }
}