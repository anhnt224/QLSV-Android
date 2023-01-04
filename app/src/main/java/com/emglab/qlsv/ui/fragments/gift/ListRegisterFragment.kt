package com.emglab.qlsv.ui.fragments.gift

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.ListRegisterFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showActionDialog
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.models.entity.gift.GiftRegister
import com.emglab.qlsv.models.entity.gift.UserApprove
import com.emglab.qlsv.ui.adapter.OnItemClickListener
import com.emglab.qlsv.ui.adapter.gift.GiftRegisterAdapter
import com.emglab.qlsv.ui.viewmodels.gift.ListRegisterViewModel
import javax.inject.Inject
import kotlin.random.Random

class ListRegisterFragment : Fragment(), Injectable, OnItemClickListener<GiftRegister> {

    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var viewModel: ListRegisterViewModel
    private lateinit var binding: ListRegisterFragmentBinding
    private lateinit var giftRegisterAdapter: GiftRegisterAdapter
    private lateinit var gift: Gift

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.list_register_fragment,
            container,
            false
        )
        setUpRecyclerView()
        gift = ListRegisterFragmentArgs.fromBundle(requireArguments()).gift
        binding.giftName.text = gift.name
        viewModel.getGiftRegisters(gift.id)
        binding.approveButton.setOnClickListener {
            approve()
        }
        subscribeUi()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(ListRegisterViewModel::class.java)
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun subscribeUi(){
        viewModel.apply {
            giftRegisters.observe(viewLifecycleOwner){
                binding.getRegistersStatus = it.status
                if (checkResource(it) && it.data != null ){
                    giftRegisterAdapter.giftRegisters = it.data
                    giftRegisterAdapter.notifyDataSetChanged()
                    reloadData()
                }
            }
            approveResp.observe(viewLifecycleOwner){
                binding.status = it.status
                if (checkResource(it)){
                    showToast("Duyệt quà tặng thành công")
                }
            }
        }
    }

    private fun setUpRecyclerView(){
        giftRegisterAdapter = GiftRegisterAdapter(listOf(), this)
        binding.giftRegisterList.apply {
            adapter = giftRegisterAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onClick(value: GiftRegister) {
        if (value.isApproved()){
            showActionDialog(
                title = "Từ chối tặng quà",
                message = "Bạn có chắc chắn muốn từ chối tặng quà cho người này?",
                positiveButtonTitle = "Từ chối",
                handlePositiveButtonTap = {
                    value.cancel()
                    giftRegisterAdapter.notifyDataSetChanged()
                    reloadData()
                },
                negativeButtonTitle = "Bỏ qua"
            )

        }else{
            if (checkQuantity()){
                value.approve()
                giftRegisterAdapter.notifyDataSetChanged()
                reloadData()
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun reloadData(){
        val quantitySelected = giftRegisterAdapter.giftRegisters.filter {
            it.isApproved()
        }.size
        val totalQuantity = gift.quantity
        binding.quantity.text = "Đã chọn $quantitySelected/$totalQuantity"
    }
    
    private fun checkQuantity(): Boolean {
        val quantitySelected = giftRegisterAdapter.giftRegisters.filter {
            it.isApproved()
        }.size
        val totalQuantity = gift.quantity
        if (quantitySelected >= totalQuantity){
            showToast("Bạn đã chọn lượng quà tối đa")
            return false
        }
        return true
    }

    private fun approve(){
        val userApproves = giftRegisterAdapter.giftRegisters.map {
            UserApprove(it.userCode, it.status)
        }
        if (userApproves.isEmpty()){
            showToast("Chưa chọn người nhận quà")
            return
        }

        showApproveDialog(userApproves)
    }

    private fun showApproveDialog(userApproves: List<UserApprove>){
        val dialog = Dialog(requireContext())
        dialog.setContentView(R.layout.approve_gift_code)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        dialog.setCancelable(false)
        val code = Random.nextInt(1000, 9999)
        val codeText: TextView = dialog.findViewById(R.id.codeText)
        codeText.text = code.toString()

        val positiveButton: Button = dialog.findViewById(R.id.positiveButton)
        positiveButton.setOnClickListener {
            viewModel.approve(gift.id, userApproves)
            dialog.dismiss()
        }

        val negativeButton: Button = dialog.findViewById(R.id.negativeButton)
        negativeButton.setOnClickListener {
            dialog.dismiss()
        }

        val editText: EditText = dialog.findViewById(R.id.editText)
        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                positiveButton.isEnabled = (p0.toString() == codeText.text.toString())
            }

            override fun afterTextChanged(p0: Editable?) {}

        })

        dialog.show()
    }
}