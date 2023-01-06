package com.emglab.qlsv.modules.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.databinding.ListItemHomeMenuGroupBinding
import com.emglab.qlsv.modules.home.model.HomeItem

class HomeMenuGroupAdapter(val menuGroups: Map<String, List<HomeItem>>, val onHomeMenuItemListener: HomeMenuItemListener): RecyclerView.Adapter<HomeMenuGroupAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ListItemHomeMenuGroupBinding): RecyclerView.ViewHolder(binding.root){
        fun bindView(title: String, menuItems: List<HomeItem>){
            binding.apply {
                titleText.text = title
                val homeMenuItemAdapter = HomeMenuItemAdapter(menuItems, onHomeMenuItemListener)
                menuList.apply {
                    adapter = homeMenuItemAdapter
                    setHasFixedSize(true)
                    layoutManager = GridLayoutManager(itemView.context, 3)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemHomeMenuGroupBinding.inflate(inflater)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val key = menuGroups.keys.toTypedArray()[position]
        val menuItems = menuGroups[key] ?: listOf()
        holder.bindView(key, menuItems)
    }

    override fun getItemCount(): Int {
        return menuGroups.keys.size
    }
}