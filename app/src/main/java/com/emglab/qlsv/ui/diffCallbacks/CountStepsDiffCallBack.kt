package com.emglab.qlsv.ui.diffCallbacks

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.emglab.qlsv.models.entity.CountSteps


class CountStepsDiffCallBack : DiffUtil.ItemCallback<CountSteps>() {

    override fun areItemsTheSame(oldItem: CountSteps, newItem: CountSteps): Boolean {
        return oldItem.id == newItem.id
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: CountSteps, newItem: CountSteps): Boolean {
        return oldItem == newItem
    }
}