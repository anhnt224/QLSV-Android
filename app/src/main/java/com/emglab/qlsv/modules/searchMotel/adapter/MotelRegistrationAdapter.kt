package com.emglab.qlsv.modules.searchMotel.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.databinding.MotelRegistrationItemBinding
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistration

class MotelRegistrationAdapter(
    private var motelRegistrationList: List<MotelRegistration>,
    private val listener: MotelRegistrationListener
) : RecyclerView.Adapter<MotelRegistrationAdapter.ViewHolder>() {

    inner class ViewHolder(
        private val binding: MotelRegistrationItemBinding,
        private val listener: MotelRegistrationListener
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindView(motelRegistration: MotelRegistration) {
            binding.motelRegistraion = motelRegistration
            val status = motelRegistration.getStatus()
            binding.status = status

            binding.apply {
                statusCard.setCardBackgroundColor(
                    ContextCompat.getColor(root.context, status.statusBackground)
                )
                statusText.setTextColor(
                    ContextCompat.getColor(root.context, status.statusTitleColor)
                )
                container.setCardBackgroundColor(
                    ContextCompat.getColor(root.context, status.cardBackground)
                )
                container.strokeColor =
                    ContextCompat.getColor(root.context, status.statusBackground)

                root.setOnClickListener {
                    listener.onItemClick(motelRegistration)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MotelRegistrationItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(motelRegistrationList[position])
    }

    override fun getItemCount(): Int {
        return motelRegistrationList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(motelRegistrationList: List<MotelRegistration>) {
        this.motelRegistrationList = motelRegistrationList
        notifyDataSetChanged()
    }
}

interface MotelRegistrationListener {
    fun onItemClick(motelRegistration: MotelRegistration)
}