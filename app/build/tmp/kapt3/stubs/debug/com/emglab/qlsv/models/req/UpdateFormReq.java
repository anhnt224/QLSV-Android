package com.emglab.qlsv.models.req;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tR$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/emglab/qlsv/models/req/UpdateFormReq;", "", "token", "", "rowID", "", "questions", "", "Lcom/emglab/qlsv/models/entity/FormQuestion;", "(Ljava/lang/String;ILjava/util/List;)V", "getQuestions", "()Ljava/util/List;", "setQuestions", "(Ljava/util/List;)V", "getRowID", "()I", "setRowID", "(I)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "app_debug"})
public final class UpdateFormReq {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TokenCode")
    private java.lang.String token;
    @com.google.gson.annotations.SerializedName(value = "RowID")
    private int rowID;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "SetStudentPaperLst")
    private java.util.List<com.emglab.qlsv.models.entity.FormQuestion> questions;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getRowID() {
        return 0;
    }
    
    public final void setRowID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.emglab.qlsv.models.entity.FormQuestion> getQuestions() {
        return null;
    }
    
    public final void setQuestions(@org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.FormQuestion> p0) {
    }
    
    public UpdateFormReq(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int rowID, @org.jetbrains.annotations.NotNull()
    java.util.List<com.emglab.qlsv.models.entity.FormQuestion> questions) {
        super();
    }
    
    public UpdateFormReq() {
        super();
    }
}