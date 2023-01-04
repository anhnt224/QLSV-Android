package com.emglab.qlsv.ui.fragments.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0007H\u0017J\u001a\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/user/PickLocationFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "binding", "Lcom/emglab/qlsv/databinding/PickLocationFragmentBinding;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "viewModel", "Lcom/emglab/qlsv/ui/viewmodels/user/PickLocationViewModel;", "fillLocationInfo", "", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "onViewCreated", "view", "app_debug"})
public final class PickLocationFragment extends androidx.fragment.app.Fragment implements com.google.android.gms.maps.OnMapReadyCallback {
    private com.emglab.qlsv.ui.viewmodels.user.PickLocationViewModel viewModel;
    private com.emglab.qlsv.databinding.PickLocationFragmentBinding binding;
    private com.google.android.gms.maps.GoogleMap mMap;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void fillLocationInfo(com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    public PickLocationFragment() {
        super();
    }
}