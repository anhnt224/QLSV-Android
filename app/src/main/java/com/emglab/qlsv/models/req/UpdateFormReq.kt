package com.emglab.qlsv.models.req

import com.emglab.qlsv.models.entity.FormQuestion
import com.google.gson.annotations.SerializedName

class UpdateFormReq(
    @SerializedName("TokenCode")
    var token: String = "",

    @SerializedName("RowID")
    var rowID: Int = 0,

    @SerializedName("SetStudentPaperLst")
    var questions: List<FormQuestion> = listOf()
)