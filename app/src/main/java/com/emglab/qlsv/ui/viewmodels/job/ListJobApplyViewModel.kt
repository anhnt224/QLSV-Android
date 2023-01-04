package com.emglab.qlsv.ui.viewmodels.job

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.Job
import com.emglab.qlsv.repositories.JobRepository
import javax.inject.Inject

class ListJobApplyViewModel @Inject constructor(
    val jobRepository: JobRepository
) : ViewModel() {
    private lateinit var liveDataGetListJobsApply: LiveData<Resource<List<Job>>>
    val listJobsApply = MediatorLiveData<Resource<List<Job>>>()

    fun getListJobApply(){
        liveDataGetListJobsApply = jobRepository.getListJobApply()
        listJobsApply.removeSource(liveDataGetListJobsApply)
        listJobsApply.addSource(liveDataGetListJobsApply){
            listJobsApply.value = it
        }
    }
}