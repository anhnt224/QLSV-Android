package com.emglab.qlsv.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "ScheduleStudent")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\b\u0007\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010-\u001a\u00020\u0003R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014\u00a8\u0006."}, d2 = {"Lcom/emglab/qlsv/models/entity/ScheduleStudent;", "", "uuid", "", "id", "name", "classId", "timeStart", "timeEnd", "week", "type", "typeSubject", "tower", "room", "dayOfWeek", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClassId", "()Ljava/lang/String;", "setClassId", "(Ljava/lang/String;)V", "getDayOfWeek", "setDayOfWeek", "getDescription", "setDescription", "getId", "setId", "getName", "setName", "getRoom", "setRoom", "getTimeEnd", "setTimeEnd", "getTimeStart", "setTimeStart", "getTower", "setTower", "getType", "setType", "getTypeSubject", "setTypeSubject", "getUuid", "setUuid", "getWeek", "setWeek", "getTime", "app_debug"})
public final class ScheduleStudent {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "UUID")
    @com.google.gson.annotations.SerializedName(value = "UUID")
    private java.lang.String uuid;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "SubjectId")
    @com.google.gson.annotations.SerializedName(value = "SubjectId")
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "SubjectName")
    @com.google.gson.annotations.SerializedName(value = "SubjectName")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ClassID")
    @com.google.gson.annotations.SerializedName(value = "ClassID")
    private java.lang.String classId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "TimeStart")
    @com.google.gson.annotations.SerializedName(value = "TimeStart")
    private java.lang.String timeStart;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "TimeEnd")
    @com.google.gson.annotations.SerializedName(value = "TimeEnd")
    private java.lang.String timeEnd;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Week")
    @com.google.gson.annotations.SerializedName(value = "Week")
    private java.lang.String week;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Type")
    @com.google.gson.annotations.SerializedName(value = "Type")
    private java.lang.String type;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "TypeSubject")
    @com.google.gson.annotations.SerializedName(value = "TypeSubject")
    private java.lang.String typeSubject;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Tower")
    @com.google.gson.annotations.SerializedName(value = "Tower")
    private java.lang.String tower;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Room")
    @com.google.gson.annotations.SerializedName(value = "Room")
    private java.lang.String room;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "DayOfWeek")
    @com.google.gson.annotations.SerializedName(value = "DayOfWeek")
    private java.lang.String dayOfWeek;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Description")
    @com.google.gson.annotations.SerializedName(value = "Description")
    private java.lang.String description;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUuid() {
        return null;
    }
    
    public final void setUuid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClassId() {
        return null;
    }
    
    public final void setClassId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTimeStart() {
        return null;
    }
    
    public final void setTimeStart(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTimeEnd() {
        return null;
    }
    
    public final void setTimeEnd(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWeek() {
        return null;
    }
    
    public final void setWeek(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTypeSubject() {
        return null;
    }
    
    public final void setTypeSubject(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTower() {
        return null;
    }
    
    public final void setTower(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRoom() {
        return null;
    }
    
    public final void setRoom(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDayOfWeek() {
        return null;
    }
    
    public final void setDayOfWeek(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public ScheduleStudent(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String classId, @org.jetbrains.annotations.Nullable()
    java.lang.String timeStart, @org.jetbrains.annotations.Nullable()
    java.lang.String timeEnd, @org.jetbrains.annotations.Nullable()
    java.lang.String week, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String typeSubject, @org.jetbrains.annotations.Nullable()
    java.lang.String tower, @org.jetbrains.annotations.Nullable()
    java.lang.String room, @org.jetbrains.annotations.NotNull()
    java.lang.String dayOfWeek, @org.jetbrains.annotations.Nullable()
    java.lang.String description) {
        super();
    }
    
    public ScheduleStudent() {
        super();
    }
}