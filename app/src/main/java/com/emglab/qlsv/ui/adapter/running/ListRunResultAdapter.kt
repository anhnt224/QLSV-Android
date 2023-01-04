package com.emglab.qlsv.ui.adapter.running

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.inflate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListRunResultItemBinding
import com.emglab.qlsv.models.entity.run.RunResult

class ListRunResultAdapter(
    var runResultMap: Map<String, List<RunResult>>
): RecyclerView.Adapter<ListRunResultAdapter.ViewHolder>() {
    inner class ViewHolder(
        private val binding: ListRunResultItemBinding
        ): RecyclerView.ViewHolder(binding.root){

        private lateinit var runResultAdapter: RunResultAdapter

        @SuppressLint("SetTextI18n")
        fun bindView(position: Int){
            val key = runResultMap.keys.toList()[position]
            val runResults: List<RunResult> = runResultMap[key] ?: listOf()

            var totalDistanceValid = 0.0
            var totalDistance = 0.0
            runResults.forEach {
                if (it.isValid()){
                    totalDistanceValid += it.distance
                }
                totalDistance += it.distance
            }
            runResultAdapter = RunResultAdapter(runResults)
            binding.apply {
                textViewRunDay.text = key
                if (totalDistanceValid > 100){
                    textViewDistance.text = "${String.format("%.2f", totalDistanceValid/1000)}" +
                            "/${String.format("%.2f", totalDistance/1000)}km"
                }else{
                    textViewDistance.text = "${String.format("%.0f", totalDistanceValid)}" +
                            "/${String.format("%.0f", totalDistance)}m"
                }

                recyclerViewListRunResult.apply {
                    adapter = runResultAdapter
                    layoutManager = LinearLayoutManager(binding.root.context)
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ListRunResultItemBinding = inflate(inflater,
            R.layout.list_run_result_item,
            parent,
            false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.bindView(position)
    }

    override fun getItemCount(): Int {
        return runResultMap.keys.size
    }
}