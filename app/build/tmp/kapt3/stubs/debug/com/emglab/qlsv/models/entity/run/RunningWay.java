package com.emglab.qlsv.models.entity.run;

import java.lang.System;

@androidx.room.Entity(tableName = "RunningWay")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\u0003J\u0006\u0010\u0014\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/emglab/qlsv/models/entity/run/RunningWay;", "Ljava/io/Serializable;", "id", "", "timeStart", "", "timeUpdated", "(Ljava/lang/String;JJ)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getTimeStart", "()J", "setTimeStart", "(J)V", "getTimeUpdated", "setTimeUpdated", "getTimeEndReq", "getTimeStartReq", "getTimeStartStr", "app_debug"})
public final class RunningWay implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey()
    private java.lang.String id;
    @androidx.room.ColumnInfo(name = "timeStart")
    private long timeStart;
    @androidx.room.ColumnInfo(name = "timeUpdated")
    private long timeUpdated;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeStartStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeStartReq() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeEndReq() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getTimeStart() {
        return 0L;
    }
    
    public final void setTimeStart(long p0) {
    }
    
    public final long getTimeUpdated() {
        return 0L;
    }
    
    public final void setTimeUpdated(long p0) {
    }
    
    public RunningWay(@org.jetbrains.annotations.NotNull()
    java.lang.String id, long timeStart, long timeUpdated) {
        super();
    }
    
    public RunningWay() {
        super();
    }
}