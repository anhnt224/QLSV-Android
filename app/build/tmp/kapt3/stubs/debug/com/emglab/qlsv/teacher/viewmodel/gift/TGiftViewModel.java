package com.emglab.qlsv.teacher.viewmodel.gift;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/emglab/qlsv/teacher/viewmodel/gift/TGiftViewModel;", "Landroidx/lifecycle/ViewModel;", "giftRepository", "Lcom/emglab/qlsv/repositories/GiftRepository;", "(Lcom/emglab/qlsv/repositories/GiftRepository;)V", "getAllGiftsResp", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/gift/Gift;", "gifts", "Landroidx/lifecycle/MediatorLiveData;", "getGifts", "()Landroidx/lifecycle/MediatorLiveData;", "getGiftsByCreateId", "", "app_debug"})
public final class TGiftViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.gift.Gift>>> gifts = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.gift.Gift>>> getAllGiftsResp;
    private final com.emglab.qlsv.repositories.GiftRepository giftRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.gift.Gift>>> getGifts() {
        return null;
    }
    
    public final void getGiftsByCreateId() {
    }
    
    @javax.inject.Inject()
    public TGiftViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.GiftRepository giftRepository) {
        super();
    }
}