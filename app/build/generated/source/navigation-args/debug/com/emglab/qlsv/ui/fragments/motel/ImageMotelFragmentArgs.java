package com.emglab.qlsv.ui.fragments.motel;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ImageMotelFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ImageMotelFragmentArgs() {
  }

  private ImageMotelFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ImageMotelFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ImageMotelFragmentArgs __result = new ImageMotelFragmentArgs();
    bundle.setClassLoader(ImageMotelFragmentArgs.class.getClassLoader());
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
    ImageMotelFragmentArgs that = (ImageMotelFragmentArgs) object;
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
    return "ImageMotelFragmentArgs{"
        + "motelID=" + getMotelID()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ImageMotelFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int motelID) {
      this.arguments.put("motelID", motelID);
    }

    @NonNull
    public ImageMotelFragmentArgs build() {
      ImageMotelFragmentArgs result = new ImageMotelFragmentArgs(arguments);
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
