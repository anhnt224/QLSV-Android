package com.emglab.qlsv.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "Criteria")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0013R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0019\"\u0004\b(\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u001fR \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R&\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102\u00a8\u00065"}, d2 = {"Lcom/emglab/qlsv/models/entity/Criteria;", "", "id", "", "cCode", "", "name", "type", "cGroupId", "maxPoint", "status", "ucPoint", "semester", "aId", "userCriteriaPointLst", "", "Lcom/emglab/qlsv/models/entity/UserCriteriaPoint;", "userCriteriaActivityLst", "Lcom/emglab/qlsv/models/entity/UserCriteriaActivity;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "getAId", "()I", "setAId", "(I)V", "getCCode", "()Ljava/lang/String;", "setCCode", "(Ljava/lang/String;)V", "getCGroupId", "()Ljava/lang/Integer;", "setCGroupId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getId", "setId", "getMaxPoint", "setMaxPoint", "getName", "setName", "getSemester", "setSemester", "getStatus", "setStatus", "getType", "setType", "getUcPoint", "setUcPoint", "getUserCriteriaActivityLst", "()Ljava/util/List;", "setUserCriteriaActivityLst", "(Ljava/util/List;)V", "getUserCriteriaPointLst", "setUserCriteriaPointLst", "app_debug"})
public final class Criteria {
    @androidx.room.ColumnInfo(name = "CId")
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "CId")
    private int id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CCode")
    @com.google.gson.annotations.SerializedName(value = "CCode")
    private java.lang.String cCode;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CName")
    @com.google.gson.annotations.SerializedName(value = "CName")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CType")
    @com.google.gson.annotations.SerializedName(value = "CType")
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CGroupId")
    @com.google.gson.annotations.SerializedName(value = "CGroupId")
    private java.lang.Integer cGroupId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CMaxPoint")
    @com.google.gson.annotations.SerializedName(value = "CMaxPoint")
    private java.lang.Integer maxPoint;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CStatus")
    @com.google.gson.annotations.SerializedName(value = "CStatus")
    private java.lang.Integer status;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "UCPoint")
    @com.google.gson.annotations.SerializedName(value = "UCPoint")
    private java.lang.Integer ucPoint;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Semester")
    @com.google.gson.annotations.SerializedName(value = "Semester")
    private java.lang.String semester;
    @androidx.room.ColumnInfo(name = "AId")
    @com.google.gson.annotations.SerializedName(value = "AId")
    private int aId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @androidx.room.ColumnInfo(name = "UserCriteriaPointLst")
    @com.google.gson.annotations.SerializedName(value = "UserCriteriaPointLst")
    private java.util.List<com.emglab.qlsv.models.entity.UserCriteriaPoint> userCriteriaPointLst;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @androidx.room.ColumnInfo(name = "UserCriteriaActivityLst")
    @com.google.gson.annotations.SerializedName(value = "UserCriteriaActivityLst")
    private java.util.List<com.emglab.qlsv.models.entity.UserCriteriaActivity> userCriteriaActivityLst;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCCode() {
        return null;
    }
    
    public final void setCCode(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Integer getCGroupId() {
        return null;
    }
    
    public final void setCGroupId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMaxPoint() {
        return null;
    }
    
    public final void setMaxPoint(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
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
    
    public final int getAId() {
        return 0;
    }
    
    public final void setAId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.emglab.qlsv.models.entity.UserCriteriaPoint> getUserCriteriaPointLst() {
        return null;
    }
    
    public final void setUserCriteriaPointLst(@org.jetbrains.annotations.Nullable()
    java.util.List<com.emglab.qlsv.models.entity.UserCriteriaPoint> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.emglab.qlsv.models.entity.UserCriteriaActivity> getUserCriteriaActivityLst() {
        return null;
    }
    
    public final void setUserCriteriaActivityLst(@org.jetbrains.annotations.Nullable()
    java.util.List<com.emglab.qlsv.models.entity.UserCriteriaActivity> p0) {
    }
    
    public Criteria(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String cCode, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cGroupId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxPoint, @org.jetbrains.annotations.Nullable()
    java.lang.Integer status, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ucPoint, @org.jetbrains.annotations.Nullable()
    java.lang.String semester, int aId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.emglab.qlsv.models.entity.UserCriteriaPoint> userCriteriaPointLst, @org.jetbrains.annotations.Nullable()
    java.util.List<com.emglab.qlsv.models.entity.UserCriteriaActivity> userCriteriaActivityLst) {
        super();
    }
    
    public Criteria() {
        super();
    }
}