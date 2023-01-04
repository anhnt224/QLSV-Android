package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B#\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/emglab/qlsv/models/entity/Answer;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "idQuestion", "", "content", "", "id", "(ILjava/lang/String;I)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getIdQuestion", "setIdQuestion", "describeContents", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class Answer implements android.os.Parcelable {
    @com.google.gson.annotations.SerializedName(value = "IDQuestion")
    private int idQuestion;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Select")
    private java.lang.String content;
    @com.google.gson.annotations.SerializedName(value = "RowID")
    private int id;
    public static final com.emglab.qlsv.models.entity.Answer.CREATOR CREATOR = null;
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public final int getIdQuestion() {
        return 0;
    }
    
    public final void setIdQuestion(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public Answer(int idQuestion, @org.jetbrains.annotations.NotNull()
    java.lang.String content, int id) {
        super();
    }
    
    public Answer() {
        super();
    }
    
    public Answer(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/emglab/qlsv/models/entity/Answer$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/emglab/qlsv/models/entity/Answer;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/emglab/qlsv/models/entity/Answer;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.emglab.qlsv.models.entity.Answer> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.emglab.qlsv.models.entity.Answer createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.emglab.qlsv.models.entity.Answer[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}