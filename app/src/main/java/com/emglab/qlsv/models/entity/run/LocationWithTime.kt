package com.emglab.qlsv.models.entity.run

import java.io.Serializable

class LocationWithTime(
    var latitude: Double = 0.0,
    var longitude: Double = 0.0,
    var time: Long = 0
): Serializable