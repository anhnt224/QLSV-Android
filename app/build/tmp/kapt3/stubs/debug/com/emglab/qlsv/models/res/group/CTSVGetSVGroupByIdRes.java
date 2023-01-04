package com.emglab.qlsv.models.res.group;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/emglab/qlsv/models/res/group/CTSVGetSVGroupByIdRes;", "Lcom/emglab/qlsv/models/res/CTSVCap;", "respText", "", "respCode", "", "svGroupInfo", "Lcom/emglab/qlsv/models/entity/SVGroup;", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/emglab/qlsv/models/entity/SVGroup;)V", "getRespCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRespText", "()Ljava/lang/String;", "getSvGroupInfo", "()Lcom/emglab/qlsv/models/entity/SVGroup;", "app_debug"})
public final class CTSVGetSVGroupByIdRes extends com.emglab.qlsv.models.res.CTSVCap {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "RespText")
    private final java.lang.String respText = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "RespCode")
    private final java.lang.Integer respCode = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "SVGroupInfo")
    private final com.emglab.qlsv.models.entity.SVGroup svGroupInfo = null;
    
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.emglab.qlsv.models.entity.SVGroup getSvGroupInfo() {
        return null;
    }
    
    public CTSVGetSVGroupByIdRes(@org.jetbrains.annotations.Nullable()
    java.lang.String respText, @org.jetbrains.annotations.Nullable()
    java.lang.Integer respCode, @org.jetbrains.annotations.Nullable()
    com.emglab.qlsv.models.entity.SVGroup svGroupInfo) {
        super();
    }
}