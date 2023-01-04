package com.emglab.qlsv.models.res.user

import com.emglab.qlsv.models.entity.ScheduleStudent
import com.emglab.qlsv.models.res.CTSVCap
import com.google.gson.annotations.SerializedName

class CTSVGetScheduleStudentRes(
    @SerializedName("RespText")
    override val respText: String?,
    @SerializedName("RespCode")
    override val respCode: Int?,
    @SerializedName("WeekNumber")
    val weekNumber: String?,
    @SerializedName("ScheduleStudentLst")
    val scheduleStudentLst : List<ScheduleStudent>?
) : CTSVCap()