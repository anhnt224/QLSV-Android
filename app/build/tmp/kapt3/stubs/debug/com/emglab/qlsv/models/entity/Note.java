package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u0005H\u0007J\b\u0010\u001f\u001a\u00020\u0005H\u0007J\u0006\u0010 \u001a\u00020\u0005R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006!"}, d2 = {"Lcom/emglab/qlsv/models/entity/Note;", "", "id", "", "createID", "", "createEmail", "note", "studentID", "timeCreated", "Ljava/util/Date;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "getCreateEmail", "()Ljava/lang/String;", "setCreateEmail", "(Ljava/lang/String;)V", "getCreateID", "setCreateID", "getId", "()I", "setId", "(I)V", "getNote", "setNote", "getStudentID", "setStudentID", "getTimeCreated", "()Ljava/util/Date;", "setTimeCreated", "(Ljava/util/Date;)V", "getDateCreated", "getMonthCreated", "getTimeCreatedStr", "app_debug"})
public final class Note {
    @com.google.gson.annotations.SerializedName(value = "RowID")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CreateID")
    private java.lang.String createID;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CreateMail")
    private java.lang.String createEmail;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Comment")
    private java.lang.String note;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "StudentID")
    private java.lang.String studentID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "CreateTime")
    private java.util.Date timeCreated;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeCreatedStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String getMonthCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String getDateCreated() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreateID() {
        return null;
    }
    
    public final void setCreateID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreateEmail() {
        return null;
    }
    
    public final void setCreateEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStudentID() {
        return null;
    }
    
    public final void setStudentID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getTimeCreated() {
        return null;
    }
    
    public final void setTimeCreated(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    public Note(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String createID, @org.jetbrains.annotations.NotNull()
    java.lang.String createEmail, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    java.lang.String studentID, @org.jetbrains.annotations.Nullable()
    java.util.Date timeCreated) {
        super();
    }
    
    public Note() {
        super();
    }
}