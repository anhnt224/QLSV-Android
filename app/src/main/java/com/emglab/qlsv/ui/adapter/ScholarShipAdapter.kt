package com.emglab.qlsv.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemScholarshipBinding
import com.emglab.qlsv.models.entity.ScholarShip
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item_scholarship.view.*

class ScholarShipAdapter(var scholarShips: List<ScholarShip>, val onItemClickListener: OnItemClickListener<ScholarShip>): RecyclerView.Adapter<ScholarShipAdapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemScholarshipBinding, val onItemClickListener: OnItemClickListener<ScholarShip>): RecyclerView.ViewHolder(binding.root){
        fun bindView(scholarShip: ScholarShip){
            binding.root.setOnClickListener {
                onItemClickListener.onClick(scholarShip)
            }
            if (scholarShip.isExpired()){
                Picasso.get().load(R.drawable.graduation_cap_gray).into(binding.icon)
            }else{
                Picasso.get().load(R.drawable.graduation).into(binding.icon)
            }
            binding.scholarShip = scholarShip
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ListItemScholarshipBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_item_scholarship, parent, false)
        return ViewHolder(binding, onItemClickListener)
    }

    override fun getItemCount(): Int = scholarShips.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val scholarShip = scholarShips[position]
        holder.bindView(scholarShip)
    }
}