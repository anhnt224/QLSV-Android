package com.emglab.qlsv.ui.viewmodels.job

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.JobRepository
import javax.inject.Inject

class ApplyJobViewModel @Inject constructor(
    private val jobRepository: JobRepository
) : ViewModel() {
    private lateinit var liveDataApplyJob: LiveData<Resource<MyCTSVCap>>
    val applyJob = MediatorLiveData<Resource<MyCTSVCap>> ()
    fun applyJob(id: Int, phoneNumber: String, introduction: String){
        liveDataApplyJob = jobRepository.applyJob(id, phoneNumber, introduction)
        applyJob.removeSource(liveDataApplyJob)
        applyJob.addSource(liveDataApplyJob){
            applyJob.value = it
        }
    }
}