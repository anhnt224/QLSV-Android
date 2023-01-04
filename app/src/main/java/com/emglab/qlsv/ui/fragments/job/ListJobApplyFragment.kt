package com.emglab.qlsv.ui.fragments.job

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.ListJobApplyFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.handleTokenInvalid
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.Job
import com.emglab.qlsv.ui.adapter.OnItemClickListener
import com.emglab.qlsv.ui.adapter.job.JobApplyAdapter
import com.emglab.qlsv.ui.viewmodels.job.ListJobApplyViewModel
import javax.inject.Inject

class ListJobApplyFragment : Fragment(), Injectable, OnItemClickListener<Job>{

    companion object {
        fun newInstance() = ListJobApplyFragment()
    }

    private lateinit var viewModel: ListJobApplyViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var binding: ListJobApplyFragmentBinding
    private lateinit var jobApplyAdapter: JobApplyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.list_job_apply_fragment, container, false)
        jobApplyAdapter = JobApplyAdapter(listOf(), this)
        binding.apply {
            number = 1
            recyclerview.apply {
                adapter = jobApplyAdapter
                layoutManager = LinearLayoutManager(context)
            }
            swipeRefreshLayout.setOnRefreshListener {
                viewModel.getListJobApply()
                swipeRefreshLayout.isRefreshing = false
            }

            callback = object : RetryCallback {
                override fun retry() {
                    viewModel.getListJobApply()
                }

            }
        }
        viewModel.getListJobApply()
        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(ListJobApplyViewModel::class.java)
    }

    private fun subscribeUI(){
        with(viewModel){
            listJobsApply.observe(viewLifecycleOwner){resource ->
                binding.resource = resource
                when(resource.status){
                    Status.SUCCESS_NETWORK -> {
                        if(resource.data != null){
                            if (resource.data.isEmpty()){
                                binding.number = 0
                            }else{
                                binding.number = 1
                            }
                            jobApplyAdapter.jobs = resource.data
                            jobApplyAdapter.notifyDataSetChanged()
                        }
                    }
                    Status.ERROR -> {
                        showToast(resource.respText.toString())
                    }
                    Status.ERROR_TOKEN -> {
                        handleTokenInvalid()
                    }
                }
            }
        }
    }

    override fun onClick(value: Job) {

    }

}