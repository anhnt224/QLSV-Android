package com.emglab.qlsv.modules.searchMotel.fragments

import android.graphics.Typeface
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.databinding.FragmentMotelRegistrationCompleteBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.models.entity.Motel
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistration
import com.emglab.qlsv.modules.searchMotel.viewModels.MotelRegistrationCompleteViewModel
import kotlinx.android.synthetic.main.fragment_motel_registration_complete.*
import javax.inject.Inject

class MotelRegistrationCompleteFragment : Fragment(), Injectable {

    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var binding: FragmentMotelRegistrationCompleteBinding
    private lateinit var viewModel: MotelRegistrationCompleteViewModel
    private var numberOfMotel = 0
    private var motelList: List<Motel> = listOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupViewModel()
        binding = FragmentMotelRegistrationCompleteBinding.inflate(inflater, container, false)

        val args = MotelRegistrationCompleteFragmentArgs.fromBundle(requireArguments())
        viewModel.getListMotel(args.motelRegistration.id)
        binding.apply {
            backButton.setOnClickListener {
                Navigation.findNavController(requireView()).navigateUp()
            }

            showButton.setOnClickListener {
                navigateToMotelRegistrationInfo(args.motelRegistration)
            }

            resultButton.setOnClickListener {
                navigateToListMotelResults(motelList)
            }

            resultText.text = getSpanTitle(numberOfMotel)

            callback = object : RetryCallback {
                override fun retry() {
                    viewModel.retry()
                }
            }
        }
        subscribeUI()
        return binding.root
    }

    private fun setupViewModel() {
        viewModel =
            ViewModelProvider(this, factory).get(MotelRegistrationCompleteViewModel::class.java)
    }

    private fun subscribeUI() {
        with(viewModel) {
            motelList.observe(viewLifecycleOwner) {
                binding.status = it.status
                if (checkResource(it)) {
                    it.data?.let { motelList ->
                        this@MotelRegistrationCompleteFragment.motelList = motelList
                        resultText.text = getSpanTitle(motelList.size)
                    }
                }
            }
        }
    }

    private fun navigateToMotelRegistrationInfo(motelRegistration: MotelRegistration) {
        val action =
            MotelRegistrationCompleteFragmentDirections.actionMotelRegistrationCompleteFragmentToMotelRegistrationInfoFragment(
                motelRegistration
            )
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToListMotelResults(motelList: List<Motel>) {
        val action =
            MotelRegistrationCompleteFragmentDirections.actionMotelRegistrationCompleteFragmentToListMotelResultsFragment(
                motelList.toTypedArray()
            )
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun getSpanTitle(numberOfMotel: Int): SpannableStringBuilder {
        val numberOfMotelStr = "$numberOfMotel phòng trọ"
        val title =
            "Yêu cầu của bạn đã được xử lí. Chúng tôi tìm được $numberOfMotelStr phù hợp với yêu cầu của bạn"

        val startIndex = title.indexOf(numberOfMotelStr)
        val length = numberOfMotelStr.length
        val spanContent = SpannableStringBuilder(title)

        val bold = StyleSpan(Typeface.BOLD)
        val greenText =
            ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.green500))
        spanContent.setSpan(
            bold,
            startIndex,
            startIndex + length,
            Spannable.SPAN_INCLUSIVE_INCLUSIVE
        )
        spanContent.setSpan(
            greenText,
            startIndex,
            startIndex + length,
            Spannable.SPAN_INCLUSIVE_INCLUSIVE
        )
        return spanContent
    }

}