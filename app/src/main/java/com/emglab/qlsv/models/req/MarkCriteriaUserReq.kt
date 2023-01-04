package com.emglab.qlsv.models.req

import com.emglab.qlsv.models.entity.CriteriaType
import com.google.gson.annotations.SerializedName

class MarkCriteriaUserReq (
    @SerializedName("UserName")
    var userName: String = "",
    @SerializedName("UserCode")
    var userCode: String = "",
    @SerializedName("TokenCode")
    var token: String = "",
    @SerializedName("Semester")
    var semester: String,
    @SerializedName("CriteriaTypeDetailsLst")
    var criteriaTypes: List<CriteriaType>
)