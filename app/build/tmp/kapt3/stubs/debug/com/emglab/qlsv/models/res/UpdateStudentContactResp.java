package com.emglab.qlsv.models.res;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/emglab/qlsv/models/res/UpdateStudentContactResp;", "Lcom/emglab/qlsv/models/res/CTSVCap;", "respCode", "", "respText", "", "motelID", "(ILjava/lang/String;Ljava/lang/Integer;)V", "getMotelID", "()Ljava/lang/Integer;", "setMotelID", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRespCode", "setRespCode", "(I)V", "getRespText", "()Ljava/lang/String;", "setRespText", "(Ljava/lang/String;)V", "app_debug"})
public final class UpdateStudentContactResp extends com.emglab.qlsv.models.res.CTSVCap {
    @com.google.gson.annotations.SerializedName(value = "RespCode")
    private int respCode;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "RespText")
    private java.lang.String respText;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "MotelID")
    private java.lang.Integer motelID;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Integer getRespCode() {
        return null;
    }
    
    public void setRespCode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getRespText() {
        return null;
    }
    
    public void setRespText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMotelID() {
        return null;
    }
    
    public final void setMotelID(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public UpdateStudentContactResp(int respCode, @org.jetbrains.annotations.NotNull()
    java.lang.String respText, @org.jetbrains.annotations.Nullable()
    java.lang.Integer motelID) {
        super();
    }
    
    public UpdateStudentContactResp() {
        super();
    }
}