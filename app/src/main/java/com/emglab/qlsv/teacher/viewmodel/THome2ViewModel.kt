package com.emglab.qlsv.teacher.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.models.entity.Semester
import com.emglab.qlsv.repositories.activity.ActivityRepository
import com.emglab.qlsv.repositories.criteria.CriteriaRepository
import javax.inject.Inject

class THome2ViewModel @Inject constructor(
    private val activityRepository: ActivityRepository,
    private val criteriaRepository: CriteriaRepository
) : ViewModel() {
    val activities = MediatorLiveData<Resource<List<Activity>>>()
    private lateinit var getPublicActivity: LiveData<Resource<List<Activity>>>

    val semesters = MediatorLiveData<Resource<List<Semester>>>()
    private lateinit var liveDataGetListSemester: LiveData<Resource<List<Semester>>>


    init {
        getPublicActivities()
    }

    fun getPublicActivities(){
        getPublicActivity = activityRepository.getPublicActivities()
        activities.removeSource(getPublicActivity)
        activities.addSource(getPublicActivity){
            activities.value = it
        }
    }

    fun getListSemester(){
        liveDataGetListSemester = criteriaRepository.getListSemesters()
        semesters.removeSource(liveDataGetListSemester)
        semesters.addSource(liveDataGetListSemester){
            semesters.value = it
        }
    }
}