package com.emglab.qlsv.models.entity

import android.os.Build
import android.text.Html
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Form(
    @SerializedName("RowID")
    var rowId: Int = 0,
    @SerializedName("PaperID")
    var id: Int = 0,
    @SerializedName("TypePaper")
    var typePaper: String = "",
    @SerializedName("FilePath")
    var filePath: String = "",
    @SerializedName("Description")
    var description: String = "",
    @SerializedName("DescriptionPaper")
    var content: String = "",
    @SerializedName("Office")
    var office: String = "",
    @SerializedName("TypeService")
    var typeService: String = "",
    @SerializedName("Note")
    var note: String = "",
    @SerializedName("Status")
    var status: Int = 0,
    @SerializedName("TimeAccept")
    var timeAccept: String = "",
    @SerializedName("TimeCreate")
    var timeCreate: String = "",
    @SerializedName("QuestionLst")
    var questions: List<Question> = listOf(),
    @SerializedName("Rate")
    var rating: Int = 0,
    @SerializedName("Comment")
    var comment: String = "",
    @SerializedName("IsPaper")
    var isPaper: Int = 0,
    @SerializedName("Ship")
    var deliveryType: Int = 0,
    @SerializedName("SVContactID")
    var studentContactID: Int = 0
): Serializable{
    fun getType(): FormType {
        return when(typeService){
            "Hành chính" -> FormType.FORM
            "Tư vấn" -> FormType.SERVICE
            "Tiện ích" -> FormType.UTILITY
            else -> FormType.FORM
        }
    }

    fun getContentStr(): String {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY).toString()
        } else {
            Html.fromHtml(content).toString()
        }
    }

    fun getStatusStr(): String{
        return when(status){
            0 -> "Mới tạo"
            1 -> "Đang xử lí"
            2 -> "Hoàn thành"
            3 -> "Hoàn thành"
            100 -> "Yêu cầu chỉnh sửa"
            else -> ""
        }
    }

    fun getStatusColor(): String {
        return when(status){
            0 -> "#FFB300"
            1 -> "#FFB300"
            2 -> "#43A047"
            3 -> "#43A047"
            100 -> "#FFB300"
            else -> "#FFB300"
        }
    }

    fun hasNote(): Boolean{
        return note != ""
    }

    fun isDone(): Boolean{
        return status == 2 || status == 3
    }

    fun isRating(): Boolean{
        return rating == 0 && isDone()
    }

    fun isRated(): Boolean{
        return (rating != 0) && isDone()
    }

    fun isPaper(): Boolean {
        return isPaper == 1
    }
}