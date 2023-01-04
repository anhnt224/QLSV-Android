package com.emglab.qlsv.webservices

import androidx.lifecycle.LiveData
import com.emglab.qlsv.models.req.*
import com.emglab.qlsv.models.res.*
import com.emglab.qlsv.models.res.activity.*
import com.emglab.qlsv.models.res.criteria.*
import com.emglab.qlsv.models.res.gift.CreateGiftResp
import com.emglab.qlsv.models.res.gift.GetGiftListByCreateID
import com.emglab.qlsv.models.res.gift.GetGiftRegistersResp
import com.emglab.qlsv.models.res.gift.GetListGiftsResp
import com.emglab.qlsv.models.res.group.CTSVGetSVGroupByIdRes
import com.emglab.qlsv.models.res.group.CTSVGetSVGroupRes
import com.emglab.qlsv.models.res.job.GetListJobsResp
import com.emglab.qlsv.models.res.scholarShip.GetListScholarShipsAppliedResp
import com.emglab.qlsv.models.res.scholarShip.GetListScholarShipsResp
import com.emglab.qlsv.models.res.teacher.GetListClassResp
import com.emglab.qlsv.models.res.teacher.GetListStudentResp
import com.emglab.qlsv.models.res.teacher.GetStudentInfoResp
import com.emglab.qlsv.models.res.user.*
import com.emglab.qlsv.modules.searchMotel.model.GetMotelResultsResp
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistrationListResp
import com.emglab.qlsv.modules.searchMotel.model.RegisterMotelReq
import com.emglab.qlsv.modules_teacher.contactParent.GetStudentInfoTokenResp
import com.google.gson.JsonObject
import okhttp3.MultipartBody

import retrofit2.Call
import retrofit2.http.*

interface WebService {

    // user

    @FormUrlEncoded
    @POST("UploadFile/CTSV/GetScheduleStudent")
    fun getScheduleStudent(@Field("UserName") UserName: String,
                            @Field("UserCode") UserCode: String,
                            @Field("Token") TokenCode: String
                           ): LiveData<ApiResponse<CTSVGetScheduleStudentRes>>

    @FormUrlEncoded
    @POST("User/UserLogin")
    fun login(@Field("UserName") UserName: String,
              @Field("Password") Password: String): LiveData<ApiResponse<CTSVUserLoginRes>>

    @POST("User/LoginAccessToken")
    fun loginWithMSAccount(
        @HeaderMap headers: Map<String, String>
    ): LiveData<ApiResponse<CTSVUserLoginRes>>


    @FormUrlEncoded
    @POST("User/LostPassword")
    fun lostPassword(@Field("UserName") UserName: String,
               @Field("DeviceInfo") DeviceInfo: String,
               @Field("Signature") Signature: String): LiveData<ApiResponse<CTSVAssignUserActivityByEmailRes>>

    @FormUrlEncoded
    @POST("User/CheckOTPLostPassword")
    fun checkOTPLostPassword(@Field("UserName") UserName: String,
                     @Field("DeviceInfo") DeviceInfo: String,
                     @Field("OTP") OTP: String,
                     @Field("Signature") Signature: String): LiveData<ApiResponse<CTSVAssignUserActivityByEmailRes>>

    @FormUrlEncoded
    @POST("User/LogOut")
    fun logout(@Field("UserName") UserName: String,
               @Field("TokenCode") TokenCode: String,
               @Field("Signature") Signature: String): Call<JsonObject>

    @FormUrlEncoded
    @POST("User/ChangePassword")
    fun changePassword(@Field("UserName") UserName: String,
                       @Field("Password") Password: String,
                       @Field("NewPassword") NewPassword: String,
                       @Field("FromIP") FromIP: String,
                       @Field("TokenCode") TokenCode: String,
                       @Field("DeviceInfo") DeviceInfo: String,
                       @Field("Signature") Signature: String): LiveData<ApiResponse<CTSVAssignUserActivityByEmailRes>>

