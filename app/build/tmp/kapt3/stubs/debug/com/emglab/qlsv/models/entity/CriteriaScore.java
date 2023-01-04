package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/emglab/qlsv/models/entity/CriteriaScore;", "", "semester", "", "score", "(Ljava/lang/String;Ljava/lang/String;)V", "getScore", "()Ljava/lang/String;", "setScore", "(Ljava/lang/String;)V", "getSemester", "setSemester", "getScoreFloat", "", "app_debug"})
public final class CriteriaScore {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Semester")
    private java.lang.String semester;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Point")
    private java.lang.String score;
    
    public final float getScoreFloat() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSemester() {
        return null;
    }
    
    public final void setSemester(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScore() {
        return null;
    }
    
    public final void setScore(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public CriteriaScore(@org.jetbrains.annotations.NotNull()
    java.lang.String semester, @org.jetbrains.annotations.NotNull()
    java.lang.String score) {
        super();
    }
    
    public CriteriaScore() {
        super();
    }
}