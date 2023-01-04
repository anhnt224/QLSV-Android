package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u001f\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006 "}, d2 = {"Lcom/emglab/qlsv/models/entity/CriteriaGroup;", "", "id", "", "name", "", "sPoint", "tPoint", "maxPoint", "userCriteriaDetails", "", "Lcom/emglab/qlsv/models/entity/UserCriteriaDetail;", "(ILjava/lang/String;IIILjava/util/List;)V", "getId", "()I", "setId", "(I)V", "getMaxPoint", "setMaxPoint", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSPoint", "setSPoint", "getTPoint", "setTPoint", "getUserCriteriaDetails", "()Ljava/util/List;", "setUserCriteriaDetails", "(Ljava/util/List;)V", "getStudentPoint", "app_debug"})
public final class CriteriaGroup {
    @com.google.gson.annotations.SerializedName(value = "CGId")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CGName")
    private java.lang.String name;
    @com.google.gson.annotations.SerializedName(value = "CGPoint")
    private int sPoint;
    @com.google.gson.annotations.SerializedName(value = "TCGPoint")
    private int tPoint;
    @com.google.gson.annotations.SerializedName(value = "CGMaxPoint")
    private int maxPoint;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "UserCriteriaDetailsLst")
    private java.util.List<com.emglab.qlsv.models.entity.UserCriteriaDetail> userCriteriaDetails;
    
    public final int getStudentPoint() {
        return 0;
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
    public final java.util.List<com.emglab.qlsv.models.entity.UserCriteriaDetail> getUserCriteriaDetails() {
        return null;
    }
    
    public final void setUserCriteriaDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.UserCriteriaDetail> p0) {
    }
    
    public CriteriaGroup(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int sPoint, int tPoint, int maxPoint, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.UserCriteriaDetail> userCriteriaDetails) {
        super();
    }
}