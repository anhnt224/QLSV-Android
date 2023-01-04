package com.emglab.qlsv.ui.fragments.user

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
import com.emglab.qlsv.databinding.ListAddressFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.UserAddress
import com.emglab.qlsv.ui.adapter.user.AddressAdapter
import com.emglab.qlsv.ui.viewmodels.user.ListAddressViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import javax.inject.Inject

class ListAddressFragment : Fragment(), Injectable, AddressAdapter.OnItemButtonClickListener {

    companion object {
        fun newInstance() = ListAddressFragment()
    }

    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var viewModel: ListAddressViewModel
    private lateinit var binding: ListAddressFragmentBinding
    private lateinit var addressAdapter: AddressAdapter
    private var addressSelected: UserAddress? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setUpViewModel()
        setHasOptionsMenu(true)
        binding = DataBindingUtil.inflate(inflater, R.layout.list_address_fragment, container, false)
        addressAdapter = AddressAdapter(arrayListOf(), this)
        viewModel.getListAddress()
        binding.apply {
            recyclerview.apply {
                adapter = addressAdapter
                layoutManager = LinearLayoutManager(context)
            }
            callback = object : RetryCallback {
                override fun retry() {
                    viewModel.getListAddress()
                }
            }
        }
        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(ListAddressViewModel::class.java)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_list_address, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.add -> {
                Navigation.findNavController(requireView()).navigate(ListAddressFragmentDirections.actionListAddressFragmentToAddNewAddressFragment())
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun subscribeUI(){
        with(viewModel){
            addresses.observe(viewLifecycleOwner){resource ->
                binding.resource = resource
                if(checkResource(resource) && resource.data != null){
                    addressAdapter.userAddresses = ArrayList(resource.data)
                    addressAdapter.notifyDataSetChanged()
                }
            }

            deleteAddress.observe(viewLifecycleOwner){
                if(checkResource(it)){
                    showToast("Xoá địa chỉ thành công")
                    if(addressSelected != null){
                        addressAdapter.userAddresses.remove(addressSelected!!)
                        addressAdapter.notifyDataSetChanged()
                    }
                }
            }
        }
    }

    override fun onButtonDelClick(address: UserAddress) {
        addressSelected = address
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Bạn muốn xoá địa chỉ này khỏi danh sách?")
            .setPositiveButton("Xoá"){_,_ ->
                viewModel.deleteAddress(address)
            }.setNegativeButton("Huỷ", null)
            .show()
    }

}