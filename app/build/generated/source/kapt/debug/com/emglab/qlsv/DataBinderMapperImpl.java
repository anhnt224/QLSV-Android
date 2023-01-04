package com.emglab.qlsv;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.emglab.qlsv.databinding.AccountFragmentBindingImpl;
import com.emglab.qlsv.databinding.ActivityMainBindingImpl;
import com.emglab.qlsv.databinding.ActivityTeacherBindingImpl;
import com.emglab.qlsv.databinding.AddNewAddressFragmentBindingImpl;
import com.emglab.qlsv.databinding.ApplyJobFragmentBindingImpl;
import com.emglab.qlsv.databinding.ChooseDeliveryTypeFragmentBindingImpl;
import com.emglab.qlsv.databinding.ChooseReciverAddressFragmentBindingImpl;
import com.emglab.qlsv.databinding.CreateGiftFragmentBindingImpl;
import com.emglab.qlsv.databinding.CriteriaFragmentBindingImpl;
import com.emglab.qlsv.databinding.EditFormFragmentBindingImpl;
import com.emglab.qlsv.databinding.ErrorTokenBindingImpl;
import com.emglab.qlsv.databinding.FormDetailFragmentBindingImpl;
import com.emglab.qlsv.databinding.FormRegisteredDetailFragmentBindingImpl;
import com.emglab.qlsv.databinding.FragmentActivityDetailByUserUnitBindingImpl;
import com.emglab.qlsv.databinding.FragmentAddMotelInfo2BindingImpl;
import com.emglab.qlsv.databinding.FragmentAddMotelInfoBindingImpl;
import com.emglab.qlsv.databinding.FragmentChangePasswordBindingImpl;
import com.emglab.qlsv.databinding.FragmentCheckOtpLostPasswordBindingImpl;
import com.emglab.qlsv.databinding.FragmentGiftReceiveBindingImpl;
import com.emglab.qlsv.databinding.FragmentImageMotelBindingImpl;
import com.emglab.qlsv.databinding.FragmentListMotelResultsBindingImpl;
import com.emglab.qlsv.databinding.FragmentLoginBindingImpl;
import com.emglab.qlsv.databinding.FragmentLostPasswordBindingImpl;
import com.emglab.qlsv.databinding.FragmentMessageListBindingImpl;
import com.emglab.qlsv.databinding.FragmentMoreJobBindingImpl;
import com.emglab.qlsv.databinding.FragmentMotelRegistrationCompleteBindingImpl;
import com.emglab.qlsv.databinding.FragmentMotelRegistrationInfoBindingImpl;
import com.emglab.qlsv.databinding.FragmentMotelRegistrationListBindingImpl;
import com.emglab.qlsv.databinding.FragmentMotelRegistrationProcessingBindingImpl;
import com.emglab.qlsv.databinding.FragmentPickMotelLocationBindingImpl;
import com.emglab.qlsv.databinding.FragmentPickRegisterMotelLocationBindingImpl;
import com.emglab.qlsv.databinding.FragmentRegisterBindingImpl;
import com.emglab.qlsv.databinding.FragmentRegisterToFindMotelBindingImpl;
import com.emglab.qlsv.databinding.FragmentScheduleBindingImpl;
import com.emglab.qlsv.databinding.FragmentStudentList2BindingImpl;
import com.emglab.qlsv.databinding.FragmentTAddNewAddressBindingImpl;
import com.emglab.qlsv.databinding.FragmentTApplyGiftBindingImpl;
import com.emglab.qlsv.databinding.FragmentTGiftReceivedBindingImpl;
import com.emglab.qlsv.databinding.FragmentTImageMotelBindingImpl;
import com.emglab.qlsv.databinding.FragmentTListAddressBindingImpl;
import com.emglab.qlsv.databinding.FragmentTMoreJobBindingImpl;
import com.emglab.qlsv.databinding.FragmentTMotelInfoBindingImpl;
import com.emglab.qlsv.databinding.FragmentTPickLocationBindingImpl;
import com.emglab.qlsv.databinding.FragmentTReceiverAddressBindingImpl;
import com.emglab.qlsv.databinding.FragmentTSearchMotelBindingImpl;
import com.emglab.qlsv.databinding.FragmentTTutorBindingImpl;
import com.emglab.qlsv.databinding.FragmentTutorBindingImpl;
import com.emglab.qlsv.databinding.FragmentUserCheckInActivityBindingImpl;
import com.emglab.qlsv.databinding.FragmentUserInfoBindingImpl;
import com.emglab.qlsv.databinding.GiftFragmentBindingImpl;
import com.emglab.qlsv.databinding.GiftGivenFragmentBindingImpl;
import com.emglab.qlsv.databinding.GiftInfoFragmentBindingImpl;
import com.emglab.qlsv.databinding.HelpFragmentBindingImpl;
import com.emglab.qlsv.databinding.Home2FragmentBindingImpl;
import com.emglab.qlsv.databinding.HomeFragmentBindingImpl;
import com.emglab.qlsv.databinding.ItemListJobBindingImpl;
import com.emglab.qlsv.databinding.JobDetailFragmentBindingImpl;
import com.emglab.qlsv.databinding.LayoutEmptyDataBindingImpl;
import com.emglab.qlsv.databinding.LayoutLoadingBindingImpl;
import com.emglab.qlsv.databinding.ListActivitiesOfStudentFragmentBindingImpl;
import com.emglab.qlsv.databinding.ListActivityFragmentBindingImpl;
import com.emglab.qlsv.databinding.ListAddressFragmentBindingImpl;
import com.emglab.qlsv.databinding.ListFormsFragmentBindingImpl;
import com.emglab.qlsv.databinding.ListFormsRegisteredFragmentBindingImpl;
import com.emglab.qlsv.databinding.ListItemActivityBindingImpl;
import com.emglab.qlsv.databinding.ListItemActivityGroupByUpdateActivityBindingImpl;
import com.emglab.qlsv.databinding.ListItemActivityGroupByUpdateSvGroupBindingImpl;
import com.emglab.qlsv.databinding.ListItemAddressBindingImpl;
import com.emglab.qlsv.databinding.ListItemAddressPickerBindingImpl;
import com.emglab.qlsv.databinding.ListItemCountStepBindingImpl;
import com.emglab.qlsv.databinding.ListItemCriteriaActivityBindingImpl;
import com.emglab.qlsv.databinding.ListItemCriteriaGroupsBindingImpl;
import com.emglab.qlsv.databinding.ListItemDayOfWeekBindingImpl;
import com.emglab.qlsv.databinding.ListItemEventBindingImpl;
import com.emglab.qlsv.databinding.ListItemFormBindingImpl;
import com.emglab.qlsv.databinding.ListItemFormQuestionBindingImpl;
import com.emglab.qlsv.databinding.ListItemFormRegisteredBindingImpl;
import com.emglab.qlsv.databinding.ListItemGift2BindingImpl;
import com.emglab.qlsv.databinding.ListItemGiftBindingImpl;
import com.emglab.qlsv.databinding.ListItemGiftCreatedBindingImpl;
import com.emglab.qlsv.databinding.ListItemGiftRegister2BindingImpl;
import com.emglab.qlsv.databinding.ListItemGiftRegisterBindingImpl;
import com.emglab.qlsv.databinding.ListItemHelpBindingImpl;
import com.emglab.qlsv.databinding.ListItemHomeBindingImpl;
import com.emglab.qlsv.databinding.ListItemImageMotelBindingImpl;
import com.emglab.qlsv.databinding.ListItemJobApplyBindingImpl;
import com.emglab.qlsv.databinding.ListItemMessageBindingImpl;
import com.emglab.qlsv.databinding.ListItemMotelImageBindingImpl;
import com.emglab.qlsv.databinding.ListItemMotelInfoBindingImpl;
import com.emglab.qlsv.databinding.ListItemNoteBindingImpl;
import com.emglab.qlsv.databinding.ListItemReceivedGiftBindingImpl;
import com.emglab.qlsv.databinding.ListItemRunResultBindingImpl;
import com.emglab.qlsv.databinding.ListItemRunningDataBindingImpl;
import com.emglab.qlsv.databinding.ListItemScheduleBindingImpl;
import com.emglab.qlsv.databinding.ListItemScholarshipAppliedBindingImpl;
import com.emglab.qlsv.databinding.ListItemScholarshipBindingImpl;
import com.emglab.qlsv.databinding.ListItemStudent2BindingImpl;
import com.emglab.qlsv.databinding.ListItemStudentBindingImpl;
import com.emglab.qlsv.databinding.ListItemStudentCriteriaBindingImpl;
import com.emglab.qlsv.databinding.ListItemStudentCriteriaGroupsBindingImpl;
import com.emglab.qlsv.databinding.ListItemSubjectBindingImpl;
import com.emglab.qlsv.databinding.ListItemTutorialBindingImpl;
import com.emglab.qlsv.databinding.ListItemUserCheckInActivityBindingImpl;
import com.emglab.qlsv.databinding.ListItemUserCriteriaBindingImpl;
import com.emglab.qlsv.databinding.ListJobApplyFragmentBindingImpl;
import com.emglab.qlsv.databinding.ListJobsFragmentBindingImpl;
import com.emglab.qlsv.databinding.ListRegisterFragmentBindingImpl;
import com.emglab.qlsv.databinding.ListRunResultItemBindingImpl;
import com.emglab.qlsv.databinding.ListScholarShipAppliedFragmentBindingImpl;
import com.emglab.qlsv.databinding.ListScholarShipsFragmentBindingImpl;
import com.emglab.qlsv.databinding.ListStudentFragmentBindingImpl;
import com.emglab.qlsv.databinding.LoadingActionStateBindingImpl;
import com.emglab.qlsv.databinding.LoadingStateBindingImpl;
import com.emglab.qlsv.databinding.MapDialogBindingImpl;
import com.emglab.qlsv.databinding.MotelInfoFragmentBindingImpl;
import com.emglab.qlsv.databinding.MotelRegistrationItemBindingImpl;
import com.emglab.qlsv.databinding.NotesFragmentBindingImpl;
import com.emglab.qlsv.databinding.PickLocationFragmentBindingImpl;
import com.emglab.qlsv.databinding.QrStudentFragmentBindingImpl;
import com.emglab.qlsv.databinding.ReceiverAddressFragmentBindingImpl;
import com.emglab.qlsv.databinding.RegistFormFragmentBindingImpl;
import com.emglab.qlsv.databinding.RegistGiftFragmentBindingImpl;
import com.emglab.qlsv.databinding.RunDashboardFragmentBindingImpl;
import com.emglab.qlsv.databinding.RunFragmentBindingImpl;
import com.emglab.qlsv.databinding.RunningDataFragmentBindingImpl;
import com.emglab.qlsv.databinding.RunningFragmentBindingImpl;
import com.emglab.qlsv.databinding.ScholarShipDetailFragmentBindingImpl;
import com.emglab.qlsv.databinding.SearchMotelFragmentBindingImpl;
import com.emglab.qlsv.databinding.StudentInfoFragmentBindingImpl;
import com.emglab.qlsv.databinding.TAccountFragmentBindingImpl;
import com.emglab.qlsv.databinding.TActivityInfoFragmentBindingImpl;
import com.emglab.qlsv.databinding.TChangePasswordFragmentBindingImpl;
import com.emglab.qlsv.databinding.TCreateGiftFragmentBindingImpl;
import com.emglab.qlsv.databinding.TEditFormFragmentBindingImpl;
import com.emglab.qlsv.databinding.TFormDetailFragmentBindingImpl;
import com.emglab.qlsv.databinding.TFormRegisteredFragmentBindingImpl;
import com.emglab.qlsv.databinding.TGiftFragmentBindingImpl;
import com.emglab.qlsv.databinding.TGiftGivenFragmentBindingImpl;
import com.emglab.qlsv.databinding.TGiftInfoFragmentBindingImpl;
import com.emglab.qlsv.databinding.THome2FragmentBindingImpl;
import com.emglab.qlsv.databinding.THomeFragmentBindingImpl;
import com.emglab.qlsv.databinding.TJobDetailFragmentBindingImpl;
import com.emglab.qlsv.databinding.TListActivitiesFragmentBindingImpl;
import com.emglab.qlsv.databinding.TListFormFragmentBindingImpl;
import com.emglab.qlsv.databinding.TListFormRegisteredFragmentBindingImpl;
import com.emglab.qlsv.databinding.TListJobsFragmentBindingImpl;
import com.emglab.qlsv.databinding.TListNotificationsFragmentBindingImpl;
import com.emglab.qlsv.databinding.TListRegisterFragmentBindingImpl;
import com.emglab.qlsv.databinding.TListScholarShipsFragmentBindingImpl;
import com.emglab.qlsv.databinding.TRegisterFormFragmentBindingImpl;
import com.emglab.qlsv.databinding.TScholarShipDetailFragmentBindingImpl;
import com.emglab.qlsv.databinding.TStudentNoteFragmentBindingImpl;
import com.emglab.qlsv.databinding.TeacherInfoFragmentBindingImpl;
import com.emglab.qlsv.databinding.TeacherMarkFragmentBindingImpl;
import com.emglab.qlsv.databinding.TimeTableFragmentBindingImpl;
import com.emglab.qlsv.databinding.TrainingPointFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACCOUNTFRAGMENT = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYTEACHER = 3;

  private static final int LAYOUT_ADDNEWADDRESSFRAGMENT = 4;

  private static final int LAYOUT_APPLYJOBFRAGMENT = 5;

  private static final int LAYOUT_CHOOSEDELIVERYTYPEFRAGMENT = 6;

  private static final int LAYOUT_CHOOSERECIVERADDRESSFRAGMENT = 7;

  private static final int LAYOUT_CREATEGIFTFRAGMENT = 8;

  private static final int LAYOUT_CRITERIAFRAGMENT = 9;

  private static final int LAYOUT_EDITFORMFRAGMENT = 10;

  private static final int LAYOUT_ERRORTOKEN = 11;

  private static final int LAYOUT_FORMDETAILFRAGMENT = 12;

  private static final int LAYOUT_FORMREGISTEREDDETAILFRAGMENT = 13;

  private static final int LAYOUT_FRAGMENTACTIVITYDETAILBYUSERUNIT = 14;

  private static final int LAYOUT_FRAGMENTADDMOTELINFO = 15;

  private static final int LAYOUT_FRAGMENTADDMOTELINFO2 = 16;

  private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 17;

  private static final int LAYOUT_FRAGMENTCHECKOTPLOSTPASSWORD = 18;

  private static final int LAYOUT_FRAGMENTGIFTRECEIVE = 19;

  private static final int LAYOUT_FRAGMENTIMAGEMOTEL = 20;

  private static final int LAYOUT_FRAGMENTLISTMOTELRESULTS = 21;

  private static final int LAYOUT_FRAGMENTLOGIN = 22;

  private static final int LAYOUT_FRAGMENTLOSTPASSWORD = 23;

  private static final int LAYOUT_FRAGMENTMESSAGELIST = 24;

  private static final int LAYOUT_FRAGMENTMOREJOB = 25;

  private static final int LAYOUT_FRAGMENTMOTELREGISTRATIONCOMPLETE = 26;

  private static final int LAYOUT_FRAGMENTMOTELREGISTRATIONINFO = 27;

  private static final int LAYOUT_FRAGMENTMOTELREGISTRATIONLIST = 28;

  private static final int LAYOUT_FRAGMENTMOTELREGISTRATIONPROCESSING = 29;

  private static final int LAYOUT_FRAGMENTPICKMOTELLOCATION = 30;

  private static final int LAYOUT_FRAGMENTPICKREGISTERMOTELLOCATION = 31;

  private static final int LAYOUT_FRAGMENTREGISTER = 32;

  private static final int LAYOUT_FRAGMENTREGISTERTOFINDMOTEL = 33;

  private static final int LAYOUT_FRAGMENTSCHEDULE = 34;

  private static final int LAYOUT_FRAGMENTSTUDENTLIST2 = 35;

  private static final int LAYOUT_FRAGMENTTADDNEWADDRESS = 36;

  private static final int LAYOUT_FRAGMENTTAPPLYGIFT = 37;

  private static final int LAYOUT_FRAGMENTTGIFTRECEIVED = 38;

  private static final int LAYOUT_FRAGMENTTIMAGEMOTEL = 39;

  private static final int LAYOUT_FRAGMENTTLISTADDRESS = 40;

  private static final int LAYOUT_FRAGMENTTMOREJOB = 41;

  private static final int LAYOUT_FRAGMENTTMOTELINFO = 42;

  private static final int LAYOUT_FRAGMENTTPICKLOCATION = 43;

  private static final int LAYOUT_FRAGMENTTRECEIVERADDRESS = 44;

  private static final int LAYOUT_FRAGMENTTSEARCHMOTEL = 45;

  private static final int LAYOUT_FRAGMENTTTUTOR = 46;

  private static final int LAYOUT_FRAGMENTTUTOR = 47;

  private static final int LAYOUT_FRAGMENTUSERCHECKINACTIVITY = 48;

  private static final int LAYOUT_FRAGMENTUSERINFO = 49;

  private static final int LAYOUT_GIFTFRAGMENT = 50;

  private static final int LAYOUT_GIFTGIVENFRAGMENT = 51;

  private static final int LAYOUT_GIFTINFOFRAGMENT = 52;

  private static final int LAYOUT_HELPFRAGMENT = 53;

  private static final int LAYOUT_HOME2FRAGMENT = 54;

  private static final int LAYOUT_HOMEFRAGMENT = 55;

  private static final int LAYOUT_ITEMLISTJOB = 56;

  private static final int LAYOUT_JOBDETAILFRAGMENT = 57;

  private static final int LAYOUT_LAYOUTEMPTYDATA = 58;

  private static final int LAYOUT_LAYOUTLOADING = 59;

  private static final int LAYOUT_LISTACTIVITIESOFSTUDENTFRAGMENT = 60;

  private static final int LAYOUT_LISTACTIVITYFRAGMENT = 61;

  private static final int LAYOUT_LISTADDRESSFRAGMENT = 62;

  private static final int LAYOUT_LISTFORMSFRAGMENT = 63;

  private static final int LAYOUT_LISTFORMSREGISTEREDFRAGMENT = 64;

  private static final int LAYOUT_LISTITEMACTIVITY = 65;

  private static final int LAYOUT_LISTITEMACTIVITYGROUPBYUPDATEACTIVITY = 66;

  private static final int LAYOUT_LISTITEMACTIVITYGROUPBYUPDATESVGROUP = 67;

  private static final int LAYOUT_LISTITEMADDRESS = 68;

  private static final int LAYOUT_LISTITEMADDRESSPICKER = 69;

  private static final int LAYOUT_LISTITEMCOUNTSTEP = 70;

  private static final int LAYOUT_LISTITEMCRITERIAACTIVITY = 71;

  private static final int LAYOUT_LISTITEMCRITERIAGROUPS = 72;

  private static final int LAYOUT_LISTITEMDAYOFWEEK = 73;

  private static final int LAYOUT_LISTITEMEVENT = 74;

  private static final int LAYOUT_LISTITEMFORM = 75;

  private static final int LAYOUT_LISTITEMFORMQUESTION = 76;

  private static final int LAYOUT_LISTITEMFORMREGISTERED = 77;

  private static final int LAYOUT_LISTITEMGIFT = 78;

  private static final int LAYOUT_LISTITEMGIFT2 = 79;

  private static final int LAYOUT_LISTITEMGIFTCREATED = 80;

  private static final int LAYOUT_LISTITEMGIFTREGISTER = 81;

  private static final int LAYOUT_LISTITEMGIFTREGISTER2 = 82;

  private static final int LAYOUT_LISTITEMHELP = 83;

  private static final int LAYOUT_LISTITEMHOME = 84;

  private static final int LAYOUT_LISTITEMIMAGEMOTEL = 85;

  private static final int LAYOUT_LISTITEMJOBAPPLY = 86;

  private static final int LAYOUT_LISTITEMMESSAGE = 87;

  private static final int LAYOUT_LISTITEMMOTELIMAGE = 88;

  private static final int LAYOUT_LISTITEMMOTELINFO = 89;

  private static final int LAYOUT_LISTITEMNOTE = 90;

  private static final int LAYOUT_LISTITEMRECEIVEDGIFT = 91;

  private static final int LAYOUT_LISTITEMRUNRESULT = 92;

  private static final int LAYOUT_LISTITEMRUNNINGDATA = 93;

  private static final int LAYOUT_LISTITEMSCHEDULE = 94;

  private static final int LAYOUT_LISTITEMSCHOLARSHIP = 95;

  private static final int LAYOUT_LISTITEMSCHOLARSHIPAPPLIED = 96;

  private static final int LAYOUT_LISTITEMSTUDENT = 97;

  private static final int LAYOUT_LISTITEMSTUDENT2 = 98;

  private static final int LAYOUT_LISTITEMSTUDENTCRITERIA = 99;

  private static final int LAYOUT_LISTITEMSTUDENTCRITERIAGROUPS = 100;

  private static final int LAYOUT_LISTITEMSUBJECT = 101;

  private static final int LAYOUT_LISTITEMTUTORIAL = 102;

  private static final int LAYOUT_LISTITEMUSERCHECKINACTIVITY = 103;

  private static final int LAYOUT_LISTITEMUSERCRITERIA = 104;

  private static final int LAYOUT_LISTJOBAPPLYFRAGMENT = 105;

  private static final int LAYOUT_LISTJOBSFRAGMENT = 106;

  private static final int LAYOUT_LISTREGISTERFRAGMENT = 107;

  private static final int LAYOUT_LISTRUNRESULTITEM = 108;

  private static final int LAYOUT_LISTSCHOLARSHIPAPPLIEDFRAGMENT = 109;

  private static final int LAYOUT_LISTSCHOLARSHIPSFRAGMENT = 110;

  private static final int LAYOUT_LISTSTUDENTFRAGMENT = 111;

  private static final int LAYOUT_LOADINGACTIONSTATE = 112;

  private static final int LAYOUT_LOADINGSTATE = 113;

  private static final int LAYOUT_MAPDIALOG = 114;

  private static final int LAYOUT_MOTELINFOFRAGMENT = 115;

  private static final int LAYOUT_MOTELREGISTRATIONITEM = 116;

  private static final int LAYOUT_NOTESFRAGMENT = 117;

  private static final int LAYOUT_PICKLOCATIONFRAGMENT = 118;

  private static final int LAYOUT_QRSTUDENTFRAGMENT = 119;

  private static final int LAYOUT_RECEIVERADDRESSFRAGMENT = 120;

  private static final int LAYOUT_REGISTFORMFRAGMENT = 121;

  private static final int LAYOUT_REGISTGIFTFRAGMENT = 122;

  private static final int LAYOUT_RUNDASHBOARDFRAGMENT = 123;

  private static final int LAYOUT_RUNFRAGMENT = 124;

  private static final int LAYOUT_RUNNINGDATAFRAGMENT = 125;

  private static final int LAYOUT_RUNNINGFRAGMENT = 126;

  private static final int LAYOUT_SCHOLARSHIPDETAILFRAGMENT = 127;

  private static final int LAYOUT_SEARCHMOTELFRAGMENT = 128;

  private static final int LAYOUT_STUDENTINFOFRAGMENT = 129;

  private static final int LAYOUT_TACCOUNTFRAGMENT = 130;

  private static final int LAYOUT_TACTIVITYINFOFRAGMENT = 131;

  private static final int LAYOUT_TCHANGEPASSWORDFRAGMENT = 132;

  private static final int LAYOUT_TCREATEGIFTFRAGMENT = 133;

  private static final int LAYOUT_TEDITFORMFRAGMENT = 134;

  private static final int LAYOUT_TFORMDETAILFRAGMENT = 135;

  private static final int LAYOUT_TFORMREGISTEREDFRAGMENT = 136;

  private static final int LAYOUT_TGIFTFRAGMENT = 137;

  private static final int LAYOUT_TGIFTGIVENFRAGMENT = 138;

  private static final int LAYOUT_TGIFTINFOFRAGMENT = 139;

  private static final int LAYOUT_THOME2FRAGMENT = 140;

  private static final int LAYOUT_THOMEFRAGMENT = 141;

  private static final int LAYOUT_TJOBDETAILFRAGMENT = 142;

  private static final int LAYOUT_TLISTACTIVITIESFRAGMENT = 143;

  private static final int LAYOUT_TLISTFORMFRAGMENT = 144;

  private static final int LAYOUT_TLISTFORMREGISTEREDFRAGMENT = 145;

  private static final int LAYOUT_TLISTJOBSFRAGMENT = 146;

  private static final int LAYOUT_TLISTNOTIFICATIONSFRAGMENT = 147;

  private static final int LAYOUT_TLISTREGISTERFRAGMENT = 148;

  private static final int LAYOUT_TLISTSCHOLARSHIPSFRAGMENT = 149;

  private static final int LAYOUT_TREGISTERFORMFRAGMENT = 150;

  private static final int LAYOUT_TSCHOLARSHIPDETAILFRAGMENT = 151;

  private static final int LAYOUT_TSTUDENTNOTEFRAGMENT = 152;

  private static final int LAYOUT_TEACHERINFOFRAGMENT = 153;

  private static final int LAYOUT_TEACHERMARKFRAGMENT = 154;

  private static final int LAYOUT_TIMETABLEFRAGMENT = 155;

  private static final int LAYOUT_TRAININGPOINTFRAGMENT = 156;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(156);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.account_fragment, LAYOUT_ACCOUNTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.activity_teacher, LAYOUT_ACTIVITYTEACHER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.add_new_address_fragment, LAYOUT_ADDNEWADDRESSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.apply_job_fragment, LAYOUT_APPLYJOBFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.choose_delivery_type_fragment, LAYOUT_CHOOSEDELIVERYTYPEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.choose_reciver_address_fragment, LAYOUT_CHOOSERECIVERADDRESSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.create_gift_fragment, LAYOUT_CREATEGIFTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.criteria_fragment, LAYOUT_CRITERIAFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.edit_form_fragment, LAYOUT_EDITFORMFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.error_token, LAYOUT_ERRORTOKEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.form_detail_fragment, LAYOUT_FORMDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.form_registered_detail_fragment, LAYOUT_FORMREGISTEREDDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_activity_detail_by_user_unit, LAYOUT_FRAGMENTACTIVITYDETAILBYUSERUNIT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_add_motel_info, LAYOUT_FRAGMENTADDMOTELINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_add_motel_info2, LAYOUT_FRAGMENTADDMOTELINFO2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_change_password, LAYOUT_FRAGMENTCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_check_otp_lost_password, LAYOUT_FRAGMENTCHECKOTPLOSTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_gift_receive, LAYOUT_FRAGMENTGIFTRECEIVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_image_motel, LAYOUT_FRAGMENTIMAGEMOTEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_list_motel_results, LAYOUT_FRAGMENTLISTMOTELRESULTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_lost_password, LAYOUT_FRAGMENTLOSTPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_message_list, LAYOUT_FRAGMENTMESSAGELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_more_job, LAYOUT_FRAGMENTMOREJOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_motel_registration_complete, LAYOUT_FRAGMENTMOTELREGISTRATIONCOMPLETE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_motel_registration_info, LAYOUT_FRAGMENTMOTELREGISTRATIONINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_motel_registration_list, LAYOUT_FRAGMENTMOTELREGISTRATIONLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_motel_registration_processing, LAYOUT_FRAGMENTMOTELREGISTRATIONPROCESSING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_pick_motel_location, LAYOUT_FRAGMENTPICKMOTELLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_pick_register_motel_location, LAYOUT_FRAGMENTPICKREGISTERMOTELLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_register_to_find_motel, LAYOUT_FRAGMENTREGISTERTOFINDMOTEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_schedule, LAYOUT_FRAGMENTSCHEDULE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_student_list2, LAYOUT_FRAGMENTSTUDENTLIST2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_t_add_new_address, LAYOUT_FRAGMENTTADDNEWADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_t_apply_gift, LAYOUT_FRAGMENTTAPPLYGIFT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_t_gift_received, LAYOUT_FRAGMENTTGIFTRECEIVED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_t_image_motel, LAYOUT_FRAGMENTTIMAGEMOTEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_t_list_address, LAYOUT_FRAGMENTTLISTADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_t_more_job, LAYOUT_FRAGMENTTMOREJOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_t_motel_info, LAYOUT_FRAGMENTTMOTELINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_t_pick_location, LAYOUT_FRAGMENTTPICKLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_t_receiver_address, LAYOUT_FRAGMENTTRECEIVERADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_t_search_motel, LAYOUT_FRAGMENTTSEARCHMOTEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_t_tutor, LAYOUT_FRAGMENTTTUTOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_tutor, LAYOUT_FRAGMENTTUTOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_user_check_in_activity, LAYOUT_FRAGMENTUSERCHECKINACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.fragment_user_info, LAYOUT_FRAGMENTUSERINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.gift_fragment, LAYOUT_GIFTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.gift_given_fragment, LAYOUT_GIFTGIVENFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.gift_info_fragment, LAYOUT_GIFTINFOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.help_fragment, LAYOUT_HELPFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.home2_fragment, LAYOUT_HOME2FRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.home_fragment, LAYOUT_HOMEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.item_list_job, LAYOUT_ITEMLISTJOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.job_detail_fragment, LAYOUT_JOBDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.layout_empty_data, LAYOUT_LAYOUTEMPTYDATA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.layout_loading, LAYOUT_LAYOUTLOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_activities_of_student_fragment, LAYOUT_LISTACTIVITIESOFSTUDENTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_activity_fragment, LAYOUT_LISTACTIVITYFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_address_fragment, LAYOUT_LISTADDRESSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_forms_fragment, LAYOUT_LISTFORMSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_forms_registered_fragment, LAYOUT_LISTFORMSREGISTEREDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_activity, LAYOUT_LISTITEMACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_activity_group_by_update_activity, LAYOUT_LISTITEMACTIVITYGROUPBYUPDATEACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_activity_group_by_update_sv_group, LAYOUT_LISTITEMACTIVITYGROUPBYUPDATESVGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_address, LAYOUT_LISTITEMADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_address_picker, LAYOUT_LISTITEMADDRESSPICKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_count_step, LAYOUT_LISTITEMCOUNTSTEP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_criteria_activity, LAYOUT_LISTITEMCRITERIAACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_criteria_groups, LAYOUT_LISTITEMCRITERIAGROUPS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_day_of_week, LAYOUT_LISTITEMDAYOFWEEK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_event, LAYOUT_LISTITEMEVENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_form, LAYOUT_LISTITEMFORM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_form_question, LAYOUT_LISTITEMFORMQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_form_registered, LAYOUT_LISTITEMFORMREGISTERED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_gift, LAYOUT_LISTITEMGIFT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_gift_2, LAYOUT_LISTITEMGIFT2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_gift_created, LAYOUT_LISTITEMGIFTCREATED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_gift_register, LAYOUT_LISTITEMGIFTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_gift_register_2, LAYOUT_LISTITEMGIFTREGISTER2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_help, LAYOUT_LISTITEMHELP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_home, LAYOUT_LISTITEMHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_image_motel, LAYOUT_LISTITEMIMAGEMOTEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_job_apply, LAYOUT_LISTITEMJOBAPPLY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_message, LAYOUT_LISTITEMMESSAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_motel_image, LAYOUT_LISTITEMMOTELIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_motel_info, LAYOUT_LISTITEMMOTELINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_note, LAYOUT_LISTITEMNOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_received_gift, LAYOUT_LISTITEMRECEIVEDGIFT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_run_result, LAYOUT_LISTITEMRUNRESULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_running_data, LAYOUT_LISTITEMRUNNINGDATA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_schedule, LAYOUT_LISTITEMSCHEDULE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_scholarship, LAYOUT_LISTITEMSCHOLARSHIP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_scholarship_applied, LAYOUT_LISTITEMSCHOLARSHIPAPPLIED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_student, LAYOUT_LISTITEMSTUDENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_student2, LAYOUT_LISTITEMSTUDENT2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_student_criteria, LAYOUT_LISTITEMSTUDENTCRITERIA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_student_criteria_groups, LAYOUT_LISTITEMSTUDENTCRITERIAGROUPS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_subject, LAYOUT_LISTITEMSUBJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_tutorial, LAYOUT_LISTITEMTUTORIAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_user_check_in_activity, LAYOUT_LISTITEMUSERCHECKINACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_item_user_criteria, LAYOUT_LISTITEMUSERCRITERIA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_job_apply_fragment, LAYOUT_LISTJOBAPPLYFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_jobs_fragment, LAYOUT_LISTJOBSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_register_fragment, LAYOUT_LISTREGISTERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_run_result_item, LAYOUT_LISTRUNRESULTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_scholar_ship_applied_fragment, LAYOUT_LISTSCHOLARSHIPAPPLIEDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_scholar_ships_fragment, LAYOUT_LISTSCHOLARSHIPSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.list_student_fragment, LAYOUT_LISTSTUDENTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.loading_action_state, LAYOUT_LOADINGACTIONSTATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.loading_state, LAYOUT_LOADINGSTATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.map_dialog, LAYOUT_MAPDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.motel_info_fragment, LAYOUT_MOTELINFOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.motel_registration_item, LAYOUT_MOTELREGISTRATIONITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.notes_fragment, LAYOUT_NOTESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.pick_location_fragment, LAYOUT_PICKLOCATIONFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.qr_student_fragment, LAYOUT_QRSTUDENTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.receiver_address_fragment, LAYOUT_RECEIVERADDRESSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.regist_form_fragment, LAYOUT_REGISTFORMFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.regist_gift_fragment, LAYOUT_REGISTGIFTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.run_dashboard_fragment, LAYOUT_RUNDASHBOARDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.run_fragment, LAYOUT_RUNFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.running_data_fragment, LAYOUT_RUNNINGDATAFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.running_fragment, LAYOUT_RUNNINGFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.scholar_ship_detail_fragment, LAYOUT_SCHOLARSHIPDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.search_motel_fragment, LAYOUT_SEARCHMOTELFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.student_info_fragment, LAYOUT_STUDENTINFOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_account_fragment, LAYOUT_TACCOUNTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_activity_info_fragment, LAYOUT_TACTIVITYINFOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_change_password_fragment, LAYOUT_TCHANGEPASSWORDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_create_gift_fragment, LAYOUT_TCREATEGIFTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_edit_form_fragment, LAYOUT_TEDITFORMFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_form_detail_fragment, LAYOUT_TFORMDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_form_registered_fragment, LAYOUT_TFORMREGISTEREDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_gift_fragment, LAYOUT_TGIFTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_gift_given_fragment, LAYOUT_TGIFTGIVENFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_gift_info_fragment, LAYOUT_TGIFTINFOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_home2_fragment, LAYOUT_THOME2FRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_home_fragment, LAYOUT_THOMEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_job_detail_fragment, LAYOUT_TJOBDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_list_activities_fragment, LAYOUT_TLISTACTIVITIESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_list_form_fragment, LAYOUT_TLISTFORMFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_list_form_registered_fragment, LAYOUT_TLISTFORMREGISTEREDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_list_jobs_fragment, LAYOUT_TLISTJOBSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_list_notifications_fragment, LAYOUT_TLISTNOTIFICATIONSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_list_register_fragment, LAYOUT_TLISTREGISTERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_list_scholar_ships_fragment, LAYOUT_TLISTSCHOLARSHIPSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_register_form_fragment, LAYOUT_TREGISTERFORMFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_scholar_ship_detail_fragment, LAYOUT_TSCHOLARSHIPDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.t_student_note_fragment, LAYOUT_TSTUDENTNOTEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.teacher_info_fragment, LAYOUT_TEACHERINFOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.teacher_mark_fragment, LAYOUT_TEACHERMARKFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.time_table_fragment, LAYOUT_TIMETABLEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.emglab.qlsv.R.layout.training_point_fragment, LAYOUT_TRAININGPOINTFRAGMENT);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACCOUNTFRAGMENT: {
        if ("layout/account_fragment_0".equals(tag)) {
          return new AccountFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for account_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMAIN: {
        if ("layout/activity_main_0".equals(tag)) {
          return new ActivityMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTEACHER: {
        if ("layout/activity_teacher_0".equals(tag)) {
          return new ActivityTeacherBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_teacher is invalid. Received: " + tag);
      }
      case  LAYOUT_ADDNEWADDRESSFRAGMENT: {
        if ("layout/add_new_address_fragment_0".equals(tag)) {
          return new AddNewAddressFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for add_new_address_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_APPLYJOBFRAGMENT: {
        if ("layout/apply_job_fragment_0".equals(tag)) {
          return new ApplyJobFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for apply_job_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CHOOSEDELIVERYTYPEFRAGMENT: {
        if ("layout/choose_delivery_type_fragment_0".equals(tag)) {
          return new ChooseDeliveryTypeFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for choose_delivery_type_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CHOOSERECIVERADDRESSFRAGMENT: {
        if ("layout/choose_reciver_address_fragment_0".equals(tag)) {
          return new ChooseReciverAddressFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for choose_reciver_address_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CREATEGIFTFRAGMENT: {
        if ("layout/create_gift_fragment_0".equals(tag)) {
          return new CreateGiftFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for create_gift_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CRITERIAFRAGMENT: {
        if ("layout/criteria_fragment_0".equals(tag)) {
          return new CriteriaFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for criteria_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_EDITFORMFRAGMENT: {
        if ("layout/edit_form_fragment_0".equals(tag)) {
          return new EditFormFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for edit_form_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ERRORTOKEN: {
        if ("layout/error_token_0".equals(tag)) {
          return new ErrorTokenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for error_token is invalid. Received: " + tag);
      }
      case  LAYOUT_FORMDETAILFRAGMENT: {
        if ("layout/form_detail_fragment_0".equals(tag)) {
          return new FormDetailFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for form_detail_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FORMREGISTEREDDETAILFRAGMENT: {
        if ("layout/form_registered_detail_fragment_0".equals(tag)) {
          return new FormRegisteredDetailFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for form_registered_detail_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTACTIVITYDETAILBYUSERUNIT: {
        if ("layout/fragment_activity_detail_by_user_unit_0".equals(tag)) {
          return new FragmentActivityDetailByUserUnitBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_activity_detail_by_user_unit is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDMOTELINFO: {
        if ("layout/fragment_add_motel_info_0".equals(tag)) {
          return new FragmentAddMotelInfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_motel_info is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTADDMOTELINFO2: {
        if ("layout/fragment_add_motel_info2_0".equals(tag)) {
          return new FragmentAddMotelInfo2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_add_motel_info2 is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCHANGEPASSWORD: {
        if ("layout/fragment_change_password_0".equals(tag)) {
          return new FragmentChangePasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_change_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCHECKOTPLOSTPASSWORD: {
        if ("layout/fragment_check_otp_lost_password_0".equals(tag)) {
          return new FragmentCheckOtpLostPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_check_otp_lost_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTGIFTRECEIVE: {
        if ("layout/fragment_gift_receive_0".equals(tag)) {
          return new FragmentGiftReceiveBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_gift_receive is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTIMAGEMOTEL: {
        if ("layout/fragment_image_motel_0".equals(tag)) {
          return new FragmentImageMotelBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_image_motel is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLISTMOTELRESULTS: {
        if ("layout/fragment_list_motel_results_0".equals(tag)) {
          return new FragmentListMotelResultsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_list_motel_results is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOGIN: {
        if ("layout/fragment_login_0".equals(tag)) {
          return new FragmentLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOSTPASSWORD: {
        if ("layout/fragment_lost_password_0".equals(tag)) {
          return new FragmentLostPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_lost_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMESSAGELIST: {
        if ("layout/fragment_message_list_0".equals(tag)) {
          return new FragmentMessageListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_message_list is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMOREJOB: {
        if ("layout/fragment_more_job_0".equals(tag)) {
          return new FragmentMoreJobBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_more_job is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMOTELREGISTRATIONCOMPLETE: {
        if ("layout/fragment_motel_registration_complete_0".equals(tag)) {
          return new FragmentMotelRegistrationCompleteBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_motel_registration_complete is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMOTELREGISTRATIONINFO: {
        if ("layout/fragment_motel_registration_info_0".equals(tag)) {
          return new FragmentMotelRegistrationInfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_motel_registration_info is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMOTELREGISTRATIONLIST: {
        if ("layout/fragment_motel_registration_list_0".equals(tag)) {
          return new FragmentMotelRegistrationListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_motel_registration_list is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMOTELREGISTRATIONPROCESSING: {
        if ("layout/fragment_motel_registration_processing_0".equals(tag)) {
          return new FragmentMotelRegistrationProcessingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_motel_registration_processing is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPICKMOTELLOCATION: {
        if ("layout/fragment_pick_motel_location_0".equals(tag)) {
          return new FragmentPickMotelLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_pick_motel_location is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPICKREGISTERMOTELLOCATION: {
        if ("layout/fragment_pick_register_motel_location_0".equals(tag)) {
          return new FragmentPickRegisterMotelLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_pick_register_motel_location is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTER: {
        if ("layout/fragment_register_0".equals(tag)) {
          return new FragmentRegisterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTERTOFINDMOTEL: {
        if ("layout/fragment_register_to_find_motel_0".equals(tag)) {
          return new FragmentRegisterToFindMotelBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_register_to_find_motel is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSCHEDULE: {
        if ("layout/fragment_schedule_0".equals(tag)) {
          return new FragmentScheduleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_schedule is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSTUDENTLIST2: {
        if ("layout/fragment_student_list2_0".equals(tag)) {
          return new FragmentStudentList2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_student_list2 is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTADDNEWADDRESS: {
        if ("layout/fragment_t_add_new_address_0".equals(tag)) {
          return new FragmentTAddNewAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_t_add_new_address is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTAPPLYGIFT: {
        if ("layout/fragment_t_apply_gift_0".equals(tag)) {
          return new FragmentTApplyGiftBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_t_apply_gift is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTGIFTRECEIVED: {
        if ("layout/fragment_t_gift_received_0".equals(tag)) {
          return new FragmentTGiftReceivedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_t_gift_received is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTIMAGEMOTEL: {
        if ("layout/fragment_t_image_motel_0".equals(tag)) {
          return new FragmentTImageMotelBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_t_image_motel is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTLISTADDRESS: {
        if ("layout/fragment_t_list_address_0".equals(tag)) {
          return new FragmentTListAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_t_list_address is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTMOREJOB: {
        if ("layout/fragment_t_more_job_0".equals(tag)) {
          return new FragmentTMoreJobBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_t_more_job is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTMOTELINFO: {
        if ("layout/fragment_t_motel_info_0".equals(tag)) {
          return new FragmentTMotelInfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_t_motel_info is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTPICKLOCATION: {
        if ("layout/fragment_t_pick_location_0".equals(tag)) {
          return new FragmentTPickLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_t_pick_location is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTRECEIVERADDRESS: {
        if ("layout/fragment_t_receiver_address_0".equals(tag)) {
          return new FragmentTReceiverAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_t_receiver_address is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTSEARCHMOTEL: {
        if ("layout/fragment_t_search_motel_0".equals(tag)) {
          return new FragmentTSearchMotelBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_t_search_motel is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTTUTOR: {
        if ("layout/fragment_t_tutor_0".equals(tag)) {
          return new FragmentTTutorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_t_tutor is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTTUTOR: {
        if ("layout/fragment_tutor_0".equals(tag)) {
          return new FragmentTutorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_tutor is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTUSERCHECKINACTIVITY: {
        if ("layout/fragment_user_check_in_activity_0".equals(tag)) {
          return new FragmentUserCheckInActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_user_check_in_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTUSERINFO: {
        if ("layout/fragment_user_info_0".equals(tag)) {
          return new FragmentUserInfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_user_info is invalid. Received: " + tag);
      }
      case  LAYOUT_GIFTFRAGMENT: {
        if ("layout/gift_fragment_0".equals(tag)) {
          return new GiftFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for gift_fragment is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_GIFTGIVENFRAGMENT: {
        if ("layout/gift_given_fragment_0".equals(tag)) {
          return new GiftGivenFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for gift_given_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_GIFTINFOFRAGMENT: {
        if ("layout/gift_info_fragment_0".equals(tag)) {
          return new GiftInfoFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for gift_info_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_HELPFRAGMENT: {
        if ("layout/help_fragment_0".equals(tag)) {
          return new HelpFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for help_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_HOME2FRAGMENT: {
        if ("layout/home2_fragment_0".equals(tag)) {
          return new Home2FragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home2_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_HOMEFRAGMENT: {
        if ("layout/home_fragment_0".equals(tag)) {
          return new HomeFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for home_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMLISTJOB: {
        if ("layout/item_list_job_0".equals(tag)) {
          return new ItemListJobBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_list_job is invalid. Received: " + tag);
      }
      case  LAYOUT_JOBDETAILFRAGMENT: {
        if ("layout/job_detail_fragment_0".equals(tag)) {
          return new JobDetailFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for job_detail_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTEMPTYDATA: {
        if ("layout/layout_empty_data_0".equals(tag)) {
          return new LayoutEmptyDataBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_empty_data is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTLOADING: {
        if ("layout/layout_loading_0".equals(tag)) {
          return new LayoutLoadingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_loading is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTACTIVITIESOFSTUDENTFRAGMENT: {
        if ("layout/list_activities_of_student_fragment_0".equals(tag)) {
          return new ListActivitiesOfStudentFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_activities_of_student_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTACTIVITYFRAGMENT: {
        if ("layout/list_activity_fragment_0".equals(tag)) {
          return new ListActivityFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_activity_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTADDRESSFRAGMENT: {
        if ("layout/list_address_fragment_0".equals(tag)) {
          return new ListAddressFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_address_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTFORMSFRAGMENT: {
        if ("layout/list_forms_fragment_0".equals(tag)) {
          return new ListFormsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_forms_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTFORMSREGISTEREDFRAGMENT: {
        if ("layout/list_forms_registered_fragment_0".equals(tag)) {
          return new ListFormsRegisteredFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_forms_registered_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMACTIVITY: {
        if ("layout/list_item_activity_0".equals(tag)) {
          return new ListItemActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMACTIVITYGROUPBYUPDATEACTIVITY: {
        if ("layout/list_item_activity_group_by_update_activity_0".equals(tag)) {
          return new ListItemActivityGroupByUpdateActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_activity_group_by_update_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMACTIVITYGROUPBYUPDATESVGROUP: {
        if ("layout/list_item_activity_group_by_update_sv_group_0".equals(tag)) {
          return new ListItemActivityGroupByUpdateSvGroupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_activity_group_by_update_sv_group is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMADDRESS: {
        if ("layout/list_item_address_0".equals(tag)) {
          return new ListItemAddressBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_address is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMADDRESSPICKER: {
        if ("layout/list_item_address_picker_0".equals(tag)) {
          return new ListItemAddressPickerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_address_picker is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMCOUNTSTEP: {
        if ("layout/list_item_count_step_0".equals(tag)) {
          return new ListItemCountStepBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_count_step is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMCRITERIAACTIVITY: {
        if ("layout/list_item_criteria_activity_0".equals(tag)) {
          return new ListItemCriteriaActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_criteria_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMCRITERIAGROUPS: {
        if ("layout/list_item_criteria_groups_0".equals(tag)) {
          return new ListItemCriteriaGroupsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_criteria_groups is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMDAYOFWEEK: {
        if ("layout/list_item_day_of_week_0".equals(tag)) {
          return new ListItemDayOfWeekBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_day_of_week is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMEVENT: {
        if ("layout/list_item_event_0".equals(tag)) {
          return new ListItemEventBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_event is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMFORM: {
        if ("layout/list_item_form_0".equals(tag)) {
          return new ListItemFormBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_form is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMFORMQUESTION: {
        if ("layout/list_item_form_question_0".equals(tag)) {
          return new ListItemFormQuestionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_form_question is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMFORMREGISTERED: {
        if ("layout/list_item_form_registered_0".equals(tag)) {
          return new ListItemFormRegisteredBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_form_registered is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMGIFT: {
        if ("layout/list_item_gift_0".equals(tag)) {
          return new ListItemGiftBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_gift is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMGIFT2: {
        if ("layout/list_item_gift_2_0".equals(tag)) {
          return new ListItemGift2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_gift_2 is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMGIFTCREATED: {
        if ("layout/list_item_gift_created_0".equals(tag)) {
          return new ListItemGiftCreatedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_gift_created is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMGIFTREGISTER: {
        if ("layout/list_item_gift_register_0".equals(tag)) {
          return new ListItemGiftRegisterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_gift_register is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMGIFTREGISTER2: {
        if ("layout/list_item_gift_register_2_0".equals(tag)) {
          return new ListItemGiftRegister2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_gift_register_2 is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMHELP: {
        if ("layout/list_item_help_0".equals(tag)) {
          return new ListItemHelpBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_help is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMHOME: {
        if ("layout/list_item_home_0".equals(tag)) {
          return new ListItemHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_home is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMIMAGEMOTEL: {
        if ("layout/list_item_image_motel_0".equals(tag)) {
          return new ListItemImageMotelBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_image_motel is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMJOBAPPLY: {
        if ("layout/list_item_job_apply_0".equals(tag)) {
          return new ListItemJobApplyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_job_apply is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMMESSAGE: {
        if ("layout/list_item_message_0".equals(tag)) {
          return new ListItemMessageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_message is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMMOTELIMAGE: {
        if ("layout/list_item_motel_image_0".equals(tag)) {
          return new ListItemMotelImageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_motel_image is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMMOTELINFO: {
        if ("layout/list_item_motel_info_0".equals(tag)) {
          return new ListItemMotelInfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_motel_info is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMNOTE: {
        if ("layout/list_item_note_0".equals(tag)) {
          return new ListItemNoteBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_note is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMRECEIVEDGIFT: {
        if ("layout/list_item_received_gift_0".equals(tag)) {
          return new ListItemReceivedGiftBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_received_gift is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMRUNRESULT: {
        if ("layout/list_item_run_result_0".equals(tag)) {
          return new ListItemRunResultBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_run_result is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMRUNNINGDATA: {
        if ("layout/list_item_running_data_0".equals(tag)) {
          return new ListItemRunningDataBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_running_data is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMSCHEDULE: {
        if ("layout/list_item_schedule_0".equals(tag)) {
          return new ListItemScheduleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_schedule is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMSCHOLARSHIP: {
        if ("layout/list_item_scholarship_0".equals(tag)) {
          return new ListItemScholarshipBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_scholarship is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMSCHOLARSHIPAPPLIED: {
        if ("layout/list_item_scholarship_applied_0".equals(tag)) {
          return new ListItemScholarshipAppliedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_scholarship_applied is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMSTUDENT: {
        if ("layout/list_item_student_0".equals(tag)) {
          return new ListItemStudentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_student is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMSTUDENT2: {
        if ("layout/list_item_student2_0".equals(tag)) {
          return new ListItemStudent2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_student2 is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMSTUDENTCRITERIA: {
        if ("layout/list_item_student_criteria_0".equals(tag)) {
          return new ListItemStudentCriteriaBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_student_criteria is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMSTUDENTCRITERIAGROUPS: {
        if ("layout/list_item_student_criteria_groups_0".equals(tag)) {
          return new ListItemStudentCriteriaGroupsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_student_criteria_groups is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding2(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_LISTITEMSUBJECT: {
        if ("layout/list_item_subject_0".equals(tag)) {
          return new ListItemSubjectBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_subject is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMTUTORIAL: {
        if ("layout/list_item_tutorial_0".equals(tag)) {
          return new ListItemTutorialBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_tutorial is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMUSERCHECKINACTIVITY: {
        if ("layout/list_item_user_check_in_activity_0".equals(tag)) {
          return new ListItemUserCheckInActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_user_check_in_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMUSERCRITERIA: {
        if ("layout/list_item_user_criteria_0".equals(tag)) {
          return new ListItemUserCriteriaBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_user_criteria is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTJOBAPPLYFRAGMENT: {
        if ("layout/list_job_apply_fragment_0".equals(tag)) {
          return new ListJobApplyFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_job_apply_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTJOBSFRAGMENT: {
        if ("layout/list_jobs_fragment_0".equals(tag)) {
          return new ListJobsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_jobs_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTREGISTERFRAGMENT: {
        if ("layout/list_register_fragment_0".equals(tag)) {
          return new ListRegisterFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_register_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTRUNRESULTITEM: {
        if ("layout/list_run_result_item_0".equals(tag)) {
          return new ListRunResultItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_run_result_item is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTSCHOLARSHIPAPPLIEDFRAGMENT: {
        if ("layout/list_scholar_ship_applied_fragment_0".equals(tag)) {
          return new ListScholarShipAppliedFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_scholar_ship_applied_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTSCHOLARSHIPSFRAGMENT: {
        if ("layout/list_scholar_ships_fragment_0".equals(tag)) {
          return new ListScholarShipsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_scholar_ships_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTSTUDENTFRAGMENT: {
        if ("layout/list_student_fragment_0".equals(tag)) {
          return new ListStudentFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_student_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LOADINGACTIONSTATE: {
        if ("layout/loading_action_state_0".equals(tag)) {
          return new LoadingActionStateBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for loading_action_state is invalid. Received: " + tag);
      }
      case  LAYOUT_LOADINGSTATE: {
        if ("layout/loading_state_0".equals(tag)) {
          return new LoadingStateBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for loading_state is invalid. Received: " + tag);
      }
      case  LAYOUT_MAPDIALOG: {
        if ("layout/map_dialog_0".equals(tag)) {
          return new MapDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for map_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_MOTELINFOFRAGMENT: {
        if ("layout/motel_info_fragment_0".equals(tag)) {
          return new MotelInfoFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for motel_info_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_MOTELREGISTRATIONITEM: {
        if ("layout/motel_registration_item_0".equals(tag)) {
          return new MotelRegistrationItemBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for motel_registration_item is invalid. Received: " + tag);
      }
      case  LAYOUT_NOTESFRAGMENT: {
        if ("layout/notes_fragment_0".equals(tag)) {
          return new NotesFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for notes_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_PICKLOCATIONFRAGMENT: {
        if ("layout/pick_location_fragment_0".equals(tag)) {
          return new PickLocationFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for pick_location_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_QRSTUDENTFRAGMENT: {
        if ("layout/qr_student_fragment_0".equals(tag)) {
          return new QrStudentFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for qr_student_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_RECEIVERADDRESSFRAGMENT: {
        if ("layout/receiver_address_fragment_0".equals(tag)) {
          return new ReceiverAddressFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for receiver_address_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_REGISTFORMFRAGMENT: {
        if ("layout/regist_form_fragment_0".equals(tag)) {
          return new RegistFormFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for regist_form_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_REGISTGIFTFRAGMENT: {
        if ("layout/regist_gift_fragment_0".equals(tag)) {
          return new RegistGiftFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for regist_gift_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_RUNDASHBOARDFRAGMENT: {
        if ("layout/run_dashboard_fragment_0".equals(tag)) {
          return new RunDashboardFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for run_dashboard_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_RUNFRAGMENT: {
        if ("layout/run_fragment_0".equals(tag)) {
          return new RunFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for run_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_RUNNINGDATAFRAGMENT: {
        if ("layout/running_data_fragment_0".equals(tag)) {
          return new RunningDataFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for running_data_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_RUNNINGFRAGMENT: {
        if ("layout/running_fragment_0".equals(tag)) {
          return new RunningFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for running_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SCHOLARSHIPDETAILFRAGMENT: {
        if ("layout/scholar_ship_detail_fragment_0".equals(tag)) {
          return new ScholarShipDetailFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for scholar_ship_detail_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SEARCHMOTELFRAGMENT: {
        if ("layout/search_motel_fragment_0".equals(tag)) {
          return new SearchMotelFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for search_motel_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_STUDENTINFOFRAGMENT: {
        if ("layout/student_info_fragment_0".equals(tag)) {
          return new StudentInfoFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for student_info_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TACCOUNTFRAGMENT: {
        if ("layout/t_account_fragment_0".equals(tag)) {
          return new TAccountFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_account_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TACTIVITYINFOFRAGMENT: {
        if ("layout/t_activity_info_fragment_0".equals(tag)) {
          return new TActivityInfoFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_activity_info_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TCHANGEPASSWORDFRAGMENT: {
        if ("layout/t_change_password_fragment_0".equals(tag)) {
          return new TChangePasswordFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_change_password_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TCREATEGIFTFRAGMENT: {
        if ("layout/t_create_gift_fragment_0".equals(tag)) {
          return new TCreateGiftFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_create_gift_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TEDITFORMFRAGMENT: {
        if ("layout/t_edit_form_fragment_0".equals(tag)) {
          return new TEditFormFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_edit_form_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TFORMDETAILFRAGMENT: {
        if ("layout/t_form_detail_fragment_0".equals(tag)) {
          return new TFormDetailFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_form_detail_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TFORMREGISTEREDFRAGMENT: {
        if ("layout/t_form_registered_fragment_0".equals(tag)) {
          return new TFormRegisteredFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_form_registered_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TGIFTFRAGMENT: {
        if ("layout/t_gift_fragment_0".equals(tag)) {
          return new TGiftFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_gift_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TGIFTGIVENFRAGMENT: {
        if ("layout/t_gift_given_fragment_0".equals(tag)) {
          return new TGiftGivenFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_gift_given_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TGIFTINFOFRAGMENT: {
        if ("layout/t_gift_info_fragment_0".equals(tag)) {
          return new TGiftInfoFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_gift_info_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_THOME2FRAGMENT: {
        if ("layout/t_home2_fragment_0".equals(tag)) {
          return new THome2FragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_home2_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_THOMEFRAGMENT: {
        if ("layout/t_home_fragment_0".equals(tag)) {
          return new THomeFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_home_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TJOBDETAILFRAGMENT: {
        if ("layout/t_job_detail_fragment_0".equals(tag)) {
          return new TJobDetailFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_job_detail_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TLISTACTIVITIESFRAGMENT: {
        if ("layout/t_list_activities_fragment_0".equals(tag)) {
          return new TListActivitiesFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_list_activities_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TLISTFORMFRAGMENT: {
        if ("layout/t_list_form_fragment_0".equals(tag)) {
          return new TListFormFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_list_form_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TLISTFORMREGISTEREDFRAGMENT: {
        if ("layout/t_list_form_registered_fragment_0".equals(tag)) {
          return new TListFormRegisteredFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_list_form_registered_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TLISTJOBSFRAGMENT: {
        if ("layout/t_list_jobs_fragment_0".equals(tag)) {
          return new TListJobsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_list_jobs_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TLISTNOTIFICATIONSFRAGMENT: {
        if ("layout/t_list_notifications_fragment_0".equals(tag)) {
          return new TListNotificationsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_list_notifications_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TLISTREGISTERFRAGMENT: {
        if ("layout/t_list_register_fragment_0".equals(tag)) {
          return new TListRegisterFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_list_register_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TLISTSCHOLARSHIPSFRAGMENT: {
        if ("layout/t_list_scholar_ships_fragment_0".equals(tag)) {
          return new TListScholarShipsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_list_scholar_ships_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TREGISTERFORMFRAGMENT: {
        if ("layout/t_register_form_fragment_0".equals(tag)) {
          return new TRegisterFormFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_register_form_fragment is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding3(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_TSCHOLARSHIPDETAILFRAGMENT: {
        if ("layout/t_scholar_ship_detail_fragment_0".equals(tag)) {
          return new TScholarShipDetailFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_scholar_ship_detail_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TSTUDENTNOTEFRAGMENT: {
        if ("layout/t_student_note_fragment_0".equals(tag)) {
          return new TStudentNoteFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for t_student_note_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TEACHERINFOFRAGMENT: {
        if ("layout/teacher_info_fragment_0".equals(tag)) {
          return new TeacherInfoFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for teacher_info_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TEACHERMARKFRAGMENT: {
        if ("layout/teacher_mark_fragment_0".equals(tag)) {
          return new TeacherMarkFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for teacher_mark_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TIMETABLEFRAGMENT: {
        if ("layout/time_table_fragment_0".equals(tag)) {
          return new TimeTableFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for time_table_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TRAININGPOINTFRAGMENT: {
        if ("layout/training_point_fragment_0".equals(tag)) {
          return new TrainingPointFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for training_point_fragment is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
        case 2: {
          return internalGetViewDataBinding2(component, view, localizedLayoutId, tag);
        }
        case 3: {
          return internalGetViewDataBinding3(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(79);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aName");
      sKeys.put(2, "activity");
      sKeys.put(3, "activityGroup");
      sKeys.put(4, "activityResource");
      sKeys.put(5, "activityStatic");
      sKeys.put(6, "address");
      sKeys.put(7, "assignActivityResource");
      sKeys.put(8, "callback");
      sKeys.put(9, "callback1");
      sKeys.put(10, "callback2");
      sKeys.put(11, "cancelApplyStatus");
      sKeys.put(12, "changePasswordResource");
      sKeys.put(13, "check");
      sKeys.put(14, "checkInActivityResource");
      sKeys.put(15, "checkOTPResource");
      sKeys.put(16, "clickListener");
      sKeys.put(17, "contributorsStatus");
      sKeys.put(18, "countSteps");
      sKeys.put(19, "criteriaActivityItem");
      sKeys.put(20, "criteriaGroup");
      sKeys.put(21, "criteriaType");
      sKeys.put(22, "form");
      sKeys.put(23, "getActivityStatus");
      sKeys.put(24, "getRegistersStatus");
      sKeys.put(25, "gift");
      sKeys.put(26, "giftRegister");
      sKeys.put(27, "imageMotel");
      sKeys.put(28, "imagePaths");
      sKeys.put(29, "index");
      sKeys.put(30, "job");
      sKeys.put(31, "loadPublicGiftStatus");
      sKeys.put(32, "locationName");
      sKeys.put(33, "loginResource");
      sKeys.put(34, "logoutCallback");
      sKeys.put(35, "lostPasswordResource");
      sKeys.put(36, "mActivity");
      sKeys.put(37, "message");
      sKeys.put(38, "messagesResource");
      sKeys.put(39, "motel");
      sKeys.put(40, "motelRegistraion");
      sKeys.put(41, "motelRegistration");
      sKeys.put(42, "motelRegistrationStatus");
      sKeys.put(43, "note");
      sKeys.put(44, "number");
      sKeys.put(45, "question");
      sKeys.put(46, "questionType");
      sKeys.put(47, "registerResource");
      sKeys.put(48, "resource");
      sKeys.put(49, "resource1");
      sKeys.put(50, "resource2");
      sKeys.put(51, "retryCallBack");
      sKeys.put(52, "retryCallback");
      sKeys.put(53, "runResult");
      sKeys.put(54, "runningData");
      sKeys.put(55, "schedule");
      sKeys.put(56, "scheduleStudentsResource");
      sKeys.put(57, "scholarShip");
      sKeys.put(58, "sizeList");
      sKeys.put(59, "sizeOfMessage");
      sKeys.put(60, "sizeOfScheduleStudent");
      sKeys.put(61, "status");
      sKeys.put(62, "status2");
      sKeys.put(63, "student");
      sKeys.put(64, "studentInfo");
      sKeys.put(65, "subject");
      sKeys.put(66, "title");
      sKeys.put(67, "tutorJob");
      sKeys.put(68, "tutorial");
      sKeys.put(69, "uploadImage1");
      sKeys.put(70, "uploadImage2");
      sKeys.put(71, "uploadImage3");
      sKeys.put(72, "user");
      sKeys.put(73, "userActivity");
      sKeys.put(74, "userCheckInActivity");
      sKeys.put(75, "userCheckInActivityResource");
      sKeys.put(76, "userCriteriaDetail");
      sKeys.put(77, "userResource");
      sKeys.put(78, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(156);

    static {
      sKeys.put("layout/account_fragment_0", com.emglab.qlsv.R.layout.account_fragment);
      sKeys.put("layout/activity_main_0", com.emglab.qlsv.R.layout.activity_main);
      sKeys.put("layout/activity_teacher_0", com.emglab.qlsv.R.layout.activity_teacher);
      sKeys.put("layout/add_new_address_fragment_0", com.emglab.qlsv.R.layout.add_new_address_fragment);
      sKeys.put("layout/apply_job_fragment_0", com.emglab.qlsv.R.layout.apply_job_fragment);
      sKeys.put("layout/choose_delivery_type_fragment_0", com.emglab.qlsv.R.layout.choose_delivery_type_fragment);
      sKeys.put("layout/choose_reciver_address_fragment_0", com.emglab.qlsv.R.layout.choose_reciver_address_fragment);
      sKeys.put("layout/create_gift_fragment_0", com.emglab.qlsv.R.layout.create_gift_fragment);
      sKeys.put("layout/criteria_fragment_0", com.emglab.qlsv.R.layout.criteria_fragment);
      sKeys.put("layout/edit_form_fragment_0", com.emglab.qlsv.R.layout.edit_form_fragment);
      sKeys.put("layout/error_token_0", com.emglab.qlsv.R.layout.error_token);
      sKeys.put("layout/form_detail_fragment_0", com.emglab.qlsv.R.layout.form_detail_fragment);
      sKeys.put("layout/form_registered_detail_fragment_0", com.emglab.qlsv.R.layout.form_registered_detail_fragment);
      sKeys.put("layout/fragment_activity_detail_by_user_unit_0", com.emglab.qlsv.R.layout.fragment_activity_detail_by_user_unit);
      sKeys.put("layout/fragment_add_motel_info_0", com.emglab.qlsv.R.layout.fragment_add_motel_info);
      sKeys.put("layout/fragment_add_motel_info2_0", com.emglab.qlsv.R.layout.fragment_add_motel_info2);
      sKeys.put("layout/fragment_change_password_0", com.emglab.qlsv.R.layout.fragment_change_password);
      sKeys.put("layout/fragment_check_otp_lost_password_0", com.emglab.qlsv.R.layout.fragment_check_otp_lost_password);
      sKeys.put("layout/fragment_gift_receive_0", com.emglab.qlsv.R.layout.fragment_gift_receive);
      sKeys.put("layout/fragment_image_motel_0", com.emglab.qlsv.R.layout.fragment_image_motel);
      sKeys.put("layout/fragment_list_motel_results_0", com.emglab.qlsv.R.layout.fragment_list_motel_results);
      sKeys.put("layout/fragment_login_0", com.emglab.qlsv.R.layout.fragment_login);
      sKeys.put("layout/fragment_lost_password_0", com.emglab.qlsv.R.layout.fragment_lost_password);
      sKeys.put("layout/fragment_message_list_0", com.emglab.qlsv.R.layout.fragment_message_list);
      sKeys.put("layout/fragment_more_job_0", com.emglab.qlsv.R.layout.fragment_more_job);
      sKeys.put("layout/fragment_motel_registration_complete_0", com.emglab.qlsv.R.layout.fragment_motel_registration_complete);
      sKeys.put("layout/fragment_motel_registration_info_0", com.emglab.qlsv.R.layout.fragment_motel_registration_info);
      sKeys.put("layout/fragment_motel_registration_list_0", com.emglab.qlsv.R.layout.fragment_motel_registration_list);
      sKeys.put("layout/fragment_motel_registration_processing_0", com.emglab.qlsv.R.layout.fragment_motel_registration_processing);
      sKeys.put("layout/fragment_pick_motel_location_0", com.emglab.qlsv.R.layout.fragment_pick_motel_location);
      sKeys.put("layout/fragment_pick_register_motel_location_0", com.emglab.qlsv.R.layout.fragment_pick_register_motel_location);
      sKeys.put("layout/fragment_register_0", com.emglab.qlsv.R.layout.fragment_register);
      sKeys.put("layout/fragment_register_to_find_motel_0", com.emglab.qlsv.R.layout.fragment_register_to_find_motel);
      sKeys.put("layout/fragment_schedule_0", com.emglab.qlsv.R.layout.fragment_schedule);
      sKeys.put("layout/fragment_student_list2_0", com.emglab.qlsv.R.layout.fragment_student_list2);
      sKeys.put("layout/fragment_t_add_new_address_0", com.emglab.qlsv.R.layout.fragment_t_add_new_address);
      sKeys.put("layout/fragment_t_apply_gift_0", com.emglab.qlsv.R.layout.fragment_t_apply_gift);
      sKeys.put("layout/fragment_t_gift_received_0", com.emglab.qlsv.R.layout.fragment_t_gift_received);
      sKeys.put("layout/fragment_t_image_motel_0", com.emglab.qlsv.R.layout.fragment_t_image_motel);
      sKeys.put("layout/fragment_t_list_address_0", com.emglab.qlsv.R.layout.fragment_t_list_address);
      sKeys.put("layout/fragment_t_more_job_0", com.emglab.qlsv.R.layout.fragment_t_more_job);
      sKeys.put("layout/fragment_t_motel_info_0", com.emglab.qlsv.R.layout.fragment_t_motel_info);
      sKeys.put("layout/fragment_t_pick_location_0", com.emglab.qlsv.R.layout.fragment_t_pick_location);
      sKeys.put("layout/fragment_t_receiver_address_0", com.emglab.qlsv.R.layout.fragment_t_receiver_address);
      sKeys.put("layout/fragment_t_search_motel_0", com.emglab.qlsv.R.layout.fragment_t_search_motel);
      sKeys.put("layout/fragment_t_tutor_0", com.emglab.qlsv.R.layout.fragment_t_tutor);
      sKeys.put("layout/fragment_tutor_0", com.emglab.qlsv.R.layout.fragment_tutor);
      sKeys.put("layout/fragment_user_check_in_activity_0", com.emglab.qlsv.R.layout.fragment_user_check_in_activity);
      sKeys.put("layout/fragment_user_info_0", com.emglab.qlsv.R.layout.fragment_user_info);
      sKeys.put("layout/gift_fragment_0", com.emglab.qlsv.R.layout.gift_fragment);
      sKeys.put("layout/gift_given_fragment_0", com.emglab.qlsv.R.layout.gift_given_fragment);
      sKeys.put("layout/gift_info_fragment_0", com.emglab.qlsv.R.layout.gift_info_fragment);
      sKeys.put("layout/help_fragment_0", com.emglab.qlsv.R.layout.help_fragment);
      sKeys.put("layout/home2_fragment_0", com.emglab.qlsv.R.layout.home2_fragment);
      sKeys.put("layout/home_fragment_0", com.emglab.qlsv.R.layout.home_fragment);
      sKeys.put("layout/item_list_job_0", com.emglab.qlsv.R.layout.item_list_job);
      sKeys.put("layout/job_detail_fragment_0", com.emglab.qlsv.R.layout.job_detail_fragment);
      sKeys.put("layout/layout_empty_data_0", com.emglab.qlsv.R.layout.layout_empty_data);
      sKeys.put("layout/layout_loading_0", com.emglab.qlsv.R.layout.layout_loading);
      sKeys.put("layout/list_activities_of_student_fragment_0", com.emglab.qlsv.R.layout.list_activities_of_student_fragment);
      sKeys.put("layout/list_activity_fragment_0", com.emglab.qlsv.R.layout.list_activity_fragment);
      sKeys.put("layout/list_address_fragment_0", com.emglab.qlsv.R.layout.list_address_fragment);
      sKeys.put("layout/list_forms_fragment_0", com.emglab.qlsv.R.layout.list_forms_fragment);
      sKeys.put("layout/list_forms_registered_fragment_0", com.emglab.qlsv.R.layout.list_forms_registered_fragment);
      sKeys.put("layout/list_item_activity_0", com.emglab.qlsv.R.layout.list_item_activity);
      sKeys.put("layout/list_item_activity_group_by_update_activity_0", com.emglab.qlsv.R.layout.list_item_activity_group_by_update_activity);
      sKeys.put("layout/list_item_activity_group_by_update_sv_group_0", com.emglab.qlsv.R.layout.list_item_activity_group_by_update_sv_group);
      sKeys.put("layout/list_item_address_0", com.emglab.qlsv.R.layout.list_item_address);
      sKeys.put("layout/list_item_address_picker_0", com.emglab.qlsv.R.layout.list_item_address_picker);
      sKeys.put("layout/list_item_count_step_0", com.emglab.qlsv.R.layout.list_item_count_step);
      sKeys.put("layout/list_item_criteria_activity_0", com.emglab.qlsv.R.layout.list_item_criteria_activity);
      sKeys.put("layout/list_item_criteria_groups_0", com.emglab.qlsv.R.layout.list_item_criteria_groups);
      sKeys.put("layout/list_item_day_of_week_0", com.emglab.qlsv.R.layout.list_item_day_of_week);
      sKeys.put("layout/list_item_event_0", com.emglab.qlsv.R.layout.list_item_event);
      sKeys.put("layout/list_item_form_0", com.emglab.qlsv.R.layout.list_item_form);
      sKeys.put("layout/list_item_form_question_0", com.emglab.qlsv.R.layout.list_item_form_question);
      sKeys.put("layout/list_item_form_registered_0", com.emglab.qlsv.R.layout.list_item_form_registered);
      sKeys.put("layout/list_item_gift_0", com.emglab.qlsv.R.layout.list_item_gift);
      sKeys.put("layout/list_item_gift_2_0", com.emglab.qlsv.R.layout.list_item_gift_2);
      sKeys.put("layout/list_item_gift_created_0", com.emglab.qlsv.R.layout.list_item_gift_created);
      sKeys.put("layout/list_item_gift_register_0", com.emglab.qlsv.R.layout.list_item_gift_register);
      sKeys.put("layout/list_item_gift_register_2_0", com.emglab.qlsv.R.layout.list_item_gift_register_2);
      sKeys.put("layout/list_item_help_0", com.emglab.qlsv.R.layout.list_item_help);
      sKeys.put("layout/list_item_home_0", com.emglab.qlsv.R.layout.list_item_home);
      sKeys.put("layout/list_item_image_motel_0", com.emglab.qlsv.R.layout.list_item_image_motel);
      sKeys.put("layout/list_item_job_apply_0", com.emglab.qlsv.R.layout.list_item_job_apply);
      sKeys.put("layout/list_item_message_0", com.emglab.qlsv.R.layout.list_item_message);
      sKeys.put("layout/list_item_motel_image_0", com.emglab.qlsv.R.layout.list_item_motel_image);
      sKeys.put("layout/list_item_motel_info_0", com.emglab.qlsv.R.layout.list_item_motel_info);
      sKeys.put("layout/list_item_note_0", com.emglab.qlsv.R.layout.list_item_note);
      sKeys.put("layout/list_item_received_gift_0", com.emglab.qlsv.R.layout.list_item_received_gift);
      sKeys.put("layout/list_item_run_result_0", com.emglab.qlsv.R.layout.list_item_run_result);
      sKeys.put("layout/list_item_running_data_0", com.emglab.qlsv.R.layout.list_item_running_data);
      sKeys.put("layout/list_item_schedule_0", com.emglab.qlsv.R.layout.list_item_schedule);
      sKeys.put("layout/list_item_scholarship_0", com.emglab.qlsv.R.layout.list_item_scholarship);
      sKeys.put("layout/list_item_scholarship_applied_0", com.emglab.qlsv.R.layout.list_item_scholarship_applied);
      sKeys.put("layout/list_item_student_0", com.emglab.qlsv.R.layout.list_item_student);
      sKeys.put("layout/list_item_student2_0", com.emglab.qlsv.R.layout.list_item_student2);
      sKeys.put("layout/list_item_student_criteria_0", com.emglab.qlsv.R.layout.list_item_student_criteria);
      sKeys.put("layout/list_item_student_criteria_groups_0", com.emglab.qlsv.R.layout.list_item_student_criteria_groups);
      sKeys.put("layout/list_item_subject_0", com.emglab.qlsv.R.layout.list_item_subject);
      sKeys.put("layout/list_item_tutorial_0", com.emglab.qlsv.R.layout.list_item_tutorial);
      sKeys.put("layout/list_item_user_check_in_activity_0", com.emglab.qlsv.R.layout.list_item_user_check_in_activity);
      sKeys.put("layout/list_item_user_criteria_0", com.emglab.qlsv.R.layout.list_item_user_criteria);
      sKeys.put("layout/list_job_apply_fragment_0", com.emglab.qlsv.R.layout.list_job_apply_fragment);
      sKeys.put("layout/list_jobs_fragment_0", com.emglab.qlsv.R.layout.list_jobs_fragment);
      sKeys.put("layout/list_register_fragment_0", com.emglab.qlsv.R.layout.list_register_fragment);
      sKeys.put("layout/list_run_result_item_0", com.emglab.qlsv.R.layout.list_run_result_item);
      sKeys.put("layout/list_scholar_ship_applied_fragment_0", com.emglab.qlsv.R.layout.list_scholar_ship_applied_fragment);
      sKeys.put("layout/list_scholar_ships_fragment_0", com.emglab.qlsv.R.layout.list_scholar_ships_fragment);
      sKeys.put("layout/list_student_fragment_0", com.emglab.qlsv.R.layout.list_student_fragment);
      sKeys.put("layout/loading_action_state_0", com.emglab.qlsv.R.layout.loading_action_state);
      sKeys.put("layout/loading_state_0", com.emglab.qlsv.R.layout.loading_state);
      sKeys.put("layout/map_dialog_0", com.emglab.qlsv.R.layout.map_dialog);
      sKeys.put("layout/motel_info_fragment_0", com.emglab.qlsv.R.layout.motel_info_fragment);
      sKeys.put("layout/motel_registration_item_0", com.emglab.qlsv.R.layout.motel_registration_item);
      sKeys.put("layout/notes_fragment_0", com.emglab.qlsv.R.layout.notes_fragment);
      sKeys.put("layout/pick_location_fragment_0", com.emglab.qlsv.R.layout.pick_location_fragment);
      sKeys.put("layout/qr_student_fragment_0", com.emglab.qlsv.R.layout.qr_student_fragment);
      sKeys.put("layout/receiver_address_fragment_0", com.emglab.qlsv.R.layout.receiver_address_fragment);
      sKeys.put("layout/regist_form_fragment_0", com.emglab.qlsv.R.layout.regist_form_fragment);
      sKeys.put("layout/regist_gift_fragment_0", com.emglab.qlsv.R.layout.regist_gift_fragment);
      sKeys.put("layout/run_dashboard_fragment_0", com.emglab.qlsv.R.layout.run_dashboard_fragment);
      sKeys.put("layout/run_fragment_0", com.emglab.qlsv.R.layout.run_fragment);
      sKeys.put("layout/running_data_fragment_0", com.emglab.qlsv.R.layout.running_data_fragment);
      sKeys.put("layout/running_fragment_0", com.emglab.qlsv.R.layout.running_fragment);
      sKeys.put("layout/scholar_ship_detail_fragment_0", com.emglab.qlsv.R.layout.scholar_ship_detail_fragment);
      sKeys.put("layout/search_motel_fragment_0", com.emglab.qlsv.R.layout.search_motel_fragment);
      sKeys.put("layout/student_info_fragment_0", com.emglab.qlsv.R.layout.student_info_fragment);
      sKeys.put("layout/t_account_fragment_0", com.emglab.qlsv.R.layout.t_account_fragment);
      sKeys.put("layout/t_activity_info_fragment_0", com.emglab.qlsv.R.layout.t_activity_info_fragment);
      sKeys.put("layout/t_change_password_fragment_0", com.emglab.qlsv.R.layout.t_change_password_fragment);
      sKeys.put("layout/t_create_gift_fragment_0", com.emglab.qlsv.R.layout.t_create_gift_fragment);
      sKeys.put("layout/t_edit_form_fragment_0", com.emglab.qlsv.R.layout.t_edit_form_fragment);
      sKeys.put("layout/t_form_detail_fragment_0", com.emglab.qlsv.R.layout.t_form_detail_fragment);
      sKeys.put("layout/t_form_registered_fragment_0", com.emglab.qlsv.R.layout.t_form_registered_fragment);
      sKeys.put("layout/t_gift_fragment_0", com.emglab.qlsv.R.layout.t_gift_fragment);
      sKeys.put("layout/t_gift_given_fragment_0", com.emglab.qlsv.R.layout.t_gift_given_fragment);
      sKeys.put("layout/t_gift_info_fragment_0", com.emglab.qlsv.R.layout.t_gift_info_fragment);
      sKeys.put("layout/t_home2_fragment_0", com.emglab.qlsv.R.layout.t_home2_fragment);
      sKeys.put("layout/t_home_fragment_0", com.emglab.qlsv.R.layout.t_home_fragment);
      sKeys.put("layout/t_job_detail_fragment_0", com.emglab.qlsv.R.layout.t_job_detail_fragment);
      sKeys.put("layout/t_list_activities_fragment_0", com.emglab.qlsv.R.layout.t_list_activities_fragment);
      sKeys.put("layout/t_list_form_fragment_0", com.emglab.qlsv.R.layout.t_list_form_fragment);
      sKeys.put("layout/t_list_form_registered_fragment_0", com.emglab.qlsv.R.layout.t_list_form_registered_fragment);
      sKeys.put("layout/t_list_jobs_fragment_0", com.emglab.qlsv.R.layout.t_list_jobs_fragment);
      sKeys.put("layout/t_list_notifications_fragment_0", com.emglab.qlsv.R.layout.t_list_notifications_fragment);
      sKeys.put("layout/t_list_register_fragment_0", com.emglab.qlsv.R.layout.t_list_register_fragment);
      sKeys.put("layout/t_list_scholar_ships_fragment_0", com.emglab.qlsv.R.layout.t_list_scholar_ships_fragment);
      sKeys.put("layout/t_register_form_fragment_0", com.emglab.qlsv.R.layout.t_register_form_fragment);
      sKeys.put("layout/t_scholar_ship_detail_fragment_0", com.emglab.qlsv.R.layout.t_scholar_ship_detail_fragment);
      sKeys.put("layout/t_student_note_fragment_0", com.emglab.qlsv.R.layout.t_student_note_fragment);
      sKeys.put("layout/teacher_info_fragment_0", com.emglab.qlsv.R.layout.teacher_info_fragment);
      sKeys.put("layout/teacher_mark_fragment_0", com.emglab.qlsv.R.layout.teacher_mark_fragment);
      sKeys.put("layout/time_table_fragment_0", com.emglab.qlsv.R.layout.time_table_fragment);
      sKeys.put("layout/training_point_fragment_0", com.emglab.qlsv.R.layout.training_point_fragment);
    }
  }
}
