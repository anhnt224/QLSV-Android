package com.emglab.qlsv.ui.adapter.gift

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemGiftCreatedBinding
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.utilities.API_UPLOAD_SERVICE_BASE_URL
import com.bumptech.glide.Glide
import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerDrawable

class GiftCreatedAdapter(
    var gifts: ArrayList<Gift>,
    val activity: Activity,
    val onItemClickListener: OnItemClickListener,
    val userName: String,
    val token: String
) : RecyclerView.Adapter<GiftCreatedAdapter.ViewHolder>() {
    inner class ViewHolder(
        val binding: ListItemGiftCreatedBinding,
        val onItemClickListener: OnItemClickListener
    ): RecyclerView.ViewHolder(binding.root){
        fun bindView(gift: Gift){
            binding.root.setOnClickListener {
                onItemClickListener.onItemClick(gift)
            }
            binding.gift = gift
            binding.apply {
                statusText.setBackgroundColor(
                    ContextCompat.getColor(root.context, gift.getGiftStatus().bgColor)
                )
                statusText.setTextColor(
                    ContextCompat.getColor(root.context, gift.getGiftStatus().titleColor)
                )
                register.max = gift.quantity
                register.progress = gift.registeredQuantity
                moreButton.setOnClickListener {
                    onItemClickListener.onMoreButtonClick(gift, binding.moreButton)
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
        fun onMoreButtonClick(gift: Gift, view: View)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ListItemGiftCreatedBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.list_item_gift_created,
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