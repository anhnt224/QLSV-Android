package com.emglab.qlsv.modules.searchMotel.model

import com.emglab.qlsv.R

enum class MotelRegistrationStatus(
    val description: String,
    val statusBackground: Int,
    val statusTitleColor: Int,
    val cardBackground: Int
) {
    NEW("Mới tạo", R.color.ink200, R.color.ink400, R.color.ink100),
    PENDING("Chờ xác nhận", R.color.orange200, R.color.orange400, R.color.orange100),
    PROCESSING("Đang xử lí", R.color.orange200, R.color.orange400, R.color.orange100),
    COMPLETION("Đã hoàn thành", R.color.green200, R.color.green400, R.color.green100),
    FAILURE("Không hoàn thành", R.color.red200, R.color.red400, R.color.red100),
    CANCELED("Bị huỷ", R.color.red200, R.color.red400, R.color.red100),
    DELETED("Xoá", R.color.red200, R.color.red400, R.color.red100),
    OTHER("Khác", R.color.ink200, R.color.ink400, R.color.ink100),
}