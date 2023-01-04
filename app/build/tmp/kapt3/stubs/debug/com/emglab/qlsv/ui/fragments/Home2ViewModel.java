package com.emglab.qlsv.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\t0\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/Home2ViewModel;", "Landroidx/lifecycle/ViewModel;", "activityRepository", "Lcom/emglab/qlsv/repositories/activity/ActivityRepository;", "criteriaRepository", "Lcom/emglab/qlsv/repositories/criteria/CriteriaRepository;", "(Lcom/emglab/qlsv/repositories/activity/ActivityRepository;Lcom/emglab/qlsv/repositories/criteria/CriteriaRepository;)V", "activities", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/Activity;", "getActivities", "()Landroidx/lifecycle/MediatorLiveData;", "getPublicActivity", "Landroidx/lifecycle/LiveData;", "liveDataGetListSemester", "Lcom/emglab/qlsv/models/entity/Semester;", "semesters", "getSemesters", "getListSemester", "", "getPublicActivities", "app_debug"})
public final class Home2ViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Activity>>> activities = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Activity>>> getPublicActivity;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Semester>>> semesters = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Semester>>> liveDataGetListSemester;
    private final com.emglab.qlsv.repositories.activity.ActivityRepository activityRepository = null;
    private final com.emglab.qlsv.repositories.criteria.CriteriaRepository criteriaRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Activity>>> getActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Semester>>> getSemesters() {
        return null;
    }
    
    public final void getPublicActivities() {
    }
    
    public final void getListSemester() {
    }
    
    @javax.inject.Inject()
    public Home2ViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.activity.ActivityRepository activityRepository, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.criteria.CriteriaRepository criteriaRepository) {
        super();
    }
}