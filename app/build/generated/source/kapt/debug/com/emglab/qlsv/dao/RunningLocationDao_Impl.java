package com.emglab.qlsv.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.emglab.qlsv.models.entity.run.RunningLocation;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class RunningLocationDao_Impl implements RunningLocationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfRunningLocation;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public RunningLocationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRunningLocation = new EntityInsertionAdapter<RunningLocation>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `RunningLocation`(`id`,`latitude`,`longitude`,`wayID`,`index`,`timeUpdated`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RunningLocation value) {
        stmt.bindLong(1, value.getId());
        stmt.bindDouble(2, value.getLatitude());
        stmt.bindDouble(3, value.getLongitude());
        if (value.getWayID() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getWayID());
        }
        stmt.bindLong(5, value.getIndex());
        stmt.bindLong(6, value.getTimeUpdated());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM RunningLocation";
        return _query;
      }
    };
  }

  @Override
  public void insert(RunningLocation runningLocation) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfRunningLocation.insert(runningLocation);
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
  public List<RunningLocation> getRunningLocations(String wayID) {
    final String _sql = "SELECT * FROM RunningLocation WHERE wayID == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (wayID == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, wayID);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final List<RunningLocation> _result = new ArrayList<RunningLocation>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RunningLocation _item;
        _item = __entityCursorConverter_comEmglabQlsvModelsEntityRunRunningLocation(_cursor);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  private RunningLocation __entityCursorConverter_comEmglabQlsvModelsEntityRunRunningLocation(
      Cursor cursor) {
    final RunningLocation _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("id");
    final int _cursorIndexOfLatitude = cursor.getColumnIndex("latitude");
    final int _cursorIndexOfLongitude = cursor.getColumnIndex("longitude");
    final int _cursorIndexOfWayID = cursor.getColumnIndex("wayID");
    final int _cursorIndexOfIndex = cursor.getColumnIndex("index");
    final int _cursorIndexOfTimeUpdated = cursor.getColumnIndex("timeUpdated");
    _entity = new RunningLocation();
    if (_cursorIndexOfId != -1) {
      final int _tmpId;
      _tmpId = cursor.getInt(_cursorIndexOfId);
      _entity.setId(_tmpId);
    }
    if (_cursorIndexOfLatitude != -1) {
      final double _tmpLatitude;
      _tmpLatitude = cursor.getDouble(_cursorIndexOfLatitude);
      _entity.setLatitude(_tmpLatitude);
    }
    if (_cursorIndexOfLongitude != -1) {
      final double _tmpLongitude;
      _tmpLongitude = cursor.getDouble(_cursorIndexOfLongitude);
      _entity.setLongitude(_tmpLongitude);
    }
    if (_cursorIndexOfWayID != -1) {
      final String _tmpWayID;
      _tmpWayID = cursor.getString(_cursorIndexOfWayID);
      _entity.setWayID(_tmpWayID);
    }
    if (_cursorIndexOfIndex != -1) {
      final int _tmpIndex;
      _tmpIndex = cursor.getInt(_cursorIndexOfIndex);
      _entity.setIndex(_tmpIndex);
    }
    if (_cursorIndexOfTimeUpdated != -1) {
      final long _tmpTimeUpdated;
      _tmpTimeUpdated = cursor.getLong(_cursorIndexOfTimeUpdated);
      _entity.setTimeUpdated(_tmpTimeUpdated);
    }
    return _entity;
  }
}
