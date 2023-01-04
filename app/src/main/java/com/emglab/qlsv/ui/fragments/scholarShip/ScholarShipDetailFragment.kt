package com.emglab.qlsv.ui.fragments.scholarShip

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import com.emglab.qlsv.R
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.ScholarShipDetailFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.handleTokenInvalid
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.ScholarShip
import com.emglab.qlsv.ui.viewmodels.scholarShip.ScholarShipDetailViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import javax.inject.Inject

class ScholarShipDetailFragment : Fragment(), Injectable {

    companion object {
        fun newInstance() = ScholarShipDetailFragment()
    }

    private lateinit var viewModel: ScholarShipDetailViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var binding: ScholarShipDetailFragmentBinding
    var scholarShip: ScholarShip? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setUpViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.scholar_ship_detail_fragment, container, false)
        scholarShip = ScholarShipDetailFragmentArgs.fromBundle(requireArguments()).scholarShip
        binding.scholarShip = scholarShip
        binding.buttonApply.setOnClickListener {
            if(scholarShip != null){
                handleApplyScholarShip(scholarShip!!)
            }
        }
        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(ScholarShipDetailViewModel::class.java)
    }
    private fun subscribeUI(){
        with(viewModel){
            applyScholarShip.observe(viewLifecycleOwner){resource ->
                binding.resource = resource
                when(resource.status){
                    Status.SUCCESS_NETWORK -> {
                        showToast("Đăng kí học bổng thành công")
                        binding.layoutAction.visibility = View.GONE
                    }
                    Status.ERROR -> {
                        showToast(resource.respText.toString())
                    }
                    Status.ERROR_TOKEN -> {
                        handleTokenInvalid()
                    }
                    else -> {

                    }
                }
            }
        }
    }

    private fun handleApplyScholarShip(scholarShip: ScholarShip){
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Đăng kí học bổng")
            .setMessage("Xác nhận đăng kí học bổng: \"${scholarShip.title}}\"")
            .setPositiveButton("Đăng kí"){_, _ ->
                viewModel.applyScholarShip(scholarShip.id)
            }.setNegativeButton("Hủy"){_, _ ->

            }.show()
    }

}