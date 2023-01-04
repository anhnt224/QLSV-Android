package com.emglab.qlsv.models.res.criteria

import com.emglab.qlsv.models.entity.UserDetail
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetUserDetailResp (
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("ClassDetailInfo")
    var userDetail: UserDetail

): CTSVCap()