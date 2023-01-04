package com.emglab.qlsv.models.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Timetable")
class Subject (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,
    @ColumnInfo(name = "SubjectName") @SerializedName("SubjectName")
    var name: String = "",
    @ColumnInfo(name = "ClassID") @SerializedName("ClassID")
    var classID: String = "",
    @ColumnInfo(name = "TimeStart") @SerializedName("TimeStart")
    var timeStart: String = "",
    @ColumnInfo(name = "TimeEnd") @SerializedName("TimeEnd")
    var timeEnd: String = "",
    @ColumnInfo(name = "Week")  @SerializedName("Week")
    var week: String = "",
    @ColumnInfo(name = "TypeSubject") @SerializedName("TypeSubject")
    var type: String = "",
    @ColumnInfo(name = "Tower") @SerializedName("Tower")
    var tower: String = "",
    @ColumnInfo(name = "Room") @SerializedName("Room")
    var room: String = "",
    @ColumnInfo(name = "DayOfWeek") @SerializedName("DayOfWeek")
    var dayOfWeek: String = ""
){
    fun getDay(): Int{
        return when(dayOfWeek){
            "Thứ 2" -> 0
            "Thứ 3" -> 1
            "Thứ 4" -> 2
            "Thứ 5" -> 3
            "Thứ 6" -> 4
            "Thứ 7" -> 5
            else -> 6
        }
    }

    fun getTime(): String{
        val timeStartArr = timeStart.split("h")
        val timeEndArr = timeEnd.split("h")
        return if(timeStartArr.size == 2 && timeEndArr.size == 2){
            "${timeStartArr[0]}:${timeStartArr[1]} - ${timeEndArr[0]}:${timeEndArr[1]}"
        }else{
            ""
        }
    }

    fun getRoomStr(): String {
       return "$tower-$room"
    }

    fun getTitle(): String{
        return "[$classID] $name"
    }

    fun getWeeks(): List<Int>{
        if(week.isEmpty()){
            return listOf()
        }

        val out: ArrayList<Int> = arrayListOf()
        val weekArray = week.split(",")
        weekArray.forEach{weekItem ->
            val weekInt = weekItem.toIntOrNull()
            if (weekInt != null){
                out.add(weekInt)
            }else{
                out.addAll(getWeeksFromWeekRangeString(weekItem))
            }
        }
        return out.toList()
    }

    private fun getWeeksFromWeekRangeString(weekStr: String): List<Int>{
        if(weekStr.length < 3 || !weekStr.contains("-")){
            return listOf()
        }

        val weekStrArr = weekStr.split( "-")
        return if(weekStrArr.size != 2){
            listOf()
        }else{
            val startWeek = weekStrArr[0].toInt()
            val endWeek = weekStrArr[1].toInt()
            if(startWeek >= endWeek){
                listOf()
            }else{
                (startWeek..endWeek).toList()
            }
        }
    }
}