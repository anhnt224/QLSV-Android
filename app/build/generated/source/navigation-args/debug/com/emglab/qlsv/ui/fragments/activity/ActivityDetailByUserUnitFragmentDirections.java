package com.emglab.qlsv.ui.fragments.activity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ActivityDetailByUserUnitFragmentDirections {
  private ActivityDetailByUserUnitFragmentDirections() {
  }

  @NonNull
  public static ActionActivityDetailByUserUnitFragmentToUserCheckInActivityInfoFragment actionActivityDetailByUserUnitFragmentToUserCheckInActivityInfoFragment(
      int AId, @NonNull String UserCode, int AGId, @NonNull String AName) {
    return new ActionActivityDetailByUserUnitFragmentToUserCheckInActivityInfoFragment(AId, UserCode, AGId, AName);
  }

  public static class ActionActivityDetailByUserUnitFragmentToUserCheckInActivityInfoFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionActivityDetailByUserUnitFragmentToUserCheckInActivityInfoFragment(int AId,
        @NonNull String UserCode, int AGId, @NonNull String AName) {
      this.arguments.put("AId", AId);
      if (UserCode == null) {
        throw new IllegalArgumentException("Argument \"UserCode\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("UserCode", UserCode);
      this.arguments.put("AGId", AGId);
      if (AName == null) {
        throw new IllegalArgumentException("Argument \"AName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("AName", AName);
    }

    @NonNull
    public ActionActivityDetailByUserUnitFragmentToUserCheckInActivityInfoFragment setAId(int AId) {
      this.arguments.put("AId", AId);
      return this;
    }

    @NonNull
    public ActionActivityDetailByUserUnitFragmentToUserCheckInActivityInfoFragment setUserCode(
        @NonNull String UserCode) {
      if (UserCode == null) {
        throw new IllegalArgumentException("Argument \"UserCode\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("UserCode", UserCode);
      return this;
    }

    @NonNull
    public ActionActivityDetailByUserUnitFragmentToUserCheckInActivityInfoFragment setAGId(
        int AGId) {
      this.arguments.put("AGId", AGId);
      return this;
    }

    @NonNull
    public ActionActivityDetailByUserUnitFragmentToUserCheckInActivityInfoFragment setAName(
        @NonNull String AName) {
      if (AName == null) {
        throw new IllegalArgumentException("Argument \"AName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("AName", AName);
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
      if (arguments.containsKey("UserCode")) {
        String UserCode = (String) arguments.get("UserCode");
        __result.putString("UserCode", UserCode);
      }
      if (arguments.containsKey("AGId")) {
        int AGId = (int) arguments.get("AGId");
        __result.putInt("AGId", AGId);
      }
      if (arguments.containsKey("AName")) {
        String AName = (String) arguments.get("AName");
        __result.putString("AName", AName);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_activityDetailByUserUnitFragment_to_userCheckInActivityInfoFragment;
    }

    @SuppressWarnings("unchecked")
    public int getAId() {
      return (int) arguments.get("AId");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getUserCode() {
      return (String) arguments.get("UserCode");
    }

    @SuppressWarnings("unchecked")
    public int getAGId() {
      return (int) arguments.get("AGId");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getAName() {
      return (String) arguments.get("AName");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionActivityDetailByUserUnitFragmentToUserCheckInActivityInfoFragment that = (ActionActivityDetailByUserUnitFragmentToUserCheckInActivityInfoFragment) object;
      if (arguments.containsKey("AId") != that.arguments.containsKey("AId")) {
        return false;
      }
      if (getAId() != that.getAId()) {
        return false;
      }
      if (arguments.containsKey("UserCode") != that.arguments.containsKey("UserCode")) {
        return false;
      }
      if (getUserCode() != null ? !getUserCode().equals(that.getUserCode()) : that.getUserCode() != null) {
        return false;
      }
      if (arguments.containsKey("AGId") != that.arguments.containsKey("AGId")) {
        return false;
      }
      if (getAGId() != that.getAGId()) {
        return false;
      }
      if (arguments.containsKey("AName") != that.arguments.containsKey("AName")) {
        return false;
      }
      if (getAName() != null ? !getAName().equals(that.getAName()) : that.getAName() != null) {
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
      result = 31 * result + (getUserCode() != null ? getUserCode().hashCode() : 0);
      result = 31 * result + getAGId();
      result = 31 * result + (getAName() != null ? getAName().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionActivityDetailByUserUnitFragmentToUserCheckInActivityInfoFragment(actionId=" + getActionId() + "){"
          + "AId=" + getAId()
          + ", UserCode=" + getUserCode()
          + ", AGId=" + getAGId()
          + ", AName=" + getAName()
          + "}";
    }
  }
}
