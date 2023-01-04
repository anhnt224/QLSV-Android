package com.emglab.qlsv.models.entity.gift

import com.emglab.qlsv.R

enum class GiftStatus(val title: String,val value: Int, val bgColor: Int, val titleColor: Int) {
    PUBLIC("Public", 3, R.color.done_bg, R.color.done),
    NEW("Mới tạo", 1, R.color.mainBackground, R.color.textColorPrimaryLight),
    CANCEL("Huỷ", 0, R.color.cancel_bg, R.color.cancel),
    DONE("Hoàn thành", 4, R.color.done_bg, R.color.done),
    OTHER("Khác", 5, R.color.mainBackground, R.color.textColorPrimaryLight)
}