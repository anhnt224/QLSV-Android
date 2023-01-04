package com.emglab.qlsv.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.emglab.qlsv.models.entity.run.RunData


@Dao
interface RunDataDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(runData: RunData)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(runDataList: List<RunData>)

    @Delete
    fun delete(runData: RunData)

    @Query("DELETE FROM RunData")
    fun deleteAll()

    @Query("SELECT * FROM RunData")
    fun getRunResults(): LiveData<List<RunData>>
}