package com.emglab.qlsv.teacher.fragment.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.TeacherActivity
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.databinding.TListActivitiesFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.teacher.viewmodel.activity.TListActivitiesViewModel
import com.emglab.qlsv.ui.adapter.activity.ActivityAdapter
import com.emglab.qlsv.ui.viewmodels.activity.ListActivityViewModel
import com.google.zxing.integration.android.IntentIntegrator
import javax.inject.Inject

class TListActivitiesFragment : Fragment(), ActivityAdapter.OnItemClickListener, Injectable {

    private lateinit var viewModel: TListActivitiesViewModel
    private lateinit var binding: TListActivitiesFragmentBinding
    private lateinit var activityAdapter: ActivityAdapter
    @Inject lateinit var appExecutors: AppExecutors
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private var type: ListActivityViewModel.Type? = null
    private var activities: ArrayList<Activity> = arrayListOf()
    private lateinit var searchView: SearchView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setUpViewModel()
        setHasOptionsMenu(true)
        binding = DataBindingUtil.inflate(inflater, R.layout.t_list_activities_fragment, container, false)
        showTabBar()

        activityAdapter = ActivityAdapter(appExecutors, this)
        binding.apply {
            recyclerview.apply {
                adapter = activityAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }

            callback = object : RetryCallback {
                override fun retry() {
                    if(type != null){
                        viewModel.getListActivities()
                    }
                }
            }
        }
        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, viewModelFactory).get(TListActivitiesViewModel::class.java)
    }

    private fun subscribeUI(){
        with(viewModel){
            activities.observe(viewLifecycleOwner){resource ->
                binding.resource = resource
                if(checkResource(resource) && resource.data != null){
                    this@TListActivitiesFragment.activities = arrayListOf()
                    this@TListActivitiesFragment.activities.addAll(resource.data)
                    activityAdapter.submitList(this@TListActivitiesFragment.activities.toList())
                    activityAdapter.notifyDataSetChanged()
                }
            }
        }
    }

    private fun showTabBar(){
        (activity as TeacherActivity).supportActionBar?.show()
        (activity as TeacherActivity).supportActionBar?.title = "Danh sách hoạt động"
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_list_activity, menu)

        searchView = menu.findItem(R.id.search).actionView as SearchView
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
            @SuppressLint("DefaultLocale")
            override fun onQueryTextSubmit(searchText: String?): Boolean {
                val filteredActivity = activities.filter { activity ->
                    activity.name!!.toLowerCase().contains(searchText!!.toLowerCase())
                }
                activityAdapter.submitList(filteredActivity)
                activityAdapter.notifyDataSetChanged()
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                return true
            }
        })

        val closeButton = searchView.findViewById<ImageView>(R.id.search_close_btn)
        closeButton.setOnClickListener {
            activityAdapter.submitList(activities.toList())
            activityAdapter.notifyDataSetChanged()
            searchView.onActionViewCollapsed()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.scanQR -> {
                startQRcodeActitivity()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

    override fun onItemClick(activity: Activity) {
        Navigation.findNavController(view!!).
        navigate(TListActivitiesFragmentDirections.actionTListActivitiesFragmentToTActivityInfoFragment(activity.id))
    }

    private fun startQRcodeActitivity() {
        Log.d("_SCAN", "QR")
        IntentIntegrator.forSupportFragment(this).apply {
            setBeepEnabled(true)
            setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES)
            setPrompt("Quét mã QR hoạt động")
            setCameraId(0)
            setOrientationLocked(true)
            initiateScan()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        Log.d("_SCAN", "QR")
        if (result != null) {
            if (result.contents != null){
                try {
                    val aID = result.contents.toInt()
                    Navigation.findNavController(view!!).
                    navigate(TListActivitiesFragmentDirections.actionTListActivitiesFragmentToTActivityInfoFragment(aID))
                }catch (e: Exception){
                    showToast("Hoạt động này không tồn tại")
                }
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

}