package com.emglab.qlsv.ui.adapter.user

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemAddressBinding
import com.emglab.qlsv.models.entity.UserAddress

class AddressAdapter(var userAddresses: ArrayList<UserAddress>, val onItemButtonClickListener: OnItemButtonClickListener): RecyclerView.Adapter<AddressAdapter.ViewHolder>() {
    class ViewHolder(val binding: ListItemAddressBinding, val onItemButtonClickListener: OnItemButtonClickListener): RecyclerView.ViewHolder(binding.root){
        fun bindView(address: UserAddress){
            binding.address = address
            binding.buttonDelete.setOnClickListener {
                onItemButtonClickListener.onButtonDelClick(address)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ListItemAddressBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_item_address, parent, false)
        return ViewHolder(binding, onItemButtonClickListener)
    }

    override fun getItemCount(): Int {
        return userAddresses.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(userAddresses[position])
    }

    interface OnItemButtonClickListener{
        fun onButtonDelClick(address: UserAddress)
    }
}