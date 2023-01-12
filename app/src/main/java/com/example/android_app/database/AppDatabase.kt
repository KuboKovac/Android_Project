package com.example.android_app.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.android_app.dataClasses.Vehicle
import com.example.android_app.database.interfaces.IVehicleDao

@Database(entities = [Vehicle::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun vehicleDao(): IVehicleDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDb(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "vehicle_DB"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}