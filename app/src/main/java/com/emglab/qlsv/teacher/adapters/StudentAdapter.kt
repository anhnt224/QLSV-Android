package com.emglab.qlsv.teacher.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemStudentBinding
import com.emglab.qlsv.models.entity.Student

class StudentAdapter(var students: List<Student>, var onItemStudentButtonClickLister: OnItemStudentButtonClickLister) : RecyclerView.Adapter<StudentAdapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemStudentBinding, var onItemStudentButtonClickLister: OnItemStudentButtonClickLister): RecyclerView.ViewHolder(binding.root){
        fun bindView(student: Student){
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
                btActivity.setOnClickListener {
                    onItemStudentButtonClickLister.onButtonActivityClick(student)
                }
                btInfo.setOnClickListener {
                    onItemStudentButtonClickLister.onButtonInfoClick(studentID = student.id)
                }
                btMark.setOnClickListener {
                    onItemStudentButtonClickLister.onButtonMarkClick(studentID = student.id, studentName = student.name)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(DataBindingUtil.inflate(inflater, R.layout.list_item_student, parent, false), onItemStudentButtonClickLister)
    }

    override fun getItemCount(): Int {
        return students.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(student = students[position])
    }
}

interface OnItemStudentButtonClickLister {
    fun onButtonActivityClick(student: Student)
    fun onButtonInfoClick(studentID: String)
    fun onButtonMarkClick(studentID: String, studentName: String)
}