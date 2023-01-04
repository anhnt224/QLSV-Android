package com.emglab.qlsv.modules.searchMotel.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007J\u0006\u0010\u0012\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/emglab/qlsv/modules/searchMotel/viewModels/MotelRegistrationCompleteViewModel;", "Landroidx/lifecycle/ViewModel;", "motelRegistrationRepository", "Lcom/emglab/qlsv/modules/searchMotel/MotelRegistrationRepository;", "(Lcom/emglab/qlsv/modules/searchMotel/MotelRegistrationRepository;)V", "_registerID", "Landroidx/lifecycle/MutableLiveData;", "", "motelList", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/Motel;", "getMotelList", "()Landroidx/lifecycle/LiveData;", "getListMotel", "", "registerID", "retry", "app_debug"})
public final class MotelRegistrationCompleteViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _registerID = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Motel>>> motelList = null;
    private final com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository motelRegistrationRepository = null;
    
    public final void getListMotel(int registerID) {
    }
    
    public final void retry() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Motel>>> getMotelList() {
        return null;
    }
    
    @javax.inject.Inject()
    public MotelRegistrationCompleteViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository motelRegistrationRepository) {
        super();
    }
}