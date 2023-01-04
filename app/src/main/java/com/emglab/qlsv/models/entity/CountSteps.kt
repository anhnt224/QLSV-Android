package com.emglab.qlsv.models.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "countSteps")
class CountSteps(
    @PrimaryKey
    var id : String = "",
    var steps: Int = 0,
    var timer: String? = "",
    var date :  Date?= Date()
)
