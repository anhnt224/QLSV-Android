package com.emglab.qlsv.ui.fragments.gift

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
import com.emglab.qlsv.databinding.GiftFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.ui.adapter.gift.GiftAdapter
import com.emglab.qlsv.ui.viewmodels.gift.GiftViewModel
import javax.inject.Inject

class GiftFragment : Fragment(), Injectable, GiftAdapter.OnItemClickListener{

    private lateinit var viewModel: GiftViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var binding: GiftFragmentBinding
    private lateinit var giftAdapter: GiftAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        setHasOptionsMenu(true)
        binding = DataBindingUtil.inflate(inflater, R.layout.gift_fragment, container, false)

        setUpRecyclerView()
        subscribeUi()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(GiftViewModel::class.java)
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun subscribeUi(){
        with(viewModel){
            gifts.observe(viewLifecycleOwner){
                binding.loadPublicGiftStatus = it.status
                if (checkResource(it) && it.data != null){
                    giftAdapter.gifts = it.data
                    giftAdapter.notifyDataSetChanged()
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_list_form, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.list -> {
                navigateToGiftReceived()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun navigateToGiftReceived(){
        val action = GiftFragmentDirections.actionGiftFragmentToGiftReceiveFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun setUpRecyclerView(){
        giftAdapter = GiftAdapter(
            listOf(),
            requireActivity(),
            this,
            userName = sharedPrefsHelper.getUserName(),
            token = sharedPrefsHelper.getToken()
        )

        binding.giftList.apply {
            adapter = giftAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }


    override fun onItemClick(gift: Gift) {
        navigateToGiftInfo(gift)
    }

    private fun navigateToGiftInfo(gift: Gift){
        val action = GiftFragmentDirections.actionGiftFragmentToGiftInfoFragment(gift)
        Navigation.findNavController(requireView()).navigate(action)
    }
}