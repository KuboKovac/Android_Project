package com.example.android_app.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android_app.dataClasses.Vehicle
import kotlinx.coroutines.flow.Flow


@Dao
interface IVehicleDao{
    @Query("SELECT * FROM vehicles")
    fun getVehicleList(): Flow<List<Vehicle>>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(vehicle: Vehicle)
    @Query("DELETE FROM vehicles WHERE name=:title")
    suspend fun delete(name: String)
}