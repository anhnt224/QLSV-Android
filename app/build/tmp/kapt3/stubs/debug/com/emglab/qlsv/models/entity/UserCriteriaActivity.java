package com.emglab.qlsv.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "UserCriteriaActivity")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001e\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR \u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006*"}, d2 = {"Lcom/emglab/qlsv/models/entity/UserCriteriaActivity;", "", "ucaId", "", "cId", "aId", "createDate", "Ljava/util/Date;", "createUser", "", "ucaStatus", "startTime", "finishTime", "name", "(IIILjava/util/Date;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "getAId", "()I", "setAId", "(I)V", "getCId", "setCId", "getCreateDate", "()Ljava/util/Date;", "setCreateDate", "(Ljava/util/Date;)V", "getCreateUser", "()Ljava/lang/String;", "setCreateUser", "(Ljava/lang/String;)V", "getFinishTime", "setFinishTime", "getName", "setName", "getStartTime", "setStartTime", "getUcaId", "setUcaId", "getUcaStatus", "()Ljava/lang/Integer;", "setUcaStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_debug"})
public final class UserCriteriaActivity {
    @androidx.room.ColumnInfo(name = "UCAId")
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "UCAId")
    private int ucaId;
    @androidx.room.ColumnInfo(name = "CId")
    @com.google.gson.annotations.SerializedName(value = "CId")
    private int cId;
    @androidx.room.ColumnInfo(name = "AId")
    @com.google.gson.annotations.SerializedName(value = "AId")
    private int aId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CreateDate")
    @com.google.gson.annotations.SerializedName(value = "CreateDate")
    private java.util.Date createDate;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CreateUser")
    @com.google.gson.annotations.SerializedName(value = "CreateUser")
    private java.lang.String createUser;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UCAStatus")
    @com.google.gson.annotations.SerializedName(value = "UCAStatus")
    private java.lang.Integer ucaStatus;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "StartTime")
    private java.util.Date startTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "FinishTime")
    private java.util.Date finishTime;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "AName")
    private java.lang.String name;
    
    public final int getUcaId() {
        return 0;
    }
    
    public final void setUcaId(int p0) {
    }
    
    public final int getCId() {
        return 0;
    }
    
    public final void setCId(int p0) {
    }
    
    public final int getAId() {
        return 0;
    }
    
    public final void setAId(int p0) {
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
    public final java.lang.Integer getUcaStatus() {
        return null;
    }
    
    public final void setUcaStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public UserCriteriaActivity(int ucaId, int cId, int aId, @org.jetbrains.annotations.Nullable()
    java.util.Date createDate, @org.jetbrains.annotations.Nullable()
    java.lang.String createUser, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ucaStatus, @org.jetbrains.annotations.Nullable()
    java.util.Date startTime, @org.jetbrains.annotations.Nullable()
    java.util.Date finishTime, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
    
    public UserCriteriaActivity() {
        super();
    }
}