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


import com.emglab.qlsv.LoginActivity
import com.emglab.qlsv.MainActivity
import com.emglab.qlsv.TeacherActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * All user intended to use Dagger @Inject should be listed here.
 */
@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = [MainListFragmentBuildersModule::class]) // Where to apply the injection.
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [LoginListFragmentBuildersModule::class]) // Where to apply the injection.
    abstract fun contributeLoginActivity(): LoginActivity

    @ContributesAndroidInjector(modules = [TListFragmentBuilderModule::class])
    abstract fun contributeTeacherActivity(): TeacherActivity
}