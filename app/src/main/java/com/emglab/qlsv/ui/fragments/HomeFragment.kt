package com.emglab.qlsv.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.emglab.qlsv.MainActivity
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.HomeFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.ui.viewmodels.HomeViewModel
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import javax.inject.Inject

class HomeFragment : Fragment(), Injectable {

    companion object {
        fun newInstance() = HomeFragment()
    }

    @Inject lateinit var sharedPrefsHelper: SharedPrefsHelper

    private lateinit var viewModel: HomeViewModel
    private lateinit var binding: HomeFragmentBinding
    private val remoteConfig = Firebase.remoteConfig

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false)
        (activity as MainActivity).supportActionBar?.hide()
        binding.apply {
            textFullName.text = sharedPrefsHelper.getFullName()

            viewActivity.setOnClickListener {
                openListActivity()
            }

            viewScholarShip.setOnClickListener {
                openListScholarShip()
            }

            viewJob.setOnClickListener {
                openListJobs()
            }

            viewForm.setOnClickListener {
                openListForms()
            }

            viewCriteria.setOnClickListener {
                openTrainingPoint()
            }
            viewTimetable.setOnClickListener {
                openTimeTable()
            }

        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
    }

    private fun openListActivity(){
        Navigation.findNavController(requireView()).navigate(HomeFragmentDirections.actionHomeFragmentToListActivityFragment())
    }

    private fun openListScholarShip(){
        Navigation.findNavController(requireView()).navigate(HomeFragmentDirections.actionHomeFragmentToListScholarShipsFragment())
    }

    private fun openListJobs(){
        Navigation.findNavController(requireView()).navigate(HomeFragmentDirections.actionHomeFragmentToListJobsFragment())
    }

    private fun openListForms(){
        Navigation.findNavController(requireView()).navigate(HomeFragmentDirections.actionHomeFragmentToListFormsFragment())
    }

    private fun openTrainingPoint(){
        Navigation.findNavController(requireView()).navigate(HomeFragmentDirections.actionHomeFragmentToTrainingPointFragment())
    }

    private fun openTimeTable(){
        Navigation.findNavController(requireView()).navigate(HomeFragmentDirections.actionHomeFragmentToTimeTableFragment())
    }


}