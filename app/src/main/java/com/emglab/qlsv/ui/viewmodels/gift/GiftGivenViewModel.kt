package com.emglab.qlsv.ui.viewmodels.gift

import androidx.lifecycle.*
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.GiftRepository
import javax.inject.Inject

class GiftGivenViewModel @Inject constructor(
    private val giftRepository: GiftRepository
) : ViewModel() {
    val gifts = MediatorLiveData<Resource<List<Gift>>>()
    private lateinit var getGiftsByCreateIdResp: LiveData<Resource<List<Gift>>>

    private val _parameter = MutableLiveData<DeleteGiftParameter>()

    init {
        getGiftsByCreateId()
    }

    fun deleteGift(giftId: Int){
        _parameter.value = DeleteGiftParameter(giftId)
    }

    val deleteGiftResp: LiveData<Resource<MyCTSVCap>> = _parameter.switchMap {
        giftRepository.deleteGift(it.giftId)
    }

    fun getGiftsByCreateId(){
        getGiftsByCreateIdResp = giftRepository.getGiftsByCreateID()
        gifts.removeSource(getGiftsByCreateIdResp)
        gifts.addSource(getGiftsByCreateIdResp){
            gifts.value = it
        }
    }

    inner class DeleteGiftParameter(val giftId: Int)
}