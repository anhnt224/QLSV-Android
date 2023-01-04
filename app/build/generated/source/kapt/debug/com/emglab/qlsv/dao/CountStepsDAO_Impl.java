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
import com.emglab.qlsv.models.entity.CountSteps;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class CountStepsDAO_Impl implements CountStepsDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCountSteps;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCountSteps;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public CountStepsDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCountSteps = new EntityInsertionAdapter<CountSteps>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `countSteps`(`id`,`steps`,`timer`,`date`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CountSteps value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        stmt.bindLong(2, value.getSteps());
        if (value.getTimer() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTimer());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
      }
    };
    this.__deletionAdapterOfCountSteps = new EntityDeletionOrUpdateAdapter<CountSteps>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `countSteps` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CountSteps value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM countSteps";
        return _query;
      }
    };
  }

  @Override
  public long insert(CountSteps countSteps) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfCountSteps.insertAndReturnId(countSteps);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<CountSteps> activitys) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCountSteps.insert(activitys);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(CountSteps countSteps) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfCountSteps.handle(countSteps);
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
  public LiveData<List<CountSteps>> getAllCountSteps() {
    final String _sql = "SELECT * FROM countSteps ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<CountSteps>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<CountSteps> compute() {
        if (_observer == null) {
          _observer = new Observer("countSteps") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<CountSteps> _result = new ArrayList<CountSteps>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CountSteps _item;
            _item = __entityCursorConverter_comEmglabQlsvModelsEntityCountSteps(_cursor);
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
  public LiveData<CountSteps> getCountSteps(String mId) {
    final String _sql = "SELECT * FROM countSteps WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (mId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, mId);
    }
    return new ComputableLiveData<CountSteps>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected CountSteps compute() {
        if (_observer == null) {
          _observer = new Observer("countSteps") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final CountSteps _result;
          if(_cursor.moveToFirst()) {
            _result = __entityCursorConverter_comEmglabQlsvModelsEntityCountSteps(_cursor);
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

  private CountSteps __entityCursorConverter_comEmglabQlsvModelsEntityCountSteps(Cursor cursor) {
    final CountSteps _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("id");
    final int _cursorIndexOfSteps = cursor.getColumnIndex("steps");
    final int _cursorIndexOfTimer = cursor.getColumnIndex("timer");
    final int _cursorIndexOfDate = cursor.getColumnIndex("date");
    _entity = new CountSteps();
    if (_cursorIndexOfId != -1) {
      final String _tmpId;
      _tmpId = cursor.getString(_cursorIndexOfId);
      _entity.setId(_tmpId);
    }
    if (_cursorIndexOfSteps != -1) {
      final int _tmpSteps;
      _tmpSteps = cursor.getInt(_cursorIndexOfSteps);
      _entity.setSteps(_tmpSteps);
    }
    if (_cursorIndexOfTimer != -1) {
      final String _tmpTimer;
      _tmpTimer = cursor.getString(_cursorIndexOfTimer);
      _entity.setTimer(_tmpTimer);
    }
    if (_cursorIndexOfDate != -1) {
      final Date _tmpDate;
      final Long _tmp;
      if (cursor.isNull(_cursorIndexOfDate)) {
        _tmp = null;
      } else {
        _tmp = cursor.getLong(_cursorIndexOfDate);
      }
      _tmpDate = __converters.fromTimestamp(_tmp);
      _entity.setDate(_tmpDate);
    }
    return _entity;
  }
}
