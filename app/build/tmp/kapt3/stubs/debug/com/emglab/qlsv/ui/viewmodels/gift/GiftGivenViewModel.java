package com.emglab.qlsv.ui.viewmodels.gift;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0016R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\n0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/gift/GiftGivenViewModel;", "Landroidx/lifecycle/ViewModel;", "giftRepository", "Lcom/emglab/qlsv/repositories/GiftRepository;", "(Lcom/emglab/qlsv/repositories/GiftRepository;)V", "_parameter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/ui/viewmodels/gift/GiftGivenViewModel$DeleteGiftParameter;", "deleteGiftResp", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "getDeleteGiftResp", "()Landroidx/lifecycle/LiveData;", "getGiftsByCreateIdResp", "", "Lcom/emglab/qlsv/models/entity/gift/Gift;", "gifts", "Landroidx/lifecycle/MediatorLiveData;", "getGifts", "()Landroidx/lifecycle/MediatorLiveData;", "deleteGift", "", "giftId", "", "getGiftsByCreateId", "DeleteGiftParameter", "app_debug"})
public final class GiftGivenViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.gift.Gift>>> gifts = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.gift.Gift>>> getGiftsByCreateIdResp;
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.ui.viewmodels.gift.GiftGivenViewModel.DeleteGiftParameter> _parameter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> deleteGiftResp = null;
    private final com.emglab.qlsv.repositories.GiftRepository giftRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.gift.Gift>>> getGifts() {
        return null;
    }
    
    public final void deleteGift(int giftId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getDeleteGiftResp() {
        return null;
    }
    
    public final void getGiftsByCreateId() {
    }
    
    @javax.inject.Inject()
    public GiftGivenViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.GiftRepository giftRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/gift/GiftGivenViewModel$DeleteGiftParameter;", "", "giftId", "", "(Lcom/emglab/qlsv/ui/viewmodels/gift/GiftGivenViewModel;I)V", "getGiftId", "()I", "app_debug"})
    public final class DeleteGiftParameter {
        private final int giftId = 0;
        
        public final int getGiftId() {
            return 0;
        }
        
        public DeleteGiftParameter(int giftId) {
            super();
        }
    }
}