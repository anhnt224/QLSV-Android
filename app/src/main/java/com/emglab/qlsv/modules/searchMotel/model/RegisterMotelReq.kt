package com.emglab.qlsv.modules.searchMotel.model

import com.google.gson.annotations.SerializedName

class RegisterMotelReq (
    @SerializedName("UserName")
    var username: String,
    @SerializedName("TokenCode")
    var token: String,
    @SerializedName("MotelRegisterInfo")
    var motelRegistration: MotelRegistration
)