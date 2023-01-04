package com.emglab.qlsv.repositories

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.NetworkBoundResource
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Job
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.models.res.job.GetListJobsResp
import com.emglab.qlsv.webservices.ApiResponse
import com.emglab.qlsv.webservices.WebService
import javax.inject.Inject

class JobRepository @Inject constructor(
    private val webservice: WebService,
    private val appExecutors: AppExecutors,
    private val sharedPrefsHelper: SharedPrefsHelper
) {
    private var liveDataGetListJobs: MutableLiveData<List<Job>> = MutableLiveData()
    private var liveDataGetListJobsApply: MutableLiveData<List<Job>> = MutableLiveData()
    private var liveDataApplyJob: MutableLiveData<MyCTSVCap> = MutableLiveData()
    init {
        liveDataGetListJobs.value = listOf()
        liveDataGetListJobsApply.value = listOf()
        liveDataApplyJob.value = MyCTSVCap()
    }
    fun getListJob(type: Int, shouldFetch: Boolean = true): LiveData<Resource<List<Job>>>{
        return object: NetworkBoundResource<List<Job>, GetListJobsResp>(appExecutors){
            override fun saveCallResult(item: GetListJobsResp) {
                Thread(Runnable { liveDataGetListJobs.postValue(item.jobs) }).start()
                Log.v("_JobRepository", "${item.jobs}")
            }

            override fun shouldFetch(data: List<Job>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Job>> {
                return liveDataGetListJobs
            }

            override fun createCall(): LiveData<ApiResponse<GetListJobsResp>> {
                return webservice.getListJobs(sharedPrefsHelper.getUserName(), sharedPrefsHelper.getToken(), type, 1, 0)
            }

        }.asLiveData()
    }

    fun getListJobApply(shouldFetch: Boolean = true): LiveData<Resource<List<Job>>>{
        return object: NetworkBoundResource<List<Job>, GetListJobsResp>(appExecutors){
            override fun saveCallResult(item: GetListJobsResp) {
                Thread(Runnable { liveDataGetListJobsApply.postValue(item.jobs) }).start()
            }

            override fun shouldFetch(data: List<Job>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Job>> {
                return liveDataGetListJobsApply
            }

            override fun createCall(): LiveData<ApiResponse<GetListJobsResp>> {
                return webservice.getListJobsApply(sharedPrefsHelper.getUserName(), sharedPrefsHelper.getUserName(), sharedPrefsHelper.getToken(), 1, 0)
            }

        }.asLiveData()
    }

    fun applyJob(id: Int, phoneNumber: String, introduction: String, shouldFetch: Boolean = true): LiveData<Resource<MyCTSVCap>>{
        return object: NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors){
            override fun saveCallResult(item: MyCTSVCap) {
                Thread(Runnable { liveDataApplyJob.postValue(item) }).start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return liveDataApplyJob
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                return webservice.applyJob(sharedPrefsHelper.getUserName(), sharedPrefsHelper.getToken(), id, phoneNumber, introduction)
            }

        }.asLiveData()
    }


}