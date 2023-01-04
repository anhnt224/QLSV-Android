package com.emglab.qlsv.teacher.viewmodel.form

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.Form
import com.emglab.qlsv.models.entity.FormType
import com.emglab.qlsv.repositories.FormRepository
import javax.inject.Inject

class TListFormViewModel @Inject constructor(
    val formRepository: FormRepository
) : ViewModel() {
    val getListForms = MediatorLiveData<Resource<List<Form>>>()
    private lateinit var liveDateGetListForm: LiveData<Resource<List<Form>>>

    private var filterType = MutableLiveData<FormType>()

    init {
        filterType.value = FormType.FORM
        getListForm()
    }

    fun getFilterType(): LiveData<FormType> {
        return filterType
    }

    fun setFilterType(formType: FormType){
        filterType.value = formType
    }

    fun getListForm(){
        liveDateGetListForm = formRepository.getListForms()
        getListForms.removeSource(liveDateGetListForm)
        getListForms.addSource(liveDateGetListForm){
            getListForms.value = it
        }
    }
}