package com.emglab.qlsv.teacher.viewmodel.account

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.models.entity.User
import com.emglab.qlsv.repositories.user.UserRepository
import com.emglab.qlsv.utilities.AbsentLiveData
import javax.inject.Inject

class TeacherInfoViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    private val _parameter: MutableLiveData<Parameter> = MutableLiveData()
    val parameter: LiveData<Parameter>
        get() = _parameter

    val user: LiveData<Resource<User>> = Transformations
        .switchMap(_parameter) { input ->
            input.ifExists { userCode ->
                userRepository.getUserInfo()
            }
        }

    fun retry() {
        val userCode = _parameter.value?.userCode
        if (userCode != null ) {
            _parameter.value = Parameter(userCode)
        }
    }

    fun setParameter(userCode: String) {
        val update = Parameter(userCode)
        if (_parameter.value == update) {
            return
        }
        _parameter.value = update
    }

    data class Parameter(val userCode: String) {
        fun <T> ifExists(f: (String) -> LiveData<T>): LiveData<T> {
            return if (userCode.isEmpty() ) {
                AbsentLiveData.create()
            } else {
                f(userCode)
            }
        }
    }

}