package com.emglab.qlsv.teacher.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.emglab.qlsv.R
import com.emglab.qlsv.common.AppExecutors
import com.emglab.qlsv.common.LogoutCallback
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.databinding.TListNotificationsFragmentBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.extension.checkResource
import com.emglab.qlsv.extension.logoutClick
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.teacher.viewmodel.TListNotificationsViewModel
import com.emglab.qlsv.ui.adapter.user.MessageAdapter
import com.emglab.qlsv.utilities.autoCleared
import javax.inject.Inject

class TListNotificationsFragment : Fragment(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper
    @Inject
    lateinit var appExecutors: AppExecutors
    private var binding by autoCleared<TListNotificationsFragmentBinding>()

    private lateinit var adapter : MessageAdapter
    private lateinit var mViewmodel: TListNotificationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater, R.layout.t_list_notifications_fragment, container, false)
        setupViewModel()

        adapter = MessageAdapter(appExecutors,
            itemClick = {})

        binding.apply {
            lifecycleOwner = this@TListNotificationsFragment

            val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            listMessageRecycler.layoutManager = layoutManager
            listMessageRecycler.adapter = adapter

            retryCallback = object : RetryCallback {
                override fun retry() {
                    mViewmodel.getListMessage()
                }
            }

            logoutCallback = object : LogoutCallback {
                override fun logout() {
                    logoutClick(sharedPrefsHelper)
                }
            }

            swipeRefreshLayout.setOnRefreshListener {
                mViewmodel.getListMessage()
                swipeRefreshLayout.isRefreshing = false
            }
        }
        subscribeUi()
        return binding.root
    }

    private fun setupViewModel() {
        mViewmodel = ViewModelProviders.of(this, viewModelFactory).get(TListNotificationsViewModel::class.java)
    }

    private fun subscribeUi() {
        with(mViewmodel){
            messages.observe(viewLifecycleOwner, Observer { resource ->
                Log.d("_MESSAGE", resource.toString())
                binding.messagesResource = resource
                if(checkResource(resource) && resource.data != null){
                    binding.sizeOfMessage = resource.data.size
                    adapter.submitList(resource.data)
                }
            })
        }
    }
}