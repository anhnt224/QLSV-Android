package com.emglab.qlsv.ui.fragments.user;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToRegisterFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_registerFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToLostPasswordFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_lostPasswordFragment);
  }
}
