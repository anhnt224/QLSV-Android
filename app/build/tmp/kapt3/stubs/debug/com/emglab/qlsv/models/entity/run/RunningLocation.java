package com.emglab.qlsv.models.entity.run;

import java.lang.System;

@androidx.room.Entity(tableName = "RunningLocation")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006!"}, d2 = {"Lcom/emglab/qlsv/models/entity/run/RunningLocation;", "Ljava/io/Serializable;", "id", "", "latitude", "", "longitude", "wayID", "", "index", "timeUpdated", "", "(IDDLjava/lang/String;IJ)V", "getId", "()I", "setId", "(I)V", "getIndex", "setIndex", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "getTimeUpdated", "()J", "setTimeUpdated", "(J)V", "getWayID", "()Ljava/lang/String;", "setWayID", "(Ljava/lang/String;)V", "app_debug"})
public final class RunningLocation implements java.io.Serializable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @androidx.room.ColumnInfo(name = "latitude")
    private double latitude;
    @androidx.room.ColumnInfo(name = "longitude")
    private double longitude;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "wayID")
    private java.lang.String wayID;
    @androidx.room.ColumnInfo(name = "index")
    private int index;
    @androidx.room.ColumnInfo(name = "timeUpdated")
    private long timeUpdated;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final void setLatitude(double p0) {
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    public final void setLongitude(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWayID() {
        return null;
    }
    
    public final void setWayID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getIndex() {
        return 0;
    }
    
    public final void setIndex(int p0) {
    }
    
    public final long getTimeUpdated() {
        return 0L;
    }
    
    public final void setTimeUpdated(long p0) {
    }
    
    public RunningLocation(int id, double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String wayID, int index, long timeUpdated) {
        super();
    }
    
    public RunningLocation() {
        super();
    }
}