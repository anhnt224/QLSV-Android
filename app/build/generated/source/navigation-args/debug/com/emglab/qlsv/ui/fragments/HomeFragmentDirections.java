package com.emglab.qlsv.ui.fragments;

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

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToListActivityFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_listActivityFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToListScholarShipsFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_listScholarShipsFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToListJobsFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_listJobsFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToListFormsFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_listFormsFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToTrainingPointFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_trainingPointFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToTimeTableFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_timeTableFragment);
  }

  @NonNull
  public static ActionHomeFragmentToActivityDetailByUserUnitFragment actionHomeFragmentToActivityDetailByUserUnitFragment(
      int AId) {
    return new ActionHomeFragmentToActivityDetailByUserUnitFragment(AId);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToListAddressFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_listAddressFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToRunDashboardFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_runDashboardFragment);
  }

  public static class ActionHomeFragmentToActivityDetailByUserUnitFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToActivityDetailByUserUnitFragment(int AId) {
      this.arguments.put("AId", AId);
    }

    @NonNull
    public ActionHomeFragmentToActivityDetailByUserUnitFragment setAId(int AId) {
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
      return R.id.action_homeFragment_to_activityDetailByUserUnitFragment;
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
      ActionHomeFragmentToActivityDetailByUserUnitFragment that = (ActionHomeFragmentToActivityDetailByUserUnitFragment) object;
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
      return "ActionHomeFragmentToActivityDetailByUserUnitFragment(actionId=" + getActionId() + "){"
          + "AId=" + getAId()
          + "}";
    }
  }
}
