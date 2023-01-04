package com.emglab.qlsv.models.res.teacher

import com.emglab.qlsv.models.entity.StudentInfo
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetStudentInfoResp (
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("ClassDetailInfo")
    var studentInfo: StudentInfo
): CTSVCap()