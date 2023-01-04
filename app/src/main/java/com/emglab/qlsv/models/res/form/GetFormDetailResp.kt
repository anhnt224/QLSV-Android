package com.emglab.qlsv.models.res.form

import com.emglab.qlsv.models.entity.Form
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetFormDetailResp  (
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("Data")
    var form: Form
): CTSVCap()