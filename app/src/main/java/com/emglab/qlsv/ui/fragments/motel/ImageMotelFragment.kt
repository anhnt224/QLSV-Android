package com.emglab.qlsv.ui.fragments.motel

import android.Manifest
import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.databinding.FragmentImageMotelBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.*
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.helper.TakePhotoHelper
import com.emglab.qlsv.models.entity.ImageMotel
import com.emglab.qlsv.models.res.activity.CTSVAssignUserActivityRes
import com.emglab.qlsv.ui.adapter.ImageMotelAdapter
import com.emglab.qlsv.ui.fragments.user.AddNewAddressFragment
import com.emglab.qlsv.ui.viewmodels.motel.ImageMotelViewModel
import com.emglab.qlsv.webservices.WebService
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Response
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


class ImageMotelFragment : Fragment(),ImageMotelAdapter.OnItemClickListener, Injectable {

    companion object {
        private const val IMAGE_PICK_CODE = 1000
        private const val PERMISSION_CODE = 1001
    }

    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var webService : WebService
    private lateinit var viewModel: ImageMotelViewModel
    private lateinit var binding: FragmentImageMotelBinding
    private lateinit var imageAdapter: ImageMotelAdapter
    private var imageLst: ArrayList<ImageMotel> = ArrayList()
    private var motelID: Int = -1
    lateinit var takePhotoHelper : TakePhotoHelper
    private var mCurrentPhotoPath: String? = null
    private var photoPathCompress: String? = null
    private val REQUEST_TAKE_PHOTO_PLACE = 1
    private var fileName = UUID.randomUUID().toString()
    private var isImageUploading = false
    private lateinit var loadingDialog: Dialog
    private var imageUploading = ImageMotel()
    private var imageMotel = ImageMotel()
    private var imageSaveType : ArrayList<ImageMotel> = ArrayList()


