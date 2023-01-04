package com.emglab.qlsv.teacher.fragment.motel;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;

public class TImageMotelFragmentDirections {
  private TImageMotelFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionTImageMotelFragmentToTListAddressFragment() {
    return new ActionOnlyNavDirections(R.id.action_TImageMotelFragment_to_TListAddressFragment);
  }
}
