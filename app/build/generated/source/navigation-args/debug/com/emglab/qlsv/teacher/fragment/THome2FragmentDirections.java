package com.emglab.qlsv.teacher.fragment;

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

public class THome2FragmentDirections {
  private THome2FragmentDirections() {
  }

  @NonNull
  public static NavDirections actionTHome2FragmentToTListFormFragment() {
    return new ActionOnlyNavDirections(R.id.action_THome2Fragment_to_TListFormFragment);
  }

  @NonNull
  public static NavDirections actionTHome2FragmentToTListActivitiesFragment() {
    return new ActionOnlyNavDirections(R.id.action_THome2Fragment_to_TListActivitiesFragment);
  }

  @NonNull
  public static NavDirections actionTHome2FragmentToTListScholarShipsFragment() {
    return new ActionOnlyNavDirections(R.id.action_THome2Fragment_to_TListScholarShipsFragment);
  }

  @NonNull
  public static NavDirections actionTHome2FragmentToTListJobsFragment() {
    return new ActionOnlyNavDirections(R.id.action_THome2Fragment_to_TListJobsFragment);
  }

  @NonNull
  public static NavDirections actionTHome2FragmentToListStudentFragment() {
    return new ActionOnlyNavDirections(R.id.action_THome2Fragment_to_listStudentFragment);
  }

  @NonNull
  public static ActionTHome2FragmentToRunDashboardFragment2 actionTHome2FragmentToRunDashboardFragment2(
      ) {
    return new ActionTHome2FragmentToRunDashboardFragment2();
  }

  @NonNull
  public static ActionTHome2FragmentToTGiftGivenFragment actionTHome2FragmentToTGiftGivenFragment(
      boolean reloadData) {
    return new ActionTHome2FragmentToTGiftGivenFragment(reloadData);
  }

  @NonNull
  public static ActionTHome2FragmentToTGiftFragment actionTHome2FragmentToTGiftFragment(
      boolean reloadData) {
    return new ActionTHome2FragmentToTGiftFragment(reloadData);
  }

  @NonNull
  public static NavDirections actionTHome2FragmentToTGiftReceivedFragment() {
    return new ActionOnlyNavDirections(R.id.action_THome2Fragment_to_TGiftReceivedFragment);
  }

  @NonNull
  public static NavDirections actionTHome2FragmentToTSearchMotelFragment() {
    return new ActionOnlyNavDirections(R.id.action_THome2Fragment_to_TSearchMotelFragment);
  }

  @NonNull
  public static NavDirections actionTHome2FragmentToTMoreJobFragment() {
    return new ActionOnlyNavDirections(R.id.action_THome2Fragment_to_TMoreJobFragment);
  }

  @NonNull
  public static NavDirections actionTHome2FragmentToTListAddressFragment() {
    return new ActionOnlyNavDirections(R.id.action_THome2Fragment_to_TListAddressFragment);
  }

  @NonNull
  public static NavDirections actionTHome2FragmentToTTutorFragment() {
    return new ActionOnlyNavDirections(R.id.action_THome2Fragment_to_TTutorFragment);
  }

  @NonNull
  public static NavDirections actionTHome2FragmentToStudentList2Fragment() {
    return new ActionOnlyNavDirections(R.id.action_THome2Fragment_to_studentList2Fragment);
  }

  public static class ActionTHome2FragmentToRunDashboardFragment2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTHome2FragmentToRunDashboardFragment2() {
    }

    @NonNull
    public ActionTHome2FragmentToRunDashboardFragment2 setIsTeacher(boolean isTeacher) {
      this.arguments.put("isTeacher", isTeacher);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("isTeacher")) {
        boolean isTeacher = (boolean) arguments.get("isTeacher");
        __result.putBoolean("isTeacher", isTeacher);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_THome2Fragment_to_runDashboardFragment2;
    }

    @SuppressWarnings("unchecked")
    public boolean getIsTeacher() {
      return (boolean) arguments.get("isTeacher");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTHome2FragmentToRunDashboardFragment2 that = (ActionTHome2FragmentToRunDashboardFragment2) object;
      if (arguments.containsKey("isTeacher") != that.arguments.containsKey("isTeacher")) {
        return false;
      }
      if (getIsTeacher() != that.getIsTeacher()) {
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
      result = 31 * result + (getIsTeacher() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTHome2FragmentToRunDashboardFragment2(actionId=" + getActionId() + "){"
          + "isTeacher=" + getIsTeacher()
          + "}";
    }
  }

  public static class ActionTHome2FragmentToTGiftGivenFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTHome2FragmentToTGiftGivenFragment(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
    }

    @NonNull
    public ActionTHome2FragmentToTGiftGivenFragment setReloadData(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("reloadData")) {
        boolean reloadData = (boolean) arguments.get("reloadData");
        __result.putBoolean("reloadData", reloadData);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_THome2Fragment_to_TGiftGivenFragment;
    }

    @SuppressWarnings("unchecked")
    public boolean getReloadData() {
      return (boolean) arguments.get("reloadData");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTHome2FragmentToTGiftGivenFragment that = (ActionTHome2FragmentToTGiftGivenFragment) object;
      if (arguments.containsKey("reloadData") != that.arguments.containsKey("reloadData")) {
        return false;
      }
      if (getReloadData() != that.getReloadData()) {
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
      result = 31 * result + (getReloadData() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTHome2FragmentToTGiftGivenFragment(actionId=" + getActionId() + "){"
          + "reloadData=" + getReloadData()
          + "}";
    }
  }

  public static class ActionTHome2FragmentToTGiftFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTHome2FragmentToTGiftFragment(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
    }

    @NonNull
    public ActionTHome2FragmentToTGiftFragment setReloadData(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("reloadData")) {
        boolean reloadData = (boolean) arguments.get("reloadData");
        __result.putBoolean("reloadData", reloadData);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_THome2Fragment_to_TGiftFragment;
    }

    @SuppressWarnings("unchecked")
    public boolean getReloadData() {
      return (boolean) arguments.get("reloadData");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTHome2FragmentToTGiftFragment that = (ActionTHome2FragmentToTGiftFragment) object;
      if (arguments.containsKey("reloadData") != that.arguments.containsKey("reloadData")) {
        return false;
      }
      if (getReloadData() != that.getReloadData()) {
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
      result = 31 * result + (getReloadData() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTHome2FragmentToTGiftFragment(actionId=" + getActionId() + "){"
          + "reloadData=" + getReloadData()
          + "}";
    }
  }
}
