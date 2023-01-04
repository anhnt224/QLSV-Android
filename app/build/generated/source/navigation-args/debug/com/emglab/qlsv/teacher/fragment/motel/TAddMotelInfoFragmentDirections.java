package com.emglab.qlsv.teacher.fragment.motel;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TAddMotelInfoFragmentDirections {
  private TAddMotelInfoFragmentDirections() {
  }

  @NonNull
  public static ActionTAddMotelInfoFragmentToTImageMotelFragment actionTAddMotelInfoFragmentToTImageMotelFragment(
      int motelID) {
    return new ActionTAddMotelInfoFragmentToTImageMotelFragment(motelID);
  }

  @NonNull
  public static NavDirections actionTAddMotelInfoFragmentToTListAddressFragment() {
    return new ActionOnlyNavDirections(R.id.action_TAddMotelInfoFragment_to_TListAddressFragment);
  }

  public static class ActionTAddMotelInfoFragmentToTImageMotelFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTAddMotelInfoFragmentToTImageMotelFragment(int motelID) {
      this.arguments.put("motelID", motelID);
    }

    @NonNull
    public ActionTAddMotelInfoFragmentToTImageMotelFragment setMotelID(int motelID) {
      this.arguments.put("motelID", motelID);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("motelID")) {
        int motelID = (int) arguments.get("motelID");
        __result.putInt("motelID", motelID);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_TAddMotelInfoFragment_to_TImageMotelFragment;
    }

    @SuppressWarnings("unchecked")
    public int getMotelID() {
      return (int) arguments.get("motelID");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTAddMotelInfoFragmentToTImageMotelFragment that = (ActionTAddMotelInfoFragmentToTImageMotelFragment) object;
      if (arguments.containsKey("motelID") != that.arguments.containsKey("motelID")) {
        return false;
      }
      if (getMotelID() != that.getMotelID()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getMotelID();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTAddMotelInfoFragmentToTImageMotelFragment(actionId=" + getActionId() + "){"
          + "motelID=" + getMotelID()
          + "}";
    }
  }
}
