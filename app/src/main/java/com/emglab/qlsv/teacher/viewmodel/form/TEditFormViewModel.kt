package com.emglab.qlsv.teacher.viewmodel.form

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.FormQuestion
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.FormRepository
import javax.inject.Inject

class TEditFormViewModel @Inject constructor(
    val formRepository: FormRepository
) : ViewModel() {
    val questions = MediatorLiveData<Resource<List<FormQuestion>>>()
    private lateinit var liveDataGetListQuestions: LiveData<Resource<List<FormQuestion>>>

    val updateForm = MediatorLiveData<Resource<MyCTSVCap>>()
    private lateinit var liveDataUpdateForm: LiveData<Resource<MyCTSVCap>>

    fun getListQuestions(formType: String){
        liveDataGetListQuestions = formRepository.getListQuestions(formType)
        questions.removeSource(liveDataGetListQuestions)
        questions.addSource(liveDataGetListQuestions){
            questions.value = it
        }
    }

    fun updateForm(rowID: Int, questions: List<FormQuestion>){
        liveDataUpdateForm = formRepository.updateForm(rowID ,questions)
        updateForm.removeSource(liveDataUpdateForm)
        updateForm.addSource(liveDataUpdateForm){
            updateForm.value = it
        }
    }
}