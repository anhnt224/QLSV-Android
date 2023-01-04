package com.emglab.qlsv.models.res.group

import com.emglab.qlsv.models.entity.SVGroup
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class CTSVGetSVGroupByIdRes(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("SVGroupInfo")
    val svGroupInfo : SVGroup?
) : CTSVCap()