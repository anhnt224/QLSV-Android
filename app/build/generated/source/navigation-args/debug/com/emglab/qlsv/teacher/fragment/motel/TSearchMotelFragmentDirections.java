package com.emglab.qlsv.teacher.fragment.motel;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.Motel;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TSearchMotelFragmentDirections {
  private TSearchMotelFragmentDirections() {
  }

  @NonNull
  public static ActionTSearchMotelFragmentToTMotelInfoFragment actionTSearchMotelFragmentToTMotelInfoFragment(
      @NonNull Motel motel) {
    return new ActionTSearchMotelFragmentToTMotelInfoFragment(motel);
  }

  public static class ActionTSearchMotelFragmentToTMotelInfoFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTSearchMotelFragmentToTMotelInfoFragment(@NonNull Motel motel) {
      if (motel == null) {
        throw new IllegalArgumentException("Argument \"motel\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("motel", motel);
    }

    @NonNull
    public ActionTSearchMotelFragmentToTMotelInfoFragment setMotel(@NonNull Motel motel) {
      if (motel == null) {
        throw new IllegalArgumentException("Argument \"motel\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("motel", motel);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_TSearchMotelFragment_to_TMotelInfoFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Motel getMotel() {
      return (Motel) arguments.get("motel");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTSearchMotelFragmentToTMotelInfoFragment that = (ActionTSearchMotelFragmentToTMotelInfoFragment) object;
      if (arguments.containsKey("motel") != that.arguments.containsKey("motel")) {
        return false;
      }
      if (getMotel() != null ? !getMotel().equals(that.getMotel()) : that.getMotel() != null) {
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
      result = 31 * result + (getMotel() != null ? getMotel().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTSearchMotelFragmentToTMotelInfoFragment(actionId=" + getActionId() + "){"
          + "motel=" + getMotel()
          + "}";
    }
  }
}
