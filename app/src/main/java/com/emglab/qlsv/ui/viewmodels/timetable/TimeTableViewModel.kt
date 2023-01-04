package com.emglab.qlsv.ui.viewmodels.timetable

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.dao.TimetableDAO
import com.emglab.qlsv.models.entity.Subject
import com.emglab.qlsv.repositories.TimeTableRepository
import javax.inject.Inject

class TimeTableViewModel @Inject constructor(
    private val timeTableRepository: TimeTableRepository,
    private val timetableDAO: TimetableDAO
) : ViewModel() {
    val getTimeTable = MediatorLiveData<Resource<List<Subject>>>()
    private lateinit var liveDataGetTimeTable: LiveData<Resource<List<Subject>>>

    fun getTimeTable(){
        liveDataGetTimeTable = timeTableRepository.getTimeTable()
        getTimeTable.removeSource(liveDataGetTimeTable)
        getTimeTable.addSource(liveDataGetTimeTable){
            getTimeTable.value = it
        }
    }

    var getTimetableOffline: LiveData<List<Subject>> = timetableDAO.getAll()
}