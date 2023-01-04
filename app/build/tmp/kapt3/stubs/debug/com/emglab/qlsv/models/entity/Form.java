package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u00bf\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0018J\u0006\u0010B\u001a\u00020\u0006J\u0006\u0010C\u001a\u00020\u0006J\u0006\u0010D\u001a\u00020\u0006J\u0006\u0010E\u001a\u00020FJ\u0006\u0010G\u001a\u00020HJ\u0006\u0010I\u001a\u00020HJ\u0006\u0010\u0015\u001a\u00020HJ\u0006\u0010J\u001a\u00020HJ\u0006\u0010K\u001a\u00020HR\u001e\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001e\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010 \"\u0004\b(\u0010\"R\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010 \"\u0004\b)\u0010\"R\u001e\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001e\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010 \"\u0004\b3\u0010\"R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010 \"\u0004\b5\u0010\"R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010 \"\u0004\b7\u0010\"R\u001e\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010 \"\u0004\b9\u0010\"R\u001e\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010\u001cR\u001e\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010\u001cR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010\u001cR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001a\"\u0004\bA\u0010\u001c\u00a8\u0006L"}, d2 = {"Lcom/emglab/qlsv/models/entity/Form;", "Ljava/io/Serializable;", "rowId", "", "id", "typePaper", "", "filePath", "description", "content", "office", "typeService", "note", "status", "timeAccept", "timeCreate", "questions", "", "Lcom/emglab/qlsv/models/entity/Question;", "rating", "comment", "isPaper", "deliveryType", "studentContactID", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;III)V", "getComment", "()Ljava/lang/String;", "setComment", "(Ljava/lang/String;)V", "getContent", "setContent", "getDeliveryType", "()I", "setDeliveryType", "(I)V", "getDescription", "setDescription", "getFilePath", "setFilePath", "getId", "setId", "setPaper", "getNote", "setNote", "getOffice", "setOffice", "getQuestions", "()Ljava/util/List;", "setQuestions", "(Ljava/util/List;)V", "getRating", "setRating", "getRowId", "setRowId", "getStatus", "setStatus", "getStudentContactID", "setStudentContactID", "getTimeAccept", "setTimeAccept", "getTimeCreate", "setTimeCreate", "getTypePaper", "setTypePaper", "getTypeService", "setTypeService", "getContentStr", "getStatusColor", "getStatusStr", "getType", "Lcom/emglab/qlsv/models/entity/FormType;", "hasNote", "", "isDone", "isRated", "isRating", "app_debug"})
public final class Form implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "RowID")
    private int rowId;
    @com.google.gson.annotations.SerializedName(value = "PaperID")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TypePaper")
    private java.lang.String typePaper;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "FilePath")
    private java.lang.String filePath;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Description")
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "DescriptionPaper")
    private java.lang.String content;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Office")
    private java.lang.String office;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TypeService")
    private java.lang.String typeService;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Note")
    private java.lang.String note;
    @com.google.gson.annotations.SerializedName(value = "Status")
    private int status;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TimeAccept")
    private java.lang.String timeAccept;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TimeCreate")
    private java.lang.String timeCreate;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "QuestionLst")
    private java.util.List<com.emglab.qlsv.models.entity.Question> questions;
    @com.google.gson.annotations.SerializedName(value = "Rate")
    private int rating;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Comment")
    private java.lang.String comment;
    @com.google.gson.annotations.SerializedName(value = "IsPaper")
    private int isPaper;
    @com.google.gson.annotations.SerializedName(value = "Ship")
    private int deliveryType;
    @com.google.gson.annotations.SerializedName(value = "SVContactID")
    private int studentContactID;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.models.entity.FormType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContentStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusColor() {
        return null;
    }
    
    public final boolean hasNote() {
        return false;
    }
    
    public final boolean isDone() {
        return false;
    }
    
    public final boolean isRating() {
        return false;
    }
    
    public final boolean isRated() {
        return false;
    }
    
    public final boolean isPaper() {
        return false;
    }
    
    public final int getRowId() {
        return 0;
    }
    
    public final void setRowId(int p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTypePaper() {
        return null;
    }
    
    public final void setTypePaper(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilePath() {
        return null;
    }
    
    public final void setFilePath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOffice() {
        return null;
    }
    
    public final void setOffice(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTypeService() {
        return null;
    }
    
    public final void setTypeService(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeAccept() {
        return null;
    }
    
    public final void setTimeAccept(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeCreate() {
        return null;
    }
    
    public final void setTimeCreate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.Question> getQuestions() {
        return null;
    }
    
    public final void setQuestions(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Question> p0) {
    }
    
    public final int getRating() {
        return 0;
    }
    
    public final void setRating(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getComment() {
        return null;
    }
    
    public final void setComment(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int isPaper() {
        return 0;
    }
    
    public final void setPaper(int p0) {
    }
    
    public final int getDeliveryType() {
        return 0;
    }
    
    public final void setDeliveryType(int p0) {
    }
    
    public final int getStudentContactID() {
        return 0;
    }
    
    public final void setStudentContactID(int p0) {
    }
    
    public Form(int rowId, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String typePaper, @org.jetbrains.annotations.NotNull()
    java.lang.String filePath, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.lang.String office, @org.jetbrains.annotations.NotNull()
    java.lang.String typeService, @org.jetbrains.annotations.NotNull()
    java.lang.String note, int status, @org.jetbrains.annotations.NotNull()
    java.lang.String timeAccept, @org.jetbrains.annotations.NotNull()
    java.lang.String timeCreate, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.Question> questions, int rating, @org.jetbrains.annotations.NotNull()
    java.lang.String comment, int isPaper, int deliveryType, int studentContactID) {
        super();
    }
    
    public Form() {
        super();
    }
}