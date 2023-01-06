package com.emglab.qlsv.teacher.fragment

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.THome2FragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.teacher.viewmodel.THome2ViewModel
import com.emglab.qlsv.ui.adapter.activity.EventAdapter
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import javax.inject.Inject

class THome2Fragment : Fragment(), Injectable, EventAdapter.OnItemClickListener {

    private lateinit var viewModel: THome2ViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var binding: THome2FragmentBinding
    private lateinit var eventAdapter: EventAdapter
    private val remoteConfig = Firebase.remoteConfig

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.t_home2_fragment,
            container,
            false
        )
        binding.apply {
            titleTextView.text = "Chào ${sharedPrefsHelper.getFullName()}"
            titleWelcome.text = remoteConfig.getString("titleWelcome2")
        }
        setUpRecyclerView(binding)
        subscribeUi()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(THome2ViewModel::class.java)
    }

    private fun setUpRecyclerView(binding: THome2FragmentBinding){
        eventAdapter = EventAdapter(listOf(), requireActivity(), this)
        binding.recyclerView.apply {
            adapter = eventAdapter
            layoutManager = LinearLayoutManager(
                context,
                LinearLayoutManager.HORIZONTAL,
                false
            )
        }

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun subscribeUi(){
        with(viewModel){
            activities.observe(viewLifecycleOwner){
                binding.getActivityStatus = it.status
                if (checkResource(it)){
                    eventAdapter.activities = it.data?: listOf()
                    eventAdapter.notifyDataSetChanged()
                }
            }
        }
    }

//    private fun showListForm(){
//        val action = THome2FragmentDirections.actionTHome2FragmentToTListFormFragment()
//        Navigation.findNavController(requireView()).navigate(action)
//    }
//
//    private fun showListActivities(){
//        val action = THome2FragmentDirections.actionTHome2FragmentToTListActivitiesFragment()
//        Navigation.findNavController(requireView()).navigate(action)
//    }
//
//    private fun showListScholarShips(){
//        val action = THome2FragmentDirections.actionTHome2FragmentToTListScholarShipsFragment()
//        Navigation.findNavController(requireView()).navigate(action)
//    }
//
//    private fun showListJobs(){
//        val action = THome2FragmentDirections.actionTHome2FragmentToTListJobsFragment()
//        Navigation.findNavController(requireView()).navigate(action)
//    }
//
//    private fun showListStudent(){
//        val action = THome2FragmentDirections.actionTHome2FragmentToListStudentFragment()
//        Navigation.findNavController(requireView()).navigate(action)
//    }
//
//    private fun showRunDashboard(){
//        val action = THome2FragmentDirections.actionTHome2FragmentToRunDashboardFragment2()
//        Navigation.findNavController(requireView()).navigate(action)
//    }
//
//    private fun navigateToGiftGiven(){
//        val action = THome2FragmentDirections.actionTHome2FragmentToTGiftGivenFragment(true)
//        Navigation.findNavController(requireView()).navigate(action)
//    }
//
//    private fun openLink(link: String){
//        try {
//            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
//            startActivity(intent)
//        }catch (e: Exception){
//        }
//    }
//
//    private fun navigateMoreJob(){
//        val action = THome2FragmentDirections.actionTHome2FragmentToTMoreJobFragment()
//        Navigation.findNavController(requireView()).navigate(action)
//    }
//
//    private fun navigateSearchMotel(){
//        val action = THome2FragmentDirections.actionTHome2FragmentToTSearchMotelFragment()
//        Navigation.findNavController(requireView()).navigate(action)
//    }
//
//    private fun navigateToGiftFragment(){
//        val action = THome2FragmentDirections.actionTHome2FragmentToTGiftFragment(true)
//        Navigation.findNavController(requireView()).navigate(action)
//    }
//
//    private fun navigateToListAddress(){
//        val action = THome2FragmentDirections.actionTHome2FragmentToTListAddressFragment()
//        Navigation.findNavController(requireView()).navigate(action)
//    }
//
//    private fun navigateToContactParent(){
//        val action = THome2FragmentDirections.actionTHome2FragmentToStudentList2Fragment()
//        Navigation.findNavController(requireView()).navigate(action)
//    }
//
    override fun onItemClick(activity: Activity) {
        //
    }
//
//    private fun navigateToTutorFragment(){
//        val action = THome2FragmentDirections.actionTHome2FragmentToTTutorFragment()
//        Navigation.findNavController(requireView()).navigate(action)
//    }


}