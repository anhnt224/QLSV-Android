package com.emglab.qlsv.models.res;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/emglab/qlsv/models/res/GetListUserAddressResp;", "Lcom/emglab/qlsv/models/res/CTSVCap;", "respCode", "", "respText", "", "userAddresses", "", "Lcom/emglab/qlsv/models/entity/UserAddress;", "(ILjava/lang/String;Ljava/util/List;)V", "getRespCode", "()Ljava/lang/Integer;", "setRespCode", "(I)V", "getRespText", "()Ljava/lang/String;", "setRespText", "(Ljava/lang/String;)V", "getUserAddresses", "()Ljava/util/List;", "setUserAddresses", "(Ljava/util/List;)V", "app_debug"})
public final class GetListUserAddressResp extends com.emglab.qlsv.models.res.CTSVCap {
    @com.google.gson.annotations.SerializedName(value = "RespCode")
    private int respCode;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "RespText")
    private java.lang.String respText;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "StudentContactLst")
    private java.util.List<com.emglab.qlsv.models.entity.UserAddress> userAddresses;
    
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
    public final java.util.List<com.emglab.qlsv.models.entity.UserAddress> getUserAddresses() {
        return null;
    }
    
    public final void setUserAddresses(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.UserAddress> p0) {
    }
    
    public GetListUserAddressResp(int respCode, @org.jetbrains.annotations.NotNull()
    java.lang.String respText, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.UserAddress> userAddresses) {
        super();
    }
}