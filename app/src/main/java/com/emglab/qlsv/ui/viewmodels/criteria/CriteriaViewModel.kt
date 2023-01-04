package com.emglab.qlsv.ui.viewmodels.criteria

import androidx.lifecycle.*
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.CriteriaType
import com.emglab.qlsv.models.entity.Semester
import com.emglab.qlsv.models.entity.UserCriteriaActivity
import com.emglab.qlsv.models.entity.UserCriteriaDetail
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.criteria.CriteriaRepository
import javax.inject.Inject

class CriteriaViewModel @Inject constructor(
    private val criteriaRepository: CriteriaRepository
) : ViewModel() {
    private val _semester = MutableLiveData<Semester>()

    fun getSemester(): LiveData<Semester>{
        return _semester
    }

    fun setSemester(semester: Semester){
        _semester.value = semester
    }

    private val _userCriteriaDetail = MutableLiveData<UserCriteriaDetail>()
    fun setUserCriteriaDetail(value: UserCriteriaDetail){
        _userCriteriaDetail.value = value
    }
    fun getUserCriteriaDetail(): LiveData<UserCriteriaDetail>{
        return _userCriteriaDetail
    }

    val criteriaTypes: LiveData<Resource<List<CriteriaType>>> = Transformations.switchMap(_semester){
        criteriaRepository.getListCriteriaTypes(it.name)
    }

    val activities : LiveData<Resource<List<UserCriteriaActivity>>> = Transformations.switchMap(_userCriteriaDetail){
        criteriaRepository.getListActivitiesByCId(it.cID)
    }

    val markCriteriaUser = MediatorLiveData<Resource<MyCTSVCap>>()
    private lateinit var liveDataMarkCriteriaUser: LiveData<Resource<MyCTSVCap>>
    fun markCriteriaUser(semester: String, criteriaTypes: List<CriteriaType>){
        liveDataMarkCriteriaUser = criteriaRepository.markCriteriaUser(semester, criteriaTypes)
        markCriteriaUser.removeSource(liveDataMarkCriteriaUser)
        markCriteriaUser.addSource(liveDataMarkCriteriaUser){
            markCriteriaUser.value = it
        }
    }
}