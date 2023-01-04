package com.emglab.qlsv.ui.fragments.running

import android.Manifest
import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.activity.OnBackPressedCallback
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.dao.RunningLocationDao
import com.emglab.qlsv.dao.RunningWayDao
import com.emglab.qlsv.databinding.RunningFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.convertDateToStringDateTime
import com.emglab.qlsv.extension.toTimeQueryStr
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.RunningData
import com.emglab.qlsv.models.entity.run.RunningLocation
import com.emglab.qlsv.models.req.RunningDataRequest
import com.emglab.qlsv.service.RunningService
import com.emglab.qlsv.ui.viewmodels.running.RunningViewModel
import com.emglab.qlsv.utilities.runOnIoThread
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.PolylineOptions
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import kotlinx.android.synthetic.main.running_fragment.*
import java.util.*
import javax.inject.Inject

class RunningFragment : Fragment(), Injectable, OnMapReadyCallback {

    private lateinit var viewModel: RunningViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    @Inject
    lateinit var runningLocationDao: RunningLocationDao
    @Inject
    lateinit var runningWayDao: RunningWayDao

    private lateinit var binding: RunningFragmentBinding
    private lateinit var runningData: RunningData
    private val TAG = "RUN_SERVICE"
    private var isActiveFragment = false
    private lateinit var mMap: GoogleMap
    private var isServiceRunning = false
    private var moveCameraToCurrentLocation = true
    private var remoteConfig = Firebase.remoteConfig
    private var runningTitle: String = ""
    private var runningTarget: String = ""