    @SuppressLint("FragmentBackPressedCallback", "SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupViewModel()
        binding = DataBindingUtil.inflate(inflater, com.emglab.qlsv.R.layout.fragment_image_motel, container, false)
        motelID = ImageMotelFragmentArgs.fromBundle(requireArguments()).motelID
        takePhotoHelper = TakePhotoHelper(requireContext())
        loadingDialog = initLoadingDialog()
        setupRecyclerView()
        binding.apply {

            val callback: OnBackPressedCallback =
                object : OnBackPressedCallback(true /* enabled by default */) {
                    override fun handleOnBackPressed() {
                        handleBack()
                    }
                }
            requireActivity().onBackPressedDispatcher.addCallback(this@ImageMotelFragment, callback)
            if (AddNewAddressFragment.mAddress.type == "Nhà trọ"){
                addImageButton.text = "Thêm ảnh nhà trọ"
            }else{
                addImageButton.text = "Thêm ảnh ktx"
            }

            addImageButton.setOnClickListener {
                if(checkCameraPermission()){
                    this@ImageMotelFragment.context?.showListDialog(
                        "Chọn cách lấy ảnh",
                        null,
                        arrayListOf("Chụp ảnh","Lấy từ thư viện")
                    ){
                        if (it == 0){
                            dispatchTakePictureIntent(REQUEST_TAKE_PHOTO_PLACE)
                        }
                        if (it == 1){
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                                if (ContextCompat.checkSelfPermission(
                                        this@ImageMotelFragment.requireContext(),
                                        Manifest.permission.READ_EXTERNAL_STORAGE
                                    ) ==
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
        }

        subscribeUI()
        return binding.root
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        return if (id == com.emglab.qlsv.R.id.home) {
            handleBack()
            true
        } else super.onOptionsItemSelected(item)
    }
    private fun handleBack(){
        if (imageAdapter.images.isEmpty()){
            requireActivity().onBackPressed()
        }else{
            Navigation.findNavController(requireView())
                .navigate(ImageMotelFragmentDirections.actionImageMotelFragmentToListAddressFragment())
        }
    }

    private fun setupRecyclerView(){
        imageAdapter = ImageMotelAdapter(arrayListOf(), this)
        binding.recyclerView.apply {
            adapter = imageAdapter
            layoutManager = LinearLayoutManager(context)
        }
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

    @SuppressLint("NotifyDataSetChanged")
    private fun subscribeUI(){
        with(viewModel){
            deleteImageMotel.observe(viewLifecycleOwner){
                if (checkResource(it)){
                    viewModel.deleteImage(imageMotel)
                    imageMotel.status = 2
                    viewModel.insertImage(imageMotel)
                }
            }
            getAllImage(motelID).observe(viewLifecycleOwner){
                if (it.isNotEmpty()){
                    imageLst = ArrayList(it.filter { imageFilter ->
                        imageFilter.status == 0 || imageFilter.status == null || imageFilter.status == 1 })
                    imageSaveType = ArrayList(it.filter { imageFilter ->
                        imageFilter.status == 2
                    })
                    binding.addImageButton.isEnabled = imageLst.size < 5
                    imageAdapter.images = imageLst
                    imageAdapter.notifyDataSetChanged()
                }
            }
        }
    }

    override fun onActivityResult(requestCode:Int, resultCode:Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        if (resultCode == AppCompatActivity.RESULT_OK){
            when (requestCode) {
                REQUEST_TAKE_PHOTO_PLACE -> {
                    photoPathCompress = context?.let { takePhotoHelper.compressImageBeforeSend(it,mCurrentPhotoPath,fileName) }
                    insertImageMotel()
                }
                IMAGE_PICK_CODE ->{
                    try {
                        mCurrentPhotoPath = getRealPathFromURI(intent!!.data!!)
                        photoPathCompress = context?.let { takePhotoHelper.compressImageBeforeSend(it,mCurrentPhotoPath,fileName) }
                        insertImageMotel()
                    }catch (e: Exception){
                        isImageUploading = false
                        hideLoadingDialog()
                        showToast("Không lấy được ảnh")
                    }
                }
            }
        }
    }

    private fun insertImageMotel(){
        for (i in 1 ..5){
            if (imageSaveType.isNotEmpty()){
                val imageDelete = imageSaveType[0]
                imageMotel= ImageMotel(
                    idMotel = motelID,
                    type =  imageDelete.type ,
                    status = 1,
                    image = mCurrentPhotoPath,
                    file = photoPathCompress ,
                    time = getTime())
                viewModel.deleteImage(imageDelete)
                imageSaveType.remove(imageDelete)
                break
            }else{
                if (imageAdapter.images.size < i ){
                    imageMotel= ImageMotel(
                        idMotel = motelID,
                        type =  i ,
                        image = mCurrentPhotoPath,
                        status = 1,
                        file = photoPathCompress ,
                        time = getTime()
                    )
                    break
                }
                if (imageAdapter.images.size == i){
                    imageMotel= ImageMotel(
                        idMotel = motelID,
                        type =  i +1,
                        image = mCurrentPhotoPath,
                        status = 1,
                        file = photoPathCompress ,
                        time = getTime()
                    )
                    break
                }
                if (imageAdapter.images.size > i){
                    if (imageAdapter.images[i].type == null){
                        imageMotel= ImageMotel(
                            idMotel = motelID,
                            type =  i ,
                            image = mCurrentPhotoPath,
                            status = 1,
                            file = photoPathCompress ,
                            time = getTime()
                        )
                        break
                    }else continue
                }
            }
        }
        imageLst.add(imageMotel)
        Log.d("_INSERTIMAGE", "add type ${imageMotel.type}")
        viewModel.insertImage(imageMotel)
        imageUploading = imageMotel
        uploadFile(imageMotel)
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

    private fun uploadFile(image: ImageMotel) {
        showLoadingDialog()
        isImageUploading = true
        if (!image.file.isNullOrEmpty()){
            val file =  File(image.file!!)
            val  fileReqBody = RequestBody.create(MediaType.parse("image/*"), file)
            val  multipartBody = MultipartBody.Part.createFormData("file",image.file,fileReqBody)
            viewModel.insertImage(image)
            webService.uploadImageMotel(
                userCode =  sharedPrefsHelper.getUserName(),
                motelID = motelID,
                typeImg = image.type!!,
                tokenCode = sharedPrefsHelper.getToken(),
                image = multipartBody
            ).enqueue(object :  retrofit2.Callback<CTSVAssignUserActivityRes> {
                @SuppressLint("NotifyDataSetChanged")
                override fun onResponse(call: Call<CTSVAssignUserActivityRes>, response: Response<CTSVAssignUserActivityRes>) {
                    val uploadImageResp = response.body()
                    isImageUploading = false
                    hideLoadingDialog()
                    if (uploadImageResp != null){
                        if (uploadImageResp.respCode != 0){
                            image.status = 0
                            imageAdapter.notifyDataSetChanged()
                            viewModel.insertImage(image)
                        }
                    }else{
                        image.status = 0
                        imageAdapter.notifyDataSetChanged()
                        viewModel.insertImage(image)
                    }
                }

                @SuppressLint("NotifyDataSetChanged")
                override fun onFailure(call: Call<CTSVAssignUserActivityRes>, t: Throwable) {
                    showToast("Lỗi kết nối")
                    isImageUploading = false
                    image.status = 0
                    imageAdapter.notifyDataSetChanged()
                    viewModel.insertImage(image)
                    hideLoadingDialog()
                }
            })
        }
    }

    private fun hideLoadingDialog(){
        if (!(isImageUploading)){
            loadingDialog.dismiss()
        }
    }

    private fun showLoadingDialog(){
        if (!loadingDialog.isShowing){
            loadingDialog.show()
        }
    }

    private fun setupViewModel(){
        viewModel = ViewModelProvider(this, factory).get(ImageMotelViewModel::class.java)
    }

    override fun onClick(image: ImageMotel) {
        showDialogClickImage( handleSeeButton = {seePictureZoom(image)},
        handleDeleteButton = {
            imageMotel = image
            viewModel.deleteImage(sharedPrefsHelper.getUserName(),
                sharedPrefsHelper.getToken(),
                motelID,
                image.type!!)
        })
    }

    private fun getTime():String{
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        return sdf.format(Date())
    }
    override fun retryUploadImage(image: ImageMotel) {
      uploadFile(image)
    }
    private fun seePictureZoom(image: ImageMotel){
        binding.imageLayoutZoom.visibility = View.VISIBLE
        binding.imageViewZoom.setImageBitmap(
            takePhotoHelper.setPic(binding.imageViewZoom, image.image!!)
        )
        binding.closeButton.setOnClickListener {
            binding.imageLayoutZoom.visibility = View.GONE
        }
    }


}