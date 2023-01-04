package com.emglab.qlsv.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.NetworkBoundResource
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.models.entity.gift.GiftRegister
import com.emglab.qlsv.models.entity.gift.UserApprove
import com.emglab.qlsv.models.req.ApplyGiftReq
import com.emglab.qlsv.models.req.ApproveUserGiftReq
import com.emglab.qlsv.models.req.CreateGiftReq
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.models.res.gift.CreateGiftResp
import com.emglab.qlsv.models.res.gift.GetGiftListByCreateID
import com.emglab.qlsv.models.res.gift.GetGiftRegistersResp
import com.emglab.qlsv.models.res.gift.GetListGiftsResp
import com.emglab.qlsv.webservices.ApiResponse
import com.emglab.qlsv.webservices.WebService
import javax.inject.Inject

class GiftRepository @Inject constructor(
    private val webService: WebService,
    private val appExecutors: AppExecutors,
    private val sharedPrefsHelper: SharedPrefsHelper
) {
    private var getGiftListByCreateID = MutableLiveData<List<Gift>>()
    private var getGiftRegisters = MutableLiveData<List<GiftRegister>>()
    private var createGiftResp = MutableLiveData<Int>()
    private var approveRegisterGift = MutableLiveData<MyCTSVCap>()
    private var getAllGifts = MutableLiveData<List<Gift>>()
    private var getGiftsRegistered = MutableLiveData<List<Gift>>()
    private var applyGiftResp = MutableLiveData<MyCTSVCap>()
    private var deleteGiftResp = MutableLiveData<MyCTSVCap>()
    private var cancelApplyGiftResp = MutableLiveData<MyCTSVCap>()

    init {
        getGiftListByCreateID.value = listOf()
        getGiftRegisters.value = listOf()
        createGiftResp.value = 0
        approveRegisterGift.value = MyCTSVCap()
        getAllGifts.value = listOf()
        getGiftsRegistered.value = listOf()
        applyGiftResp.value = MyCTSVCap()
        deleteGiftResp.value = MyCTSVCap()
        cancelApplyGiftResp.value = MyCTSVCap()
    }

    fun getGiftsByCreateID(shouldFetch: Boolean = true): LiveData<Resource<List<Gift>>> {
        getGiftListByCreateID.value = listOf()
        return object : NetworkBoundResource<List<Gift>, GetGiftListByCreateID>(appExecutors){
            override fun saveCallResult(item: GetGiftListByCreateID) {
                Thread {
                    getGiftListByCreateID.postValue(item.gifts)
                }.start()
            }

            override fun shouldFetch(data: List<Gift>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Gift>> {
                return getGiftListByCreateID
            }

            override fun createCall(): LiveData<ApiResponse<GetGiftListByCreateID>> {
                return webService.getGiftsByCreateId(
                    userName = sharedPrefsHelper.getUserName(),
                    tokenCode = sharedPrefsHelper.getToken()
                )
            }

        }.asLiveData()
    }

    fun getGiftRegisters(
        giftId: Int, shouldFetch: Boolean = true
    ): LiveData<Resource<List<GiftRegister>>>{
        return object : NetworkBoundResource<List<GiftRegister>, GetGiftRegistersResp>(appExecutors){
            override fun saveCallResult(item: GetGiftRegistersResp) {
                Thread {
                    getGiftRegisters.postValue(item.giftRegisters)
                }.start()
            }

            override fun shouldFetch(data: List<GiftRegister>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<GiftRegister>> {
                return getGiftRegisters
            }

            override fun createCall(): LiveData<ApiResponse<GetGiftRegistersResp>> {
                return webService.getListRegisters(
                    userName = sharedPrefsHelper.getUserName(),
                    tokenCode = sharedPrefsHelper.getToken(),
                    giftId = giftId
                )
            }

        }.asLiveData()
    }

    fun createGift(
        gift: Gift, shouldFetch: Boolean = true
    ): LiveData<Resource<Int>>{
        return object : NetworkBoundResource<Int, CreateGiftResp>(appExecutors){
            override fun saveCallResult(item: CreateGiftResp) {
                Thread{
                    createGiftResp.postValue(item.giftId)
                }.start()
            }

            override fun shouldFetch(data: Int?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<Int> {
                return createGiftResp
            }

            override fun createCall(): LiveData<ApiResponse<CreateGiftResp>> {
                return webService.createGift(
                    CreateGiftReq(
                        sharedPrefsHelper.getUserName(),
                        sharedPrefsHelper.getToken(),
                        gift
                    )
                )
            }

        }.asLiveData()
    }

    fun approveRegisterGift(
        giftId: Int,
        userApproves: List<UserApprove>,
        shouldFetch: Boolean = true
    ): LiveData<Resource<MyCTSVCap>>{
        return object: NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors){
            override fun saveCallResult(item: MyCTSVCap) {
                Thread {
                    approveRegisterGift.postValue(item)
                }.start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return approveRegisterGift
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                return webService.approveRegisterGift(
                    ApproveUserGiftReq(
                        userName = sharedPrefsHelper.getUserName(),
                        token = sharedPrefsHelper.getToken(),
                        giftId = giftId,
                        userApproveList = userApproves
                    )
                )
            }

        }.asLiveData()
    }

    fun getAllGifts(shouldFetch: Boolean = true): LiveData<Resource<List<Gift>>> {
        return object : NetworkBoundResource<List<Gift>, GetListGiftsResp>(appExecutors){
            override fun saveCallResult(item: GetListGiftsResp) {
                Thread{
                    getAllGifts.postValue(item.gifts)
                }.start()
            }

            override fun shouldFetch(data: List<Gift>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Gift>> {
                return getAllGifts
            }

            override fun createCall(): LiveData<ApiResponse<GetListGiftsResp>> {
                return webService.getAllGifts(
                    userName = sharedPrefsHelper.getUserName(),
                    tokenCode = sharedPrefsHelper.getToken()
                )
            }

        }.asLiveData()
    }

    fun getGiftsRegistered(shouldFetch: Boolean = true): LiveData<Resource<List<Gift>>> {
        return object : NetworkBoundResource<List<Gift>, GetListGiftsResp>(appExecutors){
            override fun saveCallResult(item: GetListGiftsResp) {
                Thread{
                    getGiftsRegistered.postValue(item.gifts)
                }.start()
            }

            override fun shouldFetch(data: List<Gift>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Gift>> {
                return getGiftsRegistered
            }

            override fun createCall(): LiveData<ApiResponse<GetListGiftsResp>> {
                return webService.getGiftsRegistered(
                    userName = sharedPrefsHelper.getUserName(),
                    tokenCode = sharedPrefsHelper.getToken()
                )
            }

        }.asLiveData()
    }

    fun applyGift(
        giftRegisterInfo: GiftRegister,
        shouldFetch: Boolean = true
    ): LiveData<Resource<MyCTSVCap>> {
        return object : NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors){
            override fun saveCallResult(item: MyCTSVCap) {
                Thread {
                    applyGiftResp.postValue(item)
                }.start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return applyGiftResp
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                val applyGiftReq = ApplyGiftReq(
                    userName = sharedPrefsHelper.getUserName(),
                    token = sharedPrefsHelper.getToken(),
                    giftRegisterInfo = giftRegisterInfo
                )
                return webService.applyGift(applyGiftReq)
            }

        }.asLiveData()
    }

    fun deleteGift(
        giftId: Int, shouldFetch: Boolean = true
    ): LiveData<Resource<MyCTSVCap>>{
        return object : NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors){
            override fun saveCallResult(item: MyCTSVCap) {
                Thread{
                    deleteGiftResp.postValue(item)
                }.start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
               return deleteGiftResp
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                return webService.deleteGift(
                    sharedPrefsHelper.getUserName(),
                    sharedPrefsHelper.getToken(),
                    giftId
                )
            }

        }.asLiveData()
    }

    fun cancelApplyGift(giftId: Int, shouldFetch: Boolean = true): LiveData<Resource<MyCTSVCap>>{
        return object : NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors){
            override fun saveCallResult(item: MyCTSVCap) {
                Thread {
                    cancelApplyGiftResp.postValue(item)
                }.start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return cancelApplyGiftResp
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                return webService.cancelApplyGift(
                    sharedPrefsHelper.getUserName(),
                    sharedPrefsHelper.getToken(),
                    giftId
                )
            }

        }.asLiveData()
    }
}




















