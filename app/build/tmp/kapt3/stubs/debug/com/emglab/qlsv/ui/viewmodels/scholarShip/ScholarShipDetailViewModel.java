package com.emglab.qlsv.ui.viewmodels.scholarShip;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/scholarShip/ScholarShipDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "scholarShipRepository", "Lcom/emglab/qlsv/repositories/ScholarShipRepository;", "(Lcom/emglab/qlsv/repositories/ScholarShipRepository;)V", "applyScholarShip", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "getApplyScholarShip", "()Landroidx/lifecycle/MediatorLiveData;", "liveDataApplyScholarShip", "Landroidx/lifecycle/LiveData;", "", "scholarShipID", "", "app_debug"})
public final class ScholarShipDetailViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> liveDataApplyScholarShip;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> applyScholarShip = null;
    private final com.emglab.qlsv.repositories.ScholarShipRepository scholarShipRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getApplyScholarShip() {
        return null;
    }
    
    public final void applyScholarShip(int scholarShipID) {
    }
    
    @javax.inject.Inject()
    public ScholarShipDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.ScholarShipRepository scholarShipRepository) {
        super();
    }
}