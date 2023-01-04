package com.emglab.qlsv.models.entity

import com.google.gson.annotations.SerializedName
import java.lang.Double.parseDouble

class TrainingPoint (
    @SerializedName("Semester")
    var semester: String = "",
    @SerializedName("Point")
    var point: String = ""
){
    fun getPointFloat(): Float{
        var numeric = true
        var num: Float = 0f

        try {
            num = parseDouble(point).toFloat()
        } catch (e: NumberFormatException) {
            numeric = false
        }

        return if (numeric)
            num
        else
            0f
    }
}