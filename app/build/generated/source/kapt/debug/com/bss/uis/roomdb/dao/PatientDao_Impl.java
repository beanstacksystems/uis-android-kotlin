package com.bss.uis.roomdb.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bss.uis.roomdb.entity.Address;
import com.bss.uis.roomdb.entity.MedicalHistory;
import com.bss.uis.roomdb.entity.Patient;
import com.bss.uis.roomdb.entity.PatientAttendant;
import com.bss.uis.roomdb.entity.PatientImages;
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
public final class PatientDao_Impl implements PatientDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Patient> __insertionAdapterOfPatient;

  private final EntityInsertionAdapter<PatientImages> __insertionAdapterOfPatientImages;

  private final EntityInsertionAdapter<Address> __insertionAdapterOfAddress;

  private final EntityInsertionAdapter<MedicalHistory> __insertionAdapterOfMedicalHistory;

  private final EntityInsertionAdapter<PatientAttendant> __insertionAdapterOfPatientAttendant;

  private final EntityDeletionOrUpdateAdapter<Patient> __deletionAdapterOfPatient;

  private final EntityDeletionOrUpdateAdapter<PatientImages> __deletionAdapterOfPatientImages;

  private final EntityDeletionOrUpdateAdapter<Address> __deletionAdapterOfAddress;

  private final EntityDeletionOrUpdateAdapter<MedicalHistory> __deletionAdapterOfMedicalHistory;

  private final EntityDeletionOrUpdateAdapter<PatientAttendant> __deletionAdapterOfPatientAttendant;

  private final EntityDeletionOrUpdateAdapter<Patient> __updateAdapterOfPatient;

  private final EntityDeletionOrUpdateAdapter<PatientImages> __updateAdapterOfPatientImages;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public PatientDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPatient = new EntityInsertionAdapter<Patient>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Patient` (`patientId`,`name`,`idproof`,`emailId`,`contact`,`gender`,`date_of_Birth`,`address`,`bloodGroup`,`suffering_from`,`socialId`,`patientImage`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Patient value) {
        stmt.bindLong(1, value.getPatientId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getIdproof() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getIdproof());
        }
        if (value.getEmailId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmailId());
        }
        if (value.getContact() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getContact());
        }
        if (value.getGender() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getGender());
        }
        if (value.getDob() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDob());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getAddress());
        }
        if (value.getBloodGroup() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getBloodGroup());
        }
        if (value.getDiseasesName() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDiseasesName());
        }
        if (value.getSocialId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getSocialId());
        }
        if (value.getPatientImage() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getPatientImage());
        }
      }
    };
    this.__insertionAdapterOfPatientImages = new EntityInsertionAdapter<PatientImages>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `PatientImages` (`imageId`,`imageType`,`imageStr`,`patientId`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PatientImages value) {
        stmt.bindLong(1, value.getImageId());
        if (value.getImageType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImageType());
        }
        if (value.getImageStr() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImageStr());
        }
        stmt.bindLong(4, value.getImageId_patientId());
      }
    };
    this.__insertionAdapterOfAddress = new EntityInsertionAdapter<Address>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `address` (`addressId`,`street`,`city`,`district`,`state`,`pin`,`patientId`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Address value) {
        stmt.bindLong(1, value.getAddressId());
        if (value.getStreet() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getStreet());
        }
        if (value.getCity() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCity());
        }
        if (value.getDistrict() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDistrict());
        }
        if (value.getState() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getState());
        }
        if (value.getPin() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPin());
        }
        stmt.bindLong(7, value.getAddressId_patientId());
      }
    };
    this.__insertionAdapterOfMedicalHistory = new EntityInsertionAdapter<MedicalHistory>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `medicalhistory` (`medicalHistoryId`,`bloodGroup`,`cancerType`,`identifiedOn`,`otherDisease`,`patientId`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MedicalHistory value) {
        stmt.bindLong(1, value.getMedicalHistoryId());
        if (value.getBloodGroup() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBloodGroup());
        }
        if (value.getCancerType() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCancerType());
        }
        if (value.getIdentifiedOn() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getIdentifiedOn());
        }
        if (value.getOtherDisease() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOtherDisease());
        }
        stmt.bindLong(6, value.getMedicalHistoryId_patientId());
      }
    };
    this.__insertionAdapterOfPatientAttendant = new EntityInsertionAdapter<PatientAttendant>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `attendant` (`attendantId`,`name`,`idproof`,`emailId`,`contact`,`relation`,`occupation`,`yearlyIncome`,`imageStr`,`patientId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PatientAttendant value) {
        stmt.bindLong(1, value.getAttendantId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getIdproof() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getIdproof());
        }
        if (value.getEmailId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmailId());
        }
        if (value.getContact() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getContact());
        }
        if (value.getRelation() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getRelation());
        }
        if (value.getOccupation() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getOccupation());
        }
        if (value.getYearlyIncome() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getYearlyIncome());
        }
        if (value.getImageStr() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getImageStr());
        }
        stmt.bindLong(10, value.getAttendantId_patientId());
      }
    };
    this.__deletionAdapterOfPatient = new EntityDeletionOrUpdateAdapter<Patient>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Patient` WHERE `patientId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Patient value) {
        stmt.bindLong(1, value.getPatientId());
      }
    };
    this.__deletionAdapterOfPatientImages = new EntityDeletionOrUpdateAdapter<PatientImages>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `PatientImages` WHERE `imageId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PatientImages value) {
        stmt.bindLong(1, value.getImageId());
      }
    };
    this.__deletionAdapterOfAddress = new EntityDeletionOrUpdateAdapter<Address>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `address` WHERE `addressId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Address value) {
        stmt.bindLong(1, value.getAddressId());
      }
    };
    this.__deletionAdapterOfMedicalHistory = new EntityDeletionOrUpdateAdapter<MedicalHistory>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `medicalhistory` WHERE `medicalHistoryId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MedicalHistory value) {
        stmt.bindLong(1, value.getMedicalHistoryId());
      }
    };
    this.__deletionAdapterOfPatientAttendant = new EntityDeletionOrUpdateAdapter<PatientAttendant>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `attendant` WHERE `attendantId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PatientAttendant value) {
        stmt.bindLong(1, value.getAttendantId());
      }
    };
    this.__updateAdapterOfPatient = new EntityDeletionOrUpdateAdapter<Patient>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Patient` SET `patientId` = ?,`name` = ?,`idproof` = ?,`emailId` = ?,`contact` = ?,`gender` = ?,`date_of_Birth` = ?,`address` = ?,`bloodGroup` = ?,`suffering_from` = ?,`socialId` = ?,`patientImage` = ? WHERE `patientId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Patient value) {
        stmt.bindLong(1, value.getPatientId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getIdproof() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getIdproof());
        }
        if (value.getEmailId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmailId());
        }
        if (value.getContact() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getContact());
        }
        if (value.getGender() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getGender());
        }
        if (value.getDob() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDob());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getAddress());
        }
        if (value.getBloodGroup() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getBloodGroup());
        }
        if (value.getDiseasesName() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDiseasesName());
        }
        if (value.getSocialId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getSocialId());
        }
        if (value.getPatientImage() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getPatientImage());
        }
        stmt.bindLong(13, value.getPatientId());
      }
    };
    this.__updateAdapterOfPatientImages = new EntityDeletionOrUpdateAdapter<PatientImages>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `PatientImages` SET `imageId` = ?,`imageType` = ?,`imageStr` = ?,`patientId` = ? WHERE `imageId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PatientImages value) {
        stmt.bindLong(1, value.getImageId());
        if (value.getImageType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImageType());
        }
        if (value.getImageStr() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImageStr());
        }
        stmt.bindLong(4, value.getImageId_patientId());
        stmt.bindLong(5, value.getImageId());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Patient";
        return _query;
      }
    };
  }

  @Override
  public long insertPatient(final Patient patient) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfPatient.insertAndReturnId(patient);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertPatientImages(final List<PatientImages> patientImageList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPatientImages.insert(patientImageList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertPatientAddress(final Address address) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAddress.insert(address);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertMedicalHistory(final MedicalHistory medicalHistory) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMedicalHistory.insert(medicalHistory);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertPatientAttendant(final List<PatientAttendant> patientAttendants) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPatientAttendant.insert(patientAttendants);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deletePatient(final Patient patient) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPatient.handle(patient);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deletePatientImages(final List<PatientImages> patientImageList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPatientImages.handleMultiple(patientImageList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deletePatientAddress(final Address address) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfAddress.handle(address);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMedicalHistory(final MedicalHistory medicalHistory) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfMedicalHistory.handle(medicalHistory);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deletePatientAttendant(final List<PatientAttendant> patientAttendants) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPatientAttendant.handleMultiple(patientAttendants);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updatePatient(final Patient patient) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPatient.handle(patient);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updatePatientImages(final PatientImages patientImages) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPatientImages.handle(patientImages);
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
  public LiveData<List<Patient>> getAll() {
    final String _sql = "SELECT * FROM Patient";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Patient"}, false, new Callable<List<Patient>>() {
      @Override
      public List<Patient> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPatientId = CursorUtil.getColumnIndexOrThrow(_cursor, "patientId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfIdproof = CursorUtil.getColumnIndexOrThrow(_cursor, "idproof");
          final int _cursorIndexOfEmailId = CursorUtil.getColumnIndexOrThrow(_cursor, "emailId");
          final int _cursorIndexOfContact = CursorUtil.getColumnIndexOrThrow(_cursor, "contact");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_Birth");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfBloodGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "bloodGroup");
          final int _cursorIndexOfDiseasesName = CursorUtil.getColumnIndexOrThrow(_cursor, "suffering_from");
          final int _cursorIndexOfSocialId = CursorUtil.getColumnIndexOrThrow(_cursor, "socialId");
          final int _cursorIndexOfPatientImage = CursorUtil.getColumnIndexOrThrow(_cursor, "patientImage");
          final List<Patient> _result = new ArrayList<Patient>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Patient _item;
            final int _tmpPatientId;
            _tmpPatientId = _cursor.getInt(_cursorIndexOfPatientId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpIdproof;
            if (_cursor.isNull(_cursorIndexOfIdproof)) {
              _tmpIdproof = null;
            } else {
              _tmpIdproof = _cursor.getString(_cursorIndexOfIdproof);
            }
            final String _tmpEmailId;
            if (_cursor.isNull(_cursorIndexOfEmailId)) {
              _tmpEmailId = null;
            } else {
              _tmpEmailId = _cursor.getString(_cursorIndexOfEmailId);
            }
            final String _tmpContact;
            if (_cursor.isNull(_cursorIndexOfContact)) {
              _tmpContact = null;
            } else {
              _tmpContact = _cursor.getString(_cursorIndexOfContact);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final String _tmpDob;
            if (_cursor.isNull(_cursorIndexOfDob)) {
              _tmpDob = null;
            } else {
              _tmpDob = _cursor.getString(_cursorIndexOfDob);
            }
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final String _tmpBloodGroup;
            if (_cursor.isNull(_cursorIndexOfBloodGroup)) {
              _tmpBloodGroup = null;
            } else {
              _tmpBloodGroup = _cursor.getString(_cursorIndexOfBloodGroup);
            }
            final String _tmpDiseasesName;
            if (_cursor.isNull(_cursorIndexOfDiseasesName)) {
              _tmpDiseasesName = null;
            } else {
              _tmpDiseasesName = _cursor.getString(_cursorIndexOfDiseasesName);
            }
            final String _tmpSocialId;
            if (_cursor.isNull(_cursorIndexOfSocialId)) {
              _tmpSocialId = null;
            } else {
              _tmpSocialId = _cursor.getString(_cursorIndexOfSocialId);
            }
            final String _tmpPatientImage;
            if (_cursor.isNull(_cursorIndexOfPatientImage)) {
              _tmpPatientImage = null;
            } else {
              _tmpPatientImage = _cursor.getString(_cursorIndexOfPatientImage);
            }
            _item = new Patient(_tmpPatientId,_tmpName,_tmpIdproof,_tmpEmailId,_tmpContact,_tmpGender,_tmpDob,_tmpAddress,_tmpBloodGroup,_tmpDiseasesName,_tmpSocialId,_tmpPatientImage);
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

  @Override
  public List<Patient> findByPatientId(final int patientId) {
    final String _sql = "SELECT * FROM Patient WHERE patientId Is?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, patientId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPatientId = CursorUtil.getColumnIndexOrThrow(_cursor, "patientId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfIdproof = CursorUtil.getColumnIndexOrThrow(_cursor, "idproof");
      final int _cursorIndexOfEmailId = CursorUtil.getColumnIndexOrThrow(_cursor, "emailId");
      final int _cursorIndexOfContact = CursorUtil.getColumnIndexOrThrow(_cursor, "contact");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "date_of_Birth");
      final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
      final int _cursorIndexOfBloodGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "bloodGroup");
      final int _cursorIndexOfDiseasesName = CursorUtil.getColumnIndexOrThrow(_cursor, "suffering_from");
      final int _cursorIndexOfSocialId = CursorUtil.getColumnIndexOrThrow(_cursor, "socialId");
      final int _cursorIndexOfPatientImage = CursorUtil.getColumnIndexOrThrow(_cursor, "patientImage");
      final List<Patient> _result = new ArrayList<Patient>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Patient _item;
        final int _tmpPatientId;
        _tmpPatientId = _cursor.getInt(_cursorIndexOfPatientId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpIdproof;
        if (_cursor.isNull(_cursorIndexOfIdproof)) {
          _tmpIdproof = null;
        } else {
          _tmpIdproof = _cursor.getString(_cursorIndexOfIdproof);
        }
        final String _tmpEmailId;
        if (_cursor.isNull(_cursorIndexOfEmailId)) {
          _tmpEmailId = null;
        } else {
          _tmpEmailId = _cursor.getString(_cursorIndexOfEmailId);
        }
        final String _tmpContact;
        if (_cursor.isNull(_cursorIndexOfContact)) {
          _tmpContact = null;
        } else {
          _tmpContact = _cursor.getString(_cursorIndexOfContact);
        }
        final String _tmpGender;
        if (_cursor.isNull(_cursorIndexOfGender)) {
          _tmpGender = null;
        } else {
          _tmpGender = _cursor.getString(_cursorIndexOfGender);
        }
        final String _tmpDob;
        if (_cursor.isNull(_cursorIndexOfDob)) {
          _tmpDob = null;
        } else {
          _tmpDob = _cursor.getString(_cursorIndexOfDob);
        }
        final String _tmpAddress;
        if (_cursor.isNull(_cursorIndexOfAddress)) {
          _tmpAddress = null;
        } else {
          _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
        }
        final String _tmpBloodGroup;
        if (_cursor.isNull(_cursorIndexOfBloodGroup)) {
          _tmpBloodGroup = null;
        } else {
          _tmpBloodGroup = _cursor.getString(_cursorIndexOfBloodGroup);
        }
        final String _tmpDiseasesName;
        if (_cursor.isNull(_cursorIndexOfDiseasesName)) {
          _tmpDiseasesName = null;
        } else {
          _tmpDiseasesName = _cursor.getString(_cursorIndexOfDiseasesName);
        }
        final String _tmpSocialId;
        if (_cursor.isNull(_cursorIndexOfSocialId)) {
          _tmpSocialId = null;
        } else {
          _tmpSocialId = _cursor.getString(_cursorIndexOfSocialId);
        }
        final String _tmpPatientImage;
        if (_cursor.isNull(_cursorIndexOfPatientImage)) {
          _tmpPatientImage = null;
        } else {
          _tmpPatientImage = _cursor.getString(_cursorIndexOfPatientImage);
        }
        _item = new Patient(_tmpPatientId,_tmpName,_tmpIdproof,_tmpEmailId,_tmpContact,_tmpGender,_tmpDob,_tmpAddress,_tmpBloodGroup,_tmpDiseasesName,_tmpSocialId,_tmpPatientImage);
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
