package com.emglab.qlsv.teacher.fragment.scholarShip

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.TListScholarShipsFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.handleTokenInvalid
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.ScholarShip
import com.emglab.qlsv.teacher.viewmodel.scholarShip.TListScholarShipsViewModel
import com.emglab.qlsv.ui.adapter.OnItemClickListener
import com.emglab.qlsv.ui.adapter.ScholarShipAdapter
import com.emglab.qlsv.ui.fragments.scholarShip.ListScholarShipsFragment
import javax.inject.Inject

class TListScholarShipsFragment : Fragment(), Injectable, OnItemClickListener<ScholarShip> {

    companion object {
        fun newInstance() = ListScholarShipsFragment()
    }

    private lateinit var viewModel: TListScholarShipsViewModel
    @Inject
    lateinit var factory: ViewModelFactory

    private lateinit var binding: TListScholarShipsFragmentBinding
    private lateinit var scholarShipAdapter: ScholarShipAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.t_list_scholar_ships_fragment, container, false)
        setUpViewModel()
        scholarShipAdapter = ScholarShipAdapter(arrayListOf(), this)
        binding.apply {
            recyclerview.apply {
                adapter = scholarShipAdapter
                layoutManager = LinearLayoutManager(context)
            }

            swipeRefreshLayout.setOnRefreshListener {
                viewModel.getListScholarShips(0, 1000)
                swipeRefreshLayout.isRefreshing = false
            }

            callback = object : RetryCallback {
                override fun retry() {
                    viewModel.getListScholarShips(0, 1)
                }
            }

        }
        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(TListScholarShipsViewModel::class.java)
    }
    private fun subscribeUI(){
        with(viewModel){
            listScholarShips.observe(viewLifecycleOwner){resource ->
                binding.resource = resource
                when(resource.status){
                    Status.SUCCESS_NETWORK -> {
                        if(resource.data != null){
                            scholarShipAdapter.scholarShips = resource.data
                            scholarShipAdapter.notifyDataSetChanged()
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

    override fun onClick(value: ScholarShip) {
        Navigation.findNavController(requireView()).navigate(TListScholarShipsFragmentDirections.actionTListScholarShipsFragmentToTScholarShipDetailFragment(value))
    }

}