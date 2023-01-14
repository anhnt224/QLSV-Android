package com.emglab.qlsv.ui.fragments

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.Home2FragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.openLink
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.modules.home.model.HomeItem
import com.emglab.qlsv.models.entity.Semester
import com.emglab.qlsv.modules.home.adapter.HomeMenuGroupAdapter
import com.emglab.qlsv.modules.home.adapter.HomeMenuItemListener
import com.emglab.qlsv.modules.home.adapter.PublicActivityAdapter
import com.emglab.qlsv.ui.adapter.activity.EventAdapter
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import javax.inject.Inject

class Home2Fragment : Fragment(), Injectable, EventAdapter.OnItemClickListener,
    HomeMenuItemListener {

    private lateinit var viewModel: Home2ViewModel

    @Inject
    lateinit var factory: ViewModelFactory

    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var binding: Home2FragmentBinding
    private lateinit var publicActivityAdapter: PublicActivityAdapter
    private var semesters: List<Semester> = listOf()
    private lateinit var homeMenuGroupAdapter: HomeMenuGroupAdapter
    private val snapHelper = PagerSnapHelper()
    private val remoteConfig = FirebaseRemoteConfig.getInstance()

    private var menuGroups: Map<String, List<HomeItem>> = mapOf(
        "Hoạt động ngoại khoá" to listOf(
            HomeItem("mark", "Chấm điểm rèn luyện", R.drawable.ic_home_mark),
            HomeItem("act_result", "Kết quả rèn luyện", R.drawable.ic_home_act_result),
            HomeItem("activity", "Hoạt động ngoại khóa", R.drawable.ic_home_athletics)
        ),
        "Thủ tục hành chính" to listOf(
            HomeItem("tutorial", "Hướng dẫn", R.drawable.ic_home_book),
            HomeItem("address", "Sổ địa chỉ", R.drawable.ic_home_address),
            HomeItem("service", "Dịch vụ công", R.drawable.ic_home_service)
        ),
        "Việc làm - Tài chính" to listOf(
            HomeItem("scholarship", "Học bổng", R.drawable.ic_home_scholarship),
            HomeItem("job", "Việc làm", R.drawable.ic_home_job),
            HomeItem("parttime_job", "Việc làm thêm", R.drawable.ic_home_partime_job)
        )
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
            titleTextView.text = sharedPrefsHelper.getFullName()
            titleWelcome.text = sharedPrefsHelper.getUserName()
            retryButton.setOnClickListener {
                viewModel.getPublicActivities()
            }
        }
        viewModel.getListSemester()
        setUpRecyclerView()
        subscribeUi()
        return binding.root
    }

    private fun setUpViewModel() {
        viewModel = ViewModelProvider(this, factory).get(Home2ViewModel::class.java)
    }

    private fun setUpRecyclerView() {
        publicActivityAdapter = PublicActivityAdapter(listOf(), requireActivity(), this)
        binding.apply {
            recyclerView.apply {
                adapter = publicActivityAdapter
                layoutManager = LinearLayoutManager(
                    context,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
            }
            snapHelper.attachToRecyclerView(recyclerView)
            indicator.attachToRecyclerView(recyclerView, snapHelper)

            publicActivityAdapter.registerAdapterDataObserver(indicator.adapterDataObserver)
        }

        homeMenuGroupAdapter = HomeMenuGroupAdapter(menuGroups, this)
        binding.homeMenu.apply {
            setHasFixedSize(true)
            adapter = homeMenuGroupAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun subscribeUi() {
        with(viewModel) {
            activities.observe(viewLifecycleOwner) {
                binding.getActivityStatus = it.status
                if (checkResource(it)) {
                    publicActivityAdapter.activities = it.data ?: listOf()
                    publicActivityAdapter.notifyDataSetChanged()
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

    private fun navigateToListScholarShips() {
        val action = Home2FragmentDirections.actionHome2FragmentToListScholarShipsFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToListAddressFragment() {
        val action = Home2FragmentDirections.actionHome2FragmentToListAddressFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    override fun onItemClick(activity: Activity) {
        val action =
            Home2FragmentDirections.actionHome2FragmentToActivityDetailByUserUnitFragment(activity.id)
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToListJobsFragment() {
        val action = Home2FragmentDirections.actionHome2FragmentToListJobsFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun navigateToPartTime() {
        val action = Home2FragmentDirections.actionHome2FragmentToMoreJobFragment()
        Navigation.findNavController(requireView()).navigate(action)
    }

    private fun handleTutorialTap(){
        val newsLink = remoteConfig.getString("tutorial_link")
        openLink(newsLink)
    }

    override fun onHomeItemClick(homeItem: HomeItem) {
        when (homeItem.id) {
            "mark" -> chooseSemester()
            "act_result" -> navigateToCriteriaFragment()
            "activity" -> navigateToActivityFragment()
            "service" -> navigateToListFormFragment()
            "scholarship" -> navigateToListScholarShips()
            "address" -> navigateToListAddressFragment()
            "job" -> navigateToListJobsFragment()
            "parttime_job" -> navigateToPartTime()
            "tutorial" -> handleTutorialTap()
        }
    }
}