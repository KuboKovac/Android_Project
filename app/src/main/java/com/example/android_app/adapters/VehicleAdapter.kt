package com.example.android_app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android_app.R
import com.example.android_app.dataClasses.Vehicle

class VehicleAdapter(private val vehicleList:ArrayList<Vehicle>)
    : RecyclerView.Adapter<VehicleAdapter.VehicleViewHolder>() {

    class VehicleViewHolder(vehicleView: View) : RecyclerView.ViewHolder(vehicleView){
        val nameView : TextView = itemView.findViewById(R.id.nameView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehicleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.vehicle_item, parent, false)
        return VehicleViewHolder(view)
    }

    override fun onBindViewHolder(holder: VehicleViewHolder, position: Int) {
        val vehicle = vehicleList[position]
        holder.nameView.text = vehicle.name
    }

    override fun getItemCount(): Int {
        return vehicleList.size
    }
}