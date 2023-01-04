package com.emglab.qlsv.repositories

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.NetworkBoundResource
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.dao.ImageMotelDao
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.ImageMotel
import com.emglab.qlsv.models.entity.ImageMotel2
import com.emglab.qlsv.models.entity.Motel
import com.emglab.qlsv.models.res.CTSVMotelImageRes
import com.emglab.qlsv.models.res.CTSVSearchStudentMotelRes
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.utilities.runOnIoThread
import com.emglab.qlsv.webservices.ApiResponse
import com.emglab.qlsv.webservices.GiftWebService
import com.emglab.qlsv.webservices.WebService
import javax.inject.Inject

class MotelRepository @Inject constructor(
    private val webservice: WebService,
    private val appExecutors: AppExecutors,
    private val giftWebService: GiftWebService,
    private val sharedPrefsHelper: SharedPrefsHelper,
    private val imageMotelDao: ImageMotelDao
) {
    private val motelList = MutableLiveData<List<Motel>>()
    private val motelImageList = MutableLiveData<List<ImageMotel2>>()
    private var ctsvCapLiveData = MediatorLiveData<MyCTSVCap>()

    init {
        ctsvCapLiveData.value = MyCTSVCap()
        motelList.value = listOf()
        motelImageList.value = listOf()
    }

    fun getListMotel(
        latitude: Double,
        longitude: Double,
        distance: Int,
        shouldFetch: Boolean = true
    ): LiveData<Resource<List<Motel>>> {
        return object : NetworkBoundResource<List<Motel>, CTSVSearchStudentMotelRes>(appExecutors) {
            override fun saveCallResult(item: CTSVSearchStudentMotelRes) {
                Thread { motelList.postValue(item.studentMotelList) }.start()
                /* Log.v("_MotelRepository", "Motel List: ${motelList.value}")
                 Log.v("_MotelRepository", "Item Motel: ${item.studentMotelList}")*/
            }

            override fun shouldFetch(data: List<Motel>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<Motel>> {
                return motelList
            }

            override fun createCall(): LiveData<ApiResponse<CTSVSearchStudentMotelRes>> {
                Log.v("_MotelRepository", sharedPrefsHelper.getToken())
                return webservice.searchStudentMotel(
                    userName = sharedPrefsHelper.getUserName(),
                    tokenCode = sharedPrefsHelper.getToken(),
                    latitude = latitude,
                    longitude = longitude,
                    distance = distance
                )
            }
        }.asLiveData()
    }

    fun getMotelListImage(
        motelID: Int,
        shouldFetch: Boolean = true
    ): LiveData<Resource<List<ImageMotel2>>> {
        return object : NetworkBoundResource<List<ImageMotel2>, CTSVMotelImageRes>(appExecutors) {
            override fun saveCallResult(item: CTSVMotelImageRes) {
                Thread { motelImageList.postValue(item.imageList) }.start()
                Log.v("_MotelRepository", "Item Motel: ${item.imageList}")
            }

            override fun shouldFetch(data: List<ImageMotel2>?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<List<ImageMotel2>> {
                return motelImageList
            }

            override fun createCall(): LiveData<ApiResponse<CTSVMotelImageRes>> {
                return webservice.getImageMotel(
                    userName = sharedPrefsHelper.getUserName(),
                    token = sharedPrefsHelper.getToken(),
                    motelID = motelID
                )
            }
        }.asLiveData()
    }

    fun insertImage(image: ImageMotel) {
        runOnIoThread {
            imageMotelDao.insertImageMotel(image)
        }
    }

    fun getAllImageMotel(idMotel: Int): LiveData<List<ImageMotel>> {
        return imageMotelDao.getAllImageMotel(idMotel)
    }

    fun getImageMotelByID(idMotel: Int, type: Int): LiveData<ImageMotel> {
        return imageMotelDao.getImageMotel(idMotel, type)
    }

    fun deleteImageMotel(image: ImageMotel) {
        runOnIoThread {
            imageMotelDao.deleteImageMotel(image)
        }
    }

    fun deleteImageMotel(
        userName: String,
        token: String,
        motelID: Int,
        type: Int,
        shouldFetch: Boolean = true
    ): LiveData<Resource<MyCTSVCap>> {
        ctsvCapLiveData.value = MyCTSVCap()
        return object : NetworkBoundResource<MyCTSVCap, MyCTSVCap>(appExecutors) {
            override fun saveCallResult(item: MyCTSVCap) {
                Thread { ctsvCapLiveData.postValue(item) }.start()
            }

            override fun shouldFetch(data: MyCTSVCap?): Boolean {
                return data == null || shouldFetch
            }

            override fun loadFromDb(): LiveData<MyCTSVCap> {
                return ctsvCapLiveData
            }

            override fun createCall(): LiveData<ApiResponse<MyCTSVCap>> {
                return giftWebService.delImageMotel(userName, token, motelID, type)
            }

        }.asLiveData()
    }

}