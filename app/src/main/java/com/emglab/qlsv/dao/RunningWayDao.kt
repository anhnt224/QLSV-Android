package com.emglab.qlsv.dao

import androidx.room.*
import com.emglab.qlsv.models.entity.run.RunningWay

@Dao
interface RunningWayDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(runningWay: RunningWay)

    @Update
    fun update(runningWay: RunningWay)

    @Query("SELECT * FROM RunningWay")
    fun getAll(): List<RunningWay>

    @Query("DELETE FROM RunningWay")
    fun deleteAll()
}