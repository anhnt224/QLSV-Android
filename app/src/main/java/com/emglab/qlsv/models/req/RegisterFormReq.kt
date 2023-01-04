package com.emglab.qlsv.models.req

import com.emglab.qlsv.models.entity.FormQuestion
import com.google.gson.annotations.SerializedName

class RegisterFormReq (
    @SerializedName("TokenCode")
    var token: String = "",

    @SerializedName("SetStudentPaperLst")
    var questions: List<FormQuestion> = listOf(),

    @SerializedName("SVContactID")
    var studentContactID: Int,

    @SerializedName("Ship")
    var deliveryType: Int
)