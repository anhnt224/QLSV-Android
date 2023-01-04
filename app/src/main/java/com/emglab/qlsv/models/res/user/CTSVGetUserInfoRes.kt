package com.emglab.qlsv.models.res.user



import com.emglab.qlsv.models.entity.User
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class CTSVGetUserInfoRes(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("ClassDetailInfo")
    val userInfo : User?
) : CTSVCap()