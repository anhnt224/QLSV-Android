package com.emglab.qlsv.ui.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemScholarshipAppliedBinding
import com.emglab.qlsv.models.entity.ScholarShip

class ScholarShipAppliedAdapter (var scholarShips: List<ScholarShip>): RecyclerView.Adapter<ScholarShipAppliedAdapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemScholarshipAppliedBinding): RecyclerView.ViewHolder(binding.root){
        fun bindView(scholarShip: ScholarShip){
//            if (scholarShip.isExpired()){
//                Picasso.get().load(R.drawable.graduation_cap_gray).into(binding.icon)
//            }else{
//                Picasso.get().load(R.drawable.graduation).into(binding.icon)
//            }
            binding.textStatus.setTextColor(Color.parseColor(scholarShip.getStatusColor()))
            binding.scholarShip = scholarShip
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ListItemScholarshipAppliedBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_item_scholarship_applied, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = scholarShips.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val scholarShip = scholarShips[position]
        holder.bindView(scholarShip)
    }
}