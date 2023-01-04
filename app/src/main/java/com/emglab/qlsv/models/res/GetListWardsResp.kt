package com.emglab.qlsv.models.res

import com.google.gson.annotations.SerializedName

class GetListWardsResp (
    @SerializedName("RespCode")
    override var respCode: Int = -1,
    @SerializedName("RespText")
    override var respText: String = "",
    @SerializedName("LocationLst")
    var wards: List<String>
): CTSVCap()