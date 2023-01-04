package com.emglab.qlsv.teacher.fragment.motel;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;

public class TAddNewAddressFragmentDirections {
  private TAddNewAddressFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionTAddNewAddressFragmentToTAddMotelInfoFragment() {
    return new ActionOnlyNavDirections(R.id.action_TAddNewAddressFragment_to_TAddMotelInfoFragment);
  }

  @NonNull
  public static NavDirections actionTAddNewAddressFragmentToTPickLocationFragment() {
    return new ActionOnlyNavDirections(R.id.action_TAddNewAddressFragment_to_TPickLocationFragment);
  }
}
