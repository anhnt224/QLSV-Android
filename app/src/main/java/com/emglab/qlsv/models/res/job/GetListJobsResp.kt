package com.emglab.qlsv.models.res.job

import com.emglab.qlsv.models.entity.Job
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetListJobsResp (
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("NumberPage")
    var page : Int = 0,
    @SerializedName("RecruitmentLst")
    var jobs: List<Job>?
): CTSVCap()