package com.emglab.qlsv.models.entity

import androidx.room.*
import com.emglab.qlsv.extension.convertDateToStringDateTime
import com.emglab.qlsv.extension.converDateToStringddMMHHmm
import com.google.gson.annotations.SerializedName
import java.util.*
import com.emglab.qlsv.R
import com.emglab.qlsv.extension.getDateStr
import com.emglab.qlsv.extension.getMonthDayStr

@Entity(tableName = "Activity")
class Activity(
    @ColumnInfo(name = "AId") @SerializedName("AId")
    @PrimaryKey
    var id: Int = 0,
    @ColumnInfo(name = "ACode") @SerializedName("ACode")
    var code : String? = "",
    @ColumnInfo(name = "AName") @SerializedName("AName")
    var name : String?= "",
    @ColumnInfo(name = "AType") @SerializedName("AType")
    var type : String?= "",
    @ColumnInfo(name = "ADesc") @SerializedName("ADesc")
    var desc : String? = "",
    @ColumnInfo(name = "StartTime") @SerializedName("StartTime")
    var startTime : Date? = null,
    @ColumnInfo(name = "FinishTime") @SerializedName("FinishTime")
    var finishTime : Date? = null,
    @ColumnInfo(name = "APlace") @SerializedName("APlace")
    var place : String? = "",
    @ColumnInfo(name = "GId") @SerializedName("GId")
    var gId : Int? = 0,
    @ColumnInfo(name = "GName") @SerializedName("GName")
    var gName : String? = "",
    @ColumnInfo(name = "Data") @SerializedName("Data")
    var data : String? = "",
    @ColumnInfo(name = "CreateDate") @SerializedName("CreateDate")
    var createDate : String? = "",
    @ColumnInfo(name = "CreateUser") @SerializedName("CreateUser")
    var createUser : String? = "",
    @ColumnInfo(name = "AStatus") @SerializedName("AStatus")
    var status : Int? = 0,
    @ColumnInfo(name = "ARefId") @SerializedName("ARefId")
    var refId: String? = "",
    @ColumnInfo(name = "CriteriaLst") @SerializedName("CriteriaLst")
    @Ignore var criteriaLst: List<Criteria>? = null,
    @ColumnInfo(name = "AGId") @SerializedName("AGId")
    var aGId: Int? = 0,
    @ColumnInfo(name = "AGDesc") @SerializedName("AGDesc")
    var aGDesc: String? = "",

    @ColumnInfo(name = "UserRole") @SerializedName("UserRole")
    var userRole: Int? = 0,
    @ColumnInfo(name = "ParentAId") @SerializedName("ParentAId")
    var parentAId: Int? = 0,
    @ColumnInfo(name = "UAStatus") @SerializedName("UAStatus")
    var uAStatus: Int? = 0,
    @SerializedName("Deadline")
    var deadline: Date? = null,
    @SerializedName("Avatar")
    var linkImage: String = ""
){

    fun timeStartAndFinishText() : String{
        val startTime = this.startTime!!.converDateToStringddMMHHmm()
        val finishTime = this.finishTime!!.converDateToStringddMMHHmm()
        val dayOfStartTime = startTime.substring(0,5)
        val dayOfFinishTime = finishTime.substring(0,5)
        if (dayOfStartTime == dayOfFinishTime)
            return "${startTime.substring(5)} - ${finishTime.substring(5)} ${dayOfStartTime}"
        return "$startTime - $finishTime"
    }

    fun getNameDayOfWeek() : String{
        val calendar = Calendar.getInstance()
        calendar.time = Date(startTime!!.time)
        val date =  calendar.get(Calendar.DAY_OF_WEEK).toString()
        if (date == "1"){
            return "CN"
        }
        return "TH $date"
    }

    fun getNameDayOfMonth() : String{
        val calendar = Calendar.getInstance()
        calendar.time = Date(startTime!!.time)
        return calendar.get(Calendar.DAY_OF_MONTH).toString()
    }

    fun getUAStatusString(): String {
        return when(uAStatus){
            1 -> "Đã đăng kí"
            2 -> "Đã tham gia"
            else -> ""
        }
    }

    fun getUAStatusColor(): String {
        return when(uAStatus){
            1 -> "#FFFFB300"
            2 -> "#FF43A047"
            else -> "#FFFDD835"
        }
    }

    fun getDeadlineStr(): String {
        if (deadline != null){
            return deadline!!.convertDateToStringDateTime()
        }
        return ""
    }

    fun getTimeStatus(): String {
        if (startTime == null || finishTime == null){
            return "--"
        }
        return when {
            Date() < startTime -> {
                "- Sắp diễn ra -"
            }
            Date() <= finishTime -> {
                "- Đang diễn ra -"
            }
            else -> {
                "- Đã kết thúc -"
            }
        }
    }

    fun getTimeStatusColor(): Int {
        if (startTime == null || finishTime == null){
            return R.color.half_black
        }
        return when {
            Date() < startTime -> {
                R.color.pending
            }
            Date() <= finishTime -> {
                R.color.done
            }
            else -> {
                R.color.half_black
            }
        }
    }

    fun getTimeStr(): String {
        if (startTime == null || finishTime == null){
            return ""
        }

        return "${startTime!!.getMonthDayStr()} - ${finishTime!!.getDateStr()}"
    }


}