    @FormUrlEncoded
    @POST("User/UserRegister")
    fun userRegister(@Field("FromIP") FromIP: String,
                     @Field("DeviceInfo") DeviceInfo: String,
                     @Field("UserName") UserName: String,
                     @Field("Email") Email: String,
                     @Field("Mobile") Mobile: String,
                     @Field("Signature") Signature: String): LiveData<ApiResponse<CTSVAssignUserActivityByEmailRes>>

    @FormUrlEncoded
    @POST("User/GetUserApprovedByGId")
    fun getUserApprovedByGId(@Field("UserName") UserName: String,
                             @Field("TokenCode") TokenCode: String,
                             @Field("GId") GId: Int,
                             @Field("Signature") Signature: String,
                             @Field("Search") Search: String,
                             @Field("NumberRow") NumberRow: Int,
                             @Field("PageNumber") PageNumber: Int): LiveData<ApiResponse<CTSVGetUserByGIdRes>>

    @FormUrlEncoded
    @POST("User/GetUserPendingByGId")
    fun getUserPendingByGId(@Field("UserName") UserName: String,
                            @Field("TokenCode") TokenCode: String,
                            @Field("GId") GId: Int,
                            @Field("Signature") Signature: String,
                            @Field("Search") Search: String,
                            @Field("NumberRow") NumberRow: Int,
                            @Field("PageNumber") PageNumber: Int): LiveData<ApiResponse<CTSVGetUserByGIdRes>>

    @FormUrlEncoded
    @POST("UserClass/GetDetailUserInfo")
    fun getUserInfo(@Field("UserName") UserName: String,
                    @Field("UserCode") UserCode: String,
                    @Field("TokenCode") TokenCode: String): LiveData<ApiResponse<CTSVGetUserInfoRes>>

    @FormUrlEncoded
    @POST("User/GetUserMessage")
    fun getUserMessage(@Field("UserName") UserName: String,
                    @Field("UserCode") UserCode: String,
                    @Field("TokenCode") TokenCode: String): LiveData<ApiResponse<CTSVGetUserMessageRes>>

    //criteria

    @FormUrlEncoded
    @POST("Criteria/GetCriteriaValueByCId")
    fun getCriteriaValueByCId(@Field("UserName") UserName: String,
                              @Field("TokenCode") TokenCode: String,
                              @Field("CId") GId: Int,
                              @Field("Signature") Signature: String): Call<JsonObject>

    @FormUrlEncoded
    @POST("User/UpdateDeviceToken")
    fun updateDeviceToken(@Field("UserName") username: String,
                          @Field("TokenCode") token: String,
                          @Field("DeviceToken") deviceToken: String,
                          @Field("Device") device: String): LiveData<ApiResponse<MyCTSVCap>>


    //group
    @FormUrlEncoded
    @POST("SVGroup/GetSVGroupByUser")
    fun getSVGroupByUser(@Field("UserName") UserName: String,
                         @Field("TokenCode") TokenCode: String): LiveData<ApiResponse<CTSVGetSVGroupRes>>

    @FormUrlEncoded
    @POST("SVGroup/GetSVGroupByUserAdmin")
    fun getSVGroupByUserAdmin(@Field("UserName") UserName: String,
                                 @Field("TokenCode") TokenCode: String,
                                 @Field("UserCode") UserCode: String): LiveData<ApiResponse<CTSVGetSVGroupRes>>

    @FormUrlEncoded
    @POST("SVGroup/GetChildGroupByGId")
    fun getChildGroupByGId(@Field("UserName") UserName: String,
                           @Field("TokenCode") TokenCode: String,
                           @Field("GId") GId: Int): LiveData<ApiResponse<CTSVGetSVGroupRes>>


    @FormUrlEncoded
    @POST("SVGroup/GetSVGroupById")
    fun getSVGroupById(@Field("UserName") UserName: String,
                       @Field("TokenCode") TokenCode: String,
                       @Field("GId") GId: Int): LiveData<ApiResponse<CTSVGetSVGroupByIdRes>>

