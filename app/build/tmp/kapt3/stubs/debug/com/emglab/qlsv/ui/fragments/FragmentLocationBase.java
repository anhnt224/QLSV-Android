package com.emglab.qlsv.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0006\u0010\u001b\u001a\u00020\u0004J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\u0006\u0010\u001d\u001a\u00020\nJ\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006!"}, d2 = {"Lcom/emglab/qlsv/ui/fragments/FragmentLocationBase;", "Landroidx/fragment/app/Fragment;", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "isGPSEnabled", "", "locationModel", "Lcom/emglab/qlsv/helper/location/LocationModel;", "getLocationModel", "()Lcom/emglab/qlsv/helper/location/LocationModel;", "setLocationModel", "(Lcom/emglab/qlsv/helper/location/LocationModel;)V", "locationViewModel", "Lcom/emglab/qlsv/helper/location/LocationViewModel;", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "getSharedPrefsHelper", "()Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "setSharedPrefsHelper", "(Lcom/emglab/qlsv/helper/SharedPrefsHelper;)V", "addressUpdate", "", "getUserName", "isLocationAvailable", "isLocationNotNull", "locationUpdate", "onStart", "startLocationUpdates", "app_debug"})
public abstract class FragmentLocationBase extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper;
    private boolean isGPSEnabled;
    private com.emglab.qlsv.helper.location.LocationViewModel locationViewModel;
    @org.jetbrains.annotations.NotNull()
    private com.emglab.qlsv.helper.location.LocationModel locationModel;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.helper.SharedPrefsHelper getSharedPrefsHelper() {
        return null;
    }
    
    public final void setSharedPrefsHelper(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.helper.location.LocationModel getLocationModel() {
        return null;
    }
    
    public final void setLocationModel(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.location.LocationModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final boolean isLocationNotNull() {
        return false;
    }
    
    private final void startLocationUpdates() {
    }
    
    private final void isLocationAvailable() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    public abstract void locationUpdate(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.location.LocationModel locationModel);
    
    public abstract void addressUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
    
    public FragmentLocationBase() {
        super();
    }
}