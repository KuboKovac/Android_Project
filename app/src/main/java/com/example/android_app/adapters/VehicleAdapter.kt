package com.example.android_app.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_app.dataClasses.Vehicle

class VehicleAdapter(private val vehicleList:ArrayList<Vehicle>)
    : RecyclerView.Adapter<VehicleAdapter.VehicleViewHolder>() {

    class VehicleViewHolder(vehicleView: View) : RecyclerView.ViewHolder(vehicleView){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehicleViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: VehicleViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}