package com.emglab.qlsv.modules.searchMotel.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.databinding.FragmentListMotelResultsBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.models.entity.Motel
import com.emglab.qlsv.modules.searchMotel.viewModels.ListMotelResultsViewModel
import com.emglab.qlsv.ui.adapter.MotelInfoAdapter
import javax.inject.Inject

class ListMotelResultsFragment : Fragment(), Injectable,
    MotelInfoAdapter.OnItemMotelInfoClickListener {

    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var viewModel: ListMotelResultsViewModel
    private lateinit var binding: FragmentListMotelResultsBinding
    private lateinit var motelAdapter: MotelInfoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListMotelResultsBinding.inflate(inflater, container, false)
        setupViewModel()
        setupRecyclerView()

        return binding.root
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this, factory).get(ListMotelResultsViewModel::class.java)
    }

    private fun setupRecyclerView() {
        val args = ListMotelResultsFragmentArgs.fromBundle(requireArguments())
        motelAdapter = MotelInfoAdapter(args.motelList.toList(), this)
        binding.motelList.apply {
            adapter = motelAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    override fun navigateToMotelInfoDetailFragment(motel: Motel) {
        val action =
            ListMotelResultsFragmentDirections.actionListMotelResultsFragmentToMotelInfoFragment(
                motel
            )
        Navigation.findNavController(requireView()).navigate(action)
    }

}