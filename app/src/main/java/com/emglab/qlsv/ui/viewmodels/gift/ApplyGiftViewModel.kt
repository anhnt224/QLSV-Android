package com.emglab.qlsv.ui.viewmodels.gift

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.gift.GiftRegister
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.GiftRepository
import javax.inject.Inject

class ApplyGiftViewModel @Inject constructor(
    private val giftRepository: GiftRepository
) : ViewModel() {
    private val _giftRegisterInfo = MutableLiveData<GiftRegister>()

    fun applyGift(giftRegister: GiftRegister) {
        _giftRegisterInfo.value = giftRegister
    }

    val applyGiftResp: LiveData<Resource<MyCTSVCap>> = _giftRegisterInfo.switchMap {
        giftRepository.applyGift(it)
    }
}