    private var broadcastReceiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent) {
            val bundle= intent.extras ?: return
            val runningData = bundle.getSerializable("activity_data")
            if(runningData != null){
                if(isActiveFragment){
                    showRunningUI()
                    showActivityDataInfo(runningData as RunningData)
                }
                saveData(runningData as RunningData)
                isServiceRunning = true
            }

            val lat = bundle.getDouble("lat")
            val lng = bundle.getDouble("lng")
            if(lat != 0.0 && lng != 0.0 ){
                saveLocationData(lat, lng)

                if(isActiveFragment){
                    Log.d(TAG, "showLocationOnMap")
                    showLocationOnMap()
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        isActiveFragment = true
        setHasOptionsMenu(true)
        binding = DataBindingUtil.inflate(inflater, R.layout.running_fragment, container, false)

        LocalBroadcastManager.getInstance(requireContext()).registerReceiver(broadcastReceiver, IntentFilter("send_data_to_activity"))

        getDataFromRemoteConfig()

        binding.apply {
            startOrPauseLayout.setOnClickListener {
                if(isServiceRunning){
                    handlePause()
                }else{
                    handleStart()
                }
            }

            continueButton.setOnClickListener {
                handleContinue()
            }

            finishButton.setOnClickListener {
                handleFinish()
            }
        }

        /**
         * Set up MapView
         */
        binding.mapView.apply {
            getMapAsync(this@RunningFragment)
            onCreate(savedInstanceState)
        }

        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if(!isServiceRunning){
                    Navigation.findNavController(requireView()).navigateUp()
                    return
                }
                handleCancel()
            }
        })


        initUI()

        return binding.root
    }

    override fun onPause() {
        super.onPause()
        isActiveFragment = false
        binding.mapView.onPause()
        moveCameraToCurrentLocation = true
    }

    override fun onResume() {
        super.onResume()
        isActiveFragment = true
        binding.mapView.onResume()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this, factory).get(RunningViewModel::class.java)
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
        showLocationOnMap()
        mMap.isMyLocationEnabled = true
    }

    @SuppressLint("SetTextI18n")
    private fun showActivityDataInfo(runningData: RunningData){
        if (runningData.distance >= 1000){
            binding.distanceTextView.text = String.format("%.2f", runningData.distance/1000) + " km"
        }else{
            binding.distanceTextView.text = String.format("%.0f", runningData.distance) + " m"
        }


        val hours = runningData.time / 3600
        val minutes = (runningData.time % 3600) / 60
        val seconds = runningData.time % 60
        binding.timeStartTextView.text = runningData.timeStart
        binding.timeTextView.text = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    }

    private fun saveData(runningData: RunningData){
        sharedPrefsHelper.saveRunningData(runningData)
    }

    private fun saveLocationData(lat: Double, lng: Double){
        sharedPrefsHelper.saveLocationData(lat, lng)
        val runningLocation = RunningLocation(latitude = lat, longitude = lng, wayID = "aa", index = 1)
        runOnIoThread {
            runningLocationDao.insert(runningLocation)
            Log.d(TAG, runningLocationDao.getRunningLocations("aa").toString() )
        }
    }

    /**
     * Service
     */
    private fun startService(){
        stopService()

        Log.d(TAG, "startService")
        isServiceRunning = true
        runningData = sharedPrefsHelper.getRunningData()
        if(runningData.isEmpty()){
            Log.d(TAG, Date().toTimeQueryStr())
            runningData = RunningData(0,0.0,0.0,0.0f, Date().convertDateToStringDateTime())
        }

        val intent = Intent(requireContext(), RunningService::class.java)
        val bundle = Bundle()
        bundle.putSerializable("activity_data", runningData)
        intent.putExtras(bundle)
        requireActivity().startService(intent)
    }

    private fun stopService(){
        isServiceRunning = false
        val intent = Intent(requireContext(), RunningService::class.java)
        requireActivity().stopService(intent)
    }

    private fun showLocationOnMap(){
        if(this::mMap.isInitialized){
            val points: List<LatLng> = sharedPrefsHelper.getLocationList()
            if(points.isEmpty()){
                return
            }
            requireActivity().runOnUiThread {
                mMap.clear()
                mMap.addPolyline(PolylineOptions().addAll(points).width(10f).color(Color.GREEN))

                if(moveCameraToCurrentLocation){
                    moveCameraToCurrentLocation = false
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(points.first(), 16f))
                }
            }
        }
    }

    private fun handleStart(){
        showRunningUI()
        startService()
    }

    private fun handlePause() {
        stopService()
        showPauseUI()
    }

    private fun handleContinue(){
        startService()
        showRunningUI()
    }

    private fun handleFinish(){
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Hoàn thành")
            .setMessage("Bạn có chắc chắn muốn kết thúc hoạt động?")
            .setPositiveButton("Hoàn thành"){_,_ ->
                saveRunningDataToCloud()
            }.setNegativeButton("Hủy", null)
            .show()
    }

    private fun showStartUI(){
        binding.apply {
            startOrPauseLayout.visibility = View.VISIBLE
            continueOrFinishLayout.visibility = View.GONE
            distanceTextView.text = "0 m"
            timeTextView.text = "00:00:00"
            timeStartTextView.text = ""
            startOrPauseImageView.setImageResource(R.drawable.ic_play)
        }
    }

    private fun showRunningUI(){
        binding.apply {
            startOrPauseLayout.visibility = View.VISIBLE
            continueOrFinishLayout.visibility = View.GONE
            startOrPauseImageView.setImageResource(R.drawable.ic_pause)
        }
    }

    private fun showPauseUI(){
        binding.apply {
            startOrPauseLayout.visibility = View.GONE
            continueOrFinishLayout.visibility = View.VISIBLE
        }
    }

    private fun initUI(){
        val runningData = sharedPrefsHelper.getRunningData()
        if (runningData.isEmpty()){
            showStartUI()
        }else{
            showPauseUI()
            showActivityDataInfo(runningData)
        }
    }

    private fun saveRunningDataToCloud(){
        val runningData = sharedPrefsHelper.getRunningData()

        val db = FirebaseDatabase.getInstance()
        val ref = db.getReference("runnung_data")

        val runningDataReq = RunningDataRequest(
            timeStart = runningData.timeStart,
            time = runningData.time,
            distance = runningData.distance,
            latList = sharedPrefsHelper.getLatList(),
            lngList = sharedPrefsHelper.getLngList(),
            userName = sharedPrefsHelper.getUserName(),
            fullName = sharedPrefsHelper.getFullName(),
            title = runningTitle
        )

        binding.status = Status.LOADING
        ref.push().setValue(runningDataReq).addOnSuccessListener {
            sharedPrefsHelper.clearRunningData()
            showStartUI()
            showToast("Lưu hoạt động thành công")
            binding.status = Status.SUCCESS_DB
        }.addOnFailureListener {
            binding.status = Status.ERROR
            showToast("Lưu hoạt động không thành công")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_running, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.history -> {
                if(isServiceRunning){
                    handleCancel()
                }else{
                    openHistoryFragment()
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun openHistoryFragment() {
        Navigation.findNavController(requireView())
            .navigate(
                RunningFragmentDirections.actionRunningFragmentToRunningDataFragment()
            )
    }

    private fun handleCancel(){
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Hoạt động chưa hoàn thành")
            .setMessage("Hoạt động của bạn chưa được lưu trên hệ thống, bạn có chắc chắn muốn thoát?")
            .setPositiveButton("Thoát"){_,_ ->
                Navigation.findNavController(requireView()).navigateUp()
                handlePause()
            }
            .setNegativeButton("Tiếp tục", null)
            .show()
    }

    private fun getDataFromRemoteConfig() {
        runningTarget = remoteConfig.getString("running_target")
        runningTitle = remoteConfig.getString("running_title")

        binding.apply {
            titleTextView.text = runningTitle
            targetTextView.text = runningTarget
        }
    }

}