package com.emglab.qlsv.teacher.fragment.motel

import android.annotation.SuppressLint
import android.location.Address
import android.location.Geocoder
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.emglab.qlsv.databinding.FragmentTPickLocationBinding
import com.emglab.qlsv.teacher.viewmodel.motel.TPickLocationViewModel
import com.emglab.qlsv.utilities.DEFAULT_LATLNG
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import java.lang.Exception
import java.util.*

class TPickLocationFragment : Fragment(), OnMapReadyCallback {


    private lateinit var viewModel: TPickLocationViewModel
    private lateinit var mMap: GoogleMap
    private lateinit var binding: FragmentTPickLocationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(TPickLocationViewModel::class.java)
        binding = FragmentTPickLocationBinding.inflate(inflater, container, false)
        binding.mapView.getMapAsync(this)
        binding.apply {
            mapView.onCreate(savedInstanceState)
            mapView.onResume()
        }
        if(TAddNewAddressFragment.newLatLng != null){
            fillLocationInfo(TAddNewAddressFragment.newLatLng!!)
        }
        return binding.root
    }
    @SuppressLint("MissingPermission")
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.isMyLocationEnabled = true
        if(TAddNewAddressFragment.newLatLng != null){
            mMap.clear()
            val latLng = TAddNewAddressFragment.newLatLng
            mMap.addMarker(MarkerOptions().position(latLng!!))
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15F))
        }else{
            mMap.clear()
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(DEFAULT_LATLNG, 15f))
        }

        mMap.setOnMapClickListener {latLng ->
            mMap.clear()
            TAddNewAddressFragment.newLatLng = latLng
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

    private fun fillLocationInfo(latLng: LatLng){
        if(latLng == DEFAULT_LATLNG){
            return
        }
        binding.apply {
            locationText.text = String.format("* Toạ độ: %.4f°B - %.4f°Đ", latLng.latitude, latLng.longitude)
        }

        val addresses: List<Address>
        val geocoder: Geocoder = Geocoder(requireContext(), Locale.getDefault())
        try {
            addresses = geocoder.getFromLocation(
                latLng.latitude,
                latLng.longitude,
                1
            )
            if(addresses.isNotEmpty()){
                val address: String = addresses[0]
                    .getAddressLine(0) // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
                binding.addressText.text = "* Địa chỉ: $address"
            }
        }catch (e: Exception){

        }

    }

}