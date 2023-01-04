package com.emglab.qlsv.teacher.fragment.account;

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

public class TAccountFragmentDirections {
  private TAccountFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionTAccountFragmentToTChangePasswordFragment() {
    return new ActionOnlyNavDirections(R.id.action_TAccountFragment_to_TChangePasswordFragment);
  }

  @NonNull
  public static NavDirections actionTAccountFragmentToTeacherInfoFragment() {
    return new ActionOnlyNavDirections(R.id.action_TAccountFragment_to_teacherInfoFragment);
  }

  @NonNull
  public static ActionTAccountFragmentToRunDashboardFragment2 actionTAccountFragmentToRunDashboardFragment2(
      ) {
    return new ActionTAccountFragmentToRunDashboardFragment2();
  }

  public static class ActionTAccountFragmentToRunDashboardFragment2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTAccountFragmentToRunDashboardFragment2() {
    }

    @NonNull
    public ActionTAccountFragmentToRunDashboardFragment2 setIsTeacher(boolean isTeacher) {
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
      return R.id.action_TAccountFragment_to_runDashboardFragment2;
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
      ActionTAccountFragmentToRunDashboardFragment2 that = (ActionTAccountFragmentToRunDashboardFragment2) object;
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
      return "ActionTAccountFragmentToRunDashboardFragment2(actionId=" + getActionId() + "){"
          + "isTeacher=" + getIsTeacher()
          + "}";
    }
  }
}
