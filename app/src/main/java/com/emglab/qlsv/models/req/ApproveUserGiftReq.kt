package com.emglab.qlsv.models.req

import com.emglab.qlsv.models.entity.gift.UserApprove
import com.google.gson.annotations.SerializedName

class ApproveUserGiftReq (
    @SerializedName("UserName")
    var userName: String = "",
    @SerializedName("TokenCode")
    var token: String = "",
    @SerializedName("GiftID")
    var giftId: Int,
    @SerializedName("UserApproveLst")
    var userApproveList: List<UserApprove>
)