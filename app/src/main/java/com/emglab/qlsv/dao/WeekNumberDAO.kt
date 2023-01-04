package com.emglab.qlsv.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.emglab.qlsv.models.entity.WeekNumber
import com.emglab.qlsv.utilities.AUTO

@Dao
interface WeekNumberDAO {


    @Query("SELECT * FROM WeekNumber where id = :id")
    fun getWeek(id: String = AUTO): LiveData<WeekNumber>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(weekNumber: WeekNumber): Long

    @Delete
    fun delete(weekNumber: WeekNumber)

}