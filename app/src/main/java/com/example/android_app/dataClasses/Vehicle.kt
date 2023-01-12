package com.example.android_app.dataClasses

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "vehicles")
data class Vehicle(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "brand") val brand: String?,
    @ColumnInfo(name = "description") val description: String?,
    @ColumnInfo(name = "license_plate") val licensePlate: String?,
    @ColumnInfo(name = "emission_inspection") val emissionInspection: Int?,
    @ColumnInfo(name = "technical_inspection") val technicalInspection: Int?,
    @ColumnInfo(name = "picture_url") val pictureUrl: String?
)