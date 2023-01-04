package com.emglab.qlsv.models.req;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bR$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/emglab/qlsv/models/req/SaveRunDataReq;", "", "userName", "", "token", "runDataList", "", "Lcom/emglab/qlsv/models/entity/run/RunData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getRunDataList", "()Ljava/util/List;", "setRunDataList", "(Ljava/util/List;)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "getUserName", "setUserName", "app_debug"})
public final class SaveRunDataReq {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "UserName")
    private java.lang.String userName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TokenCode")
    private java.lang.String token;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "RunResultLst")
    private java.util.List<com.emglab.qlsv.models.entity.run.RunData> runDataList;
    
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
    public final java.util.List<com.emglab.qlsv.models.entity.run.RunData> getRunDataList() {
        return null;
    }
    
    public final void setRunDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.run.RunData> p0) {
    }
    
    public SaveRunDataReq(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.run.RunData> runDataList) {
        super();
    }
    
    public SaveRunDataReq() {
        super();
    }
}