package com.emglab.qlsv.models.res

import com.emglab.qlsv.models.entity.Motel
import com.google.gson.annotations.SerializedName

class CTSVSearchStudentMotelRes(
    @SerializedName("RespText")
    override val respText: String = "",
    @SerializedName("RespCode")
    override val respCode: Int = -1,
    @SerializedName("StudentMotelLst")
    val studentMotelList: List<Motel> = listOf()
): CTSVCap()