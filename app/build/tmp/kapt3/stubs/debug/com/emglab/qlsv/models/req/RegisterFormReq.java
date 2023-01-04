package com.emglab.qlsv.models.req;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nR\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/emglab/qlsv/models/req/RegisterFormReq;", "", "token", "", "questions", "", "Lcom/emglab/qlsv/models/entity/FormQuestion;", "studentContactID", "", "deliveryType", "(Ljava/lang/String;Ljava/util/List;II)V", "getDeliveryType", "()I", "setDeliveryType", "(I)V", "getQuestions", "()Ljava/util/List;", "setQuestions", "(Ljava/util/List;)V", "getStudentContactID", "setStudentContactID", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "app_debug"})
public final class RegisterFormReq {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TokenCode")
    private java.lang.String token;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "SetStudentPaperLst")
    private java.util.List<com.emglab.qlsv.models.entity.FormQuestion> questions;
    @com.google.gson.annotations.SerializedName(value = "SVContactID")
    private int studentContactID;
    @com.google.gson.annotations.SerializedName(value = "Ship")
    private int deliveryType;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.FormQuestion> getQuestions() {
        return null;
    }
    
    public final void setQuestions(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.FormQuestion> p0) {
    }
    
    public final int getStudentContactID() {
        return 0;
    }
    
    public final void setStudentContactID(int p0) {
    }
    
    public final int getDeliveryType() {
        return 0;
    }
    
    public final void setDeliveryType(int p0) {
    }
    
    public RegisterFormReq(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.FormQuestion> questions, int studentContactID, int deliveryType) {
        super();
    }
}