package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/emglab/qlsv/models/entity/ActivityGroup;", "", "agId", "", "agDesc", "", "(ILjava/lang/String;)V", "getAgDesc", "()Ljava/lang/String;", "setAgDesc", "(Ljava/lang/String;)V", "getAgId", "()I", "setAgId", "(I)V", "app_debug"})
public final class ActivityGroup {
    @androidx.room.ColumnInfo(name = "AGId")
    @com.google.gson.annotations.SerializedName(value = "AGId")
    private int agId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "AGDesc")
    @com.google.gson.annotations.SerializedName(value = "AGDesc")
    private java.lang.String agDesc;
    
    public final int getAgId() {
        return 0;
    }
    
    public final void setAgId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAgDesc() {
        return null;
    }
    
    public final void setAgDesc(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ActivityGroup(int agId, @org.jetbrains.annotations.NotNull()
    java.lang.String agDesc) {
        super();
    }
    
    public ActivityGroup() {
        super();
    }
}