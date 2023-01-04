package com.emglab.qlsv.ui.viewmodels.job;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/job/ApplyJobViewModel;", "Landroidx/lifecycle/ViewModel;", "jobRepository", "Lcom/emglab/qlsv/repositories/JobRepository;", "(Lcom/emglab/qlsv/repositories/JobRepository;)V", "applyJob", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "getApplyJob", "()Landroidx/lifecycle/MediatorLiveData;", "liveDataApplyJob", "Landroidx/lifecycle/LiveData;", "", "id", "", "phoneNumber", "", "introduction", "app_debug"})
public final class ApplyJobViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> liveDataApplyJob;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> applyJob = null;
    private final com.emglab.qlsv.repositories.JobRepository jobRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getApplyJob() {
        return null;
    }
    
    public final void applyJob(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String introduction) {
    }
    
    @javax.inject.Inject()
    public ApplyJobViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.JobRepository jobRepository) {
        super();
    }
}