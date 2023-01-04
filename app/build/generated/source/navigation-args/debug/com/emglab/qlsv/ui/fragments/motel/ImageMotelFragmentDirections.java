package com.emglab.qlsv.ui.fragments.motel;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;

public class ImageMotelFragmentDirections {
  private ImageMotelFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionImageMotelFragmentToListAddressFragment() {
    return new ActionOnlyNavDirections(R.id.action_imageMotelFragment_to_listAddressFragment);
  }
}
