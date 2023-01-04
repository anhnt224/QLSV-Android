package com.emglab.qlsv.ui.fragments.running

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.databinding.RunningDataFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.di.ViewModelFactory
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.req.RunningDataRequest
import com.emglab.qlsv.ui.adapter.running.RunningDataAdapter
import com.emglab.qlsv.ui.viewmodels.running.RunningDataViewModel
import com.google.firebase.database.*
import javax.inject.Inject
import com.emglab.qlsv.R

class RunningDataFragment : Fragment(), Injectable {

    companion object {
        fun newInstance() = RunningDataFragment()
    }
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper

    @Inject
    lateinit var factory: ViewModelFactory
    private lateinit var viewModel: RunningDataViewModel
    private lateinit var binding: RunningDataFragmentBinding
    private val TAG = "_RunningDataFragment"
    private lateinit var runningDataAdapter: RunningDataAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewModel()
        binding = DataBindingUtil.inflate(inflater, R.layout.running_data_fragment, container,false)
        runningDataAdapter = RunningDataAdapter(listOf())
        binding.recyclerView.apply {
            adapter = runningDataAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        fetchData()
        subscribeUI()
        return binding.root
    }

    private fun setUpViewModel(){
        viewModel = ViewModelProvider(this, factory).get(RunningDataViewModel::class.java)
    }

    private fun subscribeUI(){
        with(viewModel){

        }
    }

    private fun fetchData(){
        val db = FirebaseDatabase.getInstance()
        val ref = db.getReference("runnung_data").orderByChild("userName").equalTo(sharedPrefsHelper.getUserName())

        val runningDataList = ArrayList<RunningDataRequest>()
        binding.status = Status.LOADING
        val runningDataListener = object : ValueEventListener {
            @SuppressLint("NotifyDataSetChanged")
            override fun onDataChange(snapshot: DataSnapshot) {
                binding.status = Status.SUCCESS_DB
                snapshot.children.forEach { dataSnapshot ->
                    runningDataList.add(dataSnapshot.getValue(RunningDataRequest::class.java)!!)
                }
                runningDataAdapter.runningDataList = runningDataList
                runningDataAdapter.notifyDataSetChanged()
            }

            override fun onCancelled(error: DatabaseError) {
                binding.status = Status.ERROR
                showToast("Có lỗi xảy ra, không lấy được thông tin hoạt động")
            }
        }

        ref.addListenerForSingleValueEvent(runningDataListener)
    }

}