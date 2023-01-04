/*
 * Copyright 2018-2019 Andrius Baruckis www.baruckis.com | mycryptocoins.baruckis.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.emglab.qlsv.di

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle

import com.emglab.qlsv.App
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.HasSupportFragmentInjector

/**
 * It is simple helper class to avoid calling inject method on each activity or fragment.
 */
object AppInjector {
    fun init(app: App) {
        // Here we initialize Dagger. DaggerAppComponent is auto-generated from AppComponent.
        DaggerAppComponent.builder().application(app).build().inject(app)

        app.registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks {
            override fun onActivityPaused(activity: Activity) {

            }

            override fun onActivityResumed(activity: Activity) {

            }

            override fun onActivityStarted(activity: Activity) {

            }

            override fun onActivityDestroyed(activity: Activity) {

            }

            override fun onActivitySaveInstanceState(activity: Activity, p1: Bundle) {

            }

            override fun onActivityStopped(activity: Activity) {

            }

            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                handleActivity(activity)
            }
        })
    }

    private fun handleActivity(activity: Activity) {
        if (activity is HasSupportFragmentInjector || activity is Injectable) {
            // Calling inject() method will cause Dagger to locate the singletons in the dependency graph to try to find a matching return type.
            // If it finds one, it assigns the references to the respective fields.
            AndroidInjection.inject(activity)
        }

        if (activity is androidx.fragment.app.FragmentActivity) {
            activity.supportFragmentManager.registerFragmentLifecycleCallbacks(object : androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks() {

                override fun onFragmentAttached(fragmentManager: androidx.fragment.app.FragmentManager, fragment: androidx.fragment.app.Fragment, context: Context) {
                    if (fragment is Injectable) {
                        AndroidSupportInjection.inject(fragment)
                    }
                }
                
            }, true)
        }
    }

}