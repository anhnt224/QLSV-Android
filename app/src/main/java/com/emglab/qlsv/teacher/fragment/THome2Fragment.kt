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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.THome2FragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.modules.home.adapter.HomeMenuGroupAdapter
import com.emglab.qlsv.modules.home.adapter.HomeMenuItemListener
import com.emglab.qlsv.modules.home.adapter.PublicActivityAdapter
import com.emglab.qlsv.modules.home.model.HomeItem
import com.emglab.qlsv.teacher.viewmodel.THome2ViewModel
import com.emglab.qlsv.ui.adapter.activity.EventAdapter
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import javax.inject.Inject

class THome2Fragment : Fragment(), Injectable, EventAdapter.OnItemClickListener, HomeMenuItemListener {

    private lateinit var viewModel: THome2ViewModel
    @Inject
    lateinit var factory: ViewModelFactory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var binding: THome2FragmentBinding
    private lateinit var publicActivityAdapter: PublicActivityAdapter
    private val remoteConfig = Firebase.remoteConfig
    private lateinit var homeMenuGroupAdapter: HomeMenuGroupAdapter
    private val snapHelper = PagerSnapHelper()

    private var menuGroups: Map<String, List<HomeItem>> = mapOf(
        "Nghiệp vụ" to listOf(
            HomeItem("mark", "Chấm điểm rèn luyện", R.drawable.ic_home_mark),
            HomeItem("service", "Dịch vụ công", R.drawable.ic_home_service),
            HomeItem("news", "Tin tức", R.drawable.ic_home_new)
        ),
        "Thông tin" to listOf(
            HomeItem("activity", "Hoạt động ngoại khóa", R.drawable.ic_home_athletics),
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
            layoutInflater,
            R.layout.t_home2_fragment,
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
        setUpRecyclerView(binding)
        subscribeUi()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(THome2ViewModel::class.java)
    }

    private fun setUpRecyclerView(binding: THome2FragmentBinding){
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
    private fun subscribeUi(){
        with(viewModel){
            activities.observe(viewLifecycleOwner){
                binding.getActivityStatus = it.status
                if (checkResource(it)){
                    publicActivityAdapter.activities = it.data?: listOf()
                    publicActivityAdapter.notifyDataSetChanged()
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

    private fun handleNewsTap(){
        val newsLink = remoteConfig.getString("news_link")
        openLink(newsLink)
    }

    override fun onItemClick(activity: Activity) {

    }

    override fun onHomeItemClick(homeItem: HomeItem) {
        when (homeItem.id) {
            "mark" -> showListStudent()
            "activity" -> showListActivities()
            "service" -> showListForm()
            "scholarship" -> showListScholarShips()
            "job" -> showListJobs()
            "parttime_job" -> navigateMoreJob()
            "news" -> handleNewsTap()
        }
    }


}