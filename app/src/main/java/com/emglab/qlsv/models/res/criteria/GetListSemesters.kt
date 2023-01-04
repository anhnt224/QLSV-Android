package com.emglab.qlsv.models.res.criteria

import com.emglab.qlsv.models.entity.Semester
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetListSemesters (
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("SemesterLst")
    var semesters: List<Semester>

): CTSVCap()