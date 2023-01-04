package com.emglab.qlsv.teacher.viewmodel.student

import androidx.lifecycle.*
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.FilterType
import com.emglab.qlsv.models.entity.Student
import com.emglab.qlsv.repositories.TeacherRepository
import javax.inject.Inject

class ListStudentViewModel @Inject constructor(
    private val teacherRepository: TeacherRepository
) : ViewModel() {
    data class Parameter(val semester: String,val className: String, val search: String)
    private var filterType = MediatorLiveData<FilterType>()
    var classes = MediatorLiveData<Resource<List<String>>>()
    private lateinit var liveDataGetListClass: LiveData<Resource<List<String>>>
    private val _parameter = MutableLiveData<Parameter>()
    val parameter: LiveData<Parameter>
        get() = _parameter

    val students: LiveData<Resource<List<Student>>> = Transformations
        .switchMap(_parameter){parameter ->
            if(parameter.className == "Tất cả"){
                teacherRepository.searchStudent(parameter.search)
            }else{
                teacherRepository.getListStudent(parameter.semester, parameter.className)
            }
        }
    fun getFilterType() = filterType
    fun setFilterType(type: FilterType){
        filterType.value = type
    }

    fun setParameter(semester: String, className: String, search: String){
        val update = Parameter(semester, className, search)
        _parameter.value = update
    }

    init {
        getListClasses()
    }

    fun getListClasses(){
        liveDataGetListClass = teacherRepository.getListClass()
        classes.removeSource(liveDataGetListClass)
        classes.addSource(liveDataGetListClass){
            classes.value = it
        }
    }
}