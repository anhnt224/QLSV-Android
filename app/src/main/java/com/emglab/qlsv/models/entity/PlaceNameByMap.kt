package com.emglab.qlsv.models.entity

import com.google.gson.annotations.SerializedName

class PlaceNameByMap (
    @SerializedName("cityName")
    var cityName: String ? = null,
    @SerializedName("districtName")
    var districtName: String? = null,
    @SerializedName("wardName")
    var wardName: String? = null
)