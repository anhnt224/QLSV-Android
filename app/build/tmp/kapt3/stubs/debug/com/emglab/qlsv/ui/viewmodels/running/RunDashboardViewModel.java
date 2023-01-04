package com.emglab.qlsv.ui.viewmodels.running;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001!B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\r0\u000bJ\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0014\u0010\u0011\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\rJ\u0016\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aR\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tR\u00020\u00000\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/running/RunDashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "runRepository", "Lcom/emglab/qlsv/repositories/RunRepository;", "runDataDao", "Lcom/emglab/qlsv/dao/RunDataDao;", "(Lcom/emglab/qlsv/repositories/RunRepository;Lcom/emglab/qlsv/dao/RunDataDao;)V", "_parameters", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/ui/viewmodels/running/RunDashboardViewModel$GetRunResultParameters;", "runResultList", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/run/RunResult;", "getRunResultList", "()Landroidx/lifecycle/LiveData;", "saveRunData", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "getSaveRunData", "()Landroidx/lifecycle/MediatorLiveData;", "saveRunDataLiveData", "getRunResults", "Lcom/emglab/qlsv/models/entity/run/RunData;", "getTimeEnd", "Ljava/util/Date;", "getTimeStart", "", "runDataList", "setTime", "timeStart", "timeEnd", "GetRunResultParameters", "app_debug"})
public final class RunDashboardViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.ui.viewmodels.running.RunDashboardViewModel.GetRunResultParameters> _parameters;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> saveRunData = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> saveRunDataLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.run.RunResult>>> runResultList = null;
    private final com.emglab.qlsv.repositories.RunRepository runRepository = null;
    private final com.emglab.qlsv.dao.RunDataDao runDataDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getSaveRunData() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.NotNull()
    java.util.Date timeStart, @org.jetbrains.annotations.NotNull()
    java.util.Date timeEnd) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getTimeStart() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getTimeEnd() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.run.RunData>> getRunResults() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.run.RunResult>>> getRunResultList() {
        return null;
    }
    
    public final void saveRunData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.run.RunData> runDataList) {
    }
    
    @javax.inject.Inject()
    public RunDashboardViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.RunRepository runRepository, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.RunDataDao runDataDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/running/RunDashboardViewModel$GetRunResultParameters;", "", "timeStart", "Ljava/util/Date;", "timeEnd", "(Lcom/emglab/qlsv/ui/viewmodels/running/RunDashboardViewModel;Ljava/util/Date;Ljava/util/Date;)V", "getTimeEnd", "()Ljava/util/Date;", "setTimeEnd", "(Ljava/util/Date;)V", "getTimeStart", "setTimeStart", "app_debug"})
    public final class GetRunResultParameters {
        @org.jetbrains.annotations.NotNull()
        private java.util.Date timeStart;
        @org.jetbrains.annotations.NotNull()
        private java.util.Date timeEnd;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Date getTimeStart() {
            return null;
        }
        
        public final void setTimeStart(@org.jetbrains.annotations.NotNull()
        java.util.Date p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Date getTimeEnd() {
            return null;
        }
        
        public final void setTimeEnd(@org.jetbrains.annotations.NotNull()
        java.util.Date p0) {
        }
        
        public GetRunResultParameters(@org.jetbrains.annotations.NotNull()
        java.util.Date timeStart, @org.jetbrains.annotations.NotNull()
        java.util.Date timeEnd) {
            super();
        }
    }
}