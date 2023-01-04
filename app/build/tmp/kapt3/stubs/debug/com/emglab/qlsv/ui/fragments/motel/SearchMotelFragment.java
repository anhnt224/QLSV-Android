package com.emglab.qlsv.ui.fragments.motel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\nH\u0002J\u001c\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#H\u0003J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020\u0017H\u0016J\b\u0010(\u001a\u00020\u001fH\u0016J$\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0017J\u0012\u00101\u001a\u00020\u001f2\b\u00102\u001a\u0004\u0018\u00010\u0015H\u0017J\b\u00103\u001a\u00020\u001fH\u0002J\b\u00104\u001a\u00020\u001fH\u0002J\b\u00105\u001a\u00020\u001fH\u0002J\b\u00106\u001a\u00020\u001fH\u0003J\b\u00107\u001a\u00020\u001fH\u0007R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/motel/SearchMotelFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/emglab/qlsv/ui/adapter/MotelInfoAdapter$OnItemMotelInfoClickListener;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnCameraMoveListener;", "()V", "binding", "Lcom/emglab/qlsv/databinding/SearchMotelFragmentBinding;", "distanceArray", "", "Lcom/emglab/qlsv/ui/fragments/motel/SearchMotelDistance;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "listMotel", "Lcom/emglab/qlsv/models/entity/Motel;", "motelInfoAdapter", "Lcom/emglab/qlsv/ui/adapter/MotelInfoAdapter;", "showMarkerFail", "", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/motel/SearchMotelViewModel;", "addMotelMarker", "", "motelList", "drawCircle", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "distance", "fillLocationInfo", "navigateToMotelInfoDetailFragment", "motel", "onCameraMove", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "p0", "setUpMap", "setUpRecyclerViewMotelInfo", "setupViewModel", "showDistanceDialog", "subscribeUI", "app_debug"})
public final class SearchMotelFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.emglab.qlsv.ui.adapter.MotelInfoAdapter.OnItemMotelInfoClickListener, com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.maps.GoogleMap.OnCameraMoveListener {
    private com.emglab.qlsv.ui.viewmodels.motel.SearchMotelViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private com.emglab.qlsv.databinding.SearchMotelFragmentBinding binding;
    private java.util.List<com.emglab.qlsv.models.entity.Motel> listMotel;
    private com.emglab.qlsv.ui.adapter.MotelInfoAdapter motelInfoAdapter;
    private com.google.android.gms.maps.GoogleMap googleMap;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private java.util.List<? extends com.emglab.qlsv.ui.fragments.motel.SearchMotelDistance> distanceArray;
    private boolean showMarkerFail;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.di.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showDistanceDialog() {
    }
    
    private final void setUpRecyclerViewMotelInfo() {
    }
    
    private final void setupViewModel() {
    }
    
    @java.lang.Override()
    public void navigateToMotelInfoDetailFragment(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Motel motel) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    private final void addMotelMarker(java.util.List<com.emglab.qlsv.models.entity.Motel> motelList) {
    }
    
    private final void drawCircle(com.google.android.gms.maps.model.LatLng latLng, com.emglab.qlsv.ui.fragments.motel.SearchMotelDistance distance) {
    }
    
    private final void setUpMap() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void fillLocationInfo(com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n", "NotifyDataSetChanged"})
    public final void subscribeUI() {
    }
    
    @java.lang.Override()
    public void onCameraMove() {
    }
    
    public SearchMotelFragment() {
        super();
    }
}