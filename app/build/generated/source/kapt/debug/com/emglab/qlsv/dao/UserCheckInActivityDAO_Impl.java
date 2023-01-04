package com.emglab.qlsv.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.emglab.qlsv.Converters;
import com.emglab.qlsv.models.entity.UserCheckInActivity;
import java.lang.Double;
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
public final class UserCheckInActivityDAO_Impl implements UserCheckInActivityDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserCheckInActivity;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUserCheckInActivity;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUserCheckInActivity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public UserCheckInActivityDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserCheckInActivity = new EntityInsertionAdapter<UserCheckInActivity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UserCheckInActivity`(`UACId`,`UserName`,`UserCode`,`AId`,`CheckInTime`,`CheckInAddress`,`Longitude`,`Latitude`,`UACStatus`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCheckInActivity value) {
        stmt.bindLong(1, value.getUaCId());
        if (value.getUserName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserName());
        }
        if (value.getUserCode() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUserCode());
        }
        if (value.getAId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getAId());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getCheckInTime());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
        if (value.getCheckInAddress() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCheckInAddress());
        }
        if (value.getLongitude() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getLongitude());
        }
        if (value.getLatitude() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getLatitude());
        }
        if (value.getUaCStatus() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getUaCStatus());
        }
      }
    };
    this.__deletionAdapterOfUserCheckInActivity = new EntityDeletionOrUpdateAdapter<UserCheckInActivity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `UserCheckInActivity` WHERE `UACId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCheckInActivity value) {
        stmt.bindLong(1, value.getUaCId());
      }
    };
    this.__updateAdapterOfUserCheckInActivity = new EntityDeletionOrUpdateAdapter<UserCheckInActivity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `UserCheckInActivity` SET `UACId` = ?,`UserName` = ?,`UserCode` = ?,`AId` = ?,`CheckInTime` = ?,`CheckInAddress` = ?,`Longitude` = ?,`Latitude` = ?,`UACStatus` = ? WHERE `UACId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCheckInActivity value) {
        stmt.bindLong(1, value.getUaCId());
        if (value.getUserName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserName());
        }
        if (value.getUserCode() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUserCode());
        }
        if (value.getAId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getAId());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getCheckInTime());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
        if (value.getCheckInAddress() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCheckInAddress());
        }
        if (value.getLongitude() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getLongitude());
        }
        if (value.getLatitude() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getLatitude());
        }
        if (value.getUaCStatus() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getUaCStatus());
        }
        stmt.bindLong(10, value.getUaCId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM UserCheckInActivity";
        return _query;
      }
    };
  }

  @Override
  public long insert(UserCheckInActivity userCheckInActivity) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUserCheckInActivity.insertAndReturnId(userCheckInActivity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<UserCheckInActivity> userCheckInActivies) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserCheckInActivity.insert(userCheckInActivies);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(UserCheckInActivity userCheckInActivity) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserCheckInActivity.handle(userCheckInActivity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(UserCheckInActivity userCheckInActivity) {
    __db.beginTransaction();
    try {
      __updateAdapterOfUserCheckInActivity.handle(userCheckInActivity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
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
  public LiveData<List<UserCheckInActivity>> getByAIdAndUserName(int aId, String userName) {
    final String _sql = "SELECT * FROM UserCheckInActivity where AId = ? and UserName = ? ORDER BY CheckInTime ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, aId);
    _argIndex = 2;
    if (userName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userName);
    }
    return new ComputableLiveData<List<UserCheckInActivity>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<UserCheckInActivity> compute() {
        if (_observer == null) {
          _observer = new Observer("UserCheckInActivity") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<UserCheckInActivity> _result = new ArrayList<UserCheckInActivity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserCheckInActivity _item;
            _item = __entityCursorConverter_comEmglabQlsvModelsEntityUserCheckInActivity(_cursor);
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

  private UserCheckInActivity __entityCursorConverter_comEmglabQlsvModelsEntityUserCheckInActivity(
      Cursor cursor) {
    final UserCheckInActivity _entity;
    final int _cursorIndexOfUaCId = cursor.getColumnIndex("UACId");
    final int _cursorIndexOfUserName = cursor.getColumnIndex("UserName");
    final int _cursorIndexOfUserCode = cursor.getColumnIndex("UserCode");
    final int _cursorIndexOfAId = cursor.getColumnIndex("AId");
    final int _cursorIndexOfCheckInTime = cursor.getColumnIndex("CheckInTime");
    final int _cursorIndexOfCheckInAddress = cursor.getColumnIndex("CheckInAddress");
    final int _cursorIndexOfLongitude = cursor.getColumnIndex("Longitude");
    final int _cursorIndexOfLatitude = cursor.getColumnIndex("Latitude");
    final int _cursorIndexOfUaCStatus = cursor.getColumnIndex("UACStatus");
    _entity = new UserCheckInActivity();
    if (_cursorIndexOfUaCId != -1) {
      final int _tmpUaCId;
      _tmpUaCId = cursor.getInt(_cursorIndexOfUaCId);
      _entity.setUaCId(_tmpUaCId);
    }
    if (_cursorIndexOfUserName != -1) {
      final String _tmpUserName;
      _tmpUserName = cursor.getString(_cursorIndexOfUserName);
      _entity.setUserName(_tmpUserName);
    }
    if (_cursorIndexOfUserCode != -1) {
      final String _tmpUserCode;
      _tmpUserCode = cursor.getString(_cursorIndexOfUserCode);
      _entity.setUserCode(_tmpUserCode);
    }
    if (_cursorIndexOfAId != -1) {
      final Integer _tmpAId;
      if (cursor.isNull(_cursorIndexOfAId)) {
        _tmpAId = null;
      } else {
        _tmpAId = cursor.getInt(_cursorIndexOfAId);
      }
      _entity.setAId(_tmpAId);
    }
    if (_cursorIndexOfCheckInTime != -1) {
      final Date _tmpCheckInTime;
      final Long _tmp;
      if (cursor.isNull(_cursorIndexOfCheckInTime)) {
        _tmp = null;
      } else {
        _tmp = cursor.getLong(_cursorIndexOfCheckInTime);
      }
      _tmpCheckInTime = __converters.fromTimestamp(_tmp);
      _entity.setCheckInTime(_tmpCheckInTime);
    }
    if (_cursorIndexOfCheckInAddress != -1) {
      final String _tmpCheckInAddress;
      _tmpCheckInAddress = cursor.getString(_cursorIndexOfCheckInAddress);
      _entity.setCheckInAddress(_tmpCheckInAddress);
    }
    if (_cursorIndexOfLongitude != -1) {
      final Double _tmpLongitude;
      if (cursor.isNull(_cursorIndexOfLongitude)) {
        _tmpLongitude = null;
      } else {
        _tmpLongitude = cursor.getDouble(_cursorIndexOfLongitude);
      }
      _entity.setLongitude(_tmpLongitude);
    }
    if (_cursorIndexOfLatitude != -1) {
      final Double _tmpLatitude;
      if (cursor.isNull(_cursorIndexOfLatitude)) {
        _tmpLatitude = null;
      } else {
        _tmpLatitude = cursor.getDouble(_cursorIndexOfLatitude);
      }
      _entity.setLatitude(_tmpLatitude);
    }
    if (_cursorIndexOfUaCStatus != -1) {
      final Integer _tmpUaCStatus;
      if (cursor.isNull(_cursorIndexOfUaCStatus)) {
        _tmpUaCStatus = null;
      } else {
        _tmpUaCStatus = cursor.getInt(_cursorIndexOfUaCStatus);
      }
      _entity.setUaCStatus(_tmpUaCStatus);
    }
    return _entity;
  }
}
