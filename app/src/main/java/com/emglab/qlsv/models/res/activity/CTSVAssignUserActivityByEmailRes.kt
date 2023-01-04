package com.emglab.qlsv.models.res.activity


import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class CTSVAssignUserActivityByEmailRes(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?
) : CTSVCap()