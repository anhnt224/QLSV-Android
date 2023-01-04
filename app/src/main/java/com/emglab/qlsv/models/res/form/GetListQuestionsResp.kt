package com.emglab.qlsv.models.res.form

import com.emglab.qlsv.models.entity.FormQuestion
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetListQuestionsResp (
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("HSQuestionPaperLst")
    var questions: List<FormQuestion>
): CTSVCap()