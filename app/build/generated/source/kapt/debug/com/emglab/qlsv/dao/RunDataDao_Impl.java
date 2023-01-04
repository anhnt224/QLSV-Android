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
import com.emglab.qlsv.models.entity.run.RunData;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class RunDataDao_Impl implements RunDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfRunData;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfRunData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public RunDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRunData = new EntityInsertionAdapter<RunData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `RunData`(`ComIdInRoom`,`ComID`,`ComName`,`WayID`,`UserCode`,`TimeStart`,`TimeEnd`,`Distance`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RunData value) {
        if (value.getComIdInRoom() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getComIdInRoom());
        }
        stmt.bindLong(2, value.getCompetitionID());
        if (value.getCompetitionName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCompetitionName());
        }
        if (value.getWayID() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getWayID());
        }
        if (value.getUserCode() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUserCode());
        }
        if (value.getTimeStart() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTimeStart());
        }
        if (value.getTimeEnd() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTimeEnd());
        }
        stmt.bindDouble(8, value.getDistance());
      }
    };
    this.__deletionAdapterOfRunData = new EntityDeletionOrUpdateAdapter<RunData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `RunData` WHERE `WayID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RunData value) {
        if (value.getWayID() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getWayID());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM RunData";
        return _query;
      }
    };
  }

  @Override
  public void insert(RunData runData) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfRunData.insert(runData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(List<RunData> runDataList) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfRunData.insert(runDataList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(RunData runData) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfRunData.handle(runData);
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
  public LiveData<List<RunData>> getRunResults() {
    final String _sql = "SELECT * FROM RunData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<RunData>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<RunData> compute() {
        if (_observer == null) {
          _observer = new Observer("RunData") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<RunData> _result = new ArrayList<RunData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RunData _item;
            _item = __entityCursorConverter_comEmglabQlsvModelsEntityRunRunData(_cursor);
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

  private RunData __entityCursorConverter_comEmglabQlsvModelsEntityRunRunData(Cursor cursor) {
    final RunData _entity;
    final int _cursorIndexOfComIdInRoom = cursor.getColumnIndex("ComIdInRoom");
    final int _cursorIndexOfCompetitionID = cursor.getColumnIndex("ComID");
    final int _cursorIndexOfCompetitionName = cursor.getColumnIndex("ComName");
    final int _cursorIndexOfWayID = cursor.getColumnIndex("WayID");
    final int _cursorIndexOfUserCode = cursor.getColumnIndex("UserCode");
    final int _cursorIndexOfTimeStart = cursor.getColumnIndex("TimeStart");
    final int _cursorIndexOfTimeEnd = cursor.getColumnIndex("TimeEnd");
    final int _cursorIndexOfDistance = cursor.getColumnIndex("Distance");
    _entity = new RunData();
    if (_cursorIndexOfComIdInRoom != -1) {
      final String _tmpComIdInRoom;
      _tmpComIdInRoom = cursor.getString(_cursorIndexOfComIdInRoom);
      _entity.setComIdInRoom(_tmpComIdInRoom);
    }
    if (_cursorIndexOfCompetitionID != -1) {
      final int _tmpCompetitionID;
      _tmpCompetitionID = cursor.getInt(_cursorIndexOfCompetitionID);
      _entity.setCompetitionID(_tmpCompetitionID);
    }
    if (_cursorIndexOfCompetitionName != -1) {
      final String _tmpCompetitionName;
      _tmpCompetitionName = cursor.getString(_cursorIndexOfCompetitionName);
      _entity.setCompetitionName(_tmpCompetitionName);
    }
    if (_cursorIndexOfWayID != -1) {
      final String _tmpWayID;
      _tmpWayID = cursor.getString(_cursorIndexOfWayID);
      _entity.setWayID(_tmpWayID);
    }
    if (_cursorIndexOfUserCode != -1) {
      final String _tmpUserCode;
      _tmpUserCode = cursor.getString(_cursorIndexOfUserCode);
      _entity.setUserCode(_tmpUserCode);
    }
    if (_cursorIndexOfTimeStart != -1) {
      final String _tmpTimeStart;
      _tmpTimeStart = cursor.getString(_cursorIndexOfTimeStart);
      _entity.setTimeStart(_tmpTimeStart);
    }
    if (_cursorIndexOfTimeEnd != -1) {
      final String _tmpTimeEnd;
      _tmpTimeEnd = cursor.getString(_cursorIndexOfTimeEnd);
      _entity.setTimeEnd(_tmpTimeEnd);
    }
    if (_cursorIndexOfDistance != -1) {
      final double _tmpDistance;
      _tmpDistance = cursor.getDouble(_cursorIndexOfDistance);
      _entity.setDistance(_tmpDistance);
    }
    return _entity;
  }
}
