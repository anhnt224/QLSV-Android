package com.emglab.qlsv.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "Message")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0003R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/emglab/qlsv/models/entity/Message;", "", "subject", "", "message", "timeSent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getSubject", "setSubject", "getTimeSent", "setTimeSent", "getTimeString", "app_debug"})
public final class Message {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Subject")
    @com.google.gson.annotations.SerializedName(value = "Subject")
    private java.lang.String subject;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Message")
    @com.google.gson.annotations.SerializedName(value = "Message")
    private java.lang.String message;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "TimeSent")
    @com.google.gson.annotations.SerializedName(value = "TimeSent")
    private java.lang.String timeSent;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeString() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubject() {
        return null;
    }
    
    public final void setSubject(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeSent() {
        return null;
    }
    
    public final void setTimeSent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Message(@org.jetbrains.annotations.Nullable()
    java.lang.String subject, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String timeSent) {
        super();
    }
    
    public Message() {
        super();
    }
}