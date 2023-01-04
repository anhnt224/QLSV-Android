package com.emglab.qlsv.models.req

class RunningDataRequest (
    var timeStart: String = "",
    var time: Int = 0,
    var distance: Float = 0.0f,
    var latList: String = "",
    var lngList: String = "",
    var userName: String = "",
    var fullName: String = "",
    var title: String = ""
){
    fun getDistanceStr(): String{
        return if (distance < 1000){
            String.format("%.0f", distance)
        }else{
            String.format("%.2f", distance/1000)
        }
    }

    fun getDistanceUnit(): String {
        return if(distance < 1000){
            "m"
        }else{
            "km"
        }
    }

    fun getTimeStr(): String {
        val hours = time / 3600
        val minutes = (time % 3600) / 60
        val seconds = time % 60
        return String.format("%02d:%02d:%02d", hours, minutes, seconds)
    }
}