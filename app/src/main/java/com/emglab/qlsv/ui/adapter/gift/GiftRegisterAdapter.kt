package com.emglab.qlsv.ui.adapter.gift

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemGiftRegisterBinding
import com.emglab.qlsv.models.entity.gift.GiftRegister
import com.emglab.qlsv.ui.adapter.OnItemClickListener

class GiftRegisterAdapter(
    var giftRegisters: List<GiftRegister>,
    val onItemClickListener: OnItemClickListener<GiftRegister>
): RecyclerView.Adapter<GiftRegisterAdapter.ViewHolder>() {
    inner class ViewHolder(
        val binding: ListItemGiftRegisterBinding,
        val onItemClickListener: OnItemClickListener<GiftRegister>
    ): RecyclerView.ViewHolder(binding.root){
        fun bindView(giftRegister: GiftRegister){
            binding.giftRegister = giftRegister
            if (giftRegister.isApproved()){
                binding.container.setBackgroundColor(
                    ContextCompat.getColor(binding.root.context, R.color.done_bg)
                )
            }else{
                binding.container.setBackgroundColor(
                    ContextCompat.getColor(binding.root.context, R.color.colorWhite)
                )
            }
            binding.apply {
                root.setOnClickListener {
                    onItemClickListener.onClick(giftRegister)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ListItemGiftRegisterBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.list_item_gift_register,
            parent,
            false
        )
        return ViewHolder(binding, onItemClickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(giftRegisters[position])
    }

    override fun getItemCount(): Int {
        return giftRegisters.size
    }
}