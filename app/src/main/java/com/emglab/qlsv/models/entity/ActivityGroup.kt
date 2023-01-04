package com.emglab.qlsv.models.entity

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

class ActivityGroup(
    @ColumnInfo(name = "AGId") @SerializedName("AGId")
    var agId : Int = 0,
    @ColumnInfo(name = "AGDesc") @SerializedName("AGDesc")
    var agDesc : String = ""
)