package com.emglab.qlsv.ui.fragments.form;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;

public class ChooseReceiverAddressFragmentDirections {
  private ChooseReceiverAddressFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionChooseReceiverAddressFragmentToAddNewAddressFragment() {
    return new ActionOnlyNavDirections(R.id.action_chooseReceiverAddressFragment_to_addNewAddressFragment);
  }
}
