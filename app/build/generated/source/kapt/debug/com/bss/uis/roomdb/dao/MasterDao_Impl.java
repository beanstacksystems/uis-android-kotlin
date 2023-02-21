package com.bss.uis.roomdb.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bss.uis.roomdb.entity.HomeTabData;
import com.bss.uis.roomdb.entity.MasterData;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MasterDao_Impl implements MasterDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MasterData> __insertionAdapterOfMasterData;

  private final EntityInsertionAdapter<HomeTabData> __insertionAdapterOfHomeTabData;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTabData;

  public MasterDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMasterData = new EntityInsertionAdapter<MasterData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `masterData` (`masterdatapkId`,`masterdataType`,`masterdataId`,`masterdataval`,`isactive`,`masterdatadesc`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MasterData value) {
        stmt.bindLong(1, value.getMasterdatapkId());
        if (value.getMasterdataType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMasterdataType());
        }
        stmt.bindLong(3, value.getMasterdataId());
        if (value.getMasterdataval() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMasterdataval());
        }
        if (value.getIsactive() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIsactive());
        }
        if (value.getMasterdatadesc() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMasterdatadesc());
        }
      }
    };
    this.__insertionAdapterOfHomeTabData = new EntityInsertionAdapter<HomeTabData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `hometabdata` (`tabid`,`tabname`,`tabdesc`,`tabdata`,`tabseq`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HomeTabData value) {
        stmt.bindLong(1, value.getTabid());
        if (value.getTabname() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTabname());
        }
        if (value.getTabdesc() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTabdesc());
        }
        if (value.getTabdata() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTabdata());
        }
        stmt.bindLong(5, value.getTabseq());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM MasterData";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTabData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM HomeTabData";
        return _query;
      }
    };
  }

  @Override
  public void insertMasterData(final List<MasterData> masterDataList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMasterData.insert(masterDataList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertTabData(final List<HomeTabData> homeTabDataList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHomeTabData.insert(homeTabDataList);
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
  public void deleteTabData() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTabData.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTabData.release(_stmt);
    }
  }

  @Override
  public List<MasterData> findAll() {
    final String _sql = "SELECT * FROM MasterData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMasterdatapkId = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdatapkId");
      final int _cursorIndexOfMasterdataType = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdataType");
      final int _cursorIndexOfMasterdataId = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdataId");
      final int _cursorIndexOfMasterdataval = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdataval");
      final int _cursorIndexOfIsactive = CursorUtil.getColumnIndexOrThrow(_cursor, "isactive");
      final int _cursorIndexOfMasterdatadesc = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdatadesc");
      final List<MasterData> _result = new ArrayList<MasterData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MasterData _item;
        final int _tmpMasterdatapkId;
        _tmpMasterdatapkId = _cursor.getInt(_cursorIndexOfMasterdatapkId);
        final String _tmpMasterdataType;
        if (_cursor.isNull(_cursorIndexOfMasterdataType)) {
          _tmpMasterdataType = null;
        } else {
          _tmpMasterdataType = _cursor.getString(_cursorIndexOfMasterdataType);
        }
        final int _tmpMasterdataId;
        _tmpMasterdataId = _cursor.getInt(_cursorIndexOfMasterdataId);
        final String _tmpMasterdataval;
        if (_cursor.isNull(_cursorIndexOfMasterdataval)) {
          _tmpMasterdataval = null;
        } else {
          _tmpMasterdataval = _cursor.getString(_cursorIndexOfMasterdataval);
        }
        final String _tmpIsactive;
        if (_cursor.isNull(_cursorIndexOfIsactive)) {
          _tmpIsactive = null;
        } else {
          _tmpIsactive = _cursor.getString(_cursorIndexOfIsactive);
        }
        final String _tmpMasterdatadesc;
        if (_cursor.isNull(_cursorIndexOfMasterdatadesc)) {
          _tmpMasterdatadesc = null;
        } else {
          _tmpMasterdatadesc = _cursor.getString(_cursorIndexOfMasterdatadesc);
        }
        _item = new MasterData(_tmpMasterdatapkId,_tmpMasterdataType,_tmpMasterdataId,_tmpMasterdataval,_tmpIsactive,_tmpMasterdatadesc);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<HomeTabData> findAllTabData() {
    final String _sql = "SELECT * FROM HomeTabData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTabid = CursorUtil.getColumnIndexOrThrow(_cursor, "tabid");
      final int _cursorIndexOfTabname = CursorUtil.getColumnIndexOrThrow(_cursor, "tabname");
      final int _cursorIndexOfTabdesc = CursorUtil.getColumnIndexOrThrow(_cursor, "tabdesc");
      final int _cursorIndexOfTabdata = CursorUtil.getColumnIndexOrThrow(_cursor, "tabdata");
      final int _cursorIndexOfTabseq = CursorUtil.getColumnIndexOrThrow(_cursor, "tabseq");
      final List<HomeTabData> _result = new ArrayList<HomeTabData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HomeTabData _item;
        final int _tmpTabid;
        _tmpTabid = _cursor.getInt(_cursorIndexOfTabid);
        final String _tmpTabname;
        if (_cursor.isNull(_cursorIndexOfTabname)) {
          _tmpTabname = null;
        } else {
          _tmpTabname = _cursor.getString(_cursorIndexOfTabname);
        }
        final String _tmpTabdesc;
        if (_cursor.isNull(_cursorIndexOfTabdesc)) {
          _tmpTabdesc = null;
        } else {
          _tmpTabdesc = _cursor.getString(_cursorIndexOfTabdesc);
        }
        final String _tmpTabdata;
        if (_cursor.isNull(_cursorIndexOfTabdata)) {
          _tmpTabdata = null;
        } else {
          _tmpTabdata = _cursor.getString(_cursorIndexOfTabdata);
        }
        final int _tmpTabseq;
        _tmpTabseq = _cursor.getInt(_cursorIndexOfTabseq);
        _item = new HomeTabData(_tmpTabid,_tmpTabname,_tmpTabdesc,_tmpTabdata,_tmpTabseq);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<MasterData> findByMasterdataType(final String masterdataType) {
    final String _sql = "SELECT * FROM MasterData WHERE masterdataType  = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (masterdataType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, masterdataType);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMasterdatapkId = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdatapkId");
      final int _cursorIndexOfMasterdataType = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdataType");
      final int _cursorIndexOfMasterdataId = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdataId");
      final int _cursorIndexOfMasterdataval = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdataval");
      final int _cursorIndexOfIsactive = CursorUtil.getColumnIndexOrThrow(_cursor, "isactive");
      final int _cursorIndexOfMasterdatadesc = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdatadesc");
      final List<MasterData> _result = new ArrayList<MasterData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MasterData _item;
        final int _tmpMasterdatapkId;
        _tmpMasterdatapkId = _cursor.getInt(_cursorIndexOfMasterdatapkId);
        final String _tmpMasterdataType;
        if (_cursor.isNull(_cursorIndexOfMasterdataType)) {
          _tmpMasterdataType = null;
        } else {
          _tmpMasterdataType = _cursor.getString(_cursorIndexOfMasterdataType);
        }
        final int _tmpMasterdataId;
        _tmpMasterdataId = _cursor.getInt(_cursorIndexOfMasterdataId);
        final String _tmpMasterdataval;
        if (_cursor.isNull(_cursorIndexOfMasterdataval)) {
          _tmpMasterdataval = null;
        } else {
          _tmpMasterdataval = _cursor.getString(_cursorIndexOfMasterdataval);
        }
        final String _tmpIsactive;
        if (_cursor.isNull(_cursorIndexOfIsactive)) {
          _tmpIsactive = null;
        } else {
          _tmpIsactive = _cursor.getString(_cursorIndexOfIsactive);
        }
        final String _tmpMasterdatadesc;
        if (_cursor.isNull(_cursorIndexOfMasterdatadesc)) {
          _tmpMasterdatadesc = null;
        } else {
          _tmpMasterdatadesc = _cursor.getString(_cursorIndexOfMasterdatadesc);
        }
        _item = new MasterData(_tmpMasterdatapkId,_tmpMasterdataType,_tmpMasterdataId,_tmpMasterdataval,_tmpIsactive,_tmpMasterdatadesc);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<MasterData> findByMasterdataTypeAndVal(final String masterdataType,
      final String masterdataval) {
    final String _sql = "SELECT * FROM MasterData WHERE masterdataType is? AND masterdataval is?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (masterdataType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, masterdataType);
    }
    _argIndex = 2;
    if (masterdataval == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, masterdataval);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"MasterData"}, false, new Callable<MasterData>() {
      @Override
      public MasterData call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMasterdatapkId = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdatapkId");
          final int _cursorIndexOfMasterdataType = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdataType");
          final int _cursorIndexOfMasterdataId = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdataId");
          final int _cursorIndexOfMasterdataval = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdataval");
          final int _cursorIndexOfIsactive = CursorUtil.getColumnIndexOrThrow(_cursor, "isactive");
          final int _cursorIndexOfMasterdatadesc = CursorUtil.getColumnIndexOrThrow(_cursor, "masterdatadesc");
          final MasterData _result;
          if(_cursor.moveToFirst()) {
            final int _tmpMasterdatapkId;
            _tmpMasterdatapkId = _cursor.getInt(_cursorIndexOfMasterdatapkId);
            final String _tmpMasterdataType;
            if (_cursor.isNull(_cursorIndexOfMasterdataType)) {
              _tmpMasterdataType = null;
            } else {
              _tmpMasterdataType = _cursor.getString(_cursorIndexOfMasterdataType);
            }
            final int _tmpMasterdataId;
            _tmpMasterdataId = _cursor.getInt(_cursorIndexOfMasterdataId);
            final String _tmpMasterdataval;
            if (_cursor.isNull(_cursorIndexOfMasterdataval)) {
              _tmpMasterdataval = null;
            } else {
              _tmpMasterdataval = _cursor.getString(_cursorIndexOfMasterdataval);
            }
            final String _tmpIsactive;
            if (_cursor.isNull(_cursorIndexOfIsactive)) {
              _tmpIsactive = null;
            } else {
              _tmpIsactive = _cursor.getString(_cursorIndexOfIsactive);
            }
            final String _tmpMasterdatadesc;
            if (_cursor.isNull(_cursorIndexOfMasterdatadesc)) {
              _tmpMasterdatadesc = null;
            } else {
              _tmpMasterdatadesc = _cursor.getString(_cursorIndexOfMasterdatadesc);
            }
            _result = new MasterData(_tmpMasterdatapkId,_tmpMasterdataType,_tmpMasterdataId,_tmpMasterdataval,_tmpIsactive,_tmpMasterdatadesc);
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
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
