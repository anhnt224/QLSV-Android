package com.emglab.qlsv.models.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.*

@Entity(tableName = "UserCriteriaActivity")
class UserCriteriaActivity(
    @PrimaryKey
    @ColumnInfo(name = "UCAId") @SerializedName("UCAId")
    var ucaId : Int = 0,
    @ColumnInfo(name = "CId") @SerializedName("CId")
    var cId : Int = 0,
    @ColumnInfo(name = "AId") @SerializedName("AId")
    var aId : Int = 0,
    @ColumnInfo(name = "CreateDate") @SerializedName("CreateDate")
    var createDate : Date? = null,
    @ColumnInfo(name = "CreateUser") @SerializedName("CreateUser")
    var createUser : String? = "",
    @ColumnInfo(name = "UCAStatus") @SerializedName("UCAStatus")
    var ucaStatus : Int? = 0,
    @SerializedName("StartTime")
    var startTime: Date? = null,
    @SerializedName("FinishTime")
    var finishTime: Date? = null,
    @SerializedName("AName")
    var name: String = ""


)