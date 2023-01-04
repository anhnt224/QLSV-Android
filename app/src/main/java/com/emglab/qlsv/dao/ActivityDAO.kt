package com.emglab.qlsv.dao

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.*
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.models.entity.UserActivity

@Dao
interface ActivityDAO {
    @Query("SELECT * FROM Activity ORDER BY StartTime ASC")
    fun getAll(): DataSource.Factory<Int, Activity>

    @Query("SELECT * FROM Activity where UAStatus != :uaStatus ORDER BY StartTime ASC")
    fun getAll2(uaStatus : Int = UserActivity.GUEST): LiveData<List<Activity>>

    @Query("SELECT * FROM UserCriteriaActivity uca inner join Activity a on a.AId = uca.AId where uca.CId =:CId ORDER BY AName DESC")
    fun getActiviyByCIdFromRoom(CId: Int): LiveData<List<Activity>>

    @Query("SELECT * FROM Activity where AId = :AId")
    fun getActivityDetail(AId : Int): LiveData<Activity>

    @Query("UPDATE Activity SET UAStatus = :status WHERE AId = :id")
    fun updateStatus(status: Int,id: Int): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(activity: Activity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(activitys: List<Activity>)

    @Delete
    fun delete(activity: Activity)

    @Update
    fun update(activity: Activity)

    @Query("DELETE FROM Activity")
    fun deleteAll()
}