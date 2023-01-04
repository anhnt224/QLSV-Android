package com.emglab.qlsv.ui.adapter.job

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemJobApplyBinding
import com.emglab.qlsv.models.entity.Job
import com.emglab.qlsv.ui.adapter.OnItemClickListener
import com.squareup.picasso.Picasso

class JobApplyAdapter (var jobs: List<Job>, val onItemClickListener: OnItemClickListener<Job>): RecyclerView.Adapter<JobApplyAdapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemJobApplyBinding, val onItemClickListener: OnItemClickListener<Job>): RecyclerView.ViewHolder(binding.root){
        fun bindView(job: Job){
            binding.root.setOnClickListener {
                onItemClickListener.onClick(job)

            }
            binding.job = job
            binding.apply {
                textStatus.setTextColor(Color.parseColor(job.getStatusColor()))
                when(job.statusApply){
                    1,2 -> Picasso.get().load(R.drawable.job_3).into(icon)
                    3 -> Picasso.get().load(R.drawable.job_4).into(icon)
                    0 -> Picasso.get().load(R.drawable.job_5).into(icon)
                    else -> Picasso.get().load(R.drawable.job_3).into(icon)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ListItemJobApplyBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_item_job_apply, parent, false)
        return ViewHolder(binding, onItemClickListener)
    }

    override fun getItemCount(): Int = jobs.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val scholarShip = jobs[position]
        holder.bindView(scholarShip)
    }
}