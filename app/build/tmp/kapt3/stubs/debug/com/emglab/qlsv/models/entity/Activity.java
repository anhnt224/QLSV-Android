package com.emglab.qlsv.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "Activity")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bK\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u001eJ\u0006\u0010X\u001a\u00020\u0005J\u0006\u0010Y\u001a\u00020\u0005J\u0006\u0010Z\u001a\u00020\u0005J\u0006\u0010[\u001a\u00020\u0005J\u0006\u0010\\\u001a\u00020\u0003J\u0006\u0010]\u001a\u00020\u0005J\u0006\u0010^\u001a\u00020\u0005J\u0006\u0010_\u001a\u00020\u0005J\u0006\u0010`\u001a\u00020\u0005R \u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010 \"\u0004\b)\u0010\"R \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R \u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010 \"\u0004\b-\u0010\"R&\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R \u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010 \"\u0004\b3\u0010\"R \u0010\u001c\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010 \"\u0004\b9\u0010\"R \u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b<\u0010$\"\u0004\b=\u0010&R \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010 \"\u0004\b?\u0010\"R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001e\u0010\u001d\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010 \"\u0004\bE\u0010\"R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010 \"\u0004\bG\u0010\"R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\bH\u0010$\"\u0004\bI\u0010&R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010 \"\u0004\bK\u0010\"R \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010 \"\u0004\bM\u0010\"R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u00105\"\u0004\bO\u00107R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\bP\u0010$\"\u0004\bQ\u0010&R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010 \"\u0004\bS\u0010\"R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\bT\u0010$\"\u0004\bU\u0010&R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\bV\u0010$\"\u0004\bW\u0010&\u00a8\u0006a"}, d2 = {"Lcom/emglab/qlsv/models/entity/Activity;", "", "id", "", "code", "", "name", "type", "desc", "startTime", "Ljava/util/Date;", "finishTime", "place", "gId", "gName", "data", "createDate", "createUser", "status", "refId", "criteriaLst", "", "Lcom/emglab/qlsv/models/entity/Criteria;", "aGId", "aGDesc", "userRole", "parentAId", "uAStatus", "deadline", "linkImage", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/String;)V", "getAGDesc", "()Ljava/lang/String;", "setAGDesc", "(Ljava/lang/String;)V", "getAGId", "()Ljava/lang/Integer;", "setAGId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCode", "setCode", "getCreateDate", "setCreateDate", "getCreateUser", "setCreateUser", "getCriteriaLst", "()Ljava/util/List;", "setCriteriaLst", "(Ljava/util/List;)V", "getData", "setData", "getDeadline", "()Ljava/util/Date;", "setDeadline", "(Ljava/util/Date;)V", "getDesc", "setDesc", "getFinishTime", "setFinishTime", "getGId", "setGId", "getGName", "setGName", "getId", "()I", "setId", "(I)V", "getLinkImage", "setLinkImage", "getName", "setName", "getParentAId", "setParentAId", "getPlace", "setPlace", "getRefId", "setRefId", "getStartTime", "setStartTime", "getStatus", "setStatus", "getType", "setType", "getUAStatus", "setUAStatus", "getUserRole", "setUserRole", "getDeadlineStr", "getNameDayOfMonth", "getNameDayOfWeek", "getTimeStatus", "getTimeStatusColor", "getTimeStr", "getUAStatusColor", "getUAStatusString", "timeStartAndFinishText", "app_debug"})
public final class Activity {
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "AId")
    @com.google.gson.annotations.SerializedName(value = "AId")
    private int id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ACode")
    @com.google.gson.annotations.SerializedName(value = "ACode")
    private java.lang.String code;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "AName")
    @com.google.gson.annotations.SerializedName(value = "AName")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "AType")
    @com.google.gson.annotations.SerializedName(value = "AType")
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ADesc")
    @com.google.gson.annotations.SerializedName(value = "ADesc")
    private java.lang.String desc;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "StartTime")
    @com.google.gson.annotations.SerializedName(value = "StartTime")
    private java.util.Date startTime;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "FinishTime")
    @com.google.gson.annotations.SerializedName(value = "FinishTime")
    private java.util.Date finishTime;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "APlace")
    @com.google.gson.annotations.SerializedName(value = "APlace")
    private java.lang.String place;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "GId")
    @com.google.gson.annotations.SerializedName(value = "GId")
    private java.lang.Integer gId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "GName")
    @com.google.gson.annotations.SerializedName(value = "GName")
    private java.lang.String gName;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Data")
    @com.google.gson.annotations.SerializedName(value = "Data")
    private java.lang.String data;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CreateDate")
    @com.google.gson.annotations.SerializedName(value = "CreateDate")
    private java.lang.String createDate;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CreateUser")
    @com.google.gson.annotations.SerializedName(value = "CreateUser")
    private java.lang.String createUser;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "AStatus")
    @com.google.gson.annotations.SerializedName(value = "AStatus")
    private java.lang.Integer status;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ARefId")
    @com.google.gson.annotations.SerializedName(value = "ARefId")
    private java.lang.String refId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @androidx.room.ColumnInfo(name = "CriteriaLst")
    @com.google.gson.annotations.SerializedName(value = "CriteriaLst")
    private java.util.List<com.emglab.qlsv.models.entity.Criteria> criteriaLst;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "AGId")
    @com.google.gson.annotations.SerializedName(value = "AGId")
    private java.lang.Integer aGId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "AGDesc")
    @com.google.gson.annotations.SerializedName(value = "AGDesc")
    private java.lang.String aGDesc;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UserRole")
    @com.google.gson.annotations.SerializedName(value = "UserRole")
    private java.lang.Integer userRole;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ParentAId")
    @com.google.gson.annotations.SerializedName(value = "ParentAId")
    private java.lang.Integer parentAId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UAStatus")
    @com.google.gson.annotations.SerializedName(value = "UAStatus")
    private java.lang.Integer uAStatus;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Deadline")
    private java.util.Date deadline;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Avatar")
    private java.lang.String linkImage;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String timeStartAndFinishText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameDayOfWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameDayOfMonth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUAStatusString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUAStatusColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeadlineStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeStatus() {
        return null;
    }
    
    public final int getTimeStatusColor() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeStr() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCode() {
        return null;
    }
    
    public final void setCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDesc() {
        return null;
    }
    
    public final void setDesc(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getPlace() {
        return null;
    }
    
    public final void setPlace(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGId() {
        return null;
    }
    
    public final void setGId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGName() {
        return null;
    }
    
    public final void setGName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreateDate() {
        return null;
    }
    
    public final void setCreateDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreateUser() {
        return null;
    }
    
    public final void setCreateUser(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRefId() {
        return null;
    }
    
    public final void setRefId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.emglab.qlsv.models.entity.Criteria> getCriteriaLst() {
        return null;
    }
    
    public final void setCriteriaLst(@org.jetbrains.annotations.Nullable()
    java.util.List<com.emglab.qlsv.models.entity.Criteria> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAGId() {
        return null;
    }
    
    public final void setAGId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAGDesc() {
        return null;
    }
    
    public final void setAGDesc(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Integer getParentAId() {
        return null;
    }
    
    public final void setParentAId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUAStatus() {
        return null;
    }
    
    public final void setUAStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDeadline() {
        return null;
    }
    
    public final void setDeadline(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLinkImage() {
        return null;
    }
    
    public final void setLinkImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Activity(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String code, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String desc, @org.jetbrains.annotations.Nullable()
    java.util.Date startTime, @org.jetbrains.annotations.Nullable()
    java.util.Date finishTime, @org.jetbrains.annotations.Nullable()
    java.lang.String place, @org.jetbrains.annotations.Nullable()
    java.lang.Integer gId, @org.jetbrains.annotations.Nullable()
    java.lang.String gName, @org.jetbrains.annotations.Nullable()
    java.lang.String data, @org.jetbrains.annotations.Nullable()
    java.lang.String createDate, @org.jetbrains.annotations.Nullable()
    java.lang.String createUser, @org.jetbrains.annotations.Nullable()
    java.lang.Integer status, @org.jetbrains.annotations.Nullable()
    java.lang.String refId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.emglab.qlsv.models.entity.Criteria> criteriaLst, @org.jetbrains.annotations.Nullable()
    java.lang.Integer aGId, @org.jetbrains.annotations.Nullable()
    java.lang.String aGDesc, @org.jetbrains.annotations.Nullable()
    java.lang.Integer userRole, @org.jetbrains.annotations.Nullable()
    java.lang.Integer parentAId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer uAStatus, @org.jetbrains.annotations.Nullable()
    java.util.Date deadline, @org.jetbrains.annotations.NotNull()
    java.lang.String linkImage) {
        super();
    }
    
    public Activity() {
        super();
    }
}