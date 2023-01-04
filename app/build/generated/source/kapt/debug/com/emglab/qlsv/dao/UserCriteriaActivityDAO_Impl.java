package com.emglab.qlsv.dao;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.emglab.qlsv.Converters;
import com.emglab.qlsv.models.entity.UserCriteriaActivity;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

@SuppressWarnings("unchecked")
public final class UserCriteriaActivityDAO_Impl implements UserCriteriaActivityDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserCriteriaActivity;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUserCriteriaActivity;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUserCriteriaActivity;

  public UserCriteriaActivityDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserCriteriaActivity = new EntityInsertionAdapter<UserCriteriaActivity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UserCriteriaActivity`(`UCAId`,`CId`,`AId`,`CreateDate`,`CreateUser`,`UCAStatus`,`startTime`,`finishTime`,`name`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCriteriaActivity value) {
        stmt.bindLong(1, value.getUcaId());
        stmt.bindLong(2, value.getCId());
        stmt.bindLong(3, value.getAId());
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getCreateDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        if (value.getCreateUser() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCreateUser());
        }
        if (value.getUcaStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getUcaStatus());
        }
        final Long _tmp_1;
        _tmp_1 = __converters.dateToTimestamp(value.getStartTime());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp_1);
        }
        final Long _tmp_2;
        _tmp_2 = __converters.dateToTimestamp(value.getFinishTime());
        if (_tmp_2 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, _tmp_2);
        }
        if (value.getName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getName());
        }
      }
    };
    this.__deletionAdapterOfUserCriteriaActivity = new EntityDeletionOrUpdateAdapter<UserCriteriaActivity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `UserCriteriaActivity` WHERE `UCAId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCriteriaActivity value) {
        stmt.bindLong(1, value.getUcaId());
      }
    };
    this.__updateAdapterOfUserCriteriaActivity = new EntityDeletionOrUpdateAdapter<UserCriteriaActivity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `UserCriteriaActivity` SET `UCAId` = ?,`CId` = ?,`AId` = ?,`CreateDate` = ?,`CreateUser` = ?,`UCAStatus` = ?,`startTime` = ?,`finishTime` = ?,`name` = ? WHERE `UCAId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserCriteriaActivity value) {
        stmt.bindLong(1, value.getUcaId());
        stmt.bindLong(2, value.getCId());
        stmt.bindLong(3, value.getAId());
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getCreateDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        if (value.getCreateUser() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCreateUser());
        }
        if (value.getUcaStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getUcaStatus());
        }
        final Long _tmp_1;
        _tmp_1 = __converters.dateToTimestamp(value.getStartTime());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp_1);
        }
        final Long _tmp_2;
        _tmp_2 = __converters.dateToTimestamp(value.getFinishTime());
        if (_tmp_2 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, _tmp_2);
        }
        if (value.getName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getName());
        }
        stmt.bindLong(10, value.getUcaId());
      }
    };
  }

  @Override
  public long insert(UserCriteriaActivity userCriteriaActivity) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUserCriteriaActivity.insertAndReturnId(userCriteriaActivity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<UserCriteriaActivity> userCriteriaActivitys) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserCriteriaActivity.insert(userCriteriaActivitys);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(UserCriteriaActivity userCriteriaActivity) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserCriteriaActivity.handle(userCriteriaActivity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(UserCriteriaActivity userCriteriaActivity) {
    __db.beginTransaction();
    try {
      __updateAdapterOfUserCriteriaActivity.handle(userCriteriaActivity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
