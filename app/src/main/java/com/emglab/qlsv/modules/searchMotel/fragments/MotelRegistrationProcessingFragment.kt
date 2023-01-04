package com.emglab.qlsv.modules.searchMotel.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.emglab.qlsv.databinding.FragmentMotelRegistrationProcessingBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistration
import com.emglab.qlsv.modules.searchMotel.viewModels.MotelRegistrationProcessingViewModel

class MotelRegistrationProcessingFragment : Fragment(), Injectable {

    private lateinit var viewModel: MotelRegistrationProcessingViewModel
    private lateinit var binding: FragmentMotelRegistrationProcessingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMotelRegistrationProcessingBinding.inflate(inflater, container, false)

        val args = MotelRegistrationProcessingFragmentArgs.fromBundle(requireArguments())

        binding.apply {
            backButton.setOnClickListener {
                Navigation.findNavController(requireView()).navigateUp()
            }

            showButton.setOnClickListener {
                navigateToMotelRegistrationInfo(args.motelRegistration)
            }
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MotelRegistrationProcessingViewModel::class.java)
    }

    private fun navigateToMotelRegistrationInfo(motelRegistration: MotelRegistration) {
        val action =
            MotelRegistrationProcessingFragmentDirections.actionMotelRegistrationProcessingFragmentToMotelRegistrationInfoFragment(
                motelRegistration
            )
        Navigation.findNavController(requireView()).navigate(action)
    }


}