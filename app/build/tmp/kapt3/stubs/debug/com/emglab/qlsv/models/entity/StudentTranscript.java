package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/emglab/qlsv/models/entity/StudentTranscript;", "", "gpa", "", "cpa", "numberQ", "numberTL", "numberN", "numberDK", "studentLevel", "warningLevel", "session", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCpa", "()Ljava/lang/String;", "setCpa", "(Ljava/lang/String;)V", "getGpa", "setGpa", "getNumberDK", "setNumberDK", "getNumberN", "setNumberN", "getNumberQ", "setNumberQ", "getNumberTL", "setNumberTL", "getSession", "setSession", "getStudentLevel", "setStudentLevel", "getWarningLevel", "setWarningLevel", "app_debug"})
public final class StudentTranscript {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "GPA")
    private java.lang.String gpa;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CPA")
    private java.lang.String cpa;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "NumberQ")
    private java.lang.String numberQ;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "NumberTL")
    private java.lang.String numberTL;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "NumberN")
    private java.lang.String numberN;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "NumberDK")
    private java.lang.String numberDK;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "StudentLevel")
    private java.lang.String studentLevel;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "WaringLevel")
    private java.lang.String warningLevel;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Session")
    private java.lang.String session;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGpa() {
        return null;
    }
    
    public final void setGpa(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCpa() {
        return null;
    }
    
    public final void setCpa(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumberQ() {
        return null;
    }
    
    public final void setNumberQ(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumberTL() {
        return null;
    }
    
    public final void setNumberTL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumberN() {
        return null;
    }
    
    public final void setNumberN(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumberDK() {
        return null;
    }
    
    public final void setNumberDK(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStudentLevel() {
        return null;
    }
    
    public final void setStudentLevel(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWarningLevel() {
        return null;
    }
    
    public final void setWarningLevel(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSession() {
        return null;
    }
    
    public final void setSession(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public StudentTranscript(@org.jetbrains.annotations.NotNull()
    java.lang.String gpa, @org.jetbrains.annotations.NotNull()
    java.lang.String cpa, @org.jetbrains.annotations.NotNull()
    java.lang.String numberQ, @org.jetbrains.annotations.NotNull()
    java.lang.String numberTL, @org.jetbrains.annotations.NotNull()
    java.lang.String numberN, @org.jetbrains.annotations.NotNull()
    java.lang.String numberDK, @org.jetbrains.annotations.NotNull()
    java.lang.String studentLevel, @org.jetbrains.annotations.NotNull()
    java.lang.String warningLevel, @org.jetbrains.annotations.NotNull()
    java.lang.String session) {
        super();
    }
}