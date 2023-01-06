package com.emglab.qlsv.modules.home.adapter

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemPublicActivityBinding
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.ui.adapter.activity.EventAdapter

class PublicActivityAdapter(
    var activities: List<Activity>,
    val activity: android.app.Activity,
    private val onItemClickListener: EventAdapter.OnItemClickListener
) : RecyclerView.Adapter<PublicActivityAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ListItemPublicActivityBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindView(activity: Activity){
            val link = "https://ctsv.hust.edu.vn/api-t/${activity.linkImage}"
            binding.activity = activity
            binding.apply {
                statusTextView.setTextColor(
                    ContextCompat.getColor(
                    root.context,
                    activity.getTimeStatusColor()
                ))
            }
            binding.root.setOnClickListener {
                onItemClickListener.onItemClick(activity)
            }
            val params = binding.container.layoutParams
            val displayMetrics = Resources.getSystem().displayMetrics
            params.width = displayMetrics.widthPixels
            binding.container.layoutParams = params
            loadImage(link, binding.imageView)
        }

        private fun loadImage(imageURL: String, imageView: ImageView){
            Glide.with(activity)
                .load(imageURL)
                .placeholder(R.color.colorPrimary10)
                .error(R.drawable.logo)
                .centerCrop()
                .into(imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemPublicActivityBinding.inflate(inflater)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val activity = activities[position]
        holder.bindView(activity)
    }

    override fun getItemCount(): Int {
        return activities.size
    }
}