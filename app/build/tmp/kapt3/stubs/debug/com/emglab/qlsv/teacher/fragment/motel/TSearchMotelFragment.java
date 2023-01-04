package com.emglab.qlsv.teacher.fragment.motel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\u0018\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0003J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0016H\u0016J$\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010/\u001a\u00020\u001c2\b\u00100\u001a\u0004\u0018\u00010\u0011H\u0017J \u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\u0006\u00103\u001a\u00020#H\u0002J\b\u00104\u001a\u00020\u001cH\u0002J\u0018\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u0002072\u0006\u0010 \u001a\u00020!H\u0003J\b\u00108\u001a\u00020\u001cH\u0002J\b\u00109\u001a\u00020\u001cH\u0002J\b\u0010:\u001a\u00020\u001cH\u0002J\b\u0010;\u001a\u00020\u001cH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/emglab/qlsv/teacher/fragment/motel/TSearchMotelFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/emglab/qlsv/di/Injectable;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/emglab/qlsv/ui/adapter/MotelInfoAdapter$OnItemMotelInfoClickListener;", "()V", "binding", "Lcom/emglab/qlsv/databinding/FragmentTSearchMotelBinding;", "factory", "Lcom/emglab/qlsv/di/ViewModelFactory;", "getFactory", "()Lcom/emglab/qlsv/di/ViewModelFactory;", "setFactory", "(Lcom/emglab/qlsv/di/ViewModelFactory;)V", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "lastLocation", "Landroid/location/Location;", "listMotel", "", "Lcom/emglab/qlsv/models/entity/Motel;", "motelInfoAdapter", "Lcom/emglab/qlsv/ui/adapter/MotelInfoAdapter;", "viewModel", "Lcom/emglab/qlsv/teacher/viewmodel/motel/TSearchMotelViewModel;", "addMotelMarker", "", "motelList", "ggMap", "drawCircle", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "rad", "", "fillLocationInfo", "navigateToMotelInfoDetailFragment", "motel", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "p0", "pinNowLocation", "map", "radius", "setAndShowBottomBar", "setUpDistanceDialog", "requireContext", "Landroid/content/Context;", "setUpMap", "setUpRecyclerViewMotelInfo", "setupViewModel", "subscribeUI", "app_debug"})
public final class TSearchMotelFragment extends androidx.fragment.app.Fragment implements com.emglab.qlsv.di.Injectable, com.google.android.gms.maps.OnMapReadyCallback, com.emglab.qlsv.ui.adapter.MotelInfoAdapter.OnItemMotelInfoClickListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.di.ViewModelFactory factory;
    private java.util.List<com.emglab.qlsv.models.entity.Motel> listMotel;
    private com.emglab.qlsv.databinding.FragmentTSearchMotelBinding binding;
    private com.emglab.qlsv.ui.adapter.MotelInfoAdapter motelInfoAdapter;
    private com.google.android.gms.maps.GoogleMap googleMap;
    private android.location.Location lastLocation;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private com.emglab.qlsv.teacher.viewmodel.motel.TSearchMotelViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.di.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setAndShowBottomBar() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void setUpDistanceDialog(android.content.Context requireContext, com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    private final void pinNowLocation(com.google.android.gms.maps.GoogleMap map, com.google.android.gms.maps.model.LatLng latLng, double radius) {
    }
    
    private final void setUpRecyclerViewMotelInfo() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    private final void addMotelMarker(java.util.List<com.emglab.qlsv.models.entity.Motel> motelList, com.google.android.gms.maps.GoogleMap ggMap) {
    }
    
    private final void drawCircle(com.google.android.gms.maps.model.LatLng latLng, double rad) {
    }
    
    private final void setUpMap() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void fillLocationInfo(com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n", "NotifyDataSetChanged"})
    public final void subscribeUI() {
    }
    
    private final void setupViewModel() {
    }
    
    @java.lang.Override()
    public void navigateToMotelInfoDetailFragment(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.Motel motel) {
    }
    
    public TSearchMotelFragment() {
        super();
    }
}