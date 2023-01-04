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
import com.emglab.qlsv.models.entity.SVGroup;
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
public final class SVGroupDAO_Impl implements SVGroupDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfSVGroup;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfSVGroup;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfSVGroup;

  public SVGroupDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSVGroup = new EntityInsertionAdapter<SVGroup>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SVGroup`(`ParentGId`,`GId`,`GCode`,`GName`,`GType`,`StartTime`,`FinishTime`,`CreateDate`,`CreateUser`,`GStatus`,`GRefId`,`GCriteriaLst`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SVGroup value) {
        if (value.getParentGId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getParentGId());
        }
        stmt.bindLong(2, value.getGId());
        if (value.getGCode() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGCode());
        }
        if (value.getGName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getGName());
        }
        if (value.getGType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGType());
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
        final Long _tmp_2;
        _tmp_2 = __converters.dateToTimestamp(value.getCreateDate());
        if (_tmp_2 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, _tmp_2);
        }
        if (value.getCreateUser() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getCreateUser());
        }
        if (value.getGStatus() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getGStatus());
        }
        if (value.getGRefId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getGRefId());
        }
        if (value.getGCriteriaLst() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getGCriteriaLst());
        }
      }
    };
    this.__deletionAdapterOfSVGroup = new EntityDeletionOrUpdateAdapter<SVGroup>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `SVGroup` WHERE `GId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SVGroup value) {
        stmt.bindLong(1, value.getGId());
      }
    };
    this.__updateAdapterOfSVGroup = new EntityDeletionOrUpdateAdapter<SVGroup>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `SVGroup` SET `ParentGId` = ?,`GId` = ?,`GCode` = ?,`GName` = ?,`GType` = ?,`StartTime` = ?,`FinishTime` = ?,`CreateDate` = ?,`CreateUser` = ?,`GStatus` = ?,`GRefId` = ?,`GCriteriaLst` = ? WHERE `GId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SVGroup value) {
        if (value.getParentGId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getParentGId());
        }
        stmt.bindLong(2, value.getGId());
        if (value.getGCode() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGCode());
        }
        if (value.getGName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getGName());
        }
        if (value.getGType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGType());
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
        final Long _tmp_2;
        _tmp_2 = __converters.dateToTimestamp(value.getCreateDate());
        if (_tmp_2 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, _tmp_2);
        }
        if (value.getCreateUser() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getCreateUser());
        }
        if (value.getGStatus() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getGStatus());
        }
        if (value.getGRefId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getGRefId());
        }
        if (value.getGCriteriaLst() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getGCriteriaLst());
        }
        stmt.bindLong(13, value.getGId());
      }
    };
  }

  @Override
  public long insert(SVGroup svGroup) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfSVGroup.insertAndReturnId(svGroup);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<SVGroup> svGroups) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfSVGroup.insert(svGroups);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(SVGroup svGroup) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfSVGroup.handle(svGroup);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(SVGroup svGroup) {
    __db.beginTransaction();
    try {
      __updateAdapterOfSVGroup.handle(svGroup);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<SVGroup>> getAll() {
    final String _sql = "SELECT * FROM SVGroup ORDER BY GName ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<SVGroup>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<SVGroup> compute() {
        if (_observer == null) {
          _observer = new Observer("SVGroup") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<SVGroup> _result = new ArrayList<SVGroup>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SVGroup _item;
            _item = __entityCursorConverter_comEmglabQlsvModelsEntitySVGroup(_cursor);
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

  private SVGroup __entityCursorConverter_comEmglabQlsvModelsEntitySVGroup(Cursor cursor) {
    final SVGroup _entity;
    final int _cursorIndexOfParentGId = cursor.getColumnIndex("ParentGId");
    final int _cursorIndexOfGId = cursor.getColumnIndex("GId");
    final int _cursorIndexOfGCode = cursor.getColumnIndex("GCode");
    final int _cursorIndexOfGName = cursor.getColumnIndex("GName");
    final int _cursorIndexOfGType = cursor.getColumnIndex("GType");
    final int _cursorIndexOfStartTime = cursor.getColumnIndex("StartTime");
    final int _cursorIndexOfFinishTime = cursor.getColumnIndex("FinishTime");
    final int _cursorIndexOfCreateDate = cursor.getColumnIndex("CreateDate");
    final int _cursorIndexOfCreateUser = cursor.getColumnIndex("CreateUser");
    final int _cursorIndexOfGStatus = cursor.getColumnIndex("GStatus");
    final int _cursorIndexOfGRefId = cursor.getColumnIndex("GRefId");
    final int _cursorIndexOfGCriteriaLst = cursor.getColumnIndex("GCriteriaLst");
    _entity = new SVGroup();
    if (_cursorIndexOfParentGId != -1) {
      final Integer _tmpParentGId;
      if (cursor.isNull(_cursorIndexOfParentGId)) {
        _tmpParentGId = null;
      } else {
        _tmpParentGId = cursor.getInt(_cursorIndexOfParentGId);
      }
      _entity.setParentGId(_tmpParentGId);
    }
    if (_cursorIndexOfGId != -1) {
      final int _tmpGId;
      _tmpGId = cursor.getInt(_cursorIndexOfGId);
      _entity.setGId(_tmpGId);
    }
    if (_cursorIndexOfGCode != -1) {
      final String _tmpGCode;
      _tmpGCode = cursor.getString(_cursorIndexOfGCode);
      _entity.setGCode(_tmpGCode);
    }
    if (_cursorIndexOfGName != -1) {
      final String _tmpGName;
      _tmpGName = cursor.getString(_cursorIndexOfGName);
      _entity.setGName(_tmpGName);
    }
    if (_cursorIndexOfGType != -1) {
      final String _tmpGType;
      _tmpGType = cursor.getString(_cursorIndexOfGType);
      _entity.setGType(_tmpGType);
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
    if (_cursorIndexOfCreateDate != -1) {
      final Date _tmpCreateDate;
      final Long _tmp_2;
      if (cursor.isNull(_cursorIndexOfCreateDate)) {
        _tmp_2 = null;
      } else {
        _tmp_2 = cursor.getLong(_cursorIndexOfCreateDate);
      }
      _tmpCreateDate = __converters.fromTimestamp(_tmp_2);
      _entity.setCreateDate(_tmpCreateDate);
    }
    if (_cursorIndexOfCreateUser != -1) {
      final String _tmpCreateUser;
      _tmpCreateUser = cursor.getString(_cursorIndexOfCreateUser);
      _entity.setCreateUser(_tmpCreateUser);
    }
    if (_cursorIndexOfGStatus != -1) {
      final Integer _tmpGStatus;
      if (cursor.isNull(_cursorIndexOfGStatus)) {
        _tmpGStatus = null;
      } else {
        _tmpGStatus = cursor.getInt(_cursorIndexOfGStatus);
      }
      _entity.setGStatus(_tmpGStatus);
    }
    if (_cursorIndexOfGRefId != -1) {
      final String _tmpGRefId;
      _tmpGRefId = cursor.getString(_cursorIndexOfGRefId);
      _entity.setGRefId(_tmpGRefId);
    }
    if (_cursorIndexOfGCriteriaLst != -1) {
      final String _tmpGCriteriaLst;
      _tmpGCriteriaLst = cursor.getString(_cursorIndexOfGCriteriaLst);
      _entity.setGCriteriaLst(_tmpGCriteriaLst);
    }
    return _entity;
  }
}
