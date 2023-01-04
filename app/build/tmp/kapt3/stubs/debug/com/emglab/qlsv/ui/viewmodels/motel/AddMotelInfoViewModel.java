package com.emglab.qlsv.ui.viewmodels.motel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/motel/AddMotelInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/emglab/qlsv/repositories/user/UserRepository;", "(Lcom/emglab/qlsv/repositories/user/UserRepository;)V", "liveDaraUpdateUserAddress", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/UpdateStudentContactResp;", "updateUserAddress", "Landroidx/lifecycle/MediatorLiveData;", "getUpdateUserAddress", "()Landroidx/lifecycle/MediatorLiveData;", "", "userAddress", "Lcom/emglab/qlsv/models/entity/UserAddress;", "motelInfo", "Lcom/emglab/qlsv/models/entity/Motel;", "app_debug"})
public final class AddMotelInfoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.UpdateStudentContactResp>> updateUserAddress = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.UpdateStudentContactResp>> liveDaraUpdateUserAddress;
    private final com.emglab.qlsv.repositories.user.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.UpdateStudentContactResp>> getUpdateUserAddress() {
        return null;
    }
    
    public final void updateUserAddress(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserAddress userAddress, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Motel motelInfo) {
    }
    
    @javax.inject.Inject()
    public AddMotelInfoViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.user.UserRepository userRepository) {
        super();
    }
}