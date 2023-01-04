package com.emglab.qlsv.models.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.*

@Entity(tableName = "UserCheckInActivity")
class UserCheckInActivity(
    @PrimaryKey
    @ColumnInfo(name = "UACId") @SerializedName("UACId")
    var uaCId: Int = 0,
    @ColumnInfo(name = "UserName") @SerializedName("UserName")
    var userName: String? = "",
    @ColumnInfo(name = "UserCode") @SerializedName("UserCode")
    var userCode: String? = "",
    @ColumnInfo(name = "AId") @SerializedName("AId")
    var aId: Int? = 0,
    @ColumnInfo(name = "CheckInTime") @SerializedName("CheckInTime")
    var checkInTime: Date? = null,
    @ColumnInfo(name = "CheckInAddress") @SerializedName("CheckInAddress")
    var checkInAddress: String? = "",
    @ColumnInfo(name = "Longitude") @SerializedName("Longitude")
    var longitude: Double? = 0.0,
    @ColumnInfo(name = "Latitude") @SerializedName("Latitude")
    var latitude: Double? = 0.0,
    @ColumnInfo(name = "UACStatus") @SerializedName("UACStatus")
    var uaCStatus: Int? = 0
)