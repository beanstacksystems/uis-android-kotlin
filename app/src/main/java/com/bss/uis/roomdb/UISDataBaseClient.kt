package com.bss.uis.roomdb

import android.content.Context
import androidx.room.Room

class UISDataBaseClient(mCtx: Context) {
    private var context: Context? = mCtx
    private var uisDataBaseClient: UISDataBaseClient? = null

    //our app database object
    private var uisDatabase: UISDatabase? = Room.databaseBuilder(mCtx, UISDatabase::
    class.java, "UISDB").build()





    @Synchronized
    fun getInstance(mCtx: Context): UISDataBaseClient? {
        if (uisDataBaseClient == null) {
            uisDataBaseClient = UISDataBaseClient(mCtx)
        }
        return uisDataBaseClient
    }

    fun getUisDatabase(): UISDatabase? {
        return uisDatabase
    }
}