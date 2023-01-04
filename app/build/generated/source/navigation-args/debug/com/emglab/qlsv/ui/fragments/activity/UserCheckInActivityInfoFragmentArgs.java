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

public class UserCheckInActivityInfoFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private UserCheckInActivityInfoFragmentArgs() {
  }

  private UserCheckInActivityInfoFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static UserCheckInActivityInfoFragmentArgs fromBundle(@NonNull Bundle bundle) {
    UserCheckInActivityInfoFragmentArgs __result = new UserCheckInActivityInfoFragmentArgs();
    bundle.setClassLoader(UserCheckInActivityInfoFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("AId")) {
      int AId;
      AId = bundle.getInt("AId");
      __result.arguments.put("AId", AId);
    } else {
      throw new IllegalArgumentException("Required argument \"AId\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("UserCode")) {
      String UserCode;
      UserCode = bundle.getString("UserCode");
      if (UserCode == null) {
        throw new IllegalArgumentException("Argument \"UserCode\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("UserCode", UserCode);
    } else {
      throw new IllegalArgumentException("Required argument \"UserCode\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("AGId")) {
      int AGId;
      AGId = bundle.getInt("AGId");
      __result.arguments.put("AGId", AGId);
    } else {
      throw new IllegalArgumentException("Required argument \"AGId\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("AName")) {
      String AName;
      AName = bundle.getString("AName");
      if (AName == null) {
        throw new IllegalArgumentException("Argument \"AName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("AName", AName);
    } else {
      throw new IllegalArgumentException("Required argument \"AName\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getAId() {
    return (int) arguments.get("AId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getUserCode() {
    return (String) arguments.get("UserCode");
  }

  @SuppressWarnings("unchecked")
  public int getAGId() {
    return (int) arguments.get("AGId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getAName() {
    return (String) arguments.get("AName");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("AId")) {
      int AId = (int) arguments.get("AId");
      __result.putInt("AId", AId);
    }
    if (arguments.containsKey("UserCode")) {
      String UserCode = (String) arguments.get("UserCode");
      __result.putString("UserCode", UserCode);
    }
    if (arguments.containsKey("AGId")) {
      int AGId = (int) arguments.get("AGId");
      __result.putInt("AGId", AGId);
    }
    if (arguments.containsKey("AName")) {
      String AName = (String) arguments.get("AName");
      __result.putString("AName", AName);
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
    UserCheckInActivityInfoFragmentArgs that = (UserCheckInActivityInfoFragmentArgs) object;
    if (arguments.containsKey("AId") != that.arguments.containsKey("AId")) {
      return false;
    }
    if (getAId() != that.getAId()) {
      return false;
    }
    if (arguments.containsKey("UserCode") != that.arguments.containsKey("UserCode")) {
      return false;
    }
    if (getUserCode() != null ? !getUserCode().equals(that.getUserCode()) : that.getUserCode() != null) {
      return false;
    }
    if (arguments.containsKey("AGId") != that.arguments.containsKey("AGId")) {
      return false;
    }
    if (getAGId() != that.getAGId()) {
      return false;
    }
    if (arguments.containsKey("AName") != that.arguments.containsKey("AName")) {
      return false;
    }
    if (getAName() != null ? !getAName().equals(that.getAName()) : that.getAName() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getAId();
    result = 31 * result + (getUserCode() != null ? getUserCode().hashCode() : 0);
    result = 31 * result + getAGId();
    result = 31 * result + (getAName() != null ? getAName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "UserCheckInActivityInfoFragmentArgs{"
        + "AId=" + getAId()
        + ", UserCode=" + getUserCode()
        + ", AGId=" + getAGId()
        + ", AName=" + getAName()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(UserCheckInActivityInfoFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int AId, @NonNull String UserCode, int AGId, @NonNull String AName) {
      this.arguments.put("AId", AId);
      if (UserCode == null) {
        throw new IllegalArgumentException("Argument \"UserCode\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("UserCode", UserCode);
      this.arguments.put("AGId", AGId);
      if (AName == null) {
        throw new IllegalArgumentException("Argument \"AName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("AName", AName);
    }

    @NonNull
    public UserCheckInActivityInfoFragmentArgs build() {
      UserCheckInActivityInfoFragmentArgs result = new UserCheckInActivityInfoFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setAId(int AId) {
      this.arguments.put("AId", AId);
      return this;
    }

    @NonNull
    public Builder setUserCode(@NonNull String UserCode) {
      if (UserCode == null) {
        throw new IllegalArgumentException("Argument \"UserCode\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("UserCode", UserCode);
      return this;
    }

    @NonNull
    public Builder setAGId(int AGId) {
      this.arguments.put("AGId", AGId);
      return this;
    }

    @NonNull
    public Builder setAName(@NonNull String AName) {
      if (AName == null) {
        throw new IllegalArgumentException("Argument \"AName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("AName", AName);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getAId() {
      return (int) arguments.get("AId");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getUserCode() {
      return (String) arguments.get("UserCode");
    }

    @SuppressWarnings("unchecked")
    public int getAGId() {
      return (int) arguments.get("AGId");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getAName() {
      return (String) arguments.get("AName");
    }
  }
}
