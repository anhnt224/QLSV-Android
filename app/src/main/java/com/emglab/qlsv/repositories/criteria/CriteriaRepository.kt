package com.emglab.qlsv.repositories.criteria

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.NetworkBoundResource
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.dao.CriteriaDAO
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.*
import com.emglab.qlsv.models.req.MarkCriteriaUserReq
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.models.res.criteria.*
import com.emglab.qlsv.utilities.runOnIoThread
import com.emglab.qlsv.webservices.ApiResponse
import com.emglab.qlsv.webservices.WebService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CriteriaRepository @Inject constructor(
    private val criteriaDAO: CriteriaDAO,
    private val webservice: WebService,
    private val appExecutors: AppExecutors,
    private val sharedPrefsHelper: SharedPrefsHelper)
{

    private var userDetail = MediatorLiveData<UserDetail>()
    private var listSemesters = MediatorLiveData<List<Semester>>()
    private var criteriaReports = MediatorLiveData<List<CriteriaReport>>()
    private var criteriaTypes = MediatorLiveData<List<CriteriaType>>()
    private var activities = MediatorLiveData<List<UserCriteriaActivity>>()
    private var markCriteriaUser = MediatorLiveData<MyCTSVCap>()

    init {
        userDetail.value = UserDetail(listOf())
        listSemesters.value = listOf()
        criteriaReports.value = listOf()
        criteriaTypes.value = listOf()
        activities.value = listOf()
        markCriteriaUser.value = MyCTSVCap()
    }


    fun getUserDetail(shouldFetch: Boolean = true): LiveData<Resource<UserDetail>>{
        return object : NetworkBoundResource<UserDetail, GetUserDetailResp>(appExecutors){
            override fun saveCallResult(item: GetUserDetailResp) {
                Thread(Runnable { userDetail.postValue(item.userDetail) }).start()
            }

            override fun shouldFetch(data: UserDetail?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<UserDetail> {
                return userDetail
            }

            override fun createCall(): LiveData<ApiResponse<GetUserDetailResp>> {
                return webservice.getUserDetail(userName = sharedPrefsHelper.getUserName(), tokenCode = sharedPrefsHelper.getToken(), userCode = sharedPrefsHelper.getUserName())
            }

        }.asLiveData()
    }

    fun getListSemesters(shouldFetch: Boolean = true): LiveData<Resource<List<Semester>>>{
        return object: NetworkBoundResource<List<Semester>, GetListSemesters>(appExecutors){
            override fun saveCallResult(item: GetListSemesters) {
                Thread { listSemesters.postValue(item.semesters) }.start()
            }

            override fun shouldFetch(data: List<Semester>?): Boolean {
                return shouldFetch || data == null
            }

            override fun loadFromDb(): LiveData<List<Semester>> {
                return listSemesters
            }

            override fun createCall(): LiveData<ApiResponse<GetListSemesters>> {
                return webservice.getListSemester(sharedPrefsHelper.getUserName(), sharedPrefsHelper.getToken())
            }

        }.asLiveData()
    }

    fun getCriteriaReports(semester: String, shouldFetch: Boolean = true): LiveData<Resource<List<CriteriaReport>>>{
        return object : NetworkBoundResource<List<CriteriaReport>, GetCriteriaReportResp>(appExecutors){
            override fun saveCallResult(item: GetCriteriaReportResp) {
                Thread(Runnable { criteriaReports.postValue(item.criteriaReports) }).start()
            }

            override fun shouldFetch(data: List<CriteriaReport>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<CriteriaReport>> {
                return criteriaReports
            }

            override fun createCall(): LiveData<ApiResponse<GetCriteriaReportResp>> {
                return webservice.getCriteriaReport(sharedPrefsHelper.getUserName(), sharedPrefsHelper.getToken(), semester)
            }

        }.asLiveData()
    }

    fun getListCriteriaTypes(semester: String, shouldFetch: Boolean = true): LiveData<Resource<List<CriteriaType>>>{
        return object: NetworkBoundResource<List<CriteriaType>, GetListCriteriaTypesResp>(appExecutors){
            override fun saveCallResult(item: GetListCriteriaTypesResp) {
                Thread(Runnable { criteriaTypes.postValue(item.criteriaTypes) }).start()
            }

            override fun shouldFetch(data: List<CriteriaType>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<CriteriaType>> {
                return criteriaTypes
            }

            override fun createCall(): LiveData<ApiResponse<GetListCriteriaTypesResp>> {
                return webservice.getListCriteriaTypes(sharedPrefsHelper.getUserName(), sharedPrefsHelper.getToken(), sharedPrefsHelper.getUserName(), semester)
            }

        }.asLiveData()
    }

    fun getListActivitiesByCId(cID: Int, shouldFetch: Boolean = true): LiveData<Resource<List<UserCriteriaActivity>>>{
        activities.value = listOf()
        return object: NetworkBoundResource<List<UserCriteriaActivity>, GetListActivitiesByCId>(appExecutors){
            override fun saveCallResult(item: GetListActivitiesByCId) {
                Thread(Runnable { activities.postValue(item.activities) }).start()
            }

            override fun shouldFetch(data: List<UserCriteriaActivity>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<UserCriteriaActivity>> {
                return activities
            }

            override fun createCall(): LiveData<ApiResponse<GetListActivitiesByCId>> {
                return webservice.getListActivitiesByCId(sharedPrefsHelper.getUserName(), sharedPrefsHelper.getToken(), sharedPrefsHelper.getUserName(), cID)
            }

        }.asLiveData()
    }

    fun markCriteriaUser(semester: String, criteriaTypes: List<CriteriaType>, shouldFetch: Boolean = true): LiveData<Resource<MyCTSVCap>>{
        return object : NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors){
            override fun saveCallResult(item: MyCTSVCap) {
                Thread(Runnable { markCriteriaUser.postValue(item) }).start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return markCriteriaUser
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                val markCriteriaUserReq = MarkCriteriaUserReq(sharedPrefsHelper.getUserName(), sharedPrefsHelper.getUserName(), sharedPrefsHelper.getToken(), semester, criteriaTypes)
                return webservice.markCriteriaUser(markCriteriaUserReq)
            }

        }.asLiveData()
    }


    fun getCriteriaByCGId(CGId : Int) = criteriaDAO.getCriteriaByCGId(CGId)

    fun getCriteriaByAId(AId: Int) = criteriaDAO.getCriteriaByAId(AId)

    fun insertToRoom(criteria: Criteria) {
        runOnIoThread {
            criteriaDAO.insert(criteria)
        }
    }

    fun updateToRoom(criteria : Criteria){
        runOnIoThread {
            criteriaDAO.update(criteria)
        }
    }

    fun deleteFromRoom(criteria: Criteria) {
        runOnIoThread {
            criteriaDAO.delete(criteria)
        }
    }

}