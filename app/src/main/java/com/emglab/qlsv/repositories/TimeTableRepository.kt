package com.emglab.qlsv.repositories

import androidx.lifecycle.LiveData
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.NetworkBoundResource
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.dao.TimetableDAO
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Subject
import com.emglab.qlsv.models.res.timetable.GetTimeTableResp
import com.emglab.qlsv.utilities.runOnIoThread
import com.emglab.qlsv.webservices.ApiResponse
import com.emglab.qlsv.webservices.TimeTableWebService
import javax.inject.Inject

class TimeTableRepository @Inject constructor(
    private val timetableWebService: TimeTableWebService,
    private val appExecutors: AppExecutors,
    private val sharedPrefsHelper: SharedPrefsHelper,
    private val timetableDAO: TimetableDAO
) {
    fun getTimeTable(shouldFetch: Boolean = true): LiveData<Resource<List<Subject>>>{
        return object: NetworkBoundResource<List<Subject>, GetTimeTableResp>(appExecutors = appExecutors) {
            override fun saveCallResult(item: GetTimeTableResp) {
                if(item.subjects.isNotEmpty()){
                    runOnIoThread {
                        timetableDAO.deleteAll()
                        timetableDAO.insertAll(subjects = item.subjects)
                    }
                }
            }

            override fun shouldFetch(data: List<Subject>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Subject>> {
                return  timetableDAO.getAll()
            }

            override fun createCall(): LiveData<ApiResponse<GetTimeTableResp>> {
                return timetableWebService.getTimeTable(userName = sharedPrefsHelper.getUserName(), userCode = sharedPrefsHelper.getUserName(), tokenCode = sharedPrefsHelper.getToken())
            }

        }.asLiveData()
    }
}