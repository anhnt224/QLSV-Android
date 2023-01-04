package com.emglab.qlsv.models.res.activity


import com.emglab.qlsv.models.entity.UserCheckInActivity
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class CTSVGetUserCheckInActivityRes(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("UserCheckInActivityLst")
    val userCheckInActivityLst : List<UserCheckInActivity>?
) : CTSVCap()