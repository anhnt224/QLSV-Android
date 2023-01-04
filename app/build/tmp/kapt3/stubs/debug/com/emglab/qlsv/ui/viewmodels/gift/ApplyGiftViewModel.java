package com.emglab.qlsv.ui.viewmodels.gift;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/gift/ApplyGiftViewModel;", "Landroidx/lifecycle/ViewModel;", "giftRepository", "Lcom/emglab/qlsv/repositories/GiftRepository;", "(Lcom/emglab/qlsv/repositories/GiftRepository;)V", "_giftRegisterInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/models/entity/gift/GiftRegister;", "applyGiftResp", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "getApplyGiftResp", "()Landroidx/lifecycle/LiveData;", "applyGift", "", "giftRegister", "app_debug"})
public final class ApplyGiftViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.entity.gift.GiftRegister> _giftRegisterInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> applyGiftResp = null;
    private final com.emglab.qlsv.repositories.GiftRepository giftRepository = null;
    
    public final void applyGift(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.gift.GiftRegister giftRegister) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getApplyGiftResp() {
        return null;
    }
    
    @javax.inject.Inject()
    public ApplyGiftViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.GiftRepository giftRepository) {
        super();
    }
}