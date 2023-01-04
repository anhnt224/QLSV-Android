package com.emglab.qlsv.models.entity

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

class Question (
    @SerializedName("IDQuestion")
    var id: Int = 0,

    @SerializedName("Question")
    var question: String = "",

    @SerializedName("Answer")
    var answer: String = ""
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(question)
        parcel.writeString(answer)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Question> {
        override fun createFromParcel(parcel: Parcel): Question {
            return Question(parcel)
        }

        override fun newArray(size: Int): Array<Question?> {
            return arrayOfNulls(size)
        }
    }
}