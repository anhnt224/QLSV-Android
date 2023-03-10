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
        "Ho???t ?????ng ngo???i kho??" to listOf(
            HomeItem("mark", "Ch???m ??i???m r??n luy???n", R.drawable.ic_home_mark),
            HomeItem("act_result", "K???t qu??? r??n luy???n", R.drawable.ic_home_act_result),
            HomeItem("activity", "Ho???t ?????ng ngo???i kh??a", R.drawable.ic_home_athletics)
        ),
        "Th??? t???c h??nh ch??nh" to listOf(
            HomeItem("service", "D???ch v??? c??ng", R.drawable.ic_home_service),
            HomeItem("address", "S??? ?????a ch???", R.drawable.ic_home_address),
            HomeItem("scholarship", "H???c b???ng", R.drawable.ic_home_scholarship)
        ),
        "H?????ng nghi???p" to listOf(
            HomeItem("job", "Vi???c l??m", R.drawable.ic_home_job),
            HomeItem("parttime_job", "Vi???c l??m th??m", R.drawable.ic_home_partime_job),
            HomeItem("internship", "Vi???c l??m th??m", R.drawable.ic_home_intership)
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
            .setTitle("Ch???n k?? h???c")
            .setItems(semesterStr.toTypedArray()) { _, which ->
                navigateToMarkFragment(semesters[which], semesters)
            }
            .setNegativeButton("H???y") { _, _ ->

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

    private fun handleTutorialTap() {
        val newsLink = remoteConfig.getString("tutorial_link")
        openLink(newsLink)
    }

    private fun handleInternshipViewTap(){
        val newsLink = remoteConfig.getString("home_link_intership")
        openLink(newsLink)
    }

    private fun handleJobViewTap(){
        val newsLink = remoteConfig.getString("home_link_job")
        openLink(newsLink)
    }

    private fun handlePartTimeViewTap(){
        val newsLink = remoteConfig.getString("home_link_parttime_job")
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
            "job" -> handleJobViewTap()
            "parttime_job" -> handlePartTimeViewTap()
            "tutorial" -> handleTutorialTap()
            "internship" -> handleInternshipViewTap()
        }
    }
}