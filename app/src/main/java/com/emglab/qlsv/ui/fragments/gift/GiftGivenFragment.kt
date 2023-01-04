package com.emglab.qlsv.ui.fragments.gift

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.annotation.MenuRes
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.GiftGivenFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showActionDialog
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.ui.adapter.gift.GiftCreatedAdapter
import com.emglab.qlsv.ui.viewmodels.gift.GiftGivenViewModel
import javax.inject.Inject

class GiftGivenFragment : Fragment(), Injectable, GiftCreatedAdapter.OnItemClickListener {

    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var binding: GiftGivenFragmentBinding
    private lateinit var viewModel: GiftGivenViewModel
    private lateinit var giftCreatedAdapter: GiftCreatedAdapter
    private var giftSelected: Gift? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.gift_given_fragment,
            container,
            false
        )
        binding.number = 1
        setUpRecyclerView()
        val reloadData = GiftGivenFragmentArgs.fromBundle(requireArguments()).reloadData
        if (reloadData){
            viewModel.getGiftsByCreateId()
        }
        binding.apply {
            addFab.setOnClickListener {
                navigateToCreateGift()
            }
            swipeRefreshLayout.setOnRefreshListener {
                swipeRefreshLayout.isRefreshing = false
                viewModel.getGiftsByCreateId()
            }
            callback = object : com.emglab.qlsv.common.RetryCallback {
                override fun retry() {
                    viewModel.getGiftsByCreateId()
                }
            }
        }

        subscribeUi()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(GiftGivenViewModel::class.java)
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun subscribeUi(){
        viewModel.apply {
            gifts.observe(viewLifecycleOwner){
                binding.resource = it
                if (checkResource(it)  && it.data != null){
                    if (it.data.isEmpty()){
                        binding.number = 0
                    }else{
                        binding.number = 1
                    }
                    reloadData(it.data)
                }
            }
            deleteGiftResp.observe(viewLifecycleOwner){
                if (checkResource(it)){
                    showToast("Xoá quà tặng thành công")
                    if (giftSelected != null){
                        giftCreatedAdapter.gifts.remove(giftSelected!!)
                        giftCreatedAdapter.notifyDataSetChanged()
                    }
                }
            }
        }
    }

    private fun navigateToCreateGift(){
        val action = GiftGivenFragmentDirections.actionGiftGivenFragmentToCreateGiftFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun setUpRecyclerView(){
        giftCreatedAdapter = GiftCreatedAdapter(
            arrayListOf(),
            requireActivity(),
            this,
            userName = sharedPrefsHelper.getUserName(),
            token = sharedPrefsHelper.getToken()
        )
        binding.giftCreatedList.apply {
            adapter = giftCreatedAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun reloadData(gifts: List<Gift>){
        giftCreatedAdapter.gifts = ArrayList(gifts)
        giftCreatedAdapter.notifyDataSetChanged()
    }

    override fun onItemClick(gift: Gift) {
        //
    }

    override fun onMoreButtonClick(gift: Gift, view: View) {
        showMenu(view, R.menu.gift_menu, gift)
    }

    private fun showMenu(v: View, @MenuRes menu: Int, gift: Gift){
        val popup = PopupMenu(requireContext(), v)
        popup.menuInflater.inflate(menu, popup.menu)
        popup.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId){
//                R.id.update -> {
//
//                }
                R.id.register_list -> {
                    navigateToListRegister(gift)
                }
                R.id.delete -> {
                    deleteGift(gift = gift)
                }
            }
            true
        }
        popup.show()
    }

    private fun navigateToListRegister(gift: Gift){
        val action = GiftGivenFragmentDirections.actionGiftGivenFragmentToListRegisterFragment(gift)
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun deleteGift(gift: Gift){
        showActionDialog(
            title = "Xoá quà tặng",
            message = "Bạn có chắc chắn muốn xoá quà tặng này?",
            positiveButtonTitle = "Xoá",
            icon = R.drawable.ic_delete,
            handlePositiveButtonTap = {
                giftSelected = gift
                viewModel.deleteGift(gift.id)
            }
        )

    }
}