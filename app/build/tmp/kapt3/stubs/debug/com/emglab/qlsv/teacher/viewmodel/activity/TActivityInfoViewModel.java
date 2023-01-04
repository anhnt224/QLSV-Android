package com.emglab.qlsv.teacher.viewmodel.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001.B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J6\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020$J\u0006\u0010+\u001a\u00020\"J\u000e\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020&R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006/"}, d2 = {"Lcom/emglab/qlsv/teacher/viewmodel/activity/TActivityInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "activityRepository", "Lcom/emglab/qlsv/repositories/activity/ActivityRepository;", "criteriaRepository", "Lcom/emglab/qlsv/repositories/criteria/CriteriaRepository;", "(Lcom/emglab/qlsv/repositories/activity/ActivityRepository;Lcom/emglab/qlsv/repositories/criteria/CriteriaRepository;)V", "_activityByAId", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/teacher/viewmodel/activity/TActivityInfoViewModel$ActivityAId;", "_assignUserActivityResource", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "activity", "Lcom/emglab/qlsv/models/entity/Activity;", "getActivity", "()Landroidx/lifecycle/LiveData;", "activityByAId", "getActivityByAId", "assignUserActivityResource", "Landroidx/lifecycle/MediatorLiveData;", "getAssignUserActivityResource", "()Landroidx/lifecycle/MediatorLiveData;", "criterias", "", "Lcom/emglab/qlsv/models/entity/Criteria;", "getCriterias", "isAssignUserActivity", "", "()Z", "setAssignUserActivity", "(Z)V", "assignUserActivity", "", "reason", "", "AId", "", "UserRole", "CheckInPlace", "UAStatus", "Signature", "retry", "setId", "aId", "ActivityAId", "app_debug"})
public final class TActivityInfoViewModel extends androidx.lifecycle.ViewModel {
    private boolean isAssignUserActivity;
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.teacher.viewmodel.activity.TActivityInfoViewModel.ActivityAId> _activityByAId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.Activity>> activity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.Criteria>> criterias = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> assignUserActivityResource = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> _assignUserActivityResource;
    private final com.emglab.qlsv.repositories.activity.ActivityRepository activityRepository = null;
    private final com.emglab.qlsv.repositories.criteria.CriteriaRepository criteriaRepository = null;
    
    public final boolean isAssignUserActivity() {
        return false;
    }
    
    public final void setAssignUserActivity(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.teacher.viewmodel.activity.TActivityInfoViewModel.ActivityAId> getActivityByAId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.entity.Activity>> getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.emglab.qlsv.models.entity.Criteria>> getCriterias() {
        return null;
    }
    
    public final void setId(int aId) {
    }
    
    public final void retry() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getAssignUserActivityResource() {
        return null;
    }
    
    public final void assignUserActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String reason, int AId, int UserRole, @org.jetbrains.annotations.NotNull()
    java.lang.String CheckInPlace, int UAStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature) {
    }
    
    @javax.inject.Inject()
    public TActivityInfoViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.activity.ActivityRepository activityRepository, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.criteria.CriteriaRepository criteriaRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00d6\u0001J,\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\u0004\b\u0000\u0010\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u000e0\u0011J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/emglab/qlsv/teacher/viewmodel/activity/TActivityInfoViewModel$ActivityAId;", "", "aId", "", "(I)V", "getAId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "ifExists", "Landroidx/lifecycle/LiveData;", "T", "f", "Lkotlin/Function1;", "toString", "", "app_debug"})
    public static final class ActivityAId {
        private final int aId = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> ifExists(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends androidx.lifecycle.LiveData<T>> f) {
            return null;
        }
        
        public final int getAId() {
            return 0;
        }
        
        public ActivityAId(int aId) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.emglab.qlsv.teacher.viewmodel.activity.TActivityInfoViewModel.ActivityAId copy(int aId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}