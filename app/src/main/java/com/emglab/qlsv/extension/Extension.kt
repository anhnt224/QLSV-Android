package com.emglab.qlsv.extension

import android.Manifest.permission.*
import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.emglab.qlsv.LoginActivity
import com.emglab.qlsv.R
import com.emglab.qlsv.common.Resource
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.NotificationDialogType
import com.emglab.qlsv.utilities.DATE_FORMAT_PATTERN
import com.emglab.qlsv.utilities.DATE_FORMAT_PATTERN_DDMMYYYY
import com.emglab.qlsv.utilities.DATE_FORMAT_PATTERN_ddMMHHmm
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import java.lang.Exception
import java.text.NumberFormat


import java.text.SimpleDateFormat
import java.util.*


fun Fragment.showToast(str: String) {
    Toast.makeText(activity, str, Toast.LENGTH_SHORT).show()
}

fun Fragment.showDialog(context: Context, title: String, arr : ArrayList<String>, index: Int)   {
    val pictureDialog = AlertDialog.Builder(context)
    pictureDialog.setTitle(title)
    val pictureDialogItems = arr.toArray(arrayOfNulls<CharSequence>(arr.size))
    pictureDialog.setItems(pictureDialogItems
    ) { _, _ ->

    }
    pictureDialog.show()
}

