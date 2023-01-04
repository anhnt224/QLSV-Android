package com.emglab.qlsv.ui.fragments.user;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;

public class ChangePasswordFragmentDirections {
  private ChangePasswordFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionChangePasswordFragmentToScheduleFragment() {
    return new ActionOnlyNavDirections(R.id.action_changePasswordFragment_to_scheduleFragment);
  }
}
