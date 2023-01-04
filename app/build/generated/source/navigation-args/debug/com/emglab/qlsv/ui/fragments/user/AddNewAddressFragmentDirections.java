package com.emglab.qlsv.ui.fragments.user;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;

public class AddNewAddressFragmentDirections {
  private AddNewAddressFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAddNewAddressFragmentToPickLocationFragment() {
    return new ActionOnlyNavDirections(R.id.action_addNewAddressFragment_to_pickLocationFragment);
  }

  @NonNull
  public static NavDirections actionAddNewAddressFragmentToAddMotelInfoFragment() {
    return new ActionOnlyNavDirections(R.id.action_addNewAddressFragment_to_addMotelInfoFragment);
  }
}
