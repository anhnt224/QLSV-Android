package com.emglab.qlsv.ui.viewmodels.activity

import androidx.lifecycle.*
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.models.entity.UserCheckInActivity
import com.emglab.qlsv.repositories.activity.ActivityRepository
import com.emglab.qlsv.utilities.AbsentLiveData
import okhttp3.MultipartBody
import javax.inject.Inject


class UserCheckInActivityViewModel @Inject constructor(
    private val activityRepository: ActivityRepository
) : ViewModel() {

    var isCheckIn = false

    private val _userCheckInActivityId: MutableLiveData<UserCheckInActivityId> = MutableLiveData()
    val userCheckInActivityId: LiveData<UserCheckInActivityId>
        get() = _userCheckInActivityId

    val userCheckInActivities: LiveData<Resource<List<UserCheckInActivity>>> = Transformations
        .switchMap(_userCheckInActivityId) { input ->
            input.ifExists { aId,userCode ->
                activityRepository.getUserCheckInActivity(userCode,aId,"")
            }
        }

    fun retry() {
        val aId = userCheckInActivityId.value?.aId
        val userCode = userCheckInActivityId.value?.userCode
        if (aId != null && userCode!= null) {
            _userCheckInActivityId.value = UserCheckInActivityId(aId,userCode)
        }
    }

    fun setId(aId: Int,userCode: String) {
        val update = UserCheckInActivityId(aId,userCode)
        if (_userCheckInActivityId.value == update) {
            return
        }
        _userCheckInActivityId.value = update
    }

    data class UserCheckInActivityId(val aId: Int,val userCode: String) {
        fun <T> ifExists(f: (Int,String) -> LiveData<T>): LiveData<T> {
            return if (aId == 0 || userCode.equals("")) {
                AbsentLiveData.create()
            } else {
                f(aId,userCode)
            }
        }
    }

    val userCheckInActivityResource = MediatorLiveData<Resource<MyCTSVCap>>()
    private lateinit var _userCheckInActivityResource: LiveData<Resource<MyCTSVCap>>

    fun userCheckinActivity(AId : Int,longitude: Double, latitude: Double,address: String,Signature: String) {
        isCheckIn = true
        _userCheckInActivityResource = activityRepository.userCheckinActivity("",AId,longitude,latitude,address,Signature)
        userCheckInActivityResource.removeSource(_userCheckInActivityResource)
        userCheckInActivityResource.addSource(_userCheckInActivityResource) {
            userCheckInActivityResource.value = it
        }
    }

    val uploadImageCallResource = MediatorLiveData<Resource<MyCTSVCap>>()
    private lateinit var _uploadImageCallResource: LiveData<Resource<MyCTSVCap>>

    fun uploadFile(aId: Int,multipartBody : MultipartBody.Part) {
        isCheckIn = true
        _uploadImageCallResource = activityRepository.uploadFile(aId,multipartBody)
        uploadImageCallResource.removeSource(_uploadImageCallResource)
        uploadImageCallResource.addSource(_uploadImageCallResource) {
            uploadImageCallResource.value = it
        }
    }

//    fun userCheckinActivity(userName: String, token: String,studentId: String,AId : Int,longitude: Double, latitude: Double,address: String,Signature: String)
//            = activityRepository.userCheckinActivity(userName,token,studentId,AId,longitude,latitude,address,Signature)


}
