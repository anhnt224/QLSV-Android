package com.emglab.qlsv.webservices

import androidx.lifecycle.LiveData
import com.emglab.qlsv.models.res.timetable.GetTimeTableResp
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface TimeTableWebService {
    @FormUrlEncoded
    @POST("GetScheduleStudent")
    fun getTimeTable(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("UserCode") userCode: String
    ): LiveData<ApiResponse<GetTimeTableResp>>
}