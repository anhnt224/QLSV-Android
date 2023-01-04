package com.emglab.qlsv.teacher.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemStudentCriteriaBinding
import com.emglab.qlsv.models.entity.UserCriteriaDetail

class StudentCriteriaAdapter(private val userCriteriaDetails: List<UserCriteriaDetail>, private val onItemClickListener: OnItemClickListener) : RecyclerView.Adapter<StudentCriteriaAdapter.ViewHolder>(){
    class ViewHolder(val binding: ListItemStudentCriteriaBinding, val onItemClickListener: OnItemClickListener): RecyclerView.ViewHolder(binding.root){
        fun bindView(userCriteriaDetail: UserCriteriaDetail){
            binding.userCriteriaDetail = userCriteriaDetail

            binding.apply {
                btPlusScore.isEnabled = userCriteriaDetail.tPoint < userCriteriaDetail.maxPoint
                btMinusScore.isEnabled = userCriteriaDetail.tPoint > 0
            }

            //
            binding.btPlusScore.setOnClickListener {
                userCriteriaDetail.tPoint += 1
                binding.userCriteriaDetail = userCriteriaDetail
                onItemClickListener.onScoreChanged()
            }

            binding.btPlusScore.setOnLongClickListener{
                userCriteriaDetail.tPoint = userCriteriaDetail.maxPoint
                binding.userCriteriaDetail = userCriteriaDetail
                onItemClickListener.onScoreChanged()
                return@setOnLongClickListener true
            }

            binding.btMinusScore.setOnClickListener {
                userCriteriaDetail.tPoint -= 1
                binding.userCriteriaDetail = userCriteriaDetail
                onItemClickListener.onScoreChanged()
            }

            binding.textMark.setOnClickListener {
                onItemClickListener.onButtonCriteriaSelected(userCriteriaDetail)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(DataBindingUtil.inflate(inflater, R.layout.list_item_student_criteria, parent, false), onItemClickListener)
    }

    override fun getItemCount(): Int {
        return userCriteriaDetails.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(userCriteriaDetail = userCriteriaDetails[position])
    }

    interface OnItemClickListener{
        fun onScoreChanged()
        fun onButtonCriteriaSelected(userCriteriaDetail: UserCriteriaDetail)
    }
}