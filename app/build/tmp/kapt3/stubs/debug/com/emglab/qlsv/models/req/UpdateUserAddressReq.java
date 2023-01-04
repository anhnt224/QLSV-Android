package com.emglab.qlsv.models.req;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/emglab/qlsv/models/req/UpdateUserAddressReq;", "", "userName", "", "token", "userAddress", "Lcom/emglab/qlsv/models/entity/UserAddress;", "motelInfo", "Lcom/emglab/qlsv/models/entity/Motel;", "(Ljava/lang/String;Ljava/lang/String;Lcom/emglab/qlsv/models/entity/UserAddress;Lcom/emglab/qlsv/models/entity/Motel;)V", "getMotelInfo", "()Lcom/emglab/qlsv/models/entity/Motel;", "setMotelInfo", "(Lcom/emglab/qlsv/models/entity/Motel;)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "getUserAddress", "()Lcom/emglab/qlsv/models/entity/UserAddress;", "setUserAddress", "(Lcom/emglab/qlsv/models/entity/UserAddress;)V", "getUserName", "setUserName", "app_debug"})
public final class UpdateUserAddressReq {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "UserName")
    private java.lang.String userName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TokenCode")
    private java.lang.String token;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "StudentContactInfo")
    private com.emglab.qlsv.models.entity.UserAddress userAddress;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "StudentMotelInfo")
    private com.emglab.qlsv.models.entity.Motel motelInfo;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.models.entity.UserAddress getUserAddress() {
        return null;
    }
    
    public final void setUserAddress(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserAddress p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.emglab.qlsv.models.entity.Motel getMotelInfo() {
        return null;
    }
    
    public final void setMotelInfo(@org.jetbrains.annotations.Nullable()
    com.emglab.qlsv.models.entity.Motel p0) {
    }
    
    public UpdateUserAddressReq(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.UserAddress userAddress, @org.jetbrains.annotations.Nullable()
    com.emglab.qlsv.models.entity.Motel motelInfo) {
        super();
    }
}