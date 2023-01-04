package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b%\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B}\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0015J\b\u00104\u001a\u00020\u0007H\u0016J\u0006\u00105\u001a\u00020\tJ\u0018\u00106\u001a\u0002072\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0007H\u0016R\u001e\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001e\u0010\u0013\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010!R\u001e\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001e\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001e\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R\u001e\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019\u00a8\u0006:"}, d2 = {"Lcom/emglab/qlsv/models/entity/Motel;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "type", "", "managerContact", "managerName", "description", "address", "rate", "comment", "latitude", "", "longitude", "distance", "status", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;DDDI)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getComment", "setComment", "getDescription", "setDescription", "getDistance", "()D", "setDistance", "(D)V", "getId", "()I", "setId", "(I)V", "getLatitude", "setLatitude", "getLongitude", "setLongitude", "getManagerContact", "setManagerContact", "getManagerName", "setManagerName", "getRate", "setRate", "getStatus", "setStatus", "getType", "setType", "describeContents", "getMotelTypeWithAddress", "writeToParcel", "", "value", "CREATOR", "app_debug"})
public final class Motel implements java.io.Serializable, android.os.Parcelable {
    @com.google.gson.annotations.SerializedName(value = "MotelID")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "MotelType")
    private java.lang.String type;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ManagerPhone")
    private java.lang.String managerContact;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ManagerName")
    private java.lang.String managerName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Description")
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Address")
    private java.lang.String address;
    @com.google.gson.annotations.SerializedName(value = "Rate")
    private int rate;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Comment")
    private java.lang.String comment;
    @com.google.gson.annotations.SerializedName(value = "Latitude")
    private double latitude;
    @com.google.gson.annotations.SerializedName(value = "Longitude")
    private double longitude;
    @com.google.gson.annotations.SerializedName(value = "Distance")
    private double distance;
    @com.google.gson.annotations.SerializedName(value = "Status")
    private int status;
    public static final com.emglab.qlsv.models.entity.Motel.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMotelTypeWithAddress() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int value) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getManagerContact() {
        return null;
    }
    
    public final void setManagerContact(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getManagerName() {
        return null;
    }
    
    public final void setManagerName(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getRate() {
        return 0;
    }
    
    public final void setRate(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getComment() {
        return null;
    }
    
    public final void setComment(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final void setLatitude(double p0) {
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    public final void setLongitude(double p0) {
    }
    
    public final double getDistance() {
        return 0.0;
    }
    
    public final void setDistance(double p0) {
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    public Motel(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String managerContact, @org.jetbrains.annotations.NotNull()
    java.lang.String managerName, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String address, int rate, @org.jetbrains.annotations.NotNull()
    java.lang.String comment, double latitude, double longitude, double distance, int status) {
        super();
    }
    
    public Motel() {
        super();
    }
    
    public Motel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/emglab/qlsv/models/entity/Motel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/emglab/qlsv/models/entity/Motel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/emglab/qlsv/models/entity/Motel;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.emglab.qlsv.models.entity.Motel> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.emglab.qlsv.models.entity.Motel createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.emglab.qlsv.models.entity.Motel[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}