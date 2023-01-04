package com.emglab.qlsv.models.res

import com.emglab.qlsv.models.entity.ImageMotel2
import com.google.gson.annotations.SerializedName

class CTSVMotelImageRes(
    @SerializedName("RespText")
    override val respText: String = "",
    @SerializedName("RespCode")
    override val respCode: Int = -1,
    @SerializedName("ImageLst")
    val imageList: List<ImageMotel2> = listOf()
    ): CTSVCap()