    @FormUrlEncoded
    @POST("SVGroup/GetSVGroup")
    fun getSVGroup(@Field("UserName") UserName: String,
                      @Field("TokenCode") TokenCode: String):
            LiveData<ApiResponse<CTSVGetSVGroupRes>>

    @FormUrlEncoded
    @POST("SVGroup/AddUserGroupByEmail")
    fun addUserGroupByEmail(@Field("UserName") UserName: String,
                     @Field("Email") UserCode: String,
                     @Field("TokenCode") TokenCode: String,
                     @Field("Reason") Reason: String,
                     @Field("GId") GId: Int,
                     @Field("UserRole") UserRole: Int,
                     @Field("UGStatus") UGStatus: Int,
                     @Field("Signature") Signature: String): LiveData<ApiResponse<CTSVAssignUserActivityByEmailRes>>

    @FormUrlEncoded
    @POST("SVGroup/AddUserGroup")
    fun addUserGroup(@Field("UserName") UserName: String,
                     @Field("UserCode") UserCode: String,
                     @Field("TokenCode") TokenCode: String,
                     @Field("Reason") Reason: String,
                     @Field("GId") GId: Int,
                     @Field("UserRole") UserRole: Int,
                     @Field("UGStatus") UGStatus: Int,
                     @Field("Signature") Signature: String): LiveData<ApiResponse<CTSVAssignUserActivityByEmailRes>>


    @FormUrlEncoded
    @POST("SVGroup/ApproveUserGroup")
    fun approveUserGroup(@Field("UserName") UserName: String,
                         @Field("TokenCode") TokenCode: String,
                         @Field("UserCode") UserCode: String,
                         @Field("GId") GId: Int,
                         @Field("UserRole") UserRole: Int,
                         @Field("Signature") Signature: String): LiveData<ApiResponse<CTSVAssignUserActivityByEmailRes>>

    @FormUrlEncoded
    @POST("SVGroup/ApproveLstUserGroup")
    fun approveLstUserGroup(@Field("UserName") UserName: String,
                         @Field("TokenCode") TokenCode: String,
                         @Field("UserCodeLst") UserCode: String,
                         @Field("GId") GId: Int,
                         @Field("Signature") Signature: String): Call<JsonObject>

    @POST("SVGroup/AddNewSVGroup")
    fun addNewSVGroup(@Body svGroup : JsonObject): Call<JsonObject>

    @POST("SVGroup/UpdateSVGroup")
    fun updateSVGroup(@Body svGroup : JsonObject): Call<JsonObject>

    //activity

    @FormUrlEncoded
    @POST("Activity/AssignUserActivity")
    fun assignUserActivity(@Field("UserName") UserName: String,
                           @Field("UserCode") UserCode: String,
                           @Field("TokenCode") TokenCode: String,
                           @Field("Reason") Reason: String,
                           @Field("AId") AId: Int,
                           @Field("UserRole") UserRole: Int,
                           @Field("CheckInPlace") CheckInPlace: String,
                           @Field("UAStatus") UAStatus: Int,
                           @Field("Signature") Signature: String):  LiveData<ApiResponse<CTSVAssignUserActivityRes>>

    @FormUrlEncoded
    @POST("Activity/GetPublishActivity")
    fun getPublicActivities(
        @Field("PageNumber") page: Int,
        @Field("NumberRow") row: Int
    ): LiveData<ApiResponse<GetPublicActivity>>

    @FormUrlEncoded
    @POST("Activity/AssignUserActivityByEmail")
    fun assignUserActivityByEmail(@Field("UserName") UserName: String,
                           @Field("Email") UserCode: String,
                           @Field("TokenCode") TokenCode: String,
                           @Field("Reason") Reason: String,
                           @Field("AId") AId: Int,
                           @Field("UserRole") UserRole: Int,
                           @Field("CheckInPlace") CheckInPlace: String,
                           @Field("UAStatus") UAStatus: Int,
                           @Field("Signature") Signature: String):  LiveData<ApiResponse<CTSVAssignUserActivityByEmailRes>>

