package com.emglab.qlsv.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemFormBinding
import com.emglab.qlsv.models.entity.Form

class FormAdapter(var forms: List<Form>,private val onItemClickListener: OnItemClickListener<Form>): RecyclerView.Adapter<FormAdapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemFormBinding,private val onItemClickListener: OnItemClickListener<Form>): RecyclerView.ViewHolder(binding.root){
        fun bindView(form: Form){
            binding.root.setOnClickListener {
                onItemClickListener.onClick(form)
            }
            binding.form = form
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListItemFormBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item_form, parent, false)
        return ViewHolder(binding, onItemClickListener)
    }

    override fun getItemCount(): Int {
        return forms.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(form = forms[position])
    }
}