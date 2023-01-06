package com.emglab.qlsv.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemHomeBinding
import com.emglab.qlsv.modules.home.model.HomeItem

class HomeItem2Adapter (var items: List<HomeItem>, private val onItemClickListener: OnItemClickListener): RecyclerView.Adapter<HomeItem2Adapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemHomeBinding, private val onItemClickListener: OnItemClickListener): RecyclerView.ViewHolder(binding.root){
        fun bindView(item: HomeItem, position: Int) {
            binding.apply {
                image.setImageDrawable(AppCompatResources.getDrawable(itemView.context, item.icon))
                title.text = item.title
                root.setOnClickListener {
                    onItemClickListener.onClick2(position)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListItemHomeBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item_home, parent, false)
        return ViewHolder(binding, onItemClickListener)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(items[position], position)
    }

    interface OnItemClickListener{
        fun onClick2(position: Int)
    }
}
