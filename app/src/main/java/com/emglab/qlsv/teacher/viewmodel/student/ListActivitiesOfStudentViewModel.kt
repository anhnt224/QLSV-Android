package com.emglab.qlsv.teacher.viewmodel.student

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.repositories.TeacherRepository
import javax.inject.Inject

class ListActivitiesOfStudentViewModel @Inject constructor(
    private val teacherRepository: TeacherRepository
) : ViewModel() {
    val activities = MediatorLiveData<Resource<List<Activity>>>()
    private lateinit var liveDataGetListActivities: LiveData<Resource<List<Activity>>>

    fun getListActivities(studentID: String){
        liveDataGetListActivities = teacherRepository.getActivityByStudent(studentID)
        activities.removeSource(liveDataGetListActivities)
        activities.addSource(liveDataGetListActivities){
            activities.value = it
        }
    }
}