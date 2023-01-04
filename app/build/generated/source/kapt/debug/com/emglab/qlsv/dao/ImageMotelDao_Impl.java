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
import com.emglab.qlsv.models.entity.ImageMotel;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class ImageMotelDao_Impl implements ImageMotelDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfImageMotel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfImageMotel;

  public ImageMotelDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfImageMotel = new EntityInsertionAdapter<ImageMotel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ImageMotel`(`idMotel`,`type`,`image`,`status`,`file`,`time`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ImageMotel value) {
        stmt.bindLong(1, value.getIdMotel());
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getType());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getStatus());
        }
        if (value.getFile() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFile());
        }
        if (value.getTime() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTime());
        }
      }
    };
    this.__deletionAdapterOfImageMotel = new EntityDeletionOrUpdateAdapter<ImageMotel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ImageMotel` WHERE `idMotel` = ? AND `time` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ImageMotel value) {
        stmt.bindLong(1, value.getIdMotel());
        if (value.getTime() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTime());
        }
      }
    };
  }

  @Override
  public long insertImageMotel(ImageMotel image) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfImageMotel.insertAndReturnId(image);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteImageMotel(ImageMotel image) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfImageMotel.handle(image);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<ImageMotel>> getAllImageMotel(int idMotel) {
    final String _sql = "SELECT * FROM ImageMotel WHERE idMotel = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idMotel);
    return new ComputableLiveData<List<ImageMotel>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<ImageMotel> compute() {
        if (_observer == null) {
          _observer = new Observer("ImageMotel") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<ImageMotel> _result = new ArrayList<ImageMotel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ImageMotel _item;
            _item = __entityCursorConverter_comEmglabQlsvModelsEntityImageMotel(_cursor);
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
  public LiveData<ImageMotel> getImageMotel(int idMotel, int type) {
    final String _sql = "SELECT * FROM ImageMotel WHERE idMotel = ? AND type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, idMotel);
    _argIndex = 2;
    _statement.bindLong(_argIndex, type);
    return new ComputableLiveData<ImageMotel>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected ImageMotel compute() {
        if (_observer == null) {
          _observer = new Observer("ImageMotel") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final ImageMotel _result;
          if(_cursor.moveToFirst()) {
            _result = __entityCursorConverter_comEmglabQlsvModelsEntityImageMotel(_cursor);
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

  private ImageMotel __entityCursorConverter_comEmglabQlsvModelsEntityImageMotel(Cursor cursor) {
    final ImageMotel _entity;
    final int _cursorIndexOfIdMotel = cursor.getColumnIndex("idMotel");
    final int _cursorIndexOfType = cursor.getColumnIndex("type");
    final int _cursorIndexOfImage = cursor.getColumnIndex("image");
    final int _cursorIndexOfStatus = cursor.getColumnIndex("status");
    final int _cursorIndexOfFile = cursor.getColumnIndex("file");
    final int _cursorIndexOfTime = cursor.getColumnIndex("time");
    _entity = new ImageMotel();
    if (_cursorIndexOfIdMotel != -1) {
      final int _tmpIdMotel;
      _tmpIdMotel = cursor.getInt(_cursorIndexOfIdMotel);
      _entity.setIdMotel(_tmpIdMotel);
    }
    if (_cursorIndexOfType != -1) {
      final Integer _tmpType;
      if (cursor.isNull(_cursorIndexOfType)) {
        _tmpType = null;
      } else {
        _tmpType = cursor.getInt(_cursorIndexOfType);
      }
      _entity.setType(_tmpType);
    }
    if (_cursorIndexOfImage != -1) {
      final String _tmpImage;
      _tmpImage = cursor.getString(_cursorIndexOfImage);
      _entity.setImage(_tmpImage);
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
    if (_cursorIndexOfFile != -1) {
      final String _tmpFile;
      _tmpFile = cursor.getString(_cursorIndexOfFile);
      _entity.setFile(_tmpFile);
    }
    if (_cursorIndexOfTime != -1) {
      final String _tmpTime;
      _tmpTime = cursor.getString(_cursorIndexOfTime);
      _entity.setTime(_tmpTime);
    }
    return _entity;
  }
}
