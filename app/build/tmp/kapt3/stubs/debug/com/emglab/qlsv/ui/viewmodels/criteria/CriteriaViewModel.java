package com.emglab.qlsv.ui.viewmodels.criteria;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\u001c\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rJ\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\""}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/criteria/CriteriaViewModel;", "Landroidx/lifecycle/ViewModel;", "criteriaRepository", "Lcom/emglab/qlsv/repositories/criteria/CriteriaRepository;", "(Lcom/emglab/qlsv/repositories/criteria/CriteriaRepository;)V", "_semester", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/models/entity/Semester;", "_userCriteriaDetail", "Lcom/emglab/qlsv/models/entity/UserCriteriaDetail;", "activities", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/UserCriteriaActivity;", "getActivities", "()Landroidx/lifecycle/LiveData;", "criteriaTypes", "Lcom/emglab/qlsv/models/entity/CriteriaType;", "getCriteriaTypes", "liveDataMarkCriteriaUser", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "markCriteriaUser", "Landroidx/lifecycle/MediatorLiveData;", "getMarkCriteriaUser", "()Landroidx/lifecycle/MediatorLiveData;", "getSemester", "getUserCriteriaDetail", "", "semester", "", "setSemester", "setUserCriteriaDetail", "value", "app_debug"})
public final class CriteriaViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.entity.Semester> _semester = null;
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.entity.UserCriteriaDetail> _userCriteriaDetail = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.CriteriaType>>> criteriaTypes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.UserCriteriaActivity>>> activities = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> markCriteriaUser = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> liveDataMarkCriteriaUser;
    private final com.emglab.qlsv.repositories.criteria.CriteriaRepository criteriaRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.models.entity.Semester> getSemester() {
        return null;
    }
    
    public final void setSemester(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Semester semester) {
    }
    
    public final void setUserCriteriaDetail(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserCriteriaDetail value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.models.entity.UserCriteriaDetail> getUserCriteriaDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.CriteriaType>>> getCriteriaTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.UserCriteriaActivity>>> getActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getMarkCriteriaUser() {
        return null;
    }
    
    public final void markCriteriaUser(@org.jetbrains.annotations.NotNull()
    java.lang.String semester, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.CriteriaType> criteriaTypes) {
    }
    
    @javax.inject.Inject()
    public CriteriaViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.criteria.CriteriaRepository criteriaRepository) {
        super();
    }
}