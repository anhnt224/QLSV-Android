package com.emglab.qlsv.teacher.fragment.motel;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TImageMotelFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private TImageMotelFragmentArgs() {
  }

  private TImageMotelFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static TImageMotelFragmentArgs fromBundle(@NonNull Bundle bundle) {
    TImageMotelFragmentArgs __result = new TImageMotelFragmentArgs();
    bundle.setClassLoader(TImageMotelFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("motelID")) {
      int motelID;
      motelID = bundle.getInt("motelID");
      __result.arguments.put("motelID", motelID);
    } else {
      throw new IllegalArgumentException("Required argument \"motelID\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getMotelID() {
    return (int) arguments.get("motelID");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("motelID")) {
      int motelID = (int) arguments.get("motelID");
      __result.putInt("motelID", motelID);
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
    TImageMotelFragmentArgs that = (TImageMotelFragmentArgs) object;
    if (arguments.containsKey("motelID") != that.arguments.containsKey("motelID")) {
      return false;
    }
    if (getMotelID() != that.getMotelID()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getMotelID();
    return result;
  }

  @Override
  public String toString() {
    return "TImageMotelFragmentArgs{"
        + "motelID=" + getMotelID()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(TImageMotelFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int motelID) {
      this.arguments.put("motelID", motelID);
    }

    @NonNull
    public TImageMotelFragmentArgs build() {
      TImageMotelFragmentArgs result = new TImageMotelFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setMotelID(int motelID) {
      this.arguments.put("motelID", motelID);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getMotelID() {
      return (int) arguments.get("motelID");
    }
  }
}
