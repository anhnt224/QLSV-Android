package com.emglab.qlsv.ui.fragments.scholarShip;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.ScholarShip;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ListScholarShipsFragmentDirections {
  private ListScholarShipsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListScholarShipsFragmentToListScholarShipAppliedFragment() {
    return new ActionOnlyNavDirections(R.id.action_listScholarShipsFragment_to_listScholarShipAppliedFragment);
  }

  @NonNull
  public static ActionListScholarShipsFragmentToScholarShipDetailFragment actionListScholarShipsFragmentToScholarShipDetailFragment(
      @NonNull ScholarShip scholarShip) {
    return new ActionListScholarShipsFragmentToScholarShipDetailFragment(scholarShip);
  }

  public static class ActionListScholarShipsFragmentToScholarShipDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionListScholarShipsFragmentToScholarShipDetailFragment(
        @NonNull ScholarShip scholarShip) {
      if (scholarShip == null) {
        throw new IllegalArgumentException("Argument \"scholarShip\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("scholarShip", scholarShip);
    }

    @NonNull
    public ActionListScholarShipsFragmentToScholarShipDetailFragment setScholarShip(
        @NonNull ScholarShip scholarShip) {
      if (scholarShip == null) {
        throw new IllegalArgumentException("Argument \"scholarShip\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("scholarShip", scholarShip);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_listScholarShipsFragment_to_scholarShipDetailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public ScholarShip getScholarShip() {
      return (ScholarShip) arguments.get("scholarShip");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionListScholarShipsFragmentToScholarShipDetailFragment that = (ActionListScholarShipsFragmentToScholarShipDetailFragment) object;
      if (arguments.containsKey("scholarShip") != that.arguments.containsKey("scholarShip")) {
        return false;
      }
      if (getScholarShip() != null ? !getScholarShip().equals(that.getScholarShip()) : that.getScholarShip() != null) {
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
      result = 31 * result + (getScholarShip() != null ? getScholarShip().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionListScholarShipsFragmentToScholarShipDetailFragment(actionId=" + getActionId() + "){"
          + "scholarShip=" + getScholarShip()
          + "}";
    }
  }
}
