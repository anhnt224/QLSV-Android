package com.emglab.qlsv.ui.adapter.activity

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.emglab.qlsv.R
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.DataBoundListAdapter
import com.emglab.qlsv.databinding.ListItemActivityBinding
import com.emglab.qlsv.ui.diffCallbacks.ActivityDiffCallback
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.models.entity.UserActivity


class ActivityAdapter(
    var appExecutors: AppExecutors,
    private val itemClick: OnItemClickListener
) : DataBoundListAdapter<Activity, ListItemActivityBinding>(
    appExecutors = appExecutors,
    diffCallback = ActivityDiffCallback()
) {

    override fun createBinding(parent: ViewGroup): ListItemActivityBinding {
        return DataBindingUtil.inflate<ListItemActivityBinding>(
            LayoutInflater.from(parent.context), R.layout.list_item_activity, parent, false)
    }

    override fun bind(binding: ListItemActivityBinding, item: Activity) {
        binding.activity = item
        binding.textStatus.setTextColor(Color.parseColor(item.getUAStatusColor()))
        binding.userActivity = UserActivity(uaStatus = item.uAStatus)
        binding.root.setOnClickListener {
            itemClick.onItemClick(activity = item)
        }
    }

    interface OnItemClickListener{
        fun onItemClick(activity: Activity)
    }

}
