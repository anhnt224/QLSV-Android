package com.emglab.qlsv

import android.app.Activity
import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.util.Log
import com.emglab.qlsv.di.AppInjector
import com.instacart.library.truetime.TrueTimeRx
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import java.util.*
import javax.inject.Inject
import android.os.Build
import androidx.multidex.MultiDex
import com.emglab.qlsv.utilities.NOTIFICATION_CHANNEL_ID
import com.emglab.qlsv.utilities.NOTIFICATION_CHANNEL_NAME
import io.reactivex.android.schedulers.AndroidSchedulers


class App : Application(), HasActivityInjector {

    @Inject // It implements Dagger machinery of finding appropriate injector factory for a type.
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    private val TAG = App::class.java.simpleName

    override fun onCreate() {
        super.onCreate()

        // Initialize in order to automatically inject user and fragments if they implement Injectable interface.
        AppInjector.init(this)
        initRxTrueTime()
        createNotificationChanel()
    }

    override fun attachBaseContext(context: Context) {
        super.attachBaseContext(context)
        MultiDex.install(this)
    }


    // This is required by HasActivityInjector interface to setup Dagger for Activity.
    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

    private fun initRxTrueTime() {
        val disposable = TrueTimeRx.build()
            .withConnectionTimeout(31428)
            .withRetryCount(100)
            .withSharedPreferencesCache(this)
            .withLoggingEnabled(true)
            .initializeRx("time.google.com")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<Date>() {
                override fun onSuccess(date: Date) {
                    Log.d(TAG, "Success initialized TrueTime :$date")
                }

                override fun onError(e: Throwable) {
                    Log.e(TAG, "something went wrong when trying to initializeRx TrueTime", e)
                }
            })
    }

    private fun createNotificationChanel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channel = NotificationChannel(
                NOTIFICATION_CHANNEL_ID,
                NOTIFICATION_CHANNEL_NAME,
                NotificationManager.IMPORTANCE_DEFAULT
            )
            val manager = getSystemService(NotificationManager::class.java)
            manager?.createNotificationChannel(channel)
        }
    }
}