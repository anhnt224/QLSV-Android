package com.emglab.qlsv.helper.location;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0015J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\u001a\u0010\u001c\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/emglab/qlsv/helper/location/LocationLiveData;", "Landroidx/lifecycle/LiveData;", "Lcom/emglab/qlsv/helper/location/LocationModel;", "context", "Landroid/content/Context;", "allowMockLocations", "", "(Landroid/content/Context;Z)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "kotlin.jvm.PlatformType", "lastMockLocation", "Landroid/location/Location;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "mockLocationsEnabled", "numGoodReadings", "", "checkMockLocations", "", "isLocationPlausible", "location", "onActive", "onInactive", "setLocationData", "mock", "startLocationUpdates", "Companion", "app_debug"})
public final class LocationLiveData extends androidx.lifecycle.LiveData<com.emglab.qlsv.helper.location.LocationModel> {
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private boolean mockLocationsEnabled;
    private android.location.Location lastMockLocation;
    private int numGoodReadings;
    private final com.google.android.gms.location.LocationCallback locationCallback = null;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    private final boolean allowMockLocations = false;
    @org.jetbrains.annotations.NotNull()
    private static final com.google.android.gms.location.LocationRequest locationRequest = null;
    public static final com.emglab.qlsv.helper.location.LocationLiveData.Companion Companion = null;
    
    @java.lang.Override()
    protected void onInactive() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    protected void onActive() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void startLocationUpdates() {
    }
    
    private final void checkMockLocations() {
    }
    
    private final boolean isLocationPlausible(android.location.Location location) {
        return false;
    }
    
    private final void setLocationData(android.location.Location location, int mock) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public LocationLiveData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean allowMockLocations) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/emglab/qlsv/helper/location/LocationLiveData$Companion;", "", "()V", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "getLocationRequest", "()Lcom/google/android/gms/location/LocationRequest;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.gms.location.LocationRequest getLocationRequest() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}