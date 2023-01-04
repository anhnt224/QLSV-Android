package com.emglab.qlsv.repositories.group

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.emglab.qlsv.dao.SVGroupDAO
import com.emglab.qlsv.models.entity.SVGroup
import com.emglab.qlsv.models.res.group.CTSVGetSVGroupRes
import com.emglab.qlsv.utilities.runOnIoThread
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.NetworkBoundResource
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.models.res.activity.CTSVAssignUserActivityByEmailRes
import com.emglab.qlsv.models.res.group.CTSVGetSVGroupByIdRes
import com.emglab.qlsv.webservices.ApiResponse
import com.emglab.qlsv.webservices.WebService

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SVGroupRepository @Inject constructor(
    private val svGroupDAO: SVGroupDAO,
    private val webservice: WebService,
    private val appExecutors: AppExecutors)
{

    private var svGroupsLiveData  = MediatorLiveData<List<SVGroup>>()
    private var childSvGroupsLiveData = MediatorLiveData<List<SVGroup>>()
    private var svGroupByIdLiveData  = MediatorLiveData<SVGroup>()
    private var svGroupByUserLiveData  = MediatorLiveData<List<SVGroup>>()
    private var svGroupByUserAdminLiveData  = MediatorLiveData<List<SVGroup>>()
    private var ctsvCapLiveData  = MediatorLiveData<MyCTSVCap>()

    init {
        svGroupByUserLiveData.value = ArrayList()
        svGroupsLiveData.value = ArrayList()
        svGroupByUserAdminLiveData.value = ArrayList()
        childSvGroupsLiveData.value = ArrayList()
        svGroupByIdLiveData.value = SVGroup()
        ctsvCapLiveData.value = MyCTSVCap()
    }

    fun getSVGroup(userName: String, token: String, shouldFetch: Boolean = true, callDelay: Long = 0) : LiveData<Resource<List<SVGroup>>> {

        return object : NetworkBoundResource<List<SVGroup>, CTSVGetSVGroupRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetSVGroupRes) {
                if (item.svGroups != null){
                    Thread(Runnable { svGroupsLiveData.postValue(item.svGroups) }).start()
                }
            }
            override fun shouldFetch(data: List<SVGroup>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<SVGroup>> {
                return svGroupsLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetSVGroupRes>> =
                webservice.getSVGroup(userName,token)

        }.asLiveData()
    }

    fun getSVGroupById(userName: String, token: String,gId:Int, shouldFetch: Boolean = true, callDelay: Long = 0) : LiveData<Resource<SVGroup>> {

        return object : NetworkBoundResource<SVGroup, CTSVGetSVGroupByIdRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetSVGroupByIdRes) {
                if (item.svGroupInfo != null){
                    Thread(Runnable { svGroupByIdLiveData.postValue(item.svGroupInfo) }).start()
                }
            }

            override fun shouldFetch(data: SVGroup?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<SVGroup> {
                return svGroupByIdLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetSVGroupByIdRes>> =
                webservice.getSVGroupById(userName,token,gId)

        }.asLiveData()
    }

    fun getChildGroupByGId(userName: String, token: String,gId:Int, shouldFetch: Boolean = true, callDelay: Long = 0) : LiveData<Resource<List<SVGroup>>> {

        return object : NetworkBoundResource<List<SVGroup>, CTSVGetSVGroupRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetSVGroupRes) {
                if (item.svGroups != null){
                    Thread(Runnable { childSvGroupsLiveData.postValue(item.svGroups) }).start()
                }
            }

            override fun shouldFetch(data: List<SVGroup>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<SVGroup>> {
                return childSvGroupsLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetSVGroupRes>> =
                webservice.getChildGroupByGId(userName,token,gId)

        }.asLiveData()
    }

    fun getSVGroupByUserAdmin(userName: String, token: String,userCode: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<List<SVGroup>>> {

        return object : NetworkBoundResource<List<SVGroup>, CTSVGetSVGroupRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetSVGroupRes) {
                if (item.svGroups != null){
                    Thread(Runnable { svGroupByUserAdminLiveData.postValue(item.svGroups) }).start()
                }
            }

            override fun shouldFetch(data: List<SVGroup>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<SVGroup>> {
                return svGroupByUserAdminLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetSVGroupRes>> =
                webservice.getSVGroupByUserAdmin(userName,token,userCode)

        }.asLiveData()
    }

    fun getSVGroupByUser(userName: String, token: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<List<SVGroup>>> {

        return object : NetworkBoundResource<List<SVGroup>, CTSVGetSVGroupRes>(appExecutors) {

            override fun saveCallResult(item: CTSVGetSVGroupRes) {
                if (item.svGroups != null){
                    Thread(Runnable { svGroupByUserLiveData.postValue(item.svGroups) }).start()
                }
            }

            override fun shouldFetch(data: List<SVGroup>?): Boolean {
                return data == null || shouldFetch
            }

            override fun fetchDelayMillis(): Long {
                return callDelay
            }

            override fun loadFromDb(): LiveData<List<SVGroup>> {
                return svGroupByUserLiveData
            }

            override fun createCall(): LiveData<ApiResponse<CTSVGetSVGroupRes>> =
                webservice.getSVGroupByUser(userName,token)

        }.asLiveData()
    }

    fun addUserGroup(userName: String,usercode: String, token: String,reason: String,gId : Int,userRole: Int,ugStatus:Int,signature: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<MyCTSVCap>> {
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
                webservice.addUserGroup(userName,usercode,token,reason,gId,userRole,ugStatus,signature)

        }.asLiveData()
    }

    fun addUserGroupByEmail(userName: String,email: String, token: String,reason: String,gId : Int,userRole: Int,ugStatus:Int,signature: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<MyCTSVCap>> {
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
                webservice.addUserGroupByEmail(userName,email,token,reason,gId,userRole,ugStatus,signature)

        }.asLiveData()
    }

    fun approveUserGroup(userName: String, token: String,usercode: String,gId : Int,userRole: Int,Signature: String, shouldFetch: Boolean = true, callDelay: Long = 0) :  LiveData<Resource<MyCTSVCap>> {
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
                webservice.approveUserGroup(userName,token,usercode,gId,userRole,Signature)

        }.asLiveData()
    }

//    private val _approveLstUserGroup = MutableLiveData<Event<CommonResp>>()
//    val approveLstUserGroup : LiveData<Event<CommonResp>>
//        get() = _approveLstUserGroup
//    fun successApproveLstUserGroupResp(itemId: CommonResp) {
//        _approveLstUserGroup.value = Event(itemId)  // Trigger the event by setting a new Event as a new value
//    }
//
//    fun approveLstUserGroup(userName: String, token: String,UserCodeLst: String,GId : Int,Signature: String) {
//        webservice.approveLstUserGroup(userName,token,UserCodeLst,GId,Signature).enqueue(object : Callback<JsonObject> {
//
//            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
//                if(response.isSuccessful()){
//                    val jsonObject = response.body()
//
//                    val commonResp : CommonResp = gson.fromJson(jsonObject,
//                        CommonResp::class.java)
//                    successApproveLstUserGroupResp(commonResp)
//                }
//            }
//
//            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
//                val commonResp = CommonResp(RESP_CODE_ERROR, InjectorUtils.ERROR_NETWORK, "")
//                successApproveLstUserGroupResp(commonResp)
//            }
//        })
//    }

    private fun insertAllToRoom(svGroups: List<SVGroup>) {
        runOnIoThread {
            svGroupDAO.insertAll(svGroups)
        }
    }

    fun insertToRoom(svGroup: SVGroup) {
        runOnIoThread {
            svGroupDAO.insert(svGroup)
        }
    }

    fun updateToRoom(svGroup : SVGroup){
        runOnIoThread {
            svGroupDAO.update(svGroup)
        }
    }

    fun deleteFromRoom(svGroup: SVGroup) {
        runOnIoThread {
            svGroupDAO.delete(svGroup)
        }
    }

//    private val _createSVGroupResp = MutableLiveData<Event<CommonResp>>()
//    val createSVGroupResp : LiveData<Event<CommonResp>>
//        get() = _createSVGroupResp
//    fun successCreateSVGroup(itemId: CommonResp) {
//        _createSVGroupResp.value = Event(itemId)  // Trigger the event by setting a new Event as a new value
//    }
//
//    fun createSVGroup(svGroup: SVGroup, studentId: String, token: String){
//        val jobj = JsonObject()
//        jobj.addProperty("UserName",studentId)
//        jobj.addProperty("TokenCode",token)
//        jobj.add("SVGroupInfo", gson.toJsonTree(svGroup))
//
//        webservice.addNewSVGroup(jobj).enqueue(object : Callback<JsonObject> {
//
//            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
//                if(response.isSuccessful()){
//                    val jsonObject = response.body()
//                    val commonResp : CommonResp = gson.fromJson(jsonObject,
//                        CommonResp::class.java)
//                    successCreateSVGroup(commonResp)
//                }
//            }
//            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
//                val common = CommonResp(RESP_CODE_ERROR, InjectorUtils.ERROR_NETWORK, "")
//                successCreateSVGroup(common)
//            }
//        })
//    }
//
//    private val _updateSVGroupResp = MutableLiveData<Event<CommonResp>>()
//    val updateSVGroupResp : LiveData<Event<CommonResp>>
//        get() = _updateSVGroupResp
//    fun successUdateSVGroup(itemId: CommonResp) {
//        _createSVGroupResp.value = Event(itemId)  // Trigger the event by setting a new Event as a new value
//    }
//
//    fun updateSVGroup(svGroup: SVGroup, studentId: String, token: String){
//        val jobj = JsonObject()
//        jobj.addProperty("UserName",studentId)
//        jobj.addProperty("TokenCode",token)
//        jobj.add("SVGroupInfo", gson.toJsonTree(svGroup))
//
//        webservice.updateSVGroup(jobj).enqueue(object : Callback<JsonObject> {
//
//            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
//                if(response.isSuccessful()){
//                    val jsonObject = response.body()
//                    val commonResp : CommonResp = gson.fromJson(jsonObject,
//                        CommonResp::class.java)
//                    successUdateSVGroup(commonResp)
//                }
//            }
//            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
//                val common = CommonResp(RESP_CODE_ERROR, InjectorUtils.ERROR_NETWORK, "")
//                successUdateSVGroup(common)
//            }
//        })
//    }
}