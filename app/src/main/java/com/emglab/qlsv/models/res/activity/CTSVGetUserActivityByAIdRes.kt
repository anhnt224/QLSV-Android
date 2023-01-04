package com.emglab.qlsv.models.res.activity


import com.emglab.qlsv.models.entity.UserActivity

import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class CTSVGetUserActivityByAIdRes(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("NumberPage")
    val numberPage: Int?,
    @SerializedName("UserActivityLst")
    val userActivityLst : List<UserActivity>?
) : CTSVCap()