    @FormUrlEncoded
    @POST("Activity/AssessActivity")
    fun assessActivity(@Field("UserName") UserName: String,
                       @Field("TokenCode") TokenCode: String,
                       @Field("UserCode") UserCode: String,
                       @Field("AId") AId: Int,
                       @Field("Comment") Comment: String,
                       @Field("AValue") AValue: Int,
                       @Field("Signature") Signature: String): Call<JsonObject>

    @FormUrlEncoded
    @POST("Activity/ApproveActivity")
    fun approveActivity(@Field("UserName") UserName: String,
                        @Field("TokenCode") TokenCode: String,
                        @Field("AId") AId: Int,
                        @Field("Signature") Signature: String): Call<JsonObject>

    @FormUrlEncoded
    @POST("Activity/UserCheckinActivity")
    fun userCheckinActivity(@Field("UserName") UserName: String,
                            @Field("TokenCode") TokenCode: String,
                            @Field("UserCode") UserCode: String,
                            @Field("AId") AId: Int,
                            @Field("Longitude") Longitude: Double,
                            @Field("Latitude") Latitude: Double,
                            @Field("Address") Address: String,
                            @Field("Signature") Signature: String): LiveData<ApiResponse<CTSVAssignUserActivityRes>>

    @FormUrlEncoded
    @POST("Activity/ApproveUserActivity")
    fun approveUserActivity(@Field("UserName") UserName: String,
                            @Field("TokenCode") TokenCode: String,
                            @Field("UserCode") UserCode: String,
                            @Field("UserRole") UserRole: Int,
                            @Field("AId") GId: Int,
                            @Field("Signature") Signature: String): LiveData<ApiResponse<CTSVAssignUserActivityByEmailRes>>


    @FormUrlEncoded
    @POST("Activity/GetUserActivityApprovedByAId")
    fun getUserActivityApprovedByAId(@Field("UserName") UserName: String,
                                     @Field("TokenCode") TokenCode: String,
                                     @Field("AId") AId: Int,
                                     @Field("Signature") Signature: String,
                                     @Field("Search") Search: String,
                                     @Field("NumberRow") NumberRow: Int,
                                     @Field("PageNumber") PageNumber: Int): LiveData<ApiResponse<CTSVGetUserActivityByAIdRes>>

    @FormUrlEncoded
    @POST("Activity/GetUserCheckInActivity")
    fun getUserCheckInActivity(@Field("UserName") UserName: String,
                               @Field("TokenCode") TokenCode: String,
                               @Field("UserCode") UserCode: String,
                               @Field("AId") AId: Int,
                               @Field("Signature") Signature: String): LiveData<ApiResponse<CTSVGetUserCheckInActivityRes>>

    @FormUrlEncoded
    @POST("Activity/GetUserActivityPendingByAId")
    fun getUserActivityPendingByAId(@Field("UserName") UserName: String,
                                    @Field("TokenCode") TokenCode: String,
                                    @Field("AId") AId: Int,
                                    @Field("Signature") Signature: String,
                                    @Field("Search") Search: String,
                                    @Field("NumberRow") NumberRow: Int,
                                    @Field("PageNumber") PageNumber: Int): LiveData<ApiResponse<CTSVGetUserActivityByAIdRes>>

    @FormUrlEncoded
    @POST("Activity/GetActivityByUser")
    fun getActivityByUser(@Field("UserName") UserName: String,
                          @Field("TokenCode") TokenCode: String,
                          @Field("UserCode") UserCode: String,
                          @Field("Signature") Signature: String,
                          @Field("Search") Search: String,
                          @Field("NumberRow") NumberRow: Int,
                          @Field("PageNumber") PageNumber: Int): LiveData<ApiResponse<CTSVGetActivityByUserRes>>


