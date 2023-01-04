package com.emglab.qlsv.models.res.group

import com.emglab.qlsv.models.entity.SVGroup
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class CTSVGetSVGroupRes(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("NumberPage")
    val numberPage: Int?,
    @SerializedName("SVGroups")
    val svGroups : List<SVGroup>?
) : CTSVCap(){
//    data class SVGroup(
//        @ColumnInfo(name = "GId") @SerializedName("GId")
//        var gId : Int = 0,
//        @ColumnInfo(name = "GCode") @SerializedName("GCode")
//        var gCode : String? ,
//        @ColumnInfo(name = "GName") @SerializedName("GName")
//        var gName : String? ,
//        @ColumnInfo(name = "GType") @SerializedName("GType")
//        var gType : String? ,
//        @ColumnInfo(name = "StartTime") @SerializedName("StartTime")
//        var startTime : Date? ,
//        @ColumnInfo(name = "FinishTime") @SerializedName("FinishTime")
//        var finishTime : Date? ,
//        @ColumnInfo(name = "CreateDate") @SerializedName("CreateDate")
//        var createDate : Date? ,
//        @ColumnInfo(name = "CreateUser") @SerializedName("CreateUser")
//        var createUser : String? ,
//        @ColumnInfo(name = "GStatus") @SerializedName("GStatus")
//        var gStatus: Int? ,
//        @ColumnInfo(name = "UserRole") @SerializedName("UserRole")
//        var userRole: Int? ,
//        @ColumnInfo(name = "UUStatus") @SerializedName("UUStatus")
//        var uuStatus : Int?,
//        @ColumnInfo(name = "GRefId") @SerializedName("GRefId")
//        var gRefId : String?,
//        @ColumnInfo(name = "GCriteriaLst") @SerializedName("GCriteriaLst")
//        var gCriteriaLst : String?,
//        @ColumnInfo(name = "AGLst") @SerializedName("AGLst")
//        var agLst : String?
//
//    )
}