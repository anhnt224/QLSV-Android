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


import com.emglab.qlsv.modules.searchMotel.fragments.*
import com.emglab.qlsv.ui.fragments.Home2Fragment
import com.emglab.qlsv.ui.fragments.HomeFragment
import com.emglab.qlsv.ui.fragments.TutorFragment
import com.emglab.qlsv.ui.fragments.activity.*
import com.emglab.qlsv.ui.fragments.criteria.CriteriaFragment
import com.emglab.qlsv.ui.fragments.criteria.TrainingPointFragment
import com.emglab.qlsv.ui.fragments.form.*
import com.emglab.qlsv.ui.fragments.gift.*
import com.emglab.qlsv.ui.fragments.job.*
import com.emglab.qlsv.ui.fragments.motel.AddMotelInfoFragment
import com.emglab.qlsv.ui.fragments.motel.ImageMotelFragment
import com.emglab.qlsv.ui.fragments.motel.MotelInfoFragment
import com.emglab.qlsv.ui.fragments.motel.SearchMotelFragment
import com.emglab.qlsv.ui.fragments.running.RunDashboardFragment
import com.emglab.qlsv.ui.fragments.running.RunFragment
import com.emglab.qlsv.ui.fragments.running.RunningDataFragment
import com.emglab.qlsv.ui.fragments.running.RunningFragment
import com.emglab.qlsv.ui.fragments.scholarShip.ListScholarShipAppliedFragment
import com.emglab.qlsv.ui.fragments.scholarShip.ListScholarShipsFragment
import com.emglab.qlsv.ui.fragments.scholarShip.ScholarShipDetailFragment
import com.emglab.qlsv.ui.fragments.timetable.TimeTableFragment
import com.emglab.qlsv.ui.fragments.user.*
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * All fragments related to MainActivity intended to use Dagger @Inject should be listed here.
 */
@Module
abstract class MainListFragmentBuildersModule {


    //activity


    @ContributesAndroidInjector()
    abstract fun contributeUserCheckInActivityInfoFragment(): UserCheckInActivityInfoFragment

    @ContributesAndroidInjector
    abstract fun contributeActivityDetailByUserFragment(): ActivityDetailByUserUnitFragment

    //user


    @ContributesAndroidInjector()
    abstract fun contributeScheduleFragment(): ScheduleFragment

    @ContributesAndroidInjector()
    abstract fun contributeMessageListFragment(): MessageListFragment

    @ContributesAndroidInjector
    abstract fun contributeAccountFragment(): AccountFragment

    @ContributesAndroidInjector()
    abstract fun contributeChangePasswordFragment(): ChangePasswordFragment

    @ContributesAndroidInjector()
    abstract fun contributeUserInfoFragment(): UserInfoFragment

    @ContributesAndroidInjector
    abstract fun contributeHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun contributeListActivityFragment(): ListActivityFragment

    @ContributesAndroidInjector
    abstract fun contributeListScholarShipsFragment(): ListScholarShipsFragment

    @ContributesAndroidInjector
    abstract fun contributeListScholarShipAppliedFragment(): ListScholarShipAppliedFragment

    @ContributesAndroidInjector
    abstract fun contributeScholarShipDetailFragment(): ScholarShipDetailFragment

    @ContributesAndroidInjector
    abstract fun contributeListJobsFragment(): ListJobsFragment

    @ContributesAndroidInjector
    abstract fun contributeJobDetailFragment(): JobDetailFragment

    @ContributesAndroidInjector
    abstract fun contributeListJobApply(): ListJobApplyFragment

    @ContributesAndroidInjector
    abstract fun contributeApplyJob(): ApplyJobFragment

    @ContributesAndroidInjector
    abstract fun contributeQRStudent(): QrStudentFragment

    @ContributesAndroidInjector
    abstract fun contributeListAddressFragment(): ListAddressFragment

    @ContributesAndroidInjector
    abstract fun contributeAddNewAddressFragment(): AddNewAddressFragment

    @ContributesAndroidInjector
    abstract fun contributeListFormsFragment(): ListFormsFragment

