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
import com.emglab.qlsv.models.entity.WeekNumber;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class WeekNumberDAO_Impl implements WeekNumberDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfWeekNumber;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfWeekNumber;

  public WeekNumberDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeekNumber = new EntityInsertionAdapter<WeekNumber>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `WeekNumber`(`Id`,`StudentName`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeekNumber value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getWeekNumber() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getWeekNumber());
        }
      }
    };
    this.__deletionAdapterOfWeekNumber = new EntityDeletionOrUpdateAdapter<WeekNumber>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `WeekNumber` WHERE `Id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeekNumber value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
  }

  @Override
  public long insert(WeekNumber weekNumber) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfWeekNumber.insertAndReturnId(weekNumber);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(WeekNumber weekNumber) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfWeekNumber.handle(weekNumber);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<WeekNumber> getWeek(String id) {
    final String _sql = "SELECT * FROM WeekNumber where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return new ComputableLiveData<WeekNumber>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected WeekNumber compute() {
        if (_observer == null) {
          _observer = new Observer("WeekNumber") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final WeekNumber _result;
          if(_cursor.moveToFirst()) {
            _result = __entityCursorConverter_comEmglabQlsvModelsEntityWeekNumber(_cursor);
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

  private WeekNumber __entityCursorConverter_comEmglabQlsvModelsEntityWeekNumber(Cursor cursor) {
    final WeekNumber _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("Id");
    final int _cursorIndexOfWeekNumber = cursor.getColumnIndex("StudentName");
    _entity = new WeekNumber();
    if (_cursorIndexOfId != -1) {
      final String _tmpId;
      _tmpId = cursor.getString(_cursorIndexOfId);
      _entity.setId(_tmpId);
    }
    if (_cursorIndexOfWeekNumber != -1) {
      final String _tmpWeekNumber;
      _tmpWeekNumber = cursor.getString(_cursorIndexOfWeekNumber);
      _entity.setWeekNumber(_tmpWeekNumber);
    }
    return _entity;
  }
}
