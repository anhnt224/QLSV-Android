package com.emglab.qlsv.webservices

import androidx.lifecycle.LiveData
import com.emglab.qlsv.models.req.RegisterFormReq
import com.emglab.qlsv.models.req.UpdateFormReq
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.models.res.form.GetFormDetailResp
import com.emglab.qlsv.models.res.form.GetListFormsRegiteredResp
import com.emglab.qlsv.models.res.form.GetListFormsResp
import com.emglab.qlsv.models.res.form.GetListQuestionsResp
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface FormWebService {
    @FormUrlEncoded
    @POST("Paper/GetPaper")
    fun getListForm(
        @Field("TokenCode") token: String
    ): LiveData<ApiResponse<GetListFormsResp>>

    @FormUrlEncoded
    @POST("Paper/GetPaperAllByToken")
    fun getListFormRegistered(
        @Field("TokenCode") token: String
    ): LiveData<ApiResponse<GetListFormsRegiteredResp>>

    @FormUrlEncoded
    @POST("Paper/DelPaperStudent")
    fun deleteForm(
        @Field("TokenCode") token: String,
        @Field("RowID") rowID: Int
    ): LiveData<ApiResponse<MyCTSVCap>>

    @FormUrlEncoded
    @POST("Paper/GetPaperDetailByID")
    fun getFormDetail(
        @Field("TokenCode") token: String,
        @Field("ID") id: Int

    ):LiveData<ApiResponse<GetFormDetailResp>>

    @FormUrlEncoded
    @POST("Paper/GetPaperByTypePaper")
    fun getListQuestions(
        @Field("TokenCode") token: String,
        @Field("TypePaper") formType: String
    ): LiveData<ApiResponse<GetListQuestionsResp>>

    @POST("Paper/SetStudentPaper")
    fun registerForm(
        @Body registerFormReq: RegisterFormReq
    ): LiveData<ApiResponse<MyCTSVCap>>

    @POST("Paper/UpdateStudentPaper")
    fun updateForm(
        @Body updateFormReq: UpdateFormReq
    ): LiveData<ApiResponse<MyCTSVCap>>

    @FormUrlEncoded
    @POST("Paper/RatePaperStudent")
    fun rateForm(
        @Field("TokenCode") token: String,
        @Field("RowID") rowID: Int,
        @Field("Rate") rating: Int,
        @Field("Comment") comment: String
    ): LiveData<ApiResponse<MyCTSVCap>>
}