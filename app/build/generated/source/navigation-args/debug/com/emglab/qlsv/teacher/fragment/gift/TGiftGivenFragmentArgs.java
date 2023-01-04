package com.emglab.qlsv.teacher.fragment.gift;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TGiftGivenFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private TGiftGivenFragmentArgs() {
  }

  private TGiftGivenFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static TGiftGivenFragmentArgs fromBundle(@NonNull Bundle bundle) {
    TGiftGivenFragmentArgs __result = new TGiftGivenFragmentArgs();
    bundle.setClassLoader(TGiftGivenFragmentArgs.class.getClassLoader());
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
    TGiftGivenFragmentArgs that = (TGiftGivenFragmentArgs) object;
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
    return "TGiftGivenFragmentArgs{"
        + "reloadData=" + getReloadData()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(TGiftGivenFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
    }

    @NonNull
    public TGiftGivenFragmentArgs build() {
      TGiftGivenFragmentArgs result = new TGiftGivenFragmentArgs(arguments);
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
