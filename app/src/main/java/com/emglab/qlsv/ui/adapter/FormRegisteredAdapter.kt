package com.emglab.qlsv.ui.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemFormRegisteredBinding
import com.emglab.qlsv.models.entity.Form

class FormRegisteredAdapter (var forms: ArrayList<Form>, private val onItemClickListener: OnItemClickListener<Form>,private val onItemLongClickListener: OnItemLongClickListener<Form>, private val onButtonItemClick: OnButtonItemClick): RecyclerView.Adapter<FormRegisteredAdapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemFormRegisteredBinding, private val onItemClickListener: OnItemClickListener<Form>, private val onItemLongClickListener: OnItemLongClickListener<Form>, private val onButtonItemClick: OnButtonItemClick): RecyclerView.ViewHolder(binding.root){
        fun bindView(form: Form){
            binding.root.setOnClickListener {
                onItemClickListener.onClick(form)
            }
            binding.root.setOnLongClickListener {
                onItemLongClickListener.onLongClick(form)
                true
            }
            binding.buttonRate.setOnClickListener {
                onButtonItemClick.onButtonRatingClick(form)
            }
            binding.form = form
            binding.textStatus.setTextColor(Color.parseColor(form.getStatusColor()))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListItemFormRegisteredBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item_form_registered, parent, false)
        return ViewHolder(binding, onItemClickListener, onItemLongClickListener, onButtonItemClick)
    }

    override fun getItemCount(): Int {
        return forms.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(form = forms[position])
    }

    interface OnButtonItemClick{
        fun onButtonRatingClick(form: Form)
    }
}