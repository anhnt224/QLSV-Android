package com.emglab.qlsv.models.res

import com.google.gson.annotations.SerializedName

abstract class CTSVCap {
    abstract val respText: String?
    abstract val respCode: Int?
}

data class MyCTSVCap (
    @SerializedName("RespText")
    override val respText: String? = null,
    @SerializedName("RespCode")
    override val respCode: Int? = null): CTSVCap()
