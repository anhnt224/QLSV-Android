package com.emglab.qlsv.teacher.fragment.gift

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.databinding.FragmentTGiftReceivedBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.teacher.viewmodel.gift.TGiftReceivedViewModel
import com.emglab.qlsv.ui.adapter.gift.GiftRegisteredAdapter
import javax.inject.Inject

class TGiftReceivedFragment : Fragment(), Injectable, GiftRegisteredAdapter.OnItemClickListener {
    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var viewModel: TGiftReceivedViewModel
    private lateinit var giftReceiverAdapter : GiftRegisteredAdapter
    private lateinit var binding : FragmentTGiftReceivedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupViewModel()
        binding = FragmentTGiftReceivedBinding.inflate(inflater, container, false)
        binding.number = 1
        giftReceiverAdapter = GiftRegisteredAdapter(
            listOf(),
            requireActivity(),
            sharedPrefsHelper.getUserName(),
            sharedPrefsHelper.getToken(),
            this
        )
        binding.recyclerView.apply {
            adapter = giftReceiverAdapter
            layoutManager = LinearLayoutManager(context)
        }

        subScribeUI()
        return binding.root
    }

    private fun subScribeUI(){
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
        viewModel = ViewModelProvider(this, factory).get(TGiftReceivedViewModel::class.java)
    }

    override fun onItemClick(gift: Gift) {
        val action = TGiftReceivedFragmentDirections.actionTGiftReceivedFragmentToTGiftInfoFragment(gift)
        Navigation.findNavController(requireView()).navigate(action)
    }

}