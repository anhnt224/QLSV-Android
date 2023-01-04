package com.emglab.qlsv.ui.fragments.form;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavArgs;
import com.emglab.qlsv.models.entity.UserAddress;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ChooseReceiverAddressFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ChooseReceiverAddressFragmentArgs() {
  }

  private ChooseReceiverAddressFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ChooseReceiverAddressFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ChooseReceiverAddressFragmentArgs __result = new ChooseReceiverAddressFragmentArgs();
    bundle.setClassLoader(ChooseReceiverAddressFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("userAddress")) {
      UserAddress userAddress;
      if (Parcelable.class.isAssignableFrom(UserAddress.class) || Serializable.class.isAssignableFrom(UserAddress.class)) {
        userAddress = (UserAddress) bundle.get("userAddress");
      } else {
        throw new UnsupportedOperationException(UserAddress.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      __result.arguments.put("userAddress", userAddress);
    } else {
      throw new IllegalArgumentException("Required argument \"userAddress\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public UserAddress getUserAddress() {
    return (UserAddress) arguments.get("userAddress");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("userAddress")) {
      UserAddress userAddress = (UserAddress) arguments.get("userAddress");
      if (Parcelable.class.isAssignableFrom(UserAddress.class) || userAddress == null) {
        __result.putParcelable("userAddress", Parcelable.class.cast(userAddress));
      } else if (Serializable.class.isAssignableFrom(UserAddress.class)) {
        __result.putSerializable("userAddress", Serializable.class.cast(userAddress));
      } else {
        throw new UnsupportedOperationException(UserAddress.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
    ChooseReceiverAddressFragmentArgs that = (ChooseReceiverAddressFragmentArgs) object;
    if (arguments.containsKey("userAddress") != that.arguments.containsKey("userAddress")) {
      return false;
    }
    if (getUserAddress() != null ? !getUserAddress().equals(that.getUserAddress()) : that.getUserAddress() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getUserAddress() != null ? getUserAddress().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ChooseReceiverAddressFragmentArgs{"
        + "userAddress=" + getUserAddress()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ChooseReceiverAddressFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@Nullable UserAddress userAddress) {
      this.arguments.put("userAddress", userAddress);
    }

    @NonNull
    public ChooseReceiverAddressFragmentArgs build() {
      ChooseReceiverAddressFragmentArgs result = new ChooseReceiverAddressFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setUserAddress(@Nullable UserAddress userAddress) {
      this.arguments.put("userAddress", userAddress);
      return this;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public UserAddress getUserAddress() {
      return (UserAddress) arguments.get("userAddress");
    }
  }
}
