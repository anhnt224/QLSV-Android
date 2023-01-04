package com.emglab.qlsv.ui.viewmodels.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000eJ\u0016\u0010 \u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eJ\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R#\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\n0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/user/AddNewAddressViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/emglab/qlsv/repositories/user/UserRepository;", "(Lcom/emglab/qlsv/repositories/user/UserRepository;)V", "address", "Landroidx/lifecycle/MutableLiveData;", "Lcom/emglab/qlsv/models/entity/UserAddress;", "liveDaraUpdateUserAddress", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/common/Resource;", "Lcom/emglab/qlsv/models/res/UpdateStudentContactResp;", "liveDataGetListCities", "", "", "liveDataGetListDistricts", "liveDataGetListWards", "mediatorLiveGetListCities", "Landroidx/lifecycle/MediatorLiveData;", "getMediatorLiveGetListCities", "()Landroidx/lifecycle/MediatorLiveData;", "mediatorLiveGetListDistricts", "getMediatorLiveGetListDistricts", "mediatorLiveGetListWards", "getMediatorLiveGetListWards", "updateUserAddress", "getUpdateUserAddress", "getAddress", "getListCities", "", "getListDistricts", "city", "getListWards", "district", "setAddress", "userAddress", "app_debug"})
public final class AddNewAddressViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<com.emglab.qlsv.models.entity.UserAddress> address;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> mediatorLiveGetListCities = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> mediatorLiveGetListDistricts = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> mediatorLiveGetListWards = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.UpdateStudentContactResp>> updateUserAddress = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> liveDataGetListCities;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> liveDataGetListDistricts;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> liveDataGetListWards;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.UpdateStudentContactResp>> liveDaraUpdateUserAddress;
    private final com.emglab.qlsv.repositories.user.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> getMediatorLiveGetListCities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> getMediatorLiveGetListDistricts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<java.lang.String>>> getMediatorLiveGetListWards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<com.emglab.qlsv.models.res.UpdateStudentContactResp>> getUpdateUserAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserAddress address) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.emglab.qlsv.models.entity.UserAddress> getAddress() {
        return null;
    }
    
    private final void getListCities() {
    }
    
    public final void getListDistricts(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
    }
    
    public final void getListWards(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String district) {
    }
    
    public final void updateUserAddress(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserAddress userAddress) {
    }
    
    @javax.inject.Inject()
    public AddNewAddressViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.user.UserRepository userRepository) {
        super();
    }
}