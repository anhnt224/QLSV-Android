package com.emglab.qlsv.teacher.viewmodel.gift

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.repositories.GiftRepository
import javax.inject.Inject

class TCreateGiftViewModel @Inject constructor(
    private val giftRepository: GiftRepository
) : ViewModel() {
    private val _gift = MutableLiveData<Gift>()

    fun createGift(gift: Gift){
        _gift.value = gift
    }
    val createGiftResp: LiveData<Resource<Int>> = _gift.switchMap {
        giftRepository.createGift(it)
    }
}