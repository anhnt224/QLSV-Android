package com.emglab.qlsv.ui.fragments.form;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.UserAddress;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ChooseDeliveryTypeFragmentDirections {
  private ChooseDeliveryTypeFragmentDirections() {
  }

  @NonNull
  public static ActionChooseDeliveryTypeFragmentToChooseReceiverAddressFragment actionChooseDeliveryTypeFragmentToChooseReceiverAddressFragment(
      @Nullable UserAddress userAddress) {
    return new ActionChooseDeliveryTypeFragmentToChooseReceiverAddressFragment(userAddress);
  }

  public static class ActionChooseDeliveryTypeFragmentToChooseReceiverAddressFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionChooseDeliveryTypeFragmentToChooseReceiverAddressFragment(
        @Nullable UserAddress userAddress) {
      this.arguments.put("userAddress", userAddress);
    }

    @NonNull
    public ActionChooseDeliveryTypeFragmentToChooseReceiverAddressFragment setUserAddress(
        @Nullable UserAddress userAddress) {
      this.arguments.put("userAddress", userAddress);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_chooseDeliveryTypeFragment_to_chooseReceiverAddressFragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public UserAddress getUserAddress() {
      return (UserAddress) arguments.get("userAddress");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionChooseDeliveryTypeFragmentToChooseReceiverAddressFragment that = (ActionChooseDeliveryTypeFragmentToChooseReceiverAddressFragment) object;
      if (arguments.containsKey("userAddress") != that.arguments.containsKey("userAddress")) {
        return false;
      }
      if (getUserAddress() != null ? !getUserAddress().equals(that.getUserAddress()) : that.getUserAddress() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getUserAddress() != null ? getUserAddress().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionChooseDeliveryTypeFragmentToChooseReceiverAddressFragment(actionId=" + getActionId() + "){"
          + "userAddress=" + getUserAddress()
          + "}";
    }
  }
}
