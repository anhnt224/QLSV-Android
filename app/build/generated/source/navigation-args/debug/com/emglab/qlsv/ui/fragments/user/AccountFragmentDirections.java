package com.emglab.qlsv.ui.fragments.user;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class AccountFragmentDirections {
  private AccountFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAccountFragmentToQrStudentFragment() {
    return new ActionOnlyNavDirections(R.id.action_accountFragment_to_qrStudentFragment);
  }

  @NonNull
  public static NavDirections actionAccountFragmentToUserInfoFragment() {
    return new ActionOnlyNavDirections(R.id.action_accountFragment_to_userInfoFragment);
  }

  @NonNull
  public static NavDirections actionAccountFragmentToChangePasswordFragment() {
    return new ActionOnlyNavDirections(R.id.action_accountFragment_to_changePasswordFragment);
  }

  @NonNull
  public static NavDirections actionAccountFragmentToListAddressFragment() {
    return new ActionOnlyNavDirections(R.id.action_accountFragment_to_listAddressFragment);
  }

  @NonNull
  public static ActionAccountFragmentToActivityDetailByUserUnitFragment actionAccountFragmentToActivityDetailByUserUnitFragment(
      int AId) {
    return new ActionAccountFragmentToActivityDetailByUserUnitFragment(AId);
  }

  @NonNull
  public static NavDirections actionAccountFragmentToNotesFragment() {
    return new ActionOnlyNavDirections(R.id.action_accountFragment_to_notesFragment);
  }

  @NonNull
  public static NavDirections actionAccountFragmentToRunDashboardFragment() {
    return new ActionOnlyNavDirections(R.id.action_accountFragment_to_runDashboardFragment);
  }

  @NonNull
  public static ActionAccountFragmentToImageMotelFragment actionAccountFragmentToImageMotelFragment(
      int motelID) {
    return new ActionAccountFragmentToImageMotelFragment(motelID);
  }

  public static class ActionAccountFragmentToActivityDetailByUserUnitFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionAccountFragmentToActivityDetailByUserUnitFragment(int AId) {
      this.arguments.put("AId", AId);
    }

    @NonNull
    public ActionAccountFragmentToActivityDetailByUserUnitFragment setAId(int AId) {
      this.arguments.put("AId", AId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("AId")) {
        int AId = (int) arguments.get("AId");
        __result.putInt("AId", AId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_accountFragment_to_activityDetailByUserUnitFragment;
    }

    @SuppressWarnings("unchecked")
    public int getAId() {
      return (int) arguments.get("AId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionAccountFragmentToActivityDetailByUserUnitFragment that = (ActionAccountFragmentToActivityDetailByUserUnitFragment) object;
      if (arguments.containsKey("AId") != that.arguments.containsKey("AId")) {
        return false;
      }
      if (getAId() != that.getAId()) {
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
      result = 31 * result + getAId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionAccountFragmentToActivityDetailByUserUnitFragment(actionId=" + getActionId() + "){"
          + "AId=" + getAId()
          + "}";
    }
  }

  public static class ActionAccountFragmentToImageMotelFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionAccountFragmentToImageMotelFragment(int motelID) {
      this.arguments.put("motelID", motelID);
    }

    @NonNull
    public ActionAccountFragmentToImageMotelFragment setMotelID(int motelID) {
      this.arguments.put("motelID", motelID);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("motelID")) {
        int motelID = (int) arguments.get("motelID");
        __result.putInt("motelID", motelID);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_accountFragment_to_imageMotelFragment;
    }

    @SuppressWarnings("unchecked")
    public int getMotelID() {
      return (int) arguments.get("motelID");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionAccountFragmentToImageMotelFragment that = (ActionAccountFragmentToImageMotelFragment) object;
      if (arguments.containsKey("motelID") != that.arguments.containsKey("motelID")) {
        return false;
      }
      if (getMotelID() != that.getMotelID()) {
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
      result = 31 * result + getMotelID();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionAccountFragmentToImageMotelFragment(actionId=" + getActionId() + "){"
          + "motelID=" + getMotelID()
          + "}";
    }
  }
}
