package com.emglab.qlsv.ui.fragments.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.ImageView
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.MainActivity
import com.emglab.qlsv.R
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.databinding.ListActivityFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.ui.adapter.activity.ActivityAdapter
import com.emglab.qlsv.ui.viewmodels.activity.ListActivityViewModel
import com.google.android.material.tabs.TabLayout
import com.google.zxing.integration.android.IntentIntegrator
import javax.inject.Inject


class ListActivityFragment : Fragment(), ActivityAdapter.OnItemClickListener, Injectable {

    companion object {
        fun newInstance() = ListActivityFragment()
    }

    private lateinit var viewModel: ListActivityViewModel
    private lateinit var binding: ListActivityFragmentBinding
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
        binding = DataBindingUtil.inflate(inflater, R.layout.list_activity_fragment, container, false)
        showTabbar()

        activityAdapter = ActivityAdapter(appExecutors, this)
        binding.apply {
            recyclerview.apply {
                adapter = activityAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }

            tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
                override fun onTabReselected(tab: TabLayout.Tab?) {

                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {

                }

                override fun onTabSelected(tab: TabLayout.Tab?) {
                    activityAdapter.submitList(null)
                    activityAdapter.notifyDataSetChanged()
                    searchView.onActionViewCollapsed()
                    when(tab?.position){
                        0 -> {
                            viewModel.setType(ListActivityViewModel.Type.ALL)
                        }
                        else -> {
                            viewModel.setType(ListActivityViewModel.Type.JOINED)
                        }
                    }
                }
            })

            callback = object : RetryCallback{
                override fun retry() {
                    if(type != null){
                        viewModel.setType(type!!)
                    }
                }

            }
        }
        subscribeUI()
        return binding.root
    }
    
    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, viewModelFactory).get(ListActivityViewModel::class.java)
    }
    
    private fun subscribeUI(){
        with(viewModel){
            activities.observe(viewLifecycleOwner){resource ->
                binding.resource = resource
                if(checkResource(resource) && resource.data != null){
                    this@ListActivityFragment.activities = arrayListOf()
                    this@ListActivityFragment.activities.addAll(resource.data)
                    activityAdapter.submitList(this@ListActivityFragment.activities.toList())
                    activityAdapter.notifyDataSetChanged()
                }
            }
            getType().observe(viewLifecycleOwner){type ->
                this@ListActivityFragment.type = type
                when(type){
                    ListActivityViewModel.Type.ALL -> {
                        binding.tabLayout.getTabAt(0)?.select()
                    }

                    ListActivityViewModel.Type.JOINED -> {
                        binding.tabLayout.getTabAt(1)?.select()
                    }
                }
            }
        }
    }

    private fun showTabbar(){
        (activity as MainActivity).supportActionBar?.show()
        (activity as MainActivity).supportActionBar?.title = "Danh sách hoạt động"
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
        navigate(ListActivityFragmentDirections.actionListActivityFragmentToActivityDetailByUserUnitFragment(activity.id))
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
                    navigate(ListActivityFragmentDirections.actionListActivityFragmentToActivityDetailByUserUnitFragment(aID))
                }catch (e: Exception){
                    showToast("Hoạt động này không tồn tại")
                }
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

}