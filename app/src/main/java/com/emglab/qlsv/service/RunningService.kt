package com.emglab.qlsv.service

import android.annotation.SuppressLint
import android.app.Service
import android.content.Intent
import android.content.SharedPreferences
import android.location.Location
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.emglab.qlsv.models.entity.RunningData
import com.emglab.qlsv.utilities.NOTIFICATION_CHANNEL_ID
import com.google.android.gms.location.*
import java.util.*
import com.emglab.qlsv.R

class RunningService: Service() {

    companion object{
        val runningDataKey = ""
    }

    private val tag = "RUN_SERVICE"
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private var runningData = RunningData(0,0.0,0.0, 0.0f)
    private lateinit var sharedPref: SharedPreferences
    private val timer = Timer("Timer")

    private val locationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult?) {
            locationResult ?: return
            if(locationResult.locations.isNotEmpty()){
                val location = locationResult.locations.first()
                if(runningData.lat != 0.0 && runningData.lng != 0.0){
                    val oldLocation = Location("")
                    oldLocation.latitude = runningData.lat
                    oldLocation.longitude = runningData.lng

                    val distance = oldLocation.distanceTo(location)
                    if(distance <= 50){
                        runningData.distance += oldLocation.distanceTo(location)
                    }
                }
                runningData.lat = location.latitude
                runningData.lng = location.longitude
                sendDataToActivity(runningData)
                sendLocationDataToActivity(lat = location.latitude, lng = location.longitude)
                Log.d(tag, "Location::${location.latitude}-${location.longitude}")
            }
        }
    }

    private val locationRequest: LocationRequest = LocationRequest.create().apply {
        interval = 5000
        fastestInterval = 2500
        priority = LocationRequest.PRIORITY_HIGH_ACCURACY
    }

    override fun onBind(intent: Intent?): IBinder? {
        /**
         * Return null if service is unbound service
         */
        return null
    }

    override fun onCreate() {
        super.onCreate()

        startLocationUpdate()
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        Log.d(tag,"onStartCommand")
        val bundle = intent.extras
        if (bundle?.get("activity_data") !=  null){
            runningData = bundle.get("activity_data") as RunningData
            val timerTask = object: TimerTask(){
                override fun run() {
                    Log.d(tag, "Run timer")
                    runningData.time ++
                    sendDataToActivity(runningData)
                }
            }
            val delay = 1000L
            timer.schedule(timerTask, 0, delay)
        }
        sendNotification("iCTSV-Run is running", "Touch for more information or to stop the app")
        return START_NOT_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        timer.cancel()
        sendNotification("iCTSV-Run is stopped", "Touch for more information")
        fusedLocationClient.removeLocationUpdates(locationCallback)
    }

    private fun sendNotification(runningData: RunningData){
        val hours = runningData.time / 3600
        val minutes = (runningData.time % 3600) / 60
        val seconds = runningData.time % 60
        val time = "Thời gian: " + String.format("%02d:%02d:%02d", hours, minutes, seconds)

        val notification = NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
            .setContentTitle("Thông tin hoạt động")
            .setContentText("Thời gian: $time - Quãng đường: ${runningData.distance}")
            .setSmallIcon(R.drawable.ic_launcher)
            .build()
        startForeground(1, notification)
    }

    private fun sendNotification(content: String, title: String){
        val notification = NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
            .setContentTitle(content)
            .setContentText(title)
            .setSmallIcon(R.drawable.ic_launcher)
            .build()
        startForeground(1, notification)
    }

    private fun sendDataToActivity(runningData: RunningData){
        val intent = Intent("send_data_to_activity")
        val bundle = Bundle()
        bundle.putSerializable("activity_data", runningData)
        intent.putExtras(bundle)
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent)
    }

    private fun sendLocationDataToActivity(lat: Double, lng: Double){
        val intent = Intent("send_data_to_activity")
        val bundle = Bundle()
        bundle.putDouble("lat",lat)
        bundle.putDouble("lng", lng)
        intent.putExtras(bundle)
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent)
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
}