package com.emglab.qlsv.ui.adapter.user

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.emglab.qlsv.R
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.DataBoundListAdapter
import com.emglab.qlsv.databinding.ListItemMessageBinding
import com.emglab.qlsv.models.entity.Message
import com.emglab.qlsv.ui.diffCallbacks.MessageDiffCallback


class MessageAdapter(var appExecutors: AppExecutors,
                     private val itemClick: ((Message) -> Unit)?
) : DataBoundListAdapter<Message, ListItemMessageBinding>(
    appExecutors = appExecutors,
    diffCallback = MessageDiffCallback()
) {

    override fun createBinding(parent: ViewGroup): ListItemMessageBinding {
        val binding = DataBindingUtil.inflate<ListItemMessageBinding>(
            LayoutInflater.from(parent.context), R.layout.list_item_message, parent, false)

        binding.root.setOnClickListener {
            binding.message?.let {
                itemClick?.invoke(it)
            }
        }
        return binding
    }

    override fun bind(binding: ListItemMessageBinding, item: Message) {
        binding.message = item
    }
}
