package com.emglab.qlsv.models.entity

import android.os.Build
import android.text.Html
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

class Job (
    @SerializedName("DocumentId")
    var id: Int = 0,
    @SerializedName("CompanyID")
    var companyID: Int = 0,
    @SerializedName("CompanyName")
    var companyName: String = "",
    @SerializedName("Title")
    var title: String = "",
    @SerializedName("WorkPosition")
    var workPosition: String = "",
    @SerializedName("WorkType")
    var workType: String = "",
    @SerializedName("AmountType")
    var salary: String = "",
    @SerializedName("DegreeRequire")
    var degreeRequire: String = "",
    @SerializedName("CareerRequire")
    var careerRequire: String = "",
    @SerializedName("SkillCompulsory")
    var skillCompulsory: String = "",
    @SerializedName("WorkDescription")
    var workDescription: String = "",
    @SerializedName("Benefit")
    var benefit: String = "",
    @SerializedName("ResumeRequire")
    var resumseRequire: String = "",
    @SerializedName("Deadline")
    var deadlin: String = "",
    @SerializedName("Language")
    var language: String = "",
    @SerializedName("ContactPhone")
    var contactPhone: String = "",
    @SerializedName("ContactName")
    var contactName: String = "",
    @SerializedName("ContactEmail")
    var contactEmail: String = "",
    @SerializedName("Status")
    var status: Int = 0,
    @SerializedName("CreateId")
    var createID: String = "",
    @SerializedName("WorkAddress")
    var workAddress: String = "",
    @SerializedName("WorkRequire")
    var workRequire: String = "",
    @SerializedName("SexRequire")
    var sexRequire: String = "",
    @SerializedName("WorkExperience")
    var workExperience: String = "",
    @SerializedName("NumberCandidate")
    var numberCandidate: Int = 0,
    @SerializedName("StatusApply")
    var statusApply: Int = 0,
    @SerializedName("Expired")
    var expired : Int = 0,
    @SerializedName("QuantityCandidate")
    var quantityCandidate: Int = 0,
    @SerializedName("TimeApply")
    var timeApply: String = ""
): Serializable {
    fun isExpired(): Boolean {
        return expired == 1
    }

    fun getStatusApply(): String{
        return when(statusApply){
            1 -> "M???i t???o"
            2 -> "Ch??? duy???t"
            3 -> "Ph?? duy???t"
            0 -> "T??? ch???i"
            else -> ""
        }
    }

    fun getDeadline(): String{
        val parser = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale("vi_VN"))
        try {
            val date = parser.parse(deadlin)
            if(date != null){
                val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale("vi_VN"))
                return "H???n ????ng k??: ${dateFormat.format(date)}"
            }
            return "H???n ????ng k??: $deadlin"
        }catch (e: Exception){
            return "H???n ????ng k??: $deadlin"
        }
    }

    fun getDateTimeApply(): String{
        val parser = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale("vi_VN"))
        try {
            val date = parser.parse(timeApply)
            if(date != null){
                val dateFormat = SimpleDateFormat("HH:mm dd-MM-yyyy", Locale("vi_VN"))
                return "${dateFormat.format(date)}"
            }
            return timeApply
        }catch (e: Exception){
            return timeApply
        }
    }

    fun getStatusApplyStr(): String {
        return when(statusApply){
            1 -> "M???i t???o"
            2 -> "??ang x??t duy???t"
            3 -> "???????c ph?? duy???t"
            0 -> "T??? ch???i"
            else -> ""
        }
    }

    fun getStatusColor(): String {
        return when(statusApply){
            1 -> "#FFB300"
            2 -> "#FFB300"
            3 -> "#43A047"
            0 -> "#F4511E"
            else -> "#FFB300"
        }
    }

    fun getQuantity(): String{
        return "$quantityCandidate"
    }

    fun getDescription(): String{
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(workDescription, Html.FROM_HTML_MODE_LEGACY).toString().trim()
        } else {
            Html.fromHtml(workDescription).toString().trim()
        }
    }

    fun getBenefitStr(): String {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(benefit, Html.FROM_HTML_MODE_LEGACY).toString().trim()
        } else {
            Html.fromHtml(benefit).toString().trim()
        }
    }

    fun getWorkRequireStr(): String {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(workRequire, Html.FROM_HTML_MODE_LEGACY).toString().trim()
        } else {
            Html.fromHtml(workRequire).toString().trim()
        }
    }
}