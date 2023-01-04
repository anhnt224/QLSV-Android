package com.emglab.qlsv.models.res.teacher

import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetListClassResp (
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("ClassLst")
    var listClass: List<String>
): CTSVCap()