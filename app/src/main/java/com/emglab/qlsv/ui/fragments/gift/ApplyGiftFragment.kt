package com.emglab.qlsv.ui.fragments.gift

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.RegistGiftFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showNotificationDialog
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.NotificationDialogType
import com.emglab.qlsv.models.entity.UserAddress
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.models.entity.gift.GiftRegister
import com.emglab.qlsv.ui.viewmodels.gift.ApplyGiftViewModel
import kotlinx.android.synthetic.main.create_gift_fragment.*
import kotlinx.android.synthetic.main.gift_info_fragment.*
import javax.inject.Inject

class ApplyGiftFragment : Fragment(), Injectable {

    companion object {
        var userAddress: UserAddress? = null
    }
    private lateinit var viewModel: ApplyGiftViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var binding: RegistGiftFragmentBinding
    private lateinit var gift: Gift

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.regist_gift_fragment,
            container,
            false
        )
        fillInfo()
        binding.apply {
            applyButton.setOnClickListener {
                applyGift()
            }
            pickAddressLayout.setEndIconOnClickListener {
                val action = ApplyGiftFragmentDirections.actionRegistGiftFragmentToReceiverAddressFragment()
                Navigation.findNavController(requireView()).navigate(action)
            }
        }
        if (userAddress != null){
            binding.pickAddressLayout.editText!!.setText(userAddress!!.address)
        }
        return binding.root
    }
    
    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(ApplyGiftViewModel::class.java)
    }

    private fun fillInfo(){
        gift = ApplyGiftFragmentArgs.fromBundle(requireArguments()).gift
        binding.gift = gift
        binding.apply {
            fullNameText.setText(sharedPrefsHelper.getFullName())
            emailText.setText(sharedPrefsHelper.getEmail())
        }
    }

    private fun applyGift(){
        val reason = binding.reasonText.text.toString()
        if (reason.isEmpty() || (gift.deliveryEnable == 1 && userAddress == null)){
            showToast("Vui lòng nhập đầy đủ thông tin")
            return
        }
        val giftRegister = GiftRegister(
            userCode = sharedPrefsHelper.getUserName(),
            giftId = gift.id,
            email = binding.emailText.text.toString(),
            reason = reason,
            address = userAddress?.address ?: "",
            addressId = userAddress?.id ?: 0
        )
        viewModel.applyGift(giftRegister)
        with(viewModel){
            applyGiftResp.observe(viewLifecycleOwner){
                binding.status = it.status
                if (checkResource(it)){
                    showNotificationDialog(
                        message = "Đăng kí quà tặng thành công",
                        type = NotificationDialogType.COMPLETE,
                        handleDone = {
                            popToListGifts()
                        },
                        cancelable = false
                    )
                }
                if (it.status != Status.LOADING){
                    applyGiftResp.removeObservers(viewLifecycleOwner)
                }
            }
        }
    }

    private fun popToListGifts(){
        val action = ApplyGiftFragmentDirections.actionRegistGiftFragmentToGiftReceiveFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }
}