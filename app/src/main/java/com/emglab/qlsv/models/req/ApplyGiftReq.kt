package com.emglab.qlsv.models.req

import com.emglab.qlsv.models.entity.gift.GiftRegister
import com.google.gson.annotations.SerializedName

class ApplyGiftReq(
    @SerializedName("UserName")
    var userName: String = "",
    @SerializedName("TokenCode")
    var token: String = "",
    @SerializedName("UserGiftInfo")
    var giftRegisterInfo: GiftRegister
)