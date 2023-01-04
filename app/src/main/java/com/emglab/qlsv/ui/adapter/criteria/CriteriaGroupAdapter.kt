package com.emglab.qlsv.ui.adapter.criteria

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemCriteriaGroupsBinding
import com.emglab.qlsv.models.entity.CriteriaGroup

class CriteriaGroupAdapter (var criteriaGroups: List<CriteriaGroup>, val onCriteriaItemClick: OnCriteriaItemClick): RecyclerView.Adapter<CriteriaGroupAdapter.ViewHolder>() {
    class ViewHolder(val binding: ListItemCriteriaGroupsBinding,val onCriteriaItemClick: OnCriteriaItemClick): RecyclerView.ViewHolder(binding.root){
        fun bindView(criteriaGroup: CriteriaGroup){
            val userCriteriaAdapter = UserCriteriaAdapter(criteriaGroup.userCriteriaDetails, onCriteriaItemClick = onCriteriaItemClick)
            binding.recyclerView.apply {
                adapter = userCriteriaAdapter
                layoutManager = LinearLayoutManager(context)
            }
            binding.criteriaGroup = criteriaGroup
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ListItemCriteriaGroupsBinding = DataBindingUtil.inflate(inflater, R.layout.list_item_criteria_groups, parent, false)
        return ViewHolder(binding, onCriteriaItemClick)
    }

    override fun getItemCount(): Int {
        return criteriaGroups.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(criteriaGroups[position])
    }
}