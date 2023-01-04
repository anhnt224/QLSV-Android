package com.emglab.qlsv.teacher.fragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;

public class THomeFragmentDirections {
  private THomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionTHomeFragmentToTListFormFragment() {
    return new ActionOnlyNavDirections(R.id.action_THomeFragment_to_TListFormFragment);
  }

  @NonNull
  public static NavDirections actionTHomeFragmentToTListActivitiesFragment2() {
    return new ActionOnlyNavDirections(R.id.action_THomeFragment_to_TListActivitiesFragment2);
  }

  @NonNull
  public static NavDirections actionTHomeFragmentToTListScholarShipsFragment() {
    return new ActionOnlyNavDirections(R.id.action_THomeFragment_to_TListScholarShipsFragment);
  }

  @NonNull
  public static NavDirections actionTHomeFragmentToTListJobsFragment() {
    return new ActionOnlyNavDirections(R.id.action_THomeFragment_to_TListJobsFragment);
  }

  @NonNull
  public static NavDirections actionTHomeFragmentToListStudentFragment() {
    return new ActionOnlyNavDirections(R.id.action_THomeFragment_to_listStudentFragment);
  }
}
