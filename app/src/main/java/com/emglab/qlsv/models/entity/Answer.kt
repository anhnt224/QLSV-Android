package com.emglab.qlsv.models.entity

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

class Answer (
    @SerializedName("IDQuestion")
    var idQuestion: Int = 0,

    @SerializedName("Select")
    var content: String = "",

    @SerializedName("RowID")
    var id: Int = 0
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(idQuestion)
        parcel.writeString(content)
        parcel.writeInt(id)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Answer> {
        override fun createFromParcel(parcel: Parcel): Answer {
            return Answer(parcel)
        }

        override fun newArray(size: Int): Array<Answer?> {
            return arrayOfNulls(size)
        }
    }
}