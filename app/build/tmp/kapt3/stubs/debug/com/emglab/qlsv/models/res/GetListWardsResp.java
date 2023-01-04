package com.emglab.qlsv.models.res;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\bR\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/emglab/qlsv/models/res/GetListWardsResp;", "Lcom/emglab/qlsv/models/res/CTSVCap;", "respCode", "", "respText", "", "wards", "", "(ILjava/lang/String;Ljava/util/List;)V", "getRespCode", "()Ljava/lang/Integer;", "setRespCode", "(I)V", "getRespText", "()Ljava/lang/String;", "setRespText", "(Ljava/lang/String;)V", "getWards", "()Ljava/util/List;", "setWards", "(Ljava/util/List;)V", "app_debug"})
public final class GetListWardsResp extends com.emglab.qlsv.models.res.CTSVCap {
    @com.google.gson.annotations.SerializedName(value = "RespCode")
    private int respCode;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "RespText")
    private java.lang.String respText;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "LocationLst")
    private java.util.List<java.lang.String> wards;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getWards() {
        return null;
    }
    
    public final void setWards(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public GetListWardsResp(int respCode, @org.jetbrains.annotations.NotNull()
    java.lang.String respText, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> wards) {
        super();
    }
}