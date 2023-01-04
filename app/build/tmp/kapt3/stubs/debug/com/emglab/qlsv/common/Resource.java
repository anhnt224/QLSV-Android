package com.emglab.qlsv.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 $*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001$B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJB\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00d6\u0001J\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u001cJ\u0006\u0010!\u001a\u00020\u001cJ\u0006\u0010\"\u001a\u00020\u001cJ\t\u0010#\u001a\u00020\u0007H\u00d6\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006%"}, d2 = {"Lcom/emglab/qlsv/common/Resource;", "T", "", "status", "Lcom/emglab/qlsv/common/Status;", "data", "respText", "", "respCode", "", "(Lcom/emglab/qlsv/common/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getRespCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRespText", "()Ljava/lang/String;", "getStatus", "()Lcom/emglab/qlsv/common/Status;", "component1", "component2", "component3", "component4", "copy", "(Lcom/emglab/qlsv/common/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)Lcom/emglab/qlsv/common/Resource;", "equals", "", "other", "hashCode", "isError", "isLoading", "isSuccess", "isTokenInvalid", "toString", "Companion", "app_debug"})
public final class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.emglab.qlsv.common.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String respText = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer respCode = null;
    public static final com.emglab.qlsv.common.Resource.Companion Companion = null;
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final boolean isTokenInvalid() {
        return false;
    }
    
    public final boolean isError() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.common.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRespText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRespCode() {
        return null;
    }
    
    public Resource(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.Status status, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.lang.String respText, @org.jetbrains.annotations.Nullable()
    java.lang.Integer respCode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.common.Status component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.common.Resource<T> copy(@org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.Status status, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.lang.String respText, @org.jetbrains.annotations.Nullable()
    java.lang.Integer respCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\fJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/emglab/qlsv/common/Resource$Companion;", "", "()V", "error", "Lcom/emglab/qlsv/common/Resource;", "T", "msg", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/emglab/qlsv/common/Resource;", "errorToken", "loading", "(Ljava/lang/Object;)Lcom/emglab/qlsv/common/Resource;", "successDb", "successNetwork", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.emglab.qlsv.common.Resource<T> successDb(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.emglab.qlsv.common.Resource<T> successNetwork(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.emglab.qlsv.common.Resource<T> errorToken() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.emglab.qlsv.common.Resource<T> error(@org.jetbrains.annotations.NotNull()
        java.lang.String msg, @org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.emglab.qlsv.common.Resource<T> loading(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}