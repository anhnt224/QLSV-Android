package com.emglab.qlsv.models.entity.run;

import java.lang.System;

@androidx.room.Entity(tableName = "RunResult")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\'\u001a\u00020\u0005J\u0006\u0010(\u001a\u00020\u0005J\u0006\u0010)\u001a\u00020\u0005J\u0006\u0010*\u001a\u00020\u0005J\u0006\u0010+\u001a\u00020\u0005J\u0006\u0010,\u001a\u00020\u0005J\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020\u0005R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001e\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$\u00a8\u00060"}, d2 = {"Lcom/emglab/qlsv/models/entity/run/RunResult;", "", "competitionID", "", "wayID", "", "userCode", "timeStart", "Ljava/util/Date;", "timeEnd", "distance", "", "timeCreate", "status", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;DLjava/util/Date;I)V", "getCompetitionID", "()I", "setCompetitionID", "(I)V", "getDistance", "()D", "setDistance", "(D)V", "getStatus", "setStatus", "getTimeCreate", "()Ljava/util/Date;", "setTimeCreate", "(Ljava/util/Date;)V", "getTimeEnd", "setTimeEnd", "getTimeStart", "setTimeStart", "getUserCode", "()Ljava/lang/String;", "setUserCode", "(Ljava/lang/String;)V", "getWayID", "setWayID", "getDateStartStr", "getDistanceStr", "getDistanceUnit", "getPace", "getTime", "getTimeStartStr", "isValid", "", "timeStartToDateOfWeek", "app_debug"})
public final class RunResult {
    @androidx.room.ColumnInfo(name = "ComID")
    @com.google.gson.annotations.SerializedName(value = "ComID")
    private int competitionID;
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
    private java.util.Date timeStart;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "TimeEnd")
    @com.google.gson.annotations.SerializedName(value = "TimeEnd")
    private java.util.Date timeEnd;
    @androidx.room.ColumnInfo(name = "Distance")
    @com.google.gson.annotations.SerializedName(value = "Distance")
    private double distance;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "TimeCreate")
    @com.google.gson.annotations.SerializedName(value = "TimeCreate")
    private java.util.Date timeCreate;
    @androidx.room.ColumnInfo(name = "RCStatus")
    @com.google.gson.annotations.SerializedName(value = "RCStatus")
    private int status;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistanceStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistanceUnit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateStartStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeStartStr() {
        return null;
    }
    
    /**
     * * DAY_OF_WEEK: the resulting number ranges from 1(Sunday) to 7(Saturday)
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String timeStartToDateOfWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPace() {
        return null;
    }
    
    public final boolean isValid() {
        return false;
    }
    
    public final int getCompetitionID() {
        return 0;
    }
    
    public final void setCompetitionID(int p0) {
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
    public final java.util.Date getTimeStart() {
        return null;
    }
    
    public final void setTimeStart(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getTimeEnd() {
        return null;
    }
    
    public final void setTimeEnd(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public final double getDistance() {
        return 0.0;
    }
    
    public final void setDistance(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getTimeCreate() {
        return null;
    }
    
    public final void setTimeCreate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    public RunResult(int competitionID, @org.jetbrains.annotations.NotNull()
    java.lang.String wayID, @org.jetbrains.annotations.NotNull()
    java.lang.String userCode, @org.jetbrains.annotations.NotNull()
    java.util.Date timeStart, @org.jetbrains.annotations.NotNull()
    java.util.Date timeEnd, double distance, @org.jetbrains.annotations.NotNull()
    java.util.Date timeCreate, int status) {
        super();
    }
}