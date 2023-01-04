package com.emglab.qlsv.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "UserCheckInActivity")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018\u00a8\u0006."}, d2 = {"Lcom/emglab/qlsv/models/entity/UserCheckInActivity;", "", "uaCId", "", "userName", "", "userCode", "aId", "checkInTime", "Ljava/util/Date;", "checkInAddress", "longitude", "", "latitude", "uaCStatus", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V", "getAId", "()Ljava/lang/Integer;", "setAId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCheckInAddress", "()Ljava/lang/String;", "setCheckInAddress", "(Ljava/lang/String;)V", "getCheckInTime", "()Ljava/util/Date;", "setCheckInTime", "(Ljava/util/Date;)V", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLongitude", "setLongitude", "getUaCId", "()I", "setUaCId", "(I)V", "getUaCStatus", "setUaCStatus", "getUserCode", "setUserCode", "getUserName", "setUserName", "app_debug"})
public final class UserCheckInActivity {
    @androidx.room.ColumnInfo(name = "UACId")
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "UACId")
    private int uaCId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UserName")
    @com.google.gson.annotations.SerializedName(value = "UserName")
    private java.lang.String userName;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UserCode")
    @com.google.gson.annotations.SerializedName(value = "UserCode")
    private java.lang.String userCode;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "AId")
    @com.google.gson.annotations.SerializedName(value = "AId")
    private java.lang.Integer aId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CheckInTime")
    @com.google.gson.annotations.SerializedName(value = "CheckInTime")
    private java.util.Date checkInTime;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CheckInAddress")
    @com.google.gson.annotations.SerializedName(value = "CheckInAddress")
    private java.lang.String checkInAddress;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Longitude")
    @com.google.gson.annotations.SerializedName(value = "Longitude")
    private java.lang.Double longitude;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Latitude")
    @com.google.gson.annotations.SerializedName(value = "Latitude")
    private java.lang.Double latitude;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UACStatus")
    @com.google.gson.annotations.SerializedName(value = "UACStatus")
    private java.lang.Integer uaCStatus;
    
    public final int getUaCId() {
        return 0;
    }
    
    public final void setUaCId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserCode() {
        return null;
    }
    
    public final void setUserCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAId() {
        return null;
    }
    
    public final void setAId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getCheckInTime() {
        return null;
    }
    
    public final void setCheckInTime(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCheckInAddress() {
        return null;
    }
    
    public final void setCheckInAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLongitude() {
        return null;
    }
    
    public final void setLongitude(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLatitude() {
        return null;
    }
    
    public final void setLatitude(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUaCStatus() {
        return null;
    }
    
    public final void setUaCStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public UserCheckInActivity(int uaCId, @org.jetbrains.annotations.Nullable()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    java.lang.String userCode, @org.jetbrains.annotations.Nullable()
    java.lang.Integer aId, @org.jetbrains.annotations.Nullable()
    java.util.Date checkInTime, @org.jetbrains.annotations.Nullable()
    java.lang.String checkInAddress, @org.jetbrains.annotations.Nullable()
    java.lang.Double longitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
    java.lang.Integer uaCStatus) {
        super();
    }
    
    public UserCheckInActivity() {
        super();
    }
}