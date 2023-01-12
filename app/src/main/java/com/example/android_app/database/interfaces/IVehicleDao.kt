package com.example.android_app.database.interfaces

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android_app.dataClasses.Vehicle

@Dao
interface IVehicleDao {

//    @Query("SELECT * FROM vehicles")
//    fun getAllVehicles(): List<Vehicle>
//
//    @Query("SELECT * FROM vehicles WHERE id LIKE :id")
//    suspend fun getById(id: Int): Vehicle
//
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    suspend fun insertVehicle(vehicle: Vehicle)
//
//    @Delete
//    suspend fun deleteVehicle(vehicle: Vehicle)
}