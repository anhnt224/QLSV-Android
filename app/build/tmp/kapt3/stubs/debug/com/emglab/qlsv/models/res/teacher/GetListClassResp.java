package com.emglab.qlsv.models.res.teacher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\u0018\u00002\u00020\u0001B\'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0002\u0010\bR$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/emglab/qlsv/models/res/teacher/GetListClassResp;", "Lcom/emglab/qlsv/models/res/CTSVCap;", "respText", "", "respCode", "", "listClass", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getListClass", "()Ljava/util/List;", "setListClass", "(Ljava/util/List;)V", "getRespCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRespText", "()Ljava/lang/String;", "app_debug"})
public final class GetListClassResp extends com.emglab.qlsv.models.res.CTSVCap {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "RespText")
    private final java.lang.String respText = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "RespCode")
    private final java.lang.Integer respCode = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ClassLst")
    private java.util.List<java.lang.String> listClass;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getRespText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getRespCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getListClass() {
        return null;
    }
    
    public final void setListClass(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public GetListClassResp(@org.jetbrains.annotations.Nullable()
    java.lang.String respText, @org.jetbrains.annotations.Nullable()
    java.lang.Integer respCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> listClass) {
        super();
    }
}