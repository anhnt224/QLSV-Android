package com.emglab.qlsv.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "UserCriteriaPoint")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010\u00a8\u0006$"}, d2 = {"Lcom/emglab/qlsv/models/entity/UserCriteriaPoint;", "", "ucpId", "", "cId", "createUser", "", "createDate", "Ljava/util/Date;", "ucpDesc", "ucPoint", "semester", "(IILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getCId", "()I", "setCId", "(I)V", "getCreateDate", "()Ljava/util/Date;", "setCreateDate", "(Ljava/util/Date;)V", "getCreateUser", "()Ljava/lang/String;", "setCreateUser", "(Ljava/lang/String;)V", "getSemester", "setSemester", "getUcPoint", "()Ljava/lang/Integer;", "setUcPoint", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUcpDesc", "setUcpDesc", "getUcpId", "setUcpId", "app_debug"})
public final class UserCriteriaPoint {
    @androidx.room.ColumnInfo(name = "UCPId")
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "UCPId")
    private int ucpId;
    @androidx.room.ColumnInfo(name = "CId")
    @com.google.gson.annotations.SerializedName(value = "CId")
    private int cId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CreateUser")
    @com.google.gson.annotations.SerializedName(value = "CreateUser")
    private java.lang.String createUser;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CreateDate")
    @com.google.gson.annotations.SerializedName(value = "CreateDate")
    private java.util.Date createDate;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UCPDesc")
    @com.google.gson.annotations.SerializedName(value = "UCPDesc")
    private java.lang.String ucpDesc;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UCPoint")
    @com.google.gson.annotations.SerializedName(value = "UCPoint")
    private java.lang.Integer ucPoint;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Semester")
    @com.google.gson.annotations.SerializedName(value = "Semester")
    private java.lang.String semester;
    
    public final int getUcpId() {
        return 0;
    }
    
    public final void setUcpId(int p0) {
    }
    
    public final int getCId() {
        return 0;
    }
    
    public final void setCId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreateUser() {
        return null;
    }
    
    public final void setCreateUser(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getCreateDate() {
        return null;
    }
    
    public final void setCreateDate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUcpDesc() {
        return null;
    }
    
    public final void setUcpDesc(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUcPoint() {
        return null;
    }
    
    public final void setUcPoint(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSemester() {
        return null;
    }
    
    public final void setSemester(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public UserCriteriaPoint(int ucpId, int cId, @org.jetbrains.annotations.Nullable()
    java.lang.String createUser, @org.jetbrains.annotations.Nullable()
    java.util.Date createDate, @org.jetbrains.annotations.Nullable()
    java.lang.String ucpDesc, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ucPoint, @org.jetbrains.annotations.Nullable()
    java.lang.String semester) {
        super();
    }
    
    public UserCriteriaPoint() {
        super();
    }
}