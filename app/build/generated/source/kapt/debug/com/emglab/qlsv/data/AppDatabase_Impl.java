package com.emglab.qlsv.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.emglab.qlsv.dao.ActivityDAO;
import com.emglab.qlsv.dao.ActivityDAO_Impl;
import com.emglab.qlsv.dao.CountStepsDAO;
import com.emglab.qlsv.dao.CountStepsDAO_Impl;
import com.emglab.qlsv.dao.CriteriaDAO;
import com.emglab.qlsv.dao.CriteriaDAO_Impl;
import com.emglab.qlsv.dao.ImageMotelDao;
import com.emglab.qlsv.dao.ImageMotelDao_Impl;
import com.emglab.qlsv.dao.RunDataDao;
import com.emglab.qlsv.dao.RunDataDao_Impl;
import com.emglab.qlsv.dao.RunningLocationDao;
import com.emglab.qlsv.dao.RunningLocationDao_Impl;
import com.emglab.qlsv.dao.RunningWayDao;
import com.emglab.qlsv.dao.RunningWayDao_Impl;
import com.emglab.qlsv.dao.SVGroupDAO;
import com.emglab.qlsv.dao.SVGroupDAO_Impl;
import com.emglab.qlsv.dao.ScheduleStudnetDAO;
import com.emglab.qlsv.dao.ScheduleStudnetDAO_Impl;
import com.emglab.qlsv.dao.TimetableDAO;
import com.emglab.qlsv.dao.TimetableDAO_Impl;
import com.emglab.qlsv.dao.UserCheckInActivityDAO;
import com.emglab.qlsv.dao.UserCheckInActivityDAO_Impl;
import com.emglab.qlsv.dao.UserCriteriaActivityDAO;
import com.emglab.qlsv.dao.UserCriteriaActivityDAO_Impl;
import com.emglab.qlsv.dao.UserCriteriaPointDAO;
import com.emglab.qlsv.dao.UserCriteriaPointDAO_Impl;
import com.emglab.qlsv.dao.UserDAO;
import com.emglab.qlsv.dao.UserDAO_Impl;
import com.emglab.qlsv.dao.UserGroupDAO;
import com.emglab.qlsv.dao.UserGroupDAO_Impl;
import com.emglab.qlsv.dao.UserRoleDAO;
import com.emglab.qlsv.dao.UserRoleDAO_Impl;
import com.emglab.qlsv.dao.WeekNumberDAO;
import com.emglab.qlsv.dao.WeekNumberDAO_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ActivityDAO _activityDAO;

  private volatile CriteriaDAO _criteriaDAO;

  private volatile SVGroupDAO _sVGroupDAO;

  private volatile UserCriteriaActivityDAO _userCriteriaActivityDAO;

  private volatile UserCriteriaPointDAO _userCriteriaPointDAO;

  private volatile UserDAO _userDAO;

  private volatile UserGroupDAO _userGroupDAO;

  private volatile UserRoleDAO _userRoleDAO;

  private volatile UserCheckInActivityDAO _userCheckInActivityDAO;

  private volatile ScheduleStudnetDAO _scheduleStudnetDAO;

  private volatile WeekNumberDAO _weekNumberDAO;

  private volatile CountStepsDAO _countStepsDAO;

  private volatile TimetableDAO _timetableDAO;

  private volatile RunningWayDao _runningWayDao;

  private volatile RunningLocationDao _runningLocationDao;

  private volatile ImageMotelDao _imageMotelDao;

  private volatile RunDataDao _runDataDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(29) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Activity` (`AId` INTEGER NOT NULL, `ACode` TEXT, `AName` TEXT, `AType` TEXT, `ADesc` TEXT, `StartTime` INTEGER, `FinishTime` INTEGER, `APlace` TEXT, `GId` INTEGER, `GName` TEXT, `Data` TEXT, `CreateDate` TEXT, `CreateUser` TEXT, `AStatus` INTEGER, `ARefId` TEXT, `AGId` INTEGER, `AGDesc` TEXT, `UserRole` INTEGER, `ParentAId` INTEGER, `UAStatus` INTEGER, `deadline` INTEGER, `linkImage` TEXT NOT NULL, PRIMARY KEY(`AId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Criteria` (`CId` INTEGER NOT NULL, `CCode` TEXT, `CName` TEXT, `CType` TEXT, `CGroupId` INTEGER, `CMaxPoint` INTEGER, `CStatus` INTEGER, `UCPoint` INTEGER, `Semester` TEXT, `AId` INTEGER NOT NULL, PRIMARY KEY(`CId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SVGroup` (`ParentGId` INTEGER, `GId` INTEGER NOT NULL, `GCode` TEXT, `GName` TEXT, `GType` TEXT, `StartTime` INTEGER, `FinishTime` INTEGER, `CreateDate` INTEGER, `CreateUser` TEXT, `GStatus` INTEGER, `GRefId` TEXT, `GCriteriaLst` TEXT, PRIMARY KEY(`GId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `User` (`StudentId` TEXT NOT NULL, `StudentName` TEXT, `Birthday` TEXT, `UClass` INTEGER, `Email` TEXT, `Sex` TEXT, `CMND` TEXT, `Faculty` TEXT, `Moblie` TEXT, `Avatar` TEXT, PRIMARY KEY(`StudentId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserCriteriaActivity` (`UCAId` INTEGER NOT NULL, `CId` INTEGER NOT NULL, `AId` INTEGER NOT NULL, `CreateDate` INTEGER, `CreateUser` TEXT, `UCAStatus` INTEGER, `startTime` INTEGER, `finishTime` INTEGER, `name` TEXT NOT NULL, PRIMARY KEY(`UCAId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserCriteriaPoint` (`UCPId` INTEGER NOT NULL, `CId` INTEGER NOT NULL, `CreateUser` TEXT, `CreateDate` INTEGER, `UCPDesc` TEXT, `UCPoint` INTEGER, `Semester` TEXT, PRIMARY KEY(`UCPId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserGroup` (`UGId` INTEGER NOT NULL, `UserCode` TEXT, `GId` INTEGER, `UserRole` INTEGER, `Reason` TEXT, `CreateDate` TEXT, `CreateUser` TEXT, PRIMARY KEY(`UGId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserRole` (`URId` INTEGER NOT NULL, `URName` TEXT, `URDesc` TEXT, `URLevel` INTEGER, PRIMARY KEY(`URId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserCheckInActivity` (`UACId` INTEGER NOT NULL, `UserName` TEXT, `UserCode` TEXT, `AId` INTEGER, `CheckInTime` INTEGER, `CheckInAddress` TEXT, `Longitude` REAL, `Latitude` REAL, `UACStatus` INTEGER, PRIMARY KEY(`UACId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ScheduleStudent` (`UUID` TEXT NOT NULL, `SubjectId` TEXT NOT NULL, `SubjectName` TEXT, `ClassID` TEXT NOT NULL, `TimeStart` TEXT, `TimeEnd` TEXT, `Week` TEXT, `Type` TEXT, `TypeSubject` TEXT NOT NULL, `Tower` TEXT, `Room` TEXT, `DayOfWeek` TEXT NOT NULL, `Description` TEXT, PRIMARY KEY(`UUID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `WeekNumber` (`Id` TEXT NOT NULL, `StudentName` TEXT, PRIMARY KEY(`Id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `countSteps` (`id` TEXT NOT NULL, `steps` INTEGER NOT NULL, `timer` TEXT, `date` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Timetable` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `SubjectName` TEXT NOT NULL, `ClassID` TEXT NOT NULL, `TimeStart` TEXT NOT NULL, `TimeEnd` TEXT NOT NULL, `Week` TEXT NOT NULL, `TypeSubject` TEXT NOT NULL, `Tower` TEXT NOT NULL, `Room` TEXT NOT NULL, `DayOfWeek` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RunningLocation` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `wayID` TEXT NOT NULL, `index` INTEGER NOT NULL, `timeUpdated` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RunningWay` (`id` TEXT NOT NULL, `timeStart` INTEGER NOT NULL, `timeUpdated` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ImageMotel` (`idMotel` INTEGER NOT NULL, `type` INTEGER, `image` TEXT, `status` INTEGER, `file` TEXT, `time` TEXT NOT NULL, PRIMARY KEY(`idMotel`, `time`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RunData` (`ComIdInRoom` TEXT NOT NULL, `ComID` INTEGER NOT NULL, `ComName` TEXT NOT NULL, `WayID` TEXT NOT NULL, `UserCode` TEXT NOT NULL, `TimeStart` TEXT NOT NULL, `TimeEnd` TEXT NOT NULL, `Distance` REAL NOT NULL, PRIMARY KEY(`WayID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"f429237dc8e5744790892c5933052b29\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Activity`");
        _db.execSQL("DROP TABLE IF EXISTS `Criteria`");
        _db.execSQL("DROP TABLE IF EXISTS `SVGroup`");
        _db.execSQL("DROP TABLE IF EXISTS `User`");
        _db.execSQL("DROP TABLE IF EXISTS `UserCriteriaActivity`");
        _db.execSQL("DROP TABLE IF EXISTS `UserCriteriaPoint`");
        _db.execSQL("DROP TABLE IF EXISTS `UserGroup`");
        _db.execSQL("DROP TABLE IF EXISTS `UserRole`");
        _db.execSQL("DROP TABLE IF EXISTS `UserCheckInActivity`");
        _db.execSQL("DROP TABLE IF EXISTS `ScheduleStudent`");
        _db.execSQL("DROP TABLE IF EXISTS `WeekNumber`");
        _db.execSQL("DROP TABLE IF EXISTS `countSteps`");
        _db.execSQL("DROP TABLE IF EXISTS `Timetable`");
        _db.execSQL("DROP TABLE IF EXISTS `RunningLocation`");
        _db.execSQL("DROP TABLE IF EXISTS `RunningWay`");
        _db.execSQL("DROP TABLE IF EXISTS `ImageMotel`");
        _db.execSQL("DROP TABLE IF EXISTS `RunData`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsActivity = new HashMap<String, TableInfo.Column>(22);
        _columnsActivity.put("AId", new TableInfo.Column("AId", "INTEGER", true, 1));
        _columnsActivity.put("ACode", new TableInfo.Column("ACode", "TEXT", false, 0));
        _columnsActivity.put("AName", new TableInfo.Column("AName", "TEXT", false, 0));
        _columnsActivity.put("AType", new TableInfo.Column("AType", "TEXT", false, 0));
        _columnsActivity.put("ADesc", new TableInfo.Column("ADesc", "TEXT", false, 0));
        _columnsActivity.put("StartTime", new TableInfo.Column("StartTime", "INTEGER", false, 0));
        _columnsActivity.put("FinishTime", new TableInfo.Column("FinishTime", "INTEGER", false, 0));
        _columnsActivity.put("APlace", new TableInfo.Column("APlace", "TEXT", false, 0));
        _columnsActivity.put("GId", new TableInfo.Column("GId", "INTEGER", false, 0));
        _columnsActivity.put("GName", new TableInfo.Column("GName", "TEXT", false, 0));
        _columnsActivity.put("Data", new TableInfo.Column("Data", "TEXT", false, 0));
        _columnsActivity.put("CreateDate", new TableInfo.Column("CreateDate", "TEXT", false, 0));
        _columnsActivity.put("CreateUser", new TableInfo.Column("CreateUser", "TEXT", false, 0));
        _columnsActivity.put("AStatus", new TableInfo.Column("AStatus", "INTEGER", false, 0));
        _columnsActivity.put("ARefId", new TableInfo.Column("ARefId", "TEXT", false, 0));
        _columnsActivity.put("AGId", new TableInfo.Column("AGId", "INTEGER", false, 0));
        _columnsActivity.put("AGDesc", new TableInfo.Column("AGDesc", "TEXT", false, 0));
        _columnsActivity.put("UserRole", new TableInfo.Column("UserRole", "INTEGER", false, 0));
        _columnsActivity.put("ParentAId", new TableInfo.Column("ParentAId", "INTEGER", false, 0));
        _columnsActivity.put("UAStatus", new TableInfo.Column("UAStatus", "INTEGER", false, 0));
        _columnsActivity.put("deadline", new TableInfo.Column("deadline", "INTEGER", false, 0));
        _columnsActivity.put("linkImage", new TableInfo.Column("linkImage", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysActivity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesActivity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoActivity = new TableInfo("Activity", _columnsActivity, _foreignKeysActivity, _indicesActivity);
        final TableInfo _existingActivity = TableInfo.read(_db, "Activity");
        if (! _infoActivity.equals(_existingActivity)) {
          throw new IllegalStateException("Migration didn't properly handle Activity(com.emglab.qlsv.models.entity.Activity).\n"
                  + " Expected:\n" + _infoActivity + "\n"
                  + " Found:\n" + _existingActivity);
        }
        final HashMap<String, TableInfo.Column> _columnsCriteria = new HashMap<String, TableInfo.Column>(10);
        _columnsCriteria.put("CId", new TableInfo.Column("CId", "INTEGER", true, 1));
        _columnsCriteria.put("CCode", new TableInfo.Column("CCode", "TEXT", false, 0));
        _columnsCriteria.put("CName", new TableInfo.Column("CName", "TEXT", false, 0));
        _columnsCriteria.put("CType", new TableInfo.Column("CType", "TEXT", false, 0));
        _columnsCriteria.put("CGroupId", new TableInfo.Column("CGroupId", "INTEGER", false, 0));
        _columnsCriteria.put("CMaxPoint", new TableInfo.Column("CMaxPoint", "INTEGER", false, 0));
        _columnsCriteria.put("CStatus", new TableInfo.Column("CStatus", "INTEGER", false, 0));
        _columnsCriteria.put("UCPoint", new TableInfo.Column("UCPoint", "INTEGER", false, 0));
        _columnsCriteria.put("Semester", new TableInfo.Column("Semester", "TEXT", false, 0));
        _columnsCriteria.put("AId", new TableInfo.Column("AId", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCriteria = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCriteria = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCriteria = new TableInfo("Criteria", _columnsCriteria, _foreignKeysCriteria, _indicesCriteria);
        final TableInfo _existingCriteria = TableInfo.read(_db, "Criteria");
        if (! _infoCriteria.equals(_existingCriteria)) {
          throw new IllegalStateException("Migration didn't properly handle Criteria(com.emglab.qlsv.models.entity.Criteria).\n"
                  + " Expected:\n" + _infoCriteria + "\n"
                  + " Found:\n" + _existingCriteria);
        }
        final HashMap<String, TableInfo.Column> _columnsSVGroup = new HashMap<String, TableInfo.Column>(12);
        _columnsSVGroup.put("ParentGId", new TableInfo.Column("ParentGId", "INTEGER", false, 0));
        _columnsSVGroup.put("GId", new TableInfo.Column("GId", "INTEGER", true, 1));
        _columnsSVGroup.put("GCode", new TableInfo.Column("GCode", "TEXT", false, 0));
        _columnsSVGroup.put("GName", new TableInfo.Column("GName", "TEXT", false, 0));
        _columnsSVGroup.put("GType", new TableInfo.Column("GType", "TEXT", false, 0));
        _columnsSVGroup.put("StartTime", new TableInfo.Column("StartTime", "INTEGER", false, 0));
        _columnsSVGroup.put("FinishTime", new TableInfo.Column("FinishTime", "INTEGER", false, 0));
        _columnsSVGroup.put("CreateDate", new TableInfo.Column("CreateDate", "INTEGER", false, 0));
        _columnsSVGroup.put("CreateUser", new TableInfo.Column("CreateUser", "TEXT", false, 0));
        _columnsSVGroup.put("GStatus", new TableInfo.Column("GStatus", "INTEGER", false, 0));
        _columnsSVGroup.put("GRefId", new TableInfo.Column("GRefId", "TEXT", false, 0));
        _columnsSVGroup.put("GCriteriaLst", new TableInfo.Column("GCriteriaLst", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSVGroup = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSVGroup = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSVGroup = new TableInfo("SVGroup", _columnsSVGroup, _foreignKeysSVGroup, _indicesSVGroup);
        final TableInfo _existingSVGroup = TableInfo.read(_db, "SVGroup");
        if (! _infoSVGroup.equals(_existingSVGroup)) {
          throw new IllegalStateException("Migration didn't properly handle SVGroup(com.emglab.qlsv.models.entity.SVGroup).\n"
                  + " Expected:\n" + _infoSVGroup + "\n"
                  + " Found:\n" + _existingSVGroup);
        }
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(10);
        _columnsUser.put("StudentId", new TableInfo.Column("StudentId", "TEXT", true, 1));
        _columnsUser.put("StudentName", new TableInfo.Column("StudentName", "TEXT", false, 0));
        _columnsUser.put("Birthday", new TableInfo.Column("Birthday", "TEXT", false, 0));
        _columnsUser.put("UClass", new TableInfo.Column("UClass", "INTEGER", false, 0));
        _columnsUser.put("Email", new TableInfo.Column("Email", "TEXT", false, 0));
        _columnsUser.put("Sex", new TableInfo.Column("Sex", "TEXT", false, 0));
        _columnsUser.put("CMND", new TableInfo.Column("CMND", "TEXT", false, 0));
        _columnsUser.put("Faculty", new TableInfo.Column("Faculty", "TEXT", false, 0));
        _columnsUser.put("Moblie", new TableInfo.Column("Moblie", "TEXT", false, 0));
        _columnsUser.put("Avatar", new TableInfo.Column("Avatar", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("User", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "User");
        if (! _infoUser.equals(_existingUser)) {
          throw new IllegalStateException("Migration didn't properly handle User(com.emglab.qlsv.models.entity.User).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
        final HashMap<String, TableInfo.Column> _columnsUserCriteriaActivity = new HashMap<String, TableInfo.Column>(9);
        _columnsUserCriteriaActivity.put("UCAId", new TableInfo.Column("UCAId", "INTEGER", true, 1));
        _columnsUserCriteriaActivity.put("CId", new TableInfo.Column("CId", "INTEGER", true, 0));
        _columnsUserCriteriaActivity.put("AId", new TableInfo.Column("AId", "INTEGER", true, 0));
        _columnsUserCriteriaActivity.put("CreateDate", new TableInfo.Column("CreateDate", "INTEGER", false, 0));
        _columnsUserCriteriaActivity.put("CreateUser", new TableInfo.Column("CreateUser", "TEXT", false, 0));
        _columnsUserCriteriaActivity.put("UCAStatus", new TableInfo.Column("UCAStatus", "INTEGER", false, 0));
        _columnsUserCriteriaActivity.put("startTime", new TableInfo.Column("startTime", "INTEGER", false, 0));
        _columnsUserCriteriaActivity.put("finishTime", new TableInfo.Column("finishTime", "INTEGER", false, 0));
        _columnsUserCriteriaActivity.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserCriteriaActivity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserCriteriaActivity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserCriteriaActivity = new TableInfo("UserCriteriaActivity", _columnsUserCriteriaActivity, _foreignKeysUserCriteriaActivity, _indicesUserCriteriaActivity);
        final TableInfo _existingUserCriteriaActivity = TableInfo.read(_db, "UserCriteriaActivity");
        if (! _infoUserCriteriaActivity.equals(_existingUserCriteriaActivity)) {
          throw new IllegalStateException("Migration didn't properly handle UserCriteriaActivity(com.emglab.qlsv.models.entity.UserCriteriaActivity).\n"
                  + " Expected:\n" + _infoUserCriteriaActivity + "\n"
                  + " Found:\n" + _existingUserCriteriaActivity);
        }
        final HashMap<String, TableInfo.Column> _columnsUserCriteriaPoint = new HashMap<String, TableInfo.Column>(7);
        _columnsUserCriteriaPoint.put("UCPId", new TableInfo.Column("UCPId", "INTEGER", true, 1));
        _columnsUserCriteriaPoint.put("CId", new TableInfo.Column("CId", "INTEGER", true, 0));
        _columnsUserCriteriaPoint.put("CreateUser", new TableInfo.Column("CreateUser", "TEXT", false, 0));
        _columnsUserCriteriaPoint.put("CreateDate", new TableInfo.Column("CreateDate", "INTEGER", false, 0));
        _columnsUserCriteriaPoint.put("UCPDesc", new TableInfo.Column("UCPDesc", "TEXT", false, 0));
        _columnsUserCriteriaPoint.put("UCPoint", new TableInfo.Column("UCPoint", "INTEGER", false, 0));
        _columnsUserCriteriaPoint.put("Semester", new TableInfo.Column("Semester", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserCriteriaPoint = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserCriteriaPoint = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserCriteriaPoint = new TableInfo("UserCriteriaPoint", _columnsUserCriteriaPoint, _foreignKeysUserCriteriaPoint, _indicesUserCriteriaPoint);
        final TableInfo _existingUserCriteriaPoint = TableInfo.read(_db, "UserCriteriaPoint");
        if (! _infoUserCriteriaPoint.equals(_existingUserCriteriaPoint)) {
          throw new IllegalStateException("Migration didn't properly handle UserCriteriaPoint(com.emglab.qlsv.models.entity.UserCriteriaPoint).\n"
                  + " Expected:\n" + _infoUserCriteriaPoint + "\n"
                  + " Found:\n" + _existingUserCriteriaPoint);
        }
        final HashMap<String, TableInfo.Column> _columnsUserGroup = new HashMap<String, TableInfo.Column>(7);
        _columnsUserGroup.put("UGId", new TableInfo.Column("UGId", "INTEGER", true, 1));
        _columnsUserGroup.put("UserCode", new TableInfo.Column("UserCode", "TEXT", false, 0));
        _columnsUserGroup.put("GId", new TableInfo.Column("GId", "INTEGER", false, 0));
        _columnsUserGroup.put("UserRole", new TableInfo.Column("UserRole", "INTEGER", false, 0));
        _columnsUserGroup.put("Reason", new TableInfo.Column("Reason", "TEXT", false, 0));
        _columnsUserGroup.put("CreateDate", new TableInfo.Column("CreateDate", "TEXT", false, 0));
        _columnsUserGroup.put("CreateUser", new TableInfo.Column("CreateUser", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserGroup = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserGroup = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserGroup = new TableInfo("UserGroup", _columnsUserGroup, _foreignKeysUserGroup, _indicesUserGroup);
        final TableInfo _existingUserGroup = TableInfo.read(_db, "UserGroup");
        if (! _infoUserGroup.equals(_existingUserGroup)) {
          throw new IllegalStateException("Migration didn't properly handle UserGroup(com.emglab.qlsv.models.entity.UserGroup).\n"
                  + " Expected:\n" + _infoUserGroup + "\n"
                  + " Found:\n" + _existingUserGroup);
        }
        final HashMap<String, TableInfo.Column> _columnsUserRole = new HashMap<String, TableInfo.Column>(4);
        _columnsUserRole.put("URId", new TableInfo.Column("URId", "INTEGER", true, 1));
        _columnsUserRole.put("URName", new TableInfo.Column("URName", "TEXT", false, 0));
        _columnsUserRole.put("URDesc", new TableInfo.Column("URDesc", "TEXT", false, 0));
        _columnsUserRole.put("URLevel", new TableInfo.Column("URLevel", "INTEGER", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserRole = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserRole = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserRole = new TableInfo("UserRole", _columnsUserRole, _foreignKeysUserRole, _indicesUserRole);
        final TableInfo _existingUserRole = TableInfo.read(_db, "UserRole");
        if (! _infoUserRole.equals(_existingUserRole)) {
          throw new IllegalStateException("Migration didn't properly handle UserRole(com.emglab.qlsv.models.entity.UserRole).\n"
                  + " Expected:\n" + _infoUserRole + "\n"
                  + " Found:\n" + _existingUserRole);
        }
        final HashMap<String, TableInfo.Column> _columnsUserCheckInActivity = new HashMap<String, TableInfo.Column>(9);
        _columnsUserCheckInActivity.put("UACId", new TableInfo.Column("UACId", "INTEGER", true, 1));
        _columnsUserCheckInActivity.put("UserName", new TableInfo.Column("UserName", "TEXT", false, 0));
        _columnsUserCheckInActivity.put("UserCode", new TableInfo.Column("UserCode", "TEXT", false, 0));
        _columnsUserCheckInActivity.put("AId", new TableInfo.Column("AId", "INTEGER", false, 0));
        _columnsUserCheckInActivity.put("CheckInTime", new TableInfo.Column("CheckInTime", "INTEGER", false, 0));
        _columnsUserCheckInActivity.put("CheckInAddress", new TableInfo.Column("CheckInAddress", "TEXT", false, 0));
        _columnsUserCheckInActivity.put("Longitude", new TableInfo.Column("Longitude", "REAL", false, 0));
        _columnsUserCheckInActivity.put("Latitude", new TableInfo.Column("Latitude", "REAL", false, 0));
        _columnsUserCheckInActivity.put("UACStatus", new TableInfo.Column("UACStatus", "INTEGER", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserCheckInActivity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserCheckInActivity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserCheckInActivity = new TableInfo("UserCheckInActivity", _columnsUserCheckInActivity, _foreignKeysUserCheckInActivity, _indicesUserCheckInActivity);
        final TableInfo _existingUserCheckInActivity = TableInfo.read(_db, "UserCheckInActivity");
        if (! _infoUserCheckInActivity.equals(_existingUserCheckInActivity)) {
          throw new IllegalStateException("Migration didn't properly handle UserCheckInActivity(com.emglab.qlsv.models.entity.UserCheckInActivity).\n"
                  + " Expected:\n" + _infoUserCheckInActivity + "\n"
                  + " Found:\n" + _existingUserCheckInActivity);
        }
        final HashMap<String, TableInfo.Column> _columnsScheduleStudent = new HashMap<String, TableInfo.Column>(13);
        _columnsScheduleStudent.put("UUID", new TableInfo.Column("UUID", "TEXT", true, 1));
        _columnsScheduleStudent.put("SubjectId", new TableInfo.Column("SubjectId", "TEXT", true, 0));
        _columnsScheduleStudent.put("SubjectName", new TableInfo.Column("SubjectName", "TEXT", false, 0));
        _columnsScheduleStudent.put("ClassID", new TableInfo.Column("ClassID", "TEXT", true, 0));
        _columnsScheduleStudent.put("TimeStart", new TableInfo.Column("TimeStart", "TEXT", false, 0));
        _columnsScheduleStudent.put("TimeEnd", new TableInfo.Column("TimeEnd", "TEXT", false, 0));
        _columnsScheduleStudent.put("Week", new TableInfo.Column("Week", "TEXT", false, 0));
        _columnsScheduleStudent.put("Type", new TableInfo.Column("Type", "TEXT", false, 0));
        _columnsScheduleStudent.put("TypeSubject", new TableInfo.Column("TypeSubject", "TEXT", true, 0));
        _columnsScheduleStudent.put("Tower", new TableInfo.Column("Tower", "TEXT", false, 0));
        _columnsScheduleStudent.put("Room", new TableInfo.Column("Room", "TEXT", false, 0));
        _columnsScheduleStudent.put("DayOfWeek", new TableInfo.Column("DayOfWeek", "TEXT", true, 0));
        _columnsScheduleStudent.put("Description", new TableInfo.Column("Description", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysScheduleStudent = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesScheduleStudent = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoScheduleStudent = new TableInfo("ScheduleStudent", _columnsScheduleStudent, _foreignKeysScheduleStudent, _indicesScheduleStudent);
        final TableInfo _existingScheduleStudent = TableInfo.read(_db, "ScheduleStudent");
        if (! _infoScheduleStudent.equals(_existingScheduleStudent)) {
          throw new IllegalStateException("Migration didn't properly handle ScheduleStudent(com.emglab.qlsv.models.entity.ScheduleStudent).\n"
                  + " Expected:\n" + _infoScheduleStudent + "\n"
                  + " Found:\n" + _existingScheduleStudent);
        }
        final HashMap<String, TableInfo.Column> _columnsWeekNumber = new HashMap<String, TableInfo.Column>(2);
        _columnsWeekNumber.put("Id", new TableInfo.Column("Id", "TEXT", true, 1));
        _columnsWeekNumber.put("StudentName", new TableInfo.Column("StudentName", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWeekNumber = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWeekNumber = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWeekNumber = new TableInfo("WeekNumber", _columnsWeekNumber, _foreignKeysWeekNumber, _indicesWeekNumber);
        final TableInfo _existingWeekNumber = TableInfo.read(_db, "WeekNumber");
        if (! _infoWeekNumber.equals(_existingWeekNumber)) {
          throw new IllegalStateException("Migration didn't properly handle WeekNumber(com.emglab.qlsv.models.entity.WeekNumber).\n"
                  + " Expected:\n" + _infoWeekNumber + "\n"
                  + " Found:\n" + _existingWeekNumber);
        }
        final HashMap<String, TableInfo.Column> _columnsCountSteps = new HashMap<String, TableInfo.Column>(4);
        _columnsCountSteps.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsCountSteps.put("steps", new TableInfo.Column("steps", "INTEGER", true, 0));
        _columnsCountSteps.put("timer", new TableInfo.Column("timer", "TEXT", false, 0));
        _columnsCountSteps.put("date", new TableInfo.Column("date", "INTEGER", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCountSteps = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCountSteps = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCountSteps = new TableInfo("countSteps", _columnsCountSteps, _foreignKeysCountSteps, _indicesCountSteps);
        final TableInfo _existingCountSteps = TableInfo.read(_db, "countSteps");
        if (! _infoCountSteps.equals(_existingCountSteps)) {
          throw new IllegalStateException("Migration didn't properly handle countSteps(com.emglab.qlsv.models.entity.CountSteps).\n"
                  + " Expected:\n" + _infoCountSteps + "\n"
                  + " Found:\n" + _existingCountSteps);
        }
        final HashMap<String, TableInfo.Column> _columnsTimetable = new HashMap<String, TableInfo.Column>(10);
        _columnsTimetable.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsTimetable.put("SubjectName", new TableInfo.Column("SubjectName", "TEXT", true, 0));
        _columnsTimetable.put("ClassID", new TableInfo.Column("ClassID", "TEXT", true, 0));
        _columnsTimetable.put("TimeStart", new TableInfo.Column("TimeStart", "TEXT", true, 0));
        _columnsTimetable.put("TimeEnd", new TableInfo.Column("TimeEnd", "TEXT", true, 0));
        _columnsTimetable.put("Week", new TableInfo.Column("Week", "TEXT", true, 0));
        _columnsTimetable.put("TypeSubject", new TableInfo.Column("TypeSubject", "TEXT", true, 0));
        _columnsTimetable.put("Tower", new TableInfo.Column("Tower", "TEXT", true, 0));
        _columnsTimetable.put("Room", new TableInfo.Column("Room", "TEXT", true, 0));
        _columnsTimetable.put("DayOfWeek", new TableInfo.Column("DayOfWeek", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTimetable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTimetable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTimetable = new TableInfo("Timetable", _columnsTimetable, _foreignKeysTimetable, _indicesTimetable);
        final TableInfo _existingTimetable = TableInfo.read(_db, "Timetable");
        if (! _infoTimetable.equals(_existingTimetable)) {
          throw new IllegalStateException("Migration didn't properly handle Timetable(com.emglab.qlsv.models.entity.Subject).\n"
                  + " Expected:\n" + _infoTimetable + "\n"
                  + " Found:\n" + _existingTimetable);
        }
        final HashMap<String, TableInfo.Column> _columnsRunningLocation = new HashMap<String, TableInfo.Column>(6);
        _columnsRunningLocation.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsRunningLocation.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0));
        _columnsRunningLocation.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0));
        _columnsRunningLocation.put("wayID", new TableInfo.Column("wayID", "TEXT", true, 0));
        _columnsRunningLocation.put("index", new TableInfo.Column("index", "INTEGER", true, 0));
        _columnsRunningLocation.put("timeUpdated", new TableInfo.Column("timeUpdated", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRunningLocation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRunningLocation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRunningLocation = new TableInfo("RunningLocation", _columnsRunningLocation, _foreignKeysRunningLocation, _indicesRunningLocation);
        final TableInfo _existingRunningLocation = TableInfo.read(_db, "RunningLocation");
        if (! _infoRunningLocation.equals(_existingRunningLocation)) {
          throw new IllegalStateException("Migration didn't properly handle RunningLocation(com.emglab.qlsv.models.entity.run.RunningLocation).\n"
                  + " Expected:\n" + _infoRunningLocation + "\n"
                  + " Found:\n" + _existingRunningLocation);
        }
        final HashMap<String, TableInfo.Column> _columnsRunningWay = new HashMap<String, TableInfo.Column>(3);
        _columnsRunningWay.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsRunningWay.put("timeStart", new TableInfo.Column("timeStart", "INTEGER", true, 0));
        _columnsRunningWay.put("timeUpdated", new TableInfo.Column("timeUpdated", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRunningWay = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRunningWay = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRunningWay = new TableInfo("RunningWay", _columnsRunningWay, _foreignKeysRunningWay, _indicesRunningWay);
        final TableInfo _existingRunningWay = TableInfo.read(_db, "RunningWay");
        if (! _infoRunningWay.equals(_existingRunningWay)) {
          throw new IllegalStateException("Migration didn't properly handle RunningWay(com.emglab.qlsv.models.entity.run.RunningWay).\n"
                  + " Expected:\n" + _infoRunningWay + "\n"
                  + " Found:\n" + _existingRunningWay);
        }
        final HashMap<String, TableInfo.Column> _columnsImageMotel = new HashMap<String, TableInfo.Column>(6);
        _columnsImageMotel.put("idMotel", new TableInfo.Column("idMotel", "INTEGER", true, 1));
        _columnsImageMotel.put("type", new TableInfo.Column("type", "INTEGER", false, 0));
        _columnsImageMotel.put("image", new TableInfo.Column("image", "TEXT", false, 0));
        _columnsImageMotel.put("status", new TableInfo.Column("status", "INTEGER", false, 0));
        _columnsImageMotel.put("file", new TableInfo.Column("file", "TEXT", false, 0));
        _columnsImageMotel.put("time", new TableInfo.Column("time", "TEXT", true, 2));
        final HashSet<TableInfo.ForeignKey> _foreignKeysImageMotel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesImageMotel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoImageMotel = new TableInfo("ImageMotel", _columnsImageMotel, _foreignKeysImageMotel, _indicesImageMotel);
        final TableInfo _existingImageMotel = TableInfo.read(_db, "ImageMotel");
        if (! _infoImageMotel.equals(_existingImageMotel)) {
          throw new IllegalStateException("Migration didn't properly handle ImageMotel(com.emglab.qlsv.models.entity.ImageMotel).\n"
                  + " Expected:\n" + _infoImageMotel + "\n"
                  + " Found:\n" + _existingImageMotel);
        }
        final HashMap<String, TableInfo.Column> _columnsRunData = new HashMap<String, TableInfo.Column>(8);
        _columnsRunData.put("ComIdInRoom", new TableInfo.Column("ComIdInRoom", "TEXT", true, 0));
        _columnsRunData.put("ComID", new TableInfo.Column("ComID", "INTEGER", true, 0));
        _columnsRunData.put("ComName", new TableInfo.Column("ComName", "TEXT", true, 0));
        _columnsRunData.put("WayID", new TableInfo.Column("WayID", "TEXT", true, 1));
        _columnsRunData.put("UserCode", new TableInfo.Column("UserCode", "TEXT", true, 0));
        _columnsRunData.put("TimeStart", new TableInfo.Column("TimeStart", "TEXT", true, 0));
        _columnsRunData.put("TimeEnd", new TableInfo.Column("TimeEnd", "TEXT", true, 0));
        _columnsRunData.put("Distance", new TableInfo.Column("Distance", "REAL", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRunData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRunData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRunData = new TableInfo("RunData", _columnsRunData, _foreignKeysRunData, _indicesRunData);
        final TableInfo _existingRunData = TableInfo.read(_db, "RunData");
        if (! _infoRunData.equals(_existingRunData)) {
          throw new IllegalStateException("Migration didn't properly handle RunData(com.emglab.qlsv.models.entity.run.RunData).\n"
                  + " Expected:\n" + _infoRunData + "\n"
                  + " Found:\n" + _existingRunData);
        }
      }
    }, "f429237dc8e5744790892c5933052b29", "c883fd7d6163b507103af1e666726e8b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "Activity","Criteria","SVGroup","User","UserCriteriaActivity","UserCriteriaPoint","UserGroup","UserRole","UserCheckInActivity","ScheduleStudent","WeekNumber","countSteps","Timetable","RunningLocation","RunningWay","ImageMotel","RunData");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Activity`");
      _db.execSQL("DELETE FROM `Criteria`");
      _db.execSQL("DELETE FROM `SVGroup`");
      _db.execSQL("DELETE FROM `User`");
      _db.execSQL("DELETE FROM `UserCriteriaActivity`");
      _db.execSQL("DELETE FROM `UserCriteriaPoint`");
      _db.execSQL("DELETE FROM `UserGroup`");
      _db.execSQL("DELETE FROM `UserRole`");
      _db.execSQL("DELETE FROM `UserCheckInActivity`");
      _db.execSQL("DELETE FROM `ScheduleStudent`");
      _db.execSQL("DELETE FROM `WeekNumber`");
      _db.execSQL("DELETE FROM `countSteps`");
      _db.execSQL("DELETE FROM `Timetable`");
      _db.execSQL("DELETE FROM `RunningLocation`");
      _db.execSQL("DELETE FROM `RunningWay`");
      _db.execSQL("DELETE FROM `ImageMotel`");
      _db.execSQL("DELETE FROM `RunData`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ActivityDAO activityDAO() {
    if (_activityDAO != null) {
      return _activityDAO;
    } else {
      synchronized(this) {
        if(_activityDAO == null) {
          _activityDAO = new ActivityDAO_Impl(this);
        }
        return _activityDAO;
      }
    }
  }

  @Override
  public CriteriaDAO criteriaDAO() {
    if (_criteriaDAO != null) {
      return _criteriaDAO;
    } else {
      synchronized(this) {
        if(_criteriaDAO == null) {
          _criteriaDAO = new CriteriaDAO_Impl(this);
        }
        return _criteriaDAO;
      }
    }
  }

  @Override
  public SVGroupDAO svGroupDAO() {
    if (_sVGroupDAO != null) {
      return _sVGroupDAO;
    } else {
      synchronized(this) {
        if(_sVGroupDAO == null) {
          _sVGroupDAO = new SVGroupDAO_Impl(this);
        }
        return _sVGroupDAO;
      }
    }
  }

  @Override
  public UserCriteriaActivityDAO userCriteriaActivityDAO() {
    if (_userCriteriaActivityDAO != null) {
      return _userCriteriaActivityDAO;
    } else {
      synchronized(this) {
        if(_userCriteriaActivityDAO == null) {
          _userCriteriaActivityDAO = new UserCriteriaActivityDAO_Impl(this);
        }
        return _userCriteriaActivityDAO;
      }
    }
  }

  @Override
  public UserCriteriaPointDAO userCriteriaPointDAO() {
    if (_userCriteriaPointDAO != null) {
      return _userCriteriaPointDAO;
    } else {
      synchronized(this) {
        if(_userCriteriaPointDAO == null) {
          _userCriteriaPointDAO = new UserCriteriaPointDAO_Impl(this);
        }
        return _userCriteriaPointDAO;
      }
    }
  }

  @Override
  public UserDAO userDAO() {
    if (_userDAO != null) {
      return _userDAO;
    } else {
      synchronized(this) {
        if(_userDAO == null) {
          _userDAO = new UserDAO_Impl(this);
        }
        return _userDAO;
      }
    }
  }

  @Override
  public UserGroupDAO userGroupDAO() {
    if (_userGroupDAO != null) {
      return _userGroupDAO;
    } else {
      synchronized(this) {
        if(_userGroupDAO == null) {
          _userGroupDAO = new UserGroupDAO_Impl(this);
        }
        return _userGroupDAO;
      }
    }
  }

  @Override
  public UserRoleDAO userRoleDAO() {
    if (_userRoleDAO != null) {
      return _userRoleDAO;
    } else {
      synchronized(this) {
        if(_userRoleDAO == null) {
          _userRoleDAO = new UserRoleDAO_Impl(this);
        }
        return _userRoleDAO;
      }
    }
  }

  @Override
  public UserCheckInActivityDAO userCheckInActivityDAO() {
    if (_userCheckInActivityDAO != null) {
      return _userCheckInActivityDAO;
    } else {
      synchronized(this) {
        if(_userCheckInActivityDAO == null) {
          _userCheckInActivityDAO = new UserCheckInActivityDAO_Impl(this);
        }
        return _userCheckInActivityDAO;
      }
    }
  }

  @Override
  public ScheduleStudnetDAO scheduleStudnetDAO() {
    if (_scheduleStudnetDAO != null) {
      return _scheduleStudnetDAO;
    } else {
      synchronized(this) {
        if(_scheduleStudnetDAO == null) {
          _scheduleStudnetDAO = new ScheduleStudnetDAO_Impl(this);
        }
        return _scheduleStudnetDAO;
      }
    }
  }

  @Override
  public WeekNumberDAO weekNumberDAO() {
    if (_weekNumberDAO != null) {
      return _weekNumberDAO;
    } else {
      synchronized(this) {
        if(_weekNumberDAO == null) {
          _weekNumberDAO = new WeekNumberDAO_Impl(this);
        }
        return _weekNumberDAO;
      }
    }
  }

  @Override
  public CountStepsDAO countStepsDAO() {
    if (_countStepsDAO != null) {
      return _countStepsDAO;
    } else {
      synchronized(this) {
        if(_countStepsDAO == null) {
          _countStepsDAO = new CountStepsDAO_Impl(this);
        }
        return _countStepsDAO;
      }
    }
  }

  @Override
  public TimetableDAO timetableDAO() {
    if (_timetableDAO != null) {
      return _timetableDAO;
    } else {
      synchronized(this) {
        if(_timetableDAO == null) {
          _timetableDAO = new TimetableDAO_Impl(this);
        }
        return _timetableDAO;
      }
    }
  }

  @Override
  public RunningWayDao runningWayDao() {
    if (_runningWayDao != null) {
      return _runningWayDao;
    } else {
      synchronized(this) {
        if(_runningWayDao == null) {
          _runningWayDao = new RunningWayDao_Impl(this);
        }
        return _runningWayDao;
      }
    }
  }

  @Override
  public RunningLocationDao runningLocationDao() {
    if (_runningLocationDao != null) {
      return _runningLocationDao;
    } else {
      synchronized(this) {
        if(_runningLocationDao == null) {
          _runningLocationDao = new RunningLocationDao_Impl(this);
        }
        return _runningLocationDao;
      }
    }
  }

  @Override
  public ImageMotelDao imageMotelDao() {
    if (_imageMotelDao != null) {
      return _imageMotelDao;
    } else {
      synchronized(this) {
        if(_imageMotelDao == null) {
          _imageMotelDao = new ImageMotelDao_Impl(this);
        }
        return _imageMotelDao;
      }
    }
  }

  @Override
  public RunDataDao runDataDao() {
    if (_runDataDao != null) {
      return _runDataDao;
    } else {
      synchronized(this) {
        if(_runDataDao == null) {
          _runDataDao = new RunDataDao_Impl(this);
        }
        return _runDataDao;
      }
    }
  }
}
