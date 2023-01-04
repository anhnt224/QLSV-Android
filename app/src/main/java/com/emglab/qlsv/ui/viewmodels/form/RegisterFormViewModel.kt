package com.emglab.qlsv.ui.viewmodels.form

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.FormQuestion
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.repositories.FormRepository
import javax.inject.Inject

class RegisterFormViewModel @Inject constructor(
    private val formRepository: FormRepository
) : ViewModel() {
    val questions = MediatorLiveData<Resource<List<FormQuestion>>>()
    private lateinit var liveDataGetListQuestions: LiveData<Resource<List<FormQuestion>>>

    val registerForm = MediatorLiveData<Resource<MyCTSVCap>>()
    private lateinit var liveDataRegisterForm: LiveData<Resource<MyCTSVCap>>

    fun getListQuestions(formType: String){
        liveDataGetListQuestions = formRepository.getListQuestions(formType)
        questions.removeSource(liveDataGetListQuestions)
        questions.addSource(liveDataGetListQuestions){
            questions.value = it
        }
    }

    fun registerForm(questions: List<FormQuestion>){
        liveDataRegisterForm = formRepository.registerForm(questions)
        registerForm.removeSource(liveDataRegisterForm)
        registerForm.addSource(liveDataRegisterForm){
            registerForm.value = it
        }
    }
}