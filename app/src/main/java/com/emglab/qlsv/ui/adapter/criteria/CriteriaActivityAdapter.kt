package com.emglab.qlsv.ui.adapter.criteria

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemCriteriaActivityBinding
import com.emglab.qlsv.ui.adapter.OnItemClickListener

class CriteriaActivityAdapter (var criteriaActivityItems: ArrayList<CriteriaActivityItem>, val onItemClickListener: OnItemClickListener<CriteriaActivityItem>): RecyclerView.Adapter<CriteriaActivityAdapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemCriteriaActivityBinding, val onItemClickListener: OnItemClickListener<CriteriaActivityItem>): RecyclerView.ViewHolder(binding.root){
        fun bindView(criteriaActivityItem: CriteriaActivityItem){
            binding.criteriaActivityItem = criteriaActivityItem
            binding.root.setOnClickListener {
                onItemClickListener.onClick(criteriaActivityItem)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ListItemCriteriaActivityBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_item_criteria_activity, parent, false)
        return ViewHolder(binding, onItemClickListener)
    }

    override fun getItemCount(): Int {
        return criteriaActivityItems.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(criteriaActivityItems[position])
    }
}