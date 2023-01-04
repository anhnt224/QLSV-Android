package com.emglab.qlsv.ui.adapter.job

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ItemListJobBinding
import com.emglab.qlsv.models.entity.Job
import com.emglab.qlsv.ui.adapter.OnItemClickListener
import com.squareup.picasso.Picasso

class JobAdapter (var jobs: List<Job>, val onItemClickListener: OnItemClickListener<Job>): RecyclerView.Adapter<JobAdapter.ViewHolder>(){
    class ViewHolder(val binding: ItemListJobBinding, val onItemClickListener: OnItemClickListener<Job>): RecyclerView.ViewHolder(binding.root){
        fun bindView(job: Job){
            binding.root.setOnClickListener {
                onItemClickListener.onClick(job)
            }
            if (job.isExpired()){
                Picasso.get().load(R.drawable.job_disable).into(binding.icon)
            }else{
                Picasso.get().load(R.drawable.job).into(binding.icon)
            }
            binding.job = job
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemListJobBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_list_job, parent, false)
        return ViewHolder(binding, onItemClickListener)
    }

    override fun getItemCount(): Int = jobs.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val scholarShip = jobs[position]
        holder.bindView(scholarShip)
    }
}