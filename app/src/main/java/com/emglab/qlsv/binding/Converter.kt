package com.hn.upharma2.binding

import com.emglab.qlsv.extension.toTimeQueryStr

import java.util.*

object Converter {

//    val coin_format : DecimalFormat =  DecimalFormat(COIN_FORMAT_PATTERN)
//
//    @JvmStatic
//    fun moneyFormatted(price: Double): String {
//        return "${coin_format.format(price)} đ"
//    }

    @JvmStatic
    fun dateFormatted(date: Date?): String {
        return "${date?.toTimeQueryStr()}"
    }
}