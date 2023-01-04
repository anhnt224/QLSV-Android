package com.emglab.qlsv.ui.fragments.help;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HelpFragmentDirections {
  private HelpFragmentDirections() {
  }

  @NonNull
  public static ActionHelpFragmentToActivityDetailByUserUnitFragment actionHelpFragmentToActivityDetailByUserUnitFragment(
      int AId) {
    return new ActionHelpFragmentToActivityDetailByUserUnitFragment(AId);
  }

  public static class ActionHelpFragmentToActivityDetailByUserUnitFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHelpFragmentToActivityDetailByUserUnitFragment(int AId) {
      this.arguments.put("AId", AId);
    }

    @NonNull
    public ActionHelpFragmentToActivityDetailByUserUnitFragment setAId(int AId) {
      this.arguments.put("AId", AId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("AId")) {
        int AId = (int) arguments.get("AId");
        __result.putInt("AId", AId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_helpFragment_to_activityDetailByUserUnitFragment;
    }

    @SuppressWarnings("unchecked")
    public int getAId() {
      return (int) arguments.get("AId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHelpFragmentToActivityDetailByUserUnitFragment that = (ActionHelpFragmentToActivityDetailByUserUnitFragment) object;
      if (arguments.containsKey("AId") != that.arguments.containsKey("AId")) {
        return false;
      }
      if (getAId() != that.getAId()) {
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
      result = 31 * result + getAId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHelpFragmentToActivityDetailByUserUnitFragment(actionId=" + getActionId() + "){"
          + "AId=" + getAId()
          + "}";
    }
  }
}
