package com.bss.uis.roomdb;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.bss.uis.roomdb.dao.ApplicationDao;
import com.bss.uis.roomdb.dao.ApplicationDao_Impl;
import com.bss.uis.roomdb.dao.MasterDao;
import com.bss.uis.roomdb.dao.MasterDao_Impl;
import com.bss.uis.roomdb.dao.PatientDao;
import com.bss.uis.roomdb.dao.PatientDao_Impl;
import com.bss.uis.roomdb.dao.UserDao;
import com.bss.uis.roomdb.dao.UserDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UISDatabase_Impl extends UISDatabase {
  private volatile MasterDao _masterDao;

  private volatile UserDao _userDao;

  private volatile PatientDao _patientDao;

  private volatile ApplicationDao _applicationDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Patient` (`patientId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `idproof` TEXT, `emailId` TEXT, `contact` TEXT, `gender` TEXT, `date_of_Birth` TEXT, `address` TEXT, `bloodGroup` TEXT, `suffering_from` TEXT, `socialId` TEXT, `patientImage` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PatientImages` (`imageId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `imageType` TEXT, `imageStr` TEXT, `patientId` INTEGER NOT NULL, FOREIGN KEY(`patientId`) REFERENCES `Patient`(`patientId`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `AppConfig` (`configId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `configKey` TEXT, `configValue` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `address` (`addressId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `street` TEXT, `city` TEXT, `district` TEXT, `state` TEXT, `pin` TEXT, `patientId` INTEGER NOT NULL, FOREIGN KEY(`addressId`) REFERENCES `Patient`(`patientId`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `medicalhistory` (`medicalHistoryId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `bloodGroup` TEXT, `cancerType` TEXT, `identifiedOn` TEXT, `otherDisease` TEXT, `patientId` INTEGER NOT NULL, FOREIGN KEY(`medicalHistoryId`) REFERENCES `Patient`(`patientId`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `attendant` (`attendantId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `idproof` TEXT, `emailId` TEXT, `contact` TEXT, `relation` TEXT, `occupation` TEXT, `yearlyIncome` TEXT, `imageStr` TEXT, `patientId` INTEGER NOT NULL, FOREIGN KEY(`attendantId`) REFERENCES `Patient`(`patientId`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `hometabdata` (`tabid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `tabname` TEXT, `tabdesc` TEXT, `tabdata` TEXT, `tabseq` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `masterData` (`masterdatapkId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `masterdataType` TEXT, `masterdataId` INTEGER NOT NULL, `masterdataval` TEXT, `isactive` TEXT, `masterdatadesc` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `userrightdata` (`userRightDataId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userRightId` INTEGER NOT NULL, `userRightType` TEXT, `desc` TEXT, `userRoleId` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '70b3c7c41669548d120edee699fa390d')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Patient`");
        _db.execSQL("DROP TABLE IF EXISTS `PatientImages`");
        _db.execSQL("DROP TABLE IF EXISTS `AppConfig`");
        _db.execSQL("DROP TABLE IF EXISTS `address`");
        _db.execSQL("DROP TABLE IF EXISTS `medicalhistory`");
        _db.execSQL("DROP TABLE IF EXISTS `attendant`");
        _db.execSQL("DROP TABLE IF EXISTS `hometabdata`");
        _db.execSQL("DROP TABLE IF EXISTS `masterData`");
        _db.execSQL("DROP TABLE IF EXISTS `userrightdata`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPatient = new HashMap<String, TableInfo.Column>(12);
        _columnsPatient.put("patientId", new TableInfo.Column("patientId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatient.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatient.put("idproof", new TableInfo.Column("idproof", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatient.put("emailId", new TableInfo.Column("emailId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatient.put("contact", new TableInfo.Column("contact", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatient.put("gender", new TableInfo.Column("gender", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatient.put("date_of_Birth", new TableInfo.Column("date_of_Birth", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatient.put("address", new TableInfo.Column("address", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatient.put("bloodGroup", new TableInfo.Column("bloodGroup", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatient.put("suffering_from", new TableInfo.Column("suffering_from", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatient.put("socialId", new TableInfo.Column("socialId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatient.put("patientImage", new TableInfo.Column("patientImage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPatient = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPatient = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPatient = new TableInfo("Patient", _columnsPatient, _foreignKeysPatient, _indicesPatient);
        final TableInfo _existingPatient = TableInfo.read(_db, "Patient");
        if (! _infoPatient.equals(_existingPatient)) {
          return new RoomOpenHelper.ValidationResult(false, "Patient(com.bss.uis.roomdb.entity.Patient).\n"
                  + " Expected:\n" + _infoPatient + "\n"
                  + " Found:\n" + _existingPatient);
        }
        final HashMap<String, TableInfo.Column> _columnsPatientImages = new HashMap<String, TableInfo.Column>(4);
        _columnsPatientImages.put("imageId", new TableInfo.Column("imageId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatientImages.put("imageType", new TableInfo.Column("imageType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatientImages.put("imageStr", new TableInfo.Column("imageStr", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatientImages.put("patientId", new TableInfo.Column("patientId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPatientImages = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysPatientImages.add(new TableInfo.ForeignKey("Patient", "NO ACTION", "NO ACTION",Arrays.asList("patientId"), Arrays.asList("patientId")));
        final HashSet<TableInfo.Index> _indicesPatientImages = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPatientImages = new TableInfo("PatientImages", _columnsPatientImages, _foreignKeysPatientImages, _indicesPatientImages);
        final TableInfo _existingPatientImages = TableInfo.read(_db, "PatientImages");
        if (! _infoPatientImages.equals(_existingPatientImages)) {
          return new RoomOpenHelper.ValidationResult(false, "PatientImages(com.bss.uis.roomdb.entity.PatientImages).\n"
                  + " Expected:\n" + _infoPatientImages + "\n"
                  + " Found:\n" + _existingPatientImages);
        }
        final HashMap<String, TableInfo.Column> _columnsAppConfig = new HashMap<String, TableInfo.Column>(3);
        _columnsAppConfig.put("configId", new TableInfo.Column("configId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAppConfig.put("configKey", new TableInfo.Column("configKey", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAppConfig.put("configValue", new TableInfo.Column("configValue", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAppConfig = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAppConfig = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAppConfig = new TableInfo("AppConfig", _columnsAppConfig, _foreignKeysAppConfig, _indicesAppConfig);
        final TableInfo _existingAppConfig = TableInfo.read(_db, "AppConfig");
        if (! _infoAppConfig.equals(_existingAppConfig)) {
          return new RoomOpenHelper.ValidationResult(false, "AppConfig(com.bss.uis.roomdb.entity.AppConfig).\n"
                  + " Expected:\n" + _infoAppConfig + "\n"
                  + " Found:\n" + _existingAppConfig);
        }
        final HashMap<String, TableInfo.Column> _columnsAddress = new HashMap<String, TableInfo.Column>(7);
        _columnsAddress.put("addressId", new TableInfo.Column("addressId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddress.put("street", new TableInfo.Column("street", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddress.put("city", new TableInfo.Column("city", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddress.put("district", new TableInfo.Column("district", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddress.put("state", new TableInfo.Column("state", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddress.put("pin", new TableInfo.Column("pin", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAddress.put("patientId", new TableInfo.Column("patientId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAddress = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysAddress.add(new TableInfo.ForeignKey("Patient", "NO ACTION", "NO ACTION",Arrays.asList("addressId"), Arrays.asList("patientId")));
        final HashSet<TableInfo.Index> _indicesAddress = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAddress = new TableInfo("address", _columnsAddress, _foreignKeysAddress, _indicesAddress);
        final TableInfo _existingAddress = TableInfo.read(_db, "address");
        if (! _infoAddress.equals(_existingAddress)) {
          return new RoomOpenHelper.ValidationResult(false, "address(com.bss.uis.roomdb.entity.Address).\n"
                  + " Expected:\n" + _infoAddress + "\n"
                  + " Found:\n" + _existingAddress);
        }
        final HashMap<String, TableInfo.Column> _columnsMedicalhistory = new HashMap<String, TableInfo.Column>(6);
        _columnsMedicalhistory.put("medicalHistoryId", new TableInfo.Column("medicalHistoryId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicalhistory.put("bloodGroup", new TableInfo.Column("bloodGroup", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicalhistory.put("cancerType", new TableInfo.Column("cancerType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicalhistory.put("identifiedOn", new TableInfo.Column("identifiedOn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicalhistory.put("otherDisease", new TableInfo.Column("otherDisease", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMedicalhistory.put("patientId", new TableInfo.Column("patientId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMedicalhistory = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysMedicalhistory.add(new TableInfo.ForeignKey("Patient", "NO ACTION", "NO ACTION",Arrays.asList("medicalHistoryId"), Arrays.asList("patientId")));
        final HashSet<TableInfo.Index> _indicesMedicalhistory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMedicalhistory = new TableInfo("medicalhistory", _columnsMedicalhistory, _foreignKeysMedicalhistory, _indicesMedicalhistory);
        final TableInfo _existingMedicalhistory = TableInfo.read(_db, "medicalhistory");
        if (! _infoMedicalhistory.equals(_existingMedicalhistory)) {
          return new RoomOpenHelper.ValidationResult(false, "medicalhistory(com.bss.uis.roomdb.entity.MedicalHistory).\n"
                  + " Expected:\n" + _infoMedicalhistory + "\n"
                  + " Found:\n" + _existingMedicalhistory);
        }
        final HashMap<String, TableInfo.Column> _columnsAttendant = new HashMap<String, TableInfo.Column>(10);
        _columnsAttendant.put("attendantId", new TableInfo.Column("attendantId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAttendant.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAttendant.put("idproof", new TableInfo.Column("idproof", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAttendant.put("emailId", new TableInfo.Column("emailId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAttendant.put("contact", new TableInfo.Column("contact", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAttendant.put("relation", new TableInfo.Column("relation", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAttendant.put("occupation", new TableInfo.Column("occupation", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAttendant.put("yearlyIncome", new TableInfo.Column("yearlyIncome", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAttendant.put("imageStr", new TableInfo.Column("imageStr", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAttendant.put("patientId", new TableInfo.Column("patientId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAttendant = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysAttendant.add(new TableInfo.ForeignKey("Patient", "NO ACTION", "NO ACTION",Arrays.asList("attendantId"), Arrays.asList("patientId")));
        final HashSet<TableInfo.Index> _indicesAttendant = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAttendant = new TableInfo("attendant", _columnsAttendant, _foreignKeysAttendant, _indicesAttendant);
        final TableInfo _existingAttendant = TableInfo.read(_db, "attendant");
        if (! _infoAttendant.equals(_existingAttendant)) {
          return new RoomOpenHelper.ValidationResult(false, "attendant(com.bss.uis.roomdb.entity.PatientAttendant).\n"
                  + " Expected:\n" + _infoAttendant + "\n"
                  + " Found:\n" + _existingAttendant);
        }
        final HashMap<String, TableInfo.Column> _columnsHometabdata = new HashMap<String, TableInfo.Column>(5);
        _columnsHometabdata.put("tabid", new TableInfo.Column("tabid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHometabdata.put("tabname", new TableInfo.Column("tabname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHometabdata.put("tabdesc", new TableInfo.Column("tabdesc", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHometabdata.put("tabdata", new TableInfo.Column("tabdata", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHometabdata.put("tabseq", new TableInfo.Column("tabseq", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHometabdata = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHometabdata = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHometabdata = new TableInfo("hometabdata", _columnsHometabdata, _foreignKeysHometabdata, _indicesHometabdata);
        final TableInfo _existingHometabdata = TableInfo.read(_db, "hometabdata");
        if (! _infoHometabdata.equals(_existingHometabdata)) {
          return new RoomOpenHelper.ValidationResult(false, "hometabdata(com.bss.uis.roomdb.entity.HomeTabData).\n"
                  + " Expected:\n" + _infoHometabdata + "\n"
                  + " Found:\n" + _existingHometabdata);
        }
        final HashMap<String, TableInfo.Column> _columnsMasterData = new HashMap<String, TableInfo.Column>(6);
        _columnsMasterData.put("masterdatapkId", new TableInfo.Column("masterdatapkId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMasterData.put("masterdataType", new TableInfo.Column("masterdataType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMasterData.put("masterdataId", new TableInfo.Column("masterdataId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMasterData.put("masterdataval", new TableInfo.Column("masterdataval", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMasterData.put("isactive", new TableInfo.Column("isactive", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMasterData.put("masterdatadesc", new TableInfo.Column("masterdatadesc", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMasterData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMasterData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMasterData = new TableInfo("masterData", _columnsMasterData, _foreignKeysMasterData, _indicesMasterData);
        final TableInfo _existingMasterData = TableInfo.read(_db, "masterData");
        if (! _infoMasterData.equals(_existingMasterData)) {
          return new RoomOpenHelper.ValidationResult(false, "masterData(com.bss.uis.roomdb.entity.MasterData).\n"
                  + " Expected:\n" + _infoMasterData + "\n"
                  + " Found:\n" + _existingMasterData);
        }
        final HashMap<String, TableInfo.Column> _columnsUserrightdata = new HashMap<String, TableInfo.Column>(5);
        _columnsUserrightdata.put("userRightDataId", new TableInfo.Column("userRightDataId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserrightdata.put("userRightId", new TableInfo.Column("userRightId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserrightdata.put("userRightType", new TableInfo.Column("userRightType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserrightdata.put("desc", new TableInfo.Column("desc", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserrightdata.put("userRoleId", new TableInfo.Column("userRoleId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserrightdata = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserrightdata = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserrightdata = new TableInfo("userrightdata", _columnsUserrightdata, _foreignKeysUserrightdata, _indicesUserrightdata);
        final TableInfo _existingUserrightdata = TableInfo.read(_db, "userrightdata");
        if (! _infoUserrightdata.equals(_existingUserrightdata)) {
          return new RoomOpenHelper.ValidationResult(false, "userrightdata(com.bss.uis.roomdb.entity.UserRightData).\n"
                  + " Expected:\n" + _infoUserrightdata + "\n"
                  + " Found:\n" + _existingUserrightdata);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "70b3c7c41669548d120edee699fa390d", "ae7c2ad774dc74e2b8f4802d688538fd");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Patient","PatientImages","AppConfig","address","medicalhistory","attendant","hometabdata","masterData","userrightdata");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `PatientImages`");
      _db.execSQL("DELETE FROM `address`");
      _db.execSQL("DELETE FROM `medicalhistory`");
      _db.execSQL("DELETE FROM `Patient`");
      _db.execSQL("DELETE FROM `AppConfig`");
      _db.execSQL("DELETE FROM `attendant`");
      _db.execSQL("DELETE FROM `hometabdata`");
      _db.execSQL("DELETE FROM `masterData`");
      _db.execSQL("DELETE FROM `userrightdata`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MasterDao.class, MasterDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PatientDao.class, PatientDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ApplicationDao.class, ApplicationDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public MasterDao getMasterDAO() {
    if (_masterDao != null) {
      return _masterDao;
    } else {
      synchronized(this) {
        if(_masterDao == null) {
          _masterDao = new MasterDao_Impl(this);
        }
        return _masterDao;
      }
    }
  }

  @Override
  public UserDao getUserDAO() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public PatientDao getPatientDao() {
    if (_patientDao != null) {
      return _patientDao;
    } else {
      synchronized(this) {
        if(_patientDao == null) {
          _patientDao = new PatientDao_Impl(this);
        }
        return _patientDao;
      }
    }
  }

  @Override
  public ApplicationDao getApplicationDao() {
    if (_applicationDao != null) {
      return _applicationDao;
    } else {
      synchronized(this) {
        if(_applicationDao == null) {
          _applicationDao = new ApplicationDao_Impl(this);
        }
        return _applicationDao;
      }
    }
  }
}
