package com.emglab.qlsv.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.emglab.qlsv.models.entity.UserCriteriaPoint


@Dao
interface UserCriteriaPointDAO {

    @Query("SELECT * FROM UserCriteriaPoint  where CId =:CId ")
    fun getUserCriteriaPointByCIdFromRoom(CId: Int): LiveData<List<UserCriteriaPoint>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(userCriteriaPoint: UserCriteriaPoint): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(userCriteriaPoints: List<UserCriteriaPoint>)

    @Delete
    fun delete(userCriteriaPoint: UserCriteriaPoint)

    @Update
    fun update(userCriteriaPoint: UserCriteriaPoint)
}