    @FormUrlEncoded
    @POST("Activity/GetUserActivityInfo")
    fun getUserActivityInfo(@Field("UserName") UserName: String,
                            @Field("TokenCode") TokenCode: String,
                            @Field("UserCode") UserCode: String,
                            @Field("AId") GId: Int,
                            @Field("Signature") Signature: String): Call<JsonObject>



    @FormUrlEncoded
    @POST("Activity/GetActivityByGId")
    fun getActivityByGId(@Field("UserName") UserName: String,
                         @Field("TokenCode") TokenCode: String,
                         @Field("GId") GId: Int,
                         @Field("Signature") Signature: String,
                         @Field("Search") Search: String,
                         @Field("NumberRow") NumberRow: Int,
                         @Field("PageNumber") PageNumber: Int): LiveData<ApiResponse<CTSVGetActivityByGIdRes>>

    @FormUrlEncoded
    @POST("Activity/GetActivityByCId")
    fun getActivityByCId(@Field("UserName") UserName: String,
                         @Field("TokenCode") TokenCode: String,
                         @Field("CId") CId: Int,
                         @Field("Signature") Signature: String,
                         @Field("Search") Search: String,
                         @Field("NumberRow") NumberRow: Int,
                         @Field("PageNumber") PageNumber: Int): LiveData<ApiResponse<CTSVGetActivityByCIdRes>>

    @FormUrlEncoded
    @POST("Activity/GetActivityGroup")
    fun getActivityGroup(@Field("UserName") UserName: String,
                         @Field("TokenCode") TokenCode: String): Call<JsonObject>

    @FormUrlEncoded
    @POST("Activity/GetActivityGroupByGId")
    fun getActivityGroupByGId(@Field("UserName") UserName: String,
                              @Field("TokenCode") TokenCode: String,
                              @Field("GId") GId: Int): LiveData<ApiResponse<CTSVGetActivityGroupByGIdRes>>

    @FormUrlEncoded
    @POST("Activity/GetActivityByUserUnit")
    fun getActivityByUserUnit(@Field("UserName") UserName: String,
                              @Field("TokenCode") TokenCode: String):
            LiveData<ApiResponse<CTSVGetActivityByUserUnitRes>>

    @FormUrlEncoded
    @POST("Activity/GetActivityById")
    fun getActivityById(@Field("UserName") UserName: String,
                        @Field("TokenCode") TokenCode: String,
                        @Field("AId") AId: Int):  LiveData<ApiResponse<CTSVGetActivityByIdRes>>

    @POST("Activity/CreateActivity")
    fun createActivity(@Body activity : JsonObject): Call<JsonObject>

    @POST("Activity/UpdateActivity")
    fun updateActivity(@Body activity : JsonObject): Call<JsonObject>

    @Multipart
    @POST("UploadFile/CTSV/UploadProofImage")
    fun uploadFile(@Query("UserCode") UserCode: String,
                   @Query("TokenCode") TokenCode: String,
                   @Query("AId") AId: Int,
                   @Part image: MultipartBody.Part): LiveData<ApiResponse<CTSVAssignUserActivityRes>>

    //userRole
    @FormUrlEncoded
    @POST("UserRole/GetUserRole")
    fun getUserRole(@Field("UserName") UserName: String,
                    @Field("TokenCode") TokenCode: String): Call<JsonObject>

    //ScholarShip
    @FormUrlEncoded
    @POST("HWScholarship/GetApprovedScholarship")
    fun getListScholarShips(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("NumberRow") row: Int,
        @Field("PageNumber") page: Int
    ): LiveData<ApiResponse<GetListScholarShipsResp>>

    @FormUrlEncoded
    @POST("HWScholarship/GetScholarshipApplyByUser")
    fun getListScholarShipApplied(
        @Field("UserName") userName: String,
        @Field("UserCode") userCode: String,
        @Field("TokenCode") tokenCode: String,
        @Field("NumberRow") row: Int,
        @Field("PageNumber") page: Int
    ): LiveData<ApiResponse<GetListScholarShipsAppliedResp>>

