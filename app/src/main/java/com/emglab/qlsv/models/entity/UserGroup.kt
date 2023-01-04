package com.emglab.qlsv.models.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "UserGroup")
class UserGroup(
    @PrimaryKey
    @ColumnInfo(name = "UGId") @SerializedName("UGId")
    var ugId : Int = 0,
    @ColumnInfo(name = "UserCode") @SerializedName("UserCode")
    var userCode : String? = "",
    @ColumnInfo(name = "GId") @SerializedName("GId")
    var gId : Int? = 0,
    @ColumnInfo(name = "UserRole") @SerializedName("UserRole")
    var userRole : Int? = 0,
    @ColumnInfo(name = "Reason") @SerializedName("Reason")
    var reason: String? = "",
    @ColumnInfo(name = "CreateDate") @SerializedName("CreateDate")
    var createDate: String? = "",
    @ColumnInfo(name = "CreateUser") @SerializedName("CreateUser")
    var createUser: String? = "",

    @ColumnInfo(name = "FullName") @SerializedName("FullName")
    @Ignore var fullName: String? = "",
    @ColumnInfo(name = "Email") @SerializedName("Email")
    @Ignore var email: String? = "",
    @ColumnInfo(name = "Mobile") @SerializedName("Mobile")
    @Ignore var mobile: String? = "",
    @ColumnInfo(name = "UUStatus") @SerializedName("UUStatus")
    @Ignore var uuStatus: String? = ""

)