package com.emglab.qlsv.ui.fragments.gift;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GiftGivenFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private GiftGivenFragmentArgs() {
  }

  private GiftGivenFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static GiftGivenFragmentArgs fromBundle(@NonNull Bundle bundle) {
    GiftGivenFragmentArgs __result = new GiftGivenFragmentArgs();
    bundle.setClassLoader(GiftGivenFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("reloadData")) {
      boolean reloadData;
      reloadData = bundle.getBoolean("reloadData");
      __result.arguments.put("reloadData", reloadData);
    } else {
      throw new IllegalArgumentException("Required argument \"reloadData\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public boolean getReloadData() {
    return (boolean) arguments.get("reloadData");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("reloadData")) {
      boolean reloadData = (boolean) arguments.get("reloadData");
      __result.putBoolean("reloadData", reloadData);
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
    GiftGivenFragmentArgs that = (GiftGivenFragmentArgs) object;
    if (arguments.containsKey("reloadData") != that.arguments.containsKey("reloadData")) {
      return false;
    }
    if (getReloadData() != that.getReloadData()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getReloadData() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "GiftGivenFragmentArgs{"
        + "reloadData=" + getReloadData()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(GiftGivenFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
    }

    @NonNull
    public GiftGivenFragmentArgs build() {
      GiftGivenFragmentArgs result = new GiftGivenFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setReloadData(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
      return this;
    }

    @SuppressWarnings("unchecked")
    public boolean getReloadData() {
      return (boolean) arguments.get("reloadData");
    }
  }
}
