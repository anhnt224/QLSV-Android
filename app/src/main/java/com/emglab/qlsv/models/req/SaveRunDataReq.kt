package com.emglab.qlsv.models.req

import com.emglab.qlsv.models.entity.run.RunData
import com.google.gson.annotations.SerializedName

class SaveRunDataReq (
    @SerializedName("UserName")
    var userName: String = "",
    @SerializedName("TokenCode")
    var token: String = "",
    @SerializedName("RunResultLst")
    var runDataList: List<RunData> = listOf()
)