package com.emglab.qlsv.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.emglab.qlsv.models.entity.User


@Dao
interface UserDAO {

    @Query("SELECT * FROM User where studentId = :UserCode")
    fun getUserById(UserCode : String): LiveData<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: User): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(users: List<User>)

    @Delete
    fun delete(user: User)

    @Update
    fun update(user: User)

    @Query("DELETE FROM usergroup")
    fun deleteAll1()

    @Query("DELETE FROM usercriteriaactivity ")
    fun deleteAll2()

    @Query("DELETE FROM usercriteriapoint ")
    fun deleteAll3()

    @Query("DELETE FROM userrole ")
    fun deleteAll5()

    @Query("DELETE FROM criteria ")
    fun deleteAll6()

    @Query("DELETE FROM activity ")
    fun deleteAll7()

    @Query("DELETE FROM svgroup ")
    fun deleteAll8()

    @Query("DELETE FROM user ")
    fun deleteAll9()

    @Query("DELETE FROM Timetable")
    fun deleteAll10()


}