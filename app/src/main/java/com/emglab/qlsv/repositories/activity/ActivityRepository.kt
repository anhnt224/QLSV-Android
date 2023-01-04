package com.emglab.qlsv.repositories.activity

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.emglab.qlsv.dao.ActivityDAO
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.models.res.activity.*
import com.emglab.qlsv.utilities.runOnIoThread
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.NetworkBoundResource
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.dao.CountStepsDAO
import com.emglab.qlsv.dao.CriteriaDAO
import com.emglab.qlsv.dao.UserCheckInActivityDAO
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.*
import com.emglab.qlsv.webservices.ApiResponse
import com.emglab.qlsv.webservices.WebService
import okhttp3.MultipartBody
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.collections.ArrayList

@Singleton
class ActivityRepository @Inject constructor(
    private val activityDAO: ActivityDAO,
    private val criteriaDAO: CriteriaDAO,
    private val userCheckInActivityDAO: UserCheckInActivityDAO,
    private val webservice: WebService,
    private val appExecutors: AppExecutors,
    private val sharedPrefsHelper: SharedPrefsHelper,
    private val countStepsDAO: CountStepsDAO
)
{

   // private val appExecutors: AppExecutors = AppExecutors()
    private var activitiesByUserUnitLiveData  = MediatorLiveData<List<Activity>>()
    private var activitiesByUserLiveData   = MediatorLiveData<List<Activity>>()
    private var activitiesByGIdLiveData  = MediatorLiveData<List<Activity>>()
    private var activitiesByCIdLiveData  = MediatorLiveData<List<Activity>>()
    private var activityByIdLiveData  = MediatorLiveData<Activity>()
    private var ctsvCapLiveData  = MediatorLiveData<MyCTSVCap>()
    private var userActivityLstLiveData  = MediatorLiveData<List<UserActivity>>()
    private var userActivityPendingByAIdLiveData  = MediatorLiveData<List<UserActivity>>()
    private var userCheckInActivityLiveData  = MediatorLiveData<List<UserCheckInActivity>>()
    private var getPublicActivities = MediatorLiveData<List<Activity>>()

    private var activityGroupByIdListLiveData  = MediatorLiveData<List<ActivityGroup>>()

    init {
        activitiesByUserUnitLiveData.value = ArrayList()
        activitiesByUserLiveData.value = ArrayList()
        activityByIdLiveData.value = Activity()
        activitiesByGIdLiveData.value = ArrayList()
        activityGroupByIdListLiveData.value = ArrayList()
        userActivityLstLiveData.value = ArrayList()
        activitiesByCIdLiveData.value = ArrayList()
        userActivityPendingByAIdLiveData.value = ArrayList()
        userCheckInActivityLiveData.value = ArrayList()
        ctsvCapLiveData.value = MyCTSVCap()
        getPublicActivities.value = listOf()
    }

    fun getCountSteps(id: String) : LiveData<CountSteps>{
        return countStepsDAO.getCountSteps(id)
    }

    fun getAllCountSteps() : LiveData<List<CountSteps>>{
        return countStepsDAO.getAllCountSteps()
    }

    fun insertCountSteps(countSteps: CountSteps) {
        runOnIoThread {
            countStepsDAO.insert(countSteps)
        }
    }

    fun getActivityByUser(signature:String, search:String, numberRow:Int, pageNumber: Int,shouldFetch: Boolean = true) :  LiveData<Resource<List<Activity>>> {

        return object : NetworkBoundResource<List<Activity>, CTSVGetActivityByUserRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetActivityByUserRes) {
                Thread(Runnable {
                    activitiesByUserLiveData.postValue(item.activities)
                }).start()
            }

            override fun shouldFetch(data: List<Activity>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Activity>> {
               return activitiesByUserLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetActivityByUserRes>> =
                webservice.getActivityByUser(sharedPrefsHelper.getUserName(),sharedPrefsHelper.getToken(),
                    sharedPrefsHelper.getUserName(),signature,search,numberRow,pageNumber)

        }.asLiveData()
    }

    fun getActivityByUserUnit(shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<List<Activity>>> {

        return object : NetworkBoundResource<List<Activity>, CTSVGetActivityByUserUnitRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetActivityByUserUnitRes) {
                if (item.activities != null){
                    Thread(Runnable { activitiesByUserUnitLiveData.postValue(item.activities) }).start()
                }
            }
            override fun shouldFetch(data: List<Activity>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<Activity>> {
                return activitiesByUserUnitLiveData
            }


            override fun createCall(): LiveData<ApiResponse<CTSVGetActivityByUserUnitRes>> =
                webservice.getActivityByUserUnit(sharedPrefsHelper.getUserName(),sharedPrefsHelper.getToken())

        }.asLiveData()
    }

    fun getActivityByGId(userName: String, token: String,GId: Int,Signature: String,Search:String, NumberRow: Int,PageNumber: Int,shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<List<Activity>>> {
        return object : NetworkBoundResource<List<Activity>, CTSVGetActivityByGIdRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetActivityByGIdRes) {
                if (item.activities != null){
                    Thread(Runnable { activitiesByGIdLiveData.postValue(item.activities) }).start()
                }
            }

            override fun shouldFetch(data: List<Activity>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<Activity>> {
                return activitiesByGIdLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetActivityByGIdRes>> =
                webservice.getActivityByGId(userName,token,GId,Signature,Search,NumberRow,PageNumber)

        }.asLiveData()
    }

    fun getActivityGroupByGId(userName: String, token: String,GId: Int,shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<List<ActivityGroup>>> {
        return object : NetworkBoundResource<List<ActivityGroup>, CTSVGetActivityGroupByGIdRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetActivityGroupByGIdRes) {
                if (item.activityGroupLst != null){
                    Thread(Runnable { activityGroupByIdListLiveData.postValue(item.activityGroupLst) }).start()
                }
            }

            override fun shouldFetch(data: List<ActivityGroup>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<ActivityGroup>> {
                return activityGroupByIdListLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetActivityGroupByGIdRes>> =
                webservice.getActivityGroupByGId(userName,token,GId)

        }.asLiveData()
    }

    fun getActivityByCId(userName: String, token: String,CId: Int,Signature: String,Search:String, NumberRow: Int,PageNumber: Int,shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<List<Activity>>> {
        return object : NetworkBoundResource<List<Activity>, CTSVGetActivityByCIdRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetActivityByCIdRes) {
                if (item.activities != null){
                    Thread(Runnable { activitiesByCIdLiveData.postValue(item.activities) }).start()
                }
            }

            override fun shouldFetch(data: List<Activity>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<Activity>> {
                return activitiesByCIdLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetActivityByCIdRes>> =
                webservice.getActivityByCId(userName,token,CId,Signature,Search,NumberRow,PageNumber)

        }.asLiveData()
    }

    fun getUserActivityApprovedByAId(userName: String, token: String,aId: Int,Signature: String,Search:String, NumberRow: Int,PageNumber: Int,shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<List<UserActivity>>> {
        return object : NetworkBoundResource<List<UserActivity>, CTSVGetUserActivityByAIdRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetUserActivityByAIdRes) {
                if (item.userActivityLst != null){
                    Thread(Runnable { userActivityLstLiveData.postValue(item.userActivityLst) }).start()
                }
            }

            override fun shouldFetch(data: List<UserActivity>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<UserActivity>> {
                return userActivityLstLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetUserActivityByAIdRes>> =
                webservice.getUserActivityApprovedByAId(userName,token,aId,Signature,Search,NumberRow,PageNumber)

        }.asLiveData()
    }

    fun getActivityById(AId: Int, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<Activity>> {
        return object : NetworkBoundResource<Activity, CTSVGetActivityByIdRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetActivityByIdRes) {
                if (item.activities != null && item.activities.size > 0){
                    //Thread(Runnable { activityByIdLiveData.postValue(item.user[0]) }).start()
                    val activity = item.activities[0]
                    insertToRoom(activity)
                    val criterias = activity.criteriaLst
                    criterias?.let {
                        for (criteria in criterias){
                            criteria.aId = activity.id
                        }
                        insertCriteriaByActivityToRoom(criterias)
                    }

                }
            }

            override fun shouldFetch(data: Activity?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<Activity> {
                return activityDAO.getActivityDetail(AId)
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetActivityByIdRes>> =
                webservice.getActivityById(sharedPrefsHelper.getUserName(),sharedPrefsHelper.getToken(),AId)

        }.asLiveData()
    }

    fun assignUserActivity(Reason: String,AId : Int,UserRole: Int,CheckInPlace: String,UAStatus:Int,Signature: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<MyCTSVCap>> {
        return object : NetworkBoundResource<MyCTSVCap, CTSVAssignUserActivityRes>(appExecutors) {

            override fun saveCallResult(item: CTSVAssignUserActivityRes) {
                if (item.respCode == 0){
                    updateStatusToRoom(UserActivity.REGISTER,AId)
                }
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

            override fun createCall(): LiveData<ApiResponse<CTSVAssignUserActivityRes>> =
                webservice.assignUserActivity(sharedPrefsHelper.getUserName(),sharedPrefsHelper.getUserName(),sharedPrefsHelper.getToken(),Reason,AId,UserRole,CheckInPlace,UAStatus,Signature)

        }.asLiveData()
    }

    fun assignUserActivityByEmail(userName: String,email: String, token: String,Reason: String,AId : Int,UserRole: Int,CheckInPlace: String,UAStatus:Int,Signature: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<MyCTSVCap>> {
        return object : NetworkBoundResource<MyCTSVCap, CTSVAssignUserActivityByEmailRes>(appExecutors) {

            override fun saveCallResult(item: CTSVAssignUserActivityByEmailRes) {
                if (item.respCode == 0){
                    updateStatusToRoom(UserActivity.REGISTER,AId)
                }
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
                webservice.assignUserActivityByEmail(userName,email,token,Reason,AId,UserRole,CheckInPlace,UAStatus,Signature)

        }.asLiveData()
    }

    fun getUserActivityPendingByAId(userName: String, token: String,aId: Int,Signature: String,Search:String, NumberRow: Int,PageNumber: Int,shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<List<UserActivity>>> {
        return object : NetworkBoundResource<List<UserActivity>, CTSVGetUserActivityByAIdRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetUserActivityByAIdRes) {
                if (item.userActivityLst != null){
                    Thread(Runnable { userActivityPendingByAIdLiveData.postValue(item.userActivityLst) }).start()
                }
            }

            override fun shouldFetch(data: List<UserActivity>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<UserActivity>> {
                return userActivityPendingByAIdLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetUserActivityByAIdRes>> =
                webservice.getUserActivityPendingByAId(userName,token,aId,Signature,Search,NumberRow,PageNumber)

        }.asLiveData()
    }

    fun approveUserActivity(userName: String, token: String,usercode: String,userRole: Int,aId : Int,Signature: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<MyCTSVCap>> {
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
                webservice.approveUserActivity(userName,token,usercode,userRole,aId,Signature)

        }.asLiveData()
    }

    fun getUserCheckInActivity(userCode: String,aId: Int,signature: String,shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<List<UserCheckInActivity>>> {
        return object : NetworkBoundResource<List<UserCheckInActivity>, CTSVGetUserCheckInActivityRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetUserCheckInActivityRes) {
                if (item.userCheckInActivityLst != null){
                    deleteAndInsertNewUserCheckInActivity(item.userCheckInActivityLst)
                }
            }

            override fun shouldFetch(data: List<UserCheckInActivity>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<UserCheckInActivity>> {
                return userCheckInActivityDAO.getByAIdAndUserName(aId,sharedPrefsHelper.getUserName())
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetUserCheckInActivityRes>> =
                webservice.getUserCheckInActivity(sharedPrefsHelper.getUserName(),sharedPrefsHelper.getToken(),sharedPrefsHelper.getUserName(),aId,signature)

        }.asLiveData()
    }

    fun userCheckinActivity(userCode: String,AId : Int,longitude: Double, latitude: Double,address: String,Signature: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<MyCTSVCap>> {
        return object : NetworkBoundResource<MyCTSVCap, CTSVAssignUserActivityRes>(appExecutors) {

            override fun saveCallResult(item: CTSVAssignUserActivityRes) {

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

            override fun createCall(): LiveData<ApiResponse<CTSVAssignUserActivityRes>> =
                webservice.userCheckinActivity(sharedPrefsHelper.getUserName(),sharedPrefsHelper.getToken(),sharedPrefsHelper.getUserName(),AId,longitude,latitude,address,Signature)

        }.asLiveData()
    }

    fun updateTokenDevice(tokenDevice: String, deviceType: String, shouldFetch: Boolean = true, callDelay: Long = 0): LiveData<Resource<MyCTSVCap>>{
        Log.d("MessagingService", "Username: ${sharedPrefsHelper.getUserName()} \nToken:${sharedPrefsHelper.getToken()} \ntokenDevice: $tokenDevice ")
        return object : NetworkBoundResource<MyCTSVCap, MyCTSVCap> (appExecutors) {
            override fun saveCallResult(item: MyCTSVCap) {
                Log.d("MessagingService", "saveCallResult")
                Thread(Runnable { ctsvCapLiveData.postValue(item) }).start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb() : LiveData<MyCTSVCap> {
                Log.d("MessagingService", "loadFromDb, ${ctsvCapLiveData.value.toString()}")
                return ctsvCapLiveData
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> =
                webservice.updateDeviceToken(sharedPrefsHelper.getUserName(), sharedPrefsHelper.getToken(), tokenDevice, deviceType)

        }.asLiveData()
    }

    fun uploadFile(aId: Int, multipartBody : MultipartBody.Part, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<MyCTSVCap>> {

        return object : NetworkBoundResource<MyCTSVCap, CTSVAssignUserActivityRes>(appExecutors) {

            override fun saveCallResult(item: CTSVAssignUserActivityRes) {

            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return ctsvCapLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVAssignUserActivityRes>> =
                webservice.uploadFile(sharedPrefsHelper.getUserName(),sharedPrefsHelper.getToken(),aId,multipartBody)

        }.asLiveData()
    }

    fun getPublicActivities(
        page: Int = 1, row: Int = 15, shouldFetch: Boolean = true
    ): LiveData<Resource<List<Activity>>> {
        return object : NetworkBoundResource<List<Activity>, GetPublicActivity>(appExecutors){
            override fun saveCallResult(item: GetPublicActivity) {
                Thread{
                    getPublicActivities.postValue(item.activities)
                }.start()
            }

            override fun shouldFetch(data: List<Activity>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Activity>> {
                return getPublicActivities
            }

            override fun createCall(): LiveData<ApiResponse<GetPublicActivity>> {
                return webservice.getPublicActivities(page, row)
            }

        }.asLiveData()
    }

    fun getActiviyByCIdFromRoom(CId: Int) =  activityDAO.getActiviyByCIdFromRoom(CId)

    private fun insertAllToRoom(activities: List<Activity>) {
        runOnIoThread {
            activityDAO.insertAll(activities)
        }
    }

    fun updateStatusToRoom(status: Int,id: Int) {
        runOnIoThread {
            activityDAO.updateStatus(status,id)
        }
    }

    fun insertToRoom(activity: Activity) {
        runOnIoThread {
            activityDAO.insert(activity)
        }
    }

    fun insertCriteriaByActivityToRoom(criterias: List<Criteria>) {
        runOnIoThread {
            criteriaDAO.insertAll(criterias)
        }
    }

    fun updateToRoom(activity : Activity){
        runOnIoThread {
            activityDAO.update(activity)
        }
    }

    fun deleteFromRoom(activity: Activity) {
        runOnIoThread {
            activityDAO.delete(activity)
        }
    }

    fun deleteAndInsertNewUserCheckInActivity(userCheckInActivities: List<UserCheckInActivity>){
        runOnIoThread {
            userCheckInActivityDAO.deleteAll()
            userCheckInActivityDAO.insertAll(userCheckInActivities)
        }
    }

    fun deleteAndInsertNewActivity(activities: List<Activity>){
        runOnIoThread {
            activityDAO.deleteAll()
            activityDAO.insertAll(activities)
        }
    }

}