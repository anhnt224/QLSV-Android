package com.emglab.qlsv.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.emglab.qlsv.models.entity.CountSteps


@Dao
interface CountStepsDAO {

    @Query("SELECT * FROM countSteps ")
    fun getAllCountSteps(): LiveData<List<CountSteps>>

    @Query("SELECT * FROM countSteps WHERE id = :mId")
    fun getCountSteps(mId : String): LiveData<CountSteps>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(countSteps: CountSteps): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(activitys: List<CountSteps>)

    @Delete
    fun delete(countSteps: CountSteps)

    @Query("DELETE FROM countSteps")
    fun deleteAll()
}