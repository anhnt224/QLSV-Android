package com.emglab.qlsv.teacher.viewmodel.job;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/emglab/qlsv/teacher/viewmodel/job/TListJobsViewModel;", "Landroidx/lifecycle/ViewModel;", "jobRepository", "Lcom/emglab/qlsv/repositories/JobRepository;", "(Lcom/emglab/qlsv/repositories/JobRepository;)V", "_jobType", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/models/entity/JobType;", "jobs", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/Job;", "getJobs", "()Landroidx/lifecycle/LiveData;", "setJobs", "(Landroidx/lifecycle/LiveData;)V", "getJobType", "setJobType", "", "type", "app_debug"})
public final class TListJobsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.entity.JobType> _jobType = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Job>>> jobs;
    private final com.emglab.qlsv.repositories.JobRepository jobRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Job>>> getJobs() {
        return null;
    }
    
    public final void setJobs(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Job>>> p0) {
    }
    
    public final void setJobType(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.JobType type) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.models.entity.JobType> getJobType() {
        return null;
    }
    
    @javax.inject.Inject()
    public TListJobsViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.JobRepository jobRepository) {
        super();
    }
}