package com.emglab.qlsv.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.emglab.qlsv.models.entity.UserRole

@Dao
interface UserRoleDAO {

    @Query("SELECT * FROM UserRole ORDER BY URLevel ASC")
    fun getAll(): LiveData<List<UserRole>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(userRole: UserRole): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(userRoles: List<UserRole>)

    @Delete
    fun delete(userRole: UserRole)

    @Update
    fun update(userRole: UserRole)

    @Query("DELETE FROM UserRole")
    fun deleteAll()
}