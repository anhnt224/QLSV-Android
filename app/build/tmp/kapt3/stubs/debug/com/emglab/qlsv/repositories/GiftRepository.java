package com.emglab.qlsv.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ2\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a0\u00192\u0006\u0010\u001e\u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ$\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a0\u00192\u0006\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ$\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001a0\u00192\u0006\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ$\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a0\u00192\u0006\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ*\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00120\u001a0\u00192\u0006\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\"\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\"\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00120\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/emglab/qlsv/repositories/GiftRepository;", "", "webService", "Lcom/emglab/qlsv/webservices/WebService;", "appExecutors", "Lcom/emglab/qlsv/common/AppExecutors;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "(Lcom/emglab/qlsv/webservices/WebService;Lcom/emglab/qlsv/common/AppExecutors;Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "applyGiftResp", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "approveRegisterGift", "cancelApplyGiftResp", "createGiftResp", "", "deleteGiftResp", "getAllGifts", "", "Lcom/emglab/qlsv/models/entity/gift/Gift;", "getGiftListByCreateID", "getGiftRegisters", "Lcom/emglab/qlsv/models/entity/gift/GiftRegister;", "getGiftsRegistered", "applyGift", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "giftRegisterInfo", "shouldFetch", "", "giftId", "userApproves", "Lcom/emglab/qlsv/models/entity/gift/UserApprove;", "cancelApplyGift", "createGift", "gift", "deleteGift", "getGiftsByCreateID", "app_debug"})
public final class GiftRepository {
    private androidx.lifecycle.MutableLiveData<java.util.List<com.emglab.qlsv.models.entity.gift.Gift>> getGiftListByCreateID;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.emglab.qlsv.models.entity.gift.GiftRegister>> getGiftRegisters;
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> createGiftResp;
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.res.MyCTSVCap> approveRegisterGift;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.emglab.qlsv.models.entity.gift.Gift>> getAllGifts;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.emglab.qlsv.models.entity.gift.Gift>> getGiftsRegistered;
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.res.MyCTSVCap> applyGiftResp;
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.res.MyCTSVCap> deleteGiftResp;
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.res.MyCTSVCap> cancelApplyGiftResp;
    private final com.emglab.qlsv.webservices.WebService webService = null;
    private final com.emglab.qlsv.common.AppExecutors appExecutors = null;
    private final com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.gift.Gift>>> getGiftsByCreateID(boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.gift.GiftRegister>>> getGiftRegisters(int giftId, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.lang.Integer>> createGift(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.gift.Gift gift, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> approveRegisterGift(int giftId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.gift.UserApprove> userApproves, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.gift.Gift>>> getAllGifts(boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.gift.Gift>>> getGiftsRegistered(boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> applyGift(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.gift.GiftRegister giftRegisterInfo, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> deleteGift(int giftId, boolean shouldFetch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> cancelApplyGift(int giftId, boolean shouldFetch) {
        return null;
    }
    
    @javax.inject.Inject()
    public GiftRepository(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.webservices.WebService webService, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper) {
        super();
    }
}