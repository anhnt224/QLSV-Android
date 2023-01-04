package com.emglab.qlsv.modules.searchMotel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.NetworkBoundResource
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Motel
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.modules.searchMotel.model.GetMotelResultsResp
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistration
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistrationListResp
import com.emglab.qlsv.modules.searchMotel.model.RegisterMotelReq
import com.emglab.qlsv.webservices.ApiResponse
import com.emglab.qlsv.webservices.WebService
import javax.inject.Inject

class MotelRegistrationRepository @Inject constructor(
    private val webservice: WebService,
    private val appExecutors: AppExecutors,
    private val sharedPrefsHelper: SharedPrefsHelper
) {
    private val motelRegistrationList = MutableLiveData<List<MotelRegistration>>()
    private val registerMotelResp = MutableLiveData<MyCTSVCap>()
    private val deleteMotelRegistrationResp = MutableLiveData<MyCTSVCap>()
    private val motelList = MutableLiveData<List<Motel>>()

    init {
        motelRegistrationList.value = listOf()
        registerMotelResp.value = MyCTSVCap()
        deleteMotelRegistrationResp.value = MyCTSVCap()
        motelList.value = listOf()
    }

    fun getMotelRegistrationList(
        startTime: String,
        endTime: String,
        shouldFetch: Boolean = true
    ): LiveData<Resource<List<MotelRegistration>>> {
        return object :
            NetworkBoundResource<List<MotelRegistration>, MotelRegistrationListResp>(appExecutors) {
            override fun saveCallResult(item: MotelRegistrationListResp) {
                Thread {
                    motelRegistrationList.postValue(item.motelRegistrationList)
                }.start()
            }

            override fun shouldFetch(data: List<MotelRegistration>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<MotelRegistration>> {
                return motelRegistrationList
            }

            override fun createCall(): LiveData<ApiResponse<MotelRegistrationListResp>> {
                return webservice.getMotelRegistrationList(
                    userName = sharedPrefsHelper.getUserName(),
                    token = sharedPrefsHelper.getToken(),
                    startTime = startTime,
                    endTime = endTime
                )
            }

        }.asLiveData()
    }

    fun registerMotel(
        motelRegistration: MotelRegistration,
        shouldFetch: Boolean = true
    ): LiveData<Resource<MyCTSVCap>> {
        return object : NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors) {
            override fun saveCallResult(item: MyCTSVCap) {
                Thread {
                    registerMotelResp.postValue(item)
                }.start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return registerMotelResp
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                val req = RegisterMotelReq(
                    username = sharedPrefsHelper.getUserName(),
                    token = sharedPrefsHelper.getToken(),
                    motelRegistration = motelRegistration
                )
                return webservice.registerMotel(req)
            }

        }.asLiveData()
    }

    fun deleteMotelRegistration(
        id: Int , shouldFetch: Boolean = true
    ): LiveData<Resource<MyCTSVCap>> {
        return object: NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors){
            override fun saveCallResult(item: MyCTSVCap) {
                Thread{
                    deleteMotelRegistrationResp.postValue(item)
                }.start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return deleteMotelRegistrationResp
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                return webservice.deleteMotelRegistration(
                    userName = sharedPrefsHelper.getUserName(),
                    token = sharedPrefsHelper.getToken(),
                    docID = id
                )
            }

        }.asLiveData()
    }

    fun getListMotelResults(
        registerID: Int, shouldFetch: Boolean = true
    ): LiveData<Resource<List<Motel>>> {
        return object : NetworkBoundResource<List<Motel>, GetMotelResultsResp>(appExecutors){
            override fun saveCallResult(item: GetMotelResultsResp) {
                Thread{
                    motelList.postValue(item.motelList)
                }.start()
            }

            override fun shouldFetch(data: List<Motel>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Motel>> {
                return motelList
            }

            override fun createCall(): LiveData<ApiResponse<GetMotelResultsResp>> {
                return webservice.getListMotelResults(
                    userName = sharedPrefsHelper.getUserName(),
                    token = sharedPrefsHelper.getToken(),
                    registerID = registerID
                )
            }

        }.asLiveData()
    }

}