package com.emglab.qlsv.models.res.criteria

import com.emglab.qlsv.models.entity.CriteriaType
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetListCriteriaTypesResp(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("CriteriaTypeDetailsLst")
    var criteriaTypes: List<CriteriaType>
): CTSVCap()