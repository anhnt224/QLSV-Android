package com.emglab.qlsv.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.emglab.qlsv.models.entity.run.RunningWay;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class RunningWayDao_Impl implements RunningWayDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfRunningWay;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfRunningWay;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public RunningWayDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRunningWay = new EntityInsertionAdapter<RunningWay>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `RunningWay`(`id`,`timeStart`,`timeUpdated`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RunningWay value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        stmt.bindLong(2, value.getTimeStart());
        stmt.bindLong(3, value.getTimeUpdated());
      }
    };
    this.__updateAdapterOfRunningWay = new EntityDeletionOrUpdateAdapter<RunningWay>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `RunningWay` SET `id` = ?,`timeStart` = ?,`timeUpdated` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RunningWay value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        stmt.bindLong(2, value.getTimeStart());
        stmt.bindLong(3, value.getTimeUpdated());
        if (value.getId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM RunningWay";
        return _query;
      }
    };
  }

  @Override
  public void insert(RunningWay runningWay) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfRunningWay.insert(runningWay);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(RunningWay runningWay) {
    __db.beginTransaction();
    try {
      __updateAdapterOfRunningWay.handle(runningWay);
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
  public List<RunningWay> getAll() {
    final String _sql = "SELECT * FROM RunningWay";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final List<RunningWay> _result = new ArrayList<RunningWay>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RunningWay _item;
        _item = __entityCursorConverter_comEmglabQlsvModelsEntityRunRunningWay(_cursor);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  private RunningWay __entityCursorConverter_comEmglabQlsvModelsEntityRunRunningWay(Cursor cursor) {
    final RunningWay _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("id");
    final int _cursorIndexOfTimeStart = cursor.getColumnIndex("timeStart");
    final int _cursorIndexOfTimeUpdated = cursor.getColumnIndex("timeUpdated");
    _entity = new RunningWay();
    if (_cursorIndexOfId != -1) {
      final String _tmpId;
      _tmpId = cursor.getString(_cursorIndexOfId);
      _entity.setId(_tmpId);
    }
    if (_cursorIndexOfTimeStart != -1) {
      final long _tmpTimeStart;
      _tmpTimeStart = cursor.getLong(_cursorIndexOfTimeStart);
      _entity.setTimeStart(_tmpTimeStart);
    }
    if (_cursorIndexOfTimeUpdated != -1) {
      final long _tmpTimeUpdated;
      _tmpTimeUpdated = cursor.getLong(_cursorIndexOfTimeUpdated);
      _entity.setTimeUpdated(_tmpTimeUpdated);
    }
    return _entity;
  }
}
