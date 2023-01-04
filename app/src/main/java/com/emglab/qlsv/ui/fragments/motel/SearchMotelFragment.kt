package com.emglab.qlsv.ui.fragments.motel

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.app.AlertDialog
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.SearchMotelFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.models.entity.Motel
import com.emglab.qlsv.ui.adapter.MotelInfoAdapter
import com.emglab.qlsv.ui.viewmodels.motel.SearchMotelViewModel
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

class SearchMotelFragment : Fragment(),
    Injectable,
    MotelInfoAdapter.OnItemMotelInfoClickListener,
    OnMapReadyCallback,
    GoogleMap.OnCameraMoveListener
{

    private lateinit var viewModel: SearchMotelViewModel
    @Inject
    lateinit var factory: ViewModelFactory

    private lateinit var binding: SearchMotelFragmentBinding
    private var listMotel = listOf<Motel>()
    private lateinit var motelInfoAdapter: MotelInfoAdapter
    private lateinit var googleMap: GoogleMap
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private var distanceArray: List<SearchMotelDistance> = SearchMotelDistance.values().toList()
    private var showMarkerFail: Boolean = false

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupViewModel()
        binding = DataBindingUtil.inflate(inflater,
            R.layout.search_motel_fragment,
            container,
            false)


        binding.map.getMapAsync(this)
        binding.apply {
            map.onCreate(savedInstanceState)
            map.onResume()

            distanceLayout.setOnClickListener {
                showDistanceDialog()
            }
            viewListMotelInfo.setOnClickListener {
                viewModel.changeFooterState()
            }
        }

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireActivity().baseContext)

        setUpRecyclerViewMotelInfo()
        subscribeUI()
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    private fun showDistanceDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Chọn bán kính")

        val distance = distanceArray.map {
            it.distanceStr
        }.toTypedArray()
        builder.setItems(distance){ _, which ->
            viewModel.setRadius(distanceArray[which])
        }

        val dialog = builder.create()
        dialog.show()
    }

    private fun setUpRecyclerViewMotelInfo() {
        motelInfoAdapter = MotelInfoAdapter(listMotel , this)
        binding.recyclerViewMotelInfo.apply {
            adapter = motelInfoAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }


    private fun setupViewModel(){
        viewModel = ViewModelProvider(this, factory).get(SearchMotelViewModel::class.java)
    }

    override fun navigateToMotelInfoDetailFragment(motel: Motel) {
        val action = SearchMotelFragmentDirections.actionSearchMotelFragmentToMotelInfoFragment(motel)
        Navigation.findNavController(requireView()).navigate(action)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onMapReady(p0: GoogleMap?) {
        if (p0 == null){
            return
        }
        googleMap = p0
        googleMap.setOnCameraMoveListener(this)
        googleMap.uiSettings.isZoomControlsEnabled = true
        setUpMap()

        googleMap.setOnMapClickListener {latLng ->
            viewModel.zoomLevel.value = googleMap.cameraPosition.zoom
            viewModel.setLatLng(latLng)
        }

        if (showMarkerFail){
            addMotelMarker(motelInfoAdapter.listMotel)
        }
    }

    private fun addMotelMarker(motelList: List<Motel>) {
        if (!::googleMap.isInitialized){
            showMarkerFail = true
            return
        }
        showMarkerFail = false
        googleMap.clear()
        drawCircle(viewModel.latLng.value, viewModel.radius.value)
        for (motel in motelList){
            val latLng = LatLng(motel.latitude, motel.longitude)
            googleMap.addMarker(MarkerOptions()
                .position(latLng))
        }
    }

    private fun drawCircle(latLng: LatLng?, distance: SearchMotelDistance?) {
        if (latLng == null || distance == null || !::googleMap.isInitialized){
            return
        }
        googleMap.clear()
        googleMap.addCircle(
            CircleOptions()
                .center(latLng)
                .radius(distance.distance)
                .strokeWidth(2f)
                .strokeColor(Color.argb(100, 183, 32, 39))
                .fillColor(Color.argb(15, 183, 32, 39))
        )

        val bitmapDraw = ContextCompat.getDrawable(
            requireContext(),
            R.drawable.ic_pin_location
        ) as BitmapDrawable
        val b = bitmapDraw.bitmap
        val smallMarker = Bitmap.createScaledBitmap(b, 80, 80, false)

        googleMap.addMarker(MarkerOptions()
            .position(latLng))
            .setIcon(BitmapDescriptorFactory.fromBitmap(smallMarker))
        if (viewModel.mapCenter.value != null) {
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                viewModel.mapCenter.value,
                viewModel.zoomLevel.value!!
            ))
        }else{
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, viewModel.zoomLevel.value!!))
        }
    }

    private fun setUpMap(){
        googleMap.isMyLocationEnabled = true
        fusedLocationClient.lastLocation.addOnSuccessListener{
            if (it != null && viewModel.latLng.value == null){
                viewModel.setLatLng(LatLng(it.latitude, it.longitude))
            }else{
                drawCircle(viewModel.latLng.value, viewModel.radius.value)
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
                format("%.4f°B - %.4f°Đ", latLng.latitude, latLng.longitude))
        }
    }

    @SuppressLint("SetTextI18n", "NotifyDataSetChanged")
    fun subscribeUI(){
        with(viewModel){
            motelList.observe(viewLifecycleOwner){
                if (checkResource(it) && it.data != null){
                    binding.getActivityStatus = it.status
                    motelInfoAdapter.listMotel = it.data
                    addMotelMarker(it.data)
                    binding.apply {
                        textViewNumberOfListMotel.text = "Có ${it.data.size} nhà trọ ở gần bạn"
                    }
                    motelInfoAdapter.notifyDataSetChanged()
                }
                Log.v("_SearchMotelFragment", "${motelInfoAdapter.listMotel}")
            }

            latLng.observe(viewLifecycleOwner){latLng ->
                viewModel.getListMotel()

                drawCircle(latLng, radius.value)
                fillLocationInfo(latLng)
            }

            radius.observe(viewLifecycleOwner){
                binding.showSelectDistance1.text = it.distanceStr
                viewModel.getListMotel()

                drawCircle(latLng.value, radius.value)
            }

            footerState.observe(viewLifecycleOwner){
                if (it == SearchMotelFooterState.EXPAND){
                    ObjectAnimator.ofFloat(binding.viewListMotelInfo, "translationY",
                        0f).apply {
                        duration = 300
                        start()
                    }
                }else{
                    val titleHeight = resources.getDimension(R.dimen.searchMotelFooterTitleSize)
                    ObjectAnimator.ofFloat(binding.viewListMotelInfo, "translationY",
                        binding.viewListMotelInfo.height.toFloat() - titleHeight).apply {
                        duration = 300
                        start()
                    }
                }
            }
        }
    }

    override fun onCameraMove() {
        viewModel.zoomLevel.value = googleMap.cameraPosition.zoom
        viewModel.mapCenter.value = googleMap.cameraPosition.target
    }
}

enum class SearchMotelFooterState{
    EXPAND, COLLAPSE
}

enum class SearchMotelDistance(val distance: Double, val distanceStr: String) {
    ONE(1000.0, "1km"),
    TWO(2000.0, "2km"),
    THREE(3000.0, "3km"),
    FIVE(5000.0, "5km")
}
