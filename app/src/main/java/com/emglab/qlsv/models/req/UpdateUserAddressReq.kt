package com.emglab.qlsv.models.req

import com.emglab.qlsv.models.entity.Motel
import com.emglab.qlsv.models.entity.UserAddress
import com.google.gson.annotations.SerializedName

class UpdateUserAddressReq (
    @SerializedName("UserName")
    var userName: String = "",
    @SerializedName("TokenCode")
    var token: String = "",
    @SerializedName("StudentContactInfo")
    var userAddress: UserAddress,
    @SerializedName("StudentMotelInfo")
    var motelInfo : Motel? = null
)