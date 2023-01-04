package com.emglab.qlsv.di

import com.emglab.qlsv.modules_teacher.contactParent.StudentList2Fragment
import com.emglab.qlsv.teacher.fragment.THome2Fragment
import com.emglab.qlsv.teacher.fragment.THomeFragment
import com.emglab.qlsv.teacher.fragment.TListNotificationsFragment
import com.emglab.qlsv.teacher.fragment.TTutorFragment
import com.emglab.qlsv.teacher.fragment.account.TAccountFragment
import com.emglab.qlsv.teacher.fragment.account.TChangePasswordFragment
import com.emglab.qlsv.teacher.fragment.account.TeacherInfoFragment
import com.emglab.qlsv.teacher.fragment.activity.TActivityInfoFragment
import com.emglab.qlsv.teacher.fragment.activity.TListActivitiesFragment
import com.emglab.qlsv.teacher.fragment.form.*
import com.emglab.qlsv.teacher.fragment.gift.*
import com.emglab.qlsv.teacher.fragment.job.TListJobsFragment
import com.emglab.qlsv.teacher.fragment.job.TMoreJobFragment
import com.emglab.qlsv.teacher.fragment.motel.*
import com.emglab.qlsv.teacher.fragment.scholarShip.TListScholarShipsFragment
import com.emglab.qlsv.teacher.fragment.student.*
import com.emglab.qlsv.ui.fragments.form.ListFormsFragment
import com.emglab.qlsv.ui.fragments.running.RunDashboardFragment
import com.emglab.qlsv.ui.fragments.running.RunFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class TListFragmentBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeTHomeFragment(): THomeFragment

    @ContributesAndroidInjector
    abstract fun contributeListFormFragment(): ListFormsFragment

    @ContributesAndroidInjector
    abstract fun contributeTListFormFragment(): TListFormFragment

    @ContributesAndroidInjector
    abstract fun contributeTRegisterFormFragment(): TRegisterFormFragment

    @ContributesAndroidInjector
    abstract fun contributeTListFormRegisteredFragment(): TListFormRegisteredFragment

    @ContributesAndroidInjector
    abstract fun contributeTFormRegisteredFragment(): TFormRegisteredFragment

    @ContributesAndroidInjector
    abstract fun contributeTEditFormFragment(): TEditFormFragment

    @ContributesAndroidInjector
    abstract fun contributeTListActivitiesFragment(): TListActivitiesFragment

    @ContributesAndroidInjector
    abstract fun contributeTActivityInfoFragment(): TActivityInfoFragment

    @ContributesAndroidInjector
    abstract fun contributeTListScholarShipFragment(): TListScholarShipsFragment

    @ContributesAndroidInjector
    abstract fun contributeTListJobsFragment(): TListJobsFragment

    @ContributesAndroidInjector
    abstract fun contributeTListNotificationsFragment(): TListNotificationsFragment

    @ContributesAndroidInjector
    abstract fun contributeTAccountFragment(): TAccountFragment

    @ContributesAndroidInjector
    abstract fun contributeTChangePassword(): TChangePasswordFragment

    @ContributesAndroidInjector
    abstract fun contributeTeacherInfoFragment(): TeacherInfoFragment

    @ContributesAndroidInjector
    abstract fun contributeListStudentFragment(): ListStudentFragment

    @ContributesAndroidInjector
    abstract fun contributeListActivitiesOfStudent(): ListActivitiesOfStudentFragment

    @ContributesAndroidInjector
    abstract fun contributeStudentInfoFragment(): StudentInfoFragment

    @ContributesAndroidInjector
    abstract fun contributeTeacherMarkFragment(): TeacherMarkFragment

    @ContributesAndroidInjector
    abstract fun contributeTStudentNoteFragment(): TStudentNoteFragment

    @ContributesAndroidInjector
    abstract fun contributeRunDashboardFragment(): RunDashboardFragment

    @ContributesAndroidInjector
    abstract fun contributeRunFragment(): RunFragment

    @ContributesAndroidInjector
    abstract fun contributeTHome2Fragment(): THome2Fragment

    @ContributesAndroidInjector
    abstract fun contributeTGiftGivenFragment(): TGiftGivenFragment

    @ContributesAndroidInjector
    abstract fun contributeTListRegister(): TListRegisterFragment

    @ContributesAndroidInjector
    abstract fun contributeTCreateGift(): TCreateGiftFragment

    @ContributesAndroidInjector
    abstract fun contributeTGift(): TGiftFragment

    @ContributesAndroidInjector
    abstract fun contributeTGiftInfo(): TGiftInfoFragment

    @ContributesAndroidInjector
    abstract fun contributeTGiftReceived(): TGiftReceivedFragment

    @ContributesAndroidInjector
    abstract fun contributeTMoreJob(): TMoreJobFragment

    @ContributesAndroidInjector
    abstract fun contributeTMotelInfo(): TMotelInfoFragment

    @ContributesAndroidInjector
    abstract fun contributeTSearchMotel(): TSearchMotelFragment

    @ContributesAndroidInjector
    abstract fun contributeTAddNewAddressMotel(): TAddNewAddressFragment

    @ContributesAndroidInjector
    abstract fun contributeTListAddressMotel(): TListAddressFragment

    @ContributesAndroidInjector
    abstract fun contributeTAddMotelInfoMotel(): TAddMotelInfoFragment

    @ContributesAndroidInjector
    abstract fun contributeTImageMotel(): TImageMotelFragment

    @ContributesAndroidInjector
    abstract fun contributeTApplyGift(): TApplyGiftFragment

    @ContributesAndroidInjector
    abstract fun contributeTAddressGift(): TReceiverAddressFragment

    @ContributesAndroidInjector
    abstract fun contributeRTutorFragment(): TTutorFragment

    @ContributesAndroidInjector
    abstract fun contributeStudentList2(): StudentList2Fragment
}