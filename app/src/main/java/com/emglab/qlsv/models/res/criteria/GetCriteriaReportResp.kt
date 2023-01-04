package com.emglab.qlsv.models.res.criteria

import com.emglab.qlsv.models.entity.CriteriaReport
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetCriteriaReportResp (
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("CriteriaTypes")
    var criteriaReports: List<CriteriaReport>
): CTSVCap()