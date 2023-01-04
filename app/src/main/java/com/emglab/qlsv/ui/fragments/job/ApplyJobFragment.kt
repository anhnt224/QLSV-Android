package com.emglab.qlsv.ui.fragments.job

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.ApplyJobFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.handleTokenInvalid
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.ui.viewmodels.job.ApplyJobViewModel
import javax.inject.Inject

class ApplyJobFragment : Fragment(), Injectable {

    companion object {
        fun newInstance() = ApplyJobFragment()
    }

    private lateinit var viewModel: ApplyJobViewModel
    private lateinit var binding: ApplyJobFragmentBinding
    @Inject
    lateinit var factory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.apply_job_fragment, container, false)
        val args = ApplyJobFragmentArgs.fromBundle(requireArguments())
        binding.apply {
            textCompany.text = args.company
            textTitle.text = args.jobTitle
            buttonApply.setOnClickListener {
                applyJob(args.jobID)
            }

            textPhone.editText!!.addTextChangedListener(object: TextWatcher{
                override fun afterTextChanged(s: Editable?) {
                    //
                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    //
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    if (!s.isNullOrEmpty()){
                        binding.textPhone.error = null
                    }
                }

            })

            textIntroduction.editText!!.addTextChangedListener(object: TextWatcher{
                override fun afterTextChanged(s: Editable?) {
                    //
                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    //
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    if (!s.isNullOrEmpty()){
                        binding.textIntroduction.error = null
                    }
                }

            })

            subscribeUI()
        }
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(ApplyJobViewModel::class.java)
    }

    private fun subscribeUI(){
        with(viewModel){
            applyJob.observe(viewLifecycleOwner){resource ->
                binding.resource = resource
                when(resource.status){
                    Status.SUCCESS_NETWORK -> {
                        showToast("Gửi thông tin ứng tuyển thành công")
                        Navigation.findNavController(requireView()).navigateUp()
                        binding.root.clearFocus()
                    }
                    Status.ERROR -> {
                        showToast(resource.respText.toString())
                    }
                    Status.ERROR_TOKEN -> {
                        handleTokenInvalid()
                    }
                }
            }
        }
    }

    private fun applyJob(jobID: Int){
        val phoneNumber = binding.textPhone.editText?.text.toString()
        val introduction = binding.textIntroduction.editText?.text.toString()
        if(phoneNumber.isNotEmpty() && introduction.isNotEmpty()){
            viewModel.applyJob(jobID, phoneNumber, introduction)
        }

        if(phoneNumber.isEmpty()){
            binding.textPhone.error = "Thiếu số điện thoại"
        }else{
            binding.textPhone.error = null
        }
        if(introduction.isEmpty()){
            binding.textIntroduction.error = "Thiếu giới thiệu"
        }else{
            binding.textIntroduction.error = null
        }

    }

}