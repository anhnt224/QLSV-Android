package com.emglab.qlsv.extension

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.DatePicker
import android.widget.EditText
import com.emglab.qlsv.R
import java.util.*

fun Context.showEditextDialog(title: String, message: String?, positive: ((String) -> Unit)?) {
    val builder = androidx.appcompat.app.AlertDialog.Builder(this)
    builder.setTitle(title)
    message?.let {
        builder.setMessage(message)
    }
    val view = LayoutInflater.from(this).inflate(R.layout.dialog_editext,null)
    val edt = view.findViewById<View>(R.id.edt) as EditText
    builder.setView(view)
        .setPositiveButton("OK") { dialogInterface, i ->
            val text = edt.text.toString()
            positive?.invoke(text)
        }
        .setNegativeButton("Hủy"){dialogInterface, i ->

        }
        .create()
        .show()
}

fun Context.showDialog(title: String, message: String?, positive: (() -> Unit)?) {
    val builder = androidx.appcompat.app.AlertDialog.Builder(this)
    builder.setTitle(title)
    message?.let {
        builder.setMessage(message)
    }
    builder.setPositiveButton("OK") { dialogInterface, i ->
            positive?.invoke() }
        .setNegativeButton("Thoát"){dialogInterface, i ->
        }
        .create()
        .show()
}

fun Context.showListDialog(title: String, message: String?,arr: ArrayList<String>, index: ((Int) -> Unit)?) {

    val builder = androidx.appcompat.app.AlertDialog.Builder(this)
    builder.setTitle(title)
    message?.let {
        builder.setMessage(it)
    }
    val items = arr.toArray(arrayOfNulls<CharSequence>(arr.size))
    builder.setItems(items
    ) { dialog, which ->
        index?.invoke(which)
    }
    builder.show()
}

@SuppressLint("SimpleDateFormat")
fun Context.showDatePickerDialog(select: ((Calendar) -> Unit)?) {
    val calendar = Calendar.getInstance()
    val day = calendar.get(Calendar.DATE)
    val month = calendar.get(Calendar.MONTH)
    val year = calendar.get(Calendar.YEAR)
    val datePickerDialog = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {
        override fun onDateSet(datePicker: DatePicker, i: Int, i1: Int, i2: Int) {
            calendar.set(i, i1, i2)
            select?.invoke(calendar)
        }
    }, year, month, day)
    datePickerDialog.show()
}

