package com.emglab.qlsv.helper.location

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import android.os.Build
import android.util.Log
import androidx.lifecycle.LiveData
import com.google.android.gms.location.*

class LocationLiveData(var context: Context,
                       private val allowMockLocations: Boolean
) : LiveData<LocationModel>() {

    private var fusedLocationClient = LocationServices.getFusedLocationProviderClient(context)
    private var mockLocationsEnabled: Boolean = false
    private var lastMockLocation: Location? = null
    private var numGoodReadings: Int = 0

    override fun onInactive() {
        super.onInactive()
        fusedLocationClient.removeLocationUpdates(locationCallback)
    }


    @SuppressLint("MissingPermission")
    override fun onActive() {
        super.onActive()

        checkMockLocations()
        startLocationUpdates()
    }



    @SuppressLint("MissingPermission")
    private fun startLocationUpdates() {
        Log.d("ERROR_LOCATION", "startLocationUpdates")
        fusedLocationClient.requestLocationUpdates(
            locationRequest,
            locationCallback,
            null
        )
    }

    private val locationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult?) {
            locationResult ?: return
            Log.d("ERROR_LOCATION", locationResult.toString())
            if(locationResult.locations.isEmpty()){
                setLocationData(null, LocationModel.NO_LOCATION)
            }
            for (location in locationResult.locations) {

                val plausible = isLocationPlausible(location)
                if (!allowMockLocations && !plausible) {
                    setLocationData(location,LocationModel.MOCK)
                    return
                }
                setLocationData(location,LocationModel.NON_MOCK)
            }
        }

    }

    private fun checkMockLocations() {
        // Starting with API level >= 18 we can (partially) rely on .isFromMockProvider()
        // (http://developer.android.com/reference/android/location/Location.html#isFromMockProvider%28%29)
        // For API level < 18 we have to check the Settings.Secure flag
        if (Build.VERSION.SDK_INT < 18 && android.provider.Settings.Secure.getString(
                context.contentResolver, android.provider.Settings
                    .Secure.ALLOW_MOCK_LOCATION
            ) != "0"
        ) {
            mockLocationsEnabled = true
            setLocationData(Location(""),LocationModel.MOCK)
        } else
            mockLocationsEnabled = false
    }

    private fun isLocationPlausible(location: Location?): Boolean {
        if (location == null) return false

        val isMock =
            mockLocationsEnabled || Build.VERSION.SDK_INT >= 18 && location.isFromMockProvider
        if (isMock) {
            lastMockLocation = location
            numGoodReadings = 0
        } else
            numGoodReadings = Math.min(numGoodReadings + 1, 1000000) // Prevent overflow

        // We only clear that incident record after a significant show of good behavior
        if (numGoodReadings >= 20) lastMockLocation = null

        // If there's nothing to compare against, we have to trust it
        if (lastMockLocation == null) return true

        // And finally, if it's more than 1km away from the last known mock, we'll trust it
        val d = location.distanceTo(lastMockLocation).toDouble()
        return d > 1000
    }

    private fun setLocationData(location: Location?,mock: Int) {
        if(location != null){
            value = LocationModel(
                longitude = location.longitude,
                latitude = location.latitude,
                mock = mock
            )
        }else {
            LocationModel(
                longitude = 0.0,
                latitude = 0.0,
                mock = mock
            )
        }
    }

    companion object {
        val locationRequest: LocationRequest = LocationRequest.create().apply {
            interval = 3000
            fastestInterval = 5000
            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        }
    }
}

data class LocationModel(
    val longitude: Double,
    val latitude: Double,
    val mock: Int
){
    fun isMockOrChecking() = mock == MOCK || mock == CHECKING

    fun isChecking() = mock == CHECKING

    fun isMock() = mock == MOCK

    fun noLocation() = mock == NO_LOCATION

    fun isNonMock() = mock == NON_MOCK
    companion object{
        val CHECKING = 0
        val MOCK = 1
        val NON_MOCK = -1
        val NO_LOCATION = -2
    }
}


