package com.emglab.qlsv.modules.searchMotel.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.emglab.qlsv.models.entity.Motel;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.HashMap;

public class ListMotelResultsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ListMotelResultsFragmentArgs() {
  }

  private ListMotelResultsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ListMotelResultsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ListMotelResultsFragmentArgs __result = new ListMotelResultsFragmentArgs();
    bundle.setClassLoader(ListMotelResultsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("motelList")) {
      Motel[] motelList;
      Parcelable[] __array = bundle.getParcelableArray("motelList");
      if (__array != null) {
        motelList = new Motel[__array.length];
        System.arraycopy(__array, 0, motelList, 0, __array.length);
      } else {
        motelList = null;
      }
      if (motelList == null) {
        throw new IllegalArgumentException("Argument \"motelList\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("motelList", motelList);
    } else {
      throw new IllegalArgumentException("Required argument \"motelList\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Motel[] getMotelList() {
    return (Motel[]) arguments.get("motelList");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("motelList")) {
      Motel[] motelList = (Motel[]) arguments.get("motelList");
      __result.putParcelableArray("motelList", motelList);
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
    ListMotelResultsFragmentArgs that = (ListMotelResultsFragmentArgs) object;
    if (arguments.containsKey("motelList") != that.arguments.containsKey("motelList")) {
      return false;
    }
    if (getMotelList() != null ? !getMotelList().equals(that.getMotelList()) : that.getMotelList() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + java.util.Arrays.hashCode(getMotelList());
    return result;
  }

  @Override
  public String toString() {
    return "ListMotelResultsFragmentArgs{"
        + "motelList=" + getMotelList()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ListMotelResultsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Motel[] motelList) {
      if (motelList == null) {
        throw new IllegalArgumentException("Argument \"motelList\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("motelList", motelList);
    }

    @NonNull
    public ListMotelResultsFragmentArgs build() {
      ListMotelResultsFragmentArgs result = new ListMotelResultsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setMotelList(@NonNull Motel[] motelList) {
      if (motelList == null) {
        throw new IllegalArgumentException("Argument \"motelList\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("motelList", motelList);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Motel[] getMotelList() {
      return (Motel[]) arguments.get("motelList");
    }
  }
}
