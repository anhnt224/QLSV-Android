package com.emglab.qlsv.ui.viewmodels.job

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.Job
import com.emglab.qlsv.repositories.JobRepository
import javax.inject.Inject

class MoreJobViewModel @Inject constructor(
    private val jobRepository: JobRepository
): ViewModel() {
    val jobMediatorLiveData = MediatorLiveData<Resource<List<Job>>>()
    private lateinit var jobLivedata: LiveData<Resource<List<Job>>>

    init {
        getMoreJob()
    }
   fun getMoreJob(){
       jobLivedata = jobRepository.getListJob(4)
       jobMediatorLiveData.removeSource(jobLivedata)
       jobMediatorLiveData.addSource(jobLivedata){
           jobMediatorLiveData.value = it
       }
   }


}