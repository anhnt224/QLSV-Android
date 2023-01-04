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
import androidx.sqlite.db.SupportSQLiteStatement;
import com.emglab.qlsv.Converters;
import com.emglab.qlsv.models.entity.UserCriteriaPoint;
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
public final class UserCriteriaPointDAO_Impl implements UserCriteriaPointDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserCriteriaPoint;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUserCriteriaPoint;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUserCriteriaPoint;

  public UserCriteriaPointDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserCriteriaPoint = new EntityInsertionAdapter<UserCriteriaPoint>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UserCriteriaPoint`(`UCPId`,`CId`,`CreateUser`,`CreateDate`,`UCPDesc`,`UCPoint`,`Semester`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCriteriaPoint value) {
        stmt.bindLong(1, value.getUcpId());
        stmt.bindLong(2, value.getCId());
        if (value.getCreateUser() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCreateUser());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getCreateDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        if (value.getUcpDesc() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUcpDesc());
        }
        if (value.getUcPoint() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getUcPoint());
        }
        if (value.getSemester() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSemester());
        }
      }
    };
    this.__deletionAdapterOfUserCriteriaPoint = new EntityDeletionOrUpdateAdapter<UserCriteriaPoint>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `UserCriteriaPoint` WHERE `UCPId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCriteriaPoint value) {
        stmt.bindLong(1, value.getUcpId());
      }
    };
    this.__updateAdapterOfUserCriteriaPoint = new EntityDeletionOrUpdateAdapter<UserCriteriaPoint>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `UserCriteriaPoint` SET `UCPId` = ?,`CId` = ?,`CreateUser` = ?,`CreateDate` = ?,`UCPDesc` = ?,`UCPoint` = ?,`Semester` = ? WHERE `UCPId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCriteriaPoint value) {
        stmt.bindLong(1, value.getUcpId());
        stmt.bindLong(2, value.getCId());
        if (value.getCreateUser() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCreateUser());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getCreateDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        if (value.getUcpDesc() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUcpDesc());
        }
        if (value.getUcPoint() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getUcPoint());
        }
        if (value.getSemester() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSemester());
        }
        stmt.bindLong(8, value.getUcpId());
      }
    };
  }

  @Override
  public long insert(UserCriteriaPoint userCriteriaPoint) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUserCriteriaPoint.insertAndReturnId(userCriteriaPoint);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<UserCriteriaPoint> userCriteriaPoints) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserCriteriaPoint.insert(userCriteriaPoints);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(UserCriteriaPoint userCriteriaPoint) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserCriteriaPoint.handle(userCriteriaPoint);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(UserCriteriaPoint userCriteriaPoint) {
    __db.beginTransaction();
    try {
      __updateAdapterOfUserCriteriaPoint.handle(userCriteriaPoint);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<UserCriteriaPoint>> getUserCriteriaPointByCIdFromRoom(int CId) {
    final String _sql = "SELECT * FROM UserCriteriaPoint  where CId =? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, CId);
    return new ComputableLiveData<List<UserCriteriaPoint>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<UserCriteriaPoint> compute() {
        if (_observer == null) {
          _observer = new Observer("UserCriteriaPoint") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<UserCriteriaPoint> _result = new ArrayList<UserCriteriaPoint>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserCriteriaPoint _item;
            _item = __entityCursorConverter_comEmglabQlsvModelsEntityUserCriteriaPoint(_cursor);
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

  private UserCriteriaPoint __entityCursorConverter_comEmglabQlsvModelsEntityUserCriteriaPoint(
      Cursor cursor) {
    final UserCriteriaPoint _entity;
    final int _cursorIndexOfUcpId = cursor.getColumnIndex("UCPId");
    final int _cursorIndexOfCId = cursor.getColumnIndex("CId");
    final int _cursorIndexOfCreateUser = cursor.getColumnIndex("CreateUser");
    final int _cursorIndexOfCreateDate = cursor.getColumnIndex("CreateDate");
    final int _cursorIndexOfUcpDesc = cursor.getColumnIndex("UCPDesc");
    final int _cursorIndexOfUcPoint = cursor.getColumnIndex("UCPoint");
    final int _cursorIndexOfSemester = cursor.getColumnIndex("Semester");
    _entity = new UserCriteriaPoint();
    if (_cursorIndexOfUcpId != -1) {
      final int _tmpUcpId;
      _tmpUcpId = cursor.getInt(_cursorIndexOfUcpId);
      _entity.setUcpId(_tmpUcpId);
    }
    if (_cursorIndexOfCId != -1) {
      final int _tmpCId;
      _tmpCId = cursor.getInt(_cursorIndexOfCId);
      _entity.setCId(_tmpCId);
    }
    if (_cursorIndexOfCreateUser != -1) {
      final String _tmpCreateUser;
      _tmpCreateUser = cursor.getString(_cursorIndexOfCreateUser);
      _entity.setCreateUser(_tmpCreateUser);
    }
    if (_cursorIndexOfCreateDate != -1) {
      final Date _tmpCreateDate;
      final Long _tmp;
      if (cursor.isNull(_cursorIndexOfCreateDate)) {
        _tmp = null;
      } else {
        _tmp = cursor.getLong(_cursorIndexOfCreateDate);
      }
      _tmpCreateDate = __converters.fromTimestamp(_tmp);
      _entity.setCreateDate(_tmpCreateDate);
    }
    if (_cursorIndexOfUcpDesc != -1) {
      final String _tmpUcpDesc;
      _tmpUcpDesc = cursor.getString(_cursorIndexOfUcpDesc);
      _entity.setUcpDesc(_tmpUcpDesc);
    }
    if (_cursorIndexOfUcPoint != -1) {
      final Integer _tmpUcPoint;
      if (cursor.isNull(_cursorIndexOfUcPoint)) {
        _tmpUcPoint = null;
      } else {
        _tmpUcPoint = cursor.getInt(_cursorIndexOfUcPoint);
      }
      _entity.setUcPoint(_tmpUcPoint);
    }
    if (_cursorIndexOfSemester != -1) {
      final String _tmpSemester;
      _tmpSemester = cursor.getString(_cursorIndexOfSemester);
      _entity.setSemester(_tmpSemester);
    }
    return _entity;
  }
}
