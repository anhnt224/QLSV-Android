package com.emglab.qlsv.models.entity

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Motel(
    @SerializedName("MotelID")
    var id: Int = 0,
    @SerializedName("MotelType")
    var type: String = "",
    @SerializedName("ManagerPhone")
    var managerContact: String = "",
    @SerializedName("ManagerName")
    var managerName: String = "",
    @SerializedName("Description")
    var description: String = "",
    @SerializedName("Address")
    var address: String = "",
    @SerializedName("Rate")
    var rate: Int = 0,
    @SerializedName("Comment")
    var comment: String = "",
    @SerializedName("Latitude")
    var latitude: Double = 0.0,
    @SerializedName("Longitude")
    var longitude: Double = 0.0,
    @SerializedName("Distance")
    var distance: Double = 0.0,
    @SerializedName("Status")
    var status: Int = 0
): Serializable, Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readInt()
    ) {
    }

    fun getMotelTypeWithAddress(): String {
        return "$type - $address"
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, value: Int) {
        parcel.writeInt(value)
    }

    companion object CREATOR : Parcelable.Creator<Motel> {
        override fun createFromParcel(parcel: Parcel): Motel {
            return Motel(parcel)
        }

        override fun newArray(size: Int): Array<Motel?> {
            return arrayOfNulls(size)
        }
    }
}