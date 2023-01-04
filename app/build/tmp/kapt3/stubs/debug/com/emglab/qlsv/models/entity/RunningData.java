package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u001e\u001a\u00020\u001fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006 "}, d2 = {"Lcom/emglab/qlsv/models/entity/RunningData;", "Ljava/io/Serializable;", "time", "", "lat", "", "lng", "distance", "", "timeStart", "", "(IDDFLjava/lang/String;)V", "getDistance", "()F", "setDistance", "(F)V", "getLat", "()D", "setLat", "(D)V", "getLng", "setLng", "getTime", "()I", "setTime", "(I)V", "getTimeStart", "()Ljava/lang/String;", "setTimeStart", "(Ljava/lang/String;)V", "isEmpty", "", "app_debug"})
public final class RunningData implements java.io.Serializable {
    private int time;
    private double lat;
    private double lng;
    private float distance;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String timeStart;
    
    public final boolean isEmpty() {
        return false;
    }
    
    public final int getTime() {
        return 0;
    }
    
    public final void setTime(int p0) {
    }
    
    public final double getLat() {
        return 0.0;
    }
    
    public final void setLat(double p0) {
    }
    
    public final double getLng() {
        return 0.0;
    }
    
    public final void setLng(double p0) {
    }
    
    public final float getDistance() {
        return 0.0F;
    }
    
    public final void setDistance(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeStart() {
        return null;
    }
    
    public final void setTimeStart(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public RunningData(int time, double lat, double lng, float distance, @org.jetbrains.annotations.NotNull()
    java.lang.String timeStart) {
        super();
    }
    
    public RunningData() {
        super();
    }
}