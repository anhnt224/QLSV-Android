package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B#\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0017H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013\u00a8\u0006\u001c"}, d2 = {"Lcom/emglab/qlsv/models/entity/Semester;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "name", "", "student", "", "teacher", "(Ljava/lang/String;ZZ)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getStudent", "()Z", "setStudent", "(Z)V", "getTeacher", "setTeacher", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class Semester implements java.io.Serializable, android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Scode")
    private java.lang.String name;
    @com.google.gson.annotations.SerializedName(value = "Student")
    private boolean student;
    @com.google.gson.annotations.SerializedName(value = "Teacher")
    private boolean teacher;
    public static final com.emglab.qlsv.models.entity.Semester.CREATOR CREATOR = null;
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getStudent() {
        return false;
    }
    
    public final void setStudent(boolean p0) {
    }
    
    public final boolean getTeacher() {
        return false;
    }
    
    public final void setTeacher(boolean p0) {
    }
    
    public Semester(@org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean student, boolean teacher) {
        super();
    }
    
    public Semester() {
        super();
    }
    
    public Semester(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/emglab/qlsv/models/entity/Semester$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/emglab/qlsv/models/entity/Semester;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/emglab/qlsv/models/entity/Semester;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.emglab.qlsv.models.entity.Semester> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.emglab.qlsv.models.entity.Semester createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.emglab.qlsv.models.entity.Semester[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}