package com.emglab.qlsv.models.entity.run

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "RunData")
class RunData (
    @ColumnInfo(name = "ComIdInRoom")
    var comIdInRoom: String = "",
    @SerializedName("ComID") @ColumnInfo(name = "ComID")
    var competitionID: Int = 0,
    @SerializedName("ComName") @ColumnInfo(name = "ComName")
    var competitionName: String = "",
    @PrimaryKey
    @SerializedName("WayID") @ColumnInfo(name = "WayID")
    var wayID: String = "",
    @SerializedName("UserCode") @ColumnInfo(name = "UserCode")
    var userCode: String = "",
    @SerializedName("TimeStart") @ColumnInfo(name = "TimeStart")
    var timeStart: String = "",
    @SerializedName("TimeEnd") @ColumnInfo(name = "TimeEnd")
    var timeEnd: String = "",
    @SerializedName("Distance") @ColumnInfo(name = "Distance")
    var distance: Double = 0.0
)