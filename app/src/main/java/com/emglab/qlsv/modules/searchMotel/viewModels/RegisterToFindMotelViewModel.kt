package com.emglab.qlsv.modules.searchMotel.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.extension.notifyObserver
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository
import com.emglab.qlsv.modules.searchMotel.model.MotelPrice
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistration
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

class RegisterToFindMotelViewModel @Inject constructor(
    private val motelRegistrationRepository: MotelRegistrationRepository
) : ViewModel() {
    private var _price = MutableLiveData<MotelPrice>()
    val price: LiveData<MotelPrice>
        get() = _price

    private var _startDate = MutableLiveData<Date?>()
    val startDate: LiveData<Date?>
        get() = _startDate

    fun setStartDate(day: Int, month: Int, year: Int) {
        val cal = Calendar.getInstance()
        cal.set(year, month, day, 0, 0, 0)
        _startDate.value = cal.time
    }

    private var _endDate = MutableLiveData<Date?>()
    val endDate: LiveData<Date?>
        get() = _endDate

    fun setEndDate(day: Int, month: Int, year: Int) {
        val cal = Calendar.getInstance()
        cal.set(year, month, day, 0, 0, 0)
        _endDate.value = cal.time
    }

    private var _selectedTypes = MutableLiveData<ArrayList<Boolean>>()
    val selectedTypes: LiveData<ArrayList<Boolean>>
        get() = _selectedTypes

    fun selectType(index: Int) {
        _selectedTypes.value!![index] = !_selectedTypes.value!![index]
        _selectedTypes.notifyObserver()
    }

    fun setSelectedTypes(values: ArrayList<Boolean>) {
        _selectedTypes.value = values
    }

    private var _requests = MutableLiveData<ArrayList<Boolean>>()
    val selectedRequests: LiveData<ArrayList<Boolean>>
        get() = _requests

    fun selectRequest(index: Int) {
        _requests.value!![index] = !_requests.value!![index]
    }

    fun setRequests(values: ArrayList<Boolean>) {
        _requests.value = values
    }

    fun setPrice(min: Int, max: Int) {
        _price.value = MotelPrice(max, min)
    }

    val radius = MutableLiveData<Int?>()
    val numberOfPeople = MutableLiveData<Int?>()
    val otherRequest = MutableLiveData<String>()
    val liveWithOther = MutableLiveData<Boolean?>()

    fun saveInfo(radius: Int?, numberOfPeople: Int?, otherRequest: String, liveWithOther: Boolean){
        this.radius.value = radius
        this.numberOfPeople.value = numberOfPeople
        this.otherRequest.value = otherRequest
        this.liveWithOther.value = liveWithOther
    }

    private val _motelRegistration = MutableLiveData<MotelRegistration>()
    fun saveMotelRegistration(motelRegistration: MotelRegistration){
        _motelRegistration.value = motelRegistration
    }

    val saveMotelRegistrationResp: LiveData<Resource<MyCTSVCap>> = _motelRegistration.switchMap {
        motelRegistrationRepository.registerMotel(it)
    }
}