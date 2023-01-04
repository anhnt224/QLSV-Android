package com.emglab.qlsv.modules.searchMotel.fragments

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.core.content.ContextCompat
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.FragmentMotelRegistrationInfoBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistration
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistrationStatus
import com.emglab.qlsv.modules.searchMotel.viewModels.MotelRegistrationInfoViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import javax.inject.Inject

class MotelRegistrationInfoFragment : Fragment(), Injectable {

    private lateinit var viewModel: MotelRegistrationInfoViewModel
    private lateinit var binding: FragmentMotelRegistrationInfoBinding
    private lateinit var motelRegistration: MotelRegistration
    private var remoteConfig = Firebase.remoteConfig

    @Inject
    lateinit var factory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupViewModel()
        setHasOptionsMenu(true)
        binding = FragmentMotelRegistrationInfoBinding.inflate(inflater, container, false)

        val args = MotelRegistrationInfoFragmentArgs.fromBundle(requireArguments())
        motelRegistration = args.motelRegistration
        fillInfo(motelRegistration)

        return binding.root
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this, factory).get(MotelRegistrationInfoViewModel::class.java)
    }

    @SuppressLint("SetTextI18n")
    private fun fillInfo(motelRegistration: MotelRegistration) {
        val status = motelRegistration.getStatus()
        binding.motelRegistrationStatus = status
        binding.motelRegistration = motelRegistration

        binding.apply {
            statusCard.setCardBackgroundColor(
                ContextCompat.getColor(root.context, status.statusBackground)
            )
            statusText.setTextColor(
                ContextCompat.getColor(root.context, status.statusTitleColor)
            )
        }

        if (status != MotelRegistrationStatus.PENDING) {
            binding.feeLayout.visibility = View.GONE
            return
        } else {
            binding.feeLayout.visibility = View.VISIBLE
        }

        binding.feeTitle.text = remoteConfig.getString("motel_pending_message")
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.registration_info_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.delete -> {
                handleDeleteButtonTap()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun handleDeleteButtonTap() {
        val dialog = MaterialAlertDialogBuilder(requireContext())
        dialog.setTitle("Xoá đăng kí")
        dialog.setMessage("Bạn có chắc chắn muốn xoá đăng kí tìm trọ này?")
        dialog.setPositiveButton("Bỏ qua", null)
        dialog.setNegativeButton("Xoá") { _, _ ->
            deleteMotelRegistration()
        }
        dialog.show()
    }

    private fun deleteMotelRegistration() {
        with(viewModel) {
            deleteMotelRegistration(motelRegistration.id)
            deleteResp.observe(viewLifecycleOwner) {
                binding.status = it.status
                if (it.status != Status.LOADING) {
                    deleteResp.removeObservers(viewLifecycleOwner)
                }
                if (checkResource(it)) {
                    popToList()
                }
            }
        }
    }

    private fun popToList() {
        showToast("Xoá thành công")
        MotelRegistrationListFragment.reloadData = true
        Navigation.findNavController(requireView()).navigateUp()
    }

}