    @FormUrlEncoded
    @POST("HWScholarship/ApplyScholarship")
    fun applyScholarShip(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("DocumentId") scholarShipID: Int
    ): LiveData<ApiResponse<MyCTSVCap>>

    //Job
    @FormUrlEncoded
    @POST("HWRecruitment/GetPublishRecruitment")
    fun getListJobs(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("PublishLocation") type: Int,
        @Field("NumberRow") row: Int,
        @Field("PageNumber") page: Int
    ): LiveData<ApiResponse<GetListJobsResp>>

    @FormUrlEncoded
    @POST("HWRecruitment/GetRecruitmentApplyByUser")
    fun getListJobsApply(
        @Field("UserName") userName: String,
        @Field("UserCode") userCode: String,
        @Field("TokenCode") tokenCode: String,
        @Field("NumberRow") row: Int,
        @Field("PageNumber") page: Int
    ): LiveData<ApiResponse<GetListJobsResp>>

    @FormUrlEncoded
    @POST("HWRecruitment/ApplyRecruitment")
    fun applyJob(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("DocumentId") id: Int,
        @Field("PhoneNumber") phoneNumber: String,
        @Field("Introduce") introduction: String
    ): LiveData<ApiResponse<MyCTSVCap>>

    //
    @FormUrlEncoded
    @POST("User/GetLocation")
    fun getListCities(
        @Field("UserName") userName: String,
        @Field("Token") token: String,
        @Field("Region") region: String = "",
        @Field("City") city: String = "",
        @Field("District") district: String = ""
    ): LiveData<ApiResponse<GetListCitiesResp>>

    @FormUrlEncoded
    @POST("User/GetLocation")
    fun getListDistricts(
        @Field("UserName") userName: String,
        @Field("Token") token: String,
        @Field("Region") region: String = "",
        @Field("City") city: String,
        @Field("District") district: String = ""
    ): LiveData<ApiResponse<GetListDistrictsResp>>

    @FormUrlEncoded
    @POST("User/GetLocation")
    fun getListWards(
        @Field("UserName") userName: String,
        @Field("Token") token: String,
        @Field("Region") region: String = "",
        @Field("City") city: String,
        @Field("District") district: String
    ): LiveData<ApiResponse<GetListWardsResp>>

    @POST("User/UpdateStudentContact")
    fun updateUserAddress(
        @Body updateUserAddressReq: UpdateUserAddressReq
    ): LiveData<ApiResponse<UpdateStudentContactResp>>

    @FormUrlEncoded
    @POST("User/GetStudentContact")
    fun getListUserAddress(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String
    ): LiveData<ApiResponse<GetListUserAddressResp>>

    @FormUrlEncoded
    @POST("User/DelStudentContact")
    fun deleteAddress(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("RowID") rowID: Int
    ): LiveData<ApiResponse<MyCTSVCap>>

    @FormUrlEncoded
    @POST("UserClass/GetDetailUserInfo")
    fun getUserDetail(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("UserCode") userCode: String
    ): LiveData<ApiResponse<GetUserDetailResp>>

    @FormUrlEncoded
    @POST("Point/GetSemester")
    fun getListSemester(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String
    ): LiveData<ApiResponse<GetListSemesters>>

    @FormUrlEncoded
    @POST("Criteria/GetCriteriaReportByUser")
    fun getCriteriaReport(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("Semester") semester: String
    ):LiveData<ApiResponse<GetCriteriaReportResp>>

    @FormUrlEncoded
    @POST("Criteria/GetCriteriaTypeDetails")
    fun getListCriteriaTypes(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("UserCode") userCode: String,
        @Field("Semester") semester: String
    ): LiveData<ApiResponse<GetListCriteriaTypesResp>>

