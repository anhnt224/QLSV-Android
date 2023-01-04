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
import com.emglab.qlsv.models.entity.Criteria;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class CriteriaDAO_Impl implements CriteriaDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCriteria;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCriteria;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfCriteria;

  public CriteriaDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCriteria = new EntityInsertionAdapter<Criteria>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Criteria`(`CId`,`CCode`,`CName`,`CType`,`CGroupId`,`CMaxPoint`,`CStatus`,`UCPoint`,`Semester`,`AId`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Criteria value) {
        stmt.bindLong(1, value.getId());
        if (value.getCCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getType());
        }
        if (value.getCGroupId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getCGroupId());
        }
        if (value.getMaxPoint() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getMaxPoint());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getStatus());
        }
        if (value.getUcPoint() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getUcPoint());
        }
        if (value.getSemester() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getSemester());
        }
        stmt.bindLong(10, value.getAId());
      }
    };
    this.__deletionAdapterOfCriteria = new EntityDeletionOrUpdateAdapter<Criteria>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Criteria` WHERE `CId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Criteria value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfCriteria = new EntityDeletionOrUpdateAdapter<Criteria>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Criteria` SET `CId` = ?,`CCode` = ?,`CName` = ?,`CType` = ?,`CGroupId` = ?,`CMaxPoint` = ?,`CStatus` = ?,`UCPoint` = ?,`Semester` = ?,`AId` = ? WHERE `CId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Criteria value) {
        stmt.bindLong(1, value.getId());
        if (value.getCCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getType());
        }
        if (value.getCGroupId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getCGroupId());
        }
        if (value.getMaxPoint() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getMaxPoint());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getStatus());
        }
        if (value.getUcPoint() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getUcPoint());
        }
        if (value.getSemester() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getSemester());
        }
        stmt.bindLong(10, value.getAId());
        stmt.bindLong(11, value.getId());
      }
    };
  }

  @Override
  public long insert(Criteria criteria) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfCriteria.insertAndReturnId(criteria);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<Criteria> criterias) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCriteria.insert(criterias);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Criteria criteria) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfCriteria.handle(criteria);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(Criteria criteria) {
    __db.beginTransaction();
    try {
      __updateAdapterOfCriteria.handle(criteria);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Criteria>> getCriteriaByCGId(int CGId) {
    final String _sql = "SELECT * FROM Criteria where CGroupId = ? ORDER BY CCode ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, CGId);
    return new ComputableLiveData<List<Criteria>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<Criteria> compute() {
        if (_observer == null) {
          _observer = new Observer("Criteria") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<Criteria> _result = new ArrayList<Criteria>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Criteria _item;
            _item = __entityCursorConverter_comEmglabQlsvModelsEntityCriteria(_cursor);
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
  public LiveData<List<Criteria>> getCriteriaByAId(int AId) {
    final String _sql = "SELECT * FROM Criteria where AId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, AId);
    return new ComputableLiveData<List<Criteria>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<Criteria> compute() {
        if (_observer == null) {
          _observer = new Observer("Criteria") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<Criteria> _result = new ArrayList<Criteria>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Criteria _item;
            _item = __entityCursorConverter_comEmglabQlsvModelsEntityCriteria(_cursor);
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

  private Criteria __entityCursorConverter_comEmglabQlsvModelsEntityCriteria(Cursor cursor) {
    final Criteria _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("CId");
    final int _cursorIndexOfCCode = cursor.getColumnIndex("CCode");
    final int _cursorIndexOfName = cursor.getColumnIndex("CName");
    final int _cursorIndexOfType = cursor.getColumnIndex("CType");
    final int _cursorIndexOfCGroupId = cursor.getColumnIndex("CGroupId");
    final int _cursorIndexOfMaxPoint = cursor.getColumnIndex("CMaxPoint");
    final int _cursorIndexOfStatus = cursor.getColumnIndex("CStatus");
    final int _cursorIndexOfUcPoint = cursor.getColumnIndex("UCPoint");
    final int _cursorIndexOfSemester = cursor.getColumnIndex("Semester");
    final int _cursorIndexOfAId = cursor.getColumnIndex("AId");
    _entity = new Criteria();
    if (_cursorIndexOfId != -1) {
      final int _tmpId;
      _tmpId = cursor.getInt(_cursorIndexOfId);
      _entity.setId(_tmpId);
    }
    if (_cursorIndexOfCCode != -1) {
      final String _tmpCCode;
      _tmpCCode = cursor.getString(_cursorIndexOfCCode);
      _entity.setCCode(_tmpCCode);
    }
    if (_cursorIndexOfName != -1) {
      final String _tmpName;
      _tmpName = cursor.getString(_cursorIndexOfName);
      _entity.setName(_tmpName);
    }
    if (_cursorIndexOfType != -1) {
      final String _tmpType;
      _tmpType = cursor.getString(_cursorIndexOfType);
      _entity.setType(_tmpType);
    }
    if (_cursorIndexOfCGroupId != -1) {
      final Integer _tmpCGroupId;
      if (cursor.isNull(_cursorIndexOfCGroupId)) {
        _tmpCGroupId = null;
      } else {
        _tmpCGroupId = cursor.getInt(_cursorIndexOfCGroupId);
      }
      _entity.setCGroupId(_tmpCGroupId);
    }
    if (_cursorIndexOfMaxPoint != -1) {
      final Integer _tmpMaxPoint;
      if (cursor.isNull(_cursorIndexOfMaxPoint)) {
        _tmpMaxPoint = null;
      } else {
        _tmpMaxPoint = cursor.getInt(_cursorIndexOfMaxPoint);
      }
      _entity.setMaxPoint(_tmpMaxPoint);
    }
    if (_cursorIndexOfStatus != -1) {
      final Integer _tmpStatus;
      if (cursor.isNull(_cursorIndexOfStatus)) {
        _tmpStatus = null;
      } else {
        _tmpStatus = cursor.getInt(_cursorIndexOfStatus);
      }
      _entity.setStatus(_tmpStatus);
    }
    if (_cursorIndexOfUcPoint != -1) {
      final Integer _tmpUcPoint;
      if (cursor.isNull(_cursorIndexOfUcPoint)) {
        _tmpUcPoint = null;
      } else {
        _tmpUcPoint = cursor.getInt(_cursorIndexOfUcPoint);
      }
      _entity.setUcPoint(_tmpUcPoint);
    }
    if (_cursorIndexOfSemester != -1) {
      final String _tmpSemester;
      _tmpSemester = cursor.getString(_cursorIndexOfSemester);
      _entity.setSemester(_tmpSemester);
    }
    if (_cursorIndexOfAId != -1) {
      final int _tmpAId;
      _tmpAId = cursor.getInt(_cursorIndexOfAId);
      _entity.setAId(_tmpAId);
    }
    return _entity;
  }
}
