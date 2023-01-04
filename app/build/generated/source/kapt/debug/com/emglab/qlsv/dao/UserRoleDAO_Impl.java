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
import com.emglab.qlsv.models.entity.UserRole;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class UserRoleDAO_Impl implements UserRoleDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserRole;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUserRole;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUserRole;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public UserRoleDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserRole = new EntityInsertionAdapter<UserRole>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UserRole`(`URId`,`URName`,`URDesc`,`URLevel`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserRole value) {
        stmt.bindLong(1, value.getURId());
        if (value.getURName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getURName());
        }
        if (value.getURDesc() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getURDesc());
        }
        if (value.getURLevel() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getURLevel());
        }
      }
    };
    this.__deletionAdapterOfUserRole = new EntityDeletionOrUpdateAdapter<UserRole>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `UserRole` WHERE `URId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserRole value) {
        stmt.bindLong(1, value.getURId());
      }
    };
    this.__updateAdapterOfUserRole = new EntityDeletionOrUpdateAdapter<UserRole>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `UserRole` SET `URId` = ?,`URName` = ?,`URDesc` = ?,`URLevel` = ? WHERE `URId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserRole value) {
        stmt.bindLong(1, value.getURId());
        if (value.getURName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getURName());
        }
        if (value.getURDesc() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getURDesc());
        }
        if (value.getURLevel() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getURLevel());
        }
        stmt.bindLong(5, value.getURId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM UserRole";
        return _query;
      }
    };
  }

  @Override
  public long insert(UserRole userRole) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUserRole.insertAndReturnId(userRole);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<UserRole> userRoles) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserRole.insert(userRoles);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(UserRole userRole) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserRole.handle(userRole);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(UserRole userRole) {
    __db.beginTransaction();
    try {
      __updateAdapterOfUserRole.handle(userRole);
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
  public LiveData<List<UserRole>> getAll() {
    final String _sql = "SELECT * FROM UserRole ORDER BY URLevel ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<UserRole>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<UserRole> compute() {
        if (_observer == null) {
          _observer = new Observer("UserRole") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<UserRole> _result = new ArrayList<UserRole>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserRole _item;
            _item = __entityCursorConverter_comEmglabQlsvModelsEntityUserRole(_cursor);
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

  private UserRole __entityCursorConverter_comEmglabQlsvModelsEntityUserRole(Cursor cursor) {
    final UserRole _entity;
    final int _cursorIndexOfURId = cursor.getColumnIndex("URId");
    final int _cursorIndexOfURName = cursor.getColumnIndex("URName");
    final int _cursorIndexOfURDesc = cursor.getColumnIndex("URDesc");
    final int _cursorIndexOfURLevel = cursor.getColumnIndex("URLevel");
    _entity = new UserRole();
    if (_cursorIndexOfURId != -1) {
      final int _tmpURId;
      _tmpURId = cursor.getInt(_cursorIndexOfURId);
      _entity.setURId(_tmpURId);
    }
    if (_cursorIndexOfURName != -1) {
      final String _tmpURName;
      _tmpURName = cursor.getString(_cursorIndexOfURName);
      _entity.setURName(_tmpURName);
    }
    if (_cursorIndexOfURDesc != -1) {
      final String _tmpURDesc;
      _tmpURDesc = cursor.getString(_cursorIndexOfURDesc);
      _entity.setURDesc(_tmpURDesc);
    }
    if (_cursorIndexOfURLevel != -1) {
      final Integer _tmpURLevel;
      if (cursor.isNull(_cursorIndexOfURLevel)) {
        _tmpURLevel = null;
      } else {
        _tmpURLevel = cursor.getInt(_cursorIndexOfURLevel);
      }
      _entity.setURLevel(_tmpURLevel);
    }
    return _entity;
  }
}
