package com.emglab.qlsv.ui.adapter.timetable

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemSubjectBinding
import com.emglab.qlsv.models.entity.Subject

class SubjectAdapter(var subjects: List<Subject>): RecyclerView.Adapter<SubjectAdapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemSubjectBinding): RecyclerView.ViewHolder(binding.root){
        val colors = listOf<String>("#945200","#929000","#4F8F00","#008F00","#009051","#009193","#005493","#531B93","#942193","#941751","#F7C758","#FF9300","#EF5931","#BE2813")
        fun bindView(subject: Subject, position: Int){
            var index = position + subject.getDay()
            if(index >= colors.size){
                index = colors.size - 1
            }
            binding.header.setBackgroundColor(Color.parseColor(colors[index]))
            binding.subject = subject
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ListItemSubjectBinding = DataBindingUtil.inflate(inflater, R.layout.list_item_subject, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return subjects.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(subject = subjects[position], position = position)
    }
}