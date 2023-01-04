package com.emglab.qlsv.ui.fragments.form

import android.annotation.SuppressLint
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
import com.emglab.qlsv.databinding.ChooseReciverAddressFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.models.entity.UserAddress
import com.emglab.qlsv.ui.adapter.OnItemClickListener
import com.emglab.qlsv.ui.adapter.form.AddressPickerAdapter
import com.emglab.qlsv.ui.viewmodels.form.ChooseReceiverAddressViewModel
import javax.inject.Inject

class ChooseReceiverAddressFragment : Fragment(), Injectable, OnItemClickListener<UserAddress> {

    companion object {
        fun newInstance() = ChooseReceiverAddressFragment()
    }

    @Inject
    lateinit var factory: ViewModelFactory

    private lateinit var viewModel: ChooseReceiverAddressViewModel
    private lateinit var addressPickerAdapter: AddressPickerAdapter
    private lateinit var binding: ChooseReciverAddressFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        binding = DataBindingUtil.inflate(inflater, R.layout.choose_reciver_address_fragment, container, false)
        setUpViewModel()
        addressPickerAdapter = AddressPickerAdapter(listOf(), ChooseDeliveryTypeFragment.userAddress, this)

        binding.recyclerView.apply {
            adapter = addressPickerAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
        viewModel.getListAddress()
        binding.callback = object : RetryCallback {
            override fun retry() {
                viewModel.getListAddress()
            }

        }
        binding.pickAddressButton.setOnClickListener {
            Navigation.findNavController(requireView()).navigateUp()
        }
        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(ChooseReceiverAddressViewModel::class.java)
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun subscribeUI(){
        with(viewModel) {
            addresses.observe(viewLifecycleOwner){
                binding.status = it.status
                if(checkResource(it) && it.data != null){
                    addressPickerAdapter.userAddressList = it.data
                    addressPickerAdapter.userAddressSelected = ChooseDeliveryTypeFragment.userAddress
                    addressPickerAdapter.notifyDataSetChanged()
                }
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onClick(value: UserAddress) {
        addressPickerAdapter.userAddressSelected = value
        addressPickerAdapter.notifyDataSetChanged()
        ChooseDeliveryTypeFragment.userAddress = value
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_list_address, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.add -> {
                Navigation.findNavController(requireView())
                    .navigate(
                        ChooseReceiverAddressFragmentDirections.actionChooseReceiverAddressFragmentToAddNewAddressFragment()
                    )
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

}