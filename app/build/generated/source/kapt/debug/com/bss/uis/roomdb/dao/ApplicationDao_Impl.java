package com.bss.uis.roomdb.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bss.uis.roomdb.entity.AppConfig;
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
public final class ApplicationDao_Impl implements ApplicationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AppConfig> __insertionAdapterOfAppConfig;

  public ApplicationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAppConfig = new EntityInsertionAdapter<AppConfig>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `AppConfig` (`configId`,`configKey`,`configValue`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AppConfig value) {
        stmt.bindLong(1, value.getConfigId());
        if (value.getConfigKey() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getConfigKey());
        }
        if (value.getConfigValue() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getConfigValue());
        }
      }
    };
  }

  @Override
  public long insertAppConfig(final AppConfig appConfig) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfAppConfig.insertAndReturnId(appConfig);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<AppConfig>> findAll() {
    final String _sql = "SELECT * FROM AppConfig";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"AppConfig"}, false, new Callable<List<AppConfig>>() {
      @Override
      public List<AppConfig> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfConfigId = CursorUtil.getColumnIndexOrThrow(_cursor, "configId");
          final int _cursorIndexOfConfigKey = CursorUtil.getColumnIndexOrThrow(_cursor, "configKey");
          final int _cursorIndexOfConfigValue = CursorUtil.getColumnIndexOrThrow(_cursor, "configValue");
          final List<AppConfig> _result = new ArrayList<AppConfig>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AppConfig _item;
            final int _tmpConfigId;
            _tmpConfigId = _cursor.getInt(_cursorIndexOfConfigId);
            final String _tmpConfigKey;
            if (_cursor.isNull(_cursorIndexOfConfigKey)) {
              _tmpConfigKey = null;
            } else {
              _tmpConfigKey = _cursor.getString(_cursorIndexOfConfigKey);
            }
            final String _tmpConfigValue;
            if (_cursor.isNull(_cursorIndexOfConfigValue)) {
              _tmpConfigValue = null;
            } else {
              _tmpConfigValue = _cursor.getString(_cursorIndexOfConfigValue);
            }
            _item = new AppConfig(_tmpConfigId,_tmpConfigKey,_tmpConfigValue);
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
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
