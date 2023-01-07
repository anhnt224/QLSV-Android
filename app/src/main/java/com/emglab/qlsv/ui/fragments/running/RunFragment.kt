package com.emglab.qlsv.ui.fragments.running

import android.Manifest
import android.annotation.SuppressLint
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.graphics.Color
import android.location.Location
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.dao.RunDataDao
import com.emglab.qlsv.dao.RunningLocationDao
import com.emglab.qlsv.dao.RunningWayDao
import com.emglab.qlsv.databinding.RunFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.*
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.run.LocationWithTime
import com.emglab.qlsv.models.entity.run.RunData
import com.emglab.qlsv.models.entity.run.RunningLocation
import com.emglab.qlsv.models.entity.run.RunningWay
import com.emglab.qlsv.service.RunService
import com.emglab.qlsv.utilities.NOTIFICATION_CHANNEL_ID
import com.emglab.qlsv.utilities.runOnIoThread
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.PolylineOptions
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.run_fragment.*
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

class RunFragment : Fragment(), Injectable, OnMapReadyCallback {

    companion object {
        fun newInstance() = RunFragment()
    }

    private lateinit var viewModel: RunViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var runningLocationDao: RunningLocationDao
    @Inject
    lateinit var runningWayDao: RunningWayDao
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    @Inject
    lateinit var runDataDao: RunDataDao
    private lateinit var binding: RunFragmentBinding
    private var isRunning = false
    private val TAG = "RUN_SERVICE"
    private var wayID: String = "11"
    private var runningWay = RunningWay()
    private var runningTime: Long = 0
    private var runningDistance: Double = 0.0
    private var timer = Timer("RunTimer")
    private var pointMap = ArrayList<ArrayList<LatLng>>()
    private lateinit var mMap: GoogleMap
    private var lastLocationList: ArrayList<LocationWithTime> = arrayListOf()
    private val minPace = 2 * 60 * 1000 // Min pace: 02:00/km
    private var runDataList: ArrayList<RunData> = arrayListOf()
    private var comIdInRoom: String = ""

