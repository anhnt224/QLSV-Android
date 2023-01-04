package com.emglab.qlsv.di;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import com.emglab.qlsv.App;
import com.emglab.qlsv.App_MembersInjector;
import com.emglab.qlsv.LoginActivity;
import com.emglab.qlsv.LoginActivity_MembersInjector;
import com.emglab.qlsv.MainActivity;
import com.emglab.qlsv.MainActivity_MembersInjector;
import com.emglab.qlsv.TeacherActivity;
import com.emglab.qlsv.TeacherActivity_MembersInjector;
import com.emglab.qlsv.common.AppExecutors;
import com.emglab.qlsv.common.AppExecutors_Factory;
import com.emglab.qlsv.dao.ActivityDAO;
import com.emglab.qlsv.dao.CountStepsDAO;
import com.emglab.qlsv.dao.CriteriaDAO;
import com.emglab.qlsv.dao.ImageMotelDao;
import com.emglab.qlsv.dao.RunDataDao;
import com.emglab.qlsv.dao.RunningLocationDao;
import com.emglab.qlsv.dao.RunningWayDao;
import com.emglab.qlsv.dao.ScheduleStudnetDAO;
import com.emglab.qlsv.dao.TimetableDAO;
import com.emglab.qlsv.dao.UserCheckInActivityDAO;
import com.emglab.qlsv.dao.UserDAO;
import com.emglab.qlsv.dao.WeekNumberDAO;
import com.emglab.qlsv.data.AppDatabase;
import com.emglab.qlsv.helper.SharedPrefsHelper;
import com.emglab.qlsv.helper.SharedPrefsHelper_Factory;
import com.emglab.qlsv.modules.searchMotel.MotelRegistrationRepository_Factory;
import com.emglab.qlsv.modules.searchMotel.fragments.ListMotelResultsFragment;
import com.emglab.qlsv.modules.searchMotel.fragments.ListMotelResultsFragment_MembersInjector;
import com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationCompleteFragment;
import com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationCompleteFragment_MembersInjector;
import com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationInfoFragment;
import com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationInfoFragment_MembersInjector;
import com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationListFragment;
import com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationListFragment_MembersInjector;
import com.emglab.qlsv.modules.searchMotel.fragments.MotelRegistrationProcessingFragment;
import com.emglab.qlsv.modules.searchMotel.fragments.PickMotelLocationFragment;
import com.emglab.qlsv.modules.searchMotel.fragments.RegisterToFindMotelFragment;
import com.emglab.qlsv.modules.searchMotel.fragments.RegisterToFindMotelFragment_MembersInjector;
import com.emglab.qlsv.modules.searchMotel.viewModels.ListMotelResultsViewModel;
import com.emglab.qlsv.modules.searchMotel.viewModels.ListMotelResultsViewModel_Factory;
import com.emglab.qlsv.modules.searchMotel.viewModels.MotelRegistrationCompleteViewModel;
import com.emglab.qlsv.modules.searchMotel.viewModels.MotelRegistrationCompleteViewModel_Factory;
import com.emglab.qlsv.modules.searchMotel.viewModels.MotelRegistrationInfoViewModel;
import com.emglab.qlsv.modules.searchMotel.viewModels.MotelRegistrationInfoViewModel_Factory;
import com.emglab.qlsv.modules.searchMotel.viewModels.MotelRegistrationListViewModel;
import com.emglab.qlsv.modules.searchMotel.viewModels.MotelRegistrationListViewModel_Factory;
import com.emglab.qlsv.modules.searchMotel.viewModels.MotelRegistrationProcessingViewModel;
import com.emglab.qlsv.modules.searchMotel.viewModels.MotelRegistrationProcessingViewModel_Factory;
import com.emglab.qlsv.modules.searchMotel.viewModels.PickMotelLocationViewModel;
import com.emglab.qlsv.modules.searchMotel.viewModels.PickMotelLocationViewModel_Factory;
import com.emglab.qlsv.modules.searchMotel.viewModels.RegisterToFindMotelViewModel;
import com.emglab.qlsv.modules.searchMotel.viewModels.RegisterToFindMotelViewModel_Factory;
import com.emglab.qlsv.modules_teacher.contactParent.StudentList2Fragment;
import com.emglab.qlsv.modules_teacher.contactParent.StudentList2Fragment_MembersInjector;
import com.emglab.qlsv.modules_teacher.contactParent.StudentList2ViewModel;
import com.emglab.qlsv.modules_teacher.contactParent.StudentList2ViewModel_Factory;
import com.emglab.qlsv.repositories.FormRepository_Factory;
import com.emglab.qlsv.repositories.GiftRepository_Factory;
import com.emglab.qlsv.repositories.JobRepository_Factory;
import com.emglab.qlsv.repositories.MotelRepository_Factory;
import com.emglab.qlsv.repositories.RunRepository_Factory;
import com.emglab.qlsv.repositories.ScholarShipRepository_Factory;
import com.emglab.qlsv.repositories.TeacherRepository_Factory;
import com.emglab.qlsv.repositories.TimeTableRepository_Factory;
import com.emglab.qlsv.repositories.activity.ActivityRepository;
import com.emglab.qlsv.repositories.activity.ActivityRepository_Factory;
import com.emglab.qlsv.repositories.criteria.CriteriaRepository;
import com.emglab.qlsv.repositories.criteria.CriteriaRepository_Factory;
import com.emglab.qlsv.repositories.user.UserRepository;
import com.emglab.qlsv.repositories.user.UserRepository_Factory;
import com.emglab.qlsv.teacher.fragment.THome2Fragment;
import com.emglab.qlsv.teacher.fragment.THome2Fragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.THomeFragment;
import com.emglab.qlsv.teacher.fragment.THomeFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.TListNotificationsFragment;
import com.emglab.qlsv.teacher.fragment.TListNotificationsFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.TTutorFragment;
import com.emglab.qlsv.teacher.fragment.TTutorFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.account.TAccountFragment;
import com.emglab.qlsv.teacher.fragment.account.TAccountFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.account.TChangePasswordFragment;
import com.emglab.qlsv.teacher.fragment.account.TChangePasswordFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.account.TeacherInfoFragment;
import com.emglab.qlsv.teacher.fragment.account.TeacherInfoFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.activity.TActivityInfoFragment;
import com.emglab.qlsv.teacher.fragment.activity.TActivityInfoFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.activity.TListActivitiesFragment;
import com.emglab.qlsv.teacher.fragment.activity.TListActivitiesFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.form.TEditFormFragment;
import com.emglab.qlsv.teacher.fragment.form.TEditFormFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.form.TFormRegisteredFragment;
import com.emglab.qlsv.teacher.fragment.form.TFormRegisteredFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.form.TListFormFragment;
import com.emglab.qlsv.teacher.fragment.form.TListFormFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.form.TListFormRegisteredFragment;
import com.emglab.qlsv.teacher.fragment.form.TListFormRegisteredFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.form.TRegisterFormFragment;
import com.emglab.qlsv.teacher.fragment.form.TRegisterFormFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.gift.TApplyGiftFragment;
import com.emglab.qlsv.teacher.fragment.gift.TApplyGiftFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.gift.TCreateGiftFragment;
import com.emglab.qlsv.teacher.fragment.gift.TCreateGiftFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.gift.TGiftFragment;
import com.emglab.qlsv.teacher.fragment.gift.TGiftFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.gift.TGiftGivenFragment;
import com.emglab.qlsv.teacher.fragment.gift.TGiftGivenFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.gift.TGiftInfoFragment;
import com.emglab.qlsv.teacher.fragment.gift.TGiftInfoFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.gift.TGiftReceivedFragment;
import com.emglab.qlsv.teacher.fragment.gift.TGiftReceivedFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.gift.TListRegisterFragment;
import com.emglab.qlsv.teacher.fragment.gift.TListRegisterFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.gift.TReceiverAddressFragment;
import com.emglab.qlsv.teacher.fragment.gift.TReceiverAddressFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.job.TListJobsFragment;
import com.emglab.qlsv.teacher.fragment.job.TListJobsFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.job.TMoreJobFragment;
import com.emglab.qlsv.teacher.fragment.job.TMoreJobFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.motel.TAddMotelInfoFragment;
import com.emglab.qlsv.teacher.fragment.motel.TAddMotelInfoFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.motel.TAddNewAddressFragment;
import com.emglab.qlsv.teacher.fragment.motel.TAddNewAddressFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.motel.TImageMotelFragment;
import com.emglab.qlsv.teacher.fragment.motel.TImageMotelFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.motel.TListAddressFragment;
import com.emglab.qlsv.teacher.fragment.motel.TListAddressFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.motel.TMotelInfoFragment;
import com.emglab.qlsv.teacher.fragment.motel.TMotelInfoFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.motel.TSearchMotelFragment;
import com.emglab.qlsv.teacher.fragment.motel.TSearchMotelFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.scholarShip.TListScholarShipsFragment;
import com.emglab.qlsv.teacher.fragment.scholarShip.TListScholarShipsFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.student.ListActivitiesOfStudentFragment;
import com.emglab.qlsv.teacher.fragment.student.ListActivitiesOfStudentFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.student.ListStudentFragment;
import com.emglab.qlsv.teacher.fragment.student.ListStudentFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.student.StudentInfoFragment;
import com.emglab.qlsv.teacher.fragment.student.StudentInfoFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.student.TStudentNoteFragment;
import com.emglab.qlsv.teacher.fragment.student.TStudentNoteFragment_MembersInjector;
import com.emglab.qlsv.teacher.fragment.student.TeacherMarkFragment;
import com.emglab.qlsv.teacher.fragment.student.TeacherMarkFragment_MembersInjector;
import com.emglab.qlsv.teacher.viewmodel.THome2ViewModel;
import com.emglab.qlsv.teacher.viewmodel.THome2ViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.THomeViewModel;
import com.emglab.qlsv.teacher.viewmodel.THomeViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.TListNotificationsViewModel;
import com.emglab.qlsv.teacher.viewmodel.TListNotificationsViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.TTutorViewModel;
import com.emglab.qlsv.teacher.viewmodel.TTutorViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.account.TAccountViewModel;
import com.emglab.qlsv.teacher.viewmodel.account.TAccountViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.account.TChangePasswordViewModel;
import com.emglab.qlsv.teacher.viewmodel.account.TChangePasswordViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.account.TeacherInfoViewModel;
import com.emglab.qlsv.teacher.viewmodel.account.TeacherInfoViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.activity.TActivityInfoViewModel;
import com.emglab.qlsv.teacher.viewmodel.activity.TActivityInfoViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.activity.TListActivitiesViewModel;
import com.emglab.qlsv.teacher.viewmodel.activity.TListActivitiesViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.form.TEditFormViewModel;
import com.emglab.qlsv.teacher.viewmodel.form.TEditFormViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.form.TFormRegisteredViewModel;
import com.emglab.qlsv.teacher.viewmodel.form.TFormRegisteredViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.form.TListFormRegisteredViewModel;
import com.emglab.qlsv.teacher.viewmodel.form.TListFormRegisteredViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.form.TListFormViewModel;
import com.emglab.qlsv.teacher.viewmodel.form.TListFormViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.form.TRegisterFormViewModel;
import com.emglab.qlsv.teacher.viewmodel.form.TRegisterFormViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.gift.TApplyGiftViewModel;
import com.emglab.qlsv.teacher.viewmodel.gift.TApplyGiftViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.gift.TCreateGiftViewModel;
import com.emglab.qlsv.teacher.viewmodel.gift.TCreateGiftViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.gift.TGiftGivenViewModel;
import com.emglab.qlsv.teacher.viewmodel.gift.TGiftGivenViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.gift.TGiftInfoViewModel;
import com.emglab.qlsv.teacher.viewmodel.gift.TGiftInfoViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.gift.TGiftReceivedViewModel;
import com.emglab.qlsv.teacher.viewmodel.gift.TGiftReceivedViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.gift.TGiftViewModel;
import com.emglab.qlsv.teacher.viewmodel.gift.TGiftViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.gift.TListRegisterViewModel;
import com.emglab.qlsv.teacher.viewmodel.gift.TListRegisterViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.gift.TReceiverAddressViewModel;
import com.emglab.qlsv.teacher.viewmodel.gift.TReceiverAddressViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.job.TListJobsViewModel;
import com.emglab.qlsv.teacher.viewmodel.job.TListJobsViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.job.TMoreJobViewModel;
import com.emglab.qlsv.teacher.viewmodel.job.TMoreJobViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.motel.TAddMotelInfoViewModel;
import com.emglab.qlsv.teacher.viewmodel.motel.TAddMotelInfoViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.motel.TAddNewAddressViewModel;
import com.emglab.qlsv.teacher.viewmodel.motel.TAddNewAddressViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.motel.TImageMotelViewModel;
import com.emglab.qlsv.teacher.viewmodel.motel.TImageMotelViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.motel.TListAddressViewModel;
import com.emglab.qlsv.teacher.viewmodel.motel.TListAddressViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.motel.TMotelInfoViewModel;
import com.emglab.qlsv.teacher.viewmodel.motel.TMotelInfoViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.motel.TSearchMotelViewModel;
import com.emglab.qlsv.teacher.viewmodel.motel.TSearchMotelViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.scholarShip.TListScholarShipsViewModel;
import com.emglab.qlsv.teacher.viewmodel.scholarShip.TListScholarShipsViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.student.ListActivitiesOfStudentViewModel;
import com.emglab.qlsv.teacher.viewmodel.student.ListActivitiesOfStudentViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.student.ListStudentViewModel;
import com.emglab.qlsv.teacher.viewmodel.student.ListStudentViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.student.StudentInfoViewModel;
import com.emglab.qlsv.teacher.viewmodel.student.StudentInfoViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.student.TStudentNoteViewModel;
import com.emglab.qlsv.teacher.viewmodel.student.TStudentNoteViewModel_Factory;
import com.emglab.qlsv.teacher.viewmodel.student.TeacherMarkViewModel;
import com.emglab.qlsv.teacher.viewmodel.student.TeacherMarkViewModel_Factory;
import com.emglab.qlsv.ui.fragments.FragmentLocationBase_MembersInjector;
import com.emglab.qlsv.ui.fragments.Home2Fragment;
import com.emglab.qlsv.ui.fragments.Home2Fragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.Home2ViewModel;
import com.emglab.qlsv.ui.fragments.Home2ViewModel_Factory;
import com.emglab.qlsv.ui.fragments.HomeFragment;
import com.emglab.qlsv.ui.fragments.HomeFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.TutorFragment;
import com.emglab.qlsv.ui.fragments.TutorFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.activity.ActivityDetailByUserUnitFragment;
import com.emglab.qlsv.ui.fragments.activity.ActivityDetailByUserUnitFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.activity.ListActivityFragment;
import com.emglab.qlsv.ui.fragments.activity.ListActivityFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.activity.UserCheckInActivityInfoFragment;
import com.emglab.qlsv.ui.fragments.activity.UserCheckInActivityInfoFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.criteria.CriteriaFragment;
import com.emglab.qlsv.ui.fragments.criteria.CriteriaFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.criteria.TrainingPointFragment;
import com.emglab.qlsv.ui.fragments.criteria.TrainingPointFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.form.ChooseDeliveryTypeFragment;
import com.emglab.qlsv.ui.fragments.form.ChooseDeliveryTypeFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.form.ChooseReceiverAddressFragment;
import com.emglab.qlsv.ui.fragments.form.ChooseReceiverAddressFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.form.EditFormFragment;
import com.emglab.qlsv.ui.fragments.form.EditFormFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.form.FormRegisteredDetailFragment;
import com.emglab.qlsv.ui.fragments.form.FormRegisteredDetailFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.form.ListFormsFragment;
import com.emglab.qlsv.ui.fragments.form.ListFormsFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.form.ListFormsRegisteredFragment;
import com.emglab.qlsv.ui.fragments.form.ListFormsRegisteredFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.form.RegisterFormFragment;
import com.emglab.qlsv.ui.fragments.form.RegisterFormFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.gift.ApplyGiftFragment;
import com.emglab.qlsv.ui.fragments.gift.ApplyGiftFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.gift.CreateGiftFragment;
import com.emglab.qlsv.ui.fragments.gift.CreateGiftFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.gift.GiftFragment;
import com.emglab.qlsv.ui.fragments.gift.GiftFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.gift.GiftGivenFragment;
import com.emglab.qlsv.ui.fragments.gift.GiftGivenFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.gift.GiftInfoFragment;
import com.emglab.qlsv.ui.fragments.gift.GiftInfoFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.gift.GiftReceiveFragment;
import com.emglab.qlsv.ui.fragments.gift.GiftReceiveFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.gift.ListRegisterFragment;
import com.emglab.qlsv.ui.fragments.gift.ListRegisterFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.gift.ReceiverAddressFragment;
import com.emglab.qlsv.ui.fragments.gift.ReceiverAddressFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.job.ApplyJobFragment;
import com.emglab.qlsv.ui.fragments.job.ApplyJobFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.job.JobDetailFragment;
import com.emglab.qlsv.ui.fragments.job.ListJobApplyFragment;
import com.emglab.qlsv.ui.fragments.job.ListJobApplyFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.job.ListJobsFragment;
import com.emglab.qlsv.ui.fragments.job.ListJobsFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.job.MoreJobFragment;
import com.emglab.qlsv.ui.fragments.job.MoreJobFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.motel.AddMotelInfoFragment;
import com.emglab.qlsv.ui.fragments.motel.AddMotelInfoFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.motel.ImageMotelFragment;
import com.emglab.qlsv.ui.fragments.motel.ImageMotelFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.motel.MotelInfoFragment;
import com.emglab.qlsv.ui.fragments.motel.MotelInfoFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.motel.SearchMotelFragment;
import com.emglab.qlsv.ui.fragments.motel.SearchMotelFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.running.RunDashboardFragment;
import com.emglab.qlsv.ui.fragments.running.RunDashboardFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.running.RunFragment;
import com.emglab.qlsv.ui.fragments.running.RunFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.running.RunViewModel;
import com.emglab.qlsv.ui.fragments.running.RunViewModel_Factory;
import com.emglab.qlsv.ui.fragments.running.RunningDataFragment;
import com.emglab.qlsv.ui.fragments.running.RunningDataFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.running.RunningFragment;
import com.emglab.qlsv.ui.fragments.running.RunningFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.scholarShip.ListScholarShipAppliedFragment;
import com.emglab.qlsv.ui.fragments.scholarShip.ListScholarShipAppliedFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.scholarShip.ListScholarShipsFragment;
import com.emglab.qlsv.ui.fragments.scholarShip.ListScholarShipsFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.scholarShip.ScholarShipDetailFragment;
import com.emglab.qlsv.ui.fragments.scholarShip.ScholarShipDetailFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.timetable.TimeTableFragment;
import com.emglab.qlsv.ui.fragments.timetable.TimeTableFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.user.AccountFragment;
import com.emglab.qlsv.ui.fragments.user.AccountFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.user.AddNewAddressFragment;
import com.emglab.qlsv.ui.fragments.user.AddNewAddressFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.user.ChangePasswordFragment;
import com.emglab.qlsv.ui.fragments.user.ChangePasswordFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.user.CheckOTPLostPasswordFragment;
import com.emglab.qlsv.ui.fragments.user.CheckOTPLostPasswordFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.user.ListAddressFragment;
import com.emglab.qlsv.ui.fragments.user.ListAddressFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.user.LoginFragment;
import com.emglab.qlsv.ui.fragments.user.LoginFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.user.LostPasswordFragment;
import com.emglab.qlsv.ui.fragments.user.LostPasswordFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.user.MessageListFragment;
import com.emglab.qlsv.ui.fragments.user.MessageListFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.user.NotesFragment;
import com.emglab.qlsv.ui.fragments.user.NotesFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.user.QrStudentFragment;
import com.emglab.qlsv.ui.fragments.user.QrStudentFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.user.RegisterFragment;
import com.emglab.qlsv.ui.fragments.user.RegisterFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.user.ScheduleFragment;
import com.emglab.qlsv.ui.fragments.user.ScheduleFragment_MembersInjector;
import com.emglab.qlsv.ui.fragments.user.UserInfoFragment;
import com.emglab.qlsv.ui.fragments.user.UserInfoFragment_MembersInjector;
import com.emglab.qlsv.ui.viewmodels.HomeViewModel;
import com.emglab.qlsv.ui.viewmodels.HomeViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.TutorViewModel;
import com.emglab.qlsv.ui.viewmodels.TutorViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.activity.ActivityDetailByUserUnitViewModel;
import com.emglab.qlsv.ui.viewmodels.activity.ActivityDetailByUserUnitViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.activity.ListActivityViewModel;
import com.emglab.qlsv.ui.viewmodels.activity.ListActivityViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.activity.UserCheckInActivityViewModel;
import com.emglab.qlsv.ui.viewmodels.activity.UserCheckInActivityViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.criteria.CriteriaViewModel;
import com.emglab.qlsv.ui.viewmodels.criteria.CriteriaViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.criteria.TrainingPointViewModel;
import com.emglab.qlsv.ui.viewmodels.criteria.TrainingPointViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.form.ChooseDeliveryTypeViewModel;
import com.emglab.qlsv.ui.viewmodels.form.ChooseDeliveryTypeViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.form.ChooseReceiverAddressViewModel;
import com.emglab.qlsv.ui.viewmodels.form.ChooseReceiverAddressViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.form.EditFormViewModel;
import com.emglab.qlsv.ui.viewmodels.form.EditFormViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.form.FormRegisteredDetailViewModel;
import com.emglab.qlsv.ui.viewmodels.form.FormRegisteredDetailViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.form.ListFormsRegisteredViewModel;
import com.emglab.qlsv.ui.viewmodels.form.ListFormsRegisteredViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.form.ListFormsViewModel;
import com.emglab.qlsv.ui.viewmodels.form.ListFormsViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.form.RegisterFormViewModel;
import com.emglab.qlsv.ui.viewmodels.form.RegisterFormViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.gift.ApplyGiftViewModel;
import com.emglab.qlsv.ui.viewmodels.gift.ApplyGiftViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.gift.CreateGiftViewModel;
import com.emglab.qlsv.ui.viewmodels.gift.CreateGiftViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.gift.GiftGivenViewModel;
import com.emglab.qlsv.ui.viewmodels.gift.GiftGivenViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.gift.GiftInfoViewModel;
import com.emglab.qlsv.ui.viewmodels.gift.GiftInfoViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.gift.GiftReceiveViewModel;
import com.emglab.qlsv.ui.viewmodels.gift.GiftReceiveViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.gift.GiftViewModel;
import com.emglab.qlsv.ui.viewmodels.gift.GiftViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.gift.ListRegisterViewModel;
import com.emglab.qlsv.ui.viewmodels.gift.ListRegisterViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.gift.ReceiverAddressViewModel;
import com.emglab.qlsv.ui.viewmodels.gift.ReceiverAddressViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.job.ApplyJobViewModel;
import com.emglab.qlsv.ui.viewmodels.job.ApplyJobViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.job.JobDetailViewModel;
import com.emglab.qlsv.ui.viewmodels.job.JobDetailViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.job.ListJobApplyViewModel;
import com.emglab.qlsv.ui.viewmodels.job.ListJobApplyViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.job.ListJobsViewModel;
import com.emglab.qlsv.ui.viewmodels.job.ListJobsViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.job.MoreJobViewModel;
import com.emglab.qlsv.ui.viewmodels.job.MoreJobViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.motel.AddMotelInfoViewModel;
import com.emglab.qlsv.ui.viewmodels.motel.AddMotelInfoViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.motel.ImageMotelViewModel;
import com.emglab.qlsv.ui.viewmodels.motel.ImageMotelViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.motel.MotelInfoViewModel;
import com.emglab.qlsv.ui.viewmodels.motel.MotelInfoViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.motel.SearchMotelViewModel;
import com.emglab.qlsv.ui.viewmodels.motel.SearchMotelViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.running.RunDashboardViewModel;
import com.emglab.qlsv.ui.viewmodels.running.RunDashboardViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.running.RunningDataViewModel;
import com.emglab.qlsv.ui.viewmodels.running.RunningDataViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.running.RunningViewModel;
import com.emglab.qlsv.ui.viewmodels.running.RunningViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.scholarShip.ListScholarShipAppliedViewModel;
import com.emglab.qlsv.ui.viewmodels.scholarShip.ListScholarShipAppliedViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.scholarShip.ListScholarShipsViewModel;
import com.emglab.qlsv.ui.viewmodels.scholarShip.ListScholarShipsViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.scholarShip.ScholarShipDetailViewModel;
import com.emglab.qlsv.ui.viewmodels.scholarShip.ScholarShipDetailViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.timetable.TimeTableViewModel;
import com.emglab.qlsv.ui.viewmodels.timetable.TimeTableViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.user.AccountViewModel;
import com.emglab.qlsv.ui.viewmodels.user.AccountViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.user.AddNewAddressViewModel;
import com.emglab.qlsv.ui.viewmodels.user.AddNewAddressViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.user.ChangePasswordViewModel;
import com.emglab.qlsv.ui.viewmodels.user.ChangePasswordViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.user.CheckOTPLostPasswordViewModel;
import com.emglab.qlsv.ui.viewmodels.user.CheckOTPLostPasswordViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.user.ListAddressViewModel;
import com.emglab.qlsv.ui.viewmodels.user.ListAddressViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.user.LoginViewModel;
import com.emglab.qlsv.ui.viewmodels.user.LoginViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.user.LostPasswordViewModel;
import com.emglab.qlsv.ui.viewmodels.user.LostPasswordViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.user.MessageListViewModel;
import com.emglab.qlsv.ui.viewmodels.user.MessageListViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.user.NotesViewModel;
import com.emglab.qlsv.ui.viewmodels.user.NotesViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.user.QrStudentViewModel;
import com.emglab.qlsv.ui.viewmodels.user.QrStudentViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.user.RegisterViewModel;
import com.emglab.qlsv.ui.viewmodels.user.RegisterViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.user.ScheduleViewModel;
import com.emglab.qlsv.ui.viewmodels.user.ScheduleViewModel_Factory;
import com.emglab.qlsv.ui.viewmodels.user.UserInfoViewModel;
import com.emglab.qlsv.ui.viewmodels.user.UserInfoViewModel_Factory;
import com.emglab.qlsv.webservices.FormWebService;
import com.emglab.qlsv.webservices.GiftWebService;
import com.emglab.qlsv.webservices.RunWebService;
import com.emglab.qlsv.webservices.TimeTableWebService;
import com.emglab.qlsv.webservices.WebService;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.Builder>
      mainActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.Builder>
      loginActivitySubcomponentBuilderProvider;

  private Provider<
          ActivityBuildersModule_ContributeTeacherActivity.TeacherActivitySubcomponent.Builder>
      teacherActivitySubcomponentBuilderProvider;

  private Provider<App> applicationProvider;

  private Provider<Context> provideContextProvider;

  private Provider<SharedPreferences> provideSharedPreferencesProvider;

  private Provider<SharedPrefsHelper> sharedPrefsHelperProvider;

  private Provider<AppDatabase> provideDbProvider;

  private Provider<ActivityDAO> provideActivityDaoProvider;

  private Provider<CriteriaDAO> provideCriteriaDAOProvider;

  private Provider<UserCheckInActivityDAO> provideUserCheckInActivityDAOProvider;

  private Provider<OkHttpClient> provideHttpClientProvider;

  private Provider<WebService> provideApiServiceProvider;

  private Provider<AppExecutors> appExecutorsProvider;

  private Provider<CountStepsDAO> provideCountStepsDAOProvider;

  private Provider<ActivityRepository> activityRepositoryProvider;

  private Provider<CriteriaRepository> criteriaRepositoryProvider;

  private ActivityDetailByUserUnitViewModel_Factory activityDetailByUserUnitViewModelProvider;

  private Provider<UserDAO> provideUserDAOProvider;

  private Provider<ScheduleStudnetDAO> provideScheduleStudnetDAOProvider;

  private Provider<WeekNumberDAO> provideWeekNumberDAOProvider;

  private Provider<UserRepository> userRepositoryProvider;

  private ScheduleViewModel_Factory scheduleViewModelProvider;

  private MessageListViewModel_Factory messageListViewModelProvider;

  private UserCheckInActivityViewModel_Factory userCheckInActivityViewModelProvider;

  private RegisterViewModel_Factory registerViewModelProvider;

  private ChangePasswordViewModel_Factory changePasswordViewModelProvider;

  private LostPasswordViewModel_Factory lostPasswordViewModelProvider;

  private CheckOTPLostPasswordViewModel_Factory checkOTPLostPasswordViewModelProvider;

  private LoginViewModel_Factory loginViewModelProvider;

  private UserInfoViewModel_Factory userInfoViewModelProvider;

  private ListActivityViewModel_Factory listActivityViewModelProvider;

  private ScholarShipRepository_Factory scholarShipRepositoryProvider;

  private ListScholarShipsViewModel_Factory listScholarShipsViewModelProvider;

  private ListScholarShipAppliedViewModel_Factory listScholarShipAppliedViewModelProvider;

  private ScholarShipDetailViewModel_Factory scholarShipDetailViewModelProvider;

  private JobRepository_Factory jobRepositoryProvider;

  private ListJobsViewModel_Factory listJobsViewModelProvider;

  private ListJobApplyViewModel_Factory listJobApplyViewModelProvider;

  private ApplyJobViewModel_Factory applyJobViewModelProvider;

  private ListAddressViewModel_Factory listAddressViewModelProvider;

  private AddNewAddressViewModel_Factory addNewAddressViewModelProvider;

  private Provider<FormWebService> provideFormServiceProvider;

  private FormRepository_Factory formRepositoryProvider;

  private ListFormsViewModel_Factory listFormsViewModelProvider;

  private FormRegisteredDetailViewModel_Factory formRegisteredDetailViewModelProvider;

  private ListFormsRegisteredViewModel_Factory listFormsRegisteredViewModelProvider;

  private RegisterFormViewModel_Factory registerFormViewModelProvider;

  private TrainingPointViewModel_Factory trainingPointViewModelProvider;

  private CriteriaViewModel_Factory criteriaViewModelProvider;

  private EditFormViewModel_Factory editFormViewModelProvider;

  private Provider<TimeTableWebService> provideTimeTableServiceProvider;

  private Provider<TimetableDAO> provideTimetableProvider;

  private TimeTableRepository_Factory timeTableRepositoryProvider;

  private TimeTableViewModel_Factory timeTableViewModelProvider;

  private TListFormViewModel_Factory tListFormViewModelProvider;

  private TRegisterFormViewModel_Factory tRegisterFormViewModelProvider;

  private TListFormRegisteredViewModel_Factory tListFormRegisteredViewModelProvider;

  private TFormRegisteredViewModel_Factory tFormRegisteredViewModelProvider;

  private TEditFormViewModel_Factory tEditFormViewModelProvider;

  private TListActivitiesViewModel_Factory tListActivitiesViewModelProvider;

  private TActivityInfoViewModel_Factory tActivityInfoViewModelProvider;

  private TListScholarShipsViewModel_Factory tListScholarShipsViewModelProvider;

  private TListJobsViewModel_Factory tListJobsViewModelProvider;

  private TListNotificationsViewModel_Factory tListNotificationsViewModelProvider;

  private TChangePasswordViewModel_Factory tChangePasswordViewModelProvider;

  private TeacherInfoViewModel_Factory teacherInfoViewModelProvider;

  private TeacherRepository_Factory teacherRepositoryProvider;

  private ListStudentViewModel_Factory listStudentViewModelProvider;

  private ListActivitiesOfStudentViewModel_Factory listActivitiesOfStudentViewModelProvider;

  private StudentInfoViewModel_Factory studentInfoViewModelProvider;

  private TeacherMarkViewModel_Factory teacherMarkViewModelProvider;

  private NotesViewModel_Factory notesViewModelProvider;

  private TStudentNoteViewModel_Factory tStudentNoteViewModelProvider;

  private ChooseDeliveryTypeViewModel_Factory chooseDeliveryTypeViewModelProvider;

  private ChooseReceiverAddressViewModel_Factory chooseReceiverAddressViewModelProvider;

  private Provider<RunWebService> provideRunWebServiceProvider;

  private RunRepository_Factory runRepositoryProvider;

  private RunningDataViewModel_Factory runningDataViewModelProvider;

  private Provider<RunDataDao> provideRunResultProvider;

  private RunDashboardViewModel_Factory runDashboardViewModelProvider;

  private RunViewModel_Factory runViewModelProvider;

  private Home2ViewModel_Factory home2ViewModelProvider;

  private GiftRepository_Factory giftRepositoryProvider;

  private GiftViewModel_Factory giftViewModelProvider;

  private GiftInfoViewModel_Factory giftInfoViewModelProvider;

  private ApplyGiftViewModel_Factory applyGiftViewModelProvider;

  private CreateGiftViewModel_Factory createGiftViewModelProvider;

  private GiftGivenViewModel_Factory giftGivenViewModelProvider;

  private ListRegisterViewModel_Factory listRegisterViewModelProvider;

  private THome2ViewModel_Factory tHome2ViewModelProvider;

  private TGiftGivenViewModel_Factory tGiftGivenViewModelProvider;

  private TCreateGiftViewModel_Factory tCreateGiftViewModelProvider;

  private TListRegisterViewModel_Factory tListRegisterViewModelProvider;

  private ReceiverAddressViewModel_Factory receiverAddressViewModelProvider;

  private TGiftViewModel_Factory tGiftViewModelProvider;

  private TGiftInfoViewModel_Factory tGiftInfoViewModelProvider;

  private Provider<GiftWebService> provideGiftServiceProvider;

  private Provider<ImageMotelDao> provideImageMotelDaoProvider;

  private MotelRepository_Factory motelRepositoryProvider;

  private SearchMotelViewModel_Factory searchMotelViewModelProvider;

  private AddMotelInfoViewModel_Factory addMotelInfoViewModelProvider;

  private ImageMotelViewModel_Factory imageMotelViewModelProvider;

  private MotelInfoViewModel_Factory motelInfoViewModelProvider;

  private MoreJobViewModel_Factory moreJobViewModelProvider;

  private GiftReceiveViewModel_Factory giftReceiveViewModelProvider;

  private TGiftReceivedViewModel_Factory tGiftReceivedViewModelProvider;

  private TMoreJobViewModel_Factory tMoreJobViewModelProvider;

  private TSearchMotelViewModel_Factory tSearchMotelViewModelProvider;

  private TMotelInfoViewModel_Factory tMotelInfoViewModelProvider;

  private TAddNewAddressViewModel_Factory tAddNewAddressViewModelProvider;

  private TListAddressViewModel_Factory tListAddressViewModelProvider;

  private TAddMotelInfoViewModel_Factory tAddMotelInfoViewModelProvider;

  private TImageMotelViewModel_Factory tImageMotelViewModelProvider;

  private TApplyGiftViewModel_Factory tApplyGiftViewModelProvider;

  private TReceiverAddressViewModel_Factory tReceiverAddressViewModelProvider;

  private MotelRegistrationRepository_Factory motelRegistrationRepositoryProvider;

  private MotelRegistrationListViewModel_Factory motelRegistrationListViewModelProvider;

  private MotelRegistrationInfoViewModel_Factory motelRegistrationInfoViewModelProvider;

  private MotelRegistrationCompleteViewModel_Factory motelRegistrationCompleteViewModelProvider;

  private RegisterToFindMotelViewModel_Factory registerToFindMotelViewModelProvider;

  private StudentList2ViewModel_Factory studentList2ViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>>
      mapOfClassOfAndProviderOfViewModelProvider;

  private Provider<ViewModelFactory> viewModelFactoryProvider;

  private Provider<RunningLocationDao> provideRunningLocationDaoProvider;

  private Provider<RunningWayDao> provideRunningWayDaoProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
    initialize2(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return MapBuilder
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            newMapBuilder(3)
        .put(MainActivity.class, (Provider) mainActivitySubcomponentBuilderProvider)
        .put(LoginActivity.class, (Provider) loginActivitySubcomponentBuilderProvider)
        .put(TeacherActivity.class, (Provider) teacherActivitySubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<? extends Activity>>>emptyMap());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.mainActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.Builder
              get() {
            return new MainActivitySubcomponentBuilder();
          }
        };
    this.loginActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.Builder
              get() {
            return new LoginActivitySubcomponentBuilder();
          }
        };
    this.teacherActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuildersModule_ContributeTeacherActivity.TeacherActivitySubcomponent
                .Builder>() {
          @Override
          public ActivityBuildersModule_ContributeTeacherActivity.TeacherActivitySubcomponent
                  .Builder
              get() {
            return new TeacherActivitySubcomponentBuilder();
          }
        };
    this.applicationProvider = InstanceFactory.create(builder.application);
    this.provideContextProvider =
        DoubleCheck.provider(
            AppModule_ProvideContextFactory.create(builder.appModule, applicationProvider));
    this.provideSharedPreferencesProvider =
        DoubleCheck.provider(
            AppModule_ProvideSharedPreferencesFactory.create(
                builder.appModule, provideContextProvider));
    this.sharedPrefsHelperProvider =
        DoubleCheck.provider(SharedPrefsHelper_Factory.create(provideSharedPreferencesProvider));
    this.provideDbProvider =
        DoubleCheck.provider(
            AppModule_ProvideDbFactory.create(builder.appModule, applicationProvider));
    this.provideActivityDaoProvider =
        DoubleCheck.provider(
            AppModule_ProvideActivityDaoFactory.create(builder.appModule, provideDbProvider));
    this.provideCriteriaDAOProvider =
        DoubleCheck.provider(
            AppModule_ProvideCriteriaDAOFactory.create(builder.appModule, provideDbProvider));
    this.provideUserCheckInActivityDAOProvider =
        DoubleCheck.provider(
            AppModule_ProvideUserCheckInActivityDAOFactory.create(
                builder.appModule, provideDbProvider));
    this.provideHttpClientProvider =
        DoubleCheck.provider(AppModule_ProvideHttpClientFactory.create(builder.appModule));
    this.provideApiServiceProvider =
        DoubleCheck.provider(
            AppModule_ProvideApiServiceFactory.create(
                builder.appModule, provideHttpClientProvider));
    this.appExecutorsProvider = DoubleCheck.provider(AppExecutors_Factory.create());
    this.provideCountStepsDAOProvider =
        DoubleCheck.provider(
            AppModule_ProvideCountStepsDAOFactory.create(builder.appModule, provideDbProvider));
    this.activityRepositoryProvider =
        DoubleCheck.provider(
            ActivityRepository_Factory.create(
                provideActivityDaoProvider,
                provideCriteriaDAOProvider,
                provideUserCheckInActivityDAOProvider,
                provideApiServiceProvider,
                appExecutorsProvider,
                sharedPrefsHelperProvider,
                provideCountStepsDAOProvider));
    this.criteriaRepositoryProvider =
        DoubleCheck.provider(
            CriteriaRepository_Factory.create(
                provideCriteriaDAOProvider,
                provideApiServiceProvider,
                appExecutorsProvider,
                sharedPrefsHelperProvider));
    this.activityDetailByUserUnitViewModelProvider =
        ActivityDetailByUserUnitViewModel_Factory.create(
            activityRepositoryProvider, criteriaRepositoryProvider);
    this.provideUserDAOProvider =
        DoubleCheck.provider(
            AppModule_ProvideUserDAOFactory.create(builder.appModule, provideDbProvider));
    this.provideScheduleStudnetDAOProvider =
        DoubleCheck.provider(
            AppModule_ProvideScheduleStudnetDAOFactory.create(
                builder.appModule, provideDbProvider));
    this.provideWeekNumberDAOProvider =
        DoubleCheck.provider(
            AppModule_ProvideWeekNumberDAOFactory.create(builder.appModule, provideDbProvider));
    this.userRepositoryProvider =
        DoubleCheck.provider(
            UserRepository_Factory.create(
                provideUserDAOProvider,
                provideScheduleStudnetDAOProvider,
                provideWeekNumberDAOProvider,
                provideApiServiceProvider,
                appExecutorsProvider,
                sharedPrefsHelperProvider));
    this.scheduleViewModelProvider = ScheduleViewModel_Factory.create(userRepositoryProvider);
    this.messageListViewModelProvider = MessageListViewModel_Factory.create(userRepositoryProvider);
    this.userCheckInActivityViewModelProvider =
        UserCheckInActivityViewModel_Factory.create(activityRepositoryProvider);
    this.registerViewModelProvider = RegisterViewModel_Factory.create(userRepositoryProvider);
    this.changePasswordViewModelProvider =
        ChangePasswordViewModel_Factory.create(userRepositoryProvider);
    this.lostPasswordViewModelProvider =
        LostPasswordViewModel_Factory.create(userRepositoryProvider);
    this.checkOTPLostPasswordViewModelProvider =
        CheckOTPLostPasswordViewModel_Factory.create(userRepositoryProvider);
    this.loginViewModelProvider = LoginViewModel_Factory.create(userRepositoryProvider);
    this.userInfoViewModelProvider = UserInfoViewModel_Factory.create(userRepositoryProvider);
    this.listActivityViewModelProvider =
        ListActivityViewModel_Factory.create(activityRepositoryProvider);
    this.scholarShipRepositoryProvider =
        ScholarShipRepository_Factory.create(
            provideApiServiceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
    this.listScholarShipsViewModelProvider =
        ListScholarShipsViewModel_Factory.create(scholarShipRepositoryProvider);
    this.listScholarShipAppliedViewModelProvider =
        ListScholarShipAppliedViewModel_Factory.create(scholarShipRepositoryProvider);
    this.scholarShipDetailViewModelProvider =
        ScholarShipDetailViewModel_Factory.create(scholarShipRepositoryProvider);
    this.jobRepositoryProvider =
        JobRepository_Factory.create(
            provideApiServiceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
    this.listJobsViewModelProvider = ListJobsViewModel_Factory.create(jobRepositoryProvider);
    this.listJobApplyViewModelProvider =
        ListJobApplyViewModel_Factory.create(jobRepositoryProvider);
    this.applyJobViewModelProvider = ApplyJobViewModel_Factory.create(jobRepositoryProvider);
    this.listAddressViewModelProvider = ListAddressViewModel_Factory.create(userRepositoryProvider);
    this.addNewAddressViewModelProvider =
        AddNewAddressViewModel_Factory.create(userRepositoryProvider);
    this.provideFormServiceProvider =
        DoubleCheck.provider(
            AppModule_ProvideFormServiceFactory.create(
                builder.appModule, provideHttpClientProvider));
    this.formRepositoryProvider =
        FormRepository_Factory.create(
            provideFormServiceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
    this.listFormsViewModelProvider = ListFormsViewModel_Factory.create(formRepositoryProvider);
    this.formRegisteredDetailViewModelProvider =
        FormRegisteredDetailViewModel_Factory.create(formRepositoryProvider);
    this.listFormsRegisteredViewModelProvider =
        ListFormsRegisteredViewModel_Factory.create(formRepositoryProvider);
    this.registerFormViewModelProvider =
        RegisterFormViewModel_Factory.create(formRepositoryProvider);
    this.trainingPointViewModelProvider =
        TrainingPointViewModel_Factory.create(criteriaRepositoryProvider);
    this.criteriaViewModelProvider = CriteriaViewModel_Factory.create(criteriaRepositoryProvider);
    this.editFormViewModelProvider = EditFormViewModel_Factory.create(formRepositoryProvider);
    this.provideTimeTableServiceProvider =
        DoubleCheck.provider(
            AppModule_ProvideTimeTableServiceFactory.create(
                builder.appModule, provideHttpClientProvider));
    this.provideTimetableProvider =
        DoubleCheck.provider(
            AppModule_ProvideTimetableFactory.create(builder.appModule, provideDbProvider));
    this.timeTableRepositoryProvider =
        TimeTableRepository_Factory.create(
            provideTimeTableServiceProvider,
            appExecutorsProvider,
            sharedPrefsHelperProvider,
            provideTimetableProvider);
    this.timeTableViewModelProvider =
        TimeTableViewModel_Factory.create(timeTableRepositoryProvider, provideTimetableProvider);
    this.tListFormViewModelProvider = TListFormViewModel_Factory.create(formRepositoryProvider);
    this.tRegisterFormViewModelProvider =
        TRegisterFormViewModel_Factory.create(formRepositoryProvider);
    this.tListFormRegisteredViewModelProvider =
        TListFormRegisteredViewModel_Factory.create(formRepositoryProvider);
    this.tFormRegisteredViewModelProvider =
        TFormRegisteredViewModel_Factory.create(formRepositoryProvider);
    this.tEditFormViewModelProvider = TEditFormViewModel_Factory.create(formRepositoryProvider);
    this.tListActivitiesViewModelProvider =
        TListActivitiesViewModel_Factory.create(activityRepositoryProvider);
    this.tActivityInfoViewModelProvider =
        TActivityInfoViewModel_Factory.create(
            activityRepositoryProvider, criteriaRepositoryProvider);
    this.tListScholarShipsViewModelProvider =
        TListScholarShipsViewModel_Factory.create(scholarShipRepositoryProvider);
    this.tListJobsViewModelProvider = TListJobsViewModel_Factory.create(jobRepositoryProvider);
    this.tListNotificationsViewModelProvider =
        TListNotificationsViewModel_Factory.create(userRepositoryProvider);
    this.tChangePasswordViewModelProvider =
        TChangePasswordViewModel_Factory.create(userRepositoryProvider);
    this.teacherInfoViewModelProvider = TeacherInfoViewModel_Factory.create(userRepositoryProvider);
    this.teacherRepositoryProvider =
        TeacherRepository_Factory.create(
            provideApiServiceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
    this.listStudentViewModelProvider =
        ListStudentViewModel_Factory.create(teacherRepositoryProvider);
    this.listActivitiesOfStudentViewModelProvider =
        ListActivitiesOfStudentViewModel_Factory.create(teacherRepositoryProvider);
    this.studentInfoViewModelProvider =
        StudentInfoViewModel_Factory.create(teacherRepositoryProvider);
    this.teacherMarkViewModelProvider =
        TeacherMarkViewModel_Factory.create(teacherRepositoryProvider);
    this.notesViewModelProvider =
        NotesViewModel_Factory.create(teacherRepositoryProvider, sharedPrefsHelperProvider);
    this.tStudentNoteViewModelProvider =
        TStudentNoteViewModel_Factory.create(teacherRepositoryProvider, sharedPrefsHelperProvider);
    this.chooseDeliveryTypeViewModelProvider =
        ChooseDeliveryTypeViewModel_Factory.create(formRepositoryProvider);
    this.chooseReceiverAddressViewModelProvider =
        ChooseReceiverAddressViewModel_Factory.create(userRepositoryProvider);
    this.provideRunWebServiceProvider =
        DoubleCheck.provider(
            AppModule_ProvideRunWebServiceFactory.create(
                builder.appModule, provideHttpClientProvider));
    this.runRepositoryProvider =
        RunRepository_Factory.create(
            provideRunWebServiceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
    this.runningDataViewModelProvider = RunningDataViewModel_Factory.create(runRepositoryProvider);
    this.provideRunResultProvider =
        DoubleCheck.provider(
            AppModule_ProvideRunResultFactory.create(builder.appModule, provideDbProvider));
    this.runDashboardViewModelProvider =
        RunDashboardViewModel_Factory.create(runRepositoryProvider, provideRunResultProvider);
    this.runViewModelProvider = RunViewModel_Factory.create(runRepositoryProvider);
    this.home2ViewModelProvider =
        Home2ViewModel_Factory.create(activityRepositoryProvider, criteriaRepositoryProvider);
    this.giftRepositoryProvider =
        GiftRepository_Factory.create(
            provideApiServiceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
    this.giftViewModelProvider = GiftViewModel_Factory.create(giftRepositoryProvider);
    this.giftInfoViewModelProvider = GiftInfoViewModel_Factory.create(giftRepositoryProvider);
    this.applyGiftViewModelProvider = ApplyGiftViewModel_Factory.create(giftRepositoryProvider);
    this.createGiftViewModelProvider = CreateGiftViewModel_Factory.create(giftRepositoryProvider);
    this.giftGivenViewModelProvider = GiftGivenViewModel_Factory.create(giftRepositoryProvider);
    this.listRegisterViewModelProvider =
        ListRegisterViewModel_Factory.create(giftRepositoryProvider);
    this.tHome2ViewModelProvider =
        THome2ViewModel_Factory.create(activityRepositoryProvider, criteriaRepositoryProvider);
    this.tGiftGivenViewModelProvider = TGiftGivenViewModel_Factory.create(giftRepositoryProvider);
    this.tCreateGiftViewModelProvider = TCreateGiftViewModel_Factory.create(giftRepositoryProvider);
    this.tListRegisterViewModelProvider =
        TListRegisterViewModel_Factory.create(giftRepositoryProvider);
    this.receiverAddressViewModelProvider =
        ReceiverAddressViewModel_Factory.create(userRepositoryProvider);
    this.tGiftViewModelProvider = TGiftViewModel_Factory.create(giftRepositoryProvider);
    this.tGiftInfoViewModelProvider = TGiftInfoViewModel_Factory.create(giftRepositoryProvider);
    this.provideGiftServiceProvider =
        DoubleCheck.provider(
            AppModule_ProvideGiftServiceFactory.create(
                builder.appModule, provideHttpClientProvider));
    this.provideImageMotelDaoProvider =
        DoubleCheck.provider(
            AppModule_ProvideImageMotelDaoFactory.create(builder.appModule, provideDbProvider));
    this.motelRepositoryProvider =
        MotelRepository_Factory.create(
            provideApiServiceProvider,
            appExecutorsProvider,
            provideGiftServiceProvider,
            sharedPrefsHelperProvider,
            provideImageMotelDaoProvider);
  }

  @SuppressWarnings("unchecked")
  private void initialize2(final Builder builder) {
    this.searchMotelViewModelProvider =
        SearchMotelViewModel_Factory.create(motelRepositoryProvider);
    this.addMotelInfoViewModelProvider =
        AddMotelInfoViewModel_Factory.create(userRepositoryProvider);
    this.imageMotelViewModelProvider = ImageMotelViewModel_Factory.create(motelRepositoryProvider);
    this.motelInfoViewModelProvider = MotelInfoViewModel_Factory.create(motelRepositoryProvider);
    this.moreJobViewModelProvider = MoreJobViewModel_Factory.create(jobRepositoryProvider);
    this.giftReceiveViewModelProvider = GiftReceiveViewModel_Factory.create(giftRepositoryProvider);
    this.tGiftReceivedViewModelProvider =
        TGiftReceivedViewModel_Factory.create(giftRepositoryProvider);
    this.tMoreJobViewModelProvider = TMoreJobViewModel_Factory.create(jobRepositoryProvider);
    this.tSearchMotelViewModelProvider =
        TSearchMotelViewModel_Factory.create(motelRepositoryProvider);
    this.tMotelInfoViewModelProvider = TMotelInfoViewModel_Factory.create(motelRepositoryProvider);
    this.tAddNewAddressViewModelProvider =
        TAddNewAddressViewModel_Factory.create(userRepositoryProvider);
    this.tListAddressViewModelProvider =
        TListAddressViewModel_Factory.create(userRepositoryProvider);
    this.tAddMotelInfoViewModelProvider =
        TAddMotelInfoViewModel_Factory.create(userRepositoryProvider);
    this.tImageMotelViewModelProvider =
        TImageMotelViewModel_Factory.create(motelRepositoryProvider);
    this.tApplyGiftViewModelProvider = TApplyGiftViewModel_Factory.create(giftRepositoryProvider);
    this.tReceiverAddressViewModelProvider =
        TReceiverAddressViewModel_Factory.create(userRepositoryProvider);
    this.motelRegistrationRepositoryProvider =
        MotelRegistrationRepository_Factory.create(
            provideApiServiceProvider, appExecutorsProvider, sharedPrefsHelperProvider);
    this.motelRegistrationListViewModelProvider =
        MotelRegistrationListViewModel_Factory.create(motelRegistrationRepositoryProvider);
    this.motelRegistrationInfoViewModelProvider =
        MotelRegistrationInfoViewModel_Factory.create(motelRegistrationRepositoryProvider);
    this.motelRegistrationCompleteViewModelProvider =
        MotelRegistrationCompleteViewModel_Factory.create(motelRegistrationRepositoryProvider);
    this.registerToFindMotelViewModelProvider =
        RegisterToFindMotelViewModel_Factory.create(motelRegistrationRepositoryProvider);
    this.studentList2ViewModelProvider =
        StudentList2ViewModel_Factory.create(teacherRepositoryProvider);
    this.mapOfClassOfAndProviderOfViewModelProvider =
        MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(97)
            .put(
                ActivityDetailByUserUnitViewModel.class,
                (Provider) activityDetailByUserUnitViewModelProvider)
            .put(ScheduleViewModel.class, (Provider) scheduleViewModelProvider)
            .put(MessageListViewModel.class, (Provider) messageListViewModelProvider)
            .put(
                UserCheckInActivityViewModel.class, (Provider) userCheckInActivityViewModelProvider)
            .put(RegisterViewModel.class, (Provider) registerViewModelProvider)
            .put(ChangePasswordViewModel.class, (Provider) changePasswordViewModelProvider)
            .put(LostPasswordViewModel.class, (Provider) lostPasswordViewModelProvider)
            .put(
                CheckOTPLostPasswordViewModel.class,
                (Provider) checkOTPLostPasswordViewModelProvider)
            .put(LoginViewModel.class, (Provider) loginViewModelProvider)
            .put(UserInfoViewModel.class, (Provider) userInfoViewModelProvider)
            .put(AccountViewModel.class, (Provider) AccountViewModel_Factory.create())
            .put(HomeViewModel.class, (Provider) HomeViewModel_Factory.create())
            .put(ListActivityViewModel.class, (Provider) listActivityViewModelProvider)
            .put(ListScholarShipsViewModel.class, (Provider) listScholarShipsViewModelProvider)
            .put(
                ListScholarShipAppliedViewModel.class,
                (Provider) listScholarShipAppliedViewModelProvider)
            .put(ScholarShipDetailViewModel.class, (Provider) scholarShipDetailViewModelProvider)
            .put(ListJobsViewModel.class, (Provider) listJobsViewModelProvider)
            .put(JobDetailViewModel.class, (Provider) JobDetailViewModel_Factory.create())
            .put(ListJobApplyViewModel.class, (Provider) listJobApplyViewModelProvider)
            .put(ApplyJobViewModel.class, (Provider) applyJobViewModelProvider)
            .put(QrStudentViewModel.class, (Provider) QrStudentViewModel_Factory.create())
            .put(ListAddressViewModel.class, (Provider) listAddressViewModelProvider)
            .put(AddNewAddressViewModel.class, (Provider) addNewAddressViewModelProvider)
            .put(ListFormsViewModel.class, (Provider) listFormsViewModelProvider)
            .put(
                FormRegisteredDetailViewModel.class,
                (Provider) formRegisteredDetailViewModelProvider)
            .put(
                ListFormsRegisteredViewModel.class, (Provider) listFormsRegisteredViewModelProvider)
            .put(RegisterFormViewModel.class, (Provider) registerFormViewModelProvider)
            .put(TrainingPointViewModel.class, (Provider) trainingPointViewModelProvider)
            .put(CriteriaViewModel.class, (Provider) criteriaViewModelProvider)
            .put(EditFormViewModel.class, (Provider) editFormViewModelProvider)
            .put(TimeTableViewModel.class, (Provider) timeTableViewModelProvider)
            .put(THomeViewModel.class, (Provider) THomeViewModel_Factory.create())
            .put(TListFormViewModel.class, (Provider) tListFormViewModelProvider)
            .put(TRegisterFormViewModel.class, (Provider) tRegisterFormViewModelProvider)
            .put(
                TListFormRegisteredViewModel.class, (Provider) tListFormRegisteredViewModelProvider)
            .put(TFormRegisteredViewModel.class, (Provider) tFormRegisteredViewModelProvider)
            .put(TEditFormViewModel.class, (Provider) tEditFormViewModelProvider)
            .put(TListActivitiesViewModel.class, (Provider) tListActivitiesViewModelProvider)
            .put(TActivityInfoViewModel.class, (Provider) tActivityInfoViewModelProvider)
            .put(TListScholarShipsViewModel.class, (Provider) tListScholarShipsViewModelProvider)
            .put(TListJobsViewModel.class, (Provider) tListJobsViewModelProvider)
            .put(TListNotificationsViewModel.class, (Provider) tListNotificationsViewModelProvider)
            .put(TAccountViewModel.class, (Provider) TAccountViewModel_Factory.create())
            .put(TChangePasswordViewModel.class, (Provider) tChangePasswordViewModelProvider)
            .put(TeacherInfoViewModel.class, (Provider) teacherInfoViewModelProvider)
            .put(ListStudentViewModel.class, (Provider) listStudentViewModelProvider)
            .put(
                ListActivitiesOfStudentViewModel.class,
                (Provider) listActivitiesOfStudentViewModelProvider)
            .put(StudentInfoViewModel.class, (Provider) studentInfoViewModelProvider)
            .put(TeacherMarkViewModel.class, (Provider) teacherMarkViewModelProvider)
            .put(NotesViewModel.class, (Provider) notesViewModelProvider)
            .put(TStudentNoteViewModel.class, (Provider) tStudentNoteViewModelProvider)
            .put(ChooseDeliveryTypeViewModel.class, (Provider) chooseDeliveryTypeViewModelProvider)
            .put(
                ChooseReceiverAddressViewModel.class,
                (Provider) chooseReceiverAddressViewModelProvider)
            .put(RunningViewModel.class, (Provider) RunningViewModel_Factory.create())
            .put(RunningDataViewModel.class, (Provider) runningDataViewModelProvider)
            .put(RunDashboardViewModel.class, (Provider) runDashboardViewModelProvider)
            .put(RunViewModel.class, (Provider) runViewModelProvider)
            .put(Home2ViewModel.class, (Provider) home2ViewModelProvider)
            .put(GiftViewModel.class, (Provider) giftViewModelProvider)
            .put(GiftInfoViewModel.class, (Provider) giftInfoViewModelProvider)
            .put(ApplyGiftViewModel.class, (Provider) applyGiftViewModelProvider)
            .put(CreateGiftViewModel.class, (Provider) createGiftViewModelProvider)
            .put(GiftGivenViewModel.class, (Provider) giftGivenViewModelProvider)
            .put(ListRegisterViewModel.class, (Provider) listRegisterViewModelProvider)
            .put(THome2ViewModel.class, (Provider) tHome2ViewModelProvider)
            .put(TGiftGivenViewModel.class, (Provider) tGiftGivenViewModelProvider)
            .put(TCreateGiftViewModel.class, (Provider) tCreateGiftViewModelProvider)
            .put(TListRegisterViewModel.class, (Provider) tListRegisterViewModelProvider)
            .put(ReceiverAddressViewModel.class, (Provider) receiverAddressViewModelProvider)
            .put(TGiftViewModel.class, (Provider) tGiftViewModelProvider)
            .put(TGiftInfoViewModel.class, (Provider) tGiftInfoViewModelProvider)
            .put(SearchMotelViewModel.class, (Provider) searchMotelViewModelProvider)
            .put(AddMotelInfoViewModel.class, (Provider) addMotelInfoViewModelProvider)
            .put(ImageMotelViewModel.class, (Provider) imageMotelViewModelProvider)
            .put(MotelInfoViewModel.class, (Provider) motelInfoViewModelProvider)
            .put(MoreJobViewModel.class, (Provider) moreJobViewModelProvider)
            .put(GiftReceiveViewModel.class, (Provider) giftReceiveViewModelProvider)
            .put(TGiftReceivedViewModel.class, (Provider) tGiftReceivedViewModelProvider)
            .put(TMoreJobViewModel.class, (Provider) tMoreJobViewModelProvider)
            .put(TSearchMotelViewModel.class, (Provider) tSearchMotelViewModelProvider)
            .put(TMotelInfoViewModel.class, (Provider) tMotelInfoViewModelProvider)
            .put(TAddNewAddressViewModel.class, (Provider) tAddNewAddressViewModelProvider)
            .put(TListAddressViewModel.class, (Provider) tListAddressViewModelProvider)
            .put(TAddMotelInfoViewModel.class, (Provider) tAddMotelInfoViewModelProvider)
            .put(TImageMotelViewModel.class, (Provider) tImageMotelViewModelProvider)
            .put(TApplyGiftViewModel.class, (Provider) tApplyGiftViewModelProvider)
            .put(TReceiverAddressViewModel.class, (Provider) tReceiverAddressViewModelProvider)
            .put(TutorViewModel.class, (Provider) TutorViewModel_Factory.create())
            .put(TTutorViewModel.class, (Provider) TTutorViewModel_Factory.create())
            .put(
                MotelRegistrationListViewModel.class,
                (Provider) motelRegistrationListViewModelProvider)
            .put(
                MotelRegistrationInfoViewModel.class,
                (Provider) motelRegistrationInfoViewModelProvider)
            .put(
                MotelRegistrationProcessingViewModel.class,
                (Provider) MotelRegistrationProcessingViewModel_Factory.create())
            .put(
                MotelRegistrationCompleteViewModel.class,
                (Provider) motelRegistrationCompleteViewModelProvider)
            .put(
                RegisterToFindMotelViewModel.class, (Provider) registerToFindMotelViewModelProvider)
            .put(
                PickMotelLocationViewModel.class,
                (Provider) PickMotelLocationViewModel_Factory.create())
            .put(
                ListMotelResultsViewModel.class,
                (Provider) ListMotelResultsViewModel_Factory.create())
            .put(StudentList2ViewModel.class, (Provider) studentList2ViewModelProvider)
            .build();
    this.viewModelFactoryProvider =
        DoubleCheck.provider(
            ViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider));
    this.provideRunningLocationDaoProvider =
        DoubleCheck.provider(
            AppModule_ProvideRunningLocationDaoFactory.create(
                builder.appModule, provideDbProvider));
    this.provideRunningWayDaoProvider =
        DoubleCheck.provider(
            AppModule_ProvideRunningWayDaoFactory.create(builder.appModule, provideDbProvider));
  }

  @Override
  public void inject(App app) {
    injectApp(app);
  }

  private App injectApp(App instance) {
    App_MembersInjector.injectDispatchingAndroidInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    private App application;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (application == null) {
        throw new IllegalStateException(App.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(App application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class MainActivitySubcomponentBuilder
      extends ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.Builder {
    private MainActivity seedInstance;

    @Override
    public ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent {
    private Provider<
            MainListFragmentBuildersModule_ContributeUserCheckInActivityInfoFragment
                .UserCheckInActivityInfoFragmentSubcomponent.Builder>
        userCheckInActivityInfoFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeActivityDetailByUserFragment
                .ActivityDetailByUserUnitFragmentSubcomponent.Builder>
        activityDetailByUserUnitFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeScheduleFragment.ScheduleFragmentSubcomponent
                .Builder>
        scheduleFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeMessageListFragment
                .MessageListFragmentSubcomponent.Builder>
        messageListFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeAccountFragment.AccountFragmentSubcomponent
                .Builder>
        accountFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeChangePasswordFragment
                .ChangePasswordFragmentSubcomponent.Builder>
        changePasswordFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeUserInfoFragment.UserInfoFragmentSubcomponent
                .Builder>
        userInfoFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent.Builder>
        homeFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeListActivityFragment
                .ListActivityFragmentSubcomponent.Builder>
        listActivityFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeListScholarShipsFragment
                .ListScholarShipsFragmentSubcomponent.Builder>
        listScholarShipsFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeListScholarShipAppliedFragment
                .ListScholarShipAppliedFragmentSubcomponent.Builder>
        listScholarShipAppliedFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeScholarShipDetailFragment
                .ScholarShipDetailFragmentSubcomponent.Builder>
        scholarShipDetailFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeListJobsFragment.ListJobsFragmentSubcomponent
                .Builder>
        listJobsFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeJobDetailFragment.JobDetailFragmentSubcomponent
                .Builder>
        jobDetailFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeListJobApply.ListJobApplyFragmentSubcomponent
                .Builder>
        listJobApplyFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeApplyJob.ApplyJobFragmentSubcomponent.Builder>
        applyJobFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeQRStudent.QrStudentFragmentSubcomponent
                .Builder>
        qrStudentFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeListAddressFragment
                .ListAddressFragmentSubcomponent.Builder>
        listAddressFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeAddNewAddressFragment
                .AddNewAddressFragmentSubcomponent.Builder>
        addNewAddressFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeListFormsFragment.ListFormsFragmentSubcomponent
                .Builder>
        listFormsFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeListFormsRegisteredFragment
                .ListFormsRegisteredFragmentSubcomponent.Builder>
        listFormsRegisteredFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeFormRegisteredDetailFragment
                .FormRegisteredDetailFragmentSubcomponent.Builder>
        formRegisteredDetailFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeRegisterFormFragment
                .RegisterFormFragmentSubcomponent.Builder>
        registerFormFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeTrainingPointFragment
                .TrainingPointFragmentSubcomponent.Builder>
        trainingPointFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeCriteriaFragment.CriteriaFragmentSubcomponent
                .Builder>
        criteriaFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeEditFormFragment.EditFormFragmentSubcomponent
                .Builder>
        editFormFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeTimeTableFragment.TimeTableFragmentSubcomponent
                .Builder>
        timeTableFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeNotesFragment.NotesFragmentSubcomponent
                .Builder>
        notesFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeChooseDeliveryTypeFragment
                .ChooseDeliveryTypeFragmentSubcomponent.Builder>
        chooseDeliveryTypeFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeChooseReceiverAddressFragment
                .ChooseReceiverAddressFragmentSubcomponent.Builder>
        chooseReceiverAddressFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeRunningFragment.RunningFragmentSubcomponent
                .Builder>
        runningFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeRunningDataFragment
                .RunningDataFragmentSubcomponent.Builder>
        runningDataFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeRunDashboardFragment
                .RunDashboardFragmentSubcomponent.Builder>
        runDashboardFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeRunFragment.RunFragmentSubcomponent.Builder>
        runFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeHome2Fragment.Home2FragmentSubcomponent
                .Builder>
        home2FragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeGiftFragment.GiftFragmentSubcomponent.Builder>
        giftFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeGiftInfoFragment.GiftInfoFragmentSubcomponent
                .Builder>
        giftInfoFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeRegisterGiftFragment
                .ApplyGiftFragmentSubcomponent.Builder>
        applyGiftFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeCreateGiftFragment
                .CreateGiftFragmentSubcomponent.Builder>
        createGiftFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeGiftGivenFragment.GiftGivenFragmentSubcomponent
                .Builder>
        giftGivenFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeListRegisterFragment
                .ListRegisterFragmentSubcomponent.Builder>
        listRegisterFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeReceiverAddressFragment
                .ReceiverAddressFragmentSubcomponent.Builder>
        receiverAddressFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeSearchMotelFragment
                .SearchMotelFragmentSubcomponent.Builder>
        searchMotelFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeMotelInfoFragment.MotelInfoFragmentSubcomponent
                .Builder>
        motelInfoFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeAddMotelFragment
                .AddMotelInfoFragmentSubcomponent.Builder>
        addMotelInfoFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeImageMotelFragment
                .ImageMotelFragmentSubcomponent.Builder>
        imageMotelFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeMoreJobFragment.MoreJobFragmentSubcomponent
                .Builder>
        moreJobFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeGiftReceiveFragment
                .GiftReceiveFragmentSubcomponent.Builder>
        giftReceiveFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeTutorFragment.TutorFragmentSubcomponent
                .Builder>
        tutorFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeMotelRegistrationComplete
                .MotelRegistrationCompleteFragmentSubcomponent.Builder>
        motelRegistrationCompleteFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeMotelRegistrationInfo
                .MotelRegistrationInfoFragmentSubcomponent.Builder>
        motelRegistrationInfoFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeMotelRegistrationList
                .MotelRegistrationListFragmentSubcomponent.Builder>
        motelRegistrationListFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeMotelRegistrationProcessing
                .MotelRegistrationProcessingFragmentSubcomponent.Builder>
        motelRegistrationProcessingFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeRegisterToFindMotel
                .RegisterToFindMotelFragmentSubcomponent.Builder>
        registerToFindMotelFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributePickMotelLocation
                .PickMotelLocationFragmentSubcomponent.Builder>
        pickMotelLocationFragmentSubcomponentBuilderProvider;

    private Provider<
            MainListFragmentBuildersModule_ContributeListMotelResult
                .ListMotelResultsFragmentSubcomponent.Builder>
        listMotelResultsFragmentSubcomponentBuilderProvider;

    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(56)
          .put(
              UserCheckInActivityInfoFragment.class,
              (Provider) userCheckInActivityInfoFragmentSubcomponentBuilderProvider)
          .put(
              ActivityDetailByUserUnitFragment.class,
              (Provider) activityDetailByUserUnitFragmentSubcomponentBuilderProvider)
          .put(ScheduleFragment.class, (Provider) scheduleFragmentSubcomponentBuilderProvider)
          .put(MessageListFragment.class, (Provider) messageListFragmentSubcomponentBuilderProvider)
          .put(AccountFragment.class, (Provider) accountFragmentSubcomponentBuilderProvider)
          .put(
              ChangePasswordFragment.class,
              (Provider) changePasswordFragmentSubcomponentBuilderProvider)
          .put(UserInfoFragment.class, (Provider) userInfoFragmentSubcomponentBuilderProvider)
          .put(HomeFragment.class, (Provider) homeFragmentSubcomponentBuilderProvider)
          .put(
              ListActivityFragment.class,
              (Provider) listActivityFragmentSubcomponentBuilderProvider)
          .put(
              ListScholarShipsFragment.class,
              (Provider) listScholarShipsFragmentSubcomponentBuilderProvider)
          .put(
              ListScholarShipAppliedFragment.class,
              (Provider) listScholarShipAppliedFragmentSubcomponentBuilderProvider)
          .put(
              ScholarShipDetailFragment.class,
              (Provider) scholarShipDetailFragmentSubcomponentBuilderProvider)
          .put(ListJobsFragment.class, (Provider) listJobsFragmentSubcomponentBuilderProvider)
          .put(JobDetailFragment.class, (Provider) jobDetailFragmentSubcomponentBuilderProvider)
          .put(
              ListJobApplyFragment.class,
              (Provider) listJobApplyFragmentSubcomponentBuilderProvider)
          .put(ApplyJobFragment.class, (Provider) applyJobFragmentSubcomponentBuilderProvider)
          .put(QrStudentFragment.class, (Provider) qrStudentFragmentSubcomponentBuilderProvider)
          .put(ListAddressFragment.class, (Provider) listAddressFragmentSubcomponentBuilderProvider)
          .put(
              AddNewAddressFragment.class,
              (Provider) addNewAddressFragmentSubcomponentBuilderProvider)
          .put(ListFormsFragment.class, (Provider) listFormsFragmentSubcomponentBuilderProvider)
          .put(
              ListFormsRegisteredFragment.class,
              (Provider) listFormsRegisteredFragmentSubcomponentBuilderProvider)
          .put(
              FormRegisteredDetailFragment.class,
              (Provider) formRegisteredDetailFragmentSubcomponentBuilderProvider)
          .put(
              RegisterFormFragment.class,
              (Provider) registerFormFragmentSubcomponentBuilderProvider)
          .put(
              TrainingPointFragment.class,
              (Provider) trainingPointFragmentSubcomponentBuilderProvider)
          .put(CriteriaFragment.class, (Provider) criteriaFragmentSubcomponentBuilderProvider)
          .put(EditFormFragment.class, (Provider) editFormFragmentSubcomponentBuilderProvider)
          .put(TimeTableFragment.class, (Provider) timeTableFragmentSubcomponentBuilderProvider)
          .put(NotesFragment.class, (Provider) notesFragmentSubcomponentBuilderProvider)
          .put(
              ChooseDeliveryTypeFragment.class,
              (Provider) chooseDeliveryTypeFragmentSubcomponentBuilderProvider)
          .put(
              ChooseReceiverAddressFragment.class,
              (Provider) chooseReceiverAddressFragmentSubcomponentBuilderProvider)
          .put(RunningFragment.class, (Provider) runningFragmentSubcomponentBuilderProvider)
          .put(RunningDataFragment.class, (Provider) runningDataFragmentSubcomponentBuilderProvider)
          .put(
              RunDashboardFragment.class,
              (Provider) runDashboardFragmentSubcomponentBuilderProvider)
          .put(RunFragment.class, (Provider) runFragmentSubcomponentBuilderProvider)
          .put(Home2Fragment.class, (Provider) home2FragmentSubcomponentBuilderProvider)
          .put(GiftFragment.class, (Provider) giftFragmentSubcomponentBuilderProvider)
          .put(GiftInfoFragment.class, (Provider) giftInfoFragmentSubcomponentBuilderProvider)
          .put(ApplyGiftFragment.class, (Provider) applyGiftFragmentSubcomponentBuilderProvider)
          .put(CreateGiftFragment.class, (Provider) createGiftFragmentSubcomponentBuilderProvider)
          .put(GiftGivenFragment.class, (Provider) giftGivenFragmentSubcomponentBuilderProvider)
          .put(
              ListRegisterFragment.class,
              (Provider) listRegisterFragmentSubcomponentBuilderProvider)
          .put(
              ReceiverAddressFragment.class,
              (Provider) receiverAddressFragmentSubcomponentBuilderProvider)
          .put(SearchMotelFragment.class, (Provider) searchMotelFragmentSubcomponentBuilderProvider)
          .put(MotelInfoFragment.class, (Provider) motelInfoFragmentSubcomponentBuilderProvider)
          .put(
              AddMotelInfoFragment.class,
              (Provider) addMotelInfoFragmentSubcomponentBuilderProvider)
          .put(ImageMotelFragment.class, (Provider) imageMotelFragmentSubcomponentBuilderProvider)
          .put(MoreJobFragment.class, (Provider) moreJobFragmentSubcomponentBuilderProvider)
          .put(GiftReceiveFragment.class, (Provider) giftReceiveFragmentSubcomponentBuilderProvider)
          .put(TutorFragment.class, (Provider) tutorFragmentSubcomponentBuilderProvider)
          .put(
              MotelRegistrationCompleteFragment.class,
              (Provider) motelRegistrationCompleteFragmentSubcomponentBuilderProvider)
          .put(
              MotelRegistrationInfoFragment.class,
              (Provider) motelRegistrationInfoFragmentSubcomponentBuilderProvider)
          .put(
              MotelRegistrationListFragment.class,
              (Provider) motelRegistrationListFragmentSubcomponentBuilderProvider)
          .put(
              MotelRegistrationProcessingFragment.class,
              (Provider) motelRegistrationProcessingFragmentSubcomponentBuilderProvider)
          .put(
              RegisterToFindMotelFragment.class,
              (Provider) registerToFindMotelFragmentSubcomponentBuilderProvider)
          .put(
              PickMotelLocationFragment.class,
              (Provider) pickMotelLocationFragmentSubcomponentBuilderProvider)
          .put(
              ListMotelResultsFragment.class,
              (Provider) listMotelResultsFragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf(),
          Collections.<String, Provider<AndroidInjector.Factory<? extends Fragment>>>emptyMap());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivitySubcomponentBuilder builder) {
      this.userCheckInActivityInfoFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeUserCheckInActivityInfoFragment
                  .UserCheckInActivityInfoFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeUserCheckInActivityInfoFragment
                    .UserCheckInActivityInfoFragmentSubcomponent.Builder
                get() {
              return new UserCheckInActivityInfoFragmentSubcomponentBuilder();
            }
          };
      this.activityDetailByUserUnitFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeActivityDetailByUserFragment
                  .ActivityDetailByUserUnitFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeActivityDetailByUserFragment
                    .ActivityDetailByUserUnitFragmentSubcomponent.Builder
                get() {
              return new ActivityDetailByUserUnitFragmentSubcomponentBuilder();
            }
          };
      this.scheduleFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeScheduleFragment.ScheduleFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeScheduleFragment
                    .ScheduleFragmentSubcomponent.Builder
                get() {
              return new ScheduleFragmentSubcomponentBuilder();
            }
          };
      this.messageListFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeMessageListFragment
                  .MessageListFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeMessageListFragment
                    .MessageListFragmentSubcomponent.Builder
                get() {
              return new MessageListFragmentSubcomponentBuilder();
            }
          };
      this.accountFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeAccountFragment.AccountFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeAccountFragment
                    .AccountFragmentSubcomponent.Builder
                get() {
              return new AccountFragmentSubcomponentBuilder();
            }
          };
      this.changePasswordFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeChangePasswordFragment
                  .ChangePasswordFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeChangePasswordFragment
                    .ChangePasswordFragmentSubcomponent.Builder
                get() {
              return new ChangePasswordFragmentSubcomponentBuilder();
            }
          };
      this.userInfoFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeUserInfoFragment.UserInfoFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeUserInfoFragment
                    .UserInfoFragmentSubcomponent.Builder
                get() {
              return new UserInfoFragmentSubcomponentBuilder();
            }
          };
      this.homeFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent
                    .Builder
                get() {
              return new HomeFragmentSubcomponentBuilder();
            }
          };
      this.listActivityFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeListActivityFragment
                  .ListActivityFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeListActivityFragment
                    .ListActivityFragmentSubcomponent.Builder
                get() {
              return new ListActivityFragmentSubcomponentBuilder();
            }
          };
      this.listScholarShipsFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeListScholarShipsFragment
                  .ListScholarShipsFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeListScholarShipsFragment
                    .ListScholarShipsFragmentSubcomponent.Builder
                get() {
              return new ListScholarShipsFragmentSubcomponentBuilder();
            }
          };
      this.listScholarShipAppliedFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeListScholarShipAppliedFragment
                  .ListScholarShipAppliedFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeListScholarShipAppliedFragment
                    .ListScholarShipAppliedFragmentSubcomponent.Builder
                get() {
              return new ListScholarShipAppliedFragmentSubcomponentBuilder();
            }
          };
      this.scholarShipDetailFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeScholarShipDetailFragment
                  .ScholarShipDetailFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeScholarShipDetailFragment
                    .ScholarShipDetailFragmentSubcomponent.Builder
                get() {
              return new ScholarShipDetailFragmentSubcomponentBuilder();
            }
          };
      this.listJobsFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeListJobsFragment.ListJobsFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeListJobsFragment
                    .ListJobsFragmentSubcomponent.Builder
                get() {
              return new ListJobsFragmentSubcomponentBuilder();
            }
          };
      this.jobDetailFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeJobDetailFragment
                  .JobDetailFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeJobDetailFragment
                    .JobDetailFragmentSubcomponent.Builder
                get() {
              return new JobDetailFragmentSubcomponentBuilder();
            }
          };
      this.listJobApplyFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeListJobApply.ListJobApplyFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeListJobApply
                    .ListJobApplyFragmentSubcomponent.Builder
                get() {
              return new ListJobApplyFragmentSubcomponentBuilder();
            }
          };
      this.applyJobFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeApplyJob.ApplyJobFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeApplyJob.ApplyJobFragmentSubcomponent
                    .Builder
                get() {
              return new ApplyJobFragmentSubcomponentBuilder();
            }
          };
      this.qrStudentFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeQRStudent.QrStudentFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeQRStudent.QrStudentFragmentSubcomponent
                    .Builder
                get() {
              return new QrStudentFragmentSubcomponentBuilder();
            }
          };
      this.listAddressFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeListAddressFragment
                  .ListAddressFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeListAddressFragment
                    .ListAddressFragmentSubcomponent.Builder
                get() {
              return new ListAddressFragmentSubcomponentBuilder();
            }
          };
      this.addNewAddressFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeAddNewAddressFragment
                  .AddNewAddressFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeAddNewAddressFragment
                    .AddNewAddressFragmentSubcomponent.Builder
                get() {
              return new AddNewAddressFragmentSubcomponentBuilder();
            }
          };
      this.listFormsFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeListFormsFragment
                  .ListFormsFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeListFormsFragment
                    .ListFormsFragmentSubcomponent.Builder
                get() {
              return new MLFBM_CLFF_ListFormsFragmentSubcomponentBuilder();
            }
          };
      this.listFormsRegisteredFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeListFormsRegisteredFragment
                  .ListFormsRegisteredFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeListFormsRegisteredFragment
                    .ListFormsRegisteredFragmentSubcomponent.Builder
                get() {
              return new ListFormsRegisteredFragmentSubcomponentBuilder();
            }
          };
      this.formRegisteredDetailFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeFormRegisteredDetailFragment
                  .FormRegisteredDetailFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeFormRegisteredDetailFragment
                    .FormRegisteredDetailFragmentSubcomponent.Builder
                get() {
              return new FormRegisteredDetailFragmentSubcomponentBuilder();
            }
          };
      this.registerFormFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeRegisterFormFragment
                  .RegisterFormFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeRegisterFormFragment
                    .RegisterFormFragmentSubcomponent.Builder
                get() {
              return new RegisterFormFragmentSubcomponentBuilder();
            }
          };
      this.trainingPointFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeTrainingPointFragment
                  .TrainingPointFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeTrainingPointFragment
                    .TrainingPointFragmentSubcomponent.Builder
                get() {
              return new TrainingPointFragmentSubcomponentBuilder();
            }
          };
      this.criteriaFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeCriteriaFragment.CriteriaFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeCriteriaFragment
                    .CriteriaFragmentSubcomponent.Builder
                get() {
              return new CriteriaFragmentSubcomponentBuilder();
            }
          };
      this.editFormFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeEditFormFragment.EditFormFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeEditFormFragment
                    .EditFormFragmentSubcomponent.Builder
                get() {
              return new EditFormFragmentSubcomponentBuilder();
            }
          };
      this.timeTableFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeTimeTableFragment
                  .TimeTableFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeTimeTableFragment
                    .TimeTableFragmentSubcomponent.Builder
                get() {
              return new TimeTableFragmentSubcomponentBuilder();
            }
          };
      this.notesFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeNotesFragment.NotesFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeNotesFragment.NotesFragmentSubcomponent
                    .Builder
                get() {
              return new NotesFragmentSubcomponentBuilder();
            }
          };
      this.chooseDeliveryTypeFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeChooseDeliveryTypeFragment
                  .ChooseDeliveryTypeFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeChooseDeliveryTypeFragment
                    .ChooseDeliveryTypeFragmentSubcomponent.Builder
                get() {
              return new ChooseDeliveryTypeFragmentSubcomponentBuilder();
            }
          };
      this.chooseReceiverAddressFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeChooseReceiverAddressFragment
                  .ChooseReceiverAddressFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeChooseReceiverAddressFragment
                    .ChooseReceiverAddressFragmentSubcomponent.Builder
                get() {
              return new ChooseReceiverAddressFragmentSubcomponentBuilder();
            }
          };
      this.runningFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeRunningFragment.RunningFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeRunningFragment
                    .RunningFragmentSubcomponent.Builder
                get() {
              return new RunningFragmentSubcomponentBuilder();
            }
          };
      this.runningDataFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeRunningDataFragment
                  .RunningDataFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeRunningDataFragment
                    .RunningDataFragmentSubcomponent.Builder
                get() {
              return new RunningDataFragmentSubcomponentBuilder();
            }
          };
      this.runDashboardFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeRunDashboardFragment
                  .RunDashboardFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeRunDashboardFragment
                    .RunDashboardFragmentSubcomponent.Builder
                get() {
              return new MLFBM_CRDF_RunDashboardFragmentSubcomponentBuilder();
            }
          };
      this.runFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeRunFragment.RunFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeRunFragment.RunFragmentSubcomponent
                    .Builder
                get() {
              return new MLFBM_CRF_RunFragmentSubcomponentBuilder();
            }
          };
      this.home2FragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeHome2Fragment.Home2FragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeHome2Fragment.Home2FragmentSubcomponent
                    .Builder
                get() {
              return new Home2FragmentSubcomponentBuilder();
            }
          };
      this.giftFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeGiftFragment.GiftFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeGiftFragment.GiftFragmentSubcomponent
                    .Builder
                get() {
              return new GiftFragmentSubcomponentBuilder();
            }
          };
      this.giftInfoFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeGiftInfoFragment.GiftInfoFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeGiftInfoFragment
                    .GiftInfoFragmentSubcomponent.Builder
                get() {
              return new GiftInfoFragmentSubcomponentBuilder();
            }
          };
      this.applyGiftFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeRegisterGiftFragment
                  .ApplyGiftFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeRegisterGiftFragment
                    .ApplyGiftFragmentSubcomponent.Builder
                get() {
              return new ApplyGiftFragmentSubcomponentBuilder();
            }
          };
      this.createGiftFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeCreateGiftFragment
                  .CreateGiftFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeCreateGiftFragment
                    .CreateGiftFragmentSubcomponent.Builder
                get() {
              return new CreateGiftFragmentSubcomponentBuilder();
            }
          };
      this.giftGivenFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeGiftGivenFragment
                  .GiftGivenFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeGiftGivenFragment
                    .GiftGivenFragmentSubcomponent.Builder
                get() {
              return new GiftGivenFragmentSubcomponentBuilder();
            }
          };
      this.listRegisterFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeListRegisterFragment
                  .ListRegisterFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeListRegisterFragment
                    .ListRegisterFragmentSubcomponent.Builder
                get() {
              return new ListRegisterFragmentSubcomponentBuilder();
            }
          };
      this.receiverAddressFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeReceiverAddressFragment
                  .ReceiverAddressFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeReceiverAddressFragment
                    .ReceiverAddressFragmentSubcomponent.Builder
                get() {
              return new ReceiverAddressFragmentSubcomponentBuilder();
            }
          };
      this.searchMotelFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeSearchMotelFragment
                  .SearchMotelFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeSearchMotelFragment
                    .SearchMotelFragmentSubcomponent.Builder
                get() {
              return new SearchMotelFragmentSubcomponentBuilder();
            }
          };
      this.motelInfoFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeMotelInfoFragment
                  .MotelInfoFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeMotelInfoFragment
                    .MotelInfoFragmentSubcomponent.Builder
                get() {
              return new MotelInfoFragmentSubcomponentBuilder();
            }
          };
      this.addMotelInfoFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeAddMotelFragment
                  .AddMotelInfoFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeAddMotelFragment
                    .AddMotelInfoFragmentSubcomponent.Builder
                get() {
              return new AddMotelInfoFragmentSubcomponentBuilder();
            }
          };
      this.imageMotelFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeImageMotelFragment
                  .ImageMotelFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeImageMotelFragment
                    .ImageMotelFragmentSubcomponent.Builder
                get() {
              return new ImageMotelFragmentSubcomponentBuilder();
            }
          };
      this.moreJobFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeMoreJobFragment.MoreJobFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeMoreJobFragment
                    .MoreJobFragmentSubcomponent.Builder
                get() {
              return new MoreJobFragmentSubcomponentBuilder();
            }
          };
      this.giftReceiveFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeGiftReceiveFragment
                  .GiftReceiveFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeGiftReceiveFragment
                    .GiftReceiveFragmentSubcomponent.Builder
                get() {
              return new GiftReceiveFragmentSubcomponentBuilder();
            }
          };
      this.tutorFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeTutorFragment.TutorFragmentSubcomponent
                  .Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeTutorFragment.TutorFragmentSubcomponent
                    .Builder
                get() {
              return new TutorFragmentSubcomponentBuilder();
            }
          };
      this.motelRegistrationCompleteFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeMotelRegistrationComplete
                  .MotelRegistrationCompleteFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeMotelRegistrationComplete
                    .MotelRegistrationCompleteFragmentSubcomponent.Builder
                get() {
              return new MotelRegistrationCompleteFragmentSubcomponentBuilder();
            }
          };
      this.motelRegistrationInfoFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeMotelRegistrationInfo
                  .MotelRegistrationInfoFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeMotelRegistrationInfo
                    .MotelRegistrationInfoFragmentSubcomponent.Builder
                get() {
              return new MotelRegistrationInfoFragmentSubcomponentBuilder();
            }
          };
      this.motelRegistrationListFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeMotelRegistrationList
                  .MotelRegistrationListFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeMotelRegistrationList
                    .MotelRegistrationListFragmentSubcomponent.Builder
                get() {
              return new MotelRegistrationListFragmentSubcomponentBuilder();
            }
          };
      this.motelRegistrationProcessingFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeMotelRegistrationProcessing
                  .MotelRegistrationProcessingFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeMotelRegistrationProcessing
                    .MotelRegistrationProcessingFragmentSubcomponent.Builder
                get() {
              return new MotelRegistrationProcessingFragmentSubcomponentBuilder();
            }
          };
      this.registerToFindMotelFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeRegisterToFindMotel
                  .RegisterToFindMotelFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeRegisterToFindMotel
                    .RegisterToFindMotelFragmentSubcomponent.Builder
                get() {
              return new RegisterToFindMotelFragmentSubcomponentBuilder();
            }
          };
      this.pickMotelLocationFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributePickMotelLocation
                  .PickMotelLocationFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributePickMotelLocation
                    .PickMotelLocationFragmentSubcomponent.Builder
                get() {
              return new PickMotelLocationFragmentSubcomponentBuilder();
            }
          };
      this.listMotelResultsFragmentSubcomponentBuilderProvider =
          new Provider<
              MainListFragmentBuildersModule_ContributeListMotelResult
                  .ListMotelResultsFragmentSubcomponent.Builder>() {
            @Override
            public MainListFragmentBuildersModule_ContributeListMotelResult
                    .ListMotelResultsFragmentSubcomponent.Builder
                get() {
              return new ListMotelResultsFragmentSubcomponentBuilder();
            }
          };
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectDispatchingAndroidInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      MainActivity_MembersInjector.injectSharedPrefsHelper(
          instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
      return instance;
    }

    private final class UserCheckInActivityInfoFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeUserCheckInActivityInfoFragment
            .UserCheckInActivityInfoFragmentSubcomponent.Builder {
      private UserCheckInActivityInfoFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeUserCheckInActivityInfoFragment
              .UserCheckInActivityInfoFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              UserCheckInActivityInfoFragment.class.getCanonicalName() + " must be set");
        }
        return new UserCheckInActivityInfoFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(UserCheckInActivityInfoFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class UserCheckInActivityInfoFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeUserCheckInActivityInfoFragment
            .UserCheckInActivityInfoFragmentSubcomponent {
      private UserCheckInActivityInfoFragmentSubcomponentImpl(
          UserCheckInActivityInfoFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(UserCheckInActivityInfoFragment arg0) {
        injectUserCheckInActivityInfoFragment(arg0);
      }

      private UserCheckInActivityInfoFragment injectUserCheckInActivityInfoFragment(
          UserCheckInActivityInfoFragment instance) {
        FragmentLocationBase_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        UserCheckInActivityInfoFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        UserCheckInActivityInfoFragment_MembersInjector.injectAppExecutors(
            instance, DaggerAppComponent.this.appExecutorsProvider.get());
        return instance;
      }
    }

    private final class ActivityDetailByUserUnitFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeActivityDetailByUserFragment
            .ActivityDetailByUserUnitFragmentSubcomponent.Builder {
      private ActivityDetailByUserUnitFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeActivityDetailByUserFragment
              .ActivityDetailByUserUnitFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ActivityDetailByUserUnitFragment.class.getCanonicalName() + " must be set");
        }
        return new ActivityDetailByUserUnitFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ActivityDetailByUserUnitFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ActivityDetailByUserUnitFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeActivityDetailByUserFragment
            .ActivityDetailByUserUnitFragmentSubcomponent {
      private ActivityDetailByUserUnitFragmentSubcomponentImpl(
          ActivityDetailByUserUnitFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ActivityDetailByUserUnitFragment arg0) {
        injectActivityDetailByUserUnitFragment(arg0);
      }

      private ActivityDetailByUserUnitFragment injectActivityDetailByUserUnitFragment(
          ActivityDetailByUserUnitFragment instance) {
        ActivityDetailByUserUnitFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        ActivityDetailByUserUnitFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class ScheduleFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeScheduleFragment
            .ScheduleFragmentSubcomponent.Builder {
      private ScheduleFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeScheduleFragment.ScheduleFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ScheduleFragment.class.getCanonicalName() + " must be set");
        }
        return new ScheduleFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ScheduleFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ScheduleFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeScheduleFragment
            .ScheduleFragmentSubcomponent {
      private ScheduleFragmentSubcomponentImpl(ScheduleFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ScheduleFragment arg0) {
        injectScheduleFragment(arg0);
      }

      private ScheduleFragment injectScheduleFragment(ScheduleFragment instance) {
        ScheduleFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        ScheduleFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        ScheduleFragment_MembersInjector.injectAppExecutors(
            instance, DaggerAppComponent.this.appExecutorsProvider.get());
        return instance;
      }
    }

    private final class MessageListFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeMessageListFragment
            .MessageListFragmentSubcomponent.Builder {
      private MessageListFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeMessageListFragment
              .MessageListFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              MessageListFragment.class.getCanonicalName() + " must be set");
        }
        return new MessageListFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(MessageListFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class MessageListFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeMessageListFragment
            .MessageListFragmentSubcomponent {
      private MessageListFragmentSubcomponentImpl(MessageListFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(MessageListFragment arg0) {
        injectMessageListFragment(arg0);
      }

      private MessageListFragment injectMessageListFragment(MessageListFragment instance) {
        MessageListFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        MessageListFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        MessageListFragment_MembersInjector.injectAppExecutors(
            instance, DaggerAppComponent.this.appExecutorsProvider.get());
        return instance;
      }
    }

    private final class AccountFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeAccountFragment.AccountFragmentSubcomponent
            .Builder {
      private AccountFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeAccountFragment.AccountFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              AccountFragment.class.getCanonicalName() + " must be set");
        }
        return new AccountFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(AccountFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class AccountFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeAccountFragment
            .AccountFragmentSubcomponent {
      private AccountFragmentSubcomponentImpl(AccountFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(AccountFragment arg0) {
        injectAccountFragment(arg0);
      }

      private AccountFragment injectAccountFragment(AccountFragment instance) {
        AccountFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class ChangePasswordFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeChangePasswordFragment
            .ChangePasswordFragmentSubcomponent.Builder {
      private ChangePasswordFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeChangePasswordFragment
              .ChangePasswordFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ChangePasswordFragment.class.getCanonicalName() + " must be set");
        }
        return new ChangePasswordFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ChangePasswordFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ChangePasswordFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeChangePasswordFragment
            .ChangePasswordFragmentSubcomponent {
      private ChangePasswordFragmentSubcomponentImpl(
          ChangePasswordFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ChangePasswordFragment arg0) {
        injectChangePasswordFragment(arg0);
      }

      private ChangePasswordFragment injectChangePasswordFragment(ChangePasswordFragment instance) {
        ChangePasswordFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        ChangePasswordFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class UserInfoFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeUserInfoFragment
            .UserInfoFragmentSubcomponent.Builder {
      private UserInfoFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeUserInfoFragment.UserInfoFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              UserInfoFragment.class.getCanonicalName() + " must be set");
        }
        return new UserInfoFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(UserInfoFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class UserInfoFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeUserInfoFragment
            .UserInfoFragmentSubcomponent {
      private UserInfoFragmentSubcomponentImpl(UserInfoFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(UserInfoFragment arg0) {
        injectUserInfoFragment(arg0);
      }

      private UserInfoFragment injectUserInfoFragment(UserInfoFragment instance) {
        UserInfoFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        UserInfoFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class HomeFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent
            .Builder {
      private HomeFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(HomeFragment.class.getCanonicalName() + " must be set");
        }
        return new HomeFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(HomeFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class HomeFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent {
      private HomeFragmentSubcomponentImpl(HomeFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(HomeFragment arg0) {
        injectHomeFragment(arg0);
      }

      private HomeFragment injectHomeFragment(HomeFragment instance) {
        HomeFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class ListActivityFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeListActivityFragment
            .ListActivityFragmentSubcomponent.Builder {
      private ListActivityFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeListActivityFragment
              .ListActivityFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListActivityFragment.class.getCanonicalName() + " must be set");
        }
        return new ListActivityFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListActivityFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ListActivityFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeListActivityFragment
            .ListActivityFragmentSubcomponent {
      private ListActivityFragmentSubcomponentImpl(
          ListActivityFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ListActivityFragment arg0) {
        injectListActivityFragment(arg0);
      }

      private ListActivityFragment injectListActivityFragment(ListActivityFragment instance) {
        ListActivityFragment_MembersInjector.injectAppExecutors(
            instance, DaggerAppComponent.this.appExecutorsProvider.get());
        ListActivityFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ListScholarShipsFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeListScholarShipsFragment
            .ListScholarShipsFragmentSubcomponent.Builder {
      private ListScholarShipsFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeListScholarShipsFragment
              .ListScholarShipsFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListScholarShipsFragment.class.getCanonicalName() + " must be set");
        }
        return new ListScholarShipsFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListScholarShipsFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ListScholarShipsFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeListScholarShipsFragment
            .ListScholarShipsFragmentSubcomponent {
      private ListScholarShipsFragmentSubcomponentImpl(
          ListScholarShipsFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ListScholarShipsFragment arg0) {
        injectListScholarShipsFragment(arg0);
      }

      private ListScholarShipsFragment injectListScholarShipsFragment(
          ListScholarShipsFragment instance) {
        ListScholarShipsFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ListScholarShipAppliedFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeListScholarShipAppliedFragment
            .ListScholarShipAppliedFragmentSubcomponent.Builder {
      private ListScholarShipAppliedFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeListScholarShipAppliedFragment
              .ListScholarShipAppliedFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListScholarShipAppliedFragment.class.getCanonicalName() + " must be set");
        }
        return new ListScholarShipAppliedFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListScholarShipAppliedFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ListScholarShipAppliedFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeListScholarShipAppliedFragment
            .ListScholarShipAppliedFragmentSubcomponent {
      private ListScholarShipAppliedFragmentSubcomponentImpl(
          ListScholarShipAppliedFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ListScholarShipAppliedFragment arg0) {
        injectListScholarShipAppliedFragment(arg0);
      }

      private ListScholarShipAppliedFragment injectListScholarShipAppliedFragment(
          ListScholarShipAppliedFragment instance) {
        ListScholarShipAppliedFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ScholarShipDetailFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeScholarShipDetailFragment
            .ScholarShipDetailFragmentSubcomponent.Builder {
      private ScholarShipDetailFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeScholarShipDetailFragment
              .ScholarShipDetailFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ScholarShipDetailFragment.class.getCanonicalName() + " must be set");
        }
        return new ScholarShipDetailFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ScholarShipDetailFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ScholarShipDetailFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeScholarShipDetailFragment
            .ScholarShipDetailFragmentSubcomponent {
      private ScholarShipDetailFragmentSubcomponentImpl(
          ScholarShipDetailFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ScholarShipDetailFragment arg0) {
        injectScholarShipDetailFragment(arg0);
      }

      private ScholarShipDetailFragment injectScholarShipDetailFragment(
          ScholarShipDetailFragment instance) {
        ScholarShipDetailFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ListJobsFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeListJobsFragment
            .ListJobsFragmentSubcomponent.Builder {
      private ListJobsFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeListJobsFragment.ListJobsFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListJobsFragment.class.getCanonicalName() + " must be set");
        }
        return new ListJobsFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListJobsFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ListJobsFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeListJobsFragment
            .ListJobsFragmentSubcomponent {
      private ListJobsFragmentSubcomponentImpl(ListJobsFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ListJobsFragment arg0) {
        injectListJobsFragment(arg0);
      }

      private ListJobsFragment injectListJobsFragment(ListJobsFragment instance) {
        ListJobsFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class JobDetailFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeJobDetailFragment
            .JobDetailFragmentSubcomponent.Builder {
      private JobDetailFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeJobDetailFragment
              .JobDetailFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              JobDetailFragment.class.getCanonicalName() + " must be set");
        }
        return new JobDetailFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(JobDetailFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class JobDetailFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeJobDetailFragment
            .JobDetailFragmentSubcomponent {
      private JobDetailFragmentSubcomponentImpl(JobDetailFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(JobDetailFragment arg0) {}
    }

    private final class ListJobApplyFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeListJobApply
            .ListJobApplyFragmentSubcomponent.Builder {
      private ListJobApplyFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeListJobApply.ListJobApplyFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListJobApplyFragment.class.getCanonicalName() + " must be set");
        }
        return new ListJobApplyFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListJobApplyFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ListJobApplyFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeListJobApply
            .ListJobApplyFragmentSubcomponent {
      private ListJobApplyFragmentSubcomponentImpl(
          ListJobApplyFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ListJobApplyFragment arg0) {
        injectListJobApplyFragment(arg0);
      }

      private ListJobApplyFragment injectListJobApplyFragment(ListJobApplyFragment instance) {
        ListJobApplyFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ApplyJobFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeApplyJob.ApplyJobFragmentSubcomponent
            .Builder {
      private ApplyJobFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeApplyJob.ApplyJobFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ApplyJobFragment.class.getCanonicalName() + " must be set");
        }
        return new ApplyJobFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ApplyJobFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ApplyJobFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeApplyJob.ApplyJobFragmentSubcomponent {
      private ApplyJobFragmentSubcomponentImpl(ApplyJobFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ApplyJobFragment arg0) {
        injectApplyJobFragment(arg0);
      }

      private ApplyJobFragment injectApplyJobFragment(ApplyJobFragment instance) {
        ApplyJobFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class QrStudentFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeQRStudent.QrStudentFragmentSubcomponent
            .Builder {
      private QrStudentFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeQRStudent.QrStudentFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              QrStudentFragment.class.getCanonicalName() + " must be set");
        }
        return new QrStudentFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(QrStudentFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class QrStudentFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeQRStudent
            .QrStudentFragmentSubcomponent {
      private QrStudentFragmentSubcomponentImpl(QrStudentFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(QrStudentFragment arg0) {
        injectQrStudentFragment(arg0);
      }

      private QrStudentFragment injectQrStudentFragment(QrStudentFragment instance) {
        QrStudentFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class ListAddressFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeListAddressFragment
            .ListAddressFragmentSubcomponent.Builder {
      private ListAddressFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeListAddressFragment
              .ListAddressFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListAddressFragment.class.getCanonicalName() + " must be set");
        }
        return new ListAddressFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListAddressFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ListAddressFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeListAddressFragment
            .ListAddressFragmentSubcomponent {
      private ListAddressFragmentSubcomponentImpl(ListAddressFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ListAddressFragment arg0) {
        injectListAddressFragment(arg0);
      }

      private ListAddressFragment injectListAddressFragment(ListAddressFragment instance) {
        ListAddressFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class AddNewAddressFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeAddNewAddressFragment
            .AddNewAddressFragmentSubcomponent.Builder {
      private AddNewAddressFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeAddNewAddressFragment
              .AddNewAddressFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              AddNewAddressFragment.class.getCanonicalName() + " must be set");
        }
        return new AddNewAddressFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(AddNewAddressFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class AddNewAddressFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeAddNewAddressFragment
            .AddNewAddressFragmentSubcomponent {
      private AddNewAddressFragmentSubcomponentImpl(
          AddNewAddressFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(AddNewAddressFragment arg0) {
        injectAddNewAddressFragment(arg0);
      }

      private AddNewAddressFragment injectAddNewAddressFragment(AddNewAddressFragment instance) {
        AddNewAddressFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        AddNewAddressFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class MLFBM_CLFF_ListFormsFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeListFormsFragment
            .ListFormsFragmentSubcomponent.Builder {
      private ListFormsFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeListFormsFragment
              .ListFormsFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListFormsFragment.class.getCanonicalName() + " must be set");
        }
        return new MLFBM_CLFF_ListFormsFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListFormsFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class MLFBM_CLFF_ListFormsFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeListFormsFragment
            .ListFormsFragmentSubcomponent {
      private MLFBM_CLFF_ListFormsFragmentSubcomponentImpl(
          MLFBM_CLFF_ListFormsFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ListFormsFragment arg0) {
        injectListFormsFragment(arg0);
      }

      private ListFormsFragment injectListFormsFragment(ListFormsFragment instance) {
        ListFormsFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ListFormsRegisteredFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeListFormsRegisteredFragment
            .ListFormsRegisteredFragmentSubcomponent.Builder {
      private ListFormsRegisteredFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeListFormsRegisteredFragment
              .ListFormsRegisteredFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListFormsRegisteredFragment.class.getCanonicalName() + " must be set");
        }
        return new ListFormsRegisteredFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListFormsRegisteredFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ListFormsRegisteredFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeListFormsRegisteredFragment
            .ListFormsRegisteredFragmentSubcomponent {
      private ListFormsRegisteredFragmentSubcomponentImpl(
          ListFormsRegisteredFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ListFormsRegisteredFragment arg0) {
        injectListFormsRegisteredFragment(arg0);
      }

      private ListFormsRegisteredFragment injectListFormsRegisteredFragment(
          ListFormsRegisteredFragment instance) {
        ListFormsRegisteredFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class FormRegisteredDetailFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeFormRegisteredDetailFragment
            .FormRegisteredDetailFragmentSubcomponent.Builder {
      private FormRegisteredDetailFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeFormRegisteredDetailFragment
              .FormRegisteredDetailFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              FormRegisteredDetailFragment.class.getCanonicalName() + " must be set");
        }
        return new FormRegisteredDetailFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(FormRegisteredDetailFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class FormRegisteredDetailFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeFormRegisteredDetailFragment
            .FormRegisteredDetailFragmentSubcomponent {
      private FormRegisteredDetailFragmentSubcomponentImpl(
          FormRegisteredDetailFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(FormRegisteredDetailFragment arg0) {
        injectFormRegisteredDetailFragment(arg0);
      }

      private FormRegisteredDetailFragment injectFormRegisteredDetailFragment(
          FormRegisteredDetailFragment instance) {
        FormRegisteredDetailFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class RegisterFormFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeRegisterFormFragment
            .RegisterFormFragmentSubcomponent.Builder {
      private RegisterFormFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeRegisterFormFragment
              .RegisterFormFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              RegisterFormFragment.class.getCanonicalName() + " must be set");
        }
        return new RegisterFormFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(RegisterFormFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class RegisterFormFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeRegisterFormFragment
            .RegisterFormFragmentSubcomponent {
      private RegisterFormFragmentSubcomponentImpl(
          RegisterFormFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(RegisterFormFragment arg0) {
        injectRegisterFormFragment(arg0);
      }

      private RegisterFormFragment injectRegisterFormFragment(RegisterFormFragment instance) {
        RegisterFormFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TrainingPointFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeTrainingPointFragment
            .TrainingPointFragmentSubcomponent.Builder {
      private TrainingPointFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeTrainingPointFragment
              .TrainingPointFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TrainingPointFragment.class.getCanonicalName() + " must be set");
        }
        return new TrainingPointFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TrainingPointFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TrainingPointFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeTrainingPointFragment
            .TrainingPointFragmentSubcomponent {
      private TrainingPointFragmentSubcomponentImpl(
          TrainingPointFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TrainingPointFragment arg0) {
        injectTrainingPointFragment(arg0);
      }

      private TrainingPointFragment injectTrainingPointFragment(TrainingPointFragment instance) {
        TrainingPointFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class CriteriaFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeCriteriaFragment
            .CriteriaFragmentSubcomponent.Builder {
      private CriteriaFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeCriteriaFragment.CriteriaFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              CriteriaFragment.class.getCanonicalName() + " must be set");
        }
        return new CriteriaFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(CriteriaFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class CriteriaFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeCriteriaFragment
            .CriteriaFragmentSubcomponent {
      private CriteriaFragmentSubcomponentImpl(CriteriaFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(CriteriaFragment arg0) {
        injectCriteriaFragment(arg0);
      }

      private CriteriaFragment injectCriteriaFragment(CriteriaFragment instance) {
        CriteriaFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class EditFormFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeEditFormFragment
            .EditFormFragmentSubcomponent.Builder {
      private EditFormFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeEditFormFragment.EditFormFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              EditFormFragment.class.getCanonicalName() + " must be set");
        }
        return new EditFormFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(EditFormFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class EditFormFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeEditFormFragment
            .EditFormFragmentSubcomponent {
      private EditFormFragmentSubcomponentImpl(EditFormFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(EditFormFragment arg0) {
        injectEditFormFragment(arg0);
      }

      private EditFormFragment injectEditFormFragment(EditFormFragment instance) {
        EditFormFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TimeTableFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeTimeTableFragment
            .TimeTableFragmentSubcomponent.Builder {
      private TimeTableFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeTimeTableFragment
              .TimeTableFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TimeTableFragment.class.getCanonicalName() + " must be set");
        }
        return new TimeTableFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TimeTableFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TimeTableFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeTimeTableFragment
            .TimeTableFragmentSubcomponent {
      private TimeTableFragmentSubcomponentImpl(TimeTableFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TimeTableFragment arg0) {
        injectTimeTableFragment(arg0);
      }

      private TimeTableFragment injectTimeTableFragment(TimeTableFragment instance) {
        TimeTableFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class NotesFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeNotesFragment.NotesFragmentSubcomponent
            .Builder {
      private NotesFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeNotesFragment.NotesFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(NotesFragment.class.getCanonicalName() + " must be set");
        }
        return new NotesFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(NotesFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class NotesFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeNotesFragment
            .NotesFragmentSubcomponent {
      private NotesFragmentSubcomponentImpl(NotesFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(NotesFragment arg0) {
        injectNotesFragment(arg0);
      }

      private NotesFragment injectNotesFragment(NotesFragment instance) {
        NotesFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ChooseDeliveryTypeFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeChooseDeliveryTypeFragment
            .ChooseDeliveryTypeFragmentSubcomponent.Builder {
      private ChooseDeliveryTypeFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeChooseDeliveryTypeFragment
              .ChooseDeliveryTypeFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ChooseDeliveryTypeFragment.class.getCanonicalName() + " must be set");
        }
        return new ChooseDeliveryTypeFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ChooseDeliveryTypeFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ChooseDeliveryTypeFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeChooseDeliveryTypeFragment
            .ChooseDeliveryTypeFragmentSubcomponent {
      private ChooseDeliveryTypeFragmentSubcomponentImpl(
          ChooseDeliveryTypeFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ChooseDeliveryTypeFragment arg0) {
        injectChooseDeliveryTypeFragment(arg0);
      }

      private ChooseDeliveryTypeFragment injectChooseDeliveryTypeFragment(
          ChooseDeliveryTypeFragment instance) {
        ChooseDeliveryTypeFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        ChooseDeliveryTypeFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class ChooseReceiverAddressFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeChooseReceiverAddressFragment
            .ChooseReceiverAddressFragmentSubcomponent.Builder {
      private ChooseReceiverAddressFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeChooseReceiverAddressFragment
              .ChooseReceiverAddressFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ChooseReceiverAddressFragment.class.getCanonicalName() + " must be set");
        }
        return new ChooseReceiverAddressFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ChooseReceiverAddressFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ChooseReceiverAddressFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeChooseReceiverAddressFragment
            .ChooseReceiverAddressFragmentSubcomponent {
      private ChooseReceiverAddressFragmentSubcomponentImpl(
          ChooseReceiverAddressFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ChooseReceiverAddressFragment arg0) {
        injectChooseReceiverAddressFragment(arg0);
      }

      private ChooseReceiverAddressFragment injectChooseReceiverAddressFragment(
          ChooseReceiverAddressFragment instance) {
        ChooseReceiverAddressFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class RunningFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeRunningFragment.RunningFragmentSubcomponent
            .Builder {
      private RunningFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeRunningFragment.RunningFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              RunningFragment.class.getCanonicalName() + " must be set");
        }
        return new RunningFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(RunningFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class RunningFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeRunningFragment
            .RunningFragmentSubcomponent {
      private RunningFragmentSubcomponentImpl(RunningFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(RunningFragment arg0) {
        injectRunningFragment(arg0);
      }

      private RunningFragment injectRunningFragment(RunningFragment instance) {
        RunningFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        RunningFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        RunningFragment_MembersInjector.injectRunningLocationDao(
            instance, DaggerAppComponent.this.provideRunningLocationDaoProvider.get());
        RunningFragment_MembersInjector.injectRunningWayDao(
            instance, DaggerAppComponent.this.provideRunningWayDaoProvider.get());
        return instance;
      }
    }

    private final class RunningDataFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeRunningDataFragment
            .RunningDataFragmentSubcomponent.Builder {
      private RunningDataFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeRunningDataFragment
              .RunningDataFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              RunningDataFragment.class.getCanonicalName() + " must be set");
        }
        return new RunningDataFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(RunningDataFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class RunningDataFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeRunningDataFragment
            .RunningDataFragmentSubcomponent {
      private RunningDataFragmentSubcomponentImpl(RunningDataFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(RunningDataFragment arg0) {
        injectRunningDataFragment(arg0);
      }

      private RunningDataFragment injectRunningDataFragment(RunningDataFragment instance) {
        RunningDataFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        RunningDataFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class MLFBM_CRDF_RunDashboardFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeRunDashboardFragment
            .RunDashboardFragmentSubcomponent.Builder {
      private RunDashboardFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeRunDashboardFragment
              .RunDashboardFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              RunDashboardFragment.class.getCanonicalName() + " must be set");
        }
        return new MLFBM_CRDF_RunDashboardFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(RunDashboardFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class MLFBM_CRDF_RunDashboardFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeRunDashboardFragment
            .RunDashboardFragmentSubcomponent {
      private MLFBM_CRDF_RunDashboardFragmentSubcomponentImpl(
          MLFBM_CRDF_RunDashboardFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(RunDashboardFragment arg0) {
        injectRunDashboardFragment(arg0);
      }

      private RunDashboardFragment injectRunDashboardFragment(RunDashboardFragment instance) {
        RunDashboardFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        RunDashboardFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        RunDashboardFragment_MembersInjector.injectRunDataDao(
            instance, DaggerAppComponent.this.provideRunResultProvider.get());
        return instance;
      }
    }

    private final class MLFBM_CRF_RunFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeRunFragment.RunFragmentSubcomponent
            .Builder {
      private RunFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeRunFragment.RunFragmentSubcomponent build() {
        if (seedInstance == null) {
          throw new IllegalStateException(RunFragment.class.getCanonicalName() + " must be set");
        }
        return new MLFBM_CRF_RunFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(RunFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class MLFBM_CRF_RunFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeRunFragment.RunFragmentSubcomponent {
      private MLFBM_CRF_RunFragmentSubcomponentImpl(
          MLFBM_CRF_RunFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(RunFragment arg0) {
        injectRunFragment(arg0);
      }

      private RunFragment injectRunFragment(RunFragment instance) {
        RunFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        RunFragment_MembersInjector.injectRunningLocationDao(
            instance, DaggerAppComponent.this.provideRunningLocationDaoProvider.get());
        RunFragment_MembersInjector.injectRunningWayDao(
            instance, DaggerAppComponent.this.provideRunningWayDaoProvider.get());
        RunFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        RunFragment_MembersInjector.injectRunDataDao(
            instance, DaggerAppComponent.this.provideRunResultProvider.get());
        return instance;
      }
    }

    private final class Home2FragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeHome2Fragment.Home2FragmentSubcomponent
            .Builder {
      private Home2Fragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeHome2Fragment.Home2FragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(Home2Fragment.class.getCanonicalName() + " must be set");
        }
        return new Home2FragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(Home2Fragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class Home2FragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeHome2Fragment
            .Home2FragmentSubcomponent {
      private Home2FragmentSubcomponentImpl(Home2FragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(Home2Fragment arg0) {
        injectHome2Fragment(arg0);
      }

      private Home2Fragment injectHome2Fragment(Home2Fragment instance) {
        Home2Fragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        Home2Fragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class GiftFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeGiftFragment.GiftFragmentSubcomponent
            .Builder {
      private GiftFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeGiftFragment.GiftFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(GiftFragment.class.getCanonicalName() + " must be set");
        }
        return new GiftFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(GiftFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class GiftFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeGiftFragment.GiftFragmentSubcomponent {
      private GiftFragmentSubcomponentImpl(GiftFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(GiftFragment arg0) {
        injectGiftFragment(arg0);
      }

      private GiftFragment injectGiftFragment(GiftFragment instance) {
        GiftFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        GiftFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class GiftInfoFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeGiftInfoFragment
            .GiftInfoFragmentSubcomponent.Builder {
      private GiftInfoFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeGiftInfoFragment.GiftInfoFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              GiftInfoFragment.class.getCanonicalName() + " must be set");
        }
        return new GiftInfoFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(GiftInfoFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class GiftInfoFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeGiftInfoFragment
            .GiftInfoFragmentSubcomponent {
      private GiftInfoFragmentSubcomponentImpl(GiftInfoFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(GiftInfoFragment arg0) {
        injectGiftInfoFragment(arg0);
      }

      private GiftInfoFragment injectGiftInfoFragment(GiftInfoFragment instance) {
        GiftInfoFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        GiftInfoFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class ApplyGiftFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeRegisterGiftFragment
            .ApplyGiftFragmentSubcomponent.Builder {
      private ApplyGiftFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeRegisterGiftFragment
              .ApplyGiftFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ApplyGiftFragment.class.getCanonicalName() + " must be set");
        }
        return new ApplyGiftFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ApplyGiftFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ApplyGiftFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeRegisterGiftFragment
            .ApplyGiftFragmentSubcomponent {
      private ApplyGiftFragmentSubcomponentImpl(ApplyGiftFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ApplyGiftFragment arg0) {
        injectApplyGiftFragment(arg0);
      }

      private ApplyGiftFragment injectApplyGiftFragment(ApplyGiftFragment instance) {
        ApplyGiftFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        ApplyGiftFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class CreateGiftFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeCreateGiftFragment
            .CreateGiftFragmentSubcomponent.Builder {
      private CreateGiftFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeCreateGiftFragment
              .CreateGiftFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              CreateGiftFragment.class.getCanonicalName() + " must be set");
        }
        return new CreateGiftFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(CreateGiftFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class CreateGiftFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeCreateGiftFragment
            .CreateGiftFragmentSubcomponent {
      private CreateGiftFragmentSubcomponentImpl(CreateGiftFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(CreateGiftFragment arg0) {
        injectCreateGiftFragment(arg0);
      }

      private CreateGiftFragment injectCreateGiftFragment(CreateGiftFragment instance) {
        CreateGiftFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        CreateGiftFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        CreateGiftFragment_MembersInjector.injectGiftWebService(
            instance, DaggerAppComponent.this.provideGiftServiceProvider.get());
        return instance;
      }
    }

    private final class GiftGivenFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeGiftGivenFragment
            .GiftGivenFragmentSubcomponent.Builder {
      private GiftGivenFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeGiftGivenFragment
              .GiftGivenFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              GiftGivenFragment.class.getCanonicalName() + " must be set");
        }
        return new GiftGivenFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(GiftGivenFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class GiftGivenFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeGiftGivenFragment
            .GiftGivenFragmentSubcomponent {
      private GiftGivenFragmentSubcomponentImpl(GiftGivenFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(GiftGivenFragment arg0) {
        injectGiftGivenFragment(arg0);
      }

      private GiftGivenFragment injectGiftGivenFragment(GiftGivenFragment instance) {
        GiftGivenFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        GiftGivenFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class ListRegisterFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeListRegisterFragment
            .ListRegisterFragmentSubcomponent.Builder {
      private ListRegisterFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeListRegisterFragment
              .ListRegisterFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListRegisterFragment.class.getCanonicalName() + " must be set");
        }
        return new ListRegisterFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListRegisterFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ListRegisterFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeListRegisterFragment
            .ListRegisterFragmentSubcomponent {
      private ListRegisterFragmentSubcomponentImpl(
          ListRegisterFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ListRegisterFragment arg0) {
        injectListRegisterFragment(arg0);
      }

      private ListRegisterFragment injectListRegisterFragment(ListRegisterFragment instance) {
        ListRegisterFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ReceiverAddressFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeReceiverAddressFragment
            .ReceiverAddressFragmentSubcomponent.Builder {
      private ReceiverAddressFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeReceiverAddressFragment
              .ReceiverAddressFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ReceiverAddressFragment.class.getCanonicalName() + " must be set");
        }
        return new ReceiverAddressFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ReceiverAddressFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ReceiverAddressFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeReceiverAddressFragment
            .ReceiverAddressFragmentSubcomponent {
      private ReceiverAddressFragmentSubcomponentImpl(
          ReceiverAddressFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ReceiverAddressFragment arg0) {
        injectReceiverAddressFragment(arg0);
      }

      private ReceiverAddressFragment injectReceiverAddressFragment(
          ReceiverAddressFragment instance) {
        ReceiverAddressFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class SearchMotelFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeSearchMotelFragment
            .SearchMotelFragmentSubcomponent.Builder {
      private SearchMotelFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeSearchMotelFragment
              .SearchMotelFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              SearchMotelFragment.class.getCanonicalName() + " must be set");
        }
        return new SearchMotelFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(SearchMotelFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class SearchMotelFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeSearchMotelFragment
            .SearchMotelFragmentSubcomponent {
      private SearchMotelFragmentSubcomponentImpl(SearchMotelFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(SearchMotelFragment arg0) {
        injectSearchMotelFragment(arg0);
      }

      private SearchMotelFragment injectSearchMotelFragment(SearchMotelFragment instance) {
        SearchMotelFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class MotelInfoFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeMotelInfoFragment
            .MotelInfoFragmentSubcomponent.Builder {
      private MotelInfoFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeMotelInfoFragment
              .MotelInfoFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              MotelInfoFragment.class.getCanonicalName() + " must be set");
        }
        return new MotelInfoFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(MotelInfoFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class MotelInfoFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeMotelInfoFragment
            .MotelInfoFragmentSubcomponent {
      private MotelInfoFragmentSubcomponentImpl(MotelInfoFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(MotelInfoFragment arg0) {
        injectMotelInfoFragment(arg0);
      }

      private MotelInfoFragment injectMotelInfoFragment(MotelInfoFragment instance) {
        MotelInfoFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class AddMotelInfoFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeAddMotelFragment
            .AddMotelInfoFragmentSubcomponent.Builder {
      private AddMotelInfoFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeAddMotelFragment
              .AddMotelInfoFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              AddMotelInfoFragment.class.getCanonicalName() + " must be set");
        }
        return new AddMotelInfoFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(AddMotelInfoFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class AddMotelInfoFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeAddMotelFragment
            .AddMotelInfoFragmentSubcomponent {
      private AddMotelInfoFragmentSubcomponentImpl(
          AddMotelInfoFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(AddMotelInfoFragment arg0) {
        injectAddMotelInfoFragment(arg0);
      }

      private AddMotelInfoFragment injectAddMotelInfoFragment(AddMotelInfoFragment instance) {
        AddMotelInfoFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        AddMotelInfoFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ImageMotelFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeImageMotelFragment
            .ImageMotelFragmentSubcomponent.Builder {
      private ImageMotelFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeImageMotelFragment
              .ImageMotelFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ImageMotelFragment.class.getCanonicalName() + " must be set");
        }
        return new ImageMotelFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ImageMotelFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ImageMotelFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeImageMotelFragment
            .ImageMotelFragmentSubcomponent {
      private ImageMotelFragmentSubcomponentImpl(ImageMotelFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ImageMotelFragment arg0) {
        injectImageMotelFragment(arg0);
      }

      private ImageMotelFragment injectImageMotelFragment(ImageMotelFragment instance) {
        ImageMotelFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        ImageMotelFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        ImageMotelFragment_MembersInjector.injectWebService(
            instance, DaggerAppComponent.this.provideApiServiceProvider.get());
        return instance;
      }
    }

    private final class MoreJobFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeMoreJobFragment.MoreJobFragmentSubcomponent
            .Builder {
      private MoreJobFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeMoreJobFragment.MoreJobFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              MoreJobFragment.class.getCanonicalName() + " must be set");
        }
        return new MoreJobFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(MoreJobFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class MoreJobFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeMoreJobFragment
            .MoreJobFragmentSubcomponent {
      private MoreJobFragmentSubcomponentImpl(MoreJobFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(MoreJobFragment arg0) {
        injectMoreJobFragment(arg0);
      }

      private MoreJobFragment injectMoreJobFragment(MoreJobFragment instance) {
        MoreJobFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class GiftReceiveFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeGiftReceiveFragment
            .GiftReceiveFragmentSubcomponent.Builder {
      private GiftReceiveFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeGiftReceiveFragment
              .GiftReceiveFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              GiftReceiveFragment.class.getCanonicalName() + " must be set");
        }
        return new GiftReceiveFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(GiftReceiveFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class GiftReceiveFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeGiftReceiveFragment
            .GiftReceiveFragmentSubcomponent {
      private GiftReceiveFragmentSubcomponentImpl(GiftReceiveFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(GiftReceiveFragment arg0) {
        injectGiftReceiveFragment(arg0);
      }

      private GiftReceiveFragment injectGiftReceiveFragment(GiftReceiveFragment instance) {
        GiftReceiveFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        GiftReceiveFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class TutorFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeTutorFragment.TutorFragmentSubcomponent
            .Builder {
      private TutorFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeTutorFragment.TutorFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(TutorFragment.class.getCanonicalName() + " must be set");
        }
        return new TutorFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TutorFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TutorFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeTutorFragment
            .TutorFragmentSubcomponent {
      private TutorFragmentSubcomponentImpl(TutorFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TutorFragment arg0) {
        injectTutorFragment(arg0);
      }

      private TutorFragment injectTutorFragment(TutorFragment instance) {
        TutorFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class MotelRegistrationCompleteFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeMotelRegistrationComplete
            .MotelRegistrationCompleteFragmentSubcomponent.Builder {
      private MotelRegistrationCompleteFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeMotelRegistrationComplete
              .MotelRegistrationCompleteFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              MotelRegistrationCompleteFragment.class.getCanonicalName() + " must be set");
        }
        return new MotelRegistrationCompleteFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(MotelRegistrationCompleteFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class MotelRegistrationCompleteFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeMotelRegistrationComplete
            .MotelRegistrationCompleteFragmentSubcomponent {
      private MotelRegistrationCompleteFragmentSubcomponentImpl(
          MotelRegistrationCompleteFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(MotelRegistrationCompleteFragment arg0) {
        injectMotelRegistrationCompleteFragment(arg0);
      }

      private MotelRegistrationCompleteFragment injectMotelRegistrationCompleteFragment(
          MotelRegistrationCompleteFragment instance) {
        MotelRegistrationCompleteFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class MotelRegistrationInfoFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeMotelRegistrationInfo
            .MotelRegistrationInfoFragmentSubcomponent.Builder {
      private MotelRegistrationInfoFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeMotelRegistrationInfo
              .MotelRegistrationInfoFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              MotelRegistrationInfoFragment.class.getCanonicalName() + " must be set");
        }
        return new MotelRegistrationInfoFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(MotelRegistrationInfoFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class MotelRegistrationInfoFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeMotelRegistrationInfo
            .MotelRegistrationInfoFragmentSubcomponent {
      private MotelRegistrationInfoFragmentSubcomponentImpl(
          MotelRegistrationInfoFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(MotelRegistrationInfoFragment arg0) {
        injectMotelRegistrationInfoFragment(arg0);
      }

      private MotelRegistrationInfoFragment injectMotelRegistrationInfoFragment(
          MotelRegistrationInfoFragment instance) {
        MotelRegistrationInfoFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class MotelRegistrationListFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeMotelRegistrationList
            .MotelRegistrationListFragmentSubcomponent.Builder {
      private MotelRegistrationListFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeMotelRegistrationList
              .MotelRegistrationListFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              MotelRegistrationListFragment.class.getCanonicalName() + " must be set");
        }
        return new MotelRegistrationListFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(MotelRegistrationListFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class MotelRegistrationListFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeMotelRegistrationList
            .MotelRegistrationListFragmentSubcomponent {
      private MotelRegistrationListFragmentSubcomponentImpl(
          MotelRegistrationListFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(MotelRegistrationListFragment arg0) {
        injectMotelRegistrationListFragment(arg0);
      }

      private MotelRegistrationListFragment injectMotelRegistrationListFragment(
          MotelRegistrationListFragment instance) {
        MotelRegistrationListFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class MotelRegistrationProcessingFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeMotelRegistrationProcessing
            .MotelRegistrationProcessingFragmentSubcomponent.Builder {
      private MotelRegistrationProcessingFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeMotelRegistrationProcessing
              .MotelRegistrationProcessingFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              MotelRegistrationProcessingFragment.class.getCanonicalName() + " must be set");
        }
        return new MotelRegistrationProcessingFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(MotelRegistrationProcessingFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class MotelRegistrationProcessingFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeMotelRegistrationProcessing
            .MotelRegistrationProcessingFragmentSubcomponent {
      private MotelRegistrationProcessingFragmentSubcomponentImpl(
          MotelRegistrationProcessingFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(MotelRegistrationProcessingFragment arg0) {}
    }

    private final class RegisterToFindMotelFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeRegisterToFindMotel
            .RegisterToFindMotelFragmentSubcomponent.Builder {
      private RegisterToFindMotelFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeRegisterToFindMotel
              .RegisterToFindMotelFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              RegisterToFindMotelFragment.class.getCanonicalName() + " must be set");
        }
        return new RegisterToFindMotelFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(RegisterToFindMotelFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class RegisterToFindMotelFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeRegisterToFindMotel
            .RegisterToFindMotelFragmentSubcomponent {
      private RegisterToFindMotelFragmentSubcomponentImpl(
          RegisterToFindMotelFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(RegisterToFindMotelFragment arg0) {
        injectRegisterToFindMotelFragment(arg0);
      }

      private RegisterToFindMotelFragment injectRegisterToFindMotelFragment(
          RegisterToFindMotelFragment instance) {
        RegisterToFindMotelFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class PickMotelLocationFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributePickMotelLocation
            .PickMotelLocationFragmentSubcomponent.Builder {
      private PickMotelLocationFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributePickMotelLocation
              .PickMotelLocationFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              PickMotelLocationFragment.class.getCanonicalName() + " must be set");
        }
        return new PickMotelLocationFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(PickMotelLocationFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class PickMotelLocationFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributePickMotelLocation
            .PickMotelLocationFragmentSubcomponent {
      private PickMotelLocationFragmentSubcomponentImpl(
          PickMotelLocationFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(PickMotelLocationFragment arg0) {}
    }

    private final class ListMotelResultsFragmentSubcomponentBuilder
        extends MainListFragmentBuildersModule_ContributeListMotelResult
            .ListMotelResultsFragmentSubcomponent.Builder {
      private ListMotelResultsFragment seedInstance;

      @Override
      public MainListFragmentBuildersModule_ContributeListMotelResult
              .ListMotelResultsFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListMotelResultsFragment.class.getCanonicalName() + " must be set");
        }
        return new ListMotelResultsFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListMotelResultsFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ListMotelResultsFragmentSubcomponentImpl
        implements MainListFragmentBuildersModule_ContributeListMotelResult
            .ListMotelResultsFragmentSubcomponent {
      private ListMotelResultsFragmentSubcomponentImpl(
          ListMotelResultsFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ListMotelResultsFragment arg0) {
        injectListMotelResultsFragment(arg0);
      }

      private ListMotelResultsFragment injectListMotelResultsFragment(
          ListMotelResultsFragment instance) {
        ListMotelResultsFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }
  }

  private final class LoginActivitySubcomponentBuilder
      extends ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent.Builder {
    private LoginActivity seedInstance;

    @Override
    public ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(LoginActivity.class.getCanonicalName() + " must be set");
      }
      return new LoginActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(LoginActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class LoginActivitySubcomponentImpl
      implements ActivityBuildersModule_ContributeLoginActivity.LoginActivitySubcomponent {
    private Provider<
            LoginListFragmentBuildersModule_ContributeLostPasswordFragment
                .LostPasswordFragmentSubcomponent.Builder>
        lostPasswordFragmentSubcomponentBuilderProvider;

    private Provider<
            LoginListFragmentBuildersModule_ContributeCheckOTPLostPasswordFragment
                .CheckOTPLostPasswordFragmentSubcomponent.Builder>
        checkOTPLostPasswordFragmentSubcomponentBuilderProvider;

    private Provider<
            LoginListFragmentBuildersModule_ContributeLoginFragment.LoginFragmentSubcomponent
                .Builder>
        loginFragmentSubcomponentBuilderProvider;

    private Provider<
            LoginListFragmentBuildersModule_ContributeRegisterFragment.RegisterFragmentSubcomponent
                .Builder>
        registerFragmentSubcomponentBuilderProvider;

    private LoginActivitySubcomponentImpl(LoginActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(4)
          .put(
              LostPasswordFragment.class,
              (Provider) lostPasswordFragmentSubcomponentBuilderProvider)
          .put(
              CheckOTPLostPasswordFragment.class,
              (Provider) checkOTPLostPasswordFragmentSubcomponentBuilderProvider)
          .put(LoginFragment.class, (Provider) loginFragmentSubcomponentBuilderProvider)
          .put(RegisterFragment.class, (Provider) registerFragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf(),
          Collections.<String, Provider<AndroidInjector.Factory<? extends Fragment>>>emptyMap());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final LoginActivitySubcomponentBuilder builder) {
      this.lostPasswordFragmentSubcomponentBuilderProvider =
          new Provider<
              LoginListFragmentBuildersModule_ContributeLostPasswordFragment
                  .LostPasswordFragmentSubcomponent.Builder>() {
            @Override
            public LoginListFragmentBuildersModule_ContributeLostPasswordFragment
                    .LostPasswordFragmentSubcomponent.Builder
                get() {
              return new LostPasswordFragmentSubcomponentBuilder();
            }
          };
      this.checkOTPLostPasswordFragmentSubcomponentBuilderProvider =
          new Provider<
              LoginListFragmentBuildersModule_ContributeCheckOTPLostPasswordFragment
                  .CheckOTPLostPasswordFragmentSubcomponent.Builder>() {
            @Override
            public LoginListFragmentBuildersModule_ContributeCheckOTPLostPasswordFragment
                    .CheckOTPLostPasswordFragmentSubcomponent.Builder
                get() {
              return new CheckOTPLostPasswordFragmentSubcomponentBuilder();
            }
          };
      this.loginFragmentSubcomponentBuilderProvider =
          new Provider<
              LoginListFragmentBuildersModule_ContributeLoginFragment.LoginFragmentSubcomponent
                  .Builder>() {
            @Override
            public LoginListFragmentBuildersModule_ContributeLoginFragment.LoginFragmentSubcomponent
                    .Builder
                get() {
              return new LoginFragmentSubcomponentBuilder();
            }
          };
      this.registerFragmentSubcomponentBuilderProvider =
          new Provider<
              LoginListFragmentBuildersModule_ContributeRegisterFragment
                  .RegisterFragmentSubcomponent.Builder>() {
            @Override
            public LoginListFragmentBuildersModule_ContributeRegisterFragment
                    .RegisterFragmentSubcomponent.Builder
                get() {
              return new RegisterFragmentSubcomponentBuilder();
            }
          };
    }

    @Override
    public void inject(LoginActivity arg0) {
      injectLoginActivity(arg0);
    }

    private LoginActivity injectLoginActivity(LoginActivity instance) {
      LoginActivity_MembersInjector.injectDispatchingAndroidInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      LoginActivity_MembersInjector.injectViewModelFactory(
          instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
      LoginActivity_MembersInjector.injectSharedPrefsHelper(
          instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
      return instance;
    }

    private final class LostPasswordFragmentSubcomponentBuilder
        extends LoginListFragmentBuildersModule_ContributeLostPasswordFragment
            .LostPasswordFragmentSubcomponent.Builder {
      private LostPasswordFragment seedInstance;

      @Override
      public LoginListFragmentBuildersModule_ContributeLostPasswordFragment
              .LostPasswordFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              LostPasswordFragment.class.getCanonicalName() + " must be set");
        }
        return new LostPasswordFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(LostPasswordFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class LostPasswordFragmentSubcomponentImpl
        implements LoginListFragmentBuildersModule_ContributeLostPasswordFragment
            .LostPasswordFragmentSubcomponent {
      private LostPasswordFragmentSubcomponentImpl(
          LostPasswordFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(LostPasswordFragment arg0) {
        injectLostPasswordFragment(arg0);
      }

      private LostPasswordFragment injectLostPasswordFragment(LostPasswordFragment instance) {
        LostPasswordFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class CheckOTPLostPasswordFragmentSubcomponentBuilder
        extends LoginListFragmentBuildersModule_ContributeCheckOTPLostPasswordFragment
            .CheckOTPLostPasswordFragmentSubcomponent.Builder {
      private CheckOTPLostPasswordFragment seedInstance;

      @Override
      public LoginListFragmentBuildersModule_ContributeCheckOTPLostPasswordFragment
              .CheckOTPLostPasswordFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              CheckOTPLostPasswordFragment.class.getCanonicalName() + " must be set");
        }
        return new CheckOTPLostPasswordFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(CheckOTPLostPasswordFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class CheckOTPLostPasswordFragmentSubcomponentImpl
        implements LoginListFragmentBuildersModule_ContributeCheckOTPLostPasswordFragment
            .CheckOTPLostPasswordFragmentSubcomponent {
      private CheckOTPLostPasswordFragmentSubcomponentImpl(
          CheckOTPLostPasswordFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(CheckOTPLostPasswordFragment arg0) {
        injectCheckOTPLostPasswordFragment(arg0);
      }

      private CheckOTPLostPasswordFragment injectCheckOTPLostPasswordFragment(
          CheckOTPLostPasswordFragment instance) {
        CheckOTPLostPasswordFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class LoginFragmentSubcomponentBuilder
        extends LoginListFragmentBuildersModule_ContributeLoginFragment.LoginFragmentSubcomponent
            .Builder {
      private LoginFragment seedInstance;

      @Override
      public LoginListFragmentBuildersModule_ContributeLoginFragment.LoginFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(LoginFragment.class.getCanonicalName() + " must be set");
        }
        return new LoginFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(LoginFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class LoginFragmentSubcomponentImpl
        implements LoginListFragmentBuildersModule_ContributeLoginFragment
            .LoginFragmentSubcomponent {
      private LoginFragmentSubcomponentImpl(LoginFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(LoginFragment arg0) {
        injectLoginFragment(arg0);
      }

      private LoginFragment injectLoginFragment(LoginFragment instance) {
        LoginFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        LoginFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class RegisterFragmentSubcomponentBuilder
        extends LoginListFragmentBuildersModule_ContributeRegisterFragment
            .RegisterFragmentSubcomponent.Builder {
      private RegisterFragment seedInstance;

      @Override
      public LoginListFragmentBuildersModule_ContributeRegisterFragment.RegisterFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              RegisterFragment.class.getCanonicalName() + " must be set");
        }
        return new RegisterFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(RegisterFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class RegisterFragmentSubcomponentImpl
        implements LoginListFragmentBuildersModule_ContributeRegisterFragment
            .RegisterFragmentSubcomponent {
      private RegisterFragmentSubcomponentImpl(RegisterFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(RegisterFragment arg0) {
        injectRegisterFragment(arg0);
      }

      private RegisterFragment injectRegisterFragment(RegisterFragment instance) {
        RegisterFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }
  }

  private final class TeacherActivitySubcomponentBuilder
      extends ActivityBuildersModule_ContributeTeacherActivity.TeacherActivitySubcomponent.Builder {
    private TeacherActivity seedInstance;

    @Override
    public ActivityBuildersModule_ContributeTeacherActivity.TeacherActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(TeacherActivity.class.getCanonicalName() + " must be set");
      }
      return new TeacherActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(TeacherActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class TeacherActivitySubcomponentImpl
      implements ActivityBuildersModule_ContributeTeacherActivity.TeacherActivitySubcomponent {
    private Provider<
            TListFragmentBuilderModule_ContributeTHomeFragment.THomeFragmentSubcomponent.Builder>
        tHomeFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeListFormFragment.ListFormsFragmentSubcomponent
                .Builder>
        listFormsFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTListFormFragment.TListFormFragmentSubcomponent
                .Builder>
        tListFormFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTRegisterFormFragment
                .TRegisterFormFragmentSubcomponent.Builder>
        tRegisterFormFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTListFormRegisteredFragment
                .TListFormRegisteredFragmentSubcomponent.Builder>
        tListFormRegisteredFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTFormRegisteredFragment
                .TFormRegisteredFragmentSubcomponent.Builder>
        tFormRegisteredFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTEditFormFragment.TEditFormFragmentSubcomponent
                .Builder>
        tEditFormFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTListActivitiesFragment
                .TListActivitiesFragmentSubcomponent.Builder>
        tListActivitiesFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTActivityInfoFragment
                .TActivityInfoFragmentSubcomponent.Builder>
        tActivityInfoFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTListScholarShipFragment
                .TListScholarShipsFragmentSubcomponent.Builder>
        tListScholarShipsFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTListJobsFragment.TListJobsFragmentSubcomponent
                .Builder>
        tListJobsFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTListNotificationsFragment
                .TListNotificationsFragmentSubcomponent.Builder>
        tListNotificationsFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTAccountFragment.TAccountFragmentSubcomponent
                .Builder>
        tAccountFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTChangePassword.TChangePasswordFragmentSubcomponent
                .Builder>
        tChangePasswordFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTeacherInfoFragment.TeacherInfoFragmentSubcomponent
                .Builder>
        teacherInfoFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeListStudentFragment.ListStudentFragmentSubcomponent
                .Builder>
        listStudentFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeListActivitiesOfStudent
                .ListActivitiesOfStudentFragmentSubcomponent.Builder>
        listActivitiesOfStudentFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeStudentInfoFragment.StudentInfoFragmentSubcomponent
                .Builder>
        studentInfoFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTeacherMarkFragment.TeacherMarkFragmentSubcomponent
                .Builder>
        teacherMarkFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTStudentNoteFragment
                .TStudentNoteFragmentSubcomponent.Builder>
        tStudentNoteFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeRunDashboardFragment
                .RunDashboardFragmentSubcomponent.Builder>
        runDashboardFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeRunFragment.RunFragmentSubcomponent.Builder>
        runFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTHome2Fragment.THome2FragmentSubcomponent.Builder>
        tHome2FragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTGiftGivenFragment.TGiftGivenFragmentSubcomponent
                .Builder>
        tGiftGivenFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTListRegister.TListRegisterFragmentSubcomponent
                .Builder>
        tListRegisterFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTCreateGift.TCreateGiftFragmentSubcomponent
                .Builder>
        tCreateGiftFragmentSubcomponentBuilderProvider;

    private Provider<TListFragmentBuilderModule_ContributeTGift.TGiftFragmentSubcomponent.Builder>
        tGiftFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTGiftInfo.TGiftInfoFragmentSubcomponent.Builder>
        tGiftInfoFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTGiftReceived.TGiftReceivedFragmentSubcomponent
                .Builder>
        tGiftReceivedFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTMoreJob.TMoreJobFragmentSubcomponent.Builder>
        tMoreJobFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTMotelInfo.TMotelInfoFragmentSubcomponent.Builder>
        tMotelInfoFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTSearchMotel.TSearchMotelFragmentSubcomponent
                .Builder>
        tSearchMotelFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTAddNewAddressMotel
                .TAddNewAddressFragmentSubcomponent.Builder>
        tAddNewAddressFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTListAddressMotel.TListAddressFragmentSubcomponent
                .Builder>
        tListAddressFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTAddMotelInfoMotel
                .TAddMotelInfoFragmentSubcomponent.Builder>
        tAddMotelInfoFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTImageMotel.TImageMotelFragmentSubcomponent
                .Builder>
        tImageMotelFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTApplyGift.TApplyGiftFragmentSubcomponent.Builder>
        tApplyGiftFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeTAddressGift.TReceiverAddressFragmentSubcomponent
                .Builder>
        tReceiverAddressFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeRTutorFragment.TTutorFragmentSubcomponent.Builder>
        tTutorFragmentSubcomponentBuilderProvider;

    private Provider<
            TListFragmentBuilderModule_ContributeStudentList2.StudentList2FragmentSubcomponent
                .Builder>
        studentList2FragmentSubcomponentBuilderProvider;

    private TeacherActivitySubcomponentImpl(TeacherActivitySubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(40)
          .put(THomeFragment.class, (Provider) tHomeFragmentSubcomponentBuilderProvider)
          .put(ListFormsFragment.class, (Provider) listFormsFragmentSubcomponentBuilderProvider)
          .put(TListFormFragment.class, (Provider) tListFormFragmentSubcomponentBuilderProvider)
          .put(
              TRegisterFormFragment.class,
              (Provider) tRegisterFormFragmentSubcomponentBuilderProvider)
          .put(
              TListFormRegisteredFragment.class,
              (Provider) tListFormRegisteredFragmentSubcomponentBuilderProvider)
          .put(
              TFormRegisteredFragment.class,
              (Provider) tFormRegisteredFragmentSubcomponentBuilderProvider)
          .put(TEditFormFragment.class, (Provider) tEditFormFragmentSubcomponentBuilderProvider)
          .put(
              TListActivitiesFragment.class,
              (Provider) tListActivitiesFragmentSubcomponentBuilderProvider)
          .put(
              TActivityInfoFragment.class,
              (Provider) tActivityInfoFragmentSubcomponentBuilderProvider)
          .put(
              TListScholarShipsFragment.class,
              (Provider) tListScholarShipsFragmentSubcomponentBuilderProvider)
          .put(TListJobsFragment.class, (Provider) tListJobsFragmentSubcomponentBuilderProvider)
          .put(
              TListNotificationsFragment.class,
              (Provider) tListNotificationsFragmentSubcomponentBuilderProvider)
          .put(TAccountFragment.class, (Provider) tAccountFragmentSubcomponentBuilderProvider)
          .put(
              TChangePasswordFragment.class,
              (Provider) tChangePasswordFragmentSubcomponentBuilderProvider)
          .put(TeacherInfoFragment.class, (Provider) teacherInfoFragmentSubcomponentBuilderProvider)
          .put(ListStudentFragment.class, (Provider) listStudentFragmentSubcomponentBuilderProvider)
          .put(
              ListActivitiesOfStudentFragment.class,
              (Provider) listActivitiesOfStudentFragmentSubcomponentBuilderProvider)
          .put(StudentInfoFragment.class, (Provider) studentInfoFragmentSubcomponentBuilderProvider)
          .put(TeacherMarkFragment.class, (Provider) teacherMarkFragmentSubcomponentBuilderProvider)
          .put(
              TStudentNoteFragment.class,
              (Provider) tStudentNoteFragmentSubcomponentBuilderProvider)
          .put(
              RunDashboardFragment.class,
              (Provider) runDashboardFragmentSubcomponentBuilderProvider)
          .put(RunFragment.class, (Provider) runFragmentSubcomponentBuilderProvider)
          .put(THome2Fragment.class, (Provider) tHome2FragmentSubcomponentBuilderProvider)
          .put(TGiftGivenFragment.class, (Provider) tGiftGivenFragmentSubcomponentBuilderProvider)
          .put(
              TListRegisterFragment.class,
              (Provider) tListRegisterFragmentSubcomponentBuilderProvider)
          .put(TCreateGiftFragment.class, (Provider) tCreateGiftFragmentSubcomponentBuilderProvider)
          .put(TGiftFragment.class, (Provider) tGiftFragmentSubcomponentBuilderProvider)
          .put(TGiftInfoFragment.class, (Provider) tGiftInfoFragmentSubcomponentBuilderProvider)
          .put(
              TGiftReceivedFragment.class,
              (Provider) tGiftReceivedFragmentSubcomponentBuilderProvider)
          .put(TMoreJobFragment.class, (Provider) tMoreJobFragmentSubcomponentBuilderProvider)
          .put(TMotelInfoFragment.class, (Provider) tMotelInfoFragmentSubcomponentBuilderProvider)
          .put(
              TSearchMotelFragment.class,
              (Provider) tSearchMotelFragmentSubcomponentBuilderProvider)
          .put(
              TAddNewAddressFragment.class,
              (Provider) tAddNewAddressFragmentSubcomponentBuilderProvider)
          .put(
              TListAddressFragment.class,
              (Provider) tListAddressFragmentSubcomponentBuilderProvider)
          .put(
              TAddMotelInfoFragment.class,
              (Provider) tAddMotelInfoFragmentSubcomponentBuilderProvider)
          .put(TImageMotelFragment.class, (Provider) tImageMotelFragmentSubcomponentBuilderProvider)
          .put(TApplyGiftFragment.class, (Provider) tApplyGiftFragmentSubcomponentBuilderProvider)
          .put(
              TReceiverAddressFragment.class,
              (Provider) tReceiverAddressFragmentSubcomponentBuilderProvider)
          .put(TTutorFragment.class, (Provider) tTutorFragmentSubcomponentBuilderProvider)
          .put(
              StudentList2Fragment.class,
              (Provider) studentList2FragmentSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf(),
          Collections.<String, Provider<AndroidInjector.Factory<? extends Fragment>>>emptyMap());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final TeacherActivitySubcomponentBuilder builder) {
      this.tHomeFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTHomeFragment.THomeFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTHomeFragment.THomeFragmentSubcomponent
                    .Builder
                get() {
              return new THomeFragmentSubcomponentBuilder();
            }
          };
      this.listFormsFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeListFormFragment.ListFormsFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeListFormFragment
                    .ListFormsFragmentSubcomponent.Builder
                get() {
              return new TLFBM_CLFF_ListFormsFragmentSubcomponentBuilder();
            }
          };
      this.tListFormFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTListFormFragment.TListFormFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTListFormFragment
                    .TListFormFragmentSubcomponent.Builder
                get() {
              return new TListFormFragmentSubcomponentBuilder();
            }
          };
      this.tRegisterFormFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTRegisterFormFragment
                  .TRegisterFormFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTRegisterFormFragment
                    .TRegisterFormFragmentSubcomponent.Builder
                get() {
              return new TRegisterFormFragmentSubcomponentBuilder();
            }
          };
      this.tListFormRegisteredFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTListFormRegisteredFragment
                  .TListFormRegisteredFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTListFormRegisteredFragment
                    .TListFormRegisteredFragmentSubcomponent.Builder
                get() {
              return new TListFormRegisteredFragmentSubcomponentBuilder();
            }
          };
      this.tFormRegisteredFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTFormRegisteredFragment
                  .TFormRegisteredFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTFormRegisteredFragment
                    .TFormRegisteredFragmentSubcomponent.Builder
                get() {
              return new TFormRegisteredFragmentSubcomponentBuilder();
            }
          };
      this.tEditFormFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTEditFormFragment.TEditFormFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTEditFormFragment
                    .TEditFormFragmentSubcomponent.Builder
                get() {
              return new TEditFormFragmentSubcomponentBuilder();
            }
          };
      this.tListActivitiesFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTListActivitiesFragment
                  .TListActivitiesFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTListActivitiesFragment
                    .TListActivitiesFragmentSubcomponent.Builder
                get() {
              return new TListActivitiesFragmentSubcomponentBuilder();
            }
          };
      this.tActivityInfoFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTActivityInfoFragment
                  .TActivityInfoFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTActivityInfoFragment
                    .TActivityInfoFragmentSubcomponent.Builder
                get() {
              return new TActivityInfoFragmentSubcomponentBuilder();
            }
          };
      this.tListScholarShipsFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTListScholarShipFragment
                  .TListScholarShipsFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTListScholarShipFragment
                    .TListScholarShipsFragmentSubcomponent.Builder
                get() {
              return new TListScholarShipsFragmentSubcomponentBuilder();
            }
          };
      this.tListJobsFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTListJobsFragment.TListJobsFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTListJobsFragment
                    .TListJobsFragmentSubcomponent.Builder
                get() {
              return new TListJobsFragmentSubcomponentBuilder();
            }
          };
      this.tListNotificationsFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTListNotificationsFragment
                  .TListNotificationsFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTListNotificationsFragment
                    .TListNotificationsFragmentSubcomponent.Builder
                get() {
              return new TListNotificationsFragmentSubcomponentBuilder();
            }
          };
      this.tAccountFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTAccountFragment.TAccountFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTAccountFragment
                    .TAccountFragmentSubcomponent.Builder
                get() {
              return new TAccountFragmentSubcomponentBuilder();
            }
          };
      this.tChangePasswordFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTChangePassword
                  .TChangePasswordFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTChangePassword
                    .TChangePasswordFragmentSubcomponent.Builder
                get() {
              return new TChangePasswordFragmentSubcomponentBuilder();
            }
          };
      this.teacherInfoFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTeacherInfoFragment
                  .TeacherInfoFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTeacherInfoFragment
                    .TeacherInfoFragmentSubcomponent.Builder
                get() {
              return new TeacherInfoFragmentSubcomponentBuilder();
            }
          };
      this.listStudentFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeListStudentFragment
                  .ListStudentFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeListStudentFragment
                    .ListStudentFragmentSubcomponent.Builder
                get() {
              return new ListStudentFragmentSubcomponentBuilder();
            }
          };
      this.listActivitiesOfStudentFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeListActivitiesOfStudent
                  .ListActivitiesOfStudentFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeListActivitiesOfStudent
                    .ListActivitiesOfStudentFragmentSubcomponent.Builder
                get() {
              return new ListActivitiesOfStudentFragmentSubcomponentBuilder();
            }
          };
      this.studentInfoFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeStudentInfoFragment
                  .StudentInfoFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeStudentInfoFragment
                    .StudentInfoFragmentSubcomponent.Builder
                get() {
              return new StudentInfoFragmentSubcomponentBuilder();
            }
          };
      this.teacherMarkFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTeacherMarkFragment
                  .TeacherMarkFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTeacherMarkFragment
                    .TeacherMarkFragmentSubcomponent.Builder
                get() {
              return new TeacherMarkFragmentSubcomponentBuilder();
            }
          };
      this.tStudentNoteFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTStudentNoteFragment
                  .TStudentNoteFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTStudentNoteFragment
                    .TStudentNoteFragmentSubcomponent.Builder
                get() {
              return new TStudentNoteFragmentSubcomponentBuilder();
            }
          };
      this.runDashboardFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeRunDashboardFragment
                  .RunDashboardFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeRunDashboardFragment
                    .RunDashboardFragmentSubcomponent.Builder
                get() {
              return new TLFBM_CRDF_RunDashboardFragmentSubcomponentBuilder();
            }
          };
      this.runFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeRunFragment.RunFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeRunFragment.RunFragmentSubcomponent.Builder
                get() {
              return new TLFBM_CRF_RunFragmentSubcomponentBuilder();
            }
          };
      this.tHome2FragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTHome2Fragment.THome2FragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTHome2Fragment.THome2FragmentSubcomponent
                    .Builder
                get() {
              return new THome2FragmentSubcomponentBuilder();
            }
          };
      this.tGiftGivenFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTGiftGivenFragment.TGiftGivenFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTGiftGivenFragment
                    .TGiftGivenFragmentSubcomponent.Builder
                get() {
              return new TGiftGivenFragmentSubcomponentBuilder();
            }
          };
      this.tListRegisterFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTListRegister.TListRegisterFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTListRegister
                    .TListRegisterFragmentSubcomponent.Builder
                get() {
              return new TListRegisterFragmentSubcomponentBuilder();
            }
          };
      this.tCreateGiftFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTCreateGift.TCreateGiftFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTCreateGift.TCreateGiftFragmentSubcomponent
                    .Builder
                get() {
              return new TCreateGiftFragmentSubcomponentBuilder();
            }
          };
      this.tGiftFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTGift.TGiftFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTGift.TGiftFragmentSubcomponent.Builder
                get() {
              return new TGiftFragmentSubcomponentBuilder();
            }
          };
      this.tGiftInfoFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTGiftInfo.TGiftInfoFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTGiftInfo.TGiftInfoFragmentSubcomponent
                    .Builder
                get() {
              return new TGiftInfoFragmentSubcomponentBuilder();
            }
          };
      this.tGiftReceivedFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTGiftReceived.TGiftReceivedFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTGiftReceived
                    .TGiftReceivedFragmentSubcomponent.Builder
                get() {
              return new TGiftReceivedFragmentSubcomponentBuilder();
            }
          };
      this.tMoreJobFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTMoreJob.TMoreJobFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTMoreJob.TMoreJobFragmentSubcomponent
                    .Builder
                get() {
              return new TMoreJobFragmentSubcomponentBuilder();
            }
          };
      this.tMotelInfoFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTMotelInfo.TMotelInfoFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTMotelInfo.TMotelInfoFragmentSubcomponent
                    .Builder
                get() {
              return new TMotelInfoFragmentSubcomponentBuilder();
            }
          };
      this.tSearchMotelFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTSearchMotel.TSearchMotelFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTSearchMotel
                    .TSearchMotelFragmentSubcomponent.Builder
                get() {
              return new TSearchMotelFragmentSubcomponentBuilder();
            }
          };
      this.tAddNewAddressFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTAddNewAddressMotel
                  .TAddNewAddressFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTAddNewAddressMotel
                    .TAddNewAddressFragmentSubcomponent.Builder
                get() {
              return new TAddNewAddressFragmentSubcomponentBuilder();
            }
          };
      this.tListAddressFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTListAddressMotel
                  .TListAddressFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTListAddressMotel
                    .TListAddressFragmentSubcomponent.Builder
                get() {
              return new TListAddressFragmentSubcomponentBuilder();
            }
          };
      this.tAddMotelInfoFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTAddMotelInfoMotel
                  .TAddMotelInfoFragmentSubcomponent.Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTAddMotelInfoMotel
                    .TAddMotelInfoFragmentSubcomponent.Builder
                get() {
              return new TAddMotelInfoFragmentSubcomponentBuilder();
            }
          };
      this.tImageMotelFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTImageMotel.TImageMotelFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTImageMotel.TImageMotelFragmentSubcomponent
                    .Builder
                get() {
              return new TImageMotelFragmentSubcomponentBuilder();
            }
          };
      this.tApplyGiftFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTApplyGift.TApplyGiftFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTApplyGift.TApplyGiftFragmentSubcomponent
                    .Builder
                get() {
              return new TApplyGiftFragmentSubcomponentBuilder();
            }
          };
      this.tReceiverAddressFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeTAddressGift.TReceiverAddressFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeTAddressGift
                    .TReceiverAddressFragmentSubcomponent.Builder
                get() {
              return new TReceiverAddressFragmentSubcomponentBuilder();
            }
          };
      this.tTutorFragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeRTutorFragment.TTutorFragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeRTutorFragment.TTutorFragmentSubcomponent
                    .Builder
                get() {
              return new TTutorFragmentSubcomponentBuilder();
            }
          };
      this.studentList2FragmentSubcomponentBuilderProvider =
          new Provider<
              TListFragmentBuilderModule_ContributeStudentList2.StudentList2FragmentSubcomponent
                  .Builder>() {
            @Override
            public TListFragmentBuilderModule_ContributeStudentList2
                    .StudentList2FragmentSubcomponent.Builder
                get() {
              return new StudentList2FragmentSubcomponentBuilder();
            }
          };
    }

    @Override
    public void inject(TeacherActivity arg0) {
      injectTeacherActivity(arg0);
    }

    private TeacherActivity injectTeacherActivity(TeacherActivity instance) {
      TeacherActivity_MembersInjector.injectDispatchingAndroidInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      TeacherActivity_MembersInjector.injectSharedPrefsHelper(
          instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
      return instance;
    }

    private final class THomeFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTHomeFragment.THomeFragmentSubcomponent
            .Builder {
      private THomeFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTHomeFragment.THomeFragmentSubcomponent build() {
        if (seedInstance == null) {
          throw new IllegalStateException(THomeFragment.class.getCanonicalName() + " must be set");
        }
        return new THomeFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(THomeFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class THomeFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTHomeFragment.THomeFragmentSubcomponent {
      private THomeFragmentSubcomponentImpl(THomeFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(THomeFragment arg0) {
        injectTHomeFragment(arg0);
      }

      private THomeFragment injectTHomeFragment(THomeFragment instance) {
        THomeFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        THomeFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class TLFBM_CLFF_ListFormsFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeListFormFragment.ListFormsFragmentSubcomponent
            .Builder {
      private ListFormsFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeListFormFragment.ListFormsFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListFormsFragment.class.getCanonicalName() + " must be set");
        }
        return new TLFBM_CLFF_ListFormsFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListFormsFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TLFBM_CLFF_ListFormsFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeListFormFragment
            .ListFormsFragmentSubcomponent {
      private TLFBM_CLFF_ListFormsFragmentSubcomponentImpl(
          TLFBM_CLFF_ListFormsFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ListFormsFragment arg0) {
        injectListFormsFragment(arg0);
      }

      private ListFormsFragment injectListFormsFragment(ListFormsFragment instance) {
        ListFormsFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TListFormFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTListFormFragment.TListFormFragmentSubcomponent
            .Builder {
      private TListFormFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTListFormFragment.TListFormFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TListFormFragment.class.getCanonicalName() + " must be set");
        }
        return new TListFormFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TListFormFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TListFormFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTListFormFragment
            .TListFormFragmentSubcomponent {
      private TListFormFragmentSubcomponentImpl(TListFormFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TListFormFragment arg0) {
        injectTListFormFragment(arg0);
      }

      private TListFormFragment injectTListFormFragment(TListFormFragment instance) {
        TListFormFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TRegisterFormFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTRegisterFormFragment
            .TRegisterFormFragmentSubcomponent.Builder {
      private TRegisterFormFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTRegisterFormFragment
              .TRegisterFormFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TRegisterFormFragment.class.getCanonicalName() + " must be set");
        }
        return new TRegisterFormFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TRegisterFormFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TRegisterFormFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTRegisterFormFragment
            .TRegisterFormFragmentSubcomponent {
      private TRegisterFormFragmentSubcomponentImpl(
          TRegisterFormFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TRegisterFormFragment arg0) {
        injectTRegisterFormFragment(arg0);
      }

      private TRegisterFormFragment injectTRegisterFormFragment(TRegisterFormFragment instance) {
        TRegisterFormFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TListFormRegisteredFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTListFormRegisteredFragment
            .TListFormRegisteredFragmentSubcomponent.Builder {
      private TListFormRegisteredFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTListFormRegisteredFragment
              .TListFormRegisteredFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TListFormRegisteredFragment.class.getCanonicalName() + " must be set");
        }
        return new TListFormRegisteredFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TListFormRegisteredFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TListFormRegisteredFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTListFormRegisteredFragment
            .TListFormRegisteredFragmentSubcomponent {
      private TListFormRegisteredFragmentSubcomponentImpl(
          TListFormRegisteredFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TListFormRegisteredFragment arg0) {
        injectTListFormRegisteredFragment(arg0);
      }

      private TListFormRegisteredFragment injectTListFormRegisteredFragment(
          TListFormRegisteredFragment instance) {
        TListFormRegisteredFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TFormRegisteredFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTFormRegisteredFragment
            .TFormRegisteredFragmentSubcomponent.Builder {
      private TFormRegisteredFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTFormRegisteredFragment
              .TFormRegisteredFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TFormRegisteredFragment.class.getCanonicalName() + " must be set");
        }
        return new TFormRegisteredFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TFormRegisteredFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TFormRegisteredFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTFormRegisteredFragment
            .TFormRegisteredFragmentSubcomponent {
      private TFormRegisteredFragmentSubcomponentImpl(
          TFormRegisteredFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TFormRegisteredFragment arg0) {
        injectTFormRegisteredFragment(arg0);
      }

      private TFormRegisteredFragment injectTFormRegisteredFragment(
          TFormRegisteredFragment instance) {
        TFormRegisteredFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TEditFormFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTEditFormFragment.TEditFormFragmentSubcomponent
            .Builder {
      private TEditFormFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTEditFormFragment.TEditFormFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TEditFormFragment.class.getCanonicalName() + " must be set");
        }
        return new TEditFormFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TEditFormFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TEditFormFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTEditFormFragment
            .TEditFormFragmentSubcomponent {
      private TEditFormFragmentSubcomponentImpl(TEditFormFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TEditFormFragment arg0) {
        injectTEditFormFragment(arg0);
      }

      private TEditFormFragment injectTEditFormFragment(TEditFormFragment instance) {
        TEditFormFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TListActivitiesFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTListActivitiesFragment
            .TListActivitiesFragmentSubcomponent.Builder {
      private TListActivitiesFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTListActivitiesFragment
              .TListActivitiesFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TListActivitiesFragment.class.getCanonicalName() + " must be set");
        }
        return new TListActivitiesFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TListActivitiesFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TListActivitiesFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTListActivitiesFragment
            .TListActivitiesFragmentSubcomponent {
      private TListActivitiesFragmentSubcomponentImpl(
          TListActivitiesFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TListActivitiesFragment arg0) {
        injectTListActivitiesFragment(arg0);
      }

      private TListActivitiesFragment injectTListActivitiesFragment(
          TListActivitiesFragment instance) {
        TListActivitiesFragment_MembersInjector.injectAppExecutors(
            instance, DaggerAppComponent.this.appExecutorsProvider.get());
        TListActivitiesFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TActivityInfoFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTActivityInfoFragment
            .TActivityInfoFragmentSubcomponent.Builder {
      private TActivityInfoFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTActivityInfoFragment
              .TActivityInfoFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TActivityInfoFragment.class.getCanonicalName() + " must be set");
        }
        return new TActivityInfoFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TActivityInfoFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TActivityInfoFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTActivityInfoFragment
            .TActivityInfoFragmentSubcomponent {
      private TActivityInfoFragmentSubcomponentImpl(
          TActivityInfoFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TActivityInfoFragment arg0) {
        injectTActivityInfoFragment(arg0);
      }

      private TActivityInfoFragment injectTActivityInfoFragment(TActivityInfoFragment instance) {
        TActivityInfoFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        TActivityInfoFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class TListScholarShipsFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTListScholarShipFragment
            .TListScholarShipsFragmentSubcomponent.Builder {
      private TListScholarShipsFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTListScholarShipFragment
              .TListScholarShipsFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TListScholarShipsFragment.class.getCanonicalName() + " must be set");
        }
        return new TListScholarShipsFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TListScholarShipsFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TListScholarShipsFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTListScholarShipFragment
            .TListScholarShipsFragmentSubcomponent {
      private TListScholarShipsFragmentSubcomponentImpl(
          TListScholarShipsFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TListScholarShipsFragment arg0) {
        injectTListScholarShipsFragment(arg0);
      }

      private TListScholarShipsFragment injectTListScholarShipsFragment(
          TListScholarShipsFragment instance) {
        TListScholarShipsFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TListJobsFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTListJobsFragment.TListJobsFragmentSubcomponent
            .Builder {
      private TListJobsFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTListJobsFragment.TListJobsFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TListJobsFragment.class.getCanonicalName() + " must be set");
        }
        return new TListJobsFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TListJobsFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TListJobsFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTListJobsFragment
            .TListJobsFragmentSubcomponent {
      private TListJobsFragmentSubcomponentImpl(TListJobsFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TListJobsFragment arg0) {
        injectTListJobsFragment(arg0);
      }

      private TListJobsFragment injectTListJobsFragment(TListJobsFragment instance) {
        TListJobsFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TListNotificationsFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTListNotificationsFragment
            .TListNotificationsFragmentSubcomponent.Builder {
      private TListNotificationsFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTListNotificationsFragment
              .TListNotificationsFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TListNotificationsFragment.class.getCanonicalName() + " must be set");
        }
        return new TListNotificationsFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TListNotificationsFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TListNotificationsFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTListNotificationsFragment
            .TListNotificationsFragmentSubcomponent {
      private TListNotificationsFragmentSubcomponentImpl(
          TListNotificationsFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TListNotificationsFragment arg0) {
        injectTListNotificationsFragment(arg0);
      }

      private TListNotificationsFragment injectTListNotificationsFragment(
          TListNotificationsFragment instance) {
        TListNotificationsFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        TListNotificationsFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        TListNotificationsFragment_MembersInjector.injectAppExecutors(
            instance, DaggerAppComponent.this.appExecutorsProvider.get());
        return instance;
      }
    }

    private final class TAccountFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTAccountFragment.TAccountFragmentSubcomponent
            .Builder {
      private TAccountFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTAccountFragment.TAccountFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TAccountFragment.class.getCanonicalName() + " must be set");
        }
        return new TAccountFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TAccountFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TAccountFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTAccountFragment
            .TAccountFragmentSubcomponent {
      private TAccountFragmentSubcomponentImpl(TAccountFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TAccountFragment arg0) {
        injectTAccountFragment(arg0);
      }

      private TAccountFragment injectTAccountFragment(TAccountFragment instance) {
        TAccountFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class TChangePasswordFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTChangePassword
            .TChangePasswordFragmentSubcomponent.Builder {
      private TChangePasswordFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTChangePassword
              .TChangePasswordFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TChangePasswordFragment.class.getCanonicalName() + " must be set");
        }
        return new TChangePasswordFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TChangePasswordFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TChangePasswordFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTChangePassword
            .TChangePasswordFragmentSubcomponent {
      private TChangePasswordFragmentSubcomponentImpl(
          TChangePasswordFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TChangePasswordFragment arg0) {
        injectTChangePasswordFragment(arg0);
      }

      private TChangePasswordFragment injectTChangePasswordFragment(
          TChangePasswordFragment instance) {
        TChangePasswordFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        TChangePasswordFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class TeacherInfoFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTeacherInfoFragment
            .TeacherInfoFragmentSubcomponent.Builder {
      private TeacherInfoFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTeacherInfoFragment
              .TeacherInfoFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TeacherInfoFragment.class.getCanonicalName() + " must be set");
        }
        return new TeacherInfoFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TeacherInfoFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TeacherInfoFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTeacherInfoFragment
            .TeacherInfoFragmentSubcomponent {
      private TeacherInfoFragmentSubcomponentImpl(TeacherInfoFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TeacherInfoFragment arg0) {
        injectTeacherInfoFragment(arg0);
      }

      private TeacherInfoFragment injectTeacherInfoFragment(TeacherInfoFragment instance) {
        TeacherInfoFragment_MembersInjector.injectViewModelFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        TeacherInfoFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class ListStudentFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeListStudentFragment
            .ListStudentFragmentSubcomponent.Builder {
      private ListStudentFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeListStudentFragment
              .ListStudentFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListStudentFragment.class.getCanonicalName() + " must be set");
        }
        return new ListStudentFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListStudentFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ListStudentFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeListStudentFragment
            .ListStudentFragmentSubcomponent {
      private ListStudentFragmentSubcomponentImpl(ListStudentFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ListStudentFragment arg0) {
        injectListStudentFragment(arg0);
      }

      private ListStudentFragment injectListStudentFragment(ListStudentFragment instance) {
        ListStudentFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class ListActivitiesOfStudentFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeListActivitiesOfStudent
            .ListActivitiesOfStudentFragmentSubcomponent.Builder {
      private ListActivitiesOfStudentFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeListActivitiesOfStudent
              .ListActivitiesOfStudentFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListActivitiesOfStudentFragment.class.getCanonicalName() + " must be set");
        }
        return new ListActivitiesOfStudentFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListActivitiesOfStudentFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ListActivitiesOfStudentFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeListActivitiesOfStudent
            .ListActivitiesOfStudentFragmentSubcomponent {
      private ListActivitiesOfStudentFragmentSubcomponentImpl(
          ListActivitiesOfStudentFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(ListActivitiesOfStudentFragment arg0) {
        injectListActivitiesOfStudentFragment(arg0);
      }

      private ListActivitiesOfStudentFragment injectListActivitiesOfStudentFragment(
          ListActivitiesOfStudentFragment instance) {
        ListActivitiesOfStudentFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        ListActivitiesOfStudentFragment_MembersInjector.injectAppExecutors(
            instance, DaggerAppComponent.this.appExecutorsProvider.get());
        return instance;
      }
    }

    private final class StudentInfoFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeStudentInfoFragment
            .StudentInfoFragmentSubcomponent.Builder {
      private StudentInfoFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeStudentInfoFragment
              .StudentInfoFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              StudentInfoFragment.class.getCanonicalName() + " must be set");
        }
        return new StudentInfoFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(StudentInfoFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class StudentInfoFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeStudentInfoFragment
            .StudentInfoFragmentSubcomponent {
      private StudentInfoFragmentSubcomponentImpl(StudentInfoFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(StudentInfoFragment arg0) {
        injectStudentInfoFragment(arg0);
      }

      private StudentInfoFragment injectStudentInfoFragment(StudentInfoFragment instance) {
        StudentInfoFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TeacherMarkFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTeacherMarkFragment
            .TeacherMarkFragmentSubcomponent.Builder {
      private TeacherMarkFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTeacherMarkFragment
              .TeacherMarkFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TeacherMarkFragment.class.getCanonicalName() + " must be set");
        }
        return new TeacherMarkFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TeacherMarkFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TeacherMarkFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTeacherMarkFragment
            .TeacherMarkFragmentSubcomponent {
      private TeacherMarkFragmentSubcomponentImpl(TeacherMarkFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TeacherMarkFragment arg0) {
        injectTeacherMarkFragment(arg0);
      }

      private TeacherMarkFragment injectTeacherMarkFragment(TeacherMarkFragment instance) {
        TeacherMarkFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TStudentNoteFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTStudentNoteFragment
            .TStudentNoteFragmentSubcomponent.Builder {
      private TStudentNoteFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTStudentNoteFragment
              .TStudentNoteFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TStudentNoteFragment.class.getCanonicalName() + " must be set");
        }
        return new TStudentNoteFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TStudentNoteFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TStudentNoteFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTStudentNoteFragment
            .TStudentNoteFragmentSubcomponent {
      private TStudentNoteFragmentSubcomponentImpl(
          TStudentNoteFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TStudentNoteFragment arg0) {
        injectTStudentNoteFragment(arg0);
      }

      private TStudentNoteFragment injectTStudentNoteFragment(TStudentNoteFragment instance) {
        TStudentNoteFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TLFBM_CRDF_RunDashboardFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeRunDashboardFragment
            .RunDashboardFragmentSubcomponent.Builder {
      private RunDashboardFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeRunDashboardFragment
              .RunDashboardFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              RunDashboardFragment.class.getCanonicalName() + " must be set");
        }
        return new TLFBM_CRDF_RunDashboardFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(RunDashboardFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TLFBM_CRDF_RunDashboardFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeRunDashboardFragment
            .RunDashboardFragmentSubcomponent {
      private TLFBM_CRDF_RunDashboardFragmentSubcomponentImpl(
          TLFBM_CRDF_RunDashboardFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(RunDashboardFragment arg0) {
        injectRunDashboardFragment(arg0);
      }

      private RunDashboardFragment injectRunDashboardFragment(RunDashboardFragment instance) {
        RunDashboardFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        RunDashboardFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        RunDashboardFragment_MembersInjector.injectRunDataDao(
            instance, DaggerAppComponent.this.provideRunResultProvider.get());
        return instance;
      }
    }

    private final class TLFBM_CRF_RunFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeRunFragment.RunFragmentSubcomponent.Builder {
      private RunFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeRunFragment.RunFragmentSubcomponent build() {
        if (seedInstance == null) {
          throw new IllegalStateException(RunFragment.class.getCanonicalName() + " must be set");
        }
        return new TLFBM_CRF_RunFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(RunFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TLFBM_CRF_RunFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeRunFragment.RunFragmentSubcomponent {
      private TLFBM_CRF_RunFragmentSubcomponentImpl(
          TLFBM_CRF_RunFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(RunFragment arg0) {
        injectRunFragment(arg0);
      }

      private RunFragment injectRunFragment(RunFragment instance) {
        RunFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        RunFragment_MembersInjector.injectRunningLocationDao(
            instance, DaggerAppComponent.this.provideRunningLocationDaoProvider.get());
        RunFragment_MembersInjector.injectRunningWayDao(
            instance, DaggerAppComponent.this.provideRunningWayDaoProvider.get());
        RunFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        RunFragment_MembersInjector.injectRunDataDao(
            instance, DaggerAppComponent.this.provideRunResultProvider.get());
        return instance;
      }
    }

    private final class THome2FragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTHome2Fragment.THome2FragmentSubcomponent
            .Builder {
      private THome2Fragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTHome2Fragment.THome2FragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(THome2Fragment.class.getCanonicalName() + " must be set");
        }
        return new THome2FragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(THome2Fragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class THome2FragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTHome2Fragment.THome2FragmentSubcomponent {
      private THome2FragmentSubcomponentImpl(THome2FragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(THome2Fragment arg0) {
        injectTHome2Fragment(arg0);
      }

      private THome2Fragment injectTHome2Fragment(THome2Fragment instance) {
        THome2Fragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        THome2Fragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class TGiftGivenFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTGiftGivenFragment
            .TGiftGivenFragmentSubcomponent.Builder {
      private TGiftGivenFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTGiftGivenFragment.TGiftGivenFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TGiftGivenFragment.class.getCanonicalName() + " must be set");
        }
        return new TGiftGivenFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TGiftGivenFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TGiftGivenFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTGiftGivenFragment
            .TGiftGivenFragmentSubcomponent {
      private TGiftGivenFragmentSubcomponentImpl(TGiftGivenFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TGiftGivenFragment arg0) {
        injectTGiftGivenFragment(arg0);
      }

      private TGiftGivenFragment injectTGiftGivenFragment(TGiftGivenFragment instance) {
        TGiftGivenFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        TGiftGivenFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class TListRegisterFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTListRegister.TListRegisterFragmentSubcomponent
            .Builder {
      private TListRegisterFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTListRegister.TListRegisterFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TListRegisterFragment.class.getCanonicalName() + " must be set");
        }
        return new TListRegisterFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TListRegisterFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TListRegisterFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTListRegister
            .TListRegisterFragmentSubcomponent {
      private TListRegisterFragmentSubcomponentImpl(
          TListRegisterFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TListRegisterFragment arg0) {
        injectTListRegisterFragment(arg0);
      }

      private TListRegisterFragment injectTListRegisterFragment(TListRegisterFragment instance) {
        TListRegisterFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TCreateGiftFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTCreateGift.TCreateGiftFragmentSubcomponent
            .Builder {
      private TCreateGiftFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTCreateGift.TCreateGiftFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TCreateGiftFragment.class.getCanonicalName() + " must be set");
        }
        return new TCreateGiftFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TCreateGiftFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TCreateGiftFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTCreateGift
            .TCreateGiftFragmentSubcomponent {
      private TCreateGiftFragmentSubcomponentImpl(TCreateGiftFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TCreateGiftFragment arg0) {
        injectTCreateGiftFragment(arg0);
      }

      private TCreateGiftFragment injectTCreateGiftFragment(TCreateGiftFragment instance) {
        TCreateGiftFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        TCreateGiftFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        TCreateGiftFragment_MembersInjector.injectGiftWebService(
            instance, DaggerAppComponent.this.provideGiftServiceProvider.get());
        return instance;
      }
    }

    private final class TGiftFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTGift.TGiftFragmentSubcomponent.Builder {
      private TGiftFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTGift.TGiftFragmentSubcomponent build() {
        if (seedInstance == null) {
          throw new IllegalStateException(TGiftFragment.class.getCanonicalName() + " must be set");
        }
        return new TGiftFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TGiftFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TGiftFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTGift.TGiftFragmentSubcomponent {
      private TGiftFragmentSubcomponentImpl(TGiftFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TGiftFragment arg0) {
        injectTGiftFragment(arg0);
      }

      private TGiftFragment injectTGiftFragment(TGiftFragment instance) {
        TGiftFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        TGiftFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class TGiftInfoFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTGiftInfo.TGiftInfoFragmentSubcomponent
            .Builder {
      private TGiftInfoFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTGiftInfo.TGiftInfoFragmentSubcomponent build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TGiftInfoFragment.class.getCanonicalName() + " must be set");
        }
        return new TGiftInfoFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TGiftInfoFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TGiftInfoFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTGiftInfo.TGiftInfoFragmentSubcomponent {
      private TGiftInfoFragmentSubcomponentImpl(TGiftInfoFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TGiftInfoFragment arg0) {
        injectTGiftInfoFragment(arg0);
      }

      private TGiftInfoFragment injectTGiftInfoFragment(TGiftInfoFragment instance) {
        TGiftInfoFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        TGiftInfoFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class TGiftReceivedFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTGiftReceived.TGiftReceivedFragmentSubcomponent
            .Builder {
      private TGiftReceivedFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTGiftReceived.TGiftReceivedFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TGiftReceivedFragment.class.getCanonicalName() + " must be set");
        }
        return new TGiftReceivedFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TGiftReceivedFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TGiftReceivedFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTGiftReceived
            .TGiftReceivedFragmentSubcomponent {
      private TGiftReceivedFragmentSubcomponentImpl(
          TGiftReceivedFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TGiftReceivedFragment arg0) {
        injectTGiftReceivedFragment(arg0);
      }

      private TGiftReceivedFragment injectTGiftReceivedFragment(TGiftReceivedFragment instance) {
        TGiftReceivedFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        TGiftReceivedFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class TMoreJobFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTMoreJob.TMoreJobFragmentSubcomponent.Builder {
      private TMoreJobFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTMoreJob.TMoreJobFragmentSubcomponent build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TMoreJobFragment.class.getCanonicalName() + " must be set");
        }
        return new TMoreJobFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TMoreJobFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TMoreJobFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTMoreJob.TMoreJobFragmentSubcomponent {
      private TMoreJobFragmentSubcomponentImpl(TMoreJobFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TMoreJobFragment arg0) {
        injectTMoreJobFragment(arg0);
      }

      private TMoreJobFragment injectTMoreJobFragment(TMoreJobFragment instance) {
        TMoreJobFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TMotelInfoFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTMotelInfo.TMotelInfoFragmentSubcomponent
            .Builder {
      private TMotelInfoFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTMotelInfo.TMotelInfoFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TMotelInfoFragment.class.getCanonicalName() + " must be set");
        }
        return new TMotelInfoFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TMotelInfoFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TMotelInfoFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTMotelInfo.TMotelInfoFragmentSubcomponent {
      private TMotelInfoFragmentSubcomponentImpl(TMotelInfoFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TMotelInfoFragment arg0) {
        injectTMotelInfoFragment(arg0);
      }

      private TMotelInfoFragment injectTMotelInfoFragment(TMotelInfoFragment instance) {
        TMotelInfoFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TSearchMotelFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTSearchMotel.TSearchMotelFragmentSubcomponent
            .Builder {
      private TSearchMotelFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTSearchMotel.TSearchMotelFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TSearchMotelFragment.class.getCanonicalName() + " must be set");
        }
        return new TSearchMotelFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TSearchMotelFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TSearchMotelFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTSearchMotel
            .TSearchMotelFragmentSubcomponent {
      private TSearchMotelFragmentSubcomponentImpl(
          TSearchMotelFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TSearchMotelFragment arg0) {
        injectTSearchMotelFragment(arg0);
      }

      private TSearchMotelFragment injectTSearchMotelFragment(TSearchMotelFragment instance) {
        TSearchMotelFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TAddNewAddressFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTAddNewAddressMotel
            .TAddNewAddressFragmentSubcomponent.Builder {
      private TAddNewAddressFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTAddNewAddressMotel
              .TAddNewAddressFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TAddNewAddressFragment.class.getCanonicalName() + " must be set");
        }
        return new TAddNewAddressFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TAddNewAddressFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TAddNewAddressFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTAddNewAddressMotel
            .TAddNewAddressFragmentSubcomponent {
      private TAddNewAddressFragmentSubcomponentImpl(
          TAddNewAddressFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TAddNewAddressFragment arg0) {
        injectTAddNewAddressFragment(arg0);
      }

      private TAddNewAddressFragment injectTAddNewAddressFragment(TAddNewAddressFragment instance) {
        TAddNewAddressFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        TAddNewAddressFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TListAddressFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTListAddressMotel
            .TListAddressFragmentSubcomponent.Builder {
      private TListAddressFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTListAddressMotel.TListAddressFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TListAddressFragment.class.getCanonicalName() + " must be set");
        }
        return new TListAddressFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TListAddressFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TListAddressFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTListAddressMotel
            .TListAddressFragmentSubcomponent {
      private TListAddressFragmentSubcomponentImpl(
          TListAddressFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TListAddressFragment arg0) {
        injectTListAddressFragment(arg0);
      }

      private TListAddressFragment injectTListAddressFragment(TListAddressFragment instance) {
        TListAddressFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TAddMotelInfoFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTAddMotelInfoMotel
            .TAddMotelInfoFragmentSubcomponent.Builder {
      private TAddMotelInfoFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTAddMotelInfoMotel
              .TAddMotelInfoFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TAddMotelInfoFragment.class.getCanonicalName() + " must be set");
        }
        return new TAddMotelInfoFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TAddMotelInfoFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TAddMotelInfoFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTAddMotelInfoMotel
            .TAddMotelInfoFragmentSubcomponent {
      private TAddMotelInfoFragmentSubcomponentImpl(
          TAddMotelInfoFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TAddMotelInfoFragment arg0) {
        injectTAddMotelInfoFragment(arg0);
      }

      private TAddMotelInfoFragment injectTAddMotelInfoFragment(TAddMotelInfoFragment instance) {
        TAddMotelInfoFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        TAddMotelInfoFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TImageMotelFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTImageMotel.TImageMotelFragmentSubcomponent
            .Builder {
      private TImageMotelFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTImageMotel.TImageMotelFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TImageMotelFragment.class.getCanonicalName() + " must be set");
        }
        return new TImageMotelFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TImageMotelFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TImageMotelFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTImageMotel
            .TImageMotelFragmentSubcomponent {
      private TImageMotelFragmentSubcomponentImpl(TImageMotelFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TImageMotelFragment arg0) {
        injectTImageMotelFragment(arg0);
      }

      private TImageMotelFragment injectTImageMotelFragment(TImageMotelFragment instance) {
        TImageMotelFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        TImageMotelFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        TImageMotelFragment_MembersInjector.injectWebService(
            instance, DaggerAppComponent.this.provideApiServiceProvider.get());
        return instance;
      }
    }

    private final class TApplyGiftFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTApplyGift.TApplyGiftFragmentSubcomponent
            .Builder {
      private TApplyGiftFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTApplyGift.TApplyGiftFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TApplyGiftFragment.class.getCanonicalName() + " must be set");
        }
        return new TApplyGiftFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TApplyGiftFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TApplyGiftFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTApplyGift.TApplyGiftFragmentSubcomponent {
      private TApplyGiftFragmentSubcomponentImpl(TApplyGiftFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TApplyGiftFragment arg0) {
        injectTApplyGiftFragment(arg0);
      }

      private TApplyGiftFragment injectTApplyGiftFragment(TApplyGiftFragment instance) {
        TApplyGiftFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        TApplyGiftFragment_MembersInjector.injectSharedPrefsHelper(
            instance, DaggerAppComponent.this.sharedPrefsHelperProvider.get());
        return instance;
      }
    }

    private final class TReceiverAddressFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeTAddressGift
            .TReceiverAddressFragmentSubcomponent.Builder {
      private TReceiverAddressFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeTAddressGift.TReceiverAddressFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              TReceiverAddressFragment.class.getCanonicalName() + " must be set");
        }
        return new TReceiverAddressFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TReceiverAddressFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TReceiverAddressFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeTAddressGift
            .TReceiverAddressFragmentSubcomponent {
      private TReceiverAddressFragmentSubcomponentImpl(
          TReceiverAddressFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TReceiverAddressFragment arg0) {
        injectTReceiverAddressFragment(arg0);
      }

      private TReceiverAddressFragment injectTReceiverAddressFragment(
          TReceiverAddressFragment instance) {
        TReceiverAddressFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class TTutorFragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeRTutorFragment.TTutorFragmentSubcomponent
            .Builder {
      private TTutorFragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeRTutorFragment.TTutorFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(TTutorFragment.class.getCanonicalName() + " must be set");
        }
        return new TTutorFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(TTutorFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class TTutorFragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeRTutorFragment.TTutorFragmentSubcomponent {
      private TTutorFragmentSubcomponentImpl(TTutorFragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(TTutorFragment arg0) {
        injectTTutorFragment(arg0);
      }

      private TTutorFragment injectTTutorFragment(TTutorFragment instance) {
        TTutorFragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }

    private final class StudentList2FragmentSubcomponentBuilder
        extends TListFragmentBuilderModule_ContributeStudentList2.StudentList2FragmentSubcomponent
            .Builder {
      private StudentList2Fragment seedInstance;

      @Override
      public TListFragmentBuilderModule_ContributeStudentList2.StudentList2FragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              StudentList2Fragment.class.getCanonicalName() + " must be set");
        }
        return new StudentList2FragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(StudentList2Fragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class StudentList2FragmentSubcomponentImpl
        implements TListFragmentBuilderModule_ContributeStudentList2
            .StudentList2FragmentSubcomponent {
      private StudentList2FragmentSubcomponentImpl(
          StudentList2FragmentSubcomponentBuilder builder) {}

      @Override
      public void inject(StudentList2Fragment arg0) {
        injectStudentList2Fragment(arg0);
      }

      private StudentList2Fragment injectStudentList2Fragment(StudentList2Fragment instance) {
        StudentList2Fragment_MembersInjector.injectFactory(
            instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
        return instance;
      }
    }
  }
}
