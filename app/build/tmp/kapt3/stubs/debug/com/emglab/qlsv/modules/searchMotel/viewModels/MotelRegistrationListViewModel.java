package com.emglab.qlsv.modules.searchMotel.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000eR#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/emglab/qlsv/modules/searchMotel/viewModels/MotelRegistrationListViewModel;", "Landroidx/lifecycle/ViewModel;", "motelRegistrationRepository", "Lcom/emglab/qlsv/modules/searchMotel/MotelRegistrationRepository;", "(Lcom/emglab/qlsv/modules/searchMotel/MotelRegistrationRepository;)V", "motelRegistrationList", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/modules/searchMotel/model/MotelRegistration;", "getMotelRegistrationList", "()Landroidx/lifecycle/MediatorLiveData;", "motelRegistrationListLiveData", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public final class MotelRegistrationListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.modules.searchMotel.model.MotelRegistration>>> motelRegistrationList = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.modules.searchMotel.model.MotelRegistration>>> motelRegistrationListLiveData;
    private final com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository motelRegistrationRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.modules.searchMotel.model.MotelRegistration>>> getMotelRegistrationList() {
        return null;
    }
    
    public final void getMotelRegistrationList() {
    }
    
    @javax.inject.Inject()
    public MotelRegistrationListViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository motelRegistrationRepository) {
        super();
    }
}