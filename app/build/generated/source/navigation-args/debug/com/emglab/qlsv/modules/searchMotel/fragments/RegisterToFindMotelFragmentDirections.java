package com.emglab.qlsv.modules.searchMotel.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;

public class RegisterToFindMotelFragmentDirections {
  private RegisterToFindMotelFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionRegisterToFindMotelFragmentToPickMotelLocationFragment() {
    return new ActionOnlyNavDirections(R.id.action_registerToFindMotelFragment_to_pickMotelLocationFragment);
  }
}
