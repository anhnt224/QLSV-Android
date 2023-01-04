package com.emglab.qlsv.models.req;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lcom/emglab/qlsv/models/req/ApproveUserGiftReq;", "", "userName", "", "token", "giftId", "", "userApproveList", "", "Lcom/emglab/qlsv/models/entity/gift/UserApprove;", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getGiftId", "()I", "setGiftId", "(I)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "getUserApproveList", "()Ljava/util/List;", "setUserApproveList", "(Ljava/util/List;)V", "getUserName", "setUserName", "app_debug"})
public final class ApproveUserGiftReq {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "UserName")
    private java.lang.String userName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TokenCode")
    private java.lang.String token;
    @com.google.gson.annotations.SerializedName(value = "GiftID")
    private int giftId;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "UserApproveLst")
    private java.util.List<com.emglab.qlsv.models.entity.gift.UserApprove> userApproveList;
    
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
    
    public final int getGiftId() {
        return 0;
    }
    
    public final void setGiftId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.gift.UserApprove> getUserApproveList() {
        return null;
    }
    
    public final void setUserApproveList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.gift.UserApprove> p0) {
    }
    
    public ApproveUserGiftReq(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, int giftId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.gift.UserApprove> userApproveList) {
        super();
    }
}