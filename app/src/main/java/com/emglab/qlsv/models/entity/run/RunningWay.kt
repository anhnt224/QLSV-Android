package com.emglab.qlsv.models.entity.run

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.emglab.qlsv.extension.convertDateToStringDateTime
import com.emglab.qlsv.extension.toTimeQueryStr
import java.io.Serializable
import java.util.*

@Entity(tableName = "RunningWay")
class RunningWay (
    @PrimaryKey
    @ColumnInfo(name = "id")
    var id: String = "",
    @ColumnInfo(name = "timeStart")
    var timeStart: Long = 0,
    @ColumnInfo(name = "timeUpdated")
    var timeUpdated: Long = 0
): Serializable {
    fun getTimeStartStr(): String {
        if(timeStart == 0L){
            return ""
        }
        val dateStart = Date(timeStart)
        return dateStart.convertDateToStringDateTime()
    }

    fun getTimeStartReq(): String {
        if(timeStart == 0L){
            return ""
        }
        val dateStart = Date(timeStart)
        return dateStart.toTimeQueryStr()
    }

    fun getTimeEndReq(): String {
        if(timeUpdated == 0L){
            return ""
        }
        val dateEnd = Date(timeUpdated)
        return dateEnd.toTimeQueryStr()
    }
}