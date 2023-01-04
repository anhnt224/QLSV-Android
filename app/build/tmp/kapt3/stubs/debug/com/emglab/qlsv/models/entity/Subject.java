package com.emglab.qlsv.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "Timetable")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\'\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u0005J\u0006\u0010)\u001a\u00020\u0005J\u0006\u0010*\u001a\u00020\u0005J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030,2\u0006\u0010.\u001a\u00020\u0005H\u0002R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012\u00a8\u0006/"}, d2 = {"Lcom/emglab/qlsv/models/entity/Subject;", "", "id", "", "name", "", "classID", "timeStart", "timeEnd", "week", "type", "tower", "room", "dayOfWeek", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClassID", "()Ljava/lang/String;", "setClassID", "(Ljava/lang/String;)V", "getDayOfWeek", "setDayOfWeek", "getId", "()I", "setId", "(I)V", "getName", "setName", "getRoom", "setRoom", "getTimeEnd", "setTimeEnd", "getTimeStart", "setTimeStart", "getTower", "setTower", "getType", "setType", "getWeek", "setWeek", "getDay", "getRoomStr", "getTime", "getTitle", "getWeeks", "", "getWeeksFromWeekRangeString", "weekStr", "app_debug"})
public final class Subject {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "SubjectName")
    @com.google.gson.annotations.SerializedName(value = "SubjectName")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ClassID")
    @com.google.gson.annotations.SerializedName(value = "ClassID")
    private java.lang.String classID;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "TimeStart")
    @com.google.gson.annotations.SerializedName(value = "TimeStart")
    private java.lang.String timeStart;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "TimeEnd")
    @com.google.gson.annotations.SerializedName(value = "TimeEnd")
    private java.lang.String timeEnd;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "Week")
    @com.google.gson.annotations.SerializedName(value = "Week")
    private java.lang.String week;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "TypeSubject")
    @com.google.gson.annotations.SerializedName(value = "TypeSubject")
    private java.lang.String type;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "Tower")
    @com.google.gson.annotations.SerializedName(value = "Tower")
    private java.lang.String tower;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "Room")
    @com.google.gson.annotations.SerializedName(value = "Room")
    private java.lang.String room;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "DayOfWeek")
    @com.google.gson.annotations.SerializedName(value = "DayOfWeek")
    private java.lang.String dayOfWeek;
    
    public final int getDay() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoomStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getWeeks() {
        return null;
    }
    
    private final java.util.List<java.lang.Integer> getWeeksFromWeekRangeString(java.lang.String weekStr) {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClassID() {
        return null;
    }
    
    public final void setClassID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeStart() {
        return null;
    }
    
    public final void setTimeStart(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeEnd() {
        return null;
    }
    
    public final void setTimeEnd(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeek() {
        return null;
    }
    
    public final void setWeek(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTower() {
        return null;
    }
    
    public final void setTower(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoom() {
        return null;
    }
    
    public final void setRoom(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDayOfWeek() {
        return null;
    }
    
    public final void setDayOfWeek(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Subject(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String classID, @org.jetbrains.annotations.NotNull()
    java.lang.String timeStart, @org.jetbrains.annotations.NotNull()
    java.lang.String timeEnd, @org.jetbrains.annotations.NotNull()
    java.lang.String week, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String tower, @org.jetbrains.annotations.NotNull()
    java.lang.String room, @org.jetbrains.annotations.NotNull()
    java.lang.String dayOfWeek) {
        super();
    }
    
    public Subject() {
        super();
    }
}