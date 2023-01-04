package com.emglab.qlsv.ui.fragments

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
import com.emglab.qlsv.databinding.Home2FragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkLocationPermission
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.models.entity.HomeItem
import com.emglab.qlsv.models.entity.Semester
import com.emglab.qlsv.ui.adapter.HomeItem2Adapter
import com.emglab.qlsv.ui.adapter.HomeItem3Adapter
import com.emglab.qlsv.ui.adapter.HomeItemAdapter
import com.emglab.qlsv.ui.adapter.activity.EventAdapter
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import java.lang.Exception
import javax.inject.Inject

class Home2Fragment : Fragment(), Injectable, EventAdapter.OnItemClickListener,
    HomeItemAdapter.OnItemClickListener, HomeItem2Adapter.OnItemClickListener,
    HomeItem3Adapter.OnItemClickListener {

    private lateinit var viewModel: Home2ViewModel

    @Inject
    lateinit var factory: ViewModelFactory

    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var binding: Home2FragmentBinding
    private lateinit var eventAdapter: EventAdapter
    private val remoteConfig = Firebase.remoteConfig
    private var semesters: List<Semester> = listOf()
    private lateinit var homeAdapter1: HomeItemAdapter
    private lateinit var homeAdapter2: HomeItem2Adapter
    private lateinit var homeAdapter3: HomeItem3Adapter
    private var homeItems1 = arrayListOf(
        HomeItem("Chấm điểm rèn luyện", R.drawable.ic_mark),
        HomeItem("Kết quả rèn luyện", R.drawable.ic_score),
        HomeItem("Hoạt động ngoại khóa", R.drawable.ic_activity),
        HomeItem("Sổ tay", R.drawable.ic_notebook),
        HomeItem("Dịch vụ công", R.drawable.ic_service),
        HomeItem("Học bổng", R.drawable.ic_scholarship)
    )
    private var homeItems2 = arrayListOf(
        HomeItem("Việc làm", R.drawable.ic_job),
        HomeItem("Việc làm thêm", R.drawable.ic_time_end_money),
        HomeItem("Gia sư", R.drawable.ic_tutor)
    )

    private var homeItems3 = arrayListOf(
        HomeItem("10.000 bước", R.drawable.ic_running),
        HomeItem("Sổ địa chỉ", R.drawable.ic_home_location),
        HomeItem("Nhà trọ", R.drawable.ic_motel),
        HomeItem("Quà tặng", R.drawable.ic_gift),
        HomeItem("Cho/tặng quà", R.drawable.ic_receive_gift),
        HomeItem("Đăng kí tìm trọ", R.drawable.home_icon_search_motel)
    )


    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.home2_fragment,
            container,
            false
        )
        binding.apply {
            titleTextView.text = "Chào ${sharedPrefsHelper.getFullName()}"
            titleWelcome.text = remoteConfig.getString("titleWelcome2")
            retryButton.setOnClickListener {
                viewModel.getPublicActivities()
            }
        }
        viewModel.getListSemester()
        setUpRecyclerView(binding)
        subscribeUi()
        return binding.root
    }

    private fun setUpViewModel() {
        viewModel = ViewModelProvider(this, factory).get(Home2ViewModel::class.java)
    }

    private fun setUpRecyclerView(binding: Home2FragmentBinding) {
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
    private fun subscribeUi() {
        with(viewModel) {
            activities.observe(viewLifecycleOwner) {
                binding.getActivityStatus = it.status
                if (checkResource(it)) {
                    eventAdapter.activities = it.data ?: listOf()
                    eventAdapter.notifyDataSetChanged()
                }
            }
            semesters.observe(viewLifecycleOwner) {
                if (it.isSuccess()) {
                    this@Home2Fragment.semesters = it.data ?: listOf()
                }
            }
        }
    }

    private fun chooseSemester() {
        val semesterStr = semesters.map {
            it.name
        }
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Chọn kì học")
            .setItems(semesterStr.toTypedArray()) { _, which ->
                navigateToMarkFragment(semesters[which], semesters)
            }
            .setNegativeButton("Hủy") { _, _ ->

            }.show()
    }

    private fun navigateToMarkFragment(semester: Semester, semesters: List<Semester>) {
        val action = Home2FragmentDirections.actionHome2FragmentToCriteriaFragment(
            semester, semesters.toTypedArray()
        )
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToSearchMotelFragment() {
        val action = Home2FragmentDirections.actionHome2FragmentToSearchMotelFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToCriteriaFragment() {
        val action = Home2FragmentDirections.actionHome2FragmentToTrainingPointFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToActivityFragment() {
        val action = Home2FragmentDirections.actionHome2FragmentToListActivityFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToListFormFragment() {
        val action = Home2FragmentDirections.actionHome2FragmentToListFormsFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToListJobsFragment() {
        val action = Home2FragmentDirections.actionHome2FragmentToListJobsFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToListScholarShips() {
        val action = Home2FragmentDirections.actionHome2FragmentToListScholarShipsFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToListAddressFragment() {
        val action = Home2FragmentDirections.actionHome2FragmentToListAddressFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToRunDashboard() {
        val action = Home2FragmentDirections.actionHome2FragmentToRunDashboardFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToGift() {
        val action = Home2FragmentDirections.actionHome2FragmentToGiftFragment(true)
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateGivenGift() {
        val action = Home2FragmentDirections.actionHome2FragmentToGiftGivenFragment(true)
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToPartTime() {
        val action = Home2FragmentDirections.actionHome2FragmentToMoreJobFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToTutorFragment() {
        val action = Home2FragmentDirections.actionHome2FragmentToTutorFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToMotelRegistrationList() {
        val searchMotelEnabled = remoteConfig.getValue("search_motel_feature_enabled").asBoolean()
        if (searchMotelEnabled) {
            val action =
                Home2FragmentDirections.actionHome2FragmentToMotelRegistrationListFragment()
            Navigation.findNavController(requireView()).navigate(action)
        } else {
            showToast("Tính năng này sẽ được phát hành trong thời gian tới")
        }
    }

    private fun openLink(link: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
            startActivity(intent)
        } catch (e: Exception) {
        }
    }

    override fun onItemClick(activity: Activity) {
        val action =
            Home2FragmentDirections.actionHome2FragmentToActivityDetailByUserUnitFragment(activity.id)
        Navigation.findNavController(requireView()).navigate(action)
    }

    override fun onClick1(position: Int) {
        when (position) {
            0 -> chooseSemester()
            1 -> navigateToCriteriaFragment()
            2 -> navigateToActivityFragment()
            3 -> openLink(remoteConfig.getString("note_link"))
            4 -> navigateToListFormFragment()
            5 -> navigateToListScholarShips()
        }
    }

    override fun onClick2(position: Int) {
        when (position) {
            0 -> navigateToListJobsFragment()
            1 -> navigateToPartTime()
            2 -> navigateToTutorFragment()
        }
    }

    override fun onClick3(position: Int) {
        when (position) {
            0 -> navigateToRunDashboard()
            1 -> navigateToListAddressFragment()
            2 -> {
                if (checkLocationPermission()) {
                    navigateToSearchMotelFragment()
                }
            }
            3 -> navigateToGift()
            4 -> navigateGivenGift()
            5 -> navigateToMotelRegistrationList()
        }
    }
}