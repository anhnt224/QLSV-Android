package com.emglab.qlsv.ui.fragments.running;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;

public class RunningFragmentDirections {
  private RunningFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionRunningFragmentToRunningDataFragment() {
    return new ActionOnlyNavDirections(R.id.action_runningFragment_to_runningDataFragment);
  }
}
