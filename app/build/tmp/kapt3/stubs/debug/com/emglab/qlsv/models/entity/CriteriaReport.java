package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012\u00a8\u0006\u001b"}, d2 = {"Lcom/emglab/qlsv/models/entity/CriteriaReport;", "", "id", "", "name", "", "description", "studentPoint", "teacherPoint", "maxPoint", "(ILjava/lang/String;Ljava/lang/String;III)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getMaxPoint", "setMaxPoint", "getName", "setName", "getStudentPoint", "setStudentPoint", "getTeacherPoint", "setTeacherPoint", "app_debug"})
public final class CriteriaReport {
    @com.google.gson.annotations.SerializedName(value = "CTId")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CTName")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CTDesc")
    private java.lang.String description;
    @com.google.gson.annotations.SerializedName(value = "CUPoint")
    private int studentPoint;
    @com.google.gson.annotations.SerializedName(value = "CTPoint")
    private int teacherPoint;
    @com.google.gson.annotations.SerializedName(value = "CTMaxPoint")
    private int maxPoint;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getStudentPoint() {
        return 0;
    }
    
    public final void setStudentPoint(int p0) {
    }
    
    public final int getTeacherPoint() {
        return 0;
    }
    
    public final void setTeacherPoint(int p0) {
    }
    
    public final int getMaxPoint() {
        return 0;
    }
    
    public final void setMaxPoint(int p0) {
    }
    
    public CriteriaReport(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int studentPoint, int teacherPoint, int maxPoint) {
        super();
    }
    
    public CriteriaReport() {
        super();
    }
}