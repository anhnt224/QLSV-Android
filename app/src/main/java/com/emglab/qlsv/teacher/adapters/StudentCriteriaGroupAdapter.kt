package com.emglab.qlsv.teacher.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemCriteriaGroupsBinding
import com.emglab.qlsv.models.entity.CriteriaGroup

class StudentCriteriaGroupAdapter (var criteriaGroups: List<CriteriaGroup>, private val onItemClickListener: StudentCriteriaAdapter.OnItemClickListener): RecyclerView.Adapter<StudentCriteriaGroupAdapter.ViewHolder>() {
    class ViewHolder(val binding: ListItemCriteriaGroupsBinding,private val onItemClickListener: StudentCriteriaAdapter.OnItemClickListener): RecyclerView.ViewHolder(binding.root){
        fun bindView(criteriaGroup: CriteriaGroup){
            val studentCriteriaAdapter = StudentCriteriaAdapter(criteriaGroup.userCriteriaDetails, onItemClickListener = onItemClickListener)
            binding.recyclerView.apply {
                adapter = studentCriteriaAdapter
                layoutManager = LinearLayoutManager(context)
            }
            binding.criteriaGroup = criteriaGroup
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ListItemCriteriaGroupsBinding = DataBindingUtil.inflate(inflater, R.layout.list_item_criteria_groups, parent, false)
        return ViewHolder(binding, onItemClickListener)
    }

    override fun getItemCount(): Int {
        return criteriaGroups.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(criteriaGroups[position])
    }
}