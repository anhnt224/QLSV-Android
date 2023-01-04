package com.emglab.qlsv.ui.fragments.activity


import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import android.view.*
import androidx.core.content.ContextCompat.checkSelfPermission

import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.ui.adapter.activity.UserCheckInActivityAdapter
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.FragmentUserCheckInActivityBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.extension.*
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.helper.TakePhotoHelper
import com.emglab.qlsv.helper.location.LocationModel
import com.emglab.qlsv.helper.location.LocationViewModel
import com.emglab.qlsv.models.CheckInViewType
import com.emglab.qlsv.models.entity.FakeGPSInfo
import com.emglab.qlsv.models.entity.UserCheckInActivity
import com.emglab.qlsv.ui.fragments.FragmentLocationBase
import com.emglab.qlsv.utilities.*
import com.emglab.qlsv.ui.viewmodels.activity.UserCheckInActivityViewModel

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.fragment_user_check_in_activity.*
import kotlinx.android.synthetic.main.list_item_day_of_week.view.*

import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File
import java.lang.Exception
import java.util.*
import javax.inject.Inject


class UserCheckInActivityInfoFragment : FragmentLocationBase(), OnMapReadyCallback,Injectable {

    //@Inject lateinit var sharedPrefsHelper: SharedPrefsHelper
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject lateinit var appExecutors: AppExecutors
    private lateinit var mViewmodel: UserCheckInActivityViewModel
    private lateinit var locationViewModel: LocationViewModel
    private lateinit var adapter : UserCheckInActivityAdapter
    private var AId = 0
    private var AGId = 0
    private var UserCode = ""
    private var AName = ""
    private lateinit var mMap: GoogleMap
    private var isGPSEnabled = false
    private val REQUEST_TAKE_PHOTO_PLACE = 1
    private var fileName = UUID.randomUUID().toString()
    companion object{
        private val IMAGE_PICK_CODE = 1000
        private val PERMISSION_CODE = 1001;    }
    private var listCheckIn: List<UserCheckInActivity> = listOf()

