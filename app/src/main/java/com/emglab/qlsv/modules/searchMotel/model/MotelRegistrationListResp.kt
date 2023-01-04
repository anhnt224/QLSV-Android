package com.emglab.qlsv.modules.searchMotel.model;

import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class MotelRegistrationListResp(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("MotelRegisterLst")
    val motelRegistrationList: List<MotelRegistration>
) : CTSVCap()




