package com.emglab.qlsv.models.entity

import com.google.gson.annotations.SerializedName

class CriteriaGroup (
    @SerializedName("CGId")
    var id: Int = 0,
    @SerializedName("CGName")
    var name: String = "",
    @SerializedName("CGPoint")
    var sPoint: Int = 0,
    @SerializedName("TCGPoint")
    var tPoint: Int = 0,
    @SerializedName("CGMaxPoint")
    var maxPoint: Int = 0,
    @SerializedName("UserCriteriaDetailsLst")
    var userCriteriaDetails: List<UserCriteriaDetail>
){
    fun getStudentPoint(): Int{
        var sPoint = 0
        userCriteriaDetails.forEach {
            sPoint += it.sPoint
        }
        return sPoint
    }
}