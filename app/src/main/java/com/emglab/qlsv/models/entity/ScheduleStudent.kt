package com.emglab.qlsv.models.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "ScheduleStudent")
class ScheduleStudent (
    @ColumnInfo(name = "UUID") @SerializedName("UUID")
    @PrimaryKey
    var uuid: String = "",
    @ColumnInfo(name = "SubjectId") @SerializedName("SubjectId")
    var id: String = "",
    @ColumnInfo(name = "SubjectName") @SerializedName("SubjectName")
    var name : String? = "",
    @ColumnInfo(name = "ClassID") @SerializedName("ClassID")
    var classId : String = "",
    @ColumnInfo(name = "TimeStart") @SerializedName("TimeStart")
    var timeStart : String? = "",
    @ColumnInfo(name = "TimeEnd") @SerializedName("TimeEnd")
    var timeEnd : String? = "",
    @ColumnInfo(name = "Week") @SerializedName("Week")
    var week : String? = "",
    @ColumnInfo(name = "Type") @SerializedName("Type")
    var type : String? = "",
    @ColumnInfo(name = "TypeSubject") @SerializedName("TypeSubject")
    var typeSubject : String = "",
    @ColumnInfo(name = "Tower") @SerializedName("Tower")
    var tower : String? = "",
    @ColumnInfo(name = "Room") @SerializedName("Room")
    var room : String? = "",
    @ColumnInfo(name = "DayOfWeek") @SerializedName("DayOfWeek")
    var dayOfWeek : String = "",
    @ColumnInfo(name = "Description") @SerializedName("Description")
    var description : String? = ""
){
    fun getTime() = "${timeStart} - ${timeEnd} (${week})"
}