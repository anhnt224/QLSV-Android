package com.emglab.qlsv.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "ImageMotel", primaryKeys = {"idMotel", "time"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018\u00a8\u0006\u001e"}, d2 = {"Lcom/emglab/qlsv/models/entity/ImageMotel;", "", "idMotel", "", "type", "image", "", "status", "file", "time", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "setFile", "(Ljava/lang/String;)V", "getIdMotel", "()I", "setIdMotel", "(I)V", "getImage", "setImage", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTime", "setTime", "getType", "setType", "app_debug"})
public final class ImageMotel {
    private int idMotel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer type;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String image;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String file;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String time;
    
    public final int getIdMotel() {
        return 0;
    }
    
    public final void setIdMotel(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFile() {
        return null;
    }
    
    public final void setFile(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ImageMotel(int idMotel, @org.jetbrains.annotations.Nullable()
    java.lang.Integer type, @org.jetbrains.annotations.Nullable()
    java.lang.String image, @org.jetbrains.annotations.Nullable()
    java.lang.Integer status, @org.jetbrains.annotations.Nullable()
    java.lang.String file, @org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        super();
    }
    
    public ImageMotel() {
        super();
    }
}