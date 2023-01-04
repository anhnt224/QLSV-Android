package com.emglab.qlsv.helper.location;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/emglab/qlsv/helper/location/GpsUtils;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "locationManager", "Landroid/location/LocationManager;", "locationSettingsRequest", "Lcom/google/android/gms/location/LocationSettingsRequest;", "settingsClient", "Lcom/google/android/gms/location/SettingsClient;", "turnGPSOn", "", "OnGpsListener", "Lcom/emglab/qlsv/helper/location/GpsUtils$OnGpsListener;", "app_debug"})
public final class GpsUtils {
    private final com.google.android.gms.location.SettingsClient settingsClient = null;
    private final com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest = null;
    private final android.location.LocationManager locationManager = null;
    private final android.content.Context context = null;
    
    public final void turnGPSOn(@org.jetbrains.annotations.Nullable()
    com.emglab.qlsv.helper.location.GpsUtils.OnGpsListener OnGpsListener) {
    }
    
    public GpsUtils(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/emglab/qlsv/helper/location/GpsUtils$OnGpsListener;", "", "gpsStatus", "", "isGPSEnable", "", "app_debug"})
    public static abstract interface OnGpsListener {
        
        public abstract void gpsStatus(boolean isGPSEnable);
    }
}