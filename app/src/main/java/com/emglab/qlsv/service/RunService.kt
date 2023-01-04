package com.emglab.qlsv.service

import android.annotation.SuppressLint
import android.app.Service
import android.content.Intent
import android.location.Location
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.emglab.qlsv.models.entity.run.LocationWithTime
import com.emglab.qlsv.utilities.NOTIFICATION_CHANNEL_ID
import com.google.android.gms.location.*
import com.emglab.qlsv.R

class RunService: Service() {

    companion object {
        const val isRunningKey = "isRunningKey"
        const val locationWithTimeKey = "locationWithTimeKey"
        const val sendDataIntent = "sendDataIntent"
    }

    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private var isRunning = false
    private val tag = "RUN_SERVICE"
    private val locationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult?) {
            locationResult ?: return
            if(locationResult.locations.isNotEmpty()){
                Log.d("RUN_SERVICE_INSERT", locationResult.toString())
                if(isRunning){
                    val location = locationResult.locations.first()
                    sendLocationToActivity(location)
                }else{
                    Log.d(tag, "Cancel update location")
                }
            }
        }
    }

    private val locationRequest: LocationRequest = LocationRequest.create().apply {
        interval = 5000
        fastestInterval = 2500
        priority = LocationRequest.PRIORITY_HIGH_ACCURACY
    }


    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        isRunning = intent.getBooleanExtra(isRunningKey, false)
        sendNotification("iCTSV-Run is running", "Touch for more information or to stop the app")
        return START_NOT_STICKY
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("RUN_SERVICE_INSERT", "Location Update")
        startLocationUpdate()
    }

    override fun onDestroy() {
        super.onDestroy()
        fusedLocationClient.removeLocationUpdates(locationCallback)
    }

    @SuppressLint("MissingPermission")
    private fun startLocationUpdate(){
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        fusedLocationClient.requestLocationUpdates(
            locationRequest,
            locationCallback,
            null
        )
    }

    private fun sendLocationToActivity(location: Location){
        val intent = Intent(sendDataIntent)
        val bundle = Bundle()

        val locationWithTime = LocationWithTime(
            latitude = location.latitude,
            longitude = location.longitude,
            time = location.time
        )
        bundle.putSerializable(locationWithTimeKey, locationWithTime)
        intent.putExtras(bundle)
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent)
    }

    private fun sendNotification(content: String, title: String){
        val notification = NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
            .setContentTitle(content)
            .setContentText(title)
            .setSmallIcon(R.drawable.logo_bkt)
            .build()
        startForeground(1, notification)
    }
}