package com.emglab.qlsv.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "countSteps")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/emglab/qlsv/models/entity/CountSteps;", "", "id", "", "steps", "", "timer", "date", "Ljava/util/Date;", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getSteps", "()I", "setSteps", "(I)V", "getTimer", "setTimer", "app_debug"})
public final class CountSteps {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private java.lang.String id;
    private int steps;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String timer;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date date;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getSteps() {
        return 0;
    }
    
    public final void setSteps(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTimer() {
        return null;
    }
    
    public final void setTimer(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    public CountSteps(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int steps, @org.jetbrains.annotations.Nullable()
    java.lang.String timer, @org.jetbrains.annotations.Nullable()
    java.util.Date date) {
        super();
    }
    
    public CountSteps() {
        super();
    }
}