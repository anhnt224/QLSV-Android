package com.emglab.qlsv.models.entity.run;

import java.lang.System;

@androidx.room.Entity(tableName = "RunData")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011\u00a8\u0006$"}, d2 = {"Lcom/emglab/qlsv/models/entity/run/RunData;", "", "comIdInRoom", "", "competitionID", "", "competitionName", "wayID", "userCode", "timeStart", "timeEnd", "distance", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getComIdInRoom", "()Ljava/lang/String;", "setComIdInRoom", "(Ljava/lang/String;)V", "getCompetitionID", "()I", "setCompetitionID", "(I)V", "getCompetitionName", "setCompetitionName", "getDistance", "()D", "setDistance", "(D)V", "getTimeEnd", "setTimeEnd", "getTimeStart", "setTimeStart", "getUserCode", "setUserCode", "getWayID", "setWayID", "app_debug"})
public final class RunData {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ComIdInRoom")
    private java.lang.String comIdInRoom;
    @androidx.room.ColumnInfo(name = "ComID")
    @com.google.gson.annotations.SerializedName(value = "ComID")
    private int competitionID;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ComName")
    @com.google.gson.annotations.SerializedName(value = "ComName")
    private java.lang.String competitionName;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "WayID")
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "WayID")
    private java.lang.String wayID;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "UserCode")
    @com.google.gson.annotations.SerializedName(value = "UserCode")
    private java.lang.String userCode;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "TimeStart")
    @com.google.gson.annotations.SerializedName(value = "TimeStart")
    private java.lang.String timeStart;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "TimeEnd")
    @com.google.gson.annotations.SerializedName(value = "TimeEnd")
    private java.lang.String timeEnd;
    @androidx.room.ColumnInfo(name = "Distance")
    @com.google.gson.annotations.SerializedName(value = "Distance")
    private double distance;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getComIdInRoom() {
        return null;
    }
    
    public final void setComIdInRoom(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCompetitionID() {
        return 0;
    }
    
    public final void setCompetitionID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCompetitionName() {
        return null;
    }
    
    public final void setCompetitionName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWayID() {
        return null;
    }
    
    public final void setWayID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserCode() {
        return null;
    }
    
    public final void setUserCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeStart() {
        return null;
    }
    
    public final void setTimeStart(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeEnd() {
        return null;
    }
    
    public final void setTimeEnd(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getDistance() {
        return 0.0;
    }
    
    public final void setDistance(double p0) {
    }
    
    public RunData(@org.jetbrains.annotations.NotNull()
    java.lang.String comIdInRoom, int competitionID, @org.jetbrains.annotations.NotNull()
    java.lang.String competitionName, @org.jetbrains.annotations.NotNull()
    java.lang.String wayID, @org.jetbrains.annotations.NotNull()
    java.lang.String userCode, @org.jetbrains.annotations.NotNull()
    java.lang.String timeStart, @org.jetbrains.annotations.NotNull()
    java.lang.String timeEnd, double distance) {
        super();
    }
    
    public RunData() {
        super();
    }
}