package com.emglab.qlsv.models.entity.gift

import com.google.gson.annotations.SerializedName

class GiftRegister (
    @SerializedName("UserCode")
    var userCode: String = "",
    @SerializedName("FullName")
    var fullName: String = "",
    @SerializedName("GiftID")
    var giftId: Int = 0,
    @SerializedName("Email")
    var email: String = "",
    @SerializedName("Reason")
    var reason: String = "",
    @SerializedName("TimeCreate")
    var timeCreate: String = "",
    @SerializedName("CreateID")
    var createId: String = "",
    @SerializedName("TimeApprove")
    var timeApproved: String = "",
    @SerializedName("Status")
    var status: Int = 1,
    @SerializedName("AddressID")
    var addressId: Int = 0,
    @SerializedName("Address")
    var address: String = ""
){
    fun isApproved(): Boolean {
        return status == 3
    }

    fun approve(){
        status = 3
    }

    fun cancel(){
        status = 2
    }

    fun getEmailStr(): String {
        return "($email)"
    }

    fun getReasonStr(): String {
        return "Lí do nhận quà: $reason"
    }

    fun getAddressStr(): String {
        return "Địa chỉ nhận quà: $address"
    }
}