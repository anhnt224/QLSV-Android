package com.emglab.qlsv.models.req;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/emglab/qlsv/models/req/CreateGiftReq;", "", "userName", "", "token", "gift", "Lcom/emglab/qlsv/models/entity/gift/Gift;", "(Ljava/lang/String;Ljava/lang/String;Lcom/emglab/qlsv/models/entity/gift/Gift;)V", "getGift", "()Lcom/emglab/qlsv/models/entity/gift/Gift;", "setGift", "(Lcom/emglab/qlsv/models/entity/gift/Gift;)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "getUserName", "setUserName", "app_debug"})
public final class CreateGiftReq {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "UserName")
    private java.lang.String userName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TokenCode")
    private java.lang.String token;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "GiftInfo")
    private com.emglab.qlsv.models.entity.gift.Gift gift;
    
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
    public final com.emglab.qlsv.models.entity.gift.Gift getGift() {
        return null;
    }
    
    public final void setGift(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.gift.Gift p0) {
    }
    
    public CreateGiftReq(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.gift.Gift gift) {
        super();
    }
}