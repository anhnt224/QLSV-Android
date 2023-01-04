package com.emglab.qlsv.models.entity.run

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.emglab.qlsv.extension.*
import com.google.gson.annotations.SerializedName
import java.util.*

@Entity(tableName = "RunResult")
class RunResult(
    @SerializedName("ComID") @ColumnInfo(name = "ComID")
    var competitionID: Int = 0,
    @PrimaryKey
    @SerializedName("WayID") @ColumnInfo(name = "WayID")
    var wayID: String = "",
    @SerializedName("UserCode") @ColumnInfo(name = "UserCode")
    var userCode: String = "",
    @SerializedName("TimeStart") @ColumnInfo(name = "TimeStart")
    var timeStart: Date,
    @SerializedName("TimeEnd") @ColumnInfo(name = "TimeEnd")
    var timeEnd: Date,
    @SerializedName("Distance") @ColumnInfo(name = "Distance")
    var distance: Double = 0.0,
    @SerializedName("TimeCreate") @ColumnInfo(name = "TimeCreate")
    var timeCreate: Date,
    @SerializedName("RCStatus") @ColumnInfo(name = "RCStatus")
    var status: Int = 0
){
    fun getTime(): String{
        val milliSeconds = timeEnd.time - timeStart.time

        val hours = (milliSeconds / 1000) / 3600
        val minute = (milliSeconds / 1000) % 3600 / 60
        val seconds = (milliSeconds / 1000) % 3600 % 60

        return String.format("%02d:%02d:%02d", hours, minute, seconds)
    }

    fun getDistanceStr(): String {
        if(distance < 100){
            return String.format("%.0f m", distance)
        }
        return String.format("%.2f km", distance/1000)
    }

    fun getDistanceUnit(): String {
        if(distance < 100){
            return "m"
        }
        return "km"
    }

    fun getDateStartStr(): String {
        return timeStart.toTimeStr() + " - " + timeStart.toDateStr()
    }

    fun getTimeStartStr(): String {
        return timeStart.toTimeStr()
    }

    /**
     * DAY_OF_WEEK: the resulting number ranges from 1(Sunday) to 7(Saturday)
     */
    fun timeStartToDateOfWeek(): String{
        val cal = Calendar.getInstance()
        cal.time = timeStart
        val daysOfWeek = listOf<String>("CN","T2", "T3", "T4", "T5", "T6", "T7")
        return daysOfWeek[cal.get(Calendar.DAY_OF_WEEK) - 1]
    }

    fun getPace(): String{
        val s = (timeEnd.time - timeStart.time) / 1000
        if(distance == 0.0){
            return "--:--"
        }
        val pace = (s / (distance / 1000)).toInt()

        val hours = pace / 3600
        val minute = pace % 3600 / 60
        val seconds = pace % 3600 % 60

        return if (hours == 0){
            String.format("%02d:%02d", minute, seconds) + "/km"
        }else{
            String.format("%02d:%02d:%02d", hours, minute, seconds) + "/km"
        }
    }

    fun isValid(): Boolean {
        val s = (timeEnd.time - timeStart.time) / 1000
        val pace = (s / (distance / 1000)).toInt()
        //pace valid between 4 - 14 min
        if (pace in (4 * 60)..(14 * 60)) {
            return true
        }
        return false
    }
}