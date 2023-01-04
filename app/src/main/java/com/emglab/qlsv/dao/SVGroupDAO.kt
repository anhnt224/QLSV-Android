package com.emglab.qlsv.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.emglab.qlsv.models.entity.SVGroup


@Dao
interface SVGroupDAO {


    @Query("SELECT * FROM SVGroup ORDER BY GName ASC")
    fun getAll(): LiveData<List<SVGroup>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(svGroup: SVGroup): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(svGroups: List<SVGroup>)

    @Delete
    fun delete(svGroup: SVGroup)

    @Update
    fun update(svGroup: SVGroup)
}