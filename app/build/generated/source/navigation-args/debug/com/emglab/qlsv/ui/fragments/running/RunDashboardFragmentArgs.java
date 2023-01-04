package com.emglab.qlsv.ui.fragments.running;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RunDashboardFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private RunDashboardFragmentArgs() {
  }

  private RunDashboardFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static RunDashboardFragmentArgs fromBundle(@NonNull Bundle bundle) {
    RunDashboardFragmentArgs __result = new RunDashboardFragmentArgs();
    bundle.setClassLoader(RunDashboardFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("isTeacher")) {
      boolean isTeacher;
      isTeacher = bundle.getBoolean("isTeacher");
      __result.arguments.put("isTeacher", isTeacher);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public boolean getIsTeacher() {
    return (boolean) arguments.get("isTeacher");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("isTeacher")) {
      boolean isTeacher = (boolean) arguments.get("isTeacher");
      __result.putBoolean("isTeacher", isTeacher);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    RunDashboardFragmentArgs that = (RunDashboardFragmentArgs) object;
    if (arguments.containsKey("isTeacher") != that.arguments.containsKey("isTeacher")) {
      return false;
    }
    if (getIsTeacher() != that.getIsTeacher()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getIsTeacher() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "RunDashboardFragmentArgs{"
        + "isTeacher=" + getIsTeacher()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(RunDashboardFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public RunDashboardFragmentArgs build() {
      RunDashboardFragmentArgs result = new RunDashboardFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setIsTeacher(boolean isTeacher) {
      this.arguments.put("isTeacher", isTeacher);
      return this;
    }

    @SuppressWarnings("unchecked")
    public boolean getIsTeacher() {
      return (boolean) arguments.get("isTeacher");
    }
  }
}
