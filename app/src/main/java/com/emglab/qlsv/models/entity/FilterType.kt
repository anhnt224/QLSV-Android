package com.emglab.qlsv.models.entity

enum class FilterType(val itemName: String, val type: Int){
    ALL("Tất cả", 0),
    SCORED("Đã chấm", 1),
    NOT_SCORED_YET("Chưa chấm", 2),
    DIFFERENCE_SCORED("Lệch điểm", 3)
}