fun Fragment.checkLocationPermission(): Boolean {
    if(ContextCompat.checkSelfPermission(requireContext(), ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
        || ContextCompat.checkSelfPermission(requireContext(), ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
        requestPermissions(arrayOf(ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION), 1000)
        return false
    }
    return true
}

fun Fragment.checkCameraPermission(): Boolean {
    if(ContextCompat.checkSelfPermission(requireContext(), CAMERA) != PackageManager.PERMISSION_GRANTED
        || ContextCompat.checkSelfPermission(requireContext(), READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
        || ContextCompat.checkSelfPermission(requireContext(), WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
        requestPermissions(arrayOf(CAMERA, READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE), 1001)
        return false
    }
    return true
}

fun<T> Fragment.checkResource(resource: Resource<T>): Boolean{
    return when(resource.status){
        Status.SUCCESS_NETWORK -> {
            true
        }
        Status.ERROR_TOKEN -> {
            handleTokenInvalid()
            false
        }
        Status.ERROR -> {
            showToast(resource.respText.toString())
            false
        }
        else -> false
    }
}

fun AppCompatActivity.showToast(str: String) {
    Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
}

fun Fragment.logout() {
    SharedPrefsHelper.logout(context!!, SharedPrefsHelper.LOGOUT_ERROR_TOKEN)
    val intent = Intent(context, LoginActivity::class.java)
    intent.putExtra(LoginActivity.LOGOUT,true)
    startActivity(intent)
    activity!!.finish()
}

fun Fragment.handleTokenInvalid(){
    MaterialAlertDialogBuilder(requireContext())
        .setTitle("Hết hạn phiên đăng nhập")
        .setMessage("Bạn có muốn đăng nhập lại?")
        .setPositiveButton("Đăng nhập lại"){_, _ ->
            logout()
        }.setNegativeButton("Hủy"){_, _ ->

        }.show()
}

fun Fragment.logoutClick(sharedPrefsHelper : SharedPrefsHelper) {
    sharedPrefsHelper.clearAndPutLogout(SharedPrefsHelper.LOGOUT_CLICK)
    val intent = Intent(context, LoginActivity::class.java)
    intent.putExtra(LoginActivity.LOGOUT,true)
    startActivity(intent)
    activity!!.finish()
}

fun Fragment.hideKeyboard() {
    view?.let { activity?.hideKeyboard(it) }
}

fun Context.hideKeyboard(view: View) {
    val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}

@SuppressLint("SimpleDateFormat")
fun Date.toTimeQueryStr() : String{
    val dateFormat = SimpleDateFormat(DATE_FORMAT_PATTERN)
    return dateFormat.format(time)
}

@SuppressLint("SimpleDateFormat")
fun Date.getTimeQuery() : String{
    val dateFormat = SimpleDateFormat(DATE_FORMAT_PATTERN)
    return dateFormat.format(time)
}

@SuppressLint("SimpleDateFormat")
fun Date.convertDateToStringDateTime() : String{
    val dateFormat = SimpleDateFormat("HH:mm dd/MM/yyyy")
    return dateFormat.format(time)
}

@SuppressLint("SimpleDateFormat")
fun Date.toStringTime() : String{
    val dateFormat = SimpleDateFormat("HH:mm:ss")
    return dateFormat.format(time)
}

@SuppressLint("SimpleDateFormat")
fun Date.toDateQuery() : String{
    val dateFormat = SimpleDateFormat("yyyy-MM-dd")
    return dateFormat.format(time)
}

@SuppressLint("SimpleDateFormat")
fun Date.toDateStr() : String{
    val dateFormat = SimpleDateFormat("dd")
    val dateFormat2 = SimpleDateFormat("MM")
    val dateFormat3 = SimpleDateFormat("yyyy")
    return dateFormat.format(time) + " thg " + dateFormat2.format(time) + ", " + dateFormat3.format(time)
}

@SuppressLint("SimpleDateFormat")
fun Date.toTimeStr() : String{
    val dateFormat = SimpleDateFormat("hh:mm aa")
    return dateFormat.format(time)
}

@SuppressLint("SimpleDateFormat")
fun Date.getMonthDayStr(): String{
    val dateFormat = SimpleDateFormat("dd/MM")
    return dateFormat.format(time)
}

@SuppressLint("SimpleDateFormat")
fun Date.getDayOfMonth(): Int{
    val dateFormat = SimpleDateFormat("dd")
    return dateFormat.format(time).toInt()
}

@SuppressLint("SimpleDateFormat")
fun Date.getDateStr(): String{
    val dateFormat = SimpleDateFormat("dd/MM/yyyy")
    return dateFormat.format(time)
}

@SuppressLint("SimpleDateFormat")
fun Date.converDateToStringDDMMYYYY() : String{
    val dateFormat = SimpleDateFormat(DATE_FORMAT_PATTERN_DDMMYYYY)
    return dateFormat.format(time)
}

@SuppressLint("SimpleDateFormat")
fun Date.converDateToStringddMMHHmm() : String{
    val dateFormat = SimpleDateFormat(DATE_FORMAT_PATTERN_ddMMHHmm)
    return dateFormat.format(time)
}

fun Date.getYearStr(): String {
    val dateFormat = SimpleDateFormat("yyyy")
    return dateFormat.format(time)
}

@SuppressLint("SimpleDateFormat")
fun String.convertStringToDateDDMMYYYY() : Date {
    val sdf = SimpleDateFormat(DATE_FORMAT_PATTERN_DDMMYYYY)
    sdf.timeZone = TimeZone.getTimeZone("UTC")
    return sdf.parse(this)
}


@SuppressLint("SimpleDateFormat")
fun String.convertStringToDate() : Date {
    val sdf = SimpleDateFormat(DATE_FORMAT_PATTERN)
    sdf.timeZone = TimeZone.getTimeZone("UTC")
    return sdf.parse(this)
}


@SuppressLint("SimpleDateFormat")
fun String.toDate() : Date? {
    if (this.isEmpty()){
        return null
    }
    val sdf = SimpleDateFormat(DATE_FORMAT_PATTERN)
    sdf.timeZone = TimeZone.getTimeZone("UTC")
    return sdf.parse(this)
}

@SuppressLint("SimpleDateFormat")
fun String.toTimeQuery() : Date {
    val sdf = SimpleDateFormat(DATE_FORMAT_PATTERN)
    sdf.timeZone = TimeZone.getTimeZone("vi_VN")
    return sdf.parse(this)
}

fun String.firstChar(): String {
    if (this.length > 0){
        return this[0].toString().toUpperCase()
    }
    return ""
}

fun Int.convertTimeSSToHHMMSS() : String{
    val h = this / 3600
    val m = (this - h*3600) / 60
    val s = (this - h*3600 - m*60 )
    if (h == 0) {
        return String.format("%d:%d",m,s)
    }
    return String.format("%d:%d:%d",h,m,s)
}

fun TextView.bind(text: String?) {
    if ( text.isNullOrEmpty() ) {
        this.visibility = View.GONE
    } else {
        this.text = text
        this.visibility = View.VISIBLE
    }
}

fun ImageView.loadFromURL(url: String){
    val circularProgressDrawable = androidx.swiperefreshlayout.widget.CircularProgressDrawable(this.context)
    circularProgressDrawable.strokeWidth = 5f
    circularProgressDrawable.centerRadius = 30f

    circularProgressDrawable.start()
    Glide.with(this)
        .load(url)
        .placeholder(circularProgressDrawable)
        .apply(RequestOptions.skipMemoryCacheOf(true))
        .apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE))
        .error(android.R.drawable.stat_notify_error)
        .into(this)
}


fun Fragment.showDialogMotel(
    title: String = "",
    message: String = "",
    icon: Int = R.drawable.ic_share_motel,
    positiveButtonTitle: String = "Xác nhận",
    handlePositiveButtonTap: (() -> Unit)? = null,
    negativeButtonTitle: String = "Huỷ",
    handleNegativeButtonTap: (() -> Unit)? = null
){
    val dialog = Dialog(requireContext())
    dialog.setContentView(R.layout.dialog_motel)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.window?.setLayout(
        ViewGroup.LayoutParams.WRAP_CONTENT,
        ViewGroup.LayoutParams.WRAP_CONTENT
    )
    dialog.setCancelable(false)

    val titleTextView = dialog.findViewById<TextView>(R.id.tittleTxt)
    titleTextView.text = title

    val messageTextView = dialog.findViewById<TextView>(R.id.messengerTxt)
    messageTextView.text = message

    val positiveButton: Button = dialog.findViewById(R.id.agreeButton)
    positiveButton.text = positiveButtonTitle
    positiveButton.setOnClickListener {
        handlePositiveButtonTap?.invoke()
        dialog.dismiss()
    }

    val negativeButton: Button = dialog.findViewById(R.id.skipButton)
    negativeButton.text = negativeButtonTitle
    negativeButton.setOnClickListener {
        handleNegativeButtonTap?.invoke()
        dialog.dismiss()
    }

    val imageView = dialog.findViewById<ImageView>(R.id.imageDialog)
    imageView.setImageResource(icon)

    dialog.show()
}

fun Fragment.showActionDialog(
    title: String = "",
    message: String = "",
    icon: Int = R.drawable.ic_more,
    positiveButtonTitle: String = "Xác nhận",
    handlePositiveButtonTap: (() -> Unit)? = null,
    negativeButtonTitle: String = "Huỷ",
    handleNegativeButtonTap: (() -> Unit)? = null
){
    val dialog = Dialog(requireContext())
    dialog.setContentView(R.layout.alert_dialog)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.window?.setLayout(
        ViewGroup.LayoutParams.WRAP_CONTENT,
        ViewGroup.LayoutParams.WRAP_CONTENT
    )
    dialog.setCancelable(false)

    val titleTextView = dialog.findViewById<TextView>(R.id.titleTextView)
    titleTextView.text = title

    val messageTextView = dialog.findViewById<TextView>(R.id.messageTextView)
    messageTextView.text = message

    val positiveButton: Button = dialog.findViewById(R.id.positiveButton)
    positiveButton.text = positiveButtonTitle
    positiveButton.setOnClickListener {
        handlePositiveButtonTap?.invoke()
        dialog.dismiss()
    }

    val negativeButton: Button = dialog.findViewById(R.id.negativeButton)
    negativeButton.text = negativeButtonTitle
    negativeButton.setOnClickListener {
        handleNegativeButtonTap?.invoke()
        dialog.dismiss()
    }

    val imageView = dialog.findViewById<ImageView>(R.id.imageView)
    imageView.setImageResource(icon)

    dialog.show()
}


fun Fragment.showDialogClickImage(handleSeeButton: (() -> Unit)? = null,
                                  handleDeleteButton: (() -> Unit)? = null){
    val dialog = Dialog(requireContext())
    dialog.setContentView(R.layout.dialog_image_motel)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.window?.setLayout(
        ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.WRAP_CONTENT
    )

    //  dialog.setCancelable(false)

    val seeButton: Button = dialog.findViewById(R.id.seePhoto)
    seeButton.setOnClickListener {
        handleSeeButton?.invoke()
        dialog.dismiss()
    }

    val deleteButton: Button = dialog.findViewById(R.id.deletePhoto)
    deleteButton.setOnClickListener {
        handleDeleteButton?.invoke()
        dialog.dismiss()
    }

    val close: TextView = dialog.findViewById(R.id.closeButton)
    close.setOnClickListener {
        dialog.dismiss()
    }

    dialog.show()

}

fun Fragment.initLoadingDialog(): Dialog{
    val dialog = Dialog(requireContext())
    dialog.setContentView(R.layout.dialog_loading_image)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.window?.setLayout(
        ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.WRAP_CONTENT
    )
    dialog.setCancelable(false)

    return dialog
}

fun Fragment.showNotificationDialog(
    message: String,
    type: NotificationDialogType = NotificationDialogType.ERROR,
    cancelable: Boolean = true,
    doneButtonText: String = "OK",
    handleDone: (() -> Unit)? = null
){
    val dialog = Dialog(requireContext())
    dialog.setContentView(R.layout.dialog_notification)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.window?.setLayout(
        ViewGroup.LayoutParams.WRAP_CONTENT,
        ViewGroup.LayoutParams.WRAP_CONTENT
    )
    dialog.setCancelable(cancelable)

    val messageTextView = dialog.findViewById<TextView>(R.id.messageTextView)
    messageTextView.text = message

    val doneButton = dialog.findViewById<Button>(R.id.doneButton)
    doneButton.text = doneButtonText
    doneButton.setOnClickListener {
        handleDone?.invoke()
        dialog.dismiss()
    }

    val imageView = dialog.findViewById<ImageView>(R.id.imageView)
    when(type){
        NotificationDialogType.WARNING -> {
            imageView.setImageResource(R.drawable.ic_warning_round)
        }
        NotificationDialogType.ERROR -> {
            imageView.setImageResource(R.drawable.ic_error_round)
        }
        NotificationDialogType.COMPLETE -> {
            imageView.setImageResource(R.drawable.ic_complete_round)
        }
    }

    dialog.show()
}

fun Fragment.openLink(link: String){
    try {
        Log.d("_LINK", "open link $link")
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
        startActivity(intent)
    }catch (e: Exception){
    }
}

fun Double.toCurrency(): String {
    val format = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
    return format.format(this)
}

fun Int.toCurrency(): String {
    val format = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
    return format.format(this)
}
