package com.emglab.qlsv.ui.fragments.gift

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.databinding.ReceiverAddressFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.models.entity.UserAddress
import com.emglab.qlsv.ui.adapter.OnItemClickListener
import com.emglab.qlsv.ui.adapter.form.AddressPickerAdapter
import com.emglab.qlsv.ui.fragments.form.ChooseDeliveryTypeFragment
import com.emglab.qlsv.ui.viewmodels.gift.ReceiverAddressViewModel
import javax.inject.Inject

class ReceiverAddressFragment : Fragment(), Injectable, OnItemClickListener<UserAddress> {

    private lateinit var viewModel: ReceiverAddressViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var binding: ReceiverAddressFragmentBinding
    private lateinit var addressPickerAdapter: AddressPickerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.receiver_address_fragment,
            container,
            false
        )
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
        viewModel = ViewModelProvider(this, factory).get(ReceiverAddressViewModel::class.java)
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun subscribeUI(){
        with(viewModel) {
            addresses.observe(viewLifecycleOwner){
                binding.status = it.status
                if(checkResource(it) && it.data != null){
                    addressPickerAdapter.userAddressList = it.data
                    addressPickerAdapter.userAddressSelected = ApplyGiftFragment.userAddress
                    addressPickerAdapter.notifyDataSetChanged()
                }
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onClick(value: UserAddress) {
        addressPickerAdapter.userAddressSelected = value
        addressPickerAdapter.notifyDataSetChanged()
        ApplyGiftFragment.userAddress = value
    }

}