package com.emglab.qlsv.teacher.viewmodel.student;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J$\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bR#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/emglab/qlsv/teacher/viewmodel/student/TeacherMarkViewModel;", "Landroidx/lifecycle/ViewModel;", "teacherRepository", "Lcom/emglab/qlsv/repositories/TeacherRepository;", "(Lcom/emglab/qlsv/repositories/TeacherRepository;)V", "criteriaTypes", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/CriteriaType;", "getCriteriaTypes", "()Landroidx/lifecycle/MediatorLiveData;", "liveDataGetListCriteriaTypes", "Landroidx/lifecycle/LiveData;", "liveDataMarkCriteriaUser", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "markCriteriaUser", "getMarkCriteriaUser", "getListCriteriaTypes", "", "semester", "", "studentID", "app_debug"})
public final class TeacherMarkViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.CriteriaType>>> criteriaTypes = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.CriteriaType>>> liveDataGetListCriteriaTypes;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> markCriteriaUser = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> liveDataMarkCriteriaUser;
    private final com.emglab.qlsv.repositories.TeacherRepository teacherRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.CriteriaType>>> getCriteriaTypes() {
        return null;
    }
    
    public final void getListCriteriaTypes(@org.jetbrains.annotations.NotNull()
    java.lang.String semester, @org.jetbrains.annotations.NotNull()
    java.lang.String studentID) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getMarkCriteriaUser() {
        return null;
    }
    
    public final void markCriteriaUser(@org.jetbrains.annotations.NotNull()
    java.lang.String semester, @org.jetbrains.annotations.NotNull()
    java.lang.String studentID, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.CriteriaType> criteriaTypes) {
    }
    
    @javax.inject.Inject()
    public TeacherMarkViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.TeacherRepository teacherRepository) {
        super();
    }
}