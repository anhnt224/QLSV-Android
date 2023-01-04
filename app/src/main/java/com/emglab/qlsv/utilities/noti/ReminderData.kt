package com.emglab.qlsv.utilities.noti

import java.util.*

class ReminderData (
    var id: String = "",
    var type: String = "",
    var title: String = "",
    var content: String = "",
    var note: String = "",
    var year: Int = 0,
    var month: Int = 0,
    var day: Int = 0,
    var hour: Int = 0,
    var minute: Int = 0
){
    fun getDate(): Date{
        val calendar = Calendar.getInstance(Locale("vi", "VN"))
        calendar.set(year, month, day, hour, minute)
        return calendar.time
    }
}