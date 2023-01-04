package com.emglab.qlsv.models.entity

import androidx.room.Embedded
import androidx.room.Relation

data class ActivityWithCriterias(
    @Embedded val activity: Activity,
    @Relation(parentColumn = "AId", entityColumn = "CId")
    val songs: List<Criteria>
)