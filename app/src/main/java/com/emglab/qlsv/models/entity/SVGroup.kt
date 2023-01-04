package com.emglab.qlsv.models.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.*

@Entity(tableName = "SVGroup")
class SVGroup(
    @ColumnInfo(name = "ParentGId") @SerializedName("ParentGId")
    var parentGId : Int? = null,
    @ColumnInfo(name = "GId") @SerializedName("GId")
    @PrimaryKey
    var gId : Int = 0,
    @ColumnInfo(name = "GCode") @SerializedName("GCode")
    var gCode : String? = "",
    @ColumnInfo(name = "GName") @SerializedName("GName")
    var gName : String? = "",
    @ColumnInfo(name = "GType") @SerializedName("GType")
    var gType : String?= "" ,
    @ColumnInfo(name = "StartTime") @SerializedName("StartTime")
    var startTime : Date? = null ,
    @ColumnInfo(name = "FinishTime") @SerializedName("FinishTime")
    var finishTime : Date? = null ,
    @ColumnInfo(name = "CreateDate") @SerializedName("CreateDate")
    var createDate : Date? = null,
    @ColumnInfo(name = "CreateUser") @SerializedName("CreateUser")
    var createUser : String?= "" ,
    @ColumnInfo(name = "GStatus") @SerializedName("GStatus")
    var gStatus: Int? = 0 ,
    @ColumnInfo(name = "GRefId") @SerializedName("GRefId")
    var gRefId : String?= "",
    @ColumnInfo(name = "GCriteriaLst") @SerializedName("GCriteriaLst")
    var gCriteriaLst : String?= "",
    @ColumnInfo(name = "AGLst") @SerializedName("AGLst")
    @Ignore var agLst : String?= "",
    @ColumnInfo(name = "UserRole") @SerializedName("UserRole")
    @Ignore var userRole: Int? = 0,
    @ColumnInfo(name = "UUStatus") @SerializedName("UUStatus")
    @Ignore var uuStatus : Int?= 0
){
//    companion object {
//        private val MANAGER = 1
//        private val ACTIVITY_MANAGER = 3
//        private val GROUP_MANAGER = 4
//        private val MEMBER = 2
//
//    }
//
//    fun isManager() = userRole == 1
//
//    fun isActivityManager() = userRole == 3
//
//    fun isGroupManager() = userRole == 4
//
//    fun isMember() = userRole == 2
//
//    fun userRoleText(){
//
//    }
//    when(svGroup.userRole){
//        0->{
//
//        }
//        1->{itemView.txtUserRole.setText("Quản lý")
//            itemView.txtUserRole.setTextColor(Color.RED)}
//        2->{
//            if (svGroup.uuStatus == 0){
//                itemView.txtUserRole.setText("Đang xin vào")
//                itemView.txtUserRole.setTextColor(Color.RED)
//            }
//        }
//        3->{itemView.txtUserRole.setText("Quản lý hoạt động")
//            itemView.txtUserRole.setTextColor(Color.RED)}
//        4->{itemView.txtUserRole.setText("Quản lý tổ chức")
//            itemView.txtUserRole.setTextColor(Color.RED)}
//
//    }
}