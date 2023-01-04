package com.emglab.qlsv.teacher.viewmodel.gift

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.gift.GiftRegister
import com.emglab.qlsv.models.entity.gift.UserApprove
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.GiftRepository
import javax.inject.Inject

class TListRegisterViewModel @Inject constructor(
    private val giftRepository: GiftRepository
): ViewModel() {

    private val _parameter = MutableLiveData<GetGiftRegisterParameter>()
    private val _approveParameter =  MutableLiveData<ApproveParameter>()

    fun approve(giftId: Int, userApproves: List<UserApprove>){
        _approveParameter.value = ApproveParameter(giftId, userApproves)
    }

    val approveResp: LiveData<Resource<MyCTSVCap>> = _approveParameter.switchMap {
        giftRepository.approveRegisterGift(
            giftId = it.giftId,
            userApproves = it.userApproves
        )
    }

    fun getGiftRegisters(giftId: Int){
        if (_parameter.value != GetGiftRegisterParameter(giftId)){
            _parameter.value = GetGiftRegisterParameter(giftId)
        }
    }

    val giftRegisters: LiveData<Resource<List<GiftRegister>>> = _parameter.switchMap {
        giftRepository.getGiftRegisters(it.giftId)
    }

    inner class GetGiftRegisterParameter(val giftId: Int)
    inner class ApproveParameter(val giftId: Int,val userApproves: List<UserApprove>)
}