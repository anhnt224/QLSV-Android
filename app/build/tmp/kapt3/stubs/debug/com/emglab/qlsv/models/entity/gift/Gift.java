package com.emglab.qlsv.models.entity.gift;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u00c3\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0017J\u0006\u0010B\u001a\u00020\u0005J\u0006\u0010C\u001a\u00020\u0005J\u0006\u0010D\u001a\u00020\u0005J\u0006\u0010E\u001a\u00020\u0005J\u0006\u0010F\u001a\u00020GJ\u0006\u0010H\u001a\u00020\u0005J\u0006\u0010I\u001a\u00020\u0005J\u0006\u0010J\u001a\u00020\u0005J\u0006\u0010K\u001a\u00020\u0005J\u0006\u0010L\u001a\u00020\u0005J\u0006\u0010M\u001a\u00020\u0005J\u0006\u0010N\u001a\u00020\u0005J\u0006\u0010O\u001a\u00020PJ\u0006\u0010Q\u001a\u00020RJ\u0006\u0010S\u001a\u00020RJ\u0006\u0010T\u001a\u00020RR\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001e\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\u001e\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010\u001bR\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010\u001bR\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010!R\u001e\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0019\"\u0004\b=\u0010\u001bR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010\u001bR\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010!\u00a8\u0006U"}, d2 = {"Lcom/emglab/qlsv/models/entity/gift/Gift;", "Ljava/io/Serializable;", "id", "", "name", "", "type", "donor", "description", "quantity", "registeredQuantity", "registrationDeadline", "addressToReceiveGift", "deliveryEnable", "startTimeToReceiveGift", "contactPerson", "phoneNumber", "linkFb", "email", "status", "uStatus", "timeApply", "reason", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getAddressToReceiveGift", "()Ljava/lang/String;", "setAddressToReceiveGift", "(Ljava/lang/String;)V", "getContactPerson", "setContactPerson", "getDeliveryEnable", "()I", "setDeliveryEnable", "(I)V", "getDescription", "setDescription", "getDonor", "setDonor", "getEmail", "setEmail", "getId", "setId", "getLinkFb", "setLinkFb", "getName", "setName", "getPhoneNumber", "setPhoneNumber", "getQuantity", "setQuantity", "getReason", "setReason", "getRegisteredQuantity", "setRegisteredQuantity", "getRegistrationDeadline", "setRegistrationDeadline", "getStartTimeToReceiveGift", "setStartTimeToReceiveGift", "getStatus", "setStatus", "getTimeApply", "setTimeApply", "getType", "setType", "getUStatus", "setUStatus", "getAddressReceive", "getDeadlineStr", "getEmailStr", "getFacebookStr", "getGiftStatus", "Lcom/emglab/qlsv/models/entity/gift/GiftStatus;", "getPhoneNumberStr", "getQuantityStr", "getReasonStr", "getRegisteredQuantityStr", "getStatusName", "getTimeApplyStr", "getTimeStartReceive", "getUStatus2", "Lcom/emglab/qlsv/models/entity/gift/GiftRegisteredStatus;", "isEnoughInfo", "", "isRegistered", "isUnRegistered", "app_debug"})
public final class Gift implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "GiftID")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "GiftName")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "GiftType")
    private java.lang.String type;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "")
    private java.lang.String donor;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Description")
    private java.lang.String description;
    @com.google.gson.annotations.SerializedName(value = "Quantity")
    private int quantity;
    @com.google.gson.annotations.SerializedName(value = "QuantityApply")
    private int registeredQuantity;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ExpirationDate")
    private java.lang.String registrationDeadline;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ReceiveAddress")
    private java.lang.String addressToReceiveGift;
    @com.google.gson.annotations.SerializedName(value = "ReceiveSupport")
    private int deliveryEnable;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TimeStart")
    private java.lang.String startTimeToReceiveGift;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "GiverName")
    private java.lang.String contactPerson;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "PhoneNumber")
    private java.lang.String phoneNumber;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Facebook")
    private java.lang.String linkFb;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Email")
    private java.lang.String email;
    @com.google.gson.annotations.SerializedName(value = "Status")
    private int status;
    @com.google.gson.annotations.SerializedName(value = "UStatus")
    private int uStatus;
    
    /**
     * * Registered info
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TimeApply")
    private java.lang.String timeApply;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Reason")
    private java.lang.String reason;
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.models.entity.gift.GiftStatus getGiftStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuantityStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegisteredQuantityStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeadlineStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeStartReceive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeApplyStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReasonStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumberStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFacebookStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmailStr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddressReceive() {
        return null;
    }
    
    public final boolean isEnoughInfo() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.emglab.qlsv.models.entity.gift.GiftRegisteredStatus getUStatus2() {
        return null;
    }
    
    public final boolean isUnRegistered() {
        return false;
    }
    
    public final boolean isRegistered() {
        return false;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getDonor() {
        return null;
    }
    
    public final void setDonor(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final void setQuantity(int p0) {
    }
    
    public final int getRegisteredQuantity() {
        return 0;
    }
    
    public final void setRegisteredQuantity(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegistrationDeadline() {
        return null;
    }
    
    public final void setRegistrationDeadline(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddressToReceiveGift() {
        return null;
    }
    
    public final void setAddressToReceiveGift(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getDeliveryEnable() {
        return 0;
    }
    
    public final void setDeliveryEnable(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartTimeToReceiveGift() {
        return null;
    }
    
    public final void setStartTimeToReceiveGift(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContactPerson() {
        return null;
    }
    
    public final void setContactPerson(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLinkFb() {
        return null;
    }
    
    public final void setLinkFb(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    public final int getUStatus() {
        return 0;
    }
    
    public final void setUStatus(int p0) {
    }
    
    /**
     * * Registered info
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeApply() {
        return null;
    }
    
    /**
     * * Registered info
     */
    public final void setTimeApply(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReason() {
        return null;
    }
    
    public final void setReason(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Gift(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String donor, @org.jetbrains.annotations.NotNull()
    java.lang.String description, int quantity, int registeredQuantity, @org.jetbrains.annotations.NotNull()
    java.lang.String registrationDeadline, @org.jetbrains.annotations.NotNull()
    java.lang.String addressToReceiveGift, int deliveryEnable, @org.jetbrains.annotations.NotNull()
    java.lang.String startTimeToReceiveGift, @org.jetbrains.annotations.NotNull()
    java.lang.String contactPerson, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String linkFb, @org.jetbrains.annotations.NotNull()
    java.lang.String email, int status, int uStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String timeApply, @org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
        super();
    }
    
    public Gift() {
        super();
    }
}