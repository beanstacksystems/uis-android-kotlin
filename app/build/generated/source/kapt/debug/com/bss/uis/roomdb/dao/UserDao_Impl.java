package com.bss.uis.roomdb.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bss.uis.roomdb.entity.UserRightData;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserRightData> __insertionAdapterOfUserRightData;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserRightData = new EntityInsertionAdapter<UserRightData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `userrightdata` (`userRightDataId`,`userRightId`,`userRightType`,`desc`,`userRoleId`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserRightData value) {
        stmt.bindLong(1, value.getUserRightDataId());
        stmt.bindLong(2, value.getUserRightId());
        if (value.getUserRightType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUserRightType());
        }
        if (value.getDesc() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDesc());
        }
        stmt.bindLong(5, value.getUserRoleId());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM UserRightData";
        return _query;
      }
    };
  }

  @Override
  public void insertUserData(final List<UserRightData> userRightDataList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserRightData.insert(userRightDataList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public List<UserRightData> findAll() {
    final String _sql = "SELECT * FROM UserRightData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUserRightDataId = CursorUtil.getColumnIndexOrThrow(_cursor, "userRightDataId");
      final int _cursorIndexOfUserRightId = CursorUtil.getColumnIndexOrThrow(_cursor, "userRightId");
      final int _cursorIndexOfUserRightType = CursorUtil.getColumnIndexOrThrow(_cursor, "userRightType");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final int _cursorIndexOfUserRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "userRoleId");
      final List<UserRightData> _result = new ArrayList<UserRightData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserRightData _item;
        final int _tmpUserRightDataId;
        _tmpUserRightDataId = _cursor.getInt(_cursorIndexOfUserRightDataId);
        final int _tmpUserRightId;
        _tmpUserRightId = _cursor.getInt(_cursorIndexOfUserRightId);
        final String _tmpUserRightType;
        if (_cursor.isNull(_cursorIndexOfUserRightType)) {
          _tmpUserRightType = null;
        } else {
          _tmpUserRightType = _cursor.getString(_cursorIndexOfUserRightType);
        }
        final String _tmpDesc;
        if (_cursor.isNull(_cursorIndexOfDesc)) {
          _tmpDesc = null;
        } else {
          _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        }
        final int _tmpUserRoleId;
        _tmpUserRoleId = _cursor.getInt(_cursorIndexOfUserRoleId);
        _item = new UserRightData(_tmpUserRightDataId,_tmpUserRightId,_tmpUserRightType,_tmpDesc,_tmpUserRoleId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<UserRightData> findByUserRightdataRoleType(final int userRoleId) {
    final String _sql = "SELECT * FROM UserRightData WHERE userRoleId is?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userRoleId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUserRightDataId = CursorUtil.getColumnIndexOrThrow(_cursor, "userRightDataId");
      final int _cursorIndexOfUserRightId = CursorUtil.getColumnIndexOrThrow(_cursor, "userRightId");
      final int _cursorIndexOfUserRightType = CursorUtil.getColumnIndexOrThrow(_cursor, "userRightType");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final int _cursorIndexOfUserRoleId = CursorUtil.getColumnIndexOrThrow(_cursor, "userRoleId");
      final List<UserRightData> _result = new ArrayList<UserRightData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserRightData _item;
        final int _tmpUserRightDataId;
        _tmpUserRightDataId = _cursor.getInt(_cursorIndexOfUserRightDataId);
        final int _tmpUserRightId;
        _tmpUserRightId = _cursor.getInt(_cursorIndexOfUserRightId);
        final String _tmpUserRightType;
        if (_cursor.isNull(_cursorIndexOfUserRightType)) {
          _tmpUserRightType = null;
        } else {
          _tmpUserRightType = _cursor.getString(_cursorIndexOfUserRightType);
        }
        final String _tmpDesc;
        if (_cursor.isNull(_cursorIndexOfDesc)) {
          _tmpDesc = null;
        } else {
          _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        }
        final int _tmpUserRoleId;
        _tmpUserRoleId = _cursor.getInt(_cursorIndexOfUserRoleId);
        _item = new UserRightData(_tmpUserRightDataId,_tmpUserRightId,_tmpUserRightType,_tmpDesc,_tmpUserRoleId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
