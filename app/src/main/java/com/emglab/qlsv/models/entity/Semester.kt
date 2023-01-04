package com.emglab.qlsv.models.entity

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Semester (
    @SerializedName("Scode")
    var name: String = "",
    @SerializedName("Student")
    var student: Boolean = false,
    @SerializedName("Teacher")
    var teacher: Boolean = false
): Serializable, Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeByte(if (student) 1 else 0)
        parcel.writeByte(if (teacher) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Semester> {
        override fun createFromParcel(parcel: Parcel): Semester {
            return Semester(parcel)
        }

        override fun newArray(size: Int): Array<Semester?> {
            return arrayOfNulls(size)
        }
    }
}