    @FormUrlEncoded
    @POST("Activity/GetActivityByCId")
    fun getListActivitiesByCId(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("UserCode") userCode: String,
        @Field("CId") cID: Int,
        @Field("PageNumber") page: Int = 1,
        @Field("NumberRow") row: Int = 100,
        @Field("Search") search: String = ""
    ): LiveData<ApiResponse<GetListActivitiesByCId>>

    @POST("Point/MarkCriteriaUser")
    fun markCriteriaUser(
        @Body markCriteriaUserReq: MarkCriteriaUserReq
    ): LiveData<ApiResponse<MyCTSVCap>>

    /**
     * Teacher
     */
    @FormUrlEncoded
    @POST("UserClass/GetClassDetailByUser")
    fun getListStudents(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("ClassName") className: String,
        @Field("Semester") semester: String
    ): LiveData<ApiResponse<GetListStudentResp>>

    @FormUrlEncoded
    @POST("UserClass/SearchUserInfo")
    fun searchStudents(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("Search") search: String
    ): LiveData<ApiResponse<GetListStudentResp>>

    @FormUrlEncoded
    @POST("UserClass/GetClassByUser")
    fun getClasses(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String
    ): LiveData<ApiResponse<GetListClassResp>>

    @FormUrlEncoded
    @POST("UserClass/GetDetailUserInfo")
    fun getStudentInfoByID(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("UserCode") studentID: String
    ): LiveData<ApiResponse<GetStudentInfoResp>>

    /**
     * Student note
     */
    @FormUrlEncoded
    @POST("UserClass/GetCommentStudentByStdID")
    fun getStudentNotes(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("StudentID") studentID: String
    ): LiveData<ApiResponse<GetStudentNoteResp>>

    @FormUrlEncoded
    @POST("UserClass/DelCommentStudent")
    fun delStudentNote(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("RowID") rowID: Int
    ): LiveData<ApiResponse<MyCTSVCap>>

    @FormUrlEncoded
    @POST("UserClass/CommentStudent")
    fun addNote(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("StudentID") studentID: String,
        @Field("Comment") note: String
    ): LiveData<ApiResponse<MyCTSVCap>>


    /**
     * Gift
     */
    @FormUrlEncoded
    @POST("ATMGift/GetGiftLstByCreateID")
    fun getGiftsByCreateId(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("Search") search: String = "",
        @Field("NumberRow") row: Int = 0,
        @Field("PageNumber") page: Int = 0
    ): LiveData<ApiResponse<GetGiftListByCreateID>>

    @FormUrlEncoded
    @POST("ATMGift/GetUserGift")
    fun getListRegisters(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("GiftID") giftId: Int
    ): LiveData<ApiResponse<GetGiftRegistersResp>>

    @POST("ATMGift/CreateGift")
    fun createGift(
        @Body createGiftReq: CreateGiftReq
    ): LiveData<ApiResponse<CreateGiftResp>>

    @POST("ATMGift/ApproveUserGiftLst")
    fun approveRegisterGift(
        @Body approveUserGiftReq: ApproveUserGiftReq
    ): LiveData<ApiResponse<MyCTSVCap>>

    @FormUrlEncoded
    @POST("ATMGift/GetGiftLstPublic")
    fun getAllGifts(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("Search") search: String = "",
        @Field("NumberRow") row: Int = 0,
        @Field("PageNumber") page: Int = 0
    ): LiveData<ApiResponse<GetListGiftsResp>>

    @FormUrlEncoded
    @POST("ATMGift/GetGiftByUser")
    fun getGiftsRegistered(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("Search") search: String = "",
        @Field("NumberRow") row: Int = 0,
        @Field("PageNumber") page: Int = 0
    ): LiveData<ApiResponse<GetListGiftsResp>>

    @POST("ATMGift/ApplyGift")
    fun applyGift(
        @Body applyGiftReq: ApplyGiftReq
    ): LiveData<ApiResponse<MyCTSVCap>>

    @FormUrlEncoded
    @POST("ATMGift/DelGiftByID")
    fun deleteGift(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("GiftID") giftId: Int
    ):  LiveData<ApiResponse<MyCTSVCap>>

    @FormUrlEncoded
    @POST("ATMGift/CancelApplyGift")
    fun cancelApplyGift(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("GiftID") giftId: Int
    ):  LiveData<ApiResponse<MyCTSVCap>>

    //MOTEL
//    @Multipart
//    @POST("CTSV/UploadImageMotel")
//    fun uploadImageMotel(
//        @Query("UserCode") userCode: String,
//        @Query("MotelID") motelID: String,
//        @Query("TypeImg") typeImg: Int,
//        @Query("TokenCode") TokenCode: String,
//        @Part image: MultipartBody.Part
//    ): LiveData<ApiResponse<CTSVAssignUserActivityRes>>

    @Multipart
    @POST("UploadFile/CTSV/UploadImageMotel")
    fun uploadImageMotel(
        @Query("UserCode") userCode: String,
        @Query("MotelID") motelID: Int,
        @Query("TypeImg") typeImg: Int,
        @Query("TokenCode") tokenCode: String,
        @Part image: MultipartBody.Part
    ): Call<CTSVAssignUserActivityRes>

    @FormUrlEncoded
    @POST("CTSV/CTSVDelImageMotel")
    fun delImageMotel(
        @Field("UserName") userName: String,
        @Field("Token") tokenCode: String,
        @Field("MotelID") id: Int,
        @Field("TypeImg") type: Int
    ): LiveData<ApiResponse<MyCTSVCap>>

    @FormUrlEncoded
    @POST("StudentMotel/SearchStudentMotel")
    fun searchStudentMotel(
        @Field("UserName") userName: String,
        @Field("TokenCode") tokenCode: String,
        @Field("Latitude") latitude: Double,
        @Field("Longitude") longitude: Double,
        @Field("Distance") distance: Int
    ): LiveData<ApiResponse<CTSVSearchStudentMotelRes>>

    @FormUrlEncoded
    @POST("UploadFile/CTSV/GetMotelFiles")
    fun getImageMotel(
        @Field("UserName") userName: String,
        @Field("Token") token: String,
        @Field("MotelID") motelID: Int
    ): LiveData<ApiResponse<CTSVMotelImageRes>>

//map

    @GET("Boundary/RevertGeoCoding?")
    fun getPlaceNameAuto(
        @Query("x") x: Double,
        @Query("y") y: Double
    ):Call<GetPlaceNameAutoByMapRes>

    // ----- MOTEL REGISTRATION -----
    @FormUrlEncoded
    @POST("StudentMotel/GetMotelRegisterLst")
    fun getMotelRegistrationList(
        @Field("UserName") userName: String,
        @Field("TokenCode") token: String,
        @Field("TimeStart") startTime: String,
        @Field("TimeEnd") endTime: String
    ): LiveData<ApiResponse<MotelRegistrationListResp>>

    @POST("StudentMotel/CreateMotelRegister")
    fun registerMotel(
        @Body registerMotelReq: RegisterMotelReq
    ): LiveData<ApiResponse<MyCTSVCap>>

    @FormUrlEncoded
    @POST("StudentMotel/DelMotelRegister")
    fun deleteMotelRegistration(
        @Field("UserName") userName: String,
        @Field("TokenCode") token: String,
        @Field("DocID") docID: Int
    ): LiveData<ApiResponse<MyCTSVCap>>

    @FormUrlEncoded
    @POST("StudentMotel/GetMotelSuggestByRID")
    fun getListMotelResults(
        @Field("UserName") userName: String,
        @Field("TokenCode") token: String,
        @Field("RegisterID") registerID: Int
    ): LiveData<ApiResponse<GetMotelResultsResp>>

    @FormUrlEncoded
    @POST("StudentLink/SentSMSStudentLink")
    fun getStudentInfoUrlToken(
        @Field("UserName") userName: String,
        @Field("TokenCode") token: String,
        @Field("UserCode") userCode: String
    ): LiveData<ApiResponse<GetStudentInfoTokenResp>>

}