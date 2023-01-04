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
import com.emglab.qlsv.models.entity.User;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class UserDAO_Impl implements UserDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUser;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUser;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUser;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll1;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll2;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll3;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll5;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll6;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll7;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll8;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll9;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll10;

  public UserDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `User`(`StudentId`,`StudentName`,`Birthday`,`UClass`,`Email`,`Sex`,`CMND`,`Faculty`,`Moblie`,`Avatar`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getStudentId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getStudentId());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFullName());
        }
        if (value.getBirthday() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBirthday());
        }
        if (value.getUClass() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getUClass());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getEmail());
        }
        if (value.getSex() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSex());
        }
        if (value.getCmnd() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCmnd());
        }
        if (value.getFaculty() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getFaculty());
        }
        if (value.getMoblie() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getMoblie());
        }
        if (value.getAvatar() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getAvatar());
        }
      }
    };
    this.__deletionAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `User` WHERE `StudentId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getStudentId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getStudentId());
        }
      }
    };
    this.__updateAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `User` SET `StudentId` = ?,`StudentName` = ?,`Birthday` = ?,`UClass` = ?,`Email` = ?,`Sex` = ?,`CMND` = ?,`Faculty` = ?,`Moblie` = ?,`Avatar` = ? WHERE `StudentId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getStudentId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getStudentId());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFullName());
        }
        if (value.getBirthday() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBirthday());
        }
        if (value.getUClass() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getUClass());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getEmail());
        }
        if (value.getSex() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSex());
        }
        if (value.getCmnd() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCmnd());
        }
        if (value.getFaculty() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getFaculty());
        }
        if (value.getMoblie() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getMoblie());
        }
        if (value.getAvatar() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getAvatar());
        }
        if (value.getStudentId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getStudentId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll1 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM usergroup";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll2 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM usercriteriaactivity ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll3 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM usercriteriapoint ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll5 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM userrole ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll6 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM criteria ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll7 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM activity ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll8 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM svgroup ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll9 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM user ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll10 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Timetable";
        return _query;
      }
    };
  }

  @Override
  public long insert(User user) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUser.insertAndReturnId(user);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<User> users) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser.insert(users);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(User user) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfUser.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(User user) {
    __db.beginTransaction();
    try {
      __updateAdapterOfUser.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll1() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll1.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll1.release(_stmt);
    }
  }

  @Override
  public void deleteAll2() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll2.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll2.release(_stmt);
    }
  }

  @Override
  public void deleteAll3() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll3.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll3.release(_stmt);
    }
  }

  @Override
  public void deleteAll5() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll5.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll5.release(_stmt);
    }
  }

  @Override
  public void deleteAll6() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll6.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll6.release(_stmt);
    }
  }

  @Override
  public void deleteAll7() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll7.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll7.release(_stmt);
    }
  }

  @Override
  public void deleteAll8() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll8.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll8.release(_stmt);
    }
  }

  @Override
  public void deleteAll9() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll9.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll9.release(_stmt);
    }
  }

  @Override
  public void deleteAll10() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll10.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll10.release(_stmt);
    }
  }

  @Override
  public LiveData<User> getUserById(String UserCode) {
    final String _sql = "SELECT * FROM User where studentId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (UserCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, UserCode);
    }
    return new ComputableLiveData<User>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected User compute() {
        if (_observer == null) {
          _observer = new Observer("User") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final User _result;
          if(_cursor.moveToFirst()) {
            _result = __entityCursorConverter_comEmglabQlsvModelsEntityUser(_cursor);
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

  private User __entityCursorConverter_comEmglabQlsvModelsEntityUser(Cursor cursor) {
    final User _entity;
    final int _cursorIndexOfStudentId = cursor.getColumnIndex("StudentId");
    final int _cursorIndexOfFullName = cursor.getColumnIndex("StudentName");
    final int _cursorIndexOfBirthday = cursor.getColumnIndex("Birthday");
    final int _cursorIndexOfUClass = cursor.getColumnIndex("UClass");
    final int _cursorIndexOfEmail = cursor.getColumnIndex("Email");
    final int _cursorIndexOfSex = cursor.getColumnIndex("Sex");
    final int _cursorIndexOfCmnd = cursor.getColumnIndex("CMND");
    final int _cursorIndexOfFaculty = cursor.getColumnIndex("Faculty");
    final int _cursorIndexOfMoblie = cursor.getColumnIndex("Moblie");
    final int _cursorIndexOfAvatar = cursor.getColumnIndex("Avatar");
    _entity = new User();
    if (_cursorIndexOfStudentId != -1) {
      final String _tmpStudentId;
      _tmpStudentId = cursor.getString(_cursorIndexOfStudentId);
      _entity.setStudentId(_tmpStudentId);
    }
    if (_cursorIndexOfFullName != -1) {
      final String _tmpFullName;
      _tmpFullName = cursor.getString(_cursorIndexOfFullName);
      _entity.setFullName(_tmpFullName);
    }
    if (_cursorIndexOfBirthday != -1) {
      final String _tmpBirthday;
      _tmpBirthday = cursor.getString(_cursorIndexOfBirthday);
      _entity.setBirthday(_tmpBirthday);
    }
    if (_cursorIndexOfUClass != -1) {
      final Integer _tmpUClass;
      if (cursor.isNull(_cursorIndexOfUClass)) {
        _tmpUClass = null;
      } else {
        _tmpUClass = cursor.getInt(_cursorIndexOfUClass);
      }
      _entity.setUClass(_tmpUClass);
    }
    if (_cursorIndexOfEmail != -1) {
      final String _tmpEmail;
      _tmpEmail = cursor.getString(_cursorIndexOfEmail);
      _entity.setEmail(_tmpEmail);
    }
    if (_cursorIndexOfSex != -1) {
      final String _tmpSex;
      _tmpSex = cursor.getString(_cursorIndexOfSex);
      _entity.setSex(_tmpSex);
    }
    if (_cursorIndexOfCmnd != -1) {
      final String _tmpCmnd;
      _tmpCmnd = cursor.getString(_cursorIndexOfCmnd);
      _entity.setCmnd(_tmpCmnd);
    }
    if (_cursorIndexOfFaculty != -1) {
      final String _tmpFaculty;
      _tmpFaculty = cursor.getString(_cursorIndexOfFaculty);
      _entity.setFaculty(_tmpFaculty);
    }
    if (_cursorIndexOfMoblie != -1) {
      final String _tmpMoblie;
      _tmpMoblie = cursor.getString(_cursorIndexOfMoblie);
      _entity.setMoblie(_tmpMoblie);
    }
    if (_cursorIndexOfAvatar != -1) {
      final String _tmpAvatar;
      _tmpAvatar = cursor.getString(_cursorIndexOfAvatar);
      _entity.setAvatar(_tmpAvatar);
    }
    return _entity;
  }
}
