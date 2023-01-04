package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020\u0006J\u0006\u00102\u001a\u00020\u0006J\u0006\u00103\u001a\u00020\u0006J\u0006\u00104\u001a\u000200J\u0006\u00105\u001a\u000200J\u0006\u00106\u001a\u000200J\u0006\u00107\u001a\u000200J\u0006\u00108\u001a\u000200J\u0006\u00109\u001a\u00020:R\u001e\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR.\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u0006;"}, d2 = {"Lcom/emglab/qlsv/models/entity/UserCriteriaDetail;", "", "id", "", "cID", "name", "", "description", "sPoint", "tPoint", "maxPoint", "proof", "proofText", "assessUser", "userCriteriaActivities", "Ljava/util/ArrayList;", "Lcom/emglab/qlsv/models/entity/UserCriteriaActivity;", "Lkotlin/collections/ArrayList;", "(IILjava/lang/String;Ljava/lang/String;IIIIILjava/lang/String;Ljava/util/ArrayList;)V", "getAssessUser", "()Ljava/lang/String;", "setAssessUser", "(Ljava/lang/String;)V", "getCID", "()I", "setCID", "(I)V", "getDescription", "setDescription", "getId", "setId", "getMaxPoint", "setMaxPoint", "getName", "setName", "getProof", "setProof", "getProofText", "setProofText", "getSPoint", "setSPoint", "getTPoint", "setTPoint", "getUserCriteriaActivities", "()Ljava/util/ArrayList;", "setUserCriteriaActivities", "(Ljava/util/ArrayList;)V", "canMark", "", "getNumberProof", "getProofStr", "getTeacherScore", "hasProof", "isEmptyTeacherScore", "isMaxTeacherScore", "isProofText", "needProof", "updateSPoint", "", "app_debug"})
public final class UserCriteriaDetail {
    @com.google.gson.annotations.SerializedName(value = "UCId")
    private int id;
    @com.google.gson.annotations.SerializedName(value = "CId")
    private int cID;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CName")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "UCDes")
    private java.lang.String description;
    @com.google.gson.annotations.SerializedName(value = "UCPoint")
    private int sPoint;
    @com.google.gson.annotations.SerializedName(value = "TCPoint")
    private int tPoint;
    @com.google.gson.annotations.SerializedName(value = "CMaxPoint")
    private int maxPoint;
    @com.google.gson.annotations.SerializedName(value = "Proof")
    private int proof;
    @com.google.gson.annotations.SerializedName(value = "ProofText")
    private int proofText;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "AssessUser")
    private java.lang.String assessUser;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "UserCriteriaActivityLst")
    private java.util.ArrayList<com.emglab.qlsv.models.entity.UserCriteriaActivity> userCriteriaActivities;
    
    public final boolean needProof() {
        return false;
    }
    
    public final boolean hasProof() {
        return false;
    }
    
    public final boolean isProofText() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumberProof() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProofStr() {
        return null;
    }
    
    public final void updateSPoint() {
    }
    
    public final boolean canMark() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTeacherScore() {
        return null;
    }
    
    public final boolean isMaxTeacherScore() {
        return false;
    }
    
    public final boolean isEmptyTeacherScore() {
        return false;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getCID() {
        return 0;
    }
    
    public final void setCID(int p0) {
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
    
    public final int getProof() {
        return 0;
    }
    
    public final void setProof(int p0) {
    }
    
    public final int getProofText() {
        return 0;
    }
    
    public final void setProofText(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAssessUser() {
        return null;
    }
    
    public final void setAssessUser(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.emglab.qlsv.models.entity.UserCriteriaActivity> getUserCriteriaActivities() {
        return null;
    }
    
    public final void setUserCriteriaActivities(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.emglab.qlsv.models.entity.UserCriteriaActivity> p0) {
    }
    
    public UserCriteriaDetail(int id, int cID, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int sPoint, int tPoint, int maxPoint, int proof, int proofText, @org.jetbrains.annotations.NotNull()
    java.lang.String assessUser, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.emglab.qlsv.models.entity.UserCriteriaActivity> userCriteriaActivities) {
        super();
    }
}