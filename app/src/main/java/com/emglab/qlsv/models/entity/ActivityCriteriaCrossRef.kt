package com.emglab.qlsv.models.entity

import androidx.room.Entity

@Entity(primaryKeys = ["AId", "CId"])
data class ActivityCriteriaCrossRef(
    val aId: Long,
    val cId: Long
)