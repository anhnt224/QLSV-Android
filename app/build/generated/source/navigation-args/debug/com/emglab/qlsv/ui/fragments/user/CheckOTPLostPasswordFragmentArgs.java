package com.emglab.qlsv.ui.fragments.user;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CheckOTPLostPasswordFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private CheckOTPLostPasswordFragmentArgs() {
  }

  private CheckOTPLostPasswordFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static CheckOTPLostPasswordFragmentArgs fromBundle(@NonNull Bundle bundle) {
    CheckOTPLostPasswordFragmentArgs __result = new CheckOTPLostPasswordFragmentArgs();
    bundle.setClassLoader(CheckOTPLostPasswordFragmentArgs.class.getClassLoader());
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
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getUserCode() {
    return (String) arguments.get("UserCode");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("UserCode")) {
      String UserCode = (String) arguments.get("UserCode");
      __result.putString("UserCode", UserCode);
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
    CheckOTPLostPasswordFragmentArgs that = (CheckOTPLostPasswordFragmentArgs) object;
    if (arguments.containsKey("UserCode") != that.arguments.containsKey("UserCode")) {
      return false;
    }
    if (getUserCode() != null ? !getUserCode().equals(that.getUserCode()) : that.getUserCode() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getUserCode() != null ? getUserCode().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "CheckOTPLostPasswordFragmentArgs{"
        + "UserCode=" + getUserCode()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(CheckOTPLostPasswordFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String UserCode) {
      if (UserCode == null) {
        throw new IllegalArgumentException("Argument \"UserCode\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("UserCode", UserCode);
    }

    @NonNull
    public CheckOTPLostPasswordFragmentArgs build() {
      CheckOTPLostPasswordFragmentArgs result = new CheckOTPLostPasswordFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setUserCode(@NonNull String UserCode) {
      if (UserCode == null) {
        throw new IllegalArgumentException("Argument \"UserCode\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("UserCode", UserCode);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getUserCode() {
      return (String) arguments.get("UserCode");
    }
  }
}
