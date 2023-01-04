package com.emglab.qlsv.models.entity

import com.google.gson.annotations.SerializedName

class CriteriaReport (
    @SerializedName("CTId")
    var id: Int = 0,
    @SerializedName("CTName")
    var name: String = "",
    @SerializedName("CTDesc")
    var description: String = "",
    @SerializedName("CUPoint")
    var studentPoint: Int = 0,
    @SerializedName("CTPoint")
    var teacherPoint: Int = 0,
    @SerializedName("CTMaxPoint")
    var maxPoint: Int = 0
)