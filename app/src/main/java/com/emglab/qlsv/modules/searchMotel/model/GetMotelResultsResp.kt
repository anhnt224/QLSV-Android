package com.emglab.qlsv.modules.searchMotel.model

import com.emglab.qlsv.models.entity.Motel
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetMotelResultsResp(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("StudentMotelLst")
    val motelList: List<Motel>
) : CTSVCap()