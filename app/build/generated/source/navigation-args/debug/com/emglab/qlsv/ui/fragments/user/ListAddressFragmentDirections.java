package com.emglab.qlsv.ui.fragments.user;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;

public class ListAddressFragmentDirections {
  private ListAddressFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListAddressFragmentToAddNewAddressFragment() {
    return new ActionOnlyNavDirections(R.id.action_listAddressFragment_to_addNewAddressFragment);
  }
}
