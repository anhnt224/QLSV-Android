package com.emglab.qlsv.dao

import androidx.room.*
import com.emglab.qlsv.models.entity.UserCriteriaActivity


@Dao
interface UserCriteriaActivityDAO {



    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(userCriteriaActivity: UserCriteriaActivity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(userCriteriaActivitys: List<UserCriteriaActivity>)

    @Delete
    fun delete(userCriteriaActivity: UserCriteriaActivity)

    @Update
    fun update(userCriteriaActivity: UserCriteriaActivity)
}