    @ContributesAndroidInjector
    abstract fun contributeListFormsRegisteredFragment(): ListFormsRegisteredFragment

    @ContributesAndroidInjector
    abstract fun contributeFormRegisteredDetailFragment(): FormRegisteredDetailFragment

    @ContributesAndroidInjector
    abstract fun contributeRegisterFormFragment(): RegisterFormFragment

    @ContributesAndroidInjector
    abstract fun contributeTrainingPointFragment(): TrainingPointFragment

    @ContributesAndroidInjector
    abstract fun contributeCriteriaFragment(): CriteriaFragment

    @ContributesAndroidInjector
    abstract fun contributeEditFormFragment(): EditFormFragment

    @ContributesAndroidInjector
    abstract fun contributeTimeTableFragment(): TimeTableFragment

    @ContributesAndroidInjector
    abstract fun contributeNotesFragment(): NotesFragment

    @ContributesAndroidInjector
    abstract fun contributeChooseDeliveryTypeFragment(): ChooseDeliveryTypeFragment

    @ContributesAndroidInjector
    abstract fun contributeChooseReceiverAddressFragment(): ChooseReceiverAddressFragment

    @ContributesAndroidInjector
    abstract fun contributeRunningFragment(): RunningFragment

    @ContributesAndroidInjector
    abstract fun contributeRunningDataFragment(): RunningDataFragment

    @ContributesAndroidInjector
    abstract fun contributeRunDashboardFragment(): RunDashboardFragment

    @ContributesAndroidInjector
    abstract fun contributeRunFragment(): RunFragment

    @ContributesAndroidInjector
    abstract fun contributeHome2Fragment(): Home2Fragment

    @ContributesAndroidInjector
    abstract fun contributeGiftFragment(): GiftFragment

    @ContributesAndroidInjector
    abstract fun contributeGiftInfoFragment(): GiftInfoFragment

    @ContributesAndroidInjector
    abstract fun contributeRegisterGiftFragment(): ApplyGiftFragment

    @ContributesAndroidInjector
    abstract fun contributeCreateGiftFragment(): CreateGiftFragment

    @ContributesAndroidInjector
    abstract fun contributeGiftGivenFragment(): GiftGivenFragment

    @ContributesAndroidInjector
    abstract fun contributeListRegisterFragment(): ListRegisterFragment

    @ContributesAndroidInjector
    abstract fun contributeReceiverAddressFragment(): ReceiverAddressFragment

    @ContributesAndroidInjector
    abstract fun contributeSearchMotelFragment(): SearchMotelFragment

    @ContributesAndroidInjector
    abstract fun contributeMotelInfoFragment(): MotelInfoFragment

    @ContributesAndroidInjector
    abstract fun contributeAddMotelFragment(): AddMotelInfoFragment

    @ContributesAndroidInjector
    abstract fun contributeImageMotelFragment(): ImageMotelFragment

    @ContributesAndroidInjector
    abstract fun contributeMoreJobFragment(): MoreJobFragment

    @ContributesAndroidInjector
    abstract fun contributeGiftReceiveFragment(): GiftReceiveFragment

    @ContributesAndroidInjector
    abstract fun contributeTutorFragment(): TutorFragment

    @ContributesAndroidInjector
    abstract fun contributeMotelRegistrationComplete(): MotelRegistrationCompleteFragment

    @ContributesAndroidInjector
    abstract fun contributeMotelRegistrationInfo(): MotelRegistrationInfoFragment

    @ContributesAndroidInjector
    abstract fun contributeMotelRegistrationList(): MotelRegistrationListFragment

    @ContributesAndroidInjector
    abstract fun contributeMotelRegistrationProcessing(): MotelRegistrationProcessingFragment

    @ContributesAndroidInjector
    abstract fun contributeRegisterToFindMotel(): RegisterToFindMotelFragment

    @ContributesAndroidInjector
    abstract fun contributePickMotelLocation(): PickMotelLocationFragment

    @ContributesAndroidInjector
    abstract fun contributeListMotelResult(): ListMotelResultsFragment
}