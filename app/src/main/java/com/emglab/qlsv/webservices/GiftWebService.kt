package com.emglab.qlsv.webservices

import androidx.lifecycle.LiveData
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.models.res.activity.CTSVAssignUserActivityRes
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface GiftWebService {
    @Multipart
    @POST("ATMGift/UploadImageGift")
    fun uploadImageGift(
        @Query("UserName") userName: String,
        @Query("TokenCode") token: String,
        @Query("GiftID") giftId: Int,
        @Query("TypeImage") typeImage: Int,
        @Part image: MultipartBody.Part
    ): Call<MyCTSVCap>

    @FormUrlEncoded
    @POST("CTSV/DelImageMotel")
    fun delImageMotel(
        @Field("UserName") userName: String,
        @Field("Token") tokenCode: String,
        @Field("MotelID") id: Int,
        @Field("TypeImg") type: Int
    ): LiveData<ApiResponse<MyCTSVCap>>

    @Multipart
    @POST("CTSV/UploadProofImage")
    fun uploadFile(@Query("UserCode") UserCode: String,
                   @Query("TokenCode") TokenCode: String,
                   @Query("AId") AId: Int,
                   @Part image: MultipartBody.Part): LiveData<ApiResponse<CTSVAssignUserActivityRes>>

}