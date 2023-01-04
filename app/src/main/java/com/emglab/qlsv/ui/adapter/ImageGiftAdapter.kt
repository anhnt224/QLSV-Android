package com.emglab.qlsv.ui.adapter

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemMotelImageBinding
import com.emglab.qlsv.models.entity.ImageMotel2
import com.bumptech.glide.Glide
import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerDrawable

class ImageGiftAdapter(
    var motelImageList: List<ImageMotel2>,
    val activity: Activity,
    private val onItemClickListener: OnItemClickListener
): RecyclerView.Adapter<ImageGiftAdapter.ViewHolder>() {
    inner class ViewHolder(
        private val binding: ListItemMotelImageBinding,
        private val onItemClickListener: OnItemClickListener
    ): RecyclerView.ViewHolder(binding.root){
        fun bindView(imageGift: ImageMotel2) {
            binding.apply {
                root.setOnClickListener {
                    onItemClickListener.onClickImageGift(imageGift)
                }
                imageMotel = imageGift
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
                Log.d("_IMAGE", "adapter ${imageGift.urlImage}")
                Glide.with(activity)
                    .load(imageGift.urlImage)
                    .placeholder(shimmerDrawable)
                    .error(R.drawable.ic_gift_default)
                    .centerCrop()
                    .into(image)

            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ListItemMotelImageBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.list_item_motel_image,
            parent,
            false
        )

        return ViewHolder(binding, onItemClickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val motelImage = motelImageList[position]
        return holder.bindView(motelImage)
    }

    override fun getItemCount(): Int {
        return motelImageList.size
    }

    interface OnItemClickListener{
        fun onClickImageGift(imageGift: ImageMotel2)
    }
}