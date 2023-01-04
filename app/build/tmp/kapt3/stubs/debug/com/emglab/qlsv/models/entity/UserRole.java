package com.emglab.qlsv.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "UserRole")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/emglab/qlsv/models/entity/UserRole;", "", "URId", "", "URName", "", "URDesc", "URLevel", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getURDesc", "()Ljava/lang/String;", "setURDesc", "(Ljava/lang/String;)V", "getURId", "()I", "setURId", "(I)V", "getURLevel", "()Ljava/lang/Integer;", "setURLevel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getURName", "setURName", "Companion", "app_debug"})
public final class UserRole {
    @androidx.room.PrimaryKey()
    private int URId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String URName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String URDesc;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer URLevel;
    public static final com.emglab.qlsv.models.entity.UserRole.Companion Companion = null;
    
    public final int getURId() {
        return 0;
    }
    
    public final void setURId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getURName() {
        return null;
    }
    
    public final void setURName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getURDesc() {
        return null;
    }
    
    public final void setURDesc(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getURLevel() {
        return null;
    }
    
    public final void setURLevel(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public UserRole(int URId, @org.jetbrains.annotations.Nullable()
    java.lang.String URName, @org.jetbrains.annotations.Nullable()
    java.lang.String URDesc, @org.jetbrains.annotations.Nullable()
    java.lang.Integer URLevel) {
        super();
    }
    
    public UserRole() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/emglab/qlsv/models/entity/UserRole$Companion;", "", "()V", "getName", "", "app_debug"})
    public static final class Companion {
        
        public final void getName() {
        }
        
        private Companion() {
            super();
        }
    }
}