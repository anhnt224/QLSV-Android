package com.emglab.qlsv.ui.fragments.activity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ActivityDetailByUserUnitFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ActivityDetailByUserUnitFragmentArgs() {
  }

  private ActivityDetailByUserUnitFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ActivityDetailByUserUnitFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ActivityDetailByUserUnitFragmentArgs __result = new ActivityDetailByUserUnitFragmentArgs();
    bundle.setClassLoader(ActivityDetailByUserUnitFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("AId")) {
      int AId;
      AId = bundle.getInt("AId");
      __result.arguments.put("AId", AId);
    } else {
      throw new IllegalArgumentException("Required argument \"AId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getAId() {
    return (int) arguments.get("AId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("AId")) {
      int AId = (int) arguments.get("AId");
      __result.putInt("AId", AId);
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
    ActivityDetailByUserUnitFragmentArgs that = (ActivityDetailByUserUnitFragmentArgs) object;
    if (arguments.containsKey("AId") != that.arguments.containsKey("AId")) {
      return false;
    }
    if (getAId() != that.getAId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getAId();
    return result;
  }

  @Override
  public String toString() {
    return "ActivityDetailByUserUnitFragmentArgs{"
        + "AId=" + getAId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ActivityDetailByUserUnitFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int AId) {
      this.arguments.put("AId", AId);
    }

    @NonNull
    public ActivityDetailByUserUnitFragmentArgs build() {
      ActivityDetailByUserUnitFragmentArgs result = new ActivityDetailByUserUnitFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setAId(int AId) {
      this.arguments.put("AId", AId);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getAId() {
      return (int) arguments.get("AId");
    }
  }
}
