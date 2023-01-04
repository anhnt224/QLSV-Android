package com.emglab.qlsv.teacher.fragment.form

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.TFormDetailFragmentBinding
import com.emglab.qlsv.teacher.viewmodel.form.TFormDetailViewModel

class TFormDetailFragment : Fragment() {
    private lateinit var viewModel: TFormDetailViewModel
    private lateinit var binding: TFormDetailFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.t_form_detail_fragment, container, false)
        val form =  TFormDetailFragmentArgs.fromBundle(requireArguments()).form
        binding.form = form
        binding.buttonRegister.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(TFormDetailFragmentDirections.actionTFormDetailFragmentToTRegisterFormFragment(form))
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TFormDetailViewModel::class.java)
    }

}