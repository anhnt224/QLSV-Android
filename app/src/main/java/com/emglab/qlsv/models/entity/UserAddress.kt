package com.emglab.qlsv.models.entity

import com.emglab.qlsv.extension.convertDateToStringDateTime
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class UserAddress (
    @SerializedName("RowID")
    var id: Int = 0,
    @SerializedName("StudentID")
    var studentID: String = "",
    @SerializedName("StudentName")
    var studentName: String = "",
    @SerializedName("TypeHome")
    var type: String = "",
    @SerializedName("Contact")
    var contact: String = "",
    @SerializedName("TimeCreate")
    var timeCreate: Date? = null,
    @SerializedName("CreateID")
    var createID: String = "",
    @SerializedName("City")
    var city: String = "Thành phố Hà Nội",
    @SerializedName("District")
    var district: String = "",
    @SerializedName("Wards")
    var ward: String = "",
    @SerializedName("Longitude")
    var longtitude: Double = 0.0,
    @SerializedName("Latitude")
    var latitude: Double = 0.0,
    @SerializedName("Address")
    var address: String = "",
    @SerializedName("Status")
    var status: Int = 0,
    @SerializedName("EmailSV")
    var email: String = ""
): Serializable{
    fun getLocation(): String{
        return "$latitude - $longtitude"
    }

    fun getTime(): String{
        if(timeCreate != null){
            return timeCreate!!.convertDateToStringDateTime()
        }
        return ""
    }

    fun isValidEmail(): Boolean {
        return email.length >= 10 && email.contains("@") && !email.contains("@sis.hust.edu.vn")
    }
}