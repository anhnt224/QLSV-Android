package com.emglab.qlsv.ui.adapter.timetable

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemDayOfWeekBinding
import com.emglab.qlsv.models.entity.DayOfWeek
import java.util.*

class DayOfWeekAdapter(var daysOfWeek: List<DayOfWeek>) : RecyclerView.Adapter<DayOfWeekAdapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemDayOfWeekBinding): RecyclerView.ViewHolder(binding.root){
        fun bindView(dayOfWeek: DayOfWeek, position: Int){
            val subjectAdapter = SubjectAdapter(dayOfWeek.subjects)
            binding.textTitle.text = dayOfWeek.day
            binding.recyclerView.apply {
                layoutManager = LinearLayoutManager(binding.root.context)
                adapter = subjectAdapter
            }

            val calendar = Calendar.getInstance()
            val day = calendar.get(Calendar.DAY_OF_WEEK)
            if(day - 2 == position){
                binding.titleView.setBackgroundColor(Color.parseColor("#569127"))
            }else{
                binding.titleView.setBackgroundColor(Color.parseColor("#DFDFDF"))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ListItemDayOfWeekBinding = DataBindingUtil.inflate(inflater, R.layout.list_item_day_of_week, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return daysOfWeek.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(daysOfWeek[position], position)
    }
}