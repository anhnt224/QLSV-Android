package com.emglab.qlsv.teacher.viewmodel.job;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/emglab/qlsv/teacher/viewmodel/job/TMoreJobViewModel;", "Landroidx/lifecycle/ViewModel;", "jobRepository", "Lcom/emglab/qlsv/repositories/JobRepository;", "(Lcom/emglab/qlsv/repositories/JobRepository;)V", "jobLivedata", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/Job;", "jobMediatorLiveData", "Landroidx/lifecycle/MediatorLiveData;", "getJobMediatorLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "getMoreJob", "", "app_debug"})
public final class TMoreJobViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Job>>> jobMediatorLiveData = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Job>>> jobLivedata;
    private final com.emglab.qlsv.repositories.JobRepository jobRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Job>>> getJobMediatorLiveData() {
        return null;
    }
    
    public final void getMoreJob() {
    }
    
    @javax.inject.Inject()
    public TMoreJobViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.JobRepository jobRepository) {
        super();
    }
}