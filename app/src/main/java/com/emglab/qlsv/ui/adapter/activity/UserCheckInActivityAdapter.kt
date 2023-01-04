package com.emglab.qlsv.ui.adapter.activity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.emglab.qlsv.R
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.DataBoundListAdapter
import com.emglab.qlsv.databinding.ListItemUserCheckInActivityBinding
import com.emglab.qlsv.models.entity.UserCheckInActivity
import com.emglab.qlsv.ui.diffCallbacks.UserCheckInActivityDiffCallback


class UserCheckInActivityAdapter(var appExecutors: AppExecutors

                                 ) : DataBoundListAdapter<UserCheckInActivity, ListItemUserCheckInActivityBinding>(
    appExecutors = appExecutors,
    diffCallback = UserCheckInActivityDiffCallback()
) {

    override fun createBinding(parent: ViewGroup): ListItemUserCheckInActivityBinding {
        val binding = DataBindingUtil.inflate<ListItemUserCheckInActivityBinding>(
            LayoutInflater.from(parent.context), R.layout.list_item_user_check_in_activity, parent, false)

        binding.root.setOnClickListener {
//            binding.activity?.let {
//                itemClick?.invoke(it)
//            }
        }
        return binding
    }

    override fun bind(binding: ListItemUserCheckInActivityBinding, item: UserCheckInActivity) {
        binding.userCheckInActivity = item
    }


}

//    : androidx.recyclerview.widget.RecyclerView.Adapter<UserCheckInActivityAdapter.ViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item_user_check_in_activity, parent, false)
//        return ViewHolder(v)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val userCheckInActivityInfo = userCheckInActivities[position]
//        holder.bindItems(userCheckInActivityInfo)
//    }
//
//    override fun getItemCount(): Int {
//        return userCheckInActivities.size
//    }
//
//    class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
//
//        fun bindItems(userCheckInActivityInfo: UserCheckInActivity) {
//
//            itemView.txtAddress.text = userCheckInActivityInfo.checkInAddress
//            itemView.txtTime.text = getTimeShow(userCheckInActivityInfo.checkInTime!!)
//
//        }
//
//        private fun getTimeShow(startTime: Date): String {
//            return "${startTime.converDateToStringYYYYMMDDHHMMSS().substring(0,20)}"
//        }
//    }
//}
//
