package com.emglab.qlsv.ui.viewmodels.job;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/job/ListJobApplyViewModel;", "Landroidx/lifecycle/ViewModel;", "jobRepository", "Lcom/emglab/qlsv/repositories/JobRepository;", "(Lcom/emglab/qlsv/repositories/JobRepository;)V", "getJobRepository", "()Lcom/emglab/qlsv/repositories/JobRepository;", "listJobsApply", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/Job;", "getListJobsApply", "()Landroidx/lifecycle/MediatorLiveData;", "liveDataGetListJobsApply", "Landroidx/lifecycle/LiveData;", "getListJobApply", "", "app_debug"})
public final class ListJobApplyViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Job>>> liveDataGetListJobsApply;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Job>>> listJobsApply = null;
    @org.jetbrains.annotations.NotNull()
    private final com.emglab.qlsv.repositories.JobRepository jobRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Job>>> getListJobsApply() {
        return null;
    }
    
    public final void getListJobApply() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.repositories.JobRepository getJobRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public ListJobApplyViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.JobRepository jobRepository) {
        super();
    }
}