package com.emglab.qlsv.models.res.user

import com.emglab.qlsv.models.entity.Message
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class CTSVGetUserMessageRes(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("UserMessageLst")
    val userMessageLst : List<Message>?
) : CTSVCap()