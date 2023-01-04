package com.emglab.qlsv.models.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Student (
    @SerializedName("StudentId")
    var id: String = "",
    @SerializedName("StudentName")
    var name: String = "",
    @SerializedName("Email")
    var email: String = "",
    @SerializedName("TC_All")
    var tcAll: String = "",
    @SerializedName("TC_Due")
    var tcDue: String = "",
    @SerializedName("LevelWarning")
    var warningLevel: String = "",
    @SerializedName("CPA")
    var cpa: String = "",
    @SerializedName("Point")
    var score: Int = 0,
    @SerializedName("TPoint")
    var tScore: Int = 0,
    @SerializedName("FatherName")
    var fatherName: String = "",
    @SerializedName("FatherPhone")
    var fatherPhone: String = "",
    @SerializedName("MotherName")
    var motherName: String = "",
    @SerializedName("MotherPhone")
    var motherPhone: String = ""
): Serializable{
    fun getStudentScore(): String{
        return "SV chấm: $score"
    }

    fun getTScoreStr(): String{
        return "GV chấm: $tScore"
    }

    fun getFirstCharInName(): String{

        val arr = name.trim().split(" ")
        if(arr.isNotEmpty()){
            if(arr.last().isNotEmpty()){
                return arr.last().first().toString()
            }

            return ""
        }
        return ""
    }

    fun isScored(): Boolean{
        if (tScore > 0){
            return true
        }
        return false
    }

    fun isNotScoredYet(): Boolean{
        if (tScore == 0){
            return true
        }
        return false
    }

    fun isDifferenceScored(): Boolean{
        if (tScore != score){
            return true
        }
        return false
    }

}
