package com.emglab.qlsv.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.emglab.qlsv.models.entity.Criteria


@Dao
interface CriteriaDAO {

    @Query("SELECT * FROM Criteria where CGroupId = :CGId ORDER BY CCode ASC")
    fun getCriteriaByCGId(CGId : Int): LiveData<List<Criteria>>

    @Query("SELECT * FROM Criteria where AId = :AId")
    fun getCriteriaByAId(AId : Int): LiveData<List<Criteria>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(criteria: Criteria): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(criterias: List<Criteria>)

    @Delete
    fun delete(criteria: Criteria)

    @Update
    fun update(criteria: Criteria)
}