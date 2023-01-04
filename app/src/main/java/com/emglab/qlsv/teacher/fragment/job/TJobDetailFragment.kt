package com.emglab.qlsv.teacher.fragment.job

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.TJobDetailFragmentBinding
import com.emglab.qlsv.teacher.viewmodel.job.TJobDetailViewModel
import com.emglab.qlsv.ui.fragments.job.JobDetailFragment
import com.emglab.qlsv.ui.fragments.job.JobDetailFragmentArgs

class TJobDetailFragment : Fragment() {

    companion object {
        fun newInstance() = JobDetailFragment()
    }

    private lateinit var viewModel: TJobDetailViewModel
    private lateinit var binding: TJobDetailFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.t_job_detail_fragment, container, false)
        val job = JobDetailFragmentArgs.fromBundle(requireArguments()).job
        binding.job = job
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TJobDetailViewModel::class.java)
    }

}