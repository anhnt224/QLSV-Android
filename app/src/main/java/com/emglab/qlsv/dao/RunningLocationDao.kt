package com.emglab.qlsv.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.emglab.qlsv.models.entity.run.RunningLocation

@Dao
interface RunningLocationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(runningLocation: RunningLocation)

    @Query("SELECT * FROM RunningLocation WHERE wayID == :wayID")
    fun getRunningLocations(wayID: String): List<RunningLocation>

    @Query("DELETE FROM RunningLocation")
    fun deleteAll()
}