package com.emglab.qlsv.models.entity

import android.annotation.SuppressLint
import com.emglab.qlsv.extension.convertDateToStringDateTime
import com.google.gson.annotations.SerializedName
import java.text.SimpleDateFormat
import java.util.*

class Note (
    @SerializedName("RowID")
    var id: Int = 0,
    @SerializedName("CreateID")
    var createID: String = "",
    @SerializedName("CreateMail")
    var createEmail: String = "",
    @SerializedName("Comment")
    var note: String = "",
    @SerializedName("StudentID")
    var studentID: String = "",
    @SerializedName("CreateTime")
    var timeCreated: Date? = null
){
    fun getTimeCreatedStr(): String {
        if(timeCreated == null){
            return " "
        }
        return timeCreated!!.convertDateToStringDateTime()
    }

    @SuppressLint("SimpleDateFormat")
    fun getMonthCreated(): String {
        if(timeCreated == null){
            return " "
        }
        val dateFormat = SimpleDateFormat("MM")
        return "TH ${dateFormat.format(timeCreated!!)}"
    }

    @SuppressLint("SimpleDateFormat")
    fun getDateCreated(): String {
        if(timeCreated == null){
            return " "
        }
        val dateFormat = SimpleDateFormat("dd")
        return dateFormat.format(timeCreated!!)
    }
}