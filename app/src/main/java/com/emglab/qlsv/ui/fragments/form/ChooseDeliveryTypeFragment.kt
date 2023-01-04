package com.emglab.qlsv.ui.fragments.form

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ChooseDeliveryTypeFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.UserAddress
import com.emglab.qlsv.ui.viewmodels.form.ChooseDeliveryTypeViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import javax.inject.Inject

class ChooseDeliveryTypeFragment : Fragment(), Injectable {

    companion object {
        var userAddress: UserAddress? = null
    }

    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper

    private lateinit var viewModel: ChooseDeliveryTypeViewModel
    private lateinit var binding: ChooseDeliveryTypeFragmentBinding
    private var remoteConfig = Firebase.remoteConfig
    private val receiveAtSchool = 0
    private val receiveScan = 1
    private val receiveAtHome = 2
    private var receiveAtSchoolStr = ""
    private var receiveScanStr = ""
    private var receiveAtHomeStr = ""
    private var note = ""
    private val TAG = "_CHOOSE_DELIVERY_TYPE"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.choose_delivery_type_fragment, container, false)

        getDataFromRemoteConfig()

        fillStudentInfo()
        fillAddressInfo()
        binding.apply {

            deliveryTypeTil.editText?.setText(receiveAtSchoolStr)

            doneButton.setOnClickListener {
                registerForm()
            }

            deliveryTypeTil.setOnClickListener {
                chooseDeliveryType()
            }

            deliveryTypeTil.setEndIconOnClickListener {
                chooseDeliveryType()
            }

            addressTil.setOnClickListener {
                chooseAddress()
            }

            addressTil.setEndIconOnClickListener {
                chooseAddress()
            }
        }

        subscribeUI()
        return binding.root
    }

    private fun getDataFromRemoteConfig() {
        receiveAtSchoolStr = remoteConfig.getString("receive_at_school")
        receiveScanStr = remoteConfig.getString("receive_scan_file")
        receiveAtHomeStr = remoteConfig.getString("receive_at_home")
        note = remoteConfig.getString("form_delivery_note")
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(ChooseDeliveryTypeViewModel::class.java)
    }

    private fun subscribeUI(){
        with(viewModel){
            deliveryType.observe(viewLifecycleOwner){
                when(it){
                    0 -> {
                        binding.deliveryTypeTil.editText?.setText(receiveAtSchoolStr)
                        hideAddressTil()
                    }
                    1 -> {
                        binding.deliveryTypeTil.editText?.setText(receiveScanStr)
                        hideAddressTil()
                    }
                    2 -> {
                        binding.deliveryTypeTil.editText?.setText(receiveAtHomeStr)
                        showAddressTil()
                    }
                }
            }

            registerForm.observe(viewLifecycleOwner){
                binding.status = it.status
                if (checkResource(it)){
                    showToast("Đăng kí giấy tờ thành công")
                    Navigation.findNavController(requireView()).navigateUp()
                }
            }
        }
    }

    private fun fillStudentInfo(){
        binding.apply {
            studentNameTil.editText?.setText(sharedPrefsHelper.getFullName())
            studentIdTil.editText?.setText(sharedPrefsHelper.getUserName())
        }
    }

    private fun chooseDeliveryType(){
        val receiveAtSchoolStr = remoteConfig.getString("receive_at_school")
        val receiveScanStr = remoteConfig.getString("receive_scan_file")
        val receiveAtHomeStr = remoteConfig.getString("receive_at_home")
        val deliveryTypes = arrayOf(receiveAtSchoolStr, receiveScanStr, receiveAtHomeStr)
        val checked  = viewModel.deliveryType.value ?: 0
        MaterialAlertDialogBuilder(requireContext()).setTitle("Chọn hình thức nhận giấy tờ")
            .setSingleChoiceItems(deliveryTypes, checked){dialog, which ->
                when(which){
                    0 -> {
                        viewModel.setDeliveryType(receiveAtSchool)
                    }
                    1 -> {
                        viewModel.setDeliveryType(receiveScan)
                    }
                    2 -> {
                        viewModel.setDeliveryType(receiveAtHome)
                    }
                }
                dialog.dismiss()
            }.show()
    }

    private fun showAddressTil(){
        binding.apply {
            noteTextView.visibility = View.VISIBLE
            noteTextView.text = note
            addressTil.visibility = View.VISIBLE
        }
    }

    private fun hideAddressTil(){
        binding.apply {
            noteTextView.visibility = View.GONE
            noteTextView.text = ""
            addressTil.visibility = View.GONE
        }
    }

    private fun chooseAddress(){
        Navigation.findNavController(requireView()).navigate(
            ChooseDeliveryTypeFragmentDirections.actionChooseDeliveryTypeFragmentToChooseReceiverAddressFragment(
                userAddress
            )
        )
    }

    private fun fillAddressInfo(){
        if(userAddress != null){
            binding.addressTil.editText?.setText(userAddress!!.address)
        }
    }

    private fun registerForm(){
        val deliveryType = viewModel.deliveryType.value ?: 0
        if (deliveryType == receiveAtHome && userAddress == null){
            showToast("Bạn thiếu thông tin địa chỉ nhận giấy tờ")
            return
        }

        var studentContactID = 0
        if(deliveryType == receiveAtHome){
            studentContactID = userAddress!!.id
        }

        val questions = ChooseDeliveryTypeFragmentArgs.fromBundle(requireArguments()).forms
        viewModel.registerForm(
            questions = questions.toList(),
            deliveryType = deliveryType,
            studentContactID = studentContactID
        )

        Log.d(TAG, "studentContactID: $studentContactID - DeliveryType: $deliveryType")


    }

}