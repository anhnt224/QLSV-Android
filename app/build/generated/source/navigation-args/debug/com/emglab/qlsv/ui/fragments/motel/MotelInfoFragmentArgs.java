package com.emglab.qlsv.ui.fragments.motel;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.emglab.qlsv.models.entity.Motel;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MotelInfoFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private MotelInfoFragmentArgs() {
  }

  private MotelInfoFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MotelInfoFragmentArgs fromBundle(@NonNull Bundle bundle) {
    MotelInfoFragmentArgs __result = new MotelInfoFragmentArgs();
    bundle.setClassLoader(MotelInfoFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("motel")) {
      Motel motel;
      if (Parcelable.class.isAssignableFrom(Motel.class) || Serializable.class.isAssignableFrom(Motel.class)) {
        motel = (Motel) bundle.get("motel");
      } else {
        throw new UnsupportedOperationException(Motel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (motel == null) {
        throw new IllegalArgumentException("Argument \"motel\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("motel", motel);
    } else {
      throw new IllegalArgumentException("Required argument \"motel\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Motel getMotel() {
    return (Motel) arguments.get("motel");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("motel")) {
      Motel motel = (Motel) arguments.get("motel");
      if (Parcelable.class.isAssignableFrom(Motel.class) || motel == null) {
        __result.putParcelable("motel", Parcelable.class.cast(motel));
      } else if (Serializable.class.isAssignableFrom(Motel.class)) {
        __result.putSerializable("motel", Serializable.class.cast(motel));
      } else {
        throw new UnsupportedOperationException(Motel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
    MotelInfoFragmentArgs that = (MotelInfoFragmentArgs) object;
    if (arguments.containsKey("motel") != that.arguments.containsKey("motel")) {
      return false;
    }
    if (getMotel() != null ? !getMotel().equals(that.getMotel()) : that.getMotel() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getMotel() != null ? getMotel().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "MotelInfoFragmentArgs{"
        + "motel=" + getMotel()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(MotelInfoFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Motel motel) {
      if (motel == null) {
        throw new IllegalArgumentException("Argument \"motel\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("motel", motel);
    }

    @NonNull
    public MotelInfoFragmentArgs build() {
      MotelInfoFragmentArgs result = new MotelInfoFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setMotel(@NonNull Motel motel) {
      if (motel == null) {
        throw new IllegalArgumentException("Argument \"motel\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("motel", motel);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Motel getMotel() {
      return (Motel) arguments.get("motel");
    }
  }
}
