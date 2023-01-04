package com.emglab.qlsv.teacher.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.Message
import com.emglab.qlsv.repositories.user.UserRepository
import javax.inject.Inject

class TListNotificationsViewModel @Inject constructor(
    private val userRepository: UserRepository
): ViewModel() {
    val messages = MediatorLiveData<Resource<List<Message>>>()
    private lateinit var liveDataListMessages: LiveData<Resource<List<Message>>>

    init {
        getListMessage()
    }

    fun getListMessage(){
        liveDataListMessages = userRepository.getUserMessage()
        messages.removeSource(liveDataListMessages)
        messages.addSource(liveDataListMessages){
            messages.value = it
        }
    }


}