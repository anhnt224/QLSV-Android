package com.emglab.qlsv.models.res

import com.google.gson.annotations.SerializedName

class UpdateStudentContactResp  (
    @SerializedName("RespCode")
    override var respCode: Int = -1,
    @SerializedName("RespText")
    override var respText: String = "",
    @SerializedName("MotelID")
    var motelID: Int? = null
): CTSVCap()