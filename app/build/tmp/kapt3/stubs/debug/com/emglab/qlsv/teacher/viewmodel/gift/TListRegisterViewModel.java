package com.emglab.qlsv.teacher.viewmodel.gift;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011J\u000e\u0010\u0013\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\b\u0012\u00060\tR\u00020\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/emglab/qlsv/teacher/viewmodel/gift/TListRegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "giftRepository", "Lcom/emglab/qlsv/repositories/GiftRepository;", "(Lcom/emglab/qlsv/repositories/GiftRepository;)V", "_approveParameter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/teacher/viewmodel/gift/TListRegisterViewModel$ApproveParameter;", "_parameter", "Lcom/emglab/qlsv/teacher/viewmodel/gift/TListRegisterViewModel$GetGiftRegisterParameter;", "approveResp", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "getApproveResp", "()Landroidx/lifecycle/LiveData;", "giftRegisters", "", "Lcom/emglab/qlsv/models/entity/gift/GiftRegister;", "getGiftRegisters", "approve", "", "giftId", "", "userApproves", "Lcom/emglab/qlsv/models/entity/gift/UserApprove;", "ApproveParameter", "GetGiftRegisterParameter", "app_debug"})
public final class TListRegisterViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.teacher.viewmodel.gift.TListRegisterViewModel.GetGiftRegisterParameter> _parameter = null;
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.teacher.viewmodel.gift.TListRegisterViewModel.ApproveParameter> _approveParameter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> approveResp = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.gift.GiftRegister>>> giftRegisters = null;
    private final com.emglab.qlsv.repositories.GiftRepository giftRepository = null;
    
    public final void approve(int giftId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.gift.UserApprove> userApproves) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getApproveResp() {
        return null;
    }
    
    public final void getGiftRegisters(int giftId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.gift.GiftRegister>>> getGiftRegisters() {
        return null;
    }
    
    @javax.inject.Inject()
    public TListRegisterViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.GiftRepository giftRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/emglab/qlsv/teacher/viewmodel/gift/TListRegisterViewModel$GetGiftRegisterParameter;", "", "giftId", "", "(Lcom/emglab/qlsv/teacher/viewmodel/gift/TListRegisterViewModel;I)V", "getGiftId", "()I", "app_debug"})
    public final class GetGiftRegisterParameter {
        private final int giftId = 0;
        
        public final int getGiftId() {
            return 0;
        }
        
        public GetGiftRegisterParameter(int giftId) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/emglab/qlsv/teacher/viewmodel/gift/TListRegisterViewModel$ApproveParameter;", "", "giftId", "", "userApproves", "", "Lcom/emglab/qlsv/models/entity/gift/UserApprove;", "(Lcom/emglab/qlsv/teacher/viewmodel/gift/TListRegisterViewModel;ILjava/util/List;)V", "getGiftId", "()I", "getUserApproves", "()Ljava/util/List;", "app_debug"})
    public final class ApproveParameter {
        private final int giftId = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.emglab.qlsv.models.entity.gift.UserApprove> userApproves = null;
        
        public final int getGiftId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.emglab.qlsv.models.entity.gift.UserApprove> getUserApproves() {
            return null;
        }
        
        public ApproveParameter(int giftId, @org.jetbrains.annotations.NotNull()
        java.util.List<com.emglab.qlsv.models.entity.gift.UserApprove> userApproves) {
            super();
        }
    }
}