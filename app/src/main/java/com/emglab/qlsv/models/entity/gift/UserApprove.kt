package com.emglab.qlsv.models.entity.gift

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class UserApprove (
    @SerializedName("UserCode")
    var userName: String,
    @SerializedName("Status")
    var status: Int
    ): Serializable