package com.emglab.qlsv.teacher.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.THome2FragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkLocationPermission
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.models.entity.HomeItem
import com.emglab.qlsv.teacher.viewmodel.THome2ViewModel
import com.emglab.qlsv.ui.adapter.HomeItem2Adapter
import com.emglab.qlsv.ui.adapter.HomeItem3Adapter
import com.emglab.qlsv.ui.adapter.HomeItemAdapter
import com.emglab.qlsv.ui.adapter.activity.EventAdapter
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import java.lang.Exception
import javax.inject.Inject

class THome2Fragment : Fragment(), Injectable, EventAdapter.OnItemClickListener,
    HomeItemAdapter.OnItemClickListener, HomeItem2Adapter.OnItemClickListener,
    HomeItem3Adapter.OnItemClickListener {

    private lateinit var viewModel: THome2ViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var binding: THome2FragmentBinding
    private lateinit var eventAdapter: EventAdapter
    private val remoteConfig = Firebase.remoteConfig
    private lateinit var homeAdapter1: HomeItemAdapter
    private lateinit var homeAdapter2: HomeItem2Adapter
    private lateinit var homeAdapter3: HomeItem3Adapter
    private var homeItems1 = arrayListOf(
        HomeItem("Quản lý sinh viên", R.drawable.ic_score),
        HomeItem("Hoạt động ngoại khóa", R.drawable.ic_activity),
        HomeItem("Học bổng", R.drawable.ic_scholarship),
        HomeItem("Sổ tay", R.drawable.ic_notebook),
        HomeItem("Dịch vụ công", R.drawable.ic_service),
        HomeItem("Liên hệ phụ huynh", R.drawable.ic_coordination)
    )
    private var homeItems2 = arrayListOf(
        HomeItem("Việc làm", R.drawable.ic_job),
        HomeItem("Việc làm thêm", R.drawable.ic_job_more),
        HomeItem("Gia sư", R.drawable.ic_tutor)
    )

    private var homeItems3 = arrayListOf(
        HomeItem("10.000 bước", R.drawable.ic_running),
        HomeItem("Quà tặng", R.drawable.ic_gift),
        HomeItem("Cho/tặng quà", R.drawable.ic_receive_gift),
        HomeItem("Nhà trọ", R.drawable.ic_motel),
        HomeItem("Sổ địa chỉ", R.drawable.ic_home_location)
    )

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

        homeAdapter1 = HomeItemAdapter(homeItems1, this)
        binding.recyclerView1.apply {
            adapter = homeAdapter1
            layoutManager = GridLayoutManager(context, 3)
        }

        homeAdapter2 = HomeItem2Adapter(homeItems2, this)
        binding.recyclerView2.apply {
            adapter = homeAdapter2
            layoutManager = GridLayoutManager(context, 3)
        }

        homeAdapter3 = HomeItem3Adapter(homeItems3, this)
        binding.recyclerView3.apply {
            adapter = homeAdapter3
            layoutManager = GridLayoutManager(context, 3)
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

    private fun showListForm(){
        val action = THome2FragmentDirections.actionTHome2FragmentToTListFormFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun showListActivities(){
        val action = THome2FragmentDirections.actionTHome2FragmentToTListActivitiesFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun showListScholarShips(){
        val action = THome2FragmentDirections.actionTHome2FragmentToTListScholarShipsFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun showListJobs(){
        val action = THome2FragmentDirections.actionTHome2FragmentToTListJobsFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun showListStudent(){
        val action = THome2FragmentDirections.actionTHome2FragmentToListStudentFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun showRunDashboard(){
        val action = THome2FragmentDirections.actionTHome2FragmentToRunDashboardFragment2()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToGiftGiven(){
        val action = THome2FragmentDirections.actionTHome2FragmentToTGiftGivenFragment(true)
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun openLink(link: String){
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
            startActivity(intent)
        }catch (e: Exception){
        }
    }

    private fun navigateMoreJob(){
        val action = THome2FragmentDirections.actionTHome2FragmentToTMoreJobFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateSearchMotel(){
        val action = THome2FragmentDirections.actionTHome2FragmentToTSearchMotelFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToGiftFragment(){
        val action = THome2FragmentDirections.actionTHome2FragmentToTGiftFragment(true)
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToListAddress(){
        val action = THome2FragmentDirections.actionTHome2FragmentToTListAddressFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToContactParent(){
        val action = THome2FragmentDirections.actionTHome2FragmentToStudentList2Fragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    override fun onItemClick(activity: Activity) {
        //
    }

    override fun onClick1(position: Int) {
        when (position){
            0 -> showListStudent()
            1 -> showListActivities()
            2 -> showListScholarShips()
            3 -> openLink(remoteConfig.getString("note_link"))
            4 -> showListForm()
            5 -> navigateToContactParent()
        }
    }

    override fun onClick2(position: Int) {
        when (position){
            0 -> showListJobs()
            1 -> navigateMoreJob()
            2 -> navigateToTutorFragment()
        }
    }

    override fun onClick3(position: Int) {
        when (position){
            0 -> showRunDashboard()
            1 -> navigateToGiftFragment()
            2 -> navigateToGiftGiven()
            3 -> {
                if (checkLocationPermission()){
                    navigateSearchMotel()
                }
            }
            4 -> navigateToListAddress()
        }
    }

    private fun navigateToTutorFragment(){
        val action = THome2FragmentDirections.actionTHome2FragmentToTTutorFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }


}