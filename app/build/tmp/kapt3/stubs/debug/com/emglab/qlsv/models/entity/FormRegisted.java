package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000fR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b\'\u0010\u0013R\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013\u00a8\u0006*"}, d2 = {"Lcom/emglab/qlsv/models/entity/FormRegisted;", "", "id", "", "typePaper", "", "description", "content", "office", "typeService", "note", "timeCreate", "status", "timeAccept", "userAccept", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getId", "()I", "setId", "(I)V", "getNote", "setNote", "getOffice", "setOffice", "getStatus", "setStatus", "getTimeAccept", "setTimeAccept", "getTimeCreate", "setTimeCreate", "getTypePaper", "setTypePaper", "getTypeService", "setTypeService", "getUserAccept", "setUserAccept", "app_debug"})
public final class FormRegisted {
    @com.google.gson.annotations.SerializedName(value = "")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "")
    private java.lang.String typePaper;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "")
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "")
    private java.lang.String content;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "")
    private java.lang.String office;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "")
    private java.lang.String typeService;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "")
    private java.lang.String note;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "")
    private java.lang.String timeCreate;
    @com.google.gson.annotations.SerializedName(value = "")
    private int status;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "")
    private java.lang.String timeAccept;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "")
    private java.lang.String userAccept;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeCreate() {
        return null;
    }
    
    public final void setTimeCreate(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getUserAccept() {
        return null;
    }
    
    public final void setUserAccept(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public FormRegisted(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String typePaper, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.lang.String office, @org.jetbrains.annotations.NotNull()
    java.lang.String typeService, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    java.lang.String timeCreate, int status, @org.jetbrains.annotations.NotNull()
    java.lang.String timeAccept, @org.jetbrains.annotations.NotNull()
    java.lang.String userAccept) {
        super();
    }
    
    public FormRegisted() {
        super();
    }
}