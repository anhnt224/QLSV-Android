package com.emglab.qlsv.models.entity

import com.google.gson.annotations.SerializedName

class CriteriaType (
    @SerializedName("CTId")
    var id: Int = 0,
    @SerializedName("CTName")
    var name: String = "",
    @SerializedName("CTPoint")
    var sPoint: Int = 0,
    @SerializedName("TCTPoint")
    var tPoint: Int = 0,
    @SerializedName("CTMaxPoint")
    var maxPoint: Int = 0,
    @SerializedName("CriteriaGroupDetailsLst")
    var criteriaGroups: List<CriteriaGroup>
){
    fun getStudentPoint(): Int{
        var sPoint = 0
        criteriaGroups.forEach {criteriaGroup ->
            criteriaGroup.userCriteriaDetails.forEach {userCriteriaDetail ->
                sPoint += userCriteriaDetail.sPoint
            }
        }
        return sPoint
    }

    fun getTeacherScore(): Int{
        var score = 0
        criteriaGroups.forEach {criteriaGroup ->
            criteriaGroup.userCriteriaDetails.forEach {userCriteriaDetail ->
                score += userCriteriaDetail.tPoint
            }
        }
        return score
    }

    fun isActivityInvalid(activity: UserCriteriaActivity): Boolean{
        criteriaGroups.forEach {criteriaGroup ->
            criteriaGroup.userCriteriaDetails.forEach {userCriteriaDetail ->
                if (userCriteriaDetail.userCriteriaActivities.any {
                        it.aId == activity.aId
                    }){
                    return true
                }
            }
        }
        return false
    }
}