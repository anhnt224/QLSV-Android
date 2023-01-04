package com.emglab.qlsv.di;

import java.lang.System;

/**
 * * All fragments related to MainActivity intended to use Dagger @Inject should be listed here.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00dc\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'J\b\u0010\u001b\u001a\u00020\u001cH\'J\b\u0010\u001d\u001a\u00020\u001eH\'J\b\u0010\u001f\u001a\u00020 H\'J\b\u0010!\u001a\u00020\"H\'J\b\u0010#\u001a\u00020$H\'J\b\u0010%\u001a\u00020&H\'J\b\u0010\'\u001a\u00020(H\'J\b\u0010)\u001a\u00020*H\'J\b\u0010+\u001a\u00020,H\'J\b\u0010-\u001a\u00020.H\'J\b\u0010/\u001a\u000200H\'J\b\u00101\u001a\u000202H\'J\b\u00103\u001a\u000204H\'J\b\u00105\u001a\u000206H\'J\b\u00107\u001a\u000208H\'J\b\u00109\u001a\u00020:H\'J\b\u0010;\u001a\u00020<H\'J\b\u0010=\u001a\u00020>H\'J\b\u0010?\u001a\u00020@H\'J\b\u0010A\u001a\u00020BH\'J\b\u0010C\u001a\u00020DH\'J\b\u0010E\u001a\u00020FH\'J\b\u0010G\u001a\u00020HH\'J\b\u0010I\u001a\u00020JH\'J\b\u0010K\u001a\u00020LH\'J\b\u0010M\u001a\u00020NH\'J\b\u0010O\u001a\u00020PH\'J\b\u0010Q\u001a\u00020RH\'J\b\u0010S\u001a\u00020TH\'J\b\u0010U\u001a\u00020VH\'J\b\u0010W\u001a\u00020XH\'J\b\u0010Y\u001a\u00020ZH\'J\b\u0010[\u001a\u00020\\H\'J\b\u0010]\u001a\u00020^H\'J\b\u0010_\u001a\u00020`H\'J\b\u0010a\u001a\u00020bH\'J\b\u0010c\u001a\u00020dH\'J\b\u0010e\u001a\u00020fH\'J\b\u0010g\u001a\u00020hH\'J\b\u0010i\u001a\u00020jH\'J\b\u0010k\u001a\u00020lH\'J\b\u0010m\u001a\u00020nH\'J\b\u0010o\u001a\u00020pH\'J\b\u0010q\u001a\u00020rH\'\u00a8\u0006s"}, d2 = {"Lcom/emglab/qlsv/di/MainListFragmentBuildersModule;", "", "()V", "contributeAccountFragment", "Lcom/emglab/qlsv/ui/fragments/user/AccountFragment;", "contributeActivityDetailByUserFragment", "Lcom/emglab/qlsv/ui/fragments/activity/ActivityDetailByUserUnitFragment;", "contributeAddMotelFragment", "Lcom/emglab/qlsv/ui/fragments/motel/AddMotelInfoFragment;", "contributeAddNewAddressFragment", "Lcom/emglab/qlsv/ui/fragments/user/AddNewAddressFragment;", "contributeApplyJob", "Lcom/emglab/qlsv/ui/fragments/job/ApplyJobFragment;", "contributeChangePasswordFragment", "Lcom/emglab/qlsv/ui/fragments/user/ChangePasswordFragment;", "contributeChooseDeliveryTypeFragment", "Lcom/emglab/qlsv/ui/fragments/form/ChooseDeliveryTypeFragment;", "contributeChooseReceiverAddressFragment", "Lcom/emglab/qlsv/ui/fragments/form/ChooseReceiverAddressFragment;", "contributeCreateGiftFragment", "Lcom/emglab/qlsv/ui/fragments/gift/CreateGiftFragment;", "contributeCriteriaFragment", "Lcom/emglab/qlsv/ui/fragments/criteria/CriteriaFragment;", "contributeEditFormFragment", "Lcom/emglab/qlsv/ui/fragments/form/EditFormFragment;", "contributeFormRegisteredDetailFragment", "Lcom/emglab/qlsv/ui/fragments/form/FormRegisteredDetailFragment;", "contributeGiftFragment", "Lcom/emglab/qlsv/ui/fragments/gift/GiftFragment;", "contributeGiftGivenFragment", "Lcom/emglab/qlsv/ui/fragments/gift/GiftGivenFragment;", "contributeGiftInfoFragment", "Lcom/emglab/qlsv/ui/fragments/gift/GiftInfoFragment;", "contributeGiftReceiveFragment", "Lcom/emglab/qlsv/ui/fragments/gift/GiftReceiveFragment;", "contributeHome2Fragment", "Lcom/emglab/qlsv/ui/fragments/Home2Fragment;", "contributeHomeFragment", "Lcom/emglab/qlsv/ui/fragments/HomeFragment;", "contributeImageMotelFragment", "Lcom/emglab/qlsv/ui/fragments/motel/ImageMotelFragment;", "contributeJobDetailFragment", "Lcom/emglab/qlsv/ui/fragments/job/JobDetailFragment;", "contributeListActivityFragment", "Lcom/emglab/qlsv/ui/fragments/activity/ListActivityFragment;", "contributeListAddressFragment", "Lcom/emglab/qlsv/ui/fragments/user/ListAddressFragment;", "contributeListFormsFragment", "Lcom/emglab/qlsv/ui/fragments/form/ListFormsFragment;", "contributeListFormsRegisteredFragment", "Lcom/emglab/qlsv/ui/fragments/form/ListFormsRegisteredFragment;", "contributeListJobApply", "Lcom/emglab/qlsv/ui/fragments/job/ListJobApplyFragment;", "contributeListJobsFragment", "Lcom/emglab/qlsv/ui/fragments/job/ListJobsFragment;", "contributeListMotelResult", "Lcom/emglab/qlsv/modules/searchMotel/fragments/ListMotelResultsFragment;", "contributeListRegisterFragment", "Lcom/emglab/qlsv/ui/fragments/gift/ListRegisterFragment;", "contributeListScholarShipAppliedFragment", "Lcom/emglab/qlsv/ui/fragments/scholarShip/ListScholarShipAppliedFragment;", "contributeListScholarShipsFragment", "Lcom/emglab/qlsv/ui/fragments/scholarShip/ListScholarShipsFragment;", "contributeMessageListFragment", "Lcom/emglab/qlsv/ui/fragments/user/MessageListFragment;", "contributeMoreJobFragment", "Lcom/emglab/qlsv/ui/fragments/job/MoreJobFragment;", "contributeMotelInfoFragment", "Lcom/emglab/qlsv/ui/fragments/motel/MotelInfoFragment;", "contributeMotelRegistrationComplete", "Lcom/emglab/qlsv/modules/searchMotel/fragments/MotelRegistrationCompleteFragment;", "contributeMotelRegistrationInfo", "Lcom/emglab/qlsv/modules/searchMotel/fragments/MotelRegistrationInfoFragment;", "contributeMotelRegistrationList", "Lcom/emglab/qlsv/modules/searchMotel/fragments/MotelRegistrationListFragment;", "contributeMotelRegistrationProcessing", "Lcom/emglab/qlsv/modules/searchMotel/fragments/MotelRegistrationProcessingFragment;", "contributeNotesFragment", "Lcom/emglab/qlsv/ui/fragments/user/NotesFragment;", "contributePickMotelLocation", "Lcom/emglab/qlsv/modules/searchMotel/fragments/PickMotelLocationFragment;", "contributeQRStudent", "Lcom/emglab/qlsv/ui/fragments/user/QrStudentFragment;", "contributeReceiverAddressFragment", "Lcom/emglab/qlsv/ui/fragments/gift/ReceiverAddressFragment;", "contributeRegisterFormFragment", "Lcom/emglab/qlsv/ui/fragments/form/RegisterFormFragment;", "contributeRegisterGiftFragment", "Lcom/emglab/qlsv/ui/fragments/gift/ApplyGiftFragment;", "contributeRegisterToFindMotel", "Lcom/emglab/qlsv/modules/searchMotel/fragments/RegisterToFindMotelFragment;", "contributeRunDashboardFragment", "Lcom/emglab/qlsv/ui/fragments/running/RunDashboardFragment;", "contributeRunFragment", "Lcom/emglab/qlsv/ui/fragments/running/RunFragment;", "contributeRunningDataFragment", "Lcom/emglab/qlsv/ui/fragments/running/RunningDataFragment;", "contributeRunningFragment", "Lcom/emglab/qlsv/ui/fragments/running/RunningFragment;", "contributeScheduleFragment", "Lcom/emglab/qlsv/ui/fragments/user/ScheduleFragment;", "contributeScholarShipDetailFragment", "Lcom/emglab/qlsv/ui/fragments/scholarShip/ScholarShipDetailFragment;", "contributeSearchMotelFragment", "Lcom/emglab/qlsv/ui/fragments/motel/SearchMotelFragment;", "contributeTimeTableFragment", "Lcom/emglab/qlsv/ui/fragments/timetable/TimeTableFragment;", "contributeTrainingPointFragment", "Lcom/emglab/qlsv/ui/fragments/criteria/TrainingPointFragment;", "contributeTutorFragment", "Lcom/emglab/qlsv/ui/fragments/TutorFragment;", "contributeUserCheckInActivityInfoFragment", "Lcom/emglab/qlsv/ui/fragments/activity/UserCheckInActivityInfoFragment;", "contributeUserInfoFragment", "Lcom/emglab/qlsv/ui/fragments/user/UserInfoFragment;", "app_debug"})
@dagger.Module()
public abstract class MainListFragmentBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.activity.UserCheckInActivityInfoFragment contributeUserCheckInActivityInfoFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.activity.ActivityDetailByUserUnitFragment contributeActivityDetailByUserFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.user.ScheduleFragment contributeScheduleFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.user.MessageListFragment contributeMessageListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.user.AccountFragment contributeAccountFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.user.ChangePasswordFragment contributeChangePasswordFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.user.UserInfoFragment contributeUserInfoFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.HomeFragment contributeHomeFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.activity.ListActivityFragment contributeListActivityFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.scholarShip.ListScholarShipsFragment contributeListScholarShipsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.scholarShip.ListScholarShipAppliedFragment contributeListScholarShipAppliedFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.scholarShip.ScholarShipDetailFragment contributeScholarShipDetailFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.job.ListJobsFragment contributeListJobsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.job.JobDetailFragment contributeJobDetailFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.job.ListJobApplyFragment contributeListJobApply();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.job.ApplyJobFragment contributeApplyJob();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.user.QrStudentFragment contributeQRStudent();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.user.ListAddressFragment contributeListAddressFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.user.AddNewAddressFragment contributeAddNewAddressFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.form.ListFormsFragment contributeListFormsFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.form.ListFormsRegisteredFragment contributeListFormsRegisteredFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.form.FormRegisteredDetailFragment contributeFormRegisteredDetailFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.form.RegisterFormFragment contributeRegisterFormFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.criteria.TrainingPointFragment contributeTrainingPointFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.criteria.CriteriaFragment contributeCriteriaFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.form.EditFormFragment contributeEditFormFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.timetable.TimeTableFragment contributeTimeTableFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.user.NotesFragment contributeNotesFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.form.ChooseDeliveryTypeFragment contributeChooseDeliveryTypeFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.form.ChooseReceiverAddressFragment contributeChooseReceiverAddressFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.running.RunningFragment contributeRunningFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.running.RunningDataFragment contributeRunningDataFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.running.RunDashboardFragment contributeRunDashboardFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.running.RunFragment contributeRunFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.Home2Fragment contributeHome2Fragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.gift.GiftFragment contributeGiftFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.gift.GiftInfoFragment contributeGiftInfoFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.gift.ApplyGiftFragment contributeRegisterGiftFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.gift.CreateGiftFragment contributeCreateGiftFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.gift.GiftGivenFragment contributeGiftGivenFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.gift.ListRegisterFragment contributeListRegisterFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.gift.ReceiverAddressFragment contributeReceiverAddressFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.motel.SearchMotelFragment contributeSearchMotelFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.motel.MotelInfoFragment contributeMotelInfoFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.motel.AddMotelInfoFragment contributeAddMotelFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.motel.ImageMotelFragment contributeImageMotelFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.job.MoreJobFragment contributeMoreJobFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.gift.GiftReceiveFragment contributeGiftReceiveFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.ui.fragments.TutorFragment contributeTutorFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationCompleteFragment contributeMotelRegistrationComplete();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationInfoFragment contributeMotelRegistrationInfo();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationListFragment contributeMotelRegistrationList();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationProcessingFragment contributeMotelRegistrationProcessing();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.modules.searchMotel.fragments.RegisterToFindMotelFragment contributeRegisterToFindMotel();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.modules.searchMotel.fragments.PickMotelLocationFragment contributePickMotelLocation();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.emglab.qlsv.modules.searchMotel.fragments.ListMotelResultsFragment contributeListMotelResult();
    
    public MainListFragmentBuildersModule() {
        super();
    }
}