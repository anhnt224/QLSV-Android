package com.emglab.qlsv.models.entity

import com.google.gson.annotations.SerializedName

class UserCriteriaDetail (
    @SerializedName("UCId")
    var id: Int = 0,
    @SerializedName("CId")
    var cID: Int = 0,
    @SerializedName("CName")
    var name: String = "",
    @SerializedName("UCDes")
    var description: String = "",
    @SerializedName("UCPoint")
    var sPoint: Int = 0,
    @SerializedName("TCPoint")
    var tPoint: Int = 0,
    @SerializedName("CMaxPoint")
    var maxPoint: Int = 0,
    @SerializedName("Proof")
    var proof: Int = 0,
    @SerializedName("ProofText")
    var proofText: Int = 0,
    @SerializedName("AssessUser")
    var assessUser: String = "",
    @SerializedName("UserCriteriaActivityLst")
    var userCriteriaActivities: ArrayList<UserCriteriaActivity>
){
    fun needProof(): Boolean{
        return proof == 1
    }

    fun hasProof(): Boolean{
        return userCriteriaActivities.isNotEmpty()
    }

    fun isProofText(): Boolean{
        return proofText == 1
    }

    fun getNumberProof(): String {
        if(userCriteriaActivities.isNotEmpty()){
            return "Minh chứng hoạt động: ${userCriteriaActivities.size}MC"
        }
        return "Minh chứng hoạt động"
    }

    fun getProofStr(): String{
        if(description == ""){
            return "Khác(SV tự khai)"
        }
        return "Khác: $description"
    }

    fun updateSPoint(){
        sPoint = if(userCriteriaActivities.size == 0 && description == ""){
            0
        }else{
            maxPoint
        }
    }

    fun canMark(): Boolean{
        return hasProof() && sPoint > 0
    }

    fun getTeacherScore(): String{
        return "$tPoint/$maxPoint"
    }

    fun isMaxTeacherScore(): Boolean {
        return tPoint >= maxPoint
    }

    fun isEmptyTeacherScore(): Boolean {
        return tPoint <= 0
    }

}