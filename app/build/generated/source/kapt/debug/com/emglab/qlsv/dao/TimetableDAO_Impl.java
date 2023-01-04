package com.emglab.qlsv.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.emglab.qlsv.models.entity.Subject;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class TimetableDAO_Impl implements TimetableDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfSubject;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public TimetableDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSubject = new EntityInsertionAdapter<Subject>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Timetable`(`id`,`SubjectName`,`ClassID`,`TimeStart`,`TimeEnd`,`Week`,`TypeSubject`,`Tower`,`Room`,`DayOfWeek`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Subject value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getClassID() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getClassID());
        }
        if (value.getTimeStart() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTimeStart());
        }
        if (value.getTimeEnd() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTimeEnd());
        }
        if (value.getWeek() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getWeek());
        }
        if (value.getType() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getType());
        }
        if (value.getTower() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTower());
        }
        if (value.getRoom() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getRoom());
        }
        if (value.getDayOfWeek() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDayOfWeek());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from Timetable";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(List<Subject> subjects) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfSubject.insert(subjects);
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
  public LiveData<List<Subject>> getAll() {
    final String _sql = "select * from Timetable";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Subject>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<Subject> compute() {
        if (_observer == null) {
          _observer = new Observer("Timetable") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<Subject> _result = new ArrayList<Subject>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Subject _item;
            _item = __entityCursorConverter_comEmglabQlsvModelsEntitySubject(_cursor);
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

  private Subject __entityCursorConverter_comEmglabQlsvModelsEntitySubject(Cursor cursor) {
    final Subject _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("id");
    final int _cursorIndexOfName = cursor.getColumnIndex("SubjectName");
    final int _cursorIndexOfClassID = cursor.getColumnIndex("ClassID");
    final int _cursorIndexOfTimeStart = cursor.getColumnIndex("TimeStart");
    final int _cursorIndexOfTimeEnd = cursor.getColumnIndex("TimeEnd");
    final int _cursorIndexOfWeek = cursor.getColumnIndex("Week");
    final int _cursorIndexOfType = cursor.getColumnIndex("TypeSubject");
    final int _cursorIndexOfTower = cursor.getColumnIndex("Tower");
    final int _cursorIndexOfRoom = cursor.getColumnIndex("Room");
    final int _cursorIndexOfDayOfWeek = cursor.getColumnIndex("DayOfWeek");
    _entity = new Subject();
    if (_cursorIndexOfId != -1) {
      final int _tmpId;
      _tmpId = cursor.getInt(_cursorIndexOfId);
      _entity.setId(_tmpId);
    }
    if (_cursorIndexOfName != -1) {
      final String _tmpName;
      _tmpName = cursor.getString(_cursorIndexOfName);
      _entity.setName(_tmpName);
    }
    if (_cursorIndexOfClassID != -1) {
      final String _tmpClassID;
      _tmpClassID = cursor.getString(_cursorIndexOfClassID);
      _entity.setClassID(_tmpClassID);
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
    if (_cursorIndexOfWeek != -1) {
      final String _tmpWeek;
      _tmpWeek = cursor.getString(_cursorIndexOfWeek);
      _entity.setWeek(_tmpWeek);
    }
    if (_cursorIndexOfType != -1) {
      final String _tmpType;
      _tmpType = cursor.getString(_cursorIndexOfType);
      _entity.setType(_tmpType);
    }
    if (_cursorIndexOfTower != -1) {
      final String _tmpTower;
      _tmpTower = cursor.getString(_cursorIndexOfTower);
      _entity.setTower(_tmpTower);
    }
    if (_cursorIndexOfRoom != -1) {
      final String _tmpRoom;
      _tmpRoom = cursor.getString(_cursorIndexOfRoom);
      _entity.setRoom(_tmpRoom);
    }
    if (_cursorIndexOfDayOfWeek != -1) {
      final String _tmpDayOfWeek;
      _tmpDayOfWeek = cursor.getString(_cursorIndexOfDayOfWeek);
      _entity.setDayOfWeek(_tmpDayOfWeek);
    }
    return _entity;
  }
}
