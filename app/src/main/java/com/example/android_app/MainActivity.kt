package com.example.android_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_app.adapters.VehicleAdapter
import com.example.android_app.dataClasses.Vehicle

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var vehicleList: ArrayList<Vehicle>
    private lateinit var vehicleAdapter: VehicleAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.carRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        vehicleList = ArrayList()

        //DB code

        vehicleAdapter = VehicleAdapter(vehicleList)
        recyclerView.adapter = vehicleAdapter
    }
}