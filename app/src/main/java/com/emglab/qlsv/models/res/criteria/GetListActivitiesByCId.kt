package com.emglab.qlsv.models.res.criteria

import com.emglab.qlsv.models.entity.UserCriteriaActivity
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetListActivitiesByCId  (
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("Activities")
    var activities: List<UserCriteriaActivity>
): CTSVCap()