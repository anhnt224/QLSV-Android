package com.emglab.qlsv.ui.viewmodels.form

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.Form
import com.emglab.qlsv.repositories.FormRepository
import javax.inject.Inject

class FormRegisteredDetailViewModel @Inject constructor(
    private val formRepository: FormRepository
) : ViewModel() {
    val form = MediatorLiveData<Resource<Form>>()
    private lateinit var liveDataGetFormDetail: LiveData<Resource<Form>>

    fun getFormDetail(rowId: Int){
        liveDataGetFormDetail = formRepository.getFormDetail(rowId)
        form.removeSource(liveDataGetFormDetail)
        form.addSource(liveDataGetFormDetail){
            form.value = it
        }
    }
}