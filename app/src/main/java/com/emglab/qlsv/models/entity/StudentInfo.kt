package com.emglab.qlsv.models.entity

import com.google.gson.annotations.SerializedName
import java.lang.Double

class StudentInfo (
    @SerializedName("StudentId")
    var id: String = "",
    @SerializedName("StudentName")
    var name: String = "",
    @SerializedName("Birthday")
    var birthDay: String = "",
    @SerializedName("Email")
    var email: String = "",
    @SerializedName("LevelProgram")
    var programType: String = "",
    @SerializedName("Sex")
    var sex: String = "",
    @SerializedName("StudyInfo")
    var status: String = "",
    @SerializedName("Faculty")
    var faculty: String = "",
    @SerializedName("ClassName")
    var className: String = "",
    @SerializedName("YearEntry")
    var yearEntry: String = "",
    @SerializedName("TC_All")
    var sumTC: String = "",
    @SerializedName("TC_Due")
    var tcDue: String = "",
    @SerializedName("LevelStudent")
    var levelStudent: String = "",
    @SerializedName("LevelWarning")
    var levelWarning: String = "",
    @SerializedName("Address")
    var address: String = "",
    @SerializedName("FatherName")
    var fatherName: String = "",
    @SerializedName("FatherPhone")
    var fatherPhone: String = "",
    @SerializedName("MotherName")
    var motherName: String = "",
    @SerializedName("MotherPhone")
    var motherPhone: String = "",
    @SerializedName("CriteriaPointSemsterLst")
    var criteriaScore: List<CriteriaScore> = listOf(),
    @SerializedName("StudentTranscriptLst")
    var studentTranscripts: List<StudentTranscript> = listOf()
){
    fun getCurrentCPA(): String{
        return if(studentTranscripts.isNullOrEmpty()){
            ""
        }else{
            studentTranscripts.last().cpa
        }
    }
}

class CriteriaScore (
    @SerializedName("Semester")
    var semester: String = "",
    @SerializedName("Point")
    var score: String = ""
){
    fun getScoreFloat(): Float{
        var numeric = true
        var num = 0f

        try {
            num = Double.parseDouble(score).toFloat()
        } catch (e: NumberFormatException) {
            numeric = false
        }

        return if (numeric)
            num
        else
            0f
    }
}

class StudentTranscript (
    @SerializedName("GPA")
    var gpa: String = "",
    @SerializedName("CPA")
    var cpa: String = "",
    @SerializedName("NumberQ")
    var numberQ: String = "",
    @SerializedName("NumberTL")
    var numberTL: String = "",
    @SerializedName("NumberN")
    var numberN: String = "",
    @SerializedName("NumberDK")
    var numberDK: String = "",
    @SerializedName("StudentLevel")
    var studentLevel: String = "",
    @SerializedName("WaringLevel")
    var warningLevel: String,
    @SerializedName("Session")
    var session: String = ""
)