    private val broadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent) {
            val bundle = intent.extras ?: return
            val locationWithTime = bundle.getSerializable(RunService.locationWithTimeKey) ?: return

            Log.d(TAG + "_INSERT", "InsertLocation $locationWithTime")
            saveLocation(locationWithTime as LocationWithTime)
            saveTimeUpdated()
            comIdInRoom = UUID.randomUUID().toString()

            if(lastLocationList.size < 5){
                lastLocationList.add(locationWithTime)
            }else{
                lastLocationList.removeAt(0)
                lastLocationList.add(locationWithTime)

                val time = lastLocationList.last().time - lastLocationList.first().time
                var distance: Double = 0.0
                for(i in 0..lastLocationList.size - 2){
                    val location1 = Location("")
                    location1.latitude = lastLocationList[i].latitude
                    location1.longitude = lastLocationList[i].longitude

                    val location2 = Location("")
                    location2.latitude = lastLocationList[i + 1].latitude
                    location2.longitude = lastLocationList[i + 1].longitude

                    distance += location1.distanceTo(location2)
                }
                val pace = time/(distance/1000)
                Log.d(TAG + "_V", ":: ${milliSecondsToTime(pace.toLong())}")
                if(pace < minPace) {
                    sendNotification(
                        content = "Tốc độ chạy hiện tại của bạn vượt quá mức cho phép",
                        title = "Chạy bộ đã tạm dừng"
                    )
                    handlePause()
                }

                pointMap.last().add(LatLng(locationWithTime.latitude, locationWithTime.longitude))
                showLocationOnMap()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        LocalBroadcastManager.getInstance(requireContext())
            .registerReceiver(broadcastReceiver, IntentFilter(RunService.sendDataIntent))
        binding = DataBindingUtil.inflate(inflater, R.layout.run_fragment, container, false)

        startService()
        binding.apply {
            startOrPauseLayout.setOnClickListener {
                if(isRunning){
                    handlePause()
                }else{
                    handleStart()
                }
            }

            continueButton.setOnClickListener {
                handleStart()
            }

            finishButton.setOnClickListener {
                handleFinish()
            }

            /**
             * Set up MapView
             */
            mapView.apply {
                getMapAsync(this@RunFragment)
                onCreate(savedInstanceState)
            }

            activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    if(!isRunning){
                        Navigation.findNavController(requireView()).navigateUp()
                        return
                    }
                    handleCancel()
                }
            })
        }

        fetchCompleteRunningWay()

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        if(isRunning){
            handlePause()
        }

        // Stop service
        val intent = Intent(requireContext(), RunService::class.java)
        requireActivity().stopService(intent)
        LocalBroadcastManager.getInstance(requireContext())
            .unregisterReceiver(broadcastReceiver)
    }

    override fun onPause() {
        super.onPause()
        binding.mapView.onPause()
    }

    override fun onResume() {
        super.onResume()
        binding.mapView.onResume()
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(RunViewModel::class.java)
    }

    private fun subScribeUI(){
        with(viewModel){
            saveRunData.observe(viewLifecycleOwner){
                if (!it.isLoading()) {
                    saveRunData.removeObservers(viewLifecycleOwner)
                }
                if(checkResource(it)){
                    clearRunData()
                    showToast("Lưu thành công")
                    Navigation.findNavController(requireView()).navigateUp()
                    removeRunDataUploadSuccess()
                }else if (it.status != Status.LOADING){
                    showAlertUploadFail()
                }
            }
        }
    }

    private fun showAlertUploadFail(){
        showActionDialog(
            title = "Cảnh báo",
            message = "Lưu kết quả cuộc chạy không thành công",
            positiveButtonTitle = "Thử lại",
            handlePositiveButtonTap = {
                  handleFinish()
            },
            negativeButtonTitle = "Để sau",
            handleNegativeButtonTap = {
                clearRunData()
                saveRunDataUploadFail()
                Navigation.findNavController(requireView()).navigateUp()
            }
        )
    }

    private fun startService(){
        val intent = Intent(requireContext(), RunService::class.java)
        requireActivity().startService(intent)
    }

    private fun handleStart(){
        lastLocationList.clear()
        pointMap.add(arrayListOf())
        showRunningUI()
        // Create new RunningWay
        createNewRunningWay()

        // Start saving location
        isRunning = true
        val intent = Intent(requireContext(), RunService::class.java)
        intent.putExtra(RunService.isRunningKey, isRunning)
        requireActivity().startService(intent)

        // Start timer
        startTimer()

        // Add new locationLst
        pointMap.add(arrayListOf())
    }

    private fun handlePause(){
        showPauseUI()
        // Stop saving location
        isRunning = false
        val intent = Intent(requireContext(), RunService::class.java)
        intent.putExtra(RunService.isRunningKey, isRunning)
        requireActivity().startService(intent)

        // Save time update
        saveTimeUpdated()

        // Stop timer
        stopTimer()
    }

    private fun handleFinish(){
        // Save run info
        runOnIoThread {
//            val runDataList: ArrayList<RunData> = arrayListOf()
            val runningWayList = runningWayDao.getAll()
            runningWayList.forEach { runningWay ->
                val runData = RunData()
                runData.wayID = runningWay.id
                runData.timeStart = runningWay.getTimeStartReq()
                runData.timeEnd = runningWay.getTimeEndReq()
                runData.userCode = sharedPrefsHelper.getUserName()

                val runningLocationList = runningLocationDao.getRunningLocations(runningWay.id)
                if(runningLocationList.size > 1){
                    for (i in 0..(runningLocationList.size - 2)){
                        val location = Location("")
                        location.latitude = runningLocationList[i].latitude
                        location.longitude = runningLocationList[i].longitude

                        val nextLocation = Location("")
                        nextLocation.latitude = runningLocationList[i + 1].latitude
                        nextLocation.longitude = runningLocationList[i + 1].longitude

                        runData.distance += location.distanceTo(nextLocation)
                    }
                }
                runDataList.add(runData)
            }

            requireActivity().runOnUiThread {
                Log.d(TAG, runDataList.toString())
                runDataList.forEach {
                    Log.d(TAG, "::::::::::: ${it.wayID} - ${it.distance}")
                }
                viewModel.saveRunData(runDataList)
                subScribeUI()
            }
        }
    }

    private fun saveLocation(location: LocationWithTime){
        pointMap.last().add(LatLng(location.latitude, location.longitude))
        Log.d(TAG, pointMap.toString())
        runOnIoThread {
            // Get lastLocation
            val runningWays = runningWayDao.getAll()
            if(runningWays.isEmpty()){
                return@runOnIoThread
            }

            val lastRunningWay = runningWays.last()
            val locations = runningLocationDao.getRunningLocations(lastRunningWay.id)
            var runningLocation = RunningLocation()
            if(locations.isEmpty()){
                runningLocation = RunningLocation(
                    latitude = location.latitude,
                    longitude = location.longitude,
                    timeUpdated = location.time,
                    wayID = lastRunningWay.id,
                    index = 0
                )
            }else{
                val lastLocation = locations.last()
                runningLocation = RunningLocation(
                    latitude = location.latitude,
                    longitude = location.longitude,
                    timeUpdated = location.time,
                    wayID = lastRunningWay.id,
                    index = lastLocation.index + 1
                )

                val currentLocation = Location("")
                currentLocation.latitude = lastLocation.latitude
                currentLocation.longitude = lastLocation.longitude

                val nextLocation = Location("")
                nextLocation.latitude = location.latitude
                nextLocation.longitude = location.longitude

                runningDistance += currentLocation.distanceTo(nextLocation)
                showDistance(runningDistance)
            }

            runningLocationDao.insert(runningLocation)

            // Show pace
            requireActivity().runOnUiThread {
                binding.paceTextView.text = getPace(distance = runningDistance, seconds = (runningTime / 1000).toDouble())
            }
        }
    }

    private fun createNewRunningWay(){
        wayID = UUID.randomUUID().toString()
        runOnIoThread {
            runningWay = RunningWay(
                id = wayID,
                timeStart = Date().time,
                timeUpdated = Date().time
            )
            runningWayDao.insert(runningWay)
        }
    }

    private fun saveRunDataUploadFail(){
        Log.d("_RUN_DATA", "Save run data to room")
        runDataList.forEach {
            Log.d("_RUN_DATA", "$it")
            it.comIdInRoom = comIdInRoom
            runOnIoThread {
                runDataDao.insert(it)
            }
        }
    }

    private fun removeRunDataUploadSuccess(){
        runOnIoThread {
            runDataList.forEach {
                runDataDao.delete(it)
            }
        }
    }

    private fun saveTimeUpdated(){
        runOnIoThread {
            val runningWay = runningWayDao.getAll().last()
            runningWay.timeUpdated = Date().time
            runningWayDao.update(runningWay)

            val runningWays = runningWayDao.getAll()
            var wayStr = ""
            runningWays.forEach {
                val timeStart = Date(it.timeStart).toStringTime()
                val timeUpdated = Date(it.timeUpdated).toStringTime()
                wayStr += "\n${it.id}:: $timeStart || $timeUpdated || ${(it.timeUpdated - it.timeStart)/1000}"
            }
            Log.d(TAG, wayStr)
        }
    }

    private fun fetchCompleteRunningWay(){
        runningTime = 0
        runningDistance = 0.0
        runOnIoThread {
            val runningWays = runningWayDao.getAll()
            if(runningWays.isEmpty()){
                showStartUI()
                return@runOnIoThread
            }

            showPauseUI()

            runningWays.forEach {
                runningTime += it.timeUpdated - it.timeStart
                val runningLocations = runningLocationDao.getRunningLocations(it.id)
                Log.d(TAG + "_LOCATION", runningLocations.map {
                    it.index
                }.toString())
                pointMap.add(
                    ArrayList(
                        runningLocations.map {runningLocation ->
                            LatLng(runningLocation.latitude, runningLocation.longitude)
                        }
                    )
                )
                if(runningLocations.size > 1){
                    for (i in 0..(runningLocations.size - 2)){
                        val location = Location("")
                        location.latitude = runningLocations[i].latitude
                        location.longitude = runningLocations[i].longitude

                        val nextLocation = Location("")
                        nextLocation.latitude = runningLocations[i + 1].latitude
                        nextLocation.longitude = runningLocations[i + 1].longitude

                        runningDistance += location.distanceTo(nextLocation)
                    }
                }
            }

            requireActivity().runOnUiThread {
                binding.timeTextView.text = milliSecondsToTime(runningTime)
                binding.paceTextView.text = getPace(runningDistance, (runningTime / 1000).toDouble())
            }
            showDistance(runningDistance)

        }
    }

    private fun startTimer(){
        timer = Timer("RunTimer")
        val timerTask = object: TimerTask(){
            override fun run() {
                runningTime += 1000
                requireActivity().runOnUiThread {
                    binding.timeTextView.text = milliSecondsToTime(runningTime)
                }
            }
        }
        timer.schedule(timerTask,1000, 1000L)
    }

    private fun stopTimer(){
        timer.cancel()
    }

    private fun milliSecondsToTime(milliSeconds: Long): String{
        val s = milliSeconds / 1000
        val hours = s / 3600
        val minutes = (s % 3600) / 60
        val seconds = s % 60

        return String.format("%02d:%02d:%02d", hours, minutes, seconds)
    }

    @SuppressLint("SetTextI18n")
    private fun showDistance(distance: Double){
        requireActivity().runOnUiThread {
            if (distance >= 1000){
                binding.distanceTextView.text = String.format("%.2f", distance/1000) + " km"
            }else{
                binding.distanceTextView.text = String.format("%.0f", distance) + " m"
            }
        }
    }

    private fun showStartUI(){
        requireActivity().runOnUiThread {
            binding.apply {
                startOrPauseLayout.visibility = View.VISIBLE
                continueOrFinishLayout.visibility = View.GONE
                distanceTextView.text = "0 m"
                timeTextView.text = "00:00:00"
//                timeStartTextView.text = ""
                startOrPauseImageView.setImageResource(R.drawable.ic_play)
            }
        }
    }

    private fun showRunningUI(){
        requireActivity().runOnUiThread {
            binding.apply {
                startOrPauseLayout.visibility = View.VISIBLE
                continueOrFinishLayout.visibility = View.GONE
                startOrPauseImageView.setImageResource(R.drawable.ic_pause)
            }
        }
    }

    private fun showPauseUI(){
        requireActivity().runOnUiThread {
            binding.apply {
                startOrPauseLayout.visibility = View.GONE
                continueOrFinishLayout.visibility = View.VISIBLE
            }
        }
    }

    private fun clearRunData(){
        runOnIoThread {
            runningWayDao.deleteAll()
            runningLocationDao.deleteAll()
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(21.005752, 105.841857), 16f))
        showLocationOnMap()

        mMap.isMyLocationEnabled = true
    }

    private fun showLocationOnMap(){
        if(this::mMap.isInitialized){
            if(pointMap.isEmpty()){
                return
            }
            requireActivity().runOnUiThread {
                mMap.clear()
                pointMap.forEach {
                    mMap.addPolyline(PolylineOptions().addAll(it).width(10f).color(Color.GREEN))
                }
                if(pointMap.last().isNotEmpty()){
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(pointMap.last().last(), 16f))
                }
            }
        }
    }

    private fun handleCancel(){
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Hoạt động chưa hoàn thành")
            .setMessage("Hoạt động của bạn chưa được lưu, bạn có chắc chắn muốn thoát?")
            .setPositiveButton("Thoát"){_,_ ->
                Navigation.findNavController(requireView()).navigateUp()
                handlePause()
            }
            .setNegativeButton("Tiếp tục", null)
            .show()
    }

    private fun sendNotification(content: String, title: String){
        val notification = NotificationCompat.Builder(requireContext(), NOTIFICATION_CHANNEL_ID)
            .setContentTitle(title)
            .setContentText(content)
            .setSmallIcon(R.drawable.ic_play)
            .build()

        val notificationManager = requireContext().getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(2, notification)
    }

    private fun getPace(distance: Double, seconds: Double): String {
        if (distance == 0.0) {
            return "--:--"
        }
        val pace: Int = (seconds / (distance / 1000)).toInt()
        val h = pace / 3600
        val m = pace % 3600 / 60
        val s = pace % 60
        return if (h == 0){
            String.format("%02d:%02d", m, s)
        }else{
            String.format("%02d:%02d:%02d", h, m, s)
        }
    }

}