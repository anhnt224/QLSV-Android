package com.emglab.qlsv.teacher.viewmodel.job

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.Job
import com.emglab.qlsv.models.entity.JobType
import com.emglab.qlsv.repositories.JobRepository
import javax.inject.Inject

class TListJobsViewModel @Inject constructor(
    private val jobRepository: JobRepository
): ViewModel() {
    private val _jobType = MutableLiveData<JobType>()
    init {
        _jobType.value = JobType.HOT
    }
    var jobs: LiveData<Resource<List<Job>>> = Transformations.switchMap(_jobType){ jobType ->
        when(jobType){
            JobType.HOT -> jobRepository.getListJob(1)
            JobType.NEW -> jobRepository.getListJob(2)
            JobType.INTERSHIP -> jobRepository.getListJob(3)
            JobType.PARTTIME -> jobRepository.getListJob(4)
        }
    }

    fun setJobType(type: JobType){
        _jobType.value = type
    }

    fun getJobType(): LiveData<JobType> {
        return _jobType
    }
}