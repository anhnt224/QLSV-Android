package com.emglab.qlsv.ui.fragments.gift

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.FragmentGiftReceiveBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.ui.adapter.gift.GiftRegisteredAdapter
import com.emglab.qlsv.ui.viewmodels.gift.GiftReceiveViewModel
import javax.inject.Inject

class GiftReceiveFragment : Fragment(), Injectable, GiftRegisteredAdapter.OnItemClickListener {

    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var viewModel: GiftReceiveViewModel
    private lateinit var binding : FragmentGiftReceiveBinding
    private lateinit var giftReceiverAdapter : GiftRegisteredAdapter

    @SuppressLint("FragmentBackPressedCallback")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_gift_receive, container, false)
        giftReceiverAdapter = GiftRegisteredAdapter(
            listOf(),
            requireActivity(),
            sharedPrefsHelper.getUserName(),
            sharedPrefsHelper.getToken(),
            this
        )
        binding.number = 1
        binding.recyclerView.apply {
            adapter = giftReceiverAdapter
            layoutManager = LinearLayoutManager(context)
        }
        val callback: OnBackPressedCallback =
            object : OnBackPressedCallback(true /* enabled by default */) {
                override fun handleOnBackPressed() {
                    Navigation.findNavController(requireView())
                        .navigate(GiftReceiveFragmentDirections.actionGiftReceiveFragmentToGiftFragment(false))
                }
            }
        requireActivity().onBackPressedDispatcher.addCallback(this, callback)

        subscribeUI()
        return binding.root
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun subscribeUI(){
        with(viewModel){
            giftsRegistered.observe(viewLifecycleOwner){
                if (checkResource(it) && it.data != null){
                    if (it.data.isEmpty()){
                        binding.number = 0
                    }else{
                        binding.number = 1
                    }
                    giftReceiverAdapter.gifts = it.data
                    giftReceiverAdapter.notifyDataSetChanged()
                }
            }
        }
    }

    private fun setupViewModel(){
        viewModel = ViewModelProvider(this, factory).get(GiftReceiveViewModel::class.java)
    }

    override fun onItemClick(gift: Gift) {
        val action = GiftReceiveFragmentDirections.actionGiftReceiveFragmentToGiftInfoFragment(gift)
        Navigation.findNavController(requireView()).navigate(action)
    }


}