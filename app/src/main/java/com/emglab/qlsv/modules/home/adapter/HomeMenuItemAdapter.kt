package com.emglab.qlsv.modules.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.databinding.ListItemHomeMenuBinding
import com.emglab.qlsv.modules.home.model.HomeItem

class HomeMenuItemAdapter(val menuItems: List<HomeItem>, val homeMenuItemListener: HomeMenuItemListener): RecyclerView.Adapter<HomeMenuItemAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ListItemHomeMenuBinding): RecyclerView.ViewHolder(binding.root){
        fun bindView(menuItem: HomeItem){
            binding.apply {
                image.setImageDrawable(AppCompatResources.getDrawable(itemView.context, menuItem.icon))
                title.text = menuItem.title
                root.setOnClickListener {
                    homeMenuItemListener.onHomeItemClick(menuItem)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ListItemHomeMenuBinding.inflate(layoutInflater)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menuItem = menuItems[position]
        holder.bindView(menuItem)
    }

    override fun getItemCount(): Int {
        return menuItems.size
    }
}

interface HomeMenuItemListener {
    fun onHomeItemClick(homeItem: HomeItem)
}