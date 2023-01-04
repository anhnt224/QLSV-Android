package com.emglab.qlsv.binding

import androidx.databinding.BindingAdapter
import androidx.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.text.HtmlCompat
import com.emglab.qlsv.extension.converDateToStringDDMMYYYY
import com.emglab.qlsv.extension.toTimeQueryStr
import java.util.*

@BindingAdapter("android:animatedVisibility")
fun setAnimatedVisibility(target: View, isVisible: Boolean) {
    TransitionManager.beginDelayedTransition(target.rootView as ViewGroup)
    target.visibility = if (isVisible) View.VISIBLE else View.GONE
}

@BindingAdapter("goneUnless")
fun goneUnless(view: View, visible: Boolean) {
    view.visibility = if (visible) View.VISIBLE else View.GONE
}

@BindingAdapter("htmlText")
fun bindHtmlText(view: TextView, html: String?) {
    html?.let {
        view.text = HtmlCompat.fromHtml(html, 0)
    }
}

@BindingAdapter("converDateToStringDDMMYYYY")
fun converDateToStringDDMMYYYY(textView: TextView,date: Date?) {
    textView.text = date?.converDateToStringDDMMYYYY()
}

@BindingAdapter("converDateToStringYYYYMMDDHHMMSS")
fun converDateToStringYYYYMMDDHHMMSS(textView: TextView,date: Date?) {
    textView.text = date?.toTimeQueryStr()
}

@BindingAdapter("isGone")
fun bindIsGone(view: View, isGone: Boolean) {
    view.visibility = if (isGone) {
        View.GONE
    } else {
        View.VISIBLE
    }
}

@BindingAdapter("setTextWithAStatus")
fun setTextWithAStatus(view: TextView, AStatus: Int) {
    when (AStatus){
        0-> view.text = "Ẩn"
        1-> view.text = "Duyệt"
        2-> view.text = "Đóng"
        else->{
        }
    }
}

@BindingAdapter("setTextWithGStatus")
fun setTextWithGStatus(view: TextView, AStatus: Int) {
    when (AStatus){
        0-> view.text = "Ẩn"
        1-> view.text = "Duyệt"
        2-> view.text = "Đóng"
        else->{
        }
    }
}