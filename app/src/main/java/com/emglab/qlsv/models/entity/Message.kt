package com.emglab.qlsv.models.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Message")
class Message(
    @ColumnInfo(name = "Subject") @SerializedName("Subject")
    var subject: String? = "",
    @ColumnInfo(name = "Message") @SerializedName("Message")
    var message: String? = "",
    @ColumnInfo(name = "TimeSent") @SerializedName("TimeSent")
    @PrimaryKey
    var timeSent: String = ""
){
    fun getTimeString() = timeSent
}