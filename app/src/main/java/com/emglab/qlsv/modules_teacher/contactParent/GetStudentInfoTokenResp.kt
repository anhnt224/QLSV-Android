package com.emglab.qlsv.modules_teacher.contactParent

import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetStudentInfoTokenResp(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("StudentLink") var urlToken: String?
) :
    CTSVCap()