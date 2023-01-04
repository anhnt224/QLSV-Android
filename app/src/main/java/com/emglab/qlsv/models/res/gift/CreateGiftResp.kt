package com.emglab.qlsv.models.res.gift

import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class CreateGiftResp(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("GiftID")
    var giftId: Int = 0
): CTSVCap()