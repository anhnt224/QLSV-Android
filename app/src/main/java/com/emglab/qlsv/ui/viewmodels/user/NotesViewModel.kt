package com.emglab.qlsv.ui.viewmodels.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Note
import com.emglab.qlsv.repositories.TeacherRepository
import javax.inject.Inject

class NotesViewModel @Inject constructor(
    private val teacherRepository: TeacherRepository,
    val sharedPrefsHelper: SharedPrefsHelper
) : ViewModel() {
    val notes = MediatorLiveData<Resource<List<Note>>>()
    private lateinit var liveDataGetStudentNotes: LiveData<Resource<List<Note>>>

    init {
        getStudentNotes()
    }

    fun getStudentNotes(){
        liveDataGetStudentNotes = teacherRepository.getStudentNotes(studentID = sharedPrefsHelper.getUserName())
        notes.removeSource(liveDataGetStudentNotes)
        notes.addSource(liveDataGetStudentNotes){
            notes.value = it
        }
    }
}