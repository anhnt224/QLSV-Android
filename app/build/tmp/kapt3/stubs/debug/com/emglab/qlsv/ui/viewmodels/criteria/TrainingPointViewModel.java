package com.emglab.qlsv.ui.viewmodels.criteria;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001c\u001a\u00020\u001dJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\n0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\n0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019\u00a8\u0006\""}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/criteria/TrainingPointViewModel;", "Landroidx/lifecycle/ViewModel;", "criteriaRepository", "Lcom/emglab/qlsv/repositories/criteria/CriteriaRepository;", "(Lcom/emglab/qlsv/repositories/criteria/CriteriaRepository;)V", "_semester", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/models/entity/Semester;", "criteriaReports", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/CriteriaReport;", "getCriteriaReports", "()Landroidx/lifecycle/LiveData;", "setCriteriaReports", "(Landroidx/lifecycle/LiveData;)V", "getCriteriaRepository", "()Lcom/emglab/qlsv/repositories/criteria/CriteriaRepository;", "liveDataGetListSemester", "liveDataGetUserDetail", "Lcom/emglab/qlsv/models/entity/UserDetail;", "semesters", "Landroidx/lifecycle/MediatorLiveData;", "getSemesters", "()Landroidx/lifecycle/MediatorLiveData;", "userDetail", "getUserDetail", "getListSemester", "", "getSemester", "getTrainingPoint", "setSemester", "semester", "app_debug"})
public final class TrainingPointViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.UserDetail>> userDetail = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Semester>>> semesters = null;
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.entity.Semester> _semester = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.UserDetail>> liveDataGetUserDetail;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Semester>>> liveDataGetListSemester;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.CriteriaReport>>> criteriaReports;
    @org.jetbrains.annotations.NotNull()
    private final com.emglab.qlsv.repositories.criteria.CriteriaRepository criteriaRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.UserDetail>> getUserDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Semester>>> getSemesters() {
        return null;
    }
    
    public final void getTrainingPoint() {
    }
    
    public final void getListSemester() {
    }
    
    public final void setSemester(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Semester semester) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.models.entity.Semester> getSemester() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.CriteriaReport>>> getCriteriaReports() {
        return null;
    }
    
    public final void setCriteriaReports(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.CriteriaReport>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.repositories.criteria.CriteriaRepository getCriteriaRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public TrainingPointViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.criteria.CriteriaRepository criteriaRepository) {
        super();
    }
}