package com.emglab.qlsv.modules.searchMotel.fragments

import android.annotation.SuppressLint
import android.location.Address
import android.location.Geocoder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.FragmentPickMotelLocationBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.ui.viewmodels.user.PickLocationViewModel
import com.emglab.qlsv.utilities.DEFAULT_LATLNG
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.approve_gift_code.view.*
import java.lang.Exception
import java.util.*

class PickMotelLocationFragment : Fragment(), Injectable, OnMapReadyCallback {

    private lateinit var viewModel: PickLocationViewModel
    private lateinit var binding: FragmentPickMotelLocationBinding
    private lateinit var mMap: GoogleMap

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProviders.of(this).get(PickLocationViewModel::class.java)
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_pick_motel_location,
            container,
            false
        )
        binding.mapView.getMapAsync(this)
        binding.apply {
            mapView.onCreate(savedInstanceState)
            mapView.onResume()
        }
        val location = RegisterToFindMotelFragment.selectedLocation
        if (location != null) {
            fillLocationInfo(location)
        }
        return binding.root
    }


    @SuppressLint("MissingPermission")
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.isMyLocationEnabled = true
        if (RegisterToFindMotelFragment.selectedLocation != null) {
            mMap.clear()
            val latLng = RegisterToFindMotelFragment.selectedLocation
            mMap.addMarker(MarkerOptions().position(latLng!!))
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15F))
        } else {
            mMap.clear()
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(DEFAULT_LATLNG, 15f))
        }

        mMap.setOnMapClickListener { latLng ->
            mMap.clear()
            RegisterToFindMotelFragment.selectedLocation = latLng
            fillLocationInfo(latLng)
            mMap.addMarker(MarkerOptions().position(latLng))
        }

        if (
            binding.mapView.findViewById<View>("1".toInt()) != null
        ) {
            // Get the button view
            val locationButton = (binding.mapView.findViewById<View>("1".toInt())
                .parent as View).findViewById<View>("2".toInt())
            // and next place it, on bottom right (as Google Maps app)
            val layoutParams =
                locationButton.layoutParams as RelativeLayout.LayoutParams
            // position on right bottom
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP, 0)
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE)
            layoutParams.setMargins(0, 0, 30, 30)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun fillLocationInfo(latLng: LatLng) {
        if (latLng == DEFAULT_LATLNG) {
            return
        }
        binding.apply {
            locationText.text =
                String.format("* Toạ độ: %.4f°B - %.4f°Đ", latLng.latitude, latLng.longitude)
        }

        val addresses: List<Address>
        val geocoder = Geocoder(requireContext(), Locale.getDefault())
        try {
            addresses = geocoder.getFromLocation(
                latLng.latitude,
                latLng.longitude,
                1
            )
            if (addresses.isNotEmpty()) {
                val address: String = addresses[0]
                    .getAddressLine(0)
                binding.addressText.text = "* Địa chỉ: $address"
                RegisterToFindMotelFragment.address = address
            }else{
                RegisterToFindMotelFragment.address = ""
            }
        } catch (e: Exception) {
            RegisterToFindMotelFragment.address = ""
        }
    }

}