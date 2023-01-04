package com.emglab.qlsv.models.res.timetable

import com.emglab.qlsv.models.entity.Subject
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class GetTimeTableResp (
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("ScheduleStudentLst")
    var subjects: ArrayList<Subject> = arrayListOf()
): CTSVCap()