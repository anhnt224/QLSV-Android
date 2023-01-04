package com.emglab.qlsv.ui.adapter.gift

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemGiftRegister2Binding
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.utilities.API_UPLOAD_SERVICE_BASE_URL
import com.bumptech.glide.Glide
import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerDrawable

class GiftRegisteredAdapter(
    var gifts: List<Gift>,
    val activity: Activity,
    val userName: String,
    val token: String,
    val onItemClickListener: OnItemClickListener
) : RecyclerView.Adapter<GiftRegisteredAdapter.ViewHolder>() {
    inner class ViewHolder(
        val binding: ListItemGiftRegister2Binding,
        val onItemClickListener: OnItemClickListener
    ): RecyclerView.ViewHolder(binding.root){
        fun bindView(gift: Gift){
            binding.gift = gift
            binding.apply {
                root.setOnClickListener {
                    onItemClickListener.onItemClick(gift)
                }
            }

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
            val url = "${API_UPLOAD_SERVICE_BASE_URL}ATMGift/DownloadImageGift?UserName=${userName}&TokenCode=${token}&GiftID=${gift.id}&TypeImage=1"
            Glide.with(activity)
                .load(url)
                .placeholder(shimmerDrawable)
                .error(R.drawable.ic_gift_default)
                .centerCrop()
                .into(binding.imageView)
        }
    }

    interface OnItemClickListener {
        fun onItemClick(gift: Gift)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ListItemGiftRegister2Binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.list_item_gift_register_2,
            parent,
            false
        )
        return ViewHolder(binding, onItemClickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(gifts[position])
    }

    override fun getItemCount(): Int {
        return gifts.size
    }
}