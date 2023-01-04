package com.emglab.qlsv.models.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.*

@Entity(tableName = "UserCriteriaPoint")
class UserCriteriaPoint(
    @PrimaryKey
    @ColumnInfo(name = "UCPId") @SerializedName("UCPId")
    var ucpId : Int = 0,
    @ColumnInfo(name = "CId") @SerializedName("CId")
    var cId : Int = 0,
    @ColumnInfo(name = "CreateUser") @SerializedName("CreateUser")
    var createUser : String? = "",
    @ColumnInfo(name = "CreateDate") @SerializedName("CreateDate")
    var createDate : Date? = null,
    @ColumnInfo(name = "UCPDesc") @SerializedName("UCPDesc")
    var ucpDesc : String? = "",
    @ColumnInfo(name = "UCPoint") @SerializedName("UCPoint")
    var ucPoint : Int? = 0,
    @ColumnInfo(name = "Semester") @SerializedName("Semester")
    var semester : String? = ""
)