package com.emglab.qlsv

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

import android.view.MenuItem
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.emglab.qlsv.databinding.ActivityMainBinding
import com.emglab.qlsv.extension.showToast
import com.emglab.qlsv.helper.SharedPrefsHelper
import com.emglab.qlsv.models.entity.Version
import com.emglab.qlsv.ui.fragments.DrawerLocker
import com.emglab.qlsv.ui.fragments.Home2FragmentDirections
import com.emglab.qlsv.ui.fragments.HomeFragmentDirections
import com.emglab.qlsv.ui.fragments.help.HelpFragmentDirections
import com.emglab.qlsv.ui.fragments.user.AccountFragmentDirections
import com.emglab.qlsv.ui.fragments.user.MessageListFragmentDirections
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.gson.GsonBuilder
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.activity_main.*
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import java.lang.Exception
import javax.inject.Inject

class MainActivity : AppCompatActivity(), DrawerLocker, HasSupportFragmentInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<androidx.fragment.app.Fragment>

    @Inject
    lateinit var sharedPrefsHelper: SharedPrefsHelper

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun supportFragmentInjector(): AndroidInjector<androidx.fragment.app.Fragment> =
        dispatchingAndroidInjector

    private val remoteConfig = Firebase.remoteConfig

    @SuppressLint("PackageManagerGetSignatures")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setUpRemoteConfig()
        fetchRemoteConfig()
        checkVersion()

        FirebaseCrashlytics.getInstance().setUserId(sharedPrefsHelper.getUserName())

        navController = findNavController(this, R.id.home_fragment)
        setupBottomNavMenu(navController)
        setupWithNavController(navigation, navController)
        binding.fab.setOnClickListener {
            startQRcodeActitivity()
        }
    }

    private fun setupBottomNavMenu(navController: NavController) {
        navigation?.let {
            setupWithNavController(it, navController)
            navController.addOnDestinationChangedListener { _, destination, _ ->
                supportActionBar?.title = destination.label
                when (destination.id) {
                    R.id.homeFragment, R.id.accountFragment, R.id.helpFragment, R.id.messageListFragment, R.id.home2Fragment -> {
                        supportActionBar?.hide()
                        showNavigationBar()
                    }

                    R.id.tutorFragment, R.id.motelRegistrationProcessingFragment, R.id.motelRegistrationCompleteFragment -> {
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

        binding.navigation.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.scanQR -> {
                    startQRcodeActitivity()
                }
            }
            false
        }
    }

    @SuppressLint("RestrictedApi")
    private fun showNavigationBar() {
        binding.navigation.visibility = View.VISIBLE
        binding.coordinatorLayout.visibility = View.VISIBLE
        binding.bottom.visibility = View.VISIBLE
        supportActionBar?.setShowHideAnimationEnabled(false)
    }

    @SuppressLint("RestrictedApi")
    private fun hideNavigationBar() {
        binding.coordinatorLayout.visibility = View.GONE
        binding.navigation.visibility = View.GONE
        binding.bottom.visibility = View.GONE
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setShowHideAnimationEnabled(false)
    }

    override fun setDrawerLocked(shouldLock: Boolean) {

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setUpRemoteConfig() {
        remoteConfig.setDefaultsAsync(R.xml.remote_config_defaults)
    }

    private fun fetchRemoteConfig() {
        remoteConfig.fetchAndActivate()
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    remoteConfig.activate()
                }
            }
    }

    private fun checkVersion() {
        try {
            val version = GsonBuilder().create()
                .fromJson(remoteConfig.getString("android_version"), Version::class.java)
            if (BuildConfig.VERSION_CODE < version.version) {
                val dialog = MaterialAlertDialogBuilder(this)
                    .setTitle("Bản cập nhật mới!")
                    .setMessage("Đã có bản cập nhật ${version.versionName}, bạn có muốn cập nhật?")
                    .setPositiveButton("Cập nhật") { _, _ ->
                        update(version.link)
                    }
                if (!version.require) {
                    dialog.setNegativeButton("Huỷ", null)
                }
                dialog.show()
            }
        } catch (e: Exception) {

        }
    }

    private fun update(link: String) {
        try {
            val myIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
            startActivity(myIntent)
        } catch (e: ActivityNotFoundException) {
            e.printStackTrace()
        }
    }

    private fun startQRcodeActitivity() {
        Log.d("_SCAN", "QR")
        IntentIntegrator(this).apply {
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
        if (result != null) {
            if (result.contents != null) {
                try {
                    val aID = result.contents.toInt()
                    super.onPostResume()
                    when (navController.currentDestination?.id) {
                        R.id.home2Fragment -> {
                            navController.navigate(
                                Home2FragmentDirections.actionHome2FragmentToActivityDetailByUserUnitFragment(
                                    aID
                                )
                            )
                        }
                        R.id.homeFragment -> {
                            navController.navigate(
                                HomeFragmentDirections.actionHomeFragmentToActivityDetailByUserUnitFragment(
                                    aID
                                )
                            )
                        }

                        R.id.accountFragment -> {
                            navController.navigate(
                                AccountFragmentDirections.actionAccountFragmentToActivityDetailByUserUnitFragment(
                                    aID
                                )
                            )
                        }

                        R.id.messageListFragment -> {
                            navController.navigate(
                                MessageListFragmentDirections.actionMessageListFragmentToActivityDetailByUserUnitFragment(
                                    aID
                                )
                            )
                        }

                        R.id.helpFragment -> {
                            navController.navigate(
                                HelpFragmentDirections.actionHelpFragmentToActivityDetailByUserUnitFragment(
                                    aID
                                )
                            )
                        }
                    }
                } catch (e: Exception) {
                    showToast("Hoạt động này không tồn tại")
                }
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}

