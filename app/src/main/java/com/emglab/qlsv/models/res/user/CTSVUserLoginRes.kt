package com.emglab.qlsv.models.res.user


import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class CTSVUserLoginRes(
    @SerializedName("RespText")
    override val respText: String? = "",
    @SerializedName("RespCode")
    override val respCode: Int? = 0 ,
    @SerializedName("UserName")
    val userName: String? = "",
    @SerializedName("FullName")
    val fullName: String? = "",
    @SerializedName("Email")
    val email: String? = "",
    @SerializedName("Avatar")
    val avatar: String? = "",
    @SerializedName("TokenCode")
    val tokenCode: String? = ""

) : CTSVCap()