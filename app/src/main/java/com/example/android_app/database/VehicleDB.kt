package com.example.android_app.database

import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper

abstract class VehicleDB : RoomDatabase(){

    abstract fun vehicleDao() : IVehicleDao


    override fun createOpenHelper(config: DatabaseConfiguration?): SupportSQLiteOpenHelper {
        TODO("Not yet implemented")
    }

    override fun createInvalidationTracker(): InvalidationTracker {
        TODO("Not yet implemented")
    }

    override fun clearAllTables() {
        TODO("Not yet implemented")
    }
}