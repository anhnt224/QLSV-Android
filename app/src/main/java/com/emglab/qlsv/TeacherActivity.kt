package com.emglab.qlsv

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.emglab.qlsv.databinding.ActivityTeacherBinding
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Version
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.gson.GsonBuilder
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import javax.inject.Inject

class TeacherActivity : AppCompatActivity(), HasSupportFragmentInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper

    private lateinit var binding: ActivityTeacherBinding
    private lateinit var navController: NavController
    private val remoteConfig = Firebase.remoteConfig

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_teacher)

        setUpRemoteConfig()
        fetchRemoteConfig()
        checkVersion()

        FirebaseCrashlytics.getInstance().setUserId(sharedPrefsHelper.getUserName())

        navController = Navigation.findNavController(this, R.id.t_home_fragment)
        setupBottomNavMenu(navController)
        NavigationUI.setupWithNavController(binding.navigation, navController)
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return dispatchingAndroidInjector
    }

    private fun setupBottomNavMenu(navController: NavController){
        navigation?.let {
            NavigationUI.setupWithNavController(it, navController)
            navController.addOnDestinationChangedListener{_, destination, _ ->
                supportActionBar?.title = destination.label
                when(destination.id){
                    R.id.THomeFragment, R.id.TListNotificationsFragment, R.id.TAccountFragment,
                    R.id.THome2Fragment-> {
                        supportActionBar?.hide()
                        showNavigationBar()
                    }

                    R.id.TTutorFragment -> {
                        supportActionBar?.hide()
                        hideNavigationBar()
                    }

                    else -> {
                        supportActionBar?.show()
                        hideNavigationBar()
                    }
                }
            }
        }
    }


    @SuppressLint("RestrictedApi")
    private fun showNavigationBar(){
        binding.navigation.visibility = View.VISIBLE
        supportActionBar?.setShowHideAnimationEnabled(false)
    }

    @SuppressLint("RestrictedApi")
    private fun hideNavigationBar(){
        binding.navigation.visibility = View.GONE
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setShowHideAnimationEnabled(false)
    }

    private fun setUpRemoteConfig(){
        remoteConfig.setDefaultsAsync(R.xml.remote_config_defaults)
    }

    private fun fetchRemoteConfig(){
        remoteConfig.fetchAndActivate()
            .addOnCompleteListener {task ->
                if(task.isSuccessful){
                    remoteConfig.activate()
                }
            }
    }

    private fun checkVersion(){
        try {
            val version = GsonBuilder().create().fromJson(remoteConfig.getString("android_version"), Version::class.java)
            if(BuildConfig.VERSION_CODE < version.version){
                val dialog = MaterialAlertDialogBuilder(this)
                    .setTitle("Bản cập nhật mới!")
                    .setMessage("Đã có bản cập nhật ${version.versionName}, bạn có muốn cập nhật?")
                    .setPositiveButton("Cập nhật"){_,_ ->
                        update(version.link)
                    }
                if(!version.require){
                    dialog.setNegativeButton("Huỷ", null )
                }
                dialog.show()
            }
        }catch (e: Exception){

        }
    }

    private fun update(link: String){
        try {
            val myIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
            startActivity(myIntent)
        } catch (e: ActivityNotFoundException) {
            e.printStackTrace()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}