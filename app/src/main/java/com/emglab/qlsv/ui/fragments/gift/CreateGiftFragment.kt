package com.emglab.qlsv.ui.fragments.gift

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.PopupMenu
import androidx.activity.OnBackPressedCallback
import androidx.annotation.MenuRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.CreateGiftFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.*
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.helper.TakePhotoHelper
import com.emglab.qlsv.models.entity.NotificationDialogType
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.models.entity.gift.GiftType
import com.emglab.qlsv.models.res.MyCTSVCap
import com.emglab.qlsv.ui.viewmodels.gift.CreateGiftViewModel
import com.emglab.qlsv.webservices.GiftWebService
import com.google.android.material.button.MaterialButton
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointForward
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import kotlinx.android.synthetic.main.create_gift_fragment.*
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Response
import java.io.File
import java.lang.Exception
import java.util.*
import javax.inject.Inject

class CreateGiftFragment : Fragment(), Injectable, TextWatcher {
    companion object{
        const val IMAGE_PICK_CODE = 1000
        const val PERMISSION_CODE = 1001
        const val REQUEST_TAKE_PHOTO = 1002
    }
    private lateinit var viewModel: CreateGiftViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    @Inject
    lateinit var giftWebService: GiftWebService
    private lateinit var binding: CreateGiftFragmentBinding
    private var deadlineSelected: Date? = null
    private var dateStartSelected: Date? = null
    private lateinit var takePhotoHelper : TakePhotoHelper
    private var imagePaths: Array<String> = arrayOf("", "", "")
    private var mCurrentPhotoPath: String? = null
    private lateinit var snackbar: Snackbar
    private var giftId: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.create_gift_fragment,
            container,
            false
        )
        takePhotoHelper = TakePhotoHelper(requireContext())
        binding.apply {
            imagePaths = this@CreateGiftFragment.imagePaths.toList()
            deadlineLayout.setEndIconOnClickListener {
                showDatePicker(deadlineLayout, "Hạn đăng kí")
            }
            deadlineLayout.setErrorIconOnClickListener {
                deadlineLayout.isErrorEnabled = false
                showDatePicker(deadlineLayout, "Hạn đăng kí")
            }
            dateStartLayout.setEndIconOnClickListener {
                showDatePicker(dateStartLayout, "Ngày bắt đầu nhận quà")
            }
            dateStartLayout.setErrorIconOnClickListener {
                dateStartLayout.isErrorEnabled = false
                showDatePicker(dateStartLayout, "Ngày bắt đầu nhận quà")
            }
            timeStartLayout.setEndIconOnClickListener {
                showTimePicker()
            }
            addImageLayout.setOnClickListener {
                showMenu(addImage, R.menu.take_picture_gift)
            }
            deleteImage1.setOnClickListener {
                showDeletePopUp(deleteImage1, 0)
            }
            deleteImage2.setOnClickListener {
                showDeletePopUp(deleteImage2, 1)
            }
            deleteImage3.setOnClickListener {
                showDeletePopUp(deleteImage3, 2)
            }
            val adapter = ArrayAdapter(
                requireContext(),
                R.layout.list_item_gift_type,
                GiftType.values().map { it.title }
            )
            giftTypeTextView.setAdapter(adapter)
            createGift.setOnClickListener {
                if (giftId != 0){
                    uploadImage(giftId)
                }else{
                    checkGiftInfo()
                }
            }
            setUpTextWatcher()
            activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    if(
                        binding.uploadImage1 == Status.LOADING
                        || binding.uploadImage2 == Status.LOADING
                        || binding.uploadImage3 == Status.LOADING
                    ){
                        showToast("Đang tải ảnh quà tặng")
                    }else{
                        val action = CreateGiftFragmentDirections.actionCreateGiftFragmentToGiftGivenFragment(false)
                        Navigation.findNavController(requireView()).navigate(action)
                        return
                    }
                }
            })
        }
        subscribeUi()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpSnackBar()
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(CreateGiftViewModel::class.java)
    }

    private fun subscribeUi(){
        with(viewModel){
            createGiftResp.observe(viewLifecycleOwner){
                binding.status = it.status
                if (checkResource(it) && it.data != null){
                    if (it.data != 0){
                        giftId = it.data
                        uploadImage(it.data)
                    }
                }
            }
        }
    }

    private fun showDatePicker(layout: TextInputLayout, title: String){
        val constraintsBuilder = CalendarConstraints.Builder()
            .setValidator(DateValidatorPointForward.now())

        val datePicker =
            MaterialDatePicker.Builder.datePicker()
                .setTitleText(title)
                .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                .setCalendarConstraints(constraintsBuilder.build())
                .build()
        datePicker.addOnPositiveButtonClickListener {
            val dateSelected = Date(it)
            when(layout){
                binding.deadlineLayout -> {
                    deadlineSelected = dateSelected
                    binding.deadLineEditText.setText(dateSelected.getDateStr())
                }
                binding.dateStartLayout -> {
                    dateStartSelected = dateSelected
                    binding.dateStartEditText.setText(dateSelected.getDateStr())
                }
            }
        }
        datePicker.show(requireActivity().supportFragmentManager, "")
    }

    @SuppressLint("SetTextI18n")
    private fun showTimePicker(){
        val picker = MaterialTimePicker.Builder()
            .setTimeFormat(TimeFormat.CLOCK_12H)
            .setHour(0)
            .setMinute(0)
            .setTitleText("Chọn thời gian bắt đầu nhận quà")
            .build()
        picker.addOnPositiveButtonClickListener {
            binding.timeStartEditText.setText(
                String.format("%02d:%02d", picker.hour, picker.minute)
            )
        }
        picker.show(requireActivity().supportFragmentManager, "")
    }

    private fun dispatchTakePictureIntent(requestTakePhoto : Int) {
        takePhotoHelper.dispatchTakePictureIntent()?.let {
            mCurrentPhotoPath = takePhotoHelper.getCurrentPhotoPath()
            startActivityForResult(it, requestTakePhoto)
        }
    }

    private fun pickImageFromGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_PICK_CODE)
    }

    override fun onActivityResult(requestCode:Int, resultCode:Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        if (resultCode == AppCompatActivity.RESULT_OK){
            when (requestCode) {
                REQUEST_TAKE_PHOTO -> {
                    if (mCurrentPhotoPath != null){
                        showPicture(mCurrentPhotoPath!!)
                    }
                }
                IMAGE_PICK_CODE ->{
                    try {
                        mCurrentPhotoPath = getRealPathFromURI(intent!!.data!!)
                        showPicture(mCurrentPhotoPath!!)
                    }catch (e: Exception){
                        showToast("Không lấy được ảnh")
                    }
                }
            }
        }
    }

    private fun showPicture(path: String){
        if (path.isEmpty()){
            return
        }
        when {
            imagePaths[0].isEmpty() -> {
                imagePaths[0] = path
                binding.image1.setImageBitmap(takePhotoHelper.setPic(binding.image1, path))
            }
            imagePaths[1].isEmpty() -> {
                imagePaths[1] = path
                binding.image2.setImageBitmap(takePhotoHelper.setPic(binding.image2, path))
            }
            else -> {
                imagePaths[2] = path
                binding.image3.setImageBitmap(takePhotoHelper.setPic(binding.image3, path))
            }
        }
        binding.imagePaths = imagePaths.toList()
    }

    private fun showDeletePopUp(button: MaterialButton, index: Int){
        val popup = PopupMenu(requireContext(), button)
        popup.menuInflater.inflate(R.menu.delete_gift_image, popup.menu)
        popup.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId){
                R.id.delete_image -> {
                    deleteImage(index)
                }
            }
            true
        }
        popup.show()
    }

    private fun deleteImage(index: Int){
        when(index){
            2 -> {
                imagePaths[index] = ""
            }
            1 -> {
                imagePaths[1] = imagePaths[2]
                imagePaths[2] = ""
            }
            0 -> {
                imagePaths[0] = imagePaths[1]
                imagePaths[1] = imagePaths[2]
                imagePaths[2] = ""
            }
        }
        binding.imagePaths = imagePaths.toList()
    }

    private fun getRealPathFromURI(contentUri: Uri):String {
        var path:String? = null
        val proj = arrayOf(MediaStore.MediaColumns.DATA)
        val cursor = requireContext().contentResolver.query(contentUri, proj, null, null, null)
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

    private fun showMenu(v: View, @MenuRes menu: Int){
        val popup = PopupMenu(requireContext(), v)
        popup.menuInflater.inflate(menu, popup.menu)
        popup.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId){
                R.id.take_picture -> {
                    checkCameraPermission()
                }
                R.id.get_from_gallery -> {
                    checkGalleryPermission()
                }
            }
            true
        }
        popup.show()
    }

    private fun checkCameraPermission(){
        Dexter.withContext(requireContext())
            .withPermissions(
                Manifest.permission.CAMERA,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE
            )
            .withListener(object: MultiplePermissionsListener {
                @SuppressLint("MissingPermission")
                override fun onPermissionsChecked(report: MultiplePermissionsReport) {
                    // check if all permissions are granted
                    if (report.areAllPermissionsGranted()) {
                        dispatchTakePictureIntent(REQUEST_TAKE_PHOTO)
                    }

                    if (report.isAnyPermissionPermanentlyDenied) {
                        requestPermission()
                    }
                }

                override fun onPermissionRationaleShouldBeShown(permissions:List<PermissionRequest>, token: PermissionToken) {
                    token.continuePermissionRequest()
                }
            })
            .onSameThread()
            .check()
    }

    private fun checkGalleryPermission(){
        Dexter.withContext(requireContext())
            .withPermissions(
                Manifest.permission.READ_EXTERNAL_STORAGE
            )
            .withListener(object: MultiplePermissionsListener {
                @SuppressLint("MissingPermission")
                override fun onPermissionsChecked(report: MultiplePermissionsReport) {
                    // check if all permissions are granted
                    if (report.areAllPermissionsGranted()) {
                        pickImageFromGallery()
                    }

                    if (report.isAnyPermissionPermanentlyDenied) {
                        requestPermission()
                    }
                }

                override fun onPermissionRationaleShouldBeShown(permissions:List<PermissionRequest>, token: PermissionToken) {
                    token.continuePermissionRequest()
                }
            })
            .onSameThread()
            .check()
    }

    private fun requestPermission(){
        Snackbar.make(
            binding.root,
            "Bạn cần cấp quyền camera và lưu trữ để sử dụng tính năng này",
            Snackbar.LENGTH_SHORT
        ).setAction("Cài đặt"){
            openSetting()
        }.show()
    }

    private fun openSetting(){
        try {
            val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
            val uri: Uri = Uri.fromParts("package", requireActivity().packageName, null)
            intent.data = uri
            startActivity(intent)
        }catch (e: Exception){
            FirebaseCrashlytics.getInstance().recordException(e)
        }
    }

    private fun checkGiftInfo(){
        val gift = Gift()
        binding.apply {
            gift.name = binding.giftName.text.toString()
            gift.type = binding.giftTypeTextView.text.toString()
            gift.quantity = binding.giftQuantity.text.toString().toIntOrNull() ?: 0
            if (deadlineSelected != null){
                gift.registrationDeadline = deadlineSelected!!.toTimeQueryStr()
            }
            gift.description = giftDescription.text.toString()
            gift.addressToReceiveGift = receiveAddress.text.toString()
            if (deliveryEnableCheckBox.isChecked){
                gift.deliveryEnable = 1
            }else{
                gift.deliveryEnable = 0
            }
            gift.contactPerson = fullName.text.toString()
            if (dateStartSelected != null){
                gift.startTimeToReceiveGift = "${dateStartSelected!!.toDateQuery()} ${binding.timeStartEditText.text.toString()}:00"
            }
            gift.email = email.text.toString()
            gift.phoneNumber = phoneNumber.text.toString()
            gift.linkFb = facbook.text.toString()
        }

        if (gift.isEnoughInfo()){
            if (imagePaths[0] == "" && imagePaths[1] == "" && imagePaths[2] == ""){
                showToast("Thiếu thông tin ảnh quà tặng")
            }else{
                viewModel.createGift(gift)
            }
        }else{
            if (gift.name.isEmpty()){
                binding.giftNameLayout.error = "Thiếu tên quà tặng"
            }
            if (gift.type.isEmpty()){
                binding.giftTypeLayout.error = "Thiếu loại quà tặng"
            }
            if (gift.quantity <= 0){
                binding.giftQuantityLayout.error = "Số lượng quà tặng không hợp lệ"
            }
            if (gift.registrationDeadline.isEmpty()){
                binding.deadlineLayout.error = "Thiếu thông tin hạn đăng kí"
            }
            if (gift.description.isEmpty()){
                binding.giftDescriptionLayout.error = "Thiếu thông tin mô tả quà tặng"
            }
            if (gift.addressToReceiveGift.length < 6){
                binding.addressLayout.error = "Thông tin địa chỉ nhận quà không hợp lệ"
            }
            if (gift.startTimeToReceiveGift.isEmpty()){
                binding.dateStartLayout.error = "Thiếu ngày bắt đầu nhận quà"
            }
            if (gift.contactPerson.isEmpty()){
                binding.fullNameLayout.error = "Thiếu thông tin liên hệ"
            }
        }
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        binding.apply {
            giftNameLayout.isErrorEnabled = false
            giftTypeLayout.isErrorEnabled = false
            giftQuantityLayout.isErrorEnabled = false
            deadlineLayout.isErrorEnabled = false
            giftDescriptionLayout.isErrorEnabled = false
            addressLayout.isErrorEnabled = false
            dateStartLayout.isErrorEnabled = false
            fullNameLayout.isErrorEnabled = false
        }
    }

    override fun afterTextChanged(p0: Editable?) { }

    private fun setUpTextWatcher(){
        binding.apply {
            giftName.addTextChangedListener(this@CreateGiftFragment)
            giftQuantity.addTextChangedListener(this@CreateGiftFragment)
            giftDescription.addTextChangedListener(this@CreateGiftFragment)
            receiveAddress.addTextChangedListener(this@CreateGiftFragment)
            fullName.addTextChangedListener(this@CreateGiftFragment)
            giftTypeTextView.addTextChangedListener(this@CreateGiftFragment)
        }
    }

    private fun uploadImage1(path: String, giftId: Int){
        val file = File(path)
        if (!file.exists() || MediaType.parse("image/*") == null){
            binding.uploadImage1 = Status.SUCCESS_DB
            return
        }
        val fileReqBody = RequestBody.create(MediaType.parse("image/*"), file)
        val multiPathBody = MultipartBody.Part.createFormData(
            "file", path, fileReqBody
        )

        binding.uploadImage1 = Status.LOADING
        giftWebService.uploadImageGift(
            userName = sharedPrefsHelper.getUserName(),
            token = sharedPrefsHelper.getToken(),
            giftId = giftId,
            typeImage = 1,
            image = multiPathBody
        ).enqueue(object : retrofit2.Callback<MyCTSVCap>{
            override fun onResponse(call: Call<MyCTSVCap>, response: Response<MyCTSVCap>) {
                val uploadImageResp = response.body()
                if (uploadImageResp != null){
                    if (uploadImageResp.respCode == 0){
                        binding.uploadImage1 = Status.SUCCESS_DB
                        showAlertSuccess()
                    }else{
                        binding.uploadImage1 = Status.ERROR
                        showUploadImageFail(" - ${uploadImageResp.respText}")
                    }
                }else{
                    binding.uploadImage1 = Status.ERROR
                    showUploadImageFail("")
                }
            }

            override fun onFailure(call: Call<MyCTSVCap>, t: Throwable) {
                binding.uploadImage1 = Status.ERROR
                showUploadImageFail("")
            }

        })
    }

    private fun uploadImage2(path: String, giftId: Int){
        val file = File(path)
        if (!file.exists() || MediaType.parse("image/*") == null){
            binding.uploadImage2 = Status.SUCCESS_DB
            return
        }
        val fileReqBody = RequestBody.create(MediaType.parse("image/*"), file)
        val multiPathBody = MultipartBody.Part.createFormData(
            "file", path, fileReqBody
        )

        binding.uploadImage2 = Status.LOADING
        giftWebService.uploadImageGift(
            userName = sharedPrefsHelper.getUserName(),
            token = sharedPrefsHelper.getToken(),
            giftId = giftId,
            typeImage = 2,
            image = multiPathBody
        ).enqueue(object : retrofit2.Callback<MyCTSVCap>{
            override fun onResponse(call: Call<MyCTSVCap>, response: Response<MyCTSVCap>) {
                val uploadImageResp = response.body()
                if (uploadImageResp != null){
                    if (uploadImageResp.respCode == 0){
                        binding.uploadImage2 = Status.SUCCESS_DB
                        showAlertSuccess()
                    }else{
                        binding.uploadImage2 = Status.ERROR
                        showUploadImageFail(" - ${uploadImageResp.respText}")
                    }
                }else{
                    binding.uploadImage2 = Status.ERROR
                    showUploadImageFail("")
                }
            }

            override fun onFailure(call: Call<MyCTSVCap>, t: Throwable) {
                binding.uploadImage2 = Status.ERROR
                showUploadImageFail("")
            }

        })
    }

    private fun uploadImage3(path: String, giftId: Int){
        val file = File(path)
        if (!file.exists() || MediaType.parse("image/*") == null){
            binding.uploadImage3 = Status.SUCCESS_DB
            return
        }
        val fileReqBody = RequestBody.create(MediaType.parse("image/*"), file)
        val multiPathBody = MultipartBody.Part.createFormData(
            "file", path, fileReqBody
        )

        binding.uploadImage3 = Status.LOADING
        giftWebService.uploadImageGift(
            userName = sharedPrefsHelper.getUserName(),
            token = sharedPrefsHelper.getToken(),
            giftId = giftId,
            typeImage = 3,
            image = multiPathBody
        ).enqueue(object : retrofit2.Callback<MyCTSVCap>{
            override fun onResponse(call: Call<MyCTSVCap>, response: Response<MyCTSVCap>) {
                val uploadImageResp = response.body()
                if (uploadImageResp != null){
                    if (uploadImageResp.respCode == 0){
                        binding.uploadImage3 = Status.SUCCESS_DB
                        showAlertSuccess()
                    }else{
                        binding.uploadImage3 = Status.ERROR
                        showUploadImageFail(" - ${uploadImageResp.respText}")
                    }
                }else{
                    binding.uploadImage3 = Status.ERROR
                    showUploadImageFail("")
                }
            }

            override fun onFailure(call: Call<MyCTSVCap>, t: Throwable) {
                binding.uploadImage3 = Status.ERROR
                showUploadImageFail("")
            }

        })
    }

    private fun uploadImage(giftId: Int){
        showToast("Đang tải ảnh quà tặng")
        this.giftId = giftId
        uploadImage1(imagePaths[0], giftId)
        uploadImage2(imagePaths[1], giftId)
        uploadImage3(imagePaths[2], giftId)
    }

    private fun setUpSnackBar(){
        snackbar = Snackbar.make(requireView(), "Upload ảnh không thành công", Snackbar.LENGTH_LONG)
            .setAction("Thử lại"){
                uploadImage(giftId)
            }
    }


    fun showUploadImageFail(message: String){
        if (
            binding.uploadImage1 == Status.ERROR
            || binding.uploadImage2 == Status.ERROR
            || binding.uploadImage3 == Status.ERROR
        ){
            snackbar.setText("Upload ảnh không thành công $message")
            snackbar.show()
        }
    }

    private fun showAlertSuccess(){
        if (
            binding.uploadImage1 == Status.SUCCESS_DB
            && binding.uploadImage2 == Status.SUCCESS_DB
            && binding.uploadImage3 == Status.SUCCESS_DB
        ){
            showNotificationDialog(
                type = NotificationDialogType.COMPLETE,
                message = "Tạo quà tặng thành công",
                cancelable = false,
                handleDone = {
                    popToListGiftFragment()
                }
            )
        }
    }

    private fun popToListGiftFragment(){
        val action = CreateGiftFragmentDirections.actionCreateGiftFragmentToGiftGivenFragment(true)
        Navigation.findNavController(requireView()).navigate(action)
    }

}