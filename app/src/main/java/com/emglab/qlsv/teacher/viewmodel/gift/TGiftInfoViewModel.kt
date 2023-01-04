package com.emglab.qlsv.teacher.viewmodel.gift

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.GiftRepository
import javax.inject.Inject

class TGiftInfoViewModel @Inject constructor(
    private val giftRepository: GiftRepository
) : ViewModel() {
    val cancelApplyGift = MediatorLiveData<Resource<MyCTSVCap>>()
    private lateinit var cancelApplyGiftResp: LiveData<Resource<MyCTSVCap>>

    fun cancelApplyGift(giftId: Int){
        cancelApplyGiftResp = giftRepository.cancelApplyGift(giftId)
        cancelApplyGift.removeSource(cancelApplyGiftResp)
        cancelApplyGift.addSource(cancelApplyGiftResp){
            cancelApplyGift.value = it
        }
    }
}