package com.emglab.qlsv.helper.location

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class LocationViewModel(application: Application) : AndroidViewModel(application) {

    private val locationData = LocationLiveData(application,false)

    fun getLocationData() = locationData
}
