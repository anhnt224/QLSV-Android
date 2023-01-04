package com.emglab.qlsv.teacher.fragment.motel

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.location.Location
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.core.content.ContextCompat
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.FragmentTSearchMotelBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.models.entity.Motel
import com.emglab.qlsv.teacher.viewmodel.motel.TSearchMotelViewModel
import com.emglab.qlsv.ui.adapter.MotelInfoAdapter
import com.emglab.qlsv.utilities.DEFAULT_LATLNG
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CircleOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import javax.inject.Inject

class TSearchMotelFragment : Fragment(), Injectable, OnMapReadyCallback,
    MotelInfoAdapter.OnItemMotelInfoClickListener {

    @Inject
    lateinit var factory: ViewModelFactory
    private var listMotel = listOf<Motel>()
    private lateinit var binding: FragmentTSearchMotelBinding
    private lateinit var motelInfoAdapter: MotelInfoAdapter
    private lateinit var googleMap: GoogleMap
    private lateinit var lastLocation: Location
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    private lateinit var viewModel: TSearchMotelViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupViewModel()
        binding = FragmentTSearchMotelBinding.inflate(inflater, container, false)
        if (viewModel.getRadius() == null ){
            viewModel.setRadius(1000.0)
        }else{
            binding.showSelectDistance1.text = "${viewModel.getRadius()!!.toInt() /1000} km"
            binding.showSelectDistance2.text = "${viewModel.getRadius()!!.toInt() /1000} km"
        }
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireActivity().baseContext)
        binding.map.getMapAsync(this)
        binding.apply {
            map.onCreate(savedInstanceState)
            map.onResume()

            distanceLayout.setOnClickListener {
                setUpDistanceDialog(requireContext(), viewModel.latLng.value!!)
            }

            lineDistance2.setOnClickListener {
                setUpDistanceDialog(requireContext(), viewModel.latLng.value!!)
            }
        }

        subscribeUI()

        setUpRecyclerViewMotelInfo()

        setAndShowBottomBar()
        return binding.root
    }
    private fun setAndShowBottomBar() {
        binding.apply {
            constraintMotelInfoShow.visibility = View.GONE
            viewShowMotelInfo.setOnClickListener {
                constraintMotelInfoShow.visibility = View.VISIBLE
                viewShowMotelInfo.visibility = View.GONE
                val anim = AnimationUtils.loadAnimation(requireContext(), R.anim.bottom_to_top)
                binding.viewListMotelInfo.startAnimation(anim)
            }

            constraintMotelInfoShow.setOnClickListener {
                val anim = AnimationUtils.loadAnimation(requireContext(), R.anim.top_to_bottom)
                binding.viewListMotelInfo.startAnimation(anim)
                anim.setAnimationListener(object : Animation.AnimationListener {
                    override fun onAnimationStart(animation: Animation?) {}

                    override fun onAnimationEnd(animation: Animation?) {
                        constraintMotelInfoShow.visibility = View.GONE
                        viewShowMotelInfo.visibility = View.VISIBLE
                    }

                    override fun onAnimationRepeat(animation: Animation?) {}
                })

            }


        }
    }

    @SuppressLint("SetTextI18n")
    private fun setUpDistanceDialog(requireContext: Context, latLng: LatLng) {
        val builder = AlertDialog.Builder(requireContext)
        builder.setTitle("Chọn bán kính")

        val distance = arrayOf("1 km", "2km", "3km", "5km")
        builder.setItems(distance){ _, which ->
            when (which){
                0 -> {
                    viewModel.setRadius(1000.0)
                    binding.showSelectDistance1.text = "1km"
                    binding.showSelectDistance2.text = "1km"
                    pinNowLocation(googleMap, latLng, 1000.0)
                }
                1 -> {
                    viewModel.setRadius(2000.0)
                    binding.showSelectDistance1.text = "2km"
                    binding.showSelectDistance2.text = "2km"
                    pinNowLocation(googleMap, latLng, 2000.0)
                }
                2 -> {
                    viewModel.setRadius(3000.0)
                    binding.showSelectDistance1.text = "3km"
                    binding.showSelectDistance2.text = "3km"
                    pinNowLocation(googleMap, latLng, 3000.0)
                }
                3 -> {
                    viewModel.setRadius(5000.0)
                    binding.showSelectDistance1.text = "5km"
                    binding.showSelectDistance2.text = "5km"
                    pinNowLocation(googleMap, latLng, 5000.0)
                }
            }
            viewModel.getRadius()
                ?.let { viewModel.getListMotel(latLng.latitude, latLng.longitude, it.toInt()) }
            subscribeUI()
        }

        val dialog = builder.create()
        dialog.show()
    }

    private fun pinNowLocation(map: GoogleMap, latLng: LatLng, radius: Double){
        map.clear()
        val bitmapDraw = ContextCompat.getDrawable(
            requireContext(), R.drawable.ic_pin_location
        ) as BitmapDrawable
        val b = bitmapDraw.bitmap
        val smallMarker = Bitmap.createScaledBitmap(b, 100, 100, false)
        googleMap.addMarker(
            MarkerOptions()
            .position(latLng))
            .setIcon(
                BitmapDescriptorFactory
                .fromBitmap(smallMarker))
        drawCircle(latLng, radius)
    }

    private fun setUpRecyclerViewMotelInfo() {
        motelInfoAdapter = MotelInfoAdapter(listMotel , this)
        binding.recyclerViewMotelInfo.apply {
            adapter = motelInfoAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }


    @SuppressLint("NotifyDataSetChanged")
    override fun onMapReady(p0: GoogleMap?) {
        googleMap = p0!!
        googleMap.uiSettings.isZoomControlsEnabled = true
        if (viewModel.getRadius() == null ){
            viewModel.setRadius(1000.0)
        }else{
            binding.showSelectDistance1.text = "${viewModel.getRadius()!!.toInt() /1000} km"
            binding.showSelectDistance2.text = "${viewModel.getRadius()!!.toInt() /1000} km"
        }
        setUpMap()

        val bitmapDraw = ContextCompat.getDrawable(
            requireContext(),
            R.drawable.ic_pin_location
        ) as BitmapDrawable
        val b = bitmapDraw.bitmap
        val smallMarker = Bitmap.createScaledBitmap(b, 100, 100, false)
        googleMap.setOnMapClickListener {latLng ->
            googleMap.clear()
            viewModel.latLng.value = latLng
            fillLocationInfo(latLng)
            viewModel.getRadius()?.let { drawCircle(latLng, it) }
            googleMap.addMarker(MarkerOptions()
                .position(latLng))
                .setIcon(BitmapDescriptorFactory.fromBitmap(smallMarker))
            val rd = viewModel.getRadius()?.toInt()
            rd?.let { viewModel.getListMotel(latLng.latitude, latLng.longitude, it) }
        }
    }

    private fun addMotelMarker(motelList: List<Motel>, ggMap: GoogleMap) {
        for (motel in motelList){
            val latLng = LatLng(motel.latitude, motel.longitude)
            ggMap.addMarker(MarkerOptions()
                .position(latLng))
                .setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
        }
    }

    private fun drawCircle(latLng: LatLng, rad: Double) {
        googleMap.addCircle(
            CircleOptions()
                .center(latLng)
                .radius(rad)
                .strokeWidth(2f)
                .strokeColor(Color.argb(100, 183, 32, 39))
                .fillColor(Color.argb(15, 183, 32, 39))
        )
    }

    private fun setUpMap(){
        googleMap.isMyLocationEnabled = true
        fusedLocationClient.lastLocation.addOnSuccessListener{
            if (it != null){
                lastLocation = it
                viewModel.latLng.value = LatLng(it.latitude, it.longitude)
                val currentLatLong = LatLng(it.latitude, it.longitude)
                viewModel.getRadius()
                    ?.let { it1 -> drawCircle(LatLng(it.latitude, it.longitude), it1) }
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLatLong, 15f))
                fillLocationInfo(LatLng(it.latitude, it.longitude))
                viewModel.getRadius()
                    ?.let { it1 -> viewModel.getListMotel(it.latitude, it.longitude, it1.toInt() ) }
            }
        }
    }


    @SuppressLint("SetTextI18n")
    private fun fillLocationInfo(latLng: LatLng){
        if(latLng == DEFAULT_LATLNG){
            return
        }

        binding.apply {
            binding.textViewAddress.isEnabled = false
            binding.textViewAddress
                .setText(String.
                format("Toạ độ: %.4f°B - %.4f°Đ", latLng.latitude, latLng.longitude))
        }
    }

    @SuppressLint("SetTextI18n", "NotifyDataSetChanged")
    fun subscribeUI(){
        with(viewModel){
            motelList.observe(viewLifecycleOwner){
                if (checkResource(it) && it.data != null){
                    binding.getActivityStatus = it.status
                    motelInfoAdapter.listMotel = it.data
                    if (it.data.isNotEmpty()){
                        binding.constraintMotelInfoShow.visibility = View.VISIBLE
                        binding.viewShowMotelInfo.visibility = View.GONE
                    }
                    addMotelMarker(it.data, googleMap)
                    binding.apply {
                        textViewSizeOfListMotel.text = "Có ${it.data.size} nhà trọ ở gần bạn"
                        textViewNumberOfListMotel.text = "Có ${it.data.size} nhà trọ ở gần bạn"
                    }
                    motelInfoAdapter.notifyDataSetChanged()
                }
                Log.v("_SearchMotelFragment", "${motelInfoAdapter.listMotel}")

            }
        }
    }


    private fun setupViewModel(){
        viewModel = ViewModelProvider(this, factory).get(TSearchMotelViewModel::class.java)
    }

    override fun navigateToMotelInfoDetailFragment(motel: Motel) {
        val action = TSearchMotelFragmentDirections.actionTSearchMotelFragmentToTMotelInfoFragment(motel)
        Navigation.findNavController(requireView()).navigate(action)
    }
}