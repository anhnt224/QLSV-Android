package com.emglab.qlsv.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.paging.DataSource.Factory;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.emglab.qlsv.Converters;
import com.emglab.qlsv.models.entity.Activity;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class ActivityDAO_Impl implements ActivityDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfActivity;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfActivity;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfActivity;

  private final SharedSQLiteStatement __preparedStmtOfUpdateStatus;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ActivityDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfActivity = new EntityInsertionAdapter<Activity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Activity`(`AId`,`ACode`,`AName`,`AType`,`ADesc`,`StartTime`,`FinishTime`,`APlace`,`GId`,`GName`,`Data`,`CreateDate`,`CreateUser`,`AStatus`,`ARefId`,`AGId`,`AGDesc`,`UserRole`,`ParentAId`,`UAStatus`,`deadline`,`linkImage`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Activity value) {
        stmt.bindLong(1, value.getId());
        if (value.getCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getType());
        }
        if (value.getDesc() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDesc());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getStartTime());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp);
        }
        final Long _tmp_1;
        _tmp_1 = __converters.dateToTimestamp(value.getFinishTime());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp_1);
        }
        if (value.getPlace() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPlace());
        }
        if (value.getGId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getGId());
        }
        if (value.getGName() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getGName());
        }
        if (value.getData() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getData());
        }
        if (value.getCreateDate() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getCreateDate());
        }
        if (value.getCreateUser() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getCreateUser());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getStatus());
        }
        if (value.getRefId() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getRefId());
        }
        if (value.getAGId() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindLong(16, value.getAGId());
        }
        if (value.getAGDesc() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getAGDesc());
        }
        if (value.getUserRole() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindLong(18, value.getUserRole());
        }
        if (value.getParentAId() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindLong(19, value.getParentAId());
        }
        if (value.getUAStatus() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindLong(20, value.getUAStatus());
        }
        final Long _tmp_2;
        _tmp_2 = __converters.dateToTimestamp(value.getDeadline());
        if (_tmp_2 == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindLong(21, _tmp_2);
        }
        if (value.getLinkImage() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getLinkImage());
        }
      }
    };
    this.__deletionAdapterOfActivity = new EntityDeletionOrUpdateAdapter<Activity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Activity` WHERE `AId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Activity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfActivity = new EntityDeletionOrUpdateAdapter<Activity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Activity` SET `AId` = ?,`ACode` = ?,`AName` = ?,`AType` = ?,`ADesc` = ?,`StartTime` = ?,`FinishTime` = ?,`APlace` = ?,`GId` = ?,`GName` = ?,`Data` = ?,`CreateDate` = ?,`CreateUser` = ?,`AStatus` = ?,`ARefId` = ?,`AGId` = ?,`AGDesc` = ?,`UserRole` = ?,`ParentAId` = ?,`UAStatus` = ?,`deadline` = ?,`linkImage` = ? WHERE `AId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Activity value) {
        stmt.bindLong(1, value.getId());
        if (value.getCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getType());
        }
        if (value.getDesc() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDesc());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getStartTime());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp);
        }
        final Long _tmp_1;
        _tmp_1 = __converters.dateToTimestamp(value.getFinishTime());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp_1);
        }
        if (value.getPlace() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPlace());
        }
        if (value.getGId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getGId());
        }
        if (value.getGName() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getGName());
        }
        if (value.getData() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getData());
        }
        if (value.getCreateDate() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getCreateDate());
        }
        if (value.getCreateUser() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getCreateUser());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getStatus());
        }
        if (value.getRefId() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getRefId());
        }
        if (value.getAGId() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindLong(16, value.getAGId());
        }
        if (value.getAGDesc() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getAGDesc());
        }
        if (value.getUserRole() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindLong(18, value.getUserRole());
        }
        if (value.getParentAId() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindLong(19, value.getParentAId());
        }
        if (value.getUAStatus() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindLong(20, value.getUAStatus());
        }
        final Long _tmp_2;
        _tmp_2 = __converters.dateToTimestamp(value.getDeadline());
        if (_tmp_2 == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindLong(21, _tmp_2);
        }
        if (value.getLinkImage() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getLinkImage());
        }
        stmt.bindLong(23, value.getId());
      }
    };
    this.__preparedStmtOfUpdateStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE Activity SET UAStatus = ? WHERE AId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Activity";
        return _query;
      }
    };
  }

  @Override
  public long insert(Activity activity) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfActivity.insertAndReturnId(activity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<Activity> activitys) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfActivity.insert(activitys);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Activity activity) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfActivity.handle(activity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(Activity activity) {
    __db.beginTransaction();
    try {
      __updateAdapterOfActivity.handle(activity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateStatus(int status, int id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateStatus.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, status);
      _argIndex = 2;
      _stmt.bindLong(_argIndex, id);
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateStatus.release(_stmt);
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public DataSource.Factory<Integer, Activity> getAll() {
    final String _sql = "SELECT * FROM Activity ORDER BY StartTime ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, Activity>() {
      @Override
      public LimitOffsetDataSource<Activity> create() {
        return new LimitOffsetDataSource<Activity>(__db, _statement, false , "Activity") {
          @Override
          protected List<Activity> convertRows(Cursor cursor) {
            final List<Activity> _res = new ArrayList<Activity>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Activity _item;
              _item = __entityCursorConverter_comEmglabQlsvModelsEntityActivity(cursor);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public LiveData<List<Activity>> getAll2(int uaStatus) {
    final String _sql = "SELECT * FROM Activity where UAStatus != ? ORDER BY StartTime ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, uaStatus);
    return new ComputableLiveData<List<Activity>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<Activity> compute() {
        if (_observer == null) {
          _observer = new Observer("Activity") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<Activity> _result = new ArrayList<Activity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Activity _item;
            _item = __entityCursorConverter_comEmglabQlsvModelsEntityActivity(_cursor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<Activity>> getActiviyByCIdFromRoom(int CId) {
    final String _sql = "SELECT * FROM UserCriteriaActivity uca inner join Activity a on a.AId = uca.AId where uca.CId =? ORDER BY AName DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, CId);
    return new ComputableLiveData<List<Activity>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<Activity> compute() {
        if (_observer == null) {
          _observer = new Observer("UserCriteriaActivity","Activity") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<Activity> _result = new ArrayList<Activity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Activity _item;
            _item = __entityCursorConverter_comEmglabQlsvModelsEntityActivity(_cursor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<Activity> getActivityDetail(int AId) {
    final String _sql = "SELECT * FROM Activity where AId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, AId);
    return new ComputableLiveData<Activity>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected Activity compute() {
        if (_observer == null) {
          _observer = new Observer("Activity") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final Activity _result;
          if(_cursor.moveToFirst()) {
            _result = __entityCursorConverter_comEmglabQlsvModelsEntityActivity(_cursor);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  private Activity __entityCursorConverter_comEmglabQlsvModelsEntityActivity(Cursor cursor) {
    final Activity _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("AId");
    final int _cursorIndexOfCode = cursor.getColumnIndex("ACode");
    final int _cursorIndexOfName = cursor.getColumnIndex("AName");
    final int _cursorIndexOfType = cursor.getColumnIndex("AType");
    final int _cursorIndexOfDesc = cursor.getColumnIndex("ADesc");
    final int _cursorIndexOfStartTime = cursor.getColumnIndex("StartTime");
    final int _cursorIndexOfFinishTime = cursor.getColumnIndex("FinishTime");
    final int _cursorIndexOfPlace = cursor.getColumnIndex("APlace");
    final int _cursorIndexOfGId = cursor.getColumnIndex("GId");
    final int _cursorIndexOfGName = cursor.getColumnIndex("GName");
    final int _cursorIndexOfData = cursor.getColumnIndex("Data");
    final int _cursorIndexOfCreateDate = cursor.getColumnIndex("CreateDate");
    final int _cursorIndexOfCreateUser = cursor.getColumnIndex("CreateUser");
    final int _cursorIndexOfStatus = cursor.getColumnIndex("AStatus");
    final int _cursorIndexOfRefId = cursor.getColumnIndex("ARefId");
    final int _cursorIndexOfAGId = cursor.getColumnIndex("AGId");
    final int _cursorIndexOfAGDesc = cursor.getColumnIndex("AGDesc");
    final int _cursorIndexOfUserRole = cursor.getColumnIndex("UserRole");
    final int _cursorIndexOfParentAId = cursor.getColumnIndex("ParentAId");
    final int _cursorIndexOfUAStatus = cursor.getColumnIndex("UAStatus");
    final int _cursorIndexOfDeadline = cursor.getColumnIndex("deadline");
    final int _cursorIndexOfLinkImage = cursor.getColumnIndex("linkImage");
    _entity = new Activity();
    if (_cursorIndexOfId != -1) {
      final int _tmpId;
      _tmpId = cursor.getInt(_cursorIndexOfId);
      _entity.setId(_tmpId);
    }
    if (_cursorIndexOfCode != -1) {
      final String _tmpCode;
      _tmpCode = cursor.getString(_cursorIndexOfCode);
      _entity.setCode(_tmpCode);
    }
    if (_cursorIndexOfName != -1) {
      final String _tmpName;
      _tmpName = cursor.getString(_cursorIndexOfName);
      _entity.setName(_tmpName);
    }
    if (_cursorIndexOfType != -1) {
      final String _tmpType;
      _tmpType = cursor.getString(_cursorIndexOfType);
      _entity.setType(_tmpType);
    }
    if (_cursorIndexOfDesc != -1) {
      final String _tmpDesc;
      _tmpDesc = cursor.getString(_cursorIndexOfDesc);
      _entity.setDesc(_tmpDesc);
    }
    if (_cursorIndexOfStartTime != -1) {
      final Date _tmpStartTime;
      final Long _tmp;
      if (cursor.isNull(_cursorIndexOfStartTime)) {
        _tmp = null;
      } else {
        _tmp = cursor.getLong(_cursorIndexOfStartTime);
      }
      _tmpStartTime = __converters.fromTimestamp(_tmp);
      _entity.setStartTime(_tmpStartTime);
    }
    if (_cursorIndexOfFinishTime != -1) {
      final Date _tmpFinishTime;
      final Long _tmp_1;
      if (cursor.isNull(_cursorIndexOfFinishTime)) {
        _tmp_1 = null;
      } else {
        _tmp_1 = cursor.getLong(_cursorIndexOfFinishTime);
      }
      _tmpFinishTime = __converters.fromTimestamp(_tmp_1);
      _entity.setFinishTime(_tmpFinishTime);
    }
    if (_cursorIndexOfPlace != -1) {
      final String _tmpPlace;
      _tmpPlace = cursor.getString(_cursorIndexOfPlace);
      _entity.setPlace(_tmpPlace);
    }
    if (_cursorIndexOfGId != -1) {
      final Integer _tmpGId;
      if (cursor.isNull(_cursorIndexOfGId)) {
        _tmpGId = null;
      } else {
        _tmpGId = cursor.getInt(_cursorIndexOfGId);
      }
      _entity.setGId(_tmpGId);
    }
    if (_cursorIndexOfGName != -1) {
      final String _tmpGName;
      _tmpGName = cursor.getString(_cursorIndexOfGName);
      _entity.setGName(_tmpGName);
    }
    if (_cursorIndexOfData != -1) {
      final String _tmpData;
      _tmpData = cursor.getString(_cursorIndexOfData);
      _entity.setData(_tmpData);
    }
    if (_cursorIndexOfCreateDate != -1) {
      final String _tmpCreateDate;
      _tmpCreateDate = cursor.getString(_cursorIndexOfCreateDate);
      _entity.setCreateDate(_tmpCreateDate);
    }
    if (_cursorIndexOfCreateUser != -1) {
      final String _tmpCreateUser;
      _tmpCreateUser = cursor.getString(_cursorIndexOfCreateUser);
      _entity.setCreateUser(_tmpCreateUser);
    }
    if (_cursorIndexOfStatus != -1) {
      final Integer _tmpStatus;
      if (cursor.isNull(_cursorIndexOfStatus)) {
        _tmpStatus = null;
      } else {
        _tmpStatus = cursor.getInt(_cursorIndexOfStatus);
      }
      _entity.setStatus(_tmpStatus);
    }
    if (_cursorIndexOfRefId != -1) {
      final String _tmpRefId;
      _tmpRefId = cursor.getString(_cursorIndexOfRefId);
      _entity.setRefId(_tmpRefId);
    }
    if (_cursorIndexOfAGId != -1) {
      final Integer _tmpAGId;
      if (cursor.isNull(_cursorIndexOfAGId)) {
        _tmpAGId = null;
      } else {
        _tmpAGId = cursor.getInt(_cursorIndexOfAGId);
      }
      _entity.setAGId(_tmpAGId);
    }
    if (_cursorIndexOfAGDesc != -1) {
      final String _tmpAGDesc;
      _tmpAGDesc = cursor.getString(_cursorIndexOfAGDesc);
      _entity.setAGDesc(_tmpAGDesc);
    }
    if (_cursorIndexOfUserRole != -1) {
      final Integer _tmpUserRole;
      if (cursor.isNull(_cursorIndexOfUserRole)) {
        _tmpUserRole = null;
      } else {
        _tmpUserRole = cursor.getInt(_cursorIndexOfUserRole);
      }
      _entity.setUserRole(_tmpUserRole);
    }
    if (_cursorIndexOfParentAId != -1) {
      final Integer _tmpParentAId;
      if (cursor.isNull(_cursorIndexOfParentAId)) {
        _tmpParentAId = null;
      } else {
        _tmpParentAId = cursor.getInt(_cursorIndexOfParentAId);
      }
      _entity.setParentAId(_tmpParentAId);
    }
    if (_cursorIndexOfUAStatus != -1) {
      final Integer _tmpUAStatus;
      if (cursor.isNull(_cursorIndexOfUAStatus)) {
        _tmpUAStatus = null;
      } else {
        _tmpUAStatus = cursor.getInt(_cursorIndexOfUAStatus);
      }
      _entity.setUAStatus(_tmpUAStatus);
    }
    if (_cursorIndexOfDeadline != -1) {
      final Date _tmpDeadline;
      final Long _tmp_2;
      if (cursor.isNull(_cursorIndexOfDeadline)) {
        _tmp_2 = null;
      } else {
        _tmp_2 = cursor.getLong(_cursorIndexOfDeadline);
      }
      _tmpDeadline = __converters.fromTimestamp(_tmp_2);
      _entity.setDeadline(_tmpDeadline);
    }
    if (_cursorIndexOfLinkImage != -1) {
      final String _tmpLinkImage;
      _tmpLinkImage = cursor.getString(_cursorIndexOfLinkImage);
      _entity.setLinkImage(_tmpLinkImage);
    }
    return _entity;
  }
}
