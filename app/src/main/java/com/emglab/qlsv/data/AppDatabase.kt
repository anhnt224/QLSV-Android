package com.emglab.qlsv.data

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import android.content.Context
import com.emglab.qlsv.Converters
import com.emglab.qlsv.dao.*
import com.emglab.qlsv.models.entity.*
import com.emglab.qlsv.models.entity.run.RunData
import com.emglab.qlsv.models.entity.run.RunningLocation
import com.emglab.qlsv.models.entity.run.RunningWay
import com.emglab.qlsv.utilities.InjectorUtils
import com.emglab.qlsv.utilities.VERSION_DB

@Database(entities = [
    Activity::class,
    Criteria::class,
    SVGroup::class,
    User::class,
    UserCriteriaActivity::class,
    UserCriteriaPoint::class,
    UserGroup::class,
    UserRole::class,
    UserCheckInActivity::class,
    ScheduleStudent::class,
    WeekNumber::class,
    CountSteps::class,
    Subject::class,
    RunningLocation::class,
    RunningWay::class,
    ImageMotel::class,
    RunData::class
                     ], version = VERSION_DB, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {


    abstract fun activityDAO(): ActivityDAO
    abstract fun criteriaDAO(): CriteriaDAO
    abstract fun svGroupDAO(): SVGroupDAO
    abstract fun userCriteriaActivityDAO(): UserCriteriaActivityDAO
    abstract fun userCriteriaPointDAO(): UserCriteriaPointDAO
    abstract fun userDAO(): UserDAO
    abstract fun userGroupDAO(): UserGroupDAO
    abstract fun userRoleDAO(): UserRoleDAO
    abstract fun userCheckInActivityDAO(): UserCheckInActivityDAO
    abstract fun scheduleStudnetDAO(): ScheduleStudnetDAO
    abstract fun weekNumberDAO(): WeekNumberDAO
    abstract fun countStepsDAO(): CountStepsDAO
    abstract fun timetableDAO(): TimetableDAO
    abstract fun runningWayDao(): RunningWayDao
    abstract fun runningLocationDao(): RunningLocationDao
    abstract fun imageMotelDao(): ImageMotelDao
    abstract fun runDataDao(): RunDataDao

    companion object {

        // For Singleton instantiation
        @Volatile private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        // Create and pre-populate the database. See this article for more details:
        // https://medium.com/google-developers/7-pro-tips-for-room-fbadea4bfbd1#4785
        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, InjectorUtils.NAME_DATABASE)
                .fallbackToDestructiveMigration()
                .addCallback(object : RoomDatabase.Callback() {
                })
                .build()
        }
    }
}
