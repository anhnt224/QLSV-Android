package com.emglab.qlsv.models.res.activity


import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class CTSVGetActivityByUserRes(
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("Activities")
    val activities : List<Activity>?,
    @SerializedName("NumberPage")
    val numberPage: Int?
) : CTSVCap()