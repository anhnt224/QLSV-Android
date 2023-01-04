package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001PB\u00e7\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0018J\u0006\u0010H\u001a\u00020\u0005J\u0006\u0010I\u001a\u00020JJ\u0006\u0010K\u001a\u00020JJ\u0006\u0010L\u001a\u00020JJ\u0006\u0010M\u001a\u00020JJ\u0006\u0010N\u001a\u00020JJ\u0006\u0010O\u001a\u00020JR \u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b\'\u0010\u001cR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R \u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR \u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R \u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b<\u0010\u001e\"\u0004\b=\u0010 R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010\u001cR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u0010 R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010\u001cR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001a\"\u0004\bE\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010 \u00a8\u0006Q"}, d2 = {"Lcom/emglab/qlsv/models/entity/UserActivity;", "", "uaId", "", "userCode", "", "fullName", "aId", "userRole", "urDesc", "uaNote", "uaComment", "uaLevel", "checkInTime", "Ljava/util/Date;", "checkOutTime", "checkInPlace", "checkOutPlace", "createDate", "createUser", "uaStatus", "assessDate", "AassessUser", "numberCheck", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;)V", "getAassessUser", "()Ljava/lang/String;", "setAassessUser", "(Ljava/lang/String;)V", "getAId", "()Ljava/lang/Integer;", "setAId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAssessDate", "()Ljava/util/Date;", "setAssessDate", "(Ljava/util/Date;)V", "getCheckInPlace", "setCheckInPlace", "getCheckInTime", "setCheckInTime", "getCheckOutPlace", "setCheckOutPlace", "getCheckOutTime", "setCheckOutTime", "getCreateDate", "setCreateDate", "getCreateUser", "setCreateUser", "getFullName", "setFullName", "getNumberCheck", "setNumberCheck", "getUaComment", "setUaComment", "getUaId", "()I", "setUaId", "(I)V", "getUaLevel", "setUaLevel", "getUaNote", "setUaNote", "getUaStatus", "setUaStatus", "getUrDesc", "setUrDesc", "getUserCode", "setUserCode", "getUserRole", "setUserRole", "getUAStatusName", "isGuest", "", "isJoin", "isRegister", "isReject", "proofAvailable", "registerAvailable", "Companion", "app_debug"})
public final class UserActivity {
    @androidx.room.ColumnInfo(name = "UAId")
    @com.google.gson.annotations.SerializedName(value = "UAId")
    private int uaId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UserCode")
    @com.google.gson.annotations.SerializedName(value = "UserCode")
    private java.lang.String userCode;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "FullName")
    @com.google.gson.annotations.SerializedName(value = "FullName")
    private java.lang.String fullName;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "AId")
    @com.google.gson.annotations.SerializedName(value = "AId")
    private java.lang.Integer aId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UserRole")
    @com.google.gson.annotations.SerializedName(value = "UserRole")
    private java.lang.Integer userRole;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "URDesc")
    @com.google.gson.annotations.SerializedName(value = "URDesc")
    private java.lang.String urDesc;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UANote")
    @com.google.gson.annotations.SerializedName(value = "UANote")
    private java.lang.String uaNote;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UAComment")
    @com.google.gson.annotations.SerializedName(value = "UAComment")
    private java.lang.String uaComment;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UALevel")
    @com.google.gson.annotations.SerializedName(value = "UALevel")
    private java.lang.Integer uaLevel;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CheckInTime")
    @com.google.gson.annotations.SerializedName(value = "CheckInTime")
    private java.util.Date checkInTime;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CheckOutTime")
    @com.google.gson.annotations.SerializedName(value = "CheckOutTime")
    private java.util.Date checkOutTime;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CheckInPlace")
    @com.google.gson.annotations.SerializedName(value = "CheckInPlace")
    private java.lang.String checkInPlace;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CheckOutPlace")
    @com.google.gson.annotations.SerializedName(value = "CheckOutPlace")
    private java.lang.String checkOutPlace;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CreateDate")
    @com.google.gson.annotations.SerializedName(value = "CreateDate")
    private java.util.Date createDate;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CreateUser")
    @com.google.gson.annotations.SerializedName(value = "CreateUser")
    private java.lang.String createUser;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UAStatus")
    @com.google.gson.annotations.SerializedName(value = "UAStatus")
    private java.lang.Integer uaStatus;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "AssessDate")
    @com.google.gson.annotations.SerializedName(value = "AssessDate")
    private java.util.Date assessDate;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "AssessUser")
    @com.google.gson.annotations.SerializedName(value = "AssessUser")
    private java.lang.String AassessUser;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "NumberCheck")
    @com.google.gson.annotations.SerializedName(value = "NumberCheck")
    private java.lang.Integer numberCheck;
    private static final int REGISTER = 1;
    private static final int JOIN = 2;
    private static final int REJECT = 0;
    private static final int GUEST = -1;
    public static final com.emglab.qlsv.models.entity.UserActivity.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUAStatusName() {
        return null;
    }
    
    public final boolean isRegister() {
        return false;
    }
    
    public final boolean isReject() {
        return false;
    }
    
    public final boolean isJoin() {
        return false;
    }
    
    public final boolean isGuest() {
        return false;
    }
    
    public final boolean proofAvailable() {
        return false;
    }
    
    public final boolean registerAvailable() {
        return false;
    }
    
    public final int getUaId() {
        return 0;
    }
    
    public final void setUaId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserCode() {
        return null;
    }
    
    public final void setUserCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFullName() {
        return null;
    }
    
    public final void setFullName(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Integer getUserRole() {
        return null;
    }
    
    public final void setUserRole(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrDesc() {
        return null;
    }
    
    public final void setUrDesc(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUaNote() {
        return null;
    }
    
    public final void setUaNote(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUaComment() {
        return null;
    }
    
    public final void setUaComment(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUaLevel() {
        return null;
    }
    
    public final void setUaLevel(@org.jetbrains.annotations.Nullable()
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
    public final java.util.Date getCheckOutTime() {
        return null;
    }
    
    public final void setCheckOutTime(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCheckInPlace() {
        return null;
    }
    
    public final void setCheckInPlace(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCheckOutPlace() {
        return null;
    }
    
    public final void setCheckOutPlace(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getCreateUser() {
        return null;
    }
    
    public final void setCreateUser(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUaStatus() {
        return null;
    }
    
    public final void setUaStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getAssessDate() {
        return null;
    }
    
    public final void setAssessDate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAassessUser() {
        return null;
    }
    
    public final void setAassessUser(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNumberCheck() {
        return null;
    }
    
    public final void setNumberCheck(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public UserActivity(int uaId, @org.jetbrains.annotations.Nullable()
    java.lang.String userCode, @org.jetbrains.annotations.Nullable()
    java.lang.String fullName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer aId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer userRole, @org.jetbrains.annotations.Nullable()
    java.lang.String urDesc, @org.jetbrains.annotations.Nullable()
    java.lang.String uaNote, @org.jetbrains.annotations.Nullable()
    java.lang.String uaComment, @org.jetbrains.annotations.Nullable()
    java.lang.Integer uaLevel, @org.jetbrains.annotations.Nullable()
    java.util.Date checkInTime, @org.jetbrains.annotations.Nullable()
    java.util.Date checkOutTime, @org.jetbrains.annotations.Nullable()
    java.lang.String checkInPlace, @org.jetbrains.annotations.Nullable()
    java.lang.String checkOutPlace, @org.jetbrains.annotations.Nullable()
    java.util.Date createDate, @org.jetbrains.annotations.Nullable()
    java.lang.String createUser, @org.jetbrains.annotations.Nullable()
    java.lang.Integer uaStatus, @org.jetbrains.annotations.Nullable()
    java.util.Date assessDate, @org.jetbrains.annotations.Nullable()
    java.lang.String AassessUser, @org.jetbrains.annotations.Nullable()
    java.lang.Integer numberCheck) {
        super();
    }
    
    public UserActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/emglab/qlsv/models/entity/UserActivity$Companion;", "", "()V", "GUEST", "", "getGUEST", "()I", "JOIN", "getJOIN", "REGISTER", "getREGISTER", "REJECT", "getREJECT", "app_debug"})
    public static final class Companion {
        
        public final int getREGISTER() {
            return 0;
        }
        
        public final int getJOIN() {
            return 0;
        }
        
        public final int getREJECT() {
            return 0;
        }
        
        public final int getGUEST() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}