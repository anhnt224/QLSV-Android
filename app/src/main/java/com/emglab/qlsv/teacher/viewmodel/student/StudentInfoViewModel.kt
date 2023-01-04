package com.emglab.qlsv.teacher.viewmodel.student

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.StudentInfo
import com.emglab.qlsv.repositories.TeacherRepository
import javax.inject.Inject

class StudentInfoViewModel @Inject constructor(
    private val teacherRepository: TeacherRepository
) : ViewModel() {
    val studentInfo = MediatorLiveData<Resource<StudentInfo>>()
    private lateinit var liveDataGetStudentInfo: LiveData<Resource<StudentInfo>>

    fun getStudentInfo(studentID: String){
        liveDataGetStudentInfo = teacherRepository.getStudentInfo(studentID)
        studentInfo.removeSource(liveDataGetStudentInfo)
        studentInfo.addSource(liveDataGetStudentInfo){
            studentInfo.value = it
        }
    }
}