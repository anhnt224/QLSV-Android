package com.emglab.qlsv.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemFormQuestionBinding
import com.emglab.qlsv.models.entity.Question

class FormQuestionAdapter (var questions: List<Question>): RecyclerView.Adapter<FormQuestionAdapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemFormQuestionBinding): RecyclerView.ViewHolder(binding.root){
        fun bindView(question: Question, index: Int){
            binding.index = index
            binding.question = question
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListItemFormQuestionBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item_form_question, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return questions.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(question = questions[position], index = position + 1)
    }
}