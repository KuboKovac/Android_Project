package com.example.android_app.dataClasses

import java.io.Serializable

data class Vehicle(var name: String, var licensePlate:String) : Serializable {



    override fun toString(): String {
        return "Vehicle '$name', '$licensePlate' "
    }
}