package com.emglab.qlsv.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "WeekNumber")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/emglab/qlsv/models/entity/WeekNumber;", "", "id", "", "weekNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getWeekNumber", "setWeekNumber", "app_debug"})
public final class WeekNumber {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "Id")
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "Id")
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "StudentName")
    @com.google.gson.annotations.SerializedName(value = "StudentName")
    private java.lang.String weekNumber;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWeekNumber() {
        return null;
    }
    
    public final void setWeekNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public WeekNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String weekNumber) {
        super();
    }
    
    public WeekNumber() {
        super();
    }
}