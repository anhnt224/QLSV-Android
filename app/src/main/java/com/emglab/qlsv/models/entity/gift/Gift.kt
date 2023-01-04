package com.emglab.qlsv.models.entity.gift

import com.emglab.qlsv.extension.convertDateToStringDateTime
import com.emglab.qlsv.extension.toDate
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Gift(
    @SerializedName("GiftID")
    var id: Int = 0,
    @SerializedName("GiftName")
    var name: String = "",
    @SerializedName("GiftType")
    var type: String = "",
    @SerializedName("")
    var donor: String = "",
    @SerializedName("Description")
    var description: String = "",
    @SerializedName("Quantity")
    var quantity: Int = 0,
    @SerializedName("QuantityApply")
    var registeredQuantity: Int = 0,
    @SerializedName("ExpirationDate")
    var registrationDeadline: String = "",
    @SerializedName("ReceiveAddress")
    var addressToReceiveGift: String = "",
    @SerializedName("ReceiveSupport")
    var deliveryEnable: Int = 0,
    @SerializedName("TimeStart")
    var startTimeToReceiveGift: String = "",
    @SerializedName("GiverName")
    var contactPerson: String = "",
    @SerializedName("PhoneNumber")
    var phoneNumber: String = "",
    @SerializedName("Facebook")
    var linkFb: String = "",
    @SerializedName("Email")
    var email: String = "",
    @SerializedName("Status")
    var status: Int = 0,
    @SerializedName("UStatus")
    var uStatus: Int = 0,

    /**
     * Registered info
     */
    @SerializedName("TimeApply")
    var timeApply: String = "",
    @SerializedName("Reason")
    var reason: String = ""
): Serializable{
    fun getGiftStatus(): GiftStatus {
        return when (status){
            GiftStatus.PUBLIC.value -> GiftStatus.PUBLIC
            GiftStatus.NEW.value -> GiftStatus.NEW
            GiftStatus.CANCEL.value -> GiftStatus.CANCEL
            GiftStatus.DONE.value -> GiftStatus.DONE
            else -> GiftStatus.OTHER
        }
    }

    fun getStatusName(): String {
        return getGiftStatus().title
    }

    fun getQuantityStr(): String {
        return "Số lượng: $quantity"
    }

    fun getRegisteredQuantityStr(): String {
        return "Đã đăng kí: $registeredQuantity"
    }

    fun getDeadlineStr(): String {
        if (registrationDeadline.toDate() == null){
            return "Hạn đăng kí: --"
        }
        return "Hạn đăng kí: ${registrationDeadline.toDate()!!.convertDateToStringDateTime()}"
    }

    fun getTimeStartReceive(): String {
        if (startTimeToReceiveGift.toDate() == null){
            return "Bắt đầu nhận quà từ: --"
        }
        return "Bắt đầu nhận quà từ: ${startTimeToReceiveGift.toDate()!!.convertDateToStringDateTime()}"
    }

    fun getTimeApplyStr(): String {
        if (timeApply.toDate() == null){
            return "Thời gian đăng kí: --"
        }
        return "Thời gian đăng kí: ${timeApply.toDate()!!.convertDateToStringDateTime()}"
    }

    fun getReasonStr(): String {
        return "Lí do đăng kí: $reason"
    }

    fun getPhoneNumberStr(): String {
        return "Số điện thoại: $phoneNumber"
    }

    fun getFacebookStr(): String {
        return "Facebook/Zalo: $linkFb"
    }

    fun getEmailStr(): String {
        return "Email: $email"
    }

    fun getAddressReceive(): String{
        return "Địa chỉ nhận quà: $addressToReceiveGift"
    }

    fun isEnoughInfo(): Boolean{
        return name.isNotEmpty() && type.isNotEmpty() && quantity > 0
                && registrationDeadline.isNotEmpty()
                && addressToReceiveGift.length >= 6
                && startTimeToReceiveGift.isNotEmpty()
                && contactPerson.isNotEmpty()
    }

    fun getUStatus2(): GiftRegisteredStatus {
        return when (uStatus){
            GiftRegisteredStatus.APPROVED.value -> GiftRegisteredStatus.APPROVED
            GiftRegisteredStatus.NEW.value -> GiftRegisteredStatus.NEW
            GiftRegisteredStatus.CANCELED.value -> GiftRegisteredStatus.CANCELED
            GiftRegisteredStatus.CANCEL_REQUEST.value -> GiftRegisteredStatus.CANCEL_REQUEST
            GiftRegisteredStatus.UNREGISTERED.value -> GiftRegisteredStatus.UNREGISTERED
            else -> GiftRegisteredStatus.OTHER
        }
    }

    fun isUnRegistered(): Boolean {
        return getUStatus2() == GiftRegisteredStatus.UNREGISTERED
    }

    fun isRegistered(): Boolean {
        return getUStatus2() == GiftRegisteredStatus.NEW
    }
}