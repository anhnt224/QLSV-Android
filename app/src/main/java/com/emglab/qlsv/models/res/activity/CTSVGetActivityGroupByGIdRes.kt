package com.emglab.qlsv.models.res.activity


import com.emglab.qlsv.models.entity.ActivityGroup
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class CTSVGetActivityGroupByGIdRes(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("ActivityGroupLst")
    val activityGroupLst : List<ActivityGroup>?
) : CTSVCap()