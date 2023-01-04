package com.emglab.qlsv.models.res.user

import com.emglab.qlsv.models.entity.Note
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetStudentNoteResp (
    @SerializedName("RespText")
    override val respText: String? = "",
    @SerializedName("RespCode")
    override val respCode: Int? = 0 ,
    @SerializedName("CommentStudentLst")
    var notes: List<Note> = listOf()
): CTSVCap()