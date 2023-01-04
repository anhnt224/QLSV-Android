package com.emglab.qlsv.dao;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.emglab.qlsv.models.entity.UserGroup;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

@SuppressWarnings("unchecked")
public final class UserGroupDAO_Impl implements UserGroupDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserGroup;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUserGroup;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUserGroup;

  public UserGroupDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserGroup = new EntityInsertionAdapter<UserGroup>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UserGroup`(`UGId`,`UserCode`,`GId`,`UserRole`,`Reason`,`CreateDate`,`CreateUser`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserGroup value) {
        stmt.bindLong(1, value.getUgId());
        if (value.getUserCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserCode());
        }
        if (value.getGId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getGId());
        }
        if (value.getUserRole() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getUserRole());
        }
        if (value.getReason() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getReason());
        }
        if (value.getCreateDate() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCreateDate());
        }
        if (value.getCreateUser() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCreateUser());
        }
      }
    };
    this.__deletionAdapterOfUserGroup = new EntityDeletionOrUpdateAdapter<UserGroup>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `UserGroup` WHERE `UGId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserGroup value) {
        stmt.bindLong(1, value.getUgId());
      }
    };
    this.__updateAdapterOfUserGroup = new EntityDeletionOrUpdateAdapter<UserGroup>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `UserGroup` SET `UGId` = ?,`UserCode` = ?,`GId` = ?,`UserRole` = ?,`Reason` = ?,`CreateDate` = ?,`CreateUser` = ? WHERE `UGId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserGroup value) {
        stmt.bindLong(1, value.getUgId());
        if (value.getUserCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserCode());
        }
        if (value.getGId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getGId());
        }
        if (value.getUserRole() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getUserRole());
        }
        if (value.getReason() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getReason());
        }
        if (value.getCreateDate() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCreateDate());
        }
        if (value.getCreateUser() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCreateUser());
        }
        stmt.bindLong(8, value.getUgId());
      }
    };
  }

  @Override
  public long insert(UserGroup userGroup) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUserGroup.insertAndReturnId(userGroup);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<UserGroup> userGroups) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserGroup.insert(userGroups);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(UserGroup userGroup) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserGroup.handle(userGroup);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(UserGroup userGroup) {
    __db.beginTransaction();
    try {
      __updateAdapterOfUserGroup.handle(userGroup);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
