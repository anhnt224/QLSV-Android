package com.emglab.qlsv.models.res

import com.emglab.qlsv.models.entity.UserAddress
import com.google.gson.annotations.SerializedName

class GetListUserAddressResp (
    @SerializedName("RespCode")
    override var respCode: Int = -1,
    @SerializedName("RespText")
    override var respText: String = "",
    @SerializedName("StudentContactLst")
    var userAddresses: List<UserAddress>
): CTSVCap()