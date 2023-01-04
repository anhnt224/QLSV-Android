package com.emglab.qlsv.ui.viewmodels.activity

import androidx.lifecycle.*
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.activity.ActivityRepository
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.Criteria
import com.emglab.qlsv.repositories.criteria.CriteriaRepository
import com.emglab.qlsv.utilities.AbsentLiveData
import javax.inject.Inject


class ActivityDetailByUserUnitViewModel @Inject constructor(
    private val activityRepository: ActivityRepository,
    private val criteriaRepository: CriteriaRepository
) : ViewModel() {


    var isAssignUserActivity = false

    private val _activityByAId: MutableLiveData<ActivityAId> = MutableLiveData()
    val activityByAId: LiveData<ActivityAId>
        get() = _activityByAId

    val activity: LiveData<Resource<Activity>> = Transformations
        .switchMap(_activityByAId) { input ->
            input.ifExists { aId ->
                activityRepository.getActivityById(aId)
            }
        }

    val criterias: LiveData<List<Criteria>> = Transformations
        .switchMap(_activityByAId) { input ->
            input.ifExists { aId ->
                criteriaRepository.getCriteriaByAId(aId)
            }
        }

    fun setId(aId: Int) {
        val update = ActivityAId(aId)
        if (_activityByAId.value == update) {
            return
        }
        _activityByAId.value = update
    }

    fun retry() {
        val gId = _activityByAId.value?.aId
        if (gId != null ) {
            _activityByAId.value = ActivityAId(gId)
        }
    }

    data class ActivityAId(val aId: Int) {
        fun <T> ifExists(f: (Int) -> LiveData<T>): LiveData<T> {
            return if (aId == 0 ) {
                AbsentLiveData.create()
            } else {
                f(aId)
            }
        }
    }

    val assignUserActivityResource = MediatorLiveData<Resource<MyCTSVCap>>()
    private lateinit var _assignUserActivityResource: LiveData<Resource<MyCTSVCap>>
    

    fun assignUserActivity(reason: String,AId : Int,UserRole: Int,CheckInPlace: String,UAStatus:Int,Signature: String) {
        isAssignUserActivity = true
        _assignUserActivityResource = activityRepository.assignUserActivity(reason,AId,UserRole,CheckInPlace,UAStatus,Signature)
        assignUserActivityResource.removeSource(_assignUserActivityResource)
        assignUserActivityResource.addSource(_assignUserActivityResource) {
            assignUserActivityResource.value = it
        }
    }

}
