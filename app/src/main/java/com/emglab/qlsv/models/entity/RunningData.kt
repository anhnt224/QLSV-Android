package com.emglab.qlsv.models.entity

import java.io.Serializable

class RunningData(
    var time: Int = 0,
    var lat: Double = 0.0,
    var lng: Double = 0.0,
    var distance: Float = 0.0f,
    var timeStart: String = ""
): Serializable {
    fun isEmpty(): Boolean{
        return time == 0 && lat == 0.0 && lng == 0.0 && distance == 0.0f && timeStart == ""
    }
}