package com.emglab.qlsv.modules.searchMotel.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistration;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MotelRegistrationProcessingFragmentDirections {
  private MotelRegistrationProcessingFragmentDirections() {
  }

  @NonNull
  public static ActionMotelRegistrationProcessingFragmentToMotelRegistrationInfoFragment actionMotelRegistrationProcessingFragmentToMotelRegistrationInfoFragment(
      @NonNull MotelRegistration motelRegistration) {
    return new ActionMotelRegistrationProcessingFragmentToMotelRegistrationInfoFragment(motelRegistration);
  }

  public static class ActionMotelRegistrationProcessingFragmentToMotelRegistrationInfoFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionMotelRegistrationProcessingFragmentToMotelRegistrationInfoFragment(
        @NonNull MotelRegistration motelRegistration) {
      if (motelRegistration == null) {
        throw new IllegalArgumentException("Argument \"motelRegistration\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("motelRegistration", motelRegistration);
    }

    @NonNull
    public ActionMotelRegistrationProcessingFragmentToMotelRegistrationInfoFragment setMotelRegistration(
        @NonNull MotelRegistration motelRegistration) {
      if (motelRegistration == null) {
        throw new IllegalArgumentException("Argument \"motelRegistration\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("motelRegistration", motelRegistration);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_motelRegistrationProcessingFragment_to_motelRegistrationInfoFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public MotelRegistration getMotelRegistration() {
      return (MotelRegistration) arguments.get("motelRegistration");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMotelRegistrationProcessingFragmentToMotelRegistrationInfoFragment that = (ActionMotelRegistrationProcessingFragmentToMotelRegistrationInfoFragment) object;
      if (arguments.containsKey("motelRegistration") != that.arguments.containsKey("motelRegistration")) {
        return false;
      }
      if (getMotelRegistration() != null ? !getMotelRegistration().equals(that.getMotelRegistration()) : that.getMotelRegistration() != null) {
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
      result = 31 * result + (getMotelRegistration() != null ? getMotelRegistration().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMotelRegistrationProcessingFragmentToMotelRegistrationInfoFragment(actionId=" + getActionId() + "){"
          + "motelRegistration=" + getMotelRegistration()
          + "}";
    }
  }
}
