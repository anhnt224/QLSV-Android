package com.emglab.qlsv.modules.searchMotel.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/emglab/qlsv/modules/searchMotel/viewModels/MotelRegistrationInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "motelRegistrationRepository", "Lcom/emglab/qlsv/modules/searchMotel/MotelRegistrationRepository;", "(Lcom/emglab/qlsv/modules/searchMotel/MotelRegistrationRepository;)V", "deleteResp", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "getDeleteResp", "()Landroidx/lifecycle/LiveData;", "docId", "Landroidx/lifecycle/MutableLiveData;", "", "deleteMotelRegistration", "", "id", "app_debug"})
public final class MotelRegistrationInfoViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> docId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> deleteResp = null;
    private final com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository motelRegistrationRepository = null;
    
    public final void deleteMotelRegistration(int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getDeleteResp() {
        return null;
    }
    
    @javax.inject.Inject()
    public MotelRegistrationInfoViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository motelRegistrationRepository) {
        super();
    }
}