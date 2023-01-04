package com.emglab.qlsv.repositories.user

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.NetworkBoundResource
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.dao.ScheduleStudnetDAO
import com.emglab.qlsv.dao.UserDAO
import com.emglab.qlsv.dao.WeekNumberDAO
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.*
import com.emglab.qlsv.models.req.UpdateUserAddressReq
import com.emglab.qlsv.models.res.*
import com.emglab.qlsv.models.res.activity.CTSVAssignUserActivityByEmailRes
import com.emglab.qlsv.models.res.user.*
import com.emglab.qlsv.utilities.runOnIoThread
import com.emglab.qlsv.webservices.ApiResponse
import com.emglab.qlsv.webservices.WebService
import java.util.*

import javax.inject.Inject
import javax.inject.Singleton
import kotlin.collections.ArrayList

@Singleton
class UserRepository @Inject constructor(
    private val userDAO: UserDAO,
    private val scheduleStudnetDAO: ScheduleStudnetDAO,
    private val weekNumberDAO: WeekNumberDAO,
    private val webservice: WebService,
    private val appExecutors: AppExecutors,
    private val sharedPrefsHelper: SharedPrefsHelper
)
{
    private var userByGroups  = MediatorLiveData<List<UserGroup>>()
    private var messages  = MediatorLiveData<List<Message>>()
    private var userPendingByGroups  = MediatorLiveData<List<UserGroup>>()
    private var ctsvCapLiveData  = MediatorLiveData<MyCTSVCap>()
    private var ctsvUserLoginResLiveData  = MediatorLiveData<CTSVUserLoginRes>()
    private var citiesLiveData = MediatorLiveData<List<String>>()
    private var districtsLiveData = MediatorLiveData<List<String>>()
    private var wardsLiveData = MediatorLiveData<List<String>>()
    private var updateUserAddressLiveData = MediatorLiveData<UpdateStudentContactResp>()
    private var getListUserAddress = MediatorLiveData<List<UserAddress>>()
    private var deleteAddress = MediatorLiveData<MyCTSVCap>()

    init {
        userByGroups.value = ArrayList()
        userPendingByGroups.value = ArrayList()
        messages.value = arrayListOf()
        ctsvCapLiveData.value = MyCTSVCap()
        ctsvUserLoginResLiveData .value = CTSVUserLoginRes()
        citiesLiveData.value = listOf()
        districtsLiveData.value = listOf()
        wardsLiveData.value = listOf()
        updateUserAddressLiveData.value = UpdateStudentContactResp()
        getListUserAddress.value = listOf()
        deleteAddress.value = MyCTSVCap()
    }

    fun getUserApprovedByGId(userName: String, token: String,gId: Int,Signature: String,Search:String, NumberRow: Int,PageNumber: Int,shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<List<UserGroup>>> {
        return object : NetworkBoundResource<List<UserGroup>, CTSVGetUserByGIdRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetUserByGIdRes) {
                if (item.userGroups != null){
                    Thread(Runnable { userByGroups.postValue(item.userGroups) }).start()
                }
            }

            override fun shouldFetch(data: List<UserGroup>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<UserGroup>> {
                return userByGroups
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetUserByGIdRes>> =
                webservice.getUserApprovedByGId(userName,token,gId,Signature,Search,NumberRow,PageNumber)

        }.asLiveData()
    }

    fun getUserPendingByGId(userName: String, token: String,aId: Int,Signature: String,Search:String, NumberRow: Int,PageNumber: Int,shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<List<UserGroup>>> {
        return object : NetworkBoundResource<List<UserGroup>, CTSVGetUserByGIdRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetUserByGIdRes) {
                if (item.userGroups != null){
                    Thread(Runnable { userPendingByGroups.postValue(item.userGroups) }).start()
                }
            }

            override fun shouldFetch(data: List<UserGroup>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<UserGroup>> {
                return userPendingByGroups
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetUserByGIdRes>> =
                webservice.getUserPendingByGId(userName,token,aId,Signature,Search,NumberRow,PageNumber)

        }.asLiveData()
    }

    fun getUserMessage(shouldFetch: Boolean = true) :  LiveData<Resource<List<Message>>> {
        return object : NetworkBoundResource<List<Message>, CTSVGetUserMessageRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetUserMessageRes) {
                Thread(Runnable { messages.postValue(item.userMessageLst) }).start()
            }

            override fun shouldFetch(data: List<Message>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Message>> {
                return messages
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetUserMessageRes>> =
                webservice.getUserMessage(sharedPrefsHelper.getUserName(),sharedPrefsHelper.getUserName(),sharedPrefsHelper.getToken())

        }.asLiveData()
    }

    fun getUserInfo(shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<User>> {
        return object : NetworkBoundResource<User, CTSVGetUserInfoRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetUserInfoRes) {
                if (item.userInfo != null){
                    insertToRoom(item.userInfo)
                    sharedPrefsHelper.put(SharedPrefsHelper.EMAIL,item.userInfo.email!!)
                }
            }

            override fun shouldFetch(data: User?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<User> {
                return userDAO.getUserById(sharedPrefsHelper.getUserName())
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetUserInfoRes>> =
                webservice.getUserInfo(sharedPrefsHelper.getUserName(),sharedPrefsHelper.getUserName(),sharedPrefsHelper.getToken())

        }.asLiveData()
    }

    fun login(userName: String,password: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<CTSVUserLoginRes>> {
        return object : NetworkBoundResource<CTSVUserLoginRes, CTSVUserLoginRes>(appExecutors) {

            override fun saveCallResult(item: CTSVUserLoginRes) {
                //Thread(Runnable { ctsvUserLoginResLiveData.postValue(item) }).start()
                val token = item.tokenCode!!
                val userCode = item.userName!! // usercode do đổi api
                val fullName = item.fullName!!
                val email = item.email!!
                val user = User(studentId = userCode, fullName = fullName,email =  email)
                insertToRoom(user)

                sharedPrefsHelper.put(SharedPrefsHelper.TOKEN,token)
                sharedPrefsHelper.put(SharedPrefsHelper.USER_CODE,userCode)
                sharedPrefsHelper.put(SharedPrefsHelper.EMAIL,email)
                sharedPrefsHelper.put(SharedPrefsHelper.FULLNAME,fullName)
            }

            override fun shouldFetch(data: CTSVUserLoginRes?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb() : LiveData<CTSVUserLoginRes> {
                return ctsvUserLoginResLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVUserLoginRes>> =
                webservice.login(userName,password)

        }.asLiveData()
    }

    fun loginWithMSAccount(headers: Map<String, String>, shouldFetch: Boolean = true):  LiveData<Resource<CTSVUserLoginRes>> {
        return object : NetworkBoundResource<CTSVUserLoginRes, CTSVUserLoginRes>(appExecutors) {

            override fun saveCallResult(item: CTSVUserLoginRes) {
                //Thread(Runnable { ctsvUserLoginResLiveData.postValue(item) }).start()
                val token = item.tokenCode!!
                val userCode = item.userName!! // usercode do đổi api
                val fullName = item.fullName!!
                val email = item.email!!
                val user = User(studentId = userCode, fullName = fullName,email =  email)
                insertToRoom(user)

                sharedPrefsHelper.put(SharedPrefsHelper.TOKEN,token)
                sharedPrefsHelper.put(SharedPrefsHelper.USER_CODE,userCode)
                sharedPrefsHelper.put(SharedPrefsHelper.EMAIL,email)
                sharedPrefsHelper.put(SharedPrefsHelper.FULLNAME,fullName)
            }

            override fun shouldFetch(data: CTSVUserLoginRes?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb() : LiveData<CTSVUserLoginRes> {
                return ctsvUserLoginResLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVUserLoginRes>> =
                webservice.loginWithMSAccount(headers)

        }.asLiveData()
    }

    fun changePassword(password: String,newPassword: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<MyCTSVCap>> {
        return object : NetworkBoundResource<MyCTSVCap, CTSVAssignUserActivityByEmailRes>(appExecutors) {

            override fun saveCallResult(item: CTSVAssignUserActivityByEmailRes) {

            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb() : LiveData<MyCTSVCap> {
                return ctsvCapLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVAssignUserActivityByEmailRes>> =
                webservice.changePassword(sharedPrefsHelper.getEmail(),password,newPassword,"",sharedPrefsHelper.getToken(),"","")

        }.asLiveData()
    }

    fun lostPassword(userName: String,deviceInfo : String,signature: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<MyCTSVCap>> {
        return object : NetworkBoundResource<MyCTSVCap, CTSVAssignUserActivityByEmailRes>(appExecutors) {

            override fun saveCallResult(item: CTSVAssignUserActivityByEmailRes) {

            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb() : LiveData<MyCTSVCap> {
                return ctsvCapLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVAssignUserActivityByEmailRes>> =
                webservice.lostPassword(userName,deviceInfo,signature)

        }.asLiveData()
    }

    fun checkOTPLostPassword(userName: String,deviceInfo : String,otp: String,signature: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<MyCTSVCap>> {
        return object : NetworkBoundResource<MyCTSVCap, CTSVAssignUserActivityByEmailRes>(appExecutors) {

            override fun saveCallResult(item: CTSVAssignUserActivityByEmailRes) {
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb() : LiveData<MyCTSVCap> {
                return ctsvCapLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVAssignUserActivityByEmailRes>> =
                webservice.checkOTPLostPassword(userName,deviceInfo,otp,signature)

        }.asLiveData()
    }

    fun userRegister(userName: String,email : String,mobile: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<MyCTSVCap>> {
        return object : NetworkBoundResource<MyCTSVCap, CTSVAssignUserActivityByEmailRes>(appExecutors) {

            override fun saveCallResult(item: CTSVAssignUserActivityByEmailRes) {

            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb() : LiveData<MyCTSVCap> {
                return ctsvCapLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVAssignUserActivityByEmailRes>> =
                webservice.userRegister("","",userName,email,mobile,"")

        }.asLiveData()
    }

    fun getScheduleStudent(shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<List<ScheduleStudent>>> {
        return object : NetworkBoundResource<List<ScheduleStudent>, CTSVGetScheduleStudentRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetScheduleStudentRes) {
                item.weekNumber?.let {
                    insertWeekNumberToRoom(WeekNumber(weekNumber = it))
                }
                if (item.scheduleStudentLst != null){
                    for (schedule in item.scheduleStudentLst){
                        schedule.uuid = UUID.randomUUID().toString()
                    }
                    deleteAndInsertNewSchedule(item.scheduleStudentLst)
                }
            }

            override fun shouldFetch(data: List<ScheduleStudent>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<ScheduleStudent>> {
                return scheduleStudnetDAO.getAll()
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetScheduleStudentRes>> =
                webservice.getScheduleStudent(sharedPrefsHelper.getUserName(),sharedPrefsHelper.getUserName(),sharedPrefsHelper.getToken())

        }.asLiveData()
    }

    fun deleteAndInsertNewSchedule(scheduleStudents: List<ScheduleStudent>){
        runOnIoThread {
            scheduleStudnetDAO.deleteAll()
            scheduleStudnetDAO.insertAll(scheduleStudents)
        }
    }

    fun getWeekNumber() = weekNumberDAO.getWeek()

    private fun insertAllToRoom(users: List<User>) {
        runOnIoThread {
            userDAO.insertAll(users)
        }
    }

    fun insertToRoom(user: User) {
        runOnIoThread {
            userDAO.insert(user)
        }
    }

    fun insertWeekNumberToRoom(weekNumber: WeekNumber) {
        runOnIoThread {
            weekNumberDAO.insert(weekNumber)
        }
    }

    fun updateToRoom(user : User){
        runOnIoThread {
            userDAO.update(user)
        }
    }

    fun deleteFromRoom(user: User) {
        runOnIoThread {
            userDAO.delete(user)
        }
    }

    fun deleteRoom(){
        runOnIoThread {
            userDAO.deleteAll1()
            userDAO.deleteAll2()
            userDAO.deleteAll3()
//            userDAO.deleteAll4()
            userDAO.deleteAll5()
            userDAO.deleteAll6()
            userDAO.deleteAll7()
            userDAO.deleteAll8()
            userDAO.deleteAll9()
            userDAO.deleteAll10()
        }
    }


    //
    fun getListCities(shouldFetch: Boolean = true): LiveData<Resource<List<String>>>{
        return object: NetworkBoundResource<List<String>, GetListCitiesResp>(appExecutors){
            override fun saveCallResult(item: GetListCitiesResp) {
                Thread(Runnable { citiesLiveData.postValue(item.cities) }).start()
            }

            override fun shouldFetch(data: List<String>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<String>> {
                return citiesLiveData
            }

            override fun createCall(): LiveData<ApiResponse<GetListCitiesResp>> {
                return webservice.getListCities(userName = sharedPrefsHelper.getUserName(), token = sharedPrefsHelper.getToken())
            }
        }.asLiveData()
    }

    fun getListDistricts(city: String,shouldFetch: Boolean = true): LiveData<Resource<List<String>>>{
        return object: NetworkBoundResource<List<String>, GetListDistrictsResp>(appExecutors){
            override fun saveCallResult(item: GetListDistrictsResp) {
                Log.d("_DISTRICTS", item.districts.toString())
                Thread(Runnable { districtsLiveData.postValue(item.districts) }).start()
            }

            override fun shouldFetch(data: List<String>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<String>> {
                return districtsLiveData
            }

            override fun createCall(): LiveData<ApiResponse<GetListDistrictsResp>> {
                return webservice.getListDistricts(userName = sharedPrefsHelper.getUserName(), token = sharedPrefsHelper.getToken(), city = city)
            }

        }.asLiveData()
    }

    fun getListWards(city: String, district: String,shouldFetch: Boolean = true): LiveData<Resource<List<String>>>{
        return object: NetworkBoundResource<List<String>, GetListWardsResp>(appExecutors){
            override fun saveCallResult(item: GetListWardsResp) {
                Thread(Runnable { wardsLiveData.postValue(item.wards) }).start()
            }

            override fun shouldFetch(data: List<String>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<String>> {
                return wardsLiveData
            }

            override fun createCall(): LiveData<ApiResponse<GetListWardsResp>> {
                return webservice.getListWards(userName = sharedPrefsHelper.getUserName(), token = sharedPrefsHelper.getToken(), city = city, district = district)
            }

        }.asLiveData()
    }

    fun updateUserAddress(userAddress: UserAddress, motelInfo: Motel?, shouldFetch: Boolean = true): LiveData<Resource<UpdateStudentContactResp>>{
        return object: NetworkBoundResource<UpdateStudentContactResp, UpdateStudentContactResp>(appExecutors){
            override fun shouldFetch(data: UpdateStudentContactResp?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<UpdateStudentContactResp> {
                return updateUserAddressLiveData
            }

            override fun createCall(): LiveData<ApiResponse<UpdateStudentContactResp>> {
                val updateUserAddressReq = UpdateUserAddressReq(userName = sharedPrefsHelper.getUserName(), token = sharedPrefsHelper.getToken(), userAddress = userAddress, motelInfo = motelInfo )
                return webservice.updateUserAddress(updateUserAddressReq)
            }

            override fun saveCallResult(item: UpdateStudentContactResp) {
                Thread(Runnable { updateUserAddressLiveData.postValue(item) }).start()
            }

        }.asLiveData()
    }

    fun getListUserAddress(shouldFetch: Boolean = true): LiveData<Resource<List<UserAddress>>>{
        return object: NetworkBoundResource<List<UserAddress>, GetListUserAddressResp>(appExecutors){
            override fun saveCallResult(item: GetListUserAddressResp) {
                Thread(Runnable { getListUserAddress.postValue(item.userAddresses) }).start()
            }

            override fun shouldFetch(data: List<UserAddress>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<UserAddress>> {
                return getListUserAddress
            }

            override fun createCall(): LiveData<ApiResponse<GetListUserAddressResp>> {
                return webservice.getListUserAddress(userName = sharedPrefsHelper.getUserName(), tokenCode = sharedPrefsHelper.getToken())
            }

        }.asLiveData()
    }

    fun deleteUserAddress(address: UserAddress, shouldFetch: Boolean = true): LiveData<Resource<MyCTSVCap>>{
        return object: NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors){
            override fun saveCallResult(item: MyCTSVCap) {
                Thread(Runnable { deleteAddress.postValue(item) }).start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return deleteAddress
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                return webservice.deleteAddress(sharedPrefsHelper.getUserName(), sharedPrefsHelper.getToken(), address.id)
            }

        }.asLiveData()
    }

}