    private var binding by autoCleared<FragmentUserCheckInActivityBinding>()
    lateinit var takePhotoHelper : TakePhotoHelper
    private var mCurrentPhotoPath: String? = null
    private var photoPathCompress: String? = null
    private var checkInViewType: CheckInViewType = CheckInViewType.LIST
    private var isSaveFakeGPSInfo: Boolean = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        AId = UserCheckInActivityInfoFragmentArgs.fromBundle(arguments!!).aId
        UserCode = UserCheckInActivityInfoFragmentArgs.fromBundle(arguments!!).userCode
        AGId = UserCheckInActivityInfoFragmentArgs.fromBundle(arguments!!).agId
        AName = UserCheckInActivityInfoFragmentArgs.fromBundle(arguments!!).aName

        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_user_check_in_activity, container, false)
        setupViewModel()

        adapter = UserCheckInActivityAdapter(appExecutors)

        takePhotoHelper = TakePhotoHelper(context!!)

        showImage()

        binding.apply {
            lifecycleOwner = this@UserCheckInActivityInfoFragment
            aName = AName
            val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            listUserCheckInActivityRecycler.layoutManager = layoutManager
            listUserCheckInActivityRecycler.adapter = adapter
            subscribeUi()

            retryCallback = object : RetryCallback {
                override fun retry() {
                    mViewmodel.retry()
                }
            }

            btnCheckInActivity.setOnClickListener {
                if(checkLocationPermission()){
                    checkIn()
                }
            }

            mapView.getMapAsync(this@UserCheckInActivityInfoFragment)
            mapView.onCreate(savedInstanceState)
            mapView.onResume()

            btnTakePhoto.setOnClickListener {
                if(checkCameraPermission()){
                    this@UserCheckInActivityInfoFragment.context?.showListDialog("Chọn cách lấy minh chứng",null,
                        arrayListOf("Chụp ảnh","Lấy từ thư viện")){
                        if (it == 0){
                            dispatchTakePictureIntent(REQUEST_TAKE_PHOTO_PLACE)
                        }
                        if (it == 1){
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                                if (checkSelfPermission(this@UserCheckInActivityInfoFragment.context!!,Manifest.permission.READ_EXTERNAL_STORAGE) ==
                                    PackageManager.PERMISSION_DENIED){
                                    //permission denied
                                    val permissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
                                    //show popup to request runtime permission
                                    requestPermissions(permissions, PERMISSION_CODE)
                                }
                                else{
                                    //permission already granted
                                    pickImageFromGallery()
                                }
                            }
                            else{
                                //system OS is < Marshmallow
                                pickImageFromGallery()
                            }
                        }
                    }
                }
            }

            buttonView.setOnClickListener {
                if(checkInViewType == CheckInViewType.LIST){
                    checkInViewType = CheckInViewType.MAP
                    buttonView.setIconResource(R.drawable.ic_list)
                    mapLayout.visibility = View.VISIBLE
                    addListMarkers(listCheckIn)
                }else{
                    buttonView.setIconResource(R.drawable.ic_map_view)
                    checkInViewType = CheckInViewType.LIST
                    mapLayout.visibility = View.GONE
                }

            }
        }

        return binding.root
    }

    private fun dispatchTakePictureIntent(requestTakePhoto : Int) {
        takePhotoHelper.dispatchTakePictureIntent()?.let {
            mCurrentPhotoPath = takePhotoHelper.getCurrentPhotoPath()
            startActivityForResult(it, requestTakePhoto)
        }
    }

    private fun pickImageFromGallery() {
        //Intent to pick image
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_PICK_CODE)
    }

    private fun checkIn() {
        if (isLocationNotNull()){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
                mViewmodel.userCheckinActivity(AId,locationModel.longitude,locationModel.latitude,address,"")
            }
        }
        else  {
            showToast(context?.resources?.getString(R.string.the_location_is_not_available)!!)
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when(requestCode){
            PERMISSION_CODE -> {
                if (grantResults.isNotEmpty() && grantResults[0] ==
                    PackageManager.PERMISSION_GRANTED){
                    //permission from popup granted
                    pickImageFromGallery()
                }
                else{
                    //permission from popup denied
                    showToast("Chưa cấp quyền")
                }
            }
        }
    }

    private fun setupViewModel() {
        mViewmodel = ViewModelProviders.of(this, viewModelFactory).get(UserCheckInActivityViewModel::class.java)
        mViewmodel.setId(AId,UserCode)
        locationViewModel = ViewModelProviders.of(this).get(LocationViewModel::class.java)
    }

    private fun subscribeUi() {
        with(mViewmodel){
            userCheckInActivities.observe(viewLifecycleOwner, Observer { resource ->
                binding.userCheckInActivityResource = resource
                if (resource.data != null){
                    if (resource.status == Status.SUCCESS_NETWORK){
                        adapter.submitList(resource.data)
                        listCheckIn = resource.data
                    }
                }
            })

            userCheckInActivityResource.observe(viewLifecycleOwner, Observer { resource ->
                binding.checkInActivityResource = resource
                if (resource.data != null && isCheckIn){
                    if (resource.status == Status.SUCCESS_NETWORK){
                        showToast(context?.resources?.getString(R.string.check_in_success)!!)
                        isCheckIn = false
                        mViewmodel.retry()
                    }
                    if (resource.status == Status.ERROR){
                        showToast(resource.respText!!)
                        isCheckIn = false
                    }
                }
            })
            uploadImageCallResource.observe(viewLifecycleOwner, Observer { resource ->
                binding.checkInActivityResource = resource
                if (resource.data != null && isCheckIn){
                    if (resource.status == Status.SUCCESS_NETWORK){
                        showToast("Gửi minh chứng thành công")
                        showImage()
                        isCheckIn = false
                    }
                    if (resource.status == Status.ERROR){
                        showToast(resource.respText!!)
                        isCheckIn = false
                    }
                }
            })
        }
    }

    private fun showImage() {
        val userName = sharedPrefsHelper.get(SharedPrefsHelper.USER_CODE,"")
        val token = sharedPrefsHelper.get(SharedPrefsHelper.TOKEN,"")
        binding.imgActivity.loadFromURL("${API_SERVICE_BASE_URL}UploadFile/CTSV/Download?UserName=${userName}&UserCode=${userName}&AId=${AId}&TokenCode=${token}")
    }

    override fun locationUpdate(locationModel: LocationModel) {
        if(locationModel.isChecking()){
            binding.btnCheckInActivity.text = "Đang kiểm tra ..."
            binding.btnCheckInActivity.isEnabled = false
        }else if(locationModel.isMock()){
            showToast("Vị trí của bạn hoạt động không chính xác, vui lòng kiểm tra lại")
            binding.btnCheckInActivity.text = "CheckIn"
            binding.btnCheckInActivity.isEnabled = false
            if(isSaveFakeGPSInfo){
                isSaveFakeGPSInfo = false
                saveFakeGPSInfo(locationModel.latitude, locationModel.longitude)
            }
        }else {
            binding.btnCheckInActivity.text = "CheckIn"
            binding.btnCheckInActivity.isEnabled = true
        }
    }

    override fun addressUpdate(address: String){
        //  binding.txtAddress.setText(address)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.clear()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                requireActivity().onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
    }

    override fun onActivityResult(requestCode:Int, resultCode:Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        if (resultCode == AppCompatActivity.RESULT_OK){
            when (requestCode) {
                REQUEST_TAKE_PHOTO_PLACE -> {
                    photoPathCompress = context?.let { takePhotoHelper.compressImageBeforeSend(it,mCurrentPhotoPath,fileName) }
                    uploadfile()
                }
                IMAGE_PICK_CODE ->{
                    try {
                        mCurrentPhotoPath = getRealPathFromURI(intent!!.data!!)
                        photoPathCompress = context?.let { takePhotoHelper.compressImageBeforeSend(it,mCurrentPhotoPath,fileName) }
                        uploadfile()
                    }catch (e: Exception){
                        showToast("Không lấy được ảnh")
                    }
                }
            }
        }
    }

    private fun getRealPathFromURI(contentUri: Uri):String {
        var path:String? = null
        val proj = arrayOf<String>(MediaStore.MediaColumns.DATA)
        val cursor = context!!.contentResolver.query(contentUri, proj, null, null, null)
        if(cursor != null){
            if (cursor.moveToFirst())
            {
                val columnIndex = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DATA)
                path = cursor.getString(columnIndex)
            }
            cursor.close()
        }
        return path!!
    }

    private fun uploadfile() {
        if (photoPathCompress!!.isNotEmpty()){
            val file =  File(photoPathCompress)
            val  fileReqBody = RequestBody.create(MediaType.parse("image/*"), file)
            val  multipartBody = MultipartBody.Part.createFormData("file",photoPathCompress,fileReqBody)
            mViewmodel.uploadFile(AId,multipartBody)
        }
    }

    private fun addListMarkers(userCheckInActivities: List<UserCheckInActivity>){
        if(!(::mMap.isInitialized)){
            return
        }
        mMap.clear()
        userCheckInActivities.forEach {
            mMap.addMarker(
                MarkerOptions()
                    .position(LatLng(it.latitude!!, it.longitude!!))
            )
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(it.latitude!!, it.longitude!!), 16.0f))
        }
    }

    private fun saveFakeGPSInfo(lat: Double, lng: Double){
        val userName = sharedPrefsHelper.getUserName()
        val fullName = sharedPrefsHelper.getFullName()
        val email = sharedPrefsHelper.getEmail()

        val db = FirebaseDatabase.getInstance()
        val ref = db.getReference("fakeGPS").child(userName)

        val fakeGPSInfo = FakeGPSInfo(
            studentName = fullName,
            eventName = AName,
            lat = lat,
            lng = lng,
            time = Date().convertDateToStringDateTime(),
            email = email
        )
        ref.push().setValue(fakeGPSInfo)

    }




}


