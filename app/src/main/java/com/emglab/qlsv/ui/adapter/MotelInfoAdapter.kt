package com.emglab.qlsv.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemMotelInfoBinding
import com.emglab.qlsv.models.entity.Motel

class MotelInfoAdapter(
    var listMotel: List<Motel>,
    private val onItemMotelInfoClickListener: OnItemMotelInfoClickListener
    ): RecyclerView.Adapter<MotelInfoAdapter.ViewHolder>() {
    class ViewHolder(
        val binding: ListItemMotelInfoBinding,
        private val onItemMotelInfoClickListener: OnItemMotelInfoClickListener
        ): RecyclerView.ViewHolder(binding.root){
        fun bindView(motel: Motel){
            binding.motel = motel
            binding.ratingBar.rating = motel.rate.toFloat()/20f
            binding.apply {
                cardViewOpenMotelItem.setOnClickListener {
                    onItemMotelInfoClickListener.navigateToMotelInfoDetailFragment(motel)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ListItemMotelInfoBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.list_item_motel_info,
            parent,
            false
        )

        return ViewHolder(binding, onItemMotelInfoClickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val motel = listMotel[position]
        return holder.bindView(motel)
    }

    override fun getItemCount(): Int {
        return listMotel.size
    }

    interface OnItemMotelInfoClickListener{
        fun navigateToMotelInfoDetailFragment(motel: Motel)
    }
}