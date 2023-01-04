package com.emglab.qlsv.models.entity

class CommonResp (
    var RespCode : Int = 100,
    var RespText : String = "",
    var Signature: String = "",
    var isLoading : Boolean = true,
    var UserRole : Int? = 100
)