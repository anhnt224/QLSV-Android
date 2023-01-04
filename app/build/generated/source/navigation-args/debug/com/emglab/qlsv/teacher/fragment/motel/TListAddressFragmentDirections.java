package com.emglab.qlsv.teacher.fragment.motel;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;

public class TListAddressFragmentDirections {
  private TListAddressFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionTListAddressFragmentToTAddNewAddressFragment() {
    return new ActionOnlyNavDirections(R.id.action_TListAddressFragment_to_TAddNewAddressFragment);
  }
}
