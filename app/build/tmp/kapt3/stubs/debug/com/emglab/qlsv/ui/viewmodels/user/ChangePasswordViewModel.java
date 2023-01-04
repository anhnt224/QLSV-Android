package com.emglab.qlsv.ui.viewmodels.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/user/ChangePasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/emglab/qlsv/repositories/user/UserRepository;", "(Lcom/emglab/qlsv/repositories/user/UserRepository;)V", "_changePasswordResource", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/MyCTSVCap;", "changePasswordResource", "Landroidx/lifecycle/MediatorLiveData;", "getChangePasswordResource", "()Landroidx/lifecycle/MediatorLiveData;", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "changePassword", "", "password", "", "newPassword", "app_debug"})
public final class ChangePasswordViewModel extends androidx.lifecycle.ViewModel {
    private boolean isSuccess;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> changePasswordResource = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> _changePasswordResource;
    private final com.emglab.qlsv.repositories.user.UserRepository userRepository = null;
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.MyCTSVCap>> getChangePasswordResource() {
        return null;
    }
    
    public final void changePassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String newPassword) {
    }
    
    @javax.inject.Inject()
    public ChangePasswordViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.user.UserRepository userRepository) {
        super();
    }
}