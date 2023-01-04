package com.emglab.qlsv.models.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

import androidx.room.Entity

@Entity(tableName = "ImageMotel",primaryKeys = ["idMotel", "time"])
class ImageMotel (
    var idMotel: Int = -1,
    var type: Int? = null,
    var image: String? = "",
    var status: Int? = null,
    var file : String? = "",
    var time: String = ""
)

class ImageMotel2(
    @SerializedName("UrlImg")
    val urlImage: String,
    @SerializedName("TypeImg")
    val type: Int
): Serializable
