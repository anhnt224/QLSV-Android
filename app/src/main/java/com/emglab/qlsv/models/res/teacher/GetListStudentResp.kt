package com.emglab.qlsv.models.res.teacher

import com.emglab.qlsv.models.entity.Student
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetListStudentResp(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("ClassDetailLst")
    var listStudents: List<Student>
): CTSVCap()