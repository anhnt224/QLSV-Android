package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u001f\u001a\u00020\u0003J\u0006\u0010 \u001a\u00020\u0003J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014\u00a8\u0006%"}, d2 = {"Lcom/emglab/qlsv/models/entity/CriteriaType;", "", "id", "", "name", "", "sPoint", "tPoint", "maxPoint", "criteriaGroups", "", "Lcom/emglab/qlsv/models/entity/CriteriaGroup;", "(ILjava/lang/String;IIILjava/util/List;)V", "getCriteriaGroups", "()Ljava/util/List;", "setCriteriaGroups", "(Ljava/util/List;)V", "getId", "()I", "setId", "(I)V", "getMaxPoint", "setMaxPoint", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSPoint", "setSPoint", "getTPoint", "setTPoint", "getStudentPoint", "getTeacherScore", "isActivityInvalid", "", "activity", "Lcom/emglab/qlsv/models/entity/UserCriteriaActivity;", "app_debug"})
public final class CriteriaType {
    @com.google.gson.annotations.SerializedName(value = "CTId")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CTName")
    private java.lang.String name;
    @com.google.gson.annotations.SerializedName(value = "CTPoint")
    private int sPoint;
    @com.google.gson.annotations.SerializedName(value = "TCTPoint")
    private int tPoint;
    @com.google.gson.annotations.SerializedName(value = "CTMaxPoint")
    private int maxPoint;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CriteriaGroupDetailsLst")
    private java.util.List<com.emglab.qlsv.models.entity.CriteriaGroup> criteriaGroups;
    
    public final int getStudentPoint() {
        return 0;
    }
    
    public final int getTeacherScore() {
        return 0;
    }
    
    public final boolean isActivityInvalid(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserCriteriaActivity activity) {
        return false;
    }
    
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
    
    public final int getSPoint() {
        return 0;
    }
    
    public final void setSPoint(int p0) {
    }
    
    public final int getTPoint() {
        return 0;
    }
    
    public final void setTPoint(int p0) {
    }
    
    public final int getMaxPoint() {
        return 0;
    }
    
    public final void setMaxPoint(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.CriteriaGroup> getCriteriaGroups() {
        return null;
    }
    
    public final void setCriteriaGroups(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.CriteriaGroup> p0) {
    }
    
    public CriteriaType(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int sPoint, int tPoint, int maxPoint, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.CriteriaGroup> criteriaGroups) {
        super();
    }
}