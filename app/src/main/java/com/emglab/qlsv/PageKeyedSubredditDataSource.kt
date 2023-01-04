///*
// * Copyright (C) 2017 The Android Open Source Project
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package com.emglab.qlsv
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.paging.PageKeyedDataSource
//import com.emglab.qlsv.common.AppExecutors
//import com.emglab.qlsv.common.NetworkBoundResource
//import com.emglab.qlsv.models.entity.Activity
//import com.emglab.qlsv.models.res.activity.CTSVGetActivityByUserRes
//import com.emglab.qlsv.webservices.ApiResponse
//import com.emglab.qlsv.webservices.WebService
//
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import java.io.IOException
//import java.util.concurrent.Executor
//
///**
// * A data source that uses the before/after keys returned in page requests.
// * <p>
// * See ItemKeyedSubredditDataSource
// */
//class PageKeyedSubredditDataSource(
//        private val service: WebService,
//        private val subredditName: String,
//        private val retryExecutor: AppExecutors
//) : PageKeyedDataSource<Int, Activity>() {
//    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, Activity>) {
//
//        var a = object : NetworkBoundResource<List<Activity>, CTSVGetActivityByUserRes>(retryExecutor) {
//
//            override fun saveCallResult(item: CTSVGetActivityByUserRes) {
//                if (item.activities != null){
//                    //Thread(Runnable { activitiesByUserLiveData.postValue(item.user) }).start()
//                    val key = if (params.key > 1) params.key - 1 else 0
//                    callback.onResult(item.activities , key)
//                }
//            }
//
//            override fun shouldFetch(data: List<Activity>?): Boolean {
//                return data == null || shouldFetch
//            }
//
//            override fun fetchDelayMillis(): Long {
//                return callDelay
//            }
//
//            override fun loadFromDb(): LiveData<List<Activity>> {
//                return activityDAO.getAll2()
//            }
//
//            override fun createCall(): LiveData<ApiResponse<CTSVGetActivityByUserRes>> =
//                webservice.getActivityByUser(sharedPrefsHelper.getUserName(),sharedPrefsHelper.getToken(),sharedPrefsHelper.getUserName())
//
//        }.asLiveData()
//
//        val call = service.getActivityByUser(params.key)
//        call.enqueue(object : Callback<CTSVGetActivityByUserRes> {
//            override fun onResponse(call: Call<CTSVGetActivityByUserRes>, response: Response<CTSVGetActivityByUserRes>) {
//                if (response.isSuccessful) {
//                    val apiResponse = response.body()!!
//                    val responseItems = apiResponse.activities
//                    val key = if (params.key > 1) params.key - 1 else 0
//                    responseItems?.let {
//                        callback.onResult(responseItems, key)
//                    }
//                }
//            }
//            override fun onFailure(call: Call<CTSVGetActivityByUserRes>, t: Throwable) {
//            }
//        })
//    }
//    override fun loadInitial(params: LoadInitialParams<Int>, callback: LoadInitialCallback<Int, Activity>) {
//        val service = ApiServiceBuilder.buildService(ApiService::class.java)
//        val call = service.getUsers(FIRST_PAGE)
//        call.enqueue(object : Callback<CTSVGetActivityByUserRes> {
//            override fun onResponse(call: Call<CTSVGetActivityByUserRes>, response: Response<CTSVGetActivityByUserRes>) {
//                if (response.isSuccessful) {
//                    val apiResponse = response.body()!!
//                    val responseItems = apiResponse.activities
//                    responseItems?.let {
//                        callback.onResult(responseItems, null, FIRST_PAGE + 1)
//                    }
//                }
//            }
//            override fun onFailure(call: Call<CTSVGetActivityByUserRes>, t: Throwable) {
//            }
//        })
//    }
//    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, Activity>) {
//        val service = ApiServiceBuilder.buildService(ApiService::class.java)
//        val call = service.getUsers(params.key)
//        call.enqueue(object : Callback<CTSVGetActivityByUserRes> {
//            override fun onResponse(call: Call<CTSVGetActivityByUserRes>, response: Response<CTSVGetActivityByUserRes>) {
//                if (response.isSuccessful) {
//                    val apiResponse = response.body()!!
//                    val responseItems = apiResponse.activities
//                    val key = params.key + 1
//                    responseItems?.let {
//                        callback.onResult(responseItems, key)
//                    }
//                }
//            }
//            override fun onFailure(call: Call<CTSVGetActivityByUserRes>, t: Throwable) {
//            }
//        })
//    }
//    companion object {
//        const val PAGE_SIZE = 6
//        const val FIRST_PAGE = 1
//    }
//}