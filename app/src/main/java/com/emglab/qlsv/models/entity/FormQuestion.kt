package com.emglab.qlsv.models.entity

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

class FormQuestion (
    @SerializedName("IDQuestion")
    var idQuestion: Int = 0,

    @SerializedName("TypeQuestion")
    var typeQuestion: Int = 0,

    @SerializedName("Answer")
    var answer: String = "",

    @SerializedName("Question")
    var question: String = "",

    @SerializedName("ContentSelectLst")
    var answers: List<Answer> = listOf(),

    @SerializedName("IDPaper")
    var formID: Int = 0,

    @SerializedName("FilePath")
    var filePath: String = "",

    @SerializedName("TypePaper")
    var typePaper: String = ""
): Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.createTypedArrayList(Answer)!!.toList(),
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString()
    )

    fun getType(): QuestionType {
      return when (typeQuestion) {
          1 -> QuestionType.PARAGRAPH
          2 -> QuestionType.SINGLE_CHOICE
          3 -> QuestionType.CHECK_BOX
          else -> QuestionType.PARAGRAPH
      }
  }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(idQuestion)
        parcel.writeInt(typeQuestion)
        parcel.writeString(answer)
        parcel.writeString(question)
        parcel.writeTypedList(answers)
        parcel.writeInt(formID)
        parcel.writeString(filePath)
        parcel.writeString(typePaper)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FormQuestion> {
        override fun createFromParcel(parcel: Parcel): FormQuestion {
            return FormQuestion(parcel)
        }

        override fun newArray(size: Int): Array<FormQuestion?> {
            return arrayOfNulls(size)
        }
    }
}

enum class QuestionType{
    PARAGRAPH, SINGLE_CHOICE, CHECK_BOX
}