package com.emglab.qlsv.models.res.run

import com.emglab.qlsv.models.entity.run.RunResult
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetRunResultsListResp(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("RunResultLst")
    var runResultList: List<RunResult> = listOf()
): CTSVCap()