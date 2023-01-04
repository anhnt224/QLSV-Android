package com.emglab.qlsv.ui.viewmodels.scholarShip;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/scholarShip/ListScholarShipsViewModel;", "Landroidx/lifecycle/ViewModel;", "scholarShipRepository", "Lcom/emglab/qlsv/repositories/ScholarShipRepository;", "(Lcom/emglab/qlsv/repositories/ScholarShipRepository;)V", "listScholarShips", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/ScholarShip;", "getListScholarShips", "()Landroidx/lifecycle/MediatorLiveData;", "liveDataGetListScholarShip", "Landroidx/lifecycle/LiveData;", "getScholarShipRepository", "()Lcom/emglab/qlsv/repositories/ScholarShipRepository;", "", "page", "", "row", "app_debug"})
public final class ListScholarShipsViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.ScholarShip>>> liveDataGetListScholarShip;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.ScholarShip>>> listScholarShips = null;
    @org.jetbrains.annotations.NotNull()
    private final com.emglab.qlsv.repositories.ScholarShipRepository scholarShipRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.ScholarShip>>> getListScholarShips() {
        return null;
    }
    
    public final void getListScholarShips(int page, int row) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.repositories.ScholarShipRepository getScholarShipRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public ListScholarShipsViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.ScholarShipRepository scholarShipRepository) {
        super();
    }
}