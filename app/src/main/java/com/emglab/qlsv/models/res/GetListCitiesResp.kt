package com.emglab.qlsv.models.res

import com.google.gson.annotations.SerializedName

class GetListCitiesResp(
    @SerializedName("RespCode")
    override var respCode: Int = -1,
    @SerializedName("RespText")
    override var respText: String = "",
    @SerializedName("LocationLst")
    var cities: List<String>
): CTSVCap()