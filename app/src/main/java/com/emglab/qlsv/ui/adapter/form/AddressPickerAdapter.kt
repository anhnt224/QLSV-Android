package com.emglab.qlsv.ui.adapter.form

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemAddressPickerBinding
import com.emglab.qlsv.models.entity.UserAddress
import com.emglab.qlsv.ui.adapter.OnItemClickListener

class AddressPickerAdapter(var userAddressList: List<UserAddress>,var userAddressSelected: UserAddress?, var onItemClickListener: OnItemClickListener<UserAddress>): RecyclerView.Adapter<AddressPickerAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ListItemAddressPickerBinding): RecyclerView.ViewHolder(binding.root) {
        fun bindView(userAddress: UserAddress, userAddressSelected: UserAddress?){
            binding.apply {
                studentNameTextView.text = userAddress.studentName
                studentContactTextView.text = userAddress.contact
                studentAddressTextView.text = userAddress.address
                if(userAddressSelected != null){
                    radioButton.isChecked = userAddress.id == userAddressSelected.id
                }

                root.setOnClickListener {
                    onItemClickListener.onClick(userAddress)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ListItemAddressPickerBinding>(inflater, R.layout.list_item_address_picker,parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(userAddressList[position],userAddressSelected)
    }

    override fun getItemCount(): Int {
        return userAddressList.size
    }
}