package com.emglab.qlsv.models.entity.gift

import com.emglab.qlsv.R

enum class GiftRegisteredStatus (val title: String,val value: Int, val bgColor: Int, val titleColor: Int) {
    UNREGISTERED("Chưa đăng ký", 0, R.color.mainBackground, R.color.textColorPrimaryLight),
    APPROVED("Đã duyệt", 3, R.color.done_bg, R.color.done),
    NEW("Đề nghị", 1, R.color.pending_bg, R.color.pending),
    CANCELED("Không duyệt", 2, R.color.cancel_bg, R.color.cancel),
    CANCEL_REQUEST("Huỷ yêu cầu", 4, R.color.cancel_bg, R.color.cancel),
    OTHER("Khác", 5, R.color.mainBackground, R.color.textColorPrimaryLight)
}