package com.emglab.qlsv.models.entity

import com.google.gson.annotations.SerializedName

class FormRegisted (
    @SerializedName("")
    var id: Int = 0,
    @SerializedName("")
    var typePaper: String = "",
    @SerializedName("")
    var description: String = "",
    @SerializedName("")
    var content: String = "",
    @SerializedName("")
    var office: String = "",
    @SerializedName("")
    var typeService: String = "",
    @SerializedName("")
    var note: String = "",
    @SerializedName("")
    var timeCreate: String = "",
    @SerializedName("")
    var status: Int = 0,
    @SerializedName("")
    var timeAccept: String = "",
    @SerializedName("")
    var userAccept: String = ""
)