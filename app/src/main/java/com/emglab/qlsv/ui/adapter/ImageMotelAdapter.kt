package com.emglab.qlsv.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemImageMotelBinding
import com.emglab.qlsv.helper.TakePhotoHelper
import com.emglab.qlsv.models.entity.ImageMotel

class ImageMotelAdapter (var images: List<ImageMotel>, private val onItemClickListener: OnItemClickListener): RecyclerView.Adapter<ImageMotelAdapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemImageMotelBinding, private val onItemClickListener: OnItemClickListener): RecyclerView.ViewHolder(binding.root){
        private lateinit var takePhotoHelper : TakePhotoHelper
        fun bindView(image: ImageMotel){
            takePhotoHelper = TakePhotoHelper(itemView.context)
            binding.moreButton.setOnClickListener {
                onItemClickListener.onClick(image)
            }
            if (image.status != null  && image.status == 0){
                binding.retryCheckInLayout.visibility = View.VISIBLE
                binding.imageMotel = image
            }else{
                binding.retryCheckInLayout.visibility = View.GONE
                binding.imageMotel = image
            }
            binding.retryCheckInButton.setOnClickListener {
                onItemClickListener.retryUploadImage(image)
            }
            if (image.status == null || image.status == 1){
                binding.retryCheckInLayout.visibility = View.GONE
            }
            binding.image.setImageBitmap(takePhotoHelper.setPic(binding.image, image.image!!))

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListItemImageMotelBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item_image_motel, parent, false)
        return ViewHolder(binding, onItemClickListener)
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(images[position])
    }

    interface OnItemClickListener{
        fun onClick(image: ImageMotel)
        fun retryUploadImage(image: ImageMotel)
    }
}
