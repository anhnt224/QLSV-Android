package com.emglab.qlsv.models.res.activity


import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class CTSVGetActivityByIdRes(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("NumberPage")
    val numberPage: Int?,
    @SerializedName("Activities")
    val activities : List<Activity>?
) : CTSVCap() {

//    data class Activity(
//        @ColumnInfo(name = "AId") @SerializedName("AId")
//        var id: Int = 0,
//        @ColumnInfo(name = "ACode") @SerializedName("ACode")
//        var code : String?,
//        @ColumnInfo(name = "AName") @SerializedName("AName")
//        var name : String?,
//        @ColumnInfo(name = "AType") @SerializedName("AType")
//        var type : String?,
//        @ColumnInfo(name = "ADesc") @SerializedName("ADesc")
//        var desc : String? = "",
//        @ColumnInfo(name = "StartTime") @SerializedName("StartTime")
//        var startTime : Date? ,
//        @ColumnInfo(name = "FinishTime") @SerializedName("FinishTime")
//        var finishTime : Date?,
//        @ColumnInfo(name = "APlace") @SerializedName("APlace")
//        var place : String?,
//        @ColumnInfo(name = "GId") @SerializedName("GId")
//        var gId : Int ?,
//        @ColumnInfo(name = "Data") @SerializedName("Data")
//        var data : String?,
//        @ColumnInfo(name = "CreateDate") @SerializedName("CreateDate")
//        var createDate : String?,
//        @ColumnInfo(name = "CreateUser") @SerializedName("CreateUser")
//        var createUser : String?,
//        @ColumnInfo(name = "AStatus") @SerializedName("AStatus")
//        var status : Int?,
//        @ColumnInfo(name = "ARefId") @SerializedName("ARefId")
//        var refId: String?,
//        @ColumnInfo(name = "ACriteriaLst") @SerializedName("ACriteriaLst")
//        var criteriaLst: String? ,
//        @ColumnInfo(name = "AGDesc") @SerializedName("AGDesc")
//        var aGDesc: String? ,
//        @ColumnInfo(name = "UserRole") @SerializedName("UserRole")
//        var userRole: Int?)
}