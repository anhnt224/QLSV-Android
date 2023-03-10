package com.emglab.qlsv.teacher.fragment.gift

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
import com.emglab.qlsv.databinding.TListRegisterFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showActionDialog
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.gift.Gift
import com.emglab.qlsv.models.entity.gift.GiftRegister
import com.emglab.qlsv.models.entity.gift.UserApprove
import com.emglab.qlsv.teacher.viewmodel.gift.TListRegisterViewModel
import com.emglab.qlsv.ui.adapter.OnItemClickListener
import com.emglab.qlsv.ui.adapter.gift.GiftRegisterAdapter
import com.emglab.qlsv.ui.fragments.gift.ListRegisterFragmentArgs
import javax.inject.Inject
import kotlin.random.Random

class TListRegisterFragment : Fragment(), Injectable, OnItemClickListener<GiftRegister> {

    private lateinit var viewModel: TListRegisterViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var binding: TListRegisterFragmentBinding
    private lateinit var giftRegisterAdapter: GiftRegisterAdapter
    private lateinit var gift: Gift

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.t_list_register_fragment,
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
        viewModel = ViewModelProvider(this, factory).get(TListRegisterViewModel::class.java)
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
                    showToast("Duy???t qu?? t???ng th??nh c??ng")
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
                title = "T??? ch???i t???ng qu??",
                message = "B???n c?? ch???c ch???n mu???n t??? ch???i t???ng qu?? cho ng?????i n??y?",
                positiveButtonTitle = "T??? ch???i",
                handlePositiveButtonTap = {
                    value.cancel()
                    giftRegisterAdapter.notifyDataSetChanged()
                    reloadData()
                },
                negativeButtonTitle = "B??? qua"
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
        binding.quantity.text = "???? ch???n $quantitySelected/$totalQuantity"
    }

    private fun checkQuantity(): Boolean {
        val quantitySelected = giftRegisterAdapter.giftRegisters.filter {
            it.isApproved()
        }.size
        val totalQuantity = gift.quantity
        if (quantitySelected >= totalQuantity){
            showToast("B???n ???? ch???n l?????ng qu?? t???i ??a")
            return false
        }
        return true
    }

    private fun approve(){
        val userApproves = giftRegisterAdapter.giftRegisters.map {
            UserApprove(it.userCode, it.status)
        }
        if (userApproves.isEmpty()){
            showToast("Ch??a ch???n ng?????i nh???n qu??")
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