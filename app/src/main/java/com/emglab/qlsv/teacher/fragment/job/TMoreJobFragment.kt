package com.emglab.qlsv.teacher.fragment.job

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.databinding.FragmentTMoreJobBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.models.entity.Job
import com.emglab.qlsv.teacher.viewmodel.job.TMoreJobViewModel
import com.emglab.qlsv.ui.adapter.OnItemClickListener
import com.emglab.qlsv.ui.adapter.job.JobAdapter
import javax.inject.Inject

class TMoreJobFragment : Fragment(), Injectable, OnItemClickListener<Job> {


    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var viewModel: TMoreJobViewModel
    private lateinit var binding : FragmentTMoreJobBinding
    private lateinit var jobAdapter: JobAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupViewModel()
        binding = FragmentTMoreJobBinding.inflate(inflater, container, false)
        binding.number = 1
        setupRecyclerView()
        binding.callback = object : RetryCallback {
            override fun retry() {
                viewModel.getMoreJob()
            }

        }
        subscriceUI()
        return binding.root
    }


    private fun setupRecyclerView(){
        jobAdapter = JobAdapter(listOf(), this)
        binding.recyclerView.apply {
            adapter = jobAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun subscriceUI(){
        with(viewModel){
            jobMediatorLiveData.observe(viewLifecycleOwner){
                binding.resource = it
                if (checkResource(it) && it.data != null){
                    if (it.data.isNotEmpty()){
                       binding.number = 1
                    }else{
                      binding.number = 0
                    }
                    jobAdapter.jobs = it.data
                    jobAdapter.notifyDataSetChanged()
                }
            }
        }
    }

    private fun setupViewModel(){
        viewModel = ViewModelProvider(this, factory).get(TMoreJobViewModel::class.java)
    }

    override fun onClick(value: Job) {
        Navigation.findNavController(requireView())
            .navigate(TMoreJobFragmentDirections.actionTMoreJobFragmentToTJobDetailFragment(value))
    }

}