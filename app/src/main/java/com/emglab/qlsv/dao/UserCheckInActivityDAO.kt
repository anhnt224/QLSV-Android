package com.emglab.qlsv.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.emglab.qlsv.models.entity.UserCheckInActivity

@Dao
interface UserCheckInActivityDAO {

    @Query("SELECT * FROM UserCheckInActivity where AId = :aId and UserName = :userName ORDER BY CheckInTime ASC")
    fun getByAIdAndUserName(aId: Int,userName: String): LiveData<List<UserCheckInActivity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(userCheckInActivity: UserCheckInActivity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(userCheckInActivies: List<UserCheckInActivity>)

    @Delete
    fun delete(userCheckInActivity: UserCheckInActivity)

    @Update
    fun update(userCheckInActivity: UserCheckInActivity)

    @Query("DELETE FROM UserCheckInActivity")
    fun deleteAll()
}