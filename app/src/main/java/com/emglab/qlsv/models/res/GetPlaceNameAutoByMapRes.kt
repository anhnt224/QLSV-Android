package com.emglab.qlsv.models.res

import com.emglab.qlsv.models.entity.PlaceNameByMap
import com.google.gson.annotations.SerializedName

class GetPlaceNameAutoByMapRes (
    @SerializedName("data")
    var data: PlaceNameByMap = PlaceNameByMap()
)