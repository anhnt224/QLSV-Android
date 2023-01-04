package com.emglab.qlsv.modules.searchMotel.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b>\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u00af\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0016J\u0006\u0010?\u001a\u00020\bJ\u0006\u0010@\u001a\u00020\bJ\u0006\u0010A\u001a\u00020\bJ\u0006\u0010B\u001a\u00020\bJ\u0006\u0010C\u001a\u00020\bJ\u0006\u0010D\u001a\u00020\bJ\u0006\u0010E\u001a\u00020\bJ\u0006\u0010F\u001a\u00020GR\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\"R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R\u001e\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001aR\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R\u001e\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001aR\u001e\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0018\"\u0004\b>\u0010\u001a\u00a8\u0006H"}, d2 = {"Lcom/emglab/qlsv/modules/searchMotel/model/MotelRegistration;", "Ljava/io/Serializable;", "id", "", "lat", "", "lng", "locationName", "", "range", "address", "type", "numberOfPeople", "maxPrice", "minPrice", "userRequests", "liveWithOther", "startDate", "endDate", "statusCode", "createdTime", "fee", "(IDDLjava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getCreatedTime", "setCreatedTime", "getEndDate", "setEndDate", "getFee", "()I", "setFee", "(I)V", "getId", "setId", "getLat", "()D", "setLat", "(D)V", "getLiveWithOther", "setLiveWithOther", "getLng", "setLng", "getLocationName", "setLocationName", "getMaxPrice", "setMaxPrice", "getMinPrice", "setMinPrice", "getNumberOfPeople", "setNumberOfPeople", "getRange", "setRange", "getStartDate", "setStartDate", "getStatusCode", "setStatusCode", "getType", "setType", "getUserRequests", "setUserRequests", "getCreatedTimeStr", "getLiveWithOtherStr", "getLocationStr", "getNumberOfPeopleStr", "getNumberOfPeopleStr2", "getPriceStr", "getPriceStr2", "getStatus", "Lcom/emglab/qlsv/modules/searchMotel/model/MotelRegistrationStatus;", "app_debug"})
public final class MotelRegistration implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "RowID")
    private int id;
    @com.google.gson.annotations.SerializedName(value = "Latitude")
    private double lat;
    @com.google.gson.annotations.SerializedName(value = "Longitude")
    private double lng;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Address")
    private java.lang.String locationName;
    @com.google.gson.annotations.SerializedName(value = "Radius")
    private int range;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Area")
    private java.lang.String address;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "MotelType")
    private java.lang.String type;
    @com.google.gson.annotations.SerializedName(value = "QuantityP")
    private int numberOfPeople;
    @com.google.gson.annotations.SerializedName(value = "PriceMax")
    private int maxPrice;
    @com.google.gson.annotations.SerializedName(value = "PriceMin")
    private int minPrice;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Require")
    private java.lang.String userRequests;
    @com.google.gson.annotations.SerializedName(value = "IsGroup")
    private int liveWithOther;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TimeStart")
    private java.lang.String startDate;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TimeEnd")
    private java.lang.String endDate;
    @com.google.gson.annotations.SerializedName(value = "Status")
    private int statusCode;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TimeCreate")
    private java.lang.String createdTime;
    @com.google.gson.annotations.SerializedName(value = "Fee")
    private int fee;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.modules.searchMotel.model.MotelRegistrationStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumberOfPeopleStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumberOfPeopleStr2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPriceStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPriceStr2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedTimeStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocationStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLiveWithOtherStr() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final double getLat() {
        return 0.0;
    }
    
    public final void setLat(double p0) {
    }
    
    public final double getLng() {
        return 0.0;
    }
    
    public final void setLng(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocationName() {
        return null;
    }
    
    public final void setLocationName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getRange() {
        return 0;
    }
    
    public final void setRange(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getNumberOfPeople() {
        return 0;
    }
    
    public final void setNumberOfPeople(int p0) {
    }
    
    public final int getMaxPrice() {
        return 0;
    }
    
    public final void setMaxPrice(int p0) {
    }
    
    public final int getMinPrice() {
        return 0;
    }
    
    public final void setMinPrice(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserRequests() {
        return null;
    }
    
    public final void setUserRequests(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getLiveWithOther() {
        return 0;
    }
    
    public final void setLiveWithOther(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartDate() {
        return null;
    }
    
    public final void setStartDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEndDate() {
        return null;
    }
    
    public final void setEndDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getStatusCode() {
        return 0;
    }
    
    public final void setStatusCode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedTime() {
        return null;
    }
    
    public final void setCreatedTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getFee() {
        return 0;
    }
    
    public final void setFee(int p0) {
    }
    
    public MotelRegistration(int id, double lat, double lng, @org.jetbrains.annotations.NotNull()
    java.lang.String locationName, int range, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int numberOfPeople, int maxPrice, int minPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String userRequests, int liveWithOther, @org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate, int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String createdTime, int fee) {
        super();
    }
    
    public MotelRegistration() {
        super();
    }
}