package com.emglab.qlsv.ui.fragments.scholarShip

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
import com.emglab.qlsv.databinding.ListScholarShipAppliedFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.handleTokenInvalid
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.ui.adapter.ScholarShipAppliedAdapter
import com.emglab.qlsv.ui.viewmodels.scholarShip.ListScholarShipAppliedViewModel
import javax.inject.Inject

class ListScholarShipAppliedFragment : Fragment(), Injectable {

    companion object {
        fun newInstance() = ListScholarShipAppliedFragment()
    }
    @Inject lateinit var factory: ViewModelFactory
    private lateinit var viewModel: ListScholarShipAppliedViewModel
    private lateinit var binding: ListScholarShipAppliedFragmentBinding
    private lateinit var scholarShipAppliedAdapter: ScholarShipAppliedAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setUpViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.list_scholar_ship_applied_fragment, container, false)
        scholarShipAppliedAdapter = ScholarShipAppliedAdapter(listOf())
        binding.recyclerview.apply {
            adapter = scholarShipAppliedAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
        binding.callback = object : RetryCallback {
            override fun retry() {
                viewModel.getListScholarShips()
            }
        }
        viewModel.getListScholarShips()
        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(ListScholarShipAppliedViewModel::class.java)
    }

    private fun subscribeUI(){
        with(viewModel){
            listScholarShipsApplied.observe(viewLifecycleOwner){resource ->
                binding.resource = resource
                when(resource.status){
                    Status.SUCCESS_NETWORK -> {
                        if(resource.data != null){
                            scholarShipAppliedAdapter.scholarShips = resource.data
                            scholarShipAppliedAdapter.notifyDataSetChanged()
                        }
                    }
                    Status.ERROR_TOKEN -> {
                        handleTokenInvalid()
                    }
                    Status.ERROR -> {
                        showToast(resource.respText?:"")
                    }
                    else -> {

                    }
                }
            }
        }
    }

}