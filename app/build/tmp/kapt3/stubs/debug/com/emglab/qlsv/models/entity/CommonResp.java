package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/emglab/qlsv/models/entity/CommonResp;", "", "RespCode", "", "RespText", "", "Signature", "isLoading", "", "UserRole", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "getRespCode", "()I", "setRespCode", "(I)V", "getRespText", "()Ljava/lang/String;", "setRespText", "(Ljava/lang/String;)V", "getSignature", "setSignature", "getUserRole", "()Ljava/lang/Integer;", "setUserRole", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Z", "setLoading", "(Z)V", "app_debug"})
public final class CommonResp {
    private int RespCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String RespText;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String Signature;
    private boolean isLoading;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer UserRole;
    
    public final int getRespCode() {
        return 0;
    }
    
    public final void setRespCode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRespText() {
        return null;
    }
    
    public final void setRespText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSignature() {
        return null;
    }
    
    public final void setSignature(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUserRole() {
        return null;
    }
    
    public final void setUserRole(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public CommonResp(int RespCode, @org.jetbrains.annotations.NotNull()
    java.lang.String RespText, @org.jetbrains.annotations.NotNull()
    java.lang.String Signature, boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer UserRole) {
        super();
    }
    
    public CommonResp() {
        super();
    }
}