package com.emglab.qlsv.ui.fragments

import android.Manifest
import android.annotation.SuppressLint
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.helper.location.GetNameLocationAsyncTask
import com.emglab.qlsv.helper.location.GpsUtils
import com.emglab.qlsv.helper.location.LocationModel
import com.emglab.qlsv.helper.location.LocationViewModel
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import javax.inject.Inject

abstract class FragmentLocationBase: androidx.fragment.app.Fragment() {

    @Inject lateinit var sharedPrefsHelper: SharedPrefsHelper
    private var isGPSEnabled = false
    private lateinit var locationViewModel: LocationViewModel
    var locationModel: LocationModel = LocationModel(0.0,0.0,mock = LocationModel.CHECKING)
    var address = ""

    fun getUserName() = sharedPrefsHelper.get(SharedPrefsHelper.USER_CODE,"")

    fun isLocationNotNull() = (locationModel.longitude != 0.0 && locationModel.latitude != 0.0)

    private fun startLocationUpdates() {
        locationViewModel.getLocationData().observe(this, Observer {
            locationUpdate(it)
            locationModel = it
            if (locationModel.isMock()){
                //InjectorUtils.mData.child("FakeGPS").child(getUserName()).child(System.currentTimeMillis().toString()).setValue(1)
            }
            GetNameLocationAsyncTask(context!!){nameLocation ->
                address = nameLocation
                addressUpdate(address)
            }.execute(it.latitude, it.longitude)
        })
    }

    private fun isLocationAvailable() {
        Dexter.withActivity(activity)
            .withPermissions(
                Manifest.permission.CAMERA,
                Manifest.permission.ACCESS_FINE_LOCATION)
            .withListener(object: MultiplePermissionsListener {
                @SuppressLint("MissingPermission")
                override fun onPermissionsChecked(report: MultiplePermissionsReport) {
                    // check if all permissions are granted
                    if (report.areAllPermissionsGranted()) {
                        GpsUtils(context!!).turnGPSOn(object : GpsUtils.OnGpsListener {
                            override fun gpsStatus(isGPSEnable: Boolean) {
                                this@FragmentLocationBase.isGPSEnabled = isGPSEnable
                            }
                        })
                        startLocationUpdates()
                    }

                    if (report.isAnyPermissionPermanentlyDenied) {
                        activity!!.onBackPressed()
                    }
                }

                override fun onPermissionRationaleShouldBeShown(permissions:List<PermissionRequest>, token: PermissionToken) {
                    token.continuePermissionRequest()
                }
            })
            .onSameThread()
            .check()

    }

    override fun onStart() {
        super.onStart()
        locationViewModel = ViewModelProviders.of(this).get(LocationViewModel::class.java)
        isLocationAvailable()
    }

    abstract fun locationUpdate(locationModel: LocationModel)

    abstract fun addressUpdate(address: String)

}