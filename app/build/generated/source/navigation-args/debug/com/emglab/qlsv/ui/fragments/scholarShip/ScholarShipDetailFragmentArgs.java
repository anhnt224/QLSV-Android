package com.emglab.qlsv.ui.fragments.scholarShip;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.emglab.qlsv.models.entity.ScholarShip;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ScholarShipDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ScholarShipDetailFragmentArgs() {
  }

  private ScholarShipDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ScholarShipDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ScholarShipDetailFragmentArgs __result = new ScholarShipDetailFragmentArgs();
    bundle.setClassLoader(ScholarShipDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("scholarShip")) {
      ScholarShip scholarShip;
      if (Parcelable.class.isAssignableFrom(ScholarShip.class) || Serializable.class.isAssignableFrom(ScholarShip.class)) {
        scholarShip = (ScholarShip) bundle.get("scholarShip");
      } else {
        throw new UnsupportedOperationException(ScholarShip.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (scholarShip == null) {
        throw new IllegalArgumentException("Argument \"scholarShip\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("scholarShip", scholarShip);
    } else {
      throw new IllegalArgumentException("Required argument \"scholarShip\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public ScholarShip getScholarShip() {
    return (ScholarShip) arguments.get("scholarShip");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("scholarShip")) {
      ScholarShip scholarShip = (ScholarShip) arguments.get("scholarShip");
      if (Parcelable.class.isAssignableFrom(ScholarShip.class) || scholarShip == null) {
        __result.putParcelable("scholarShip", Parcelable.class.cast(scholarShip));
      } else if (Serializable.class.isAssignableFrom(ScholarShip.class)) {
        __result.putSerializable("scholarShip", Serializable.class.cast(scholarShip));
      } else {
        throw new UnsupportedOperationException(ScholarShip.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
    ScholarShipDetailFragmentArgs that = (ScholarShipDetailFragmentArgs) object;
    if (arguments.containsKey("scholarShip") != that.arguments.containsKey("scholarShip")) {
      return false;
    }
    if (getScholarShip() != null ? !getScholarShip().equals(that.getScholarShip()) : that.getScholarShip() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getScholarShip() != null ? getScholarShip().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ScholarShipDetailFragmentArgs{"
        + "scholarShip=" + getScholarShip()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ScholarShipDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull ScholarShip scholarShip) {
      if (scholarShip == null) {
        throw new IllegalArgumentException("Argument \"scholarShip\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("scholarShip", scholarShip);
    }

    @NonNull
    public ScholarShipDetailFragmentArgs build() {
      ScholarShipDetailFragmentArgs result = new ScholarShipDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setScholarShip(@NonNull ScholarShip scholarShip) {
      if (scholarShip == null) {
        throw new IllegalArgumentException("Argument \"scholarShip\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("scholarShip", scholarShip);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public ScholarShip getScholarShip() {
      return (ScholarShip) arguments.get("scholarShip");
    }
  }
}
