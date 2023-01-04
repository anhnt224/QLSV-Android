package com.emglab.qlsv.models.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0015J\u0006\u0010<\u001a\u00020\u0005J\u0006\u0010=\u001a\u00020\u0005J\u0006\u0010>\u001a\u00020?R\u001e\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001e\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001e\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010%\"\u0004\b/\u0010\'R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0017\"\u0004\b9\u0010\u0019R\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0017\"\u0004\b;\u0010\u0019\u00a8\u0006@"}, d2 = {"Lcom/emglab/qlsv/models/entity/UserAddress;", "Ljava/io/Serializable;", "id", "", "studentID", "", "studentName", "type", "contact", "timeCreate", "Ljava/util/Date;", "createID", "city", "district", "ward", "longtitude", "", "latitude", "address", "status", "email", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;ILjava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getCity", "setCity", "getContact", "setContact", "getCreateID", "setCreateID", "getDistrict", "setDistrict", "getEmail", "setEmail", "getId", "()I", "setId", "(I)V", "getLatitude", "()D", "setLatitude", "(D)V", "getLongtitude", "setLongtitude", "getStatus", "setStatus", "getStudentID", "setStudentID", "getStudentName", "setStudentName", "getTimeCreate", "()Ljava/util/Date;", "setTimeCreate", "(Ljava/util/Date;)V", "getType", "setType", "getWard", "setWard", "getLocation", "getTime", "isValidEmail", "", "app_debug"})
public final class UserAddress implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "RowID")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "StudentID")
    private java.lang.String studentID;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "StudentName")
    private java.lang.String studentName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TypeHome")
    private java.lang.String type;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Contact")
    private java.lang.String contact;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "TimeCreate")
    private java.util.Date timeCreate;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CreateID")
    private java.lang.String createID;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "City")
    private java.lang.String city;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "District")
    private java.lang.String district;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Wards")
    private java.lang.String ward;
    @com.google.gson.annotations.SerializedName(value = "Longitude")
    private double longtitude;
    @com.google.gson.annotations.SerializedName(value = "Latitude")
    private double latitude;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Address")
    private java.lang.String address;
    @com.google.gson.annotations.SerializedName(value = "Status")
    private int status;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "EmailSV")
    private java.lang.String email;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    public final boolean isValidEmail() {
        return false;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStudentID() {
        return null;
    }
    
    public final void setStudentID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStudentName() {
        return null;
    }
    
    public final void setStudentName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContact() {
        return null;
    }
    
    public final void setContact(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getTimeCreate() {
        return null;
    }
    
    public final void setTimeCreate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreateID() {
        return null;
    }
    
    public final void setCreateID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistrict() {
        return null;
    }
    
    public final void setDistrict(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWard() {
        return null;
    }
    
    public final void setWard(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getLongtitude() {
        return 0.0;
    }
    
    public final void setLongtitude(double p0) {
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final void setLatitude(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public UserAddress(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String studentID, @org.jetbrains.annotations.NotNull()
    java.lang.String studentName, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String contact, @org.jetbrains.annotations.Nullable()
    java.util.Date timeCreate, @org.jetbrains.annotations.NotNull()
    java.lang.String createID, @org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String district, @org.jetbrains.annotations.NotNull()
    java.lang.String ward, double longtitude, double latitude, @org.jetbrains.annotations.NotNull()
    java.lang.String address, int status, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        super();
    }
    
    public UserAddress() {
        super();
    }
}