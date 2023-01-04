package com.emglab.qlsv.ui.adapter.activity

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemEventBinding
import com.emglab.qlsv.models.entity.Activity
import com.bumptech.glide.Glide
import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerDrawable

class EventAdapter(
    var activities: List<Activity>,
    val activity: android.app.Activity,
    private val onItemClickListener: OnItemClickListener
    ): RecyclerView.Adapter<EventAdapter.ViewHolder>() {
    inner class ViewHolder(
        private val binding: ListItemEventBinding,
        private val onItemClickListener: OnItemClickListener
    ): RecyclerView.ViewHolder(binding.root){
        fun bindView(activity: Activity){
            val link = "https://ctsv.hust.edu.vn/api-t/${activity.linkImage}"
            binding.activity = activity
            binding.apply {
                statusTextView.setTextColor(ContextCompat.getColor(
                    root.context,
                    activity.getTimeStatusColor()
                ))
            }
            binding.root.setOnClickListener {
                onItemClickListener.onItemClick(activity)
            }
            loadImage(link, binding.imageView)
        }

        private fun loadImage(imageURL: String, imageView: ImageView){
            Log.d("_IMAGE", imageURL)
            val shimmer = Shimmer.AlphaHighlightBuilder()
                .setDuration(1800)
                .setBaseAlpha(0.7f) //the alpha of the underlying children
                .setHighlightAlpha(0.6f) // the shimmer alpha amount
                .setDirection(Shimmer.Direction.LEFT_TO_RIGHT)
                .setAutoStart(true)
                .build()
            val shimmerDrawable = ShimmerDrawable().apply {
                setShimmer(shimmer)
            }

            Glide.with(activity)
                .load(imageURL)
                .placeholder(R.color.colorPrimary10)
                .error(R.drawable.logo)
                .centerCrop()
                .into(imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ListItemEventBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.list_item_event,
            parent,
            false
        )
        return ViewHolder(binding, onItemClickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(activity = activities[position])
    }

    override fun getItemCount(): Int {
        return activities.size
    }

    interface OnItemClickListener {
        fun onItemClick(activity: Activity)
    }
}