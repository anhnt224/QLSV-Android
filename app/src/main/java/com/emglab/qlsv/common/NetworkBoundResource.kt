package com.emglab.qlsv.common

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import android.os.Handler
import android.util.Log
import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import com.emglab.qlsv.models.res.CTSVCap
import com.emglab.qlsv.webservices.ApiEmptyResponse
import com.emglab.qlsv.webservices.ApiErrorResponse
import com.emglab.qlsv.webservices.ApiResponse
import com.emglab.qlsv.webservices.ApiSuccessResponse

abstract class NetworkBoundResource<ResultType, RequestType>
@MainThread constructor(private val appExecutors: AppExecutors) {

    // The final result LiveData.
    private val result = MediatorLiveData<Resource<ResultType>>()

    init {
        // Send loading state to UI.
        result.value = Resource.loading(null)
        @Suppress("LeakingThis")
        val dbSource = loadFromDb()

        result.addSource(dbSource) { data ->
            result.removeSource(dbSource)
            if (shouldFetch(data)) {
                fetchFromNetwork(dbSource)
            } else {
                result.addSource(dbSource) { newData ->
                    setValue(Resource.successDb(newData))
                }
            }
        }
    }

    @MainThread
    private fun setValue(newValue: Resource<ResultType>) {
        if (result.value != newValue) {
            result.value = newValue
        }
    }

    // Fetch the data from network and persist into DB and then send it back to UI.
    private fun fetchFromNetwork(dbSource: LiveData<ResultType>) {
        val apiResponse = createCall()
        // We re-attach dbSource as a new source, it will dispatch its latest value quickly.
        result.addSource(dbSource) { newData ->
            setValue(Resource.loading(newData))
        }
        Log.d("_RE", result.toString())

        // Create inner function as we want to delay it.
        fun fetch() {
            result.addSource(apiResponse) { response ->
                result.removeSource(apiResponse)
                result.removeSource(dbSource)
                Log.d("_RE", response.toString())
                when (response) {
                    is ApiSuccessResponse -> {
                        appExecutors.diskIO().execute {
                            val body = processResponse(response)
                            saveCallResult(body)
                            appExecutors.mainThread().execute {

                                // We specially request a new live data,
                                // otherwise we will get immediately last cached value,
                                // which may not be updated with latest results received from network.
                                when ((body as CTSVCap).respCode){
                                    0->{
                                        result.addSource(loadFromDb()) { newData ->
                                            setValue(Resource.successNetwork(newData))
                                        }
                                    }
                                    104,105,-1->{
                                        result.addSource(loadFromDb()) { newData ->
                                            setValue(Resource.errorToken())
                                        }
                                    }
                                    null->{
                                        result.addSource(loadFromDb()) { newData ->
                                            setValue(
                                                Resource.error("", null)
                                            )
                                        }
                                    }
                                    else ->{
                                        result.addSource(loadFromDb()) { newData ->
                                            setValue(
                                                Resource.error(
                                                    body.respText!!,
                                                    newData
                                                )
                                            )
                                        }
                                    }
                                }


                            }
                        }
                    }
                    is ApiEmptyResponse -> {
                        appExecutors.mainThread().execute {
                            // reload from disk whatever we had
                            result.addSource(loadFromDb()) { newData ->
                                setValue(Resource.successDb(newData))
                            }
                        }
                    }
                    is ApiErrorResponse -> {
                        onFetchFailed()
                        result.addSource(dbSource) { newData ->
                            setValue(Resource.error("Lỗi kết nối", newData))
                        }
                    }
                }
            }
        }

        // Add delay before call if needed.
        val delay = fetchDelayMillis()
        if (delay > 0) {
            Handler().postDelayed({ fetch() }, delay)
        } else fetch()

    }

    // Called when the fetch fails. The child class may want to reset components
    // like rate limiter.
    protected open fun onFetchFailed() {}

    // Returns a LiveData object that represents the resource that's implemented
    // in the base class.
    fun asLiveData() = result as LiveData<Resource<ResultType>>

    @WorkerThread
    protected open fun processResponse(response: ApiSuccessResponse<RequestType>) = response.body

    // Called to save the result of the API response into the database.
    @WorkerThread
    protected abstract fun saveCallResult(item: RequestType)

    // Called with the data in the database to decide whether to fetch
    // potentially updated data from the network.
    @MainThread
    protected abstract fun shouldFetch(data: ResultType?): Boolean

    // Make a call to the server after some delay for better user experience.
    protected open fun fetchDelayMillis(): Long = 0

    // Called to get the cached data from the database.
    @MainThread
    protected abstract fun loadFromDb(): LiveData<ResultType>

    // Called to create the API call.
    @MainThread
    protected abstract fun createCall(): LiveData<ApiResponse<RequestType>>
}
