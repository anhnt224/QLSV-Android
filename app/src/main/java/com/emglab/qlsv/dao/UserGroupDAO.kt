package com.emglab.qlsv.dao

import androidx.room.*
import com.emglab.qlsv.models.entity.UserGroup


@Dao
interface UserGroupDAO {



    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(userGroup: UserGroup): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(userGroups: List<UserGroup>)

    @Delete
    fun delete(userGroup: UserGroup)

    @Update
    fun update(userGroup: UserGroup)
}