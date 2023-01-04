package com.emglab.qlsv.modules.searchMotel.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistration;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MotelRegistrationCompleteFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private MotelRegistrationCompleteFragmentArgs() {
  }

  private MotelRegistrationCompleteFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MotelRegistrationCompleteFragmentArgs fromBundle(@NonNull Bundle bundle) {
    MotelRegistrationCompleteFragmentArgs __result = new MotelRegistrationCompleteFragmentArgs();
    bundle.setClassLoader(MotelRegistrationCompleteFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("motelRegistration")) {
      MotelRegistration motelRegistration;
      if (Parcelable.class.isAssignableFrom(MotelRegistration.class) || Serializable.class.isAssignableFrom(MotelRegistration.class)) {
        motelRegistration = (MotelRegistration) bundle.get("motelRegistration");
      } else {
        throw new UnsupportedOperationException(MotelRegistration.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (motelRegistration == null) {
        throw new IllegalArgumentException("Argument \"motelRegistration\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("motelRegistration", motelRegistration);
    } else {
      throw new IllegalArgumentException("Required argument \"motelRegistration\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public MotelRegistration getMotelRegistration() {
    return (MotelRegistration) arguments.get("motelRegistration");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("motelRegistration")) {
      MotelRegistration motelRegistration = (MotelRegistration) arguments.get("motelRegistration");
      if (Parcelable.class.isAssignableFrom(MotelRegistration.class) || motelRegistration == null) {
        __result.putParcelable("motelRegistration", Parcelable.class.cast(motelRegistration));
      } else if (Serializable.class.isAssignableFrom(MotelRegistration.class)) {
        __result.putSerializable("motelRegistration", Serializable.class.cast(motelRegistration));
      } else {
        throw new UnsupportedOperationException(MotelRegistration.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
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
    MotelRegistrationCompleteFragmentArgs that = (MotelRegistrationCompleteFragmentArgs) object;
    if (arguments.containsKey("motelRegistration") != that.arguments.containsKey("motelRegistration")) {
      return false;
    }
    if (getMotelRegistration() != null ? !getMotelRegistration().equals(that.getMotelRegistration()) : that.getMotelRegistration() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getMotelRegistration() != null ? getMotelRegistration().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "MotelRegistrationCompleteFragmentArgs{"
        + "motelRegistration=" + getMotelRegistration()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(MotelRegistrationCompleteFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull MotelRegistration motelRegistration) {
      if (motelRegistration == null) {
        throw new IllegalArgumentException("Argument \"motelRegistration\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("motelRegistration", motelRegistration);
    }

    @NonNull
    public MotelRegistrationCompleteFragmentArgs build() {
      MotelRegistrationCompleteFragmentArgs result = new MotelRegistrationCompleteFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setMotelRegistration(@NonNull MotelRegistration motelRegistration) {
      if (motelRegistration == null) {
        throw new IllegalArgumentException("Argument \"motelRegistration\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("motelRegistration", motelRegistration);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public MotelRegistration getMotelRegistration() {
      return (MotelRegistration) arguments.get("motelRegistration");
    }
  }
}
