package com.emglab.qlsv.models.list

import com.emglab.qlsv.models.entity.ScheduleStudent

class ScheduleList(val schedules: List<ScheduleStudent>) {
    fun toMap(): Map<String,List<ScheduleStudent>>{

        return  schedules
            .groupBy { it.dayOfWeek }
            .mapValues { it.value.map { it } }
    }
}