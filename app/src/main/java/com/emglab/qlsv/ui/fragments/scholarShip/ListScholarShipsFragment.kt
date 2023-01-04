package com.emglab.qlsv.ui.fragments.scholarShip

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.ListScholarShipsFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.handleTokenInvalid
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.ScholarShip
import com.emglab.qlsv.ui.adapter.OnItemClickListener
import com.emglab.qlsv.ui.adapter.ScholarShipAdapter
import com.emglab.qlsv.ui.viewmodels.scholarShip.ListScholarShipsViewModel
import kotlinx.android.synthetic.main.list_scholar_ships_fragment.*
import javax.inject.Inject

class ListScholarShipsFragment : Fragment(), Injectable, OnItemClickListener<ScholarShip> {

    companion object {
        fun newInstance() = ListScholarShipsFragment()
    }

    private lateinit var viewModel: ListScholarShipsViewModel
    @Inject
    lateinit var factory: ViewModelFactory

    private lateinit var binding: ListScholarShipsFragmentBinding
    private lateinit var scholarShipAdapter: ScholarShipAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.list_scholar_ships_fragment, container, false)
        setUpViewModel()
        setHasOptionsMenu(true)
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
//        viewModel.getListScholarShips(0, 1000)
        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(ListScholarShipsViewModel::class.java)
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

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_list_scholarship, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.list -> {
                Navigation.findNavController(requireView()).navigate(ListScholarShipsFragmentDirections.actionListScholarShipsFragmentToListScholarShipAppliedFragment())
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

    override fun onClick(value: ScholarShip) {
        Navigation.findNavController(requireView()).navigate(ListScholarShipsFragmentDirections.actionListScholarShipsFragmentToScholarShipDetailFragment(value))
    }

}