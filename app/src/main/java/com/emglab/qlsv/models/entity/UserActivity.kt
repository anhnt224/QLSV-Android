package com.emglab.qlsv.models.entity

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName
import java.util.*

class UserActivity(

    @ColumnInfo(name = "UAId") @SerializedName("UAId")
    var uaId : Int = 0,
    @ColumnInfo(name = "UserCode") @SerializedName("UserCode")
    var userCode : String? = "",
    @ColumnInfo(name = "FullName") @SerializedName("FullName")
    var fullName : String? = "",
    @ColumnInfo(name = "AId") @SerializedName("AId")
    var aId : Int? = 0,
    @ColumnInfo(name = "UserRole") @SerializedName("UserRole")
    var userRole : Int? = 0,
    @ColumnInfo(name = "URDesc") @SerializedName("URDesc")
    var urDesc : String? = "",
    @ColumnInfo(name = "UANote") @SerializedName("UANote")
    var uaNote : String? = "",
    @ColumnInfo(name = "UAComment") @SerializedName("UAComment")
    var uaComment: String? = "",
    @ColumnInfo(name = "UALevel") @SerializedName("UALevel")
    var uaLevel: Int?= 0,
    @ColumnInfo(name = "CheckInTime") @SerializedName("CheckInTime")
    var checkInTime: Date? = null,
    @ColumnInfo(name = "CheckOutTime") @SerializedName("CheckOutTime")
    var checkOutTime : Date? = null,
    @ColumnInfo(name = "CheckInPlace") @SerializedName("CheckInPlace")
    var checkInPlace : String? = "",
    @ColumnInfo(name = "CheckOutPlace") @SerializedName("CheckOutPlace")
    var checkOutPlace : String? = "",
    @ColumnInfo(name = "CreateDate") @SerializedName("CreateDate")
    var createDate : Date? = null,
    @ColumnInfo(name = "CreateUser") @SerializedName("CreateUser")
    var createUser: String? = "",
    @ColumnInfo(name = "UAStatus") @SerializedName("UAStatus")
    var uaStatus: Int? = 0,
    @ColumnInfo(name = "AssessDate") @SerializedName("AssessDate")
    var assessDate : Date? = null,
    @ColumnInfo(name = "AssessUser") @SerializedName("AssessUser")
    var AassessUser : String? = "",
    @ColumnInfo(name = "NumberCheck") @SerializedName("NumberCheck")
    var numberCheck : Int? = 0
){
    fun getUAStatusName() : String{
        when (uaStatus){
            REGISTER->{
                return "Đang đăng kí"
            }
            JOIN ->{
                return "Đã tham gia"
            }
            REJECT ->{
                return "Từ chối"
            }
            else ->{
                return "Chưa tham gia"
            }
        }

    }

    fun isRegister() = uaStatus == REGISTER

    fun isReject() = uaStatus == REJECT

    fun isJoin() = uaStatus == JOIN

    fun isGuest() = uaStatus == GUEST

    fun proofAvailable() = isJoin() || isRegister()

    fun registerAvailable() = isGuest()


    companion object{
        val REGISTER = 1
        val JOIN: Int = 2
        val REJECT = 0
        val GUEST = -1
    }
}