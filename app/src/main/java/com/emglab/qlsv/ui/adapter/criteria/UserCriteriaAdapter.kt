package com.emglab.qlsv.ui.adapter.criteria

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListItemUserCriteriaBinding
import com.emglab.qlsv.models.entity.UserCriteriaDetail
import com.emglab.qlsv.utilities.*

class UserCriteriaAdapter(private val userCriteriaDetails: List<UserCriteriaDetail>, val onCriteriaItemClick: OnCriteriaItemClick): RecyclerView.Adapter<UserCriteriaAdapter.ViewHolder>() {
    class ViewHolder(val binding: ListItemUserCriteriaBinding, private val onCriteriaItemClick: OnCriteriaItemClick): RecyclerView.ViewHolder(binding.root){
        fun bindView(userCriteriaDetail: UserCriteriaDetail){
            binding.userCriteriaDetail = userCriteriaDetail
            binding.apply {
                if(userCriteriaDetail.sPoint > 0){
                    viewStatus.setBackgroundColor(Color.parseColor(PENDING_COLOR))
                    textSPoint.setTextColor(Color.parseColor(PENDING_COLOR))
                }else{
                    viewStatus.setBackgroundColor(Color.parseColor(LIGHT_GRAY))
                    textSPoint.setTextColor(Color.parseColor(SECONDARY_TEXT_COLOR))
                }

                if(userCriteriaDetail.tPoint > 0){
                    viewStatus.setBackgroundColor(Color.parseColor(DONE_COLOR))
                    textTPoint.setTextColor(Color.parseColor(DONE_COLOR))
                }else{
                    textTPoint.setTextColor(Color.parseColor(SECONDARY_TEXT_COLOR))
                }

                //
                if(userCriteriaDetail.hasProof()){
                    textProof.setTextColor(Color.parseColor(DONE_COLOR))
                }else{
                    textProof.setTextColor(Color.parseColor(ACTION_COLOR))
                }

                if(userCriteriaDetail.description != ""){
                    textProof2.setTextColor(Color.parseColor(DONE_COLOR))
                }else{
                    textProof2.setTextColor(Color.parseColor(ACTION_COLOR))
                }

                textProof.setOnClickListener {
                    onCriteriaItemClick.onProofClick(userCriteriaDetail)
                }
                textProof2.setOnClickListener {
                    onCriteriaItemClick.onTextProofClick(userCriteriaDetail)
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(DataBindingUtil.inflate(inflater, R.layout.list_item_user_criteria, parent, false), onCriteriaItemClick)
    }

    override fun getItemCount(): Int {
        return userCriteriaDetails.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(userCriteriaDetails[position])
    }
}