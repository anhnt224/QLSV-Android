package com.emglab.qlsv.ui.fragments.activity


import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.appcompat.app.AlertDialog
import android.view.*
import androidx.navigation.Navigation
import com.emglab.qlsv.R

import com.emglab.qlsv.utilities.*
import com.emglab.qlsv.ui.viewmodels.activity.ActivityDetailByUserUnitViewModel

import androidx.databinding.DataBindingUtil
import com.emglab.qlsv.MainActivity
import com.emglab.qlsv.common.LogoutCallback
import com.emglab.qlsv.common.RetryCallback
import com.emglab.qlsv.common.Status
import com.emglab.qlsv.models.entity.Activity
import com.emglab.qlsv.databinding.FragmentActivityDetailByUserUnitBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.extension.handleTokenInvalid
import com.emglab.qlsv.extension.logoutClick
import com.emglab.qlsv.extension.showEditextDialog
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Criteria
import com.emglab.qlsv.models.entity.UserActivity
import com.emglab.qlsv.ui.adapter.activity.CriteriaByActivityAdapter
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class ActivityDetailByUserUnitFragment : androidx.fragment.app.Fragment() , Injectable {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject lateinit var sharedPrefsHelper: SharedPrefsHelper
    private var binding by autoCleared<FragmentActivityDetailByUserUnitBinding>()
    private lateinit var mViewmodel: ActivityDetailByUserUnitViewModel
    private var aId = 0
    private var mActivity = Activity()
    private var mCriterias: List<Criteria> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        aId = ActivityDetailByUserUnitFragmentArgs.fromBundle(arguments!!).aId
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_activity_detail_by_user_unit, container, false)
        setupViewModel()

        binding.apply {

            lifecycleOwner = this@ActivityDetailByUserUnitFragment
            viewmodel = mViewmodel
            setupToolbar()
            subscribeUi()

            txtADesc.movementMethod = LinkMovementMethod.getInstance()

            binding.activityStatic = UserActivity.Companion

            btnAssignUserActivity.setOnClickListener {
                this@ActivityDetailByUserUnitFragment.context?.showEditextDialog("Lý do đăng kí: ",null,
                    positive = {text -> mViewmodel.assignUserActivity(text,aId,
                        InjectorUtils.UserRoleUntils.USER_ROLE_MEMBER,"",1,"")})
            }

            btnApproveActivity.setOnClickListener { showApproveActivityDialog() }

            txtCriteriaText.setOnClickListener {
                setupCriteria(mCriterias)
            }

            relativeUser.setOnClickListener {
//                Navigation.findNavController(it).
//                    navigate(ActivityDetailByUserUnitFragmentDirections.
//                        actionActivityDetailByUserUnitFragmentToUserListByActivityFragment(aId,mActivity!!.aGId!!,mActivity!!.userRole!!))
            }

            btnNextToUserActivityInfo.setOnClickListener {
                Navigation.findNavController(it).
                    navigate(ActivityDetailByUserUnitFragmentDirections.
                        actionActivityDetailByUserUnitFragmentToUserCheckInActivityInfoFragment(aId,sharedPrefsHelper.getUserName(),mActivity!!.aGId!!,mActivity!!.name!!))
            }

            retryCallback = object : RetryCallback {
                override fun retry() {
                    mViewmodel.retry()
                }
            }

            logoutCallback = object : LogoutCallback {
                override fun logout() {
                    logoutClick(sharedPrefsHelper)
                }
            }



        }
        return binding.root
    }

    private fun setupViewModel() {
        mViewmodel = ViewModelProviders.of(this, viewModelFactory).get(ActivityDetailByUserUnitViewModel::class.java)
        mViewmodel.setId(aId)
    }

    private fun subscribeUi() {
        with(mViewmodel){

            activity.observe(viewLifecycleOwner, Observer { resource ->
                binding.activityResource = resource
                if (resource.data != null){
                    when(resource.status){
                        Status.SUCCESS_NETWORK -> {
                            binding.mActivity = resource.data
                            binding.userActivity = UserActivity(uaStatus = resource.data.uAStatus)
                        }

                        Status.ERROR -> {
                            showToast(resource.respText.toString())
                        }
                        Status.ERROR_TOKEN -> {
                            handleTokenInvalid()
                        }
                    }
                }
            })

            criterias.observe(viewLifecycleOwner, Observer { criteriaList ->
                mCriterias = criteriaList
            })

            assignUserActivityResource.observe(viewLifecycleOwner, Observer { resource ->
                binding.assignActivityResource = resource
                if (resource.data != null && isAssignUserActivity){
                    if (resource.status == Status.SUCCESS_NETWORK){
                        showToast("Đăng kí thành công")
                        isAssignUserActivity = false
                    }
                    if (resource.status == Status.ERROR){
                        showToast(resource.respText!!)
                        isAssignUserActivity = false
                    }
                    if(resource.status == Status.ERROR_TOKEN){
                        handleTokenInvalid()
                    }
                }
            })
        }
    }



    private fun showApproveActivityDialog() {
        val builder = AlertDialog.Builder(activity!!)
        builder.setTitle("Bạn có muốn duyệt hoạt động không?")
        builder.setPositiveButton("Có"){dialog, which ->

        }
        builder.setNegativeButton("Không"){dialog,which ->

        }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun setupToolbar() {
//        (activity as AppCompatActivity).setSupportActionBar(toolbar)
//        setHasOptionsMenu(true)
//        (activity as AppCompatActivity).getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)
//        (activity as AppCompatActivity).getSupportActionBar()!!.setDisplayShowHomeEnabled(true)
//        toolbar.title = ""
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.clear()
        inflater.inflate(R.menu.menu_activity_detail_by_user_unit, menu)
    }

    private fun setupCriteria(criterias: List<Criteria>) {
        val view = layoutInflater.inflate(R.layout.bottom_sheet_criteria_list, null)
        val  cartRecycler= view.findViewById<View>(R.id.cartRecycler) as androidx.recyclerview.widget.RecyclerView

        val cartAdapter = CriteriaByActivityAdapter(activity, criterias)
        cartRecycler.setHasFixedSize(true)
        val layoutManager = androidx.recyclerview.widget.LinearLayoutManager(
            activity,
            androidx.recyclerview.widget.LinearLayoutManager.VERTICAL,
            false
        )
        cartRecycler.layoutManager = layoutManager
        cartRecycler.adapter = cartAdapter
        val dialog = BottomSheetDialog(activity!!)
        dialog.setContentView(view)
        dialog.show()
    }

    override fun onResume() {
        super.onResume()
        if (activity is MainActivity){
            activity!!.navigation.visibility = View.GONE
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                activity!!.onBackPressed()
                true
            }
            R.id.txtSaveActivity ->{
//                Navigation.findNavController(view!!).navigate(ActivityDetailByUserUnitFragmentDirections.actionActivityDetailByUserUnitFragmentToUpdateActivityFragment(aId,mActivity.gId!!))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
