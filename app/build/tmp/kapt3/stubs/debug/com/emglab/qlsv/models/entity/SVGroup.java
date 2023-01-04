package com.emglab.qlsv.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "SVGroup")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\b\u0007\u0018\u00002\u00020\u0001B\u00b7\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0014R \u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R \u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R \u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R \u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00101\u001a\u0004\b4\u0010.\"\u0004\b5\u00100R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00101\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00101\u001a\u0004\b:\u0010.\"\u0004\b;\u00100\u00a8\u0006<"}, d2 = {"Lcom/emglab/qlsv/models/entity/SVGroup;", "", "parentGId", "", "gId", "gCode", "", "gName", "gType", "startTime", "Ljava/util/Date;", "finishTime", "createDate", "createUser", "gStatus", "gRefId", "gCriteriaLst", "agLst", "userRole", "uuStatus", "(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAgLst", "()Ljava/lang/String;", "setAgLst", "(Ljava/lang/String;)V", "getCreateDate", "()Ljava/util/Date;", "setCreateDate", "(Ljava/util/Date;)V", "getCreateUser", "setCreateUser", "getFinishTime", "setFinishTime", "getGCode", "setGCode", "getGCriteriaLst", "setGCriteriaLst", "getGId", "()I", "setGId", "(I)V", "getGName", "setGName", "getGRefId", "setGRefId", "getGStatus", "()Ljava/lang/Integer;", "setGStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getGType", "setGType", "getParentGId", "setParentGId", "getStartTime", "setStartTime", "getUserRole", "setUserRole", "getUuStatus", "setUuStatus", "app_debug"})
public final class SVGroup {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ParentGId")
    @com.google.gson.annotations.SerializedName(value = "ParentGId")
    private java.lang.Integer parentGId;
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "GId")
    @com.google.gson.annotations.SerializedName(value = "GId")
    private int gId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "GCode")
    @com.google.gson.annotations.SerializedName(value = "GCode")
    private java.lang.String gCode;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "GName")
    @com.google.gson.annotations.SerializedName(value = "GName")
    private java.lang.String gName;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "GType")
    @com.google.gson.annotations.SerializedName(value = "GType")
    private java.lang.String gType;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "StartTime")
    @com.google.gson.annotations.SerializedName(value = "StartTime")
    private java.util.Date startTime;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "FinishTime")
    @com.google.gson.annotations.SerializedName(value = "FinishTime")
    private java.util.Date finishTime;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CreateDate")
    @com.google.gson.annotations.SerializedName(value = "CreateDate")
    private java.util.Date createDate;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CreateUser")
    @com.google.gson.annotations.SerializedName(value = "CreateUser")
    private java.lang.String createUser;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "GStatus")
    @com.google.gson.annotations.SerializedName(value = "GStatus")
    private java.lang.Integer gStatus;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "GRefId")
    @com.google.gson.annotations.SerializedName(value = "GRefId")
    private java.lang.String gRefId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "GCriteriaLst")
    @com.google.gson.annotations.SerializedName(value = "GCriteriaLst")
    private java.lang.String gCriteriaLst;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @androidx.room.ColumnInfo(name = "AGLst")
    @com.google.gson.annotations.SerializedName(value = "AGLst")
    private java.lang.String agLst;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @androidx.room.ColumnInfo(name = "UserRole")
    @com.google.gson.annotations.SerializedName(value = "UserRole")
    private java.lang.Integer userRole;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @androidx.room.ColumnInfo(name = "UUStatus")
    @com.google.gson.annotations.SerializedName(value = "UUStatus")
    private java.lang.Integer uuStatus;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getParentGId() {
        return null;
    }
    
    public final void setParentGId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final int getGId() {
        return 0;
    }
    
    public final void setGId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGCode() {
        return null;
    }
    
    public final void setGCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGName() {
        return null;
    }
    
    public final void setGName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGType() {
        return null;
    }
    
    public final void setGType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getStartTime() {
        return null;
    }
    
    public final void setStartTime(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getFinishTime() {
        return null;
    }
    
    public final void setFinishTime(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getCreateDate() {
        return null;
    }
    
    public final void setCreateDate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreateUser() {
        return null;
    }
    
    public final void setCreateUser(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGStatus() {
        return null;
    }
    
    public final void setGStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGRefId() {
        return null;
    }
    
    public final void setGRefId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGCriteriaLst() {
        return null;
    }
    
    public final void setGCriteriaLst(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAgLst() {
        return null;
    }
    
    public final void setAgLst(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUserRole() {
        return null;
    }
    
    public final void setUserRole(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUuStatus() {
        return null;
    }
    
    public final void setUuStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public SVGroup(@org.jetbrains.annotations.Nullable()
    java.lang.Integer parentGId, int gId, @org.jetbrains.annotations.Nullable()
    java.lang.String gCode, @org.jetbrains.annotations.Nullable()
    java.lang.String gName, @org.jetbrains.annotations.Nullable()
    java.lang.String gType, @org.jetbrains.annotations.Nullable()
    java.util.Date startTime, @org.jetbrains.annotations.Nullable()
    java.util.Date finishTime, @org.jetbrains.annotations.Nullable()
    java.util.Date createDate, @org.jetbrains.annotations.Nullable()
    java.lang.String createUser, @org.jetbrains.annotations.Nullable()
    java.lang.Integer gStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String gRefId, @org.jetbrains.annotations.Nullable()
    java.lang.String gCriteriaLst, @org.jetbrains.annotations.Nullable()
    java.lang.String agLst, @org.jetbrains.annotations.Nullable()
    java.lang.Integer userRole, @org.jetbrains.annotations.Nullable()
    java.lang.Integer uuStatus) {
        super();
    }
    
    public SVGroup() {
        super();
    }
}