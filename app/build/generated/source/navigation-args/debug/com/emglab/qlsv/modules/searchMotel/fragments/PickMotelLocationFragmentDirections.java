package com.emglab.qlsv.modules.searchMotel.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;

public class PickMotelLocationFragmentDirections {
  private PickMotelLocationFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionPickMotelLocationFragmentToRegisterToFindMotelFragment() {
    return new ActionOnlyNavDirections(R.id.action_pickMotelLocationFragment_to_registerToFindMotelFragment);
  }
}
