package com.emglab.qlsv.modules.searchMotel.model

import com.emglab.qlsv.extension.convertDateToStringDateTime
import com.emglab.qlsv.extension.toCurrency
import com.emglab.qlsv.extension.toDate
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class MotelRegistration(
    @SerializedName("RowID")
    var id: Int = 0,
    @SerializedName("Latitude")
    var lat: Double = 0.0,
    @SerializedName("Longitude")
    var lng: Double = 0.0,
    @SerializedName("Address")
    var locationName: String = "",
    @SerializedName("Radius")
    var range: Int = 500,
    @SerializedName("Area")
    var address: String = "",
    @SerializedName("MotelType")
    var type: String = "",
    @SerializedName("QuantityP")
    var numberOfPeople: Int = 0,
    @SerializedName("PriceMax")
    var maxPrice: Int = 0,
    @SerializedName("PriceMin")
    var minPrice: Int = 0,
    @SerializedName("Require")
    var userRequests: String = "",
    @SerializedName("IsGroup")
    var liveWithOther: Int = 0,
    @SerializedName("TimeStart")
    var startDate: String = "",
    @SerializedName("TimeEnd")
    var endDate: String = "",
    @SerializedName("Status")
    var statusCode: Int = 0,
    @SerializedName("TimeCreate")
    var createdTime: String = "",
    @SerializedName("Fee")
    var fee: Int = 50000
): Serializable{
    fun getStatus(): MotelRegistrationStatus {
        return when (statusCode){
            1 -> MotelRegistrationStatus.NEW
            2 -> MotelRegistrationStatus.PENDING
            3 -> MotelRegistrationStatus.PROCESSING
            4 -> MotelRegistrationStatus.COMPLETION
            5 -> MotelRegistrationStatus.FAILURE
            -1 -> MotelRegistrationStatus.CANCELED
            -2 -> MotelRegistrationStatus.DELETED
            else -> MotelRegistrationStatus.OTHER
        }
    }

    fun getNumberOfPeopleStr(): String {
        return "$numberOfPeople người ở"
    }

    fun getNumberOfPeopleStr2(): String {
        return "$numberOfPeople"
    }

    fun getPriceStr(): String {
        return "Giá từ ${minPrice.toCurrency()} đến ${maxPrice.toCurrency()}"
    }

    fun getPriceStr2(): String {
        return "${minPrice.toCurrency()} - ${maxPrice.toCurrency()}"
    }

    fun getCreatedTimeStr(): String {
        return createdTime.toDate()?.convertDateToStringDateTime() ?: run {
            ""
        }
    }

    fun getLocationStr(): String {
        return if (range < 1000){
            "$locationName | ${range}m"
        }else{
            "$locationName | ${String.format("%.1f", range.toDouble() / 1000)}m"
        }
    }

    fun getLiveWithOtherStr(): String {
        return if (liveWithOther == 1) "Có" else "Không"
    }
}