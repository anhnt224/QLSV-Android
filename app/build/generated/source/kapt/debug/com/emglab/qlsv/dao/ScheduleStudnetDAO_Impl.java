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
import com.emglab.qlsv.models.entity.ScheduleStudent;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class ScheduleStudnetDAO_Impl implements ScheduleStudnetDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfScheduleStudent;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfScheduleStudent;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfScheduleStudent;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ScheduleStudnetDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfScheduleStudent = new EntityInsertionAdapter<ScheduleStudent>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ScheduleStudent`(`UUID`,`SubjectId`,`SubjectName`,`ClassID`,`TimeStart`,`TimeEnd`,`Week`,`Type`,`TypeSubject`,`Tower`,`Room`,`DayOfWeek`,`Description`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ScheduleStudent value) {
        if (value.getUuid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUuid());
        }
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getClassId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getClassId());
        }
        if (value.getTimeStart() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTimeStart());
        }
        if (value.getTimeEnd() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTimeEnd());
        }
        if (value.getWeek() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getWeek());
        }
        if (value.getType() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getType());
        }
        if (value.getTypeSubject() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTypeSubject());
        }
        if (value.getTower() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getTower());
        }
        if (value.getRoom() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getRoom());
        }
        if (value.getDayOfWeek() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getDayOfWeek());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getDescription());
        }
      }
    };
    this.__deletionAdapterOfScheduleStudent = new EntityDeletionOrUpdateAdapter<ScheduleStudent>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ScheduleStudent` WHERE `UUID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ScheduleStudent value) {
        if (value.getUuid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUuid());
        }
      }
    };
    this.__updateAdapterOfScheduleStudent = new EntityDeletionOrUpdateAdapter<ScheduleStudent>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `ScheduleStudent` SET `UUID` = ?,`SubjectId` = ?,`SubjectName` = ?,`ClassID` = ?,`TimeStart` = ?,`TimeEnd` = ?,`Week` = ?,`Type` = ?,`TypeSubject` = ?,`Tower` = ?,`Room` = ?,`DayOfWeek` = ?,`Description` = ? WHERE `UUID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ScheduleStudent value) {
        if (value.getUuid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUuid());
        }
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getClassId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getClassId());
        }
        if (value.getTimeStart() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTimeStart());
        }
        if (value.getTimeEnd() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTimeEnd());
        }
        if (value.getWeek() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getWeek());
        }
        if (value.getType() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getType());
        }
        if (value.getTypeSubject() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTypeSubject());
        }
        if (value.getTower() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getTower());
        }
        if (value.getRoom() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getRoom());
        }
        if (value.getDayOfWeek() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getDayOfWeek());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getDescription());
        }
        if (value.getUuid() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getUuid());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ScheduleStudent";
        return _query;
      }
    };
  }

  @Override
  public long insert(ScheduleStudent scheduleStudent) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfScheduleStudent.insertAndReturnId(scheduleStudent);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<ScheduleStudent> scheduleStudents) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfScheduleStudent.insert(scheduleStudents);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(ScheduleStudent scheduleStudent) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfScheduleStudent.handle(scheduleStudent);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(ScheduleStudent scheduleStudent) {
    __db.beginTransaction();
    try {
      __updateAdapterOfScheduleStudent.handle(scheduleStudent);
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
  public LiveData<List<ScheduleStudent>> getAll() {
    final String _sql = "SELECT * FROM ScheduleStudent";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<ScheduleStudent>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<ScheduleStudent> compute() {
        if (_observer == null) {
          _observer = new Observer("ScheduleStudent") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<ScheduleStudent> _result = new ArrayList<ScheduleStudent>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ScheduleStudent _item;
            _item = __entityCursorConverter_comEmglabQlsvModelsEntityScheduleStudent(_cursor);
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

  private ScheduleStudent __entityCursorConverter_comEmglabQlsvModelsEntityScheduleStudent(
      Cursor cursor) {
    final ScheduleStudent _entity;
    final int _cursorIndexOfUuid = cursor.getColumnIndex("UUID");
    final int _cursorIndexOfId = cursor.getColumnIndex("SubjectId");
    final int _cursorIndexOfName = cursor.getColumnIndex("SubjectName");
    final int _cursorIndexOfClassId = cursor.getColumnIndex("ClassID");
    final int _cursorIndexOfTimeStart = cursor.getColumnIndex("TimeStart");
    final int _cursorIndexOfTimeEnd = cursor.getColumnIndex("TimeEnd");
    final int _cursorIndexOfWeek = cursor.getColumnIndex("Week");
    final int _cursorIndexOfType = cursor.getColumnIndex("Type");
    final int _cursorIndexOfTypeSubject = cursor.getColumnIndex("TypeSubject");
    final int _cursorIndexOfTower = cursor.getColumnIndex("Tower");
    final int _cursorIndexOfRoom = cursor.getColumnIndex("Room");
    final int _cursorIndexOfDayOfWeek = cursor.getColumnIndex("DayOfWeek");
    final int _cursorIndexOfDescription = cursor.getColumnIndex("Description");
    _entity = new ScheduleStudent();
    if (_cursorIndexOfUuid != -1) {
      final String _tmpUuid;
      _tmpUuid = cursor.getString(_cursorIndexOfUuid);
      _entity.setUuid(_tmpUuid);
    }
    if (_cursorIndexOfId != -1) {
      final String _tmpId;
      _tmpId = cursor.getString(_cursorIndexOfId);
      _entity.setId(_tmpId);
    }
    if (_cursorIndexOfName != -1) {
      final String _tmpName;
      _tmpName = cursor.getString(_cursorIndexOfName);
      _entity.setName(_tmpName);
    }
    if (_cursorIndexOfClassId != -1) {
      final String _tmpClassId;
      _tmpClassId = cursor.getString(_cursorIndexOfClassId);
      _entity.setClassId(_tmpClassId);
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
    if (_cursorIndexOfTypeSubject != -1) {
      final String _tmpTypeSubject;
      _tmpTypeSubject = cursor.getString(_cursorIndexOfTypeSubject);
      _entity.setTypeSubject(_tmpTypeSubject);
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
    if (_cursorIndexOfDescription != -1) {
      final String _tmpDescription;
      _tmpDescription = cursor.getString(_cursorIndexOfDescription);
      _entity.setDescription(_tmpDescription);
    }
    return _entity;
  }
}
