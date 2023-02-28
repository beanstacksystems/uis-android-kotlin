package com.bss.uis.roomdb.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bss.uis.roomdb.entity.ProfileDetails;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProfileDetailDao_Impl implements ProfileDetailDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProfileDetails> __insertionAdapterOfProfileDetails;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public ProfileDetailDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProfileDetails = new EntityInsertionAdapter<ProfileDetails>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `profileDetails` (`userid`,`salutation`,`usename`,`email`,`dob`,`gender`,`occupation`,`profileimage`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProfileDetails value) {
        if (value.getUserid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUserid());
        }
        if (value.getSalutation() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSalutation());
        }
        if (value.getUsename() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUsename());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getDob() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDob());
        }
        if (value.getGender() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getGender());
        }
        if (value.getOccupation() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getOccupation());
        }
        if (value.getProfileimage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getProfileimage());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM profileDetails";
        return _query;
      }
    };
  }

  @Override
  public void insertProfileDetails(final ProfileDetails userRightDataList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfProfileDetails.insert(userRightDataList);
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
  public ProfileDetails getProfileDetails() {
    final String _sql = "SELECT * FROM profileDetails";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUserid = CursorUtil.getColumnIndexOrThrow(_cursor, "userid");
      final int _cursorIndexOfSalutation = CursorUtil.getColumnIndexOrThrow(_cursor, "salutation");
      final int _cursorIndexOfUsename = CursorUtil.getColumnIndexOrThrow(_cursor, "usename");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "dob");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfOccupation = CursorUtil.getColumnIndexOrThrow(_cursor, "occupation");
      final int _cursorIndexOfProfileimage = CursorUtil.getColumnIndexOrThrow(_cursor, "profileimage");
      final ProfileDetails _result;
      if(_cursor.moveToFirst()) {
        final Integer _tmpUserid;
        if (_cursor.isNull(_cursorIndexOfUserid)) {
          _tmpUserid = null;
        } else {
          _tmpUserid = _cursor.getInt(_cursorIndexOfUserid);
        }
        final String _tmpSalutation;
        if (_cursor.isNull(_cursorIndexOfSalutation)) {
          _tmpSalutation = null;
        } else {
          _tmpSalutation = _cursor.getString(_cursorIndexOfSalutation);
        }
        final String _tmpUsename;
        if (_cursor.isNull(_cursorIndexOfUsename)) {
          _tmpUsename = null;
        } else {
          _tmpUsename = _cursor.getString(_cursorIndexOfUsename);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final String _tmpDob;
        if (_cursor.isNull(_cursorIndexOfDob)) {
          _tmpDob = null;
        } else {
          _tmpDob = _cursor.getString(_cursorIndexOfDob);
        }
        final String _tmpGender;
        if (_cursor.isNull(_cursorIndexOfGender)) {
          _tmpGender = null;
        } else {
          _tmpGender = _cursor.getString(_cursorIndexOfGender);
        }
        final String _tmpOccupation;
        if (_cursor.isNull(_cursorIndexOfOccupation)) {
          _tmpOccupation = null;
        } else {
          _tmpOccupation = _cursor.getString(_cursorIndexOfOccupation);
        }
        final String _tmpProfileimage;
        if (_cursor.isNull(_cursorIndexOfProfileimage)) {
          _tmpProfileimage = null;
        } else {
          _tmpProfileimage = _cursor.getString(_cursorIndexOfProfileimage);
        }
        _result = new ProfileDetails(_tmpUserid,_tmpSalutation,_tmpUsename,_tmpEmail,_tmpDob,_tmpGender,_tmpOccupation,_tmpProfileimage);
      } else {
        _result = null;
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
