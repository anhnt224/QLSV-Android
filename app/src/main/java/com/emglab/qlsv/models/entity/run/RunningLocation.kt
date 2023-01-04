package com.emglab.qlsv.models.entity.run

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "RunningLocation")
class RunningLocation(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "latitude")
    var latitude: Double = 0.0,
    @ColumnInfo(name = "longitude")
    var longitude: Double = 0.0,
    @ColumnInfo(name = "wayID")
    var wayID: String = "",
    @ColumnInfo(name = "index")
    var index: Int = 0,
    @ColumnInfo(name = "timeUpdated")
    var timeUpdated: Long = 0
): Serializable