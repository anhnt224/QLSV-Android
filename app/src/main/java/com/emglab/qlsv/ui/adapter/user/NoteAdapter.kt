package com.emglab.qlsv.ui.adapter.user

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemNoteBinding
import com.emglab.qlsv.models.entity.Note

class NoteAdapter(var notes: List<Note>, val onItemClickListener: OnItemClickListener) : RecyclerView.Adapter<NoteAdapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemNoteBinding, val onItemClickListener: OnItemClickListener): RecyclerView.ViewHolder(binding.root){
        fun bindView(note: Note){
            binding.note = note
            binding.root.setOnLongClickListener {
                onItemClickListener.onLongClick(note)
                return@setOnLongClickListener true
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(DataBindingUtil.inflate(inflater, R.layout.list_item_note, parent, false), onItemClickListener)
    }

    override fun getItemCount(): Int = notes.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(note = notes[position])
    }

    interface OnItemClickListener {
        fun onLongClick(note: Note)
    }
}