package com.emglab.qlsv.models.entity

import android.os.Build
import android.text.Html
import com.emglab.qlsv.extension.converDateToStringDDMMYYYY
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class ScholarShip (
    @SerializedName("DocumentId")
    var id: Int = 0,
    @SerializedName("Title")
    var title: String = "",
    @SerializedName("Deadline")
    var deadline: Date?,
    @SerializedName("TotalPrice")
    var price: String = "",
    @SerializedName("Description")
    var description: String = "",
    @SerializedName("Content")
    var content: String = "",
    @SerializedName("Quantity")
    var quantity: Int = 0,
    @SerializedName("ContactName")
    var contactName: String = "",
    @SerializedName("ContactPhone")
    var contactPhone: String = "",
    @SerializedName("ContactEmail")
    var contactEmail: String = "",
    @SerializedName("Status")
    var status: Int = 0,
    @SerializedName("MoreInfo")
    var moreInfo: String = "",
    @SerializedName("TypeInfo")
    var typeInfo: String = "",
    @SerializedName("Type")
    var type: Int = 0,
    @SerializedName("TimeApply")
    var timeApply: String = "",
    @SerializedName("Comment")
    var comment: String = "",
    @SerializedName("StatusApply")
    var statusApply: Int = 0,
    @SerializedName("TimeAppvored")
    var timeApproved: String = "",
    @SerializedName("ApproverId")
    var approveID: String = "",
    @SerializedName("ApproverEmail")
    var approveName: String = "",
    @SerializedName("Expired")
    var expired: Int = 0
): Serializable {
    fun getDeadLine(): String {
        if(deadline == null){
            return ""
        }
        return deadline!!.converDateToStringDDMMYYYY()
    }

    fun isExpired(): Boolean{
        return expired == 1
    }

    fun getQuantityStr(): String{
        return "$quantity"
    }

    fun getStatusStr(): String {
        return when(statusApply){
            1 -> "Mới đăng kí"
            2 -> "Đang xét duyệt"
            3 -> "Đạt"
            4 -> "Không đạt"
            else -> ""
        }
    }

    fun getStatusColor(): String {
        return when(statusApply){
            1 -> "#FFB300"
            2 -> "#FFB300"
            3 -> "#43A047"
            4 -> "#F4511E"
            else -> "#FFB300"
        }
    }

    fun getScholarShipContent(): String{
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY).toString()
        } else {
            Html.fromHtml(content).toString()
        }
    }
}