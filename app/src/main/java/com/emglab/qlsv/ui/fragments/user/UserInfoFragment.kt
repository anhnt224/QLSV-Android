package com.emglab.qlsv.ui.fragments.user


import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import com.emglab.qlsv.MainActivity
import com.emglab.qlsv.R
import com.emglab.qlsv.databinding.FragmentUserInfoBinding
import com.emglab.qlsv.di.Injectable
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.ui.viewmodels.user.UserInfoViewModel
import com.emglab.qlsv.utilities.AUTO
import com.emglab.qlsv.utilities.autoCleared
import javax.inject.Inject


class UserInfoFragment : androidx.fragment.app.Fragment(), Injectable {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject lateinit var sharedPrefsHelper: SharedPrefsHelper
    private lateinit var viewModel: UserInfoViewModel
    private var binding by autoCleared<FragmentUserInfoBinding>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_user_info, container, false)

        setupToolbar()
        setupViewModel()
        subscribeUi()
        binding.apply {
            lifecycleOwner = this@UserInfoFragment
//            btnChangePassword.setOnClickListener {
//                Navigation.findNavController(it).
//                    navigate(UserInfoFragmentDirections.actionUserInfoFragmentToChangePasswordFragment())
//            }
//
//            btnLogOut.setOnClickListener {
//                this@UserInfoFragment.context?.showDialog("Bạn có muốn đăng xuất không?",null){
//                    logoutClick(sharedPrefsHelper)
//                }
//            }

        }

        return binding.root
    }

    private fun setupViewModel() {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(UserInfoViewModel::class.java)
        viewModel.setParameter(AUTO)
    }

    private fun subscribeUi() {
        with(viewModel){
            user.observe(viewLifecycleOwner, Observer { resource ->
               // binding.activitiesResource = resource
                resource.data?.let {
                    binding.user = it
                }
            })

        }
    }

    override fun onResume() {
        super.onResume()
        if (activity is MainActivity){

        }
    }

    private fun setupToolbar() {
//        binding.apply {
//            (activity as AppCompatActivity).setSupportActionBar(toolbar)
//            setHasOptionsMenu(true)
//            (activity as AppCompatActivity).getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)
//            (activity as AppCompatActivity).getSupportActionBar()!!.setDisplayShowHomeEnabled(true)
//            toolbar.title = resources.getString(R.string.user_info_title)
//        }

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.clear()
       // inflater.inflate(R.menu.menu_activity_list_by_user_unit, menu)
        //  this.menu = menu;

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            android.R.id.home -> {
                activity!!.onBackPressed()
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }

    }
}
