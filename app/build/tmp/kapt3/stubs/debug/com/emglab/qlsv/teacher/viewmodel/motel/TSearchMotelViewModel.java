package com.emglab.qlsv.teacher.viewmodel.motel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019J\r\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\t\u00a8\u0006\u001e"}, d2 = {"Lcom/emglab/qlsv/teacher/viewmodel/motel/TSearchMotelViewModel;", "Landroidx/lifecycle/ViewModel;", "motelRepository", "Lcom/emglab/qlsv/repositories/MotelRepository;", "(Lcom/emglab/qlsv/repositories/MotelRepository;)V", "latLng", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/google/android/gms/maps/model/LatLng;", "getLatLng", "()Landroidx/lifecycle/MediatorLiveData;", "motelList", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/Motel;", "getMotelList", "motelListLiveData", "Landroidx/lifecycle/LiveData;", "radiusLiveData", "", "getRadiusLiveData", "getListMotel", "", "latitude", "longitude", "distance", "", "getRadius", "()Ljava/lang/Double;", "setRadius", "rd", "app_debug"})
public final class TSearchMotelViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Motel>>> motelList = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Motel>>> motelListLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.google.android.gms.maps.model.LatLng> latLng = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Double> radiusLiveData = null;
    private final com.emglab.qlsv.repositories.MotelRepository motelRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Motel>>> getMotelList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.google.android.gms.maps.model.LatLng> getLatLng() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.lang.Double> getRadiusLiveData() {
        return null;
    }
    
    public final void setRadius(double rd) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getRadius() {
        return null;
    }
    
    public final void getListMotel(double latitude, double longitude, int distance) {
    }
    
    @javax.inject.Inject()
    public TSearchMotelViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.MotelRepository motelRepository) {
        super();
    }
}