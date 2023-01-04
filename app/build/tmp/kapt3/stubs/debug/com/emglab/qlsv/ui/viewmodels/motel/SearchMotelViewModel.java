package com.emglab.qlsv.ui.viewmodels.motel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\u000e\u0010\"\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u000bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR \u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000e\u00a8\u0006%"}, d2 = {"Lcom/emglab/qlsv/ui/viewmodels/motel/SearchMotelViewModel;", "Landroidx/lifecycle/ViewModel;", "motelRepository", "Lcom/emglab/qlsv/repositories/MotelRepository;", "(Lcom/emglab/qlsv/repositories/MotelRepository;)V", "_footerState", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/emglab/qlsv/ui/fragments/motel/SearchMotelFooterState;", "_latLng", "Lcom/google/android/gms/maps/model/LatLng;", "_radius", "Lcom/emglab/qlsv/ui/fragments/motel/SearchMotelDistance;", "footerState", "getFooterState", "()Landroidx/lifecycle/MediatorLiveData;", "latLng", "getLatLng", "mapCenter", "getMapCenter", "motelList", "Lcom/emglab/qlsv/common/Resource;", "", "Lcom/emglab/qlsv/models/entity/Motel;", "getMotelList", "motelListLiveData", "Landroidx/lifecycle/LiveData;", "radius", "getRadius", "zoomLevel", "", "getZoomLevel", "changeFooterState", "", "getListMotel", "setLatLng", "setRadius", "searchMotelDistance", "app_debug"})
public final class SearchMotelViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Motel>>> motelList = null;
    private androidx.lifecycle.LiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Motel>>> motelListLiveData;
    private androidx.lifecycle.MediatorLiveData<com.google.android.gms.maps.model.LatLng> _latLng;
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.ui.fragments.motel.SearchMotelDistance> _radius = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Float> zoomLevel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.google.android.gms.maps.model.LatLng> mapCenter = null;
    private final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.ui.fragments.motel.SearchMotelFooterState> _footerState = null;
    private final com.emglab.qlsv.repositories.MotelRepository motelRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.common.Resource<java.util.List<com.emglab.qlsv.models.entity.Motel>>> getMotelList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.google.android.gms.maps.model.LatLng> getLatLng() {
        return null;
    }
    
    public final void setLatLng(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.ui.fragments.motel.SearchMotelDistance> getRadius() {
        return null;
    }
    
    public final void setRadius(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.ui.fragments.motel.SearchMotelDistance searchMotelDistance) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.lang.Float> getZoomLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.google.android.gms.maps.model.LatLng> getMapCenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.emglab.qlsv.ui.fragments.motel.SearchMotelFooterState> getFooterState() {
        return null;
    }
    
    public final void changeFooterState() {
    }
    
    public final void getListMotel() {
    }
    
    @javax.inject.Inject()
    public SearchMotelViewModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.repositories.MotelRepository motelRepository) {
        super();
    }
}