package com.emglab.qlsv.ui.viewmodels.timetable;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0015R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/timetable/TimeTableViewModel;", "Landroidx/lifecycle/ViewModel;", "timeTableRepository", "Lcom/emglab/qlsv/repositories/TimeTableRepository;", "timetableDAO", "Lcom/emglab/qlsv/dao/TimetableDAO;", "(Lcom/emglab/qlsv/repositories/TimeTableRepository;Lcom/emglab/qlsv/dao/TimetableDAO;)V", "getTimeTable", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/Subject;", "getGetTimeTable", "()Landroidx/lifecycle/MediatorLiveData;", "getTimetableOffline", "Landroidx/lifecycle/LiveData;", "getGetTimetableOffline", "()Landroidx/lifecycle/LiveData;", "setGetTimetableOffline", "(Landroidx/lifecycle/LiveData;)V", "liveDataGetTimeTable", "", "app_debug"})
public final class TimeTableViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Subject>>> getTimeTable = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Subject>>> liveDataGetTimeTable;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.Subject>> getTimetableOffline;
    private final com.emglab.qlsv.repositories.TimeTableRepository timeTableRepository = null;
    private final com.emglab.qlsv.dao.TimetableDAO timetableDAO = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Subject>>> getGetTimeTable() {
        return null;
    }
    
    public final void getTimeTable() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.Subject>> getGetTimetableOffline() {
        return null;
    }
    
    public final void setGetTimetableOffline(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.Subject>> p0) {
    }
    
    @javax.inject.Inject()
    public TimeTableViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.TimeTableRepository timeTableRepository, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.dao.TimetableDAO timetableDAO) {
        super();
    }
}