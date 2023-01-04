package com.emglab.qlsv.ui.fragments.gift;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.emglab.qlsv.models.entity.gift.Gift;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GiftInfoFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private GiftInfoFragmentArgs() {
  }

  private GiftInfoFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static GiftInfoFragmentArgs fromBundle(@NonNull Bundle bundle) {
    GiftInfoFragmentArgs __result = new GiftInfoFragmentArgs();
    bundle.setClassLoader(GiftInfoFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("gift")) {
      Gift gift;
      if (Parcelable.class.isAssignableFrom(Gift.class) || Serializable.class.isAssignableFrom(Gift.class)) {
        gift = (Gift) bundle.get("gift");
      } else {
        throw new UnsupportedOperationException(Gift.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (gift == null) {
        throw new IllegalArgumentException("Argument \"gift\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("gift", gift);
    } else {
      throw new IllegalArgumentException("Required argument \"gift\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Gift getGift() {
    return (Gift) arguments.get("gift");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("gift")) {
      Gift gift = (Gift) arguments.get("gift");
      if (Parcelable.class.isAssignableFrom(Gift.class) || gift == null) {
        __result.putParcelable("gift", Parcelable.class.cast(gift));
      } else if (Serializable.class.isAssignableFrom(Gift.class)) {
        __result.putSerializable("gift", Serializable.class.cast(gift));
      } else {
        throw new UnsupportedOperationException(Gift.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
    GiftInfoFragmentArgs that = (GiftInfoFragmentArgs) object;
    if (arguments.containsKey("gift") != that.arguments.containsKey("gift")) {
      return false;
    }
    if (getGift() != null ? !getGift().equals(that.getGift()) : that.getGift() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getGift() != null ? getGift().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "GiftInfoFragmentArgs{"
        + "gift=" + getGift()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(GiftInfoFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Gift gift) {
      if (gift == null) {
        throw new IllegalArgumentException("Argument \"gift\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("gift", gift);
    }

    @NonNull
    public GiftInfoFragmentArgs build() {
      GiftInfoFragmentArgs result = new GiftInfoFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setGift(@NonNull Gift gift) {
      if (gift == null) {
        throw new IllegalArgumentException("Argument \"gift\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("gift", gift);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Gift getGift() {
      return (Gift) arguments.get("gift");
    }
  }
}
