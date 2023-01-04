package com.emglab.qlsv.modules_teacher.contactParent

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemStudent2Binding
import com.emglab.qlsv.models.entity.Student

class Student2Adapter(
    private var studentList: List<Student>,
    private val lister: Student2AdapterListener
) : RecyclerView.Adapter<Student2Adapter.ViewHolder>() {
    inner class ViewHolder(val binding: ListItemStudent2Binding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindView(student: Student) {
            binding.student = student
            binding.student = student
            val context = binding.root.context
            if(student.tScore > 0){
                binding.mainLayout.setCardBackgroundColor(ContextCompat.getColor(context, R.color.green5))
                binding.textTScore.setTextColor(ContextCompat.getColor(context, R.color.done))
            }else{
                binding.mainLayout.setCardBackgroundColor(ContextCompat.getColor(binding.root.context, R.color.colorWhite))
                binding.textTScore.setTextColor(ContextCompat.getColor(context, R.color.textColorPrimaryLight))
            }

            if(student.score > 0){
                binding.textScore.setTextColor(ContextCompat.getColor(context, R.color.pending))
            }else{
                binding.textScore.setTextColor(ContextCompat.getColor(context, R.color.textColorPrimaryLight))
            }

            when {
                student.warningLevel.contains("3") -> {
                    binding.layoutWarning.visibility = View.VISIBLE
                    binding.textWarning.setBackgroundColor(ContextCompat.getColor(context, R.color.cancel))
                }
                student.warningLevel.contains("2") -> {
                    binding.layoutWarning.visibility = View.VISIBLE
                    binding.textWarning.setBackgroundColor(ContextCompat.getColor(context, R.color.pending))
                }
                student.warningLevel.contains("1") -> {
                    binding.layoutWarning.visibility = View.VISIBLE
                    binding.textWarning.setBackgroundColor(ContextCompat.getColor(context, R.color.pending))
                }
                else -> {
                    binding.layoutWarning.visibility = View.GONE
                }
            }

            binding.apply {
                callButton.setOnClickListener {
                    lister.onCallButtonClick(student)
                }

                contactButton.setOnClickListener {
                    lister.onContactButtonClick(student)
                }

                infoButton.setOnClickListener {
                    lister.onInfoButtonClick(student)
                }

                root.setOnClickListener {
                    lister.onItemClick(student)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemStudent2Binding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student = studentList[position]
        holder.bindView(student)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateList(studentList: List<Student>){
        this.studentList = studentList
        notifyDataSetChanged()
    }
}

interface Student2AdapterListener {
    fun onCallButtonClick(student: Student)
    fun onContactButtonClick(student: Student)
    fun onInfoButtonClick(student: Student)
    fun onItemClick(student: Student)
}