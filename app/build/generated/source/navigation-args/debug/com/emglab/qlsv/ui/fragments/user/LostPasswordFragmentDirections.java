package com.emglab.qlsv.ui.fragments.user;

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

public class LostPasswordFragmentDirections {
  private LostPasswordFragmentDirections() {
  }

  @NonNull
  public static ActionLostPasswordFragmentToCheckOTPLostPasswordFragment actionLostPasswordFragmentToCheckOTPLostPasswordFragment(
      @NonNull String UserCode) {
    return new ActionLostPasswordFragmentToCheckOTPLostPasswordFragment(UserCode);
  }

  public static class ActionLostPasswordFragmentToCheckOTPLostPasswordFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionLostPasswordFragmentToCheckOTPLostPasswordFragment(@NonNull String UserCode) {
      if (UserCode == null) {
        throw new IllegalArgumentException("Argument \"UserCode\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("UserCode", UserCode);
    }

    @NonNull
    public ActionLostPasswordFragmentToCheckOTPLostPasswordFragment setUserCode(
        @NonNull String UserCode) {
      if (UserCode == null) {
        throw new IllegalArgumentException("Argument \"UserCode\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("UserCode", UserCode);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("UserCode")) {
        String UserCode = (String) arguments.get("UserCode");
        __result.putString("UserCode", UserCode);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_lostPasswordFragment_to_checkOTPLostPasswordFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getUserCode() {
      return (String) arguments.get("UserCode");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionLostPasswordFragmentToCheckOTPLostPasswordFragment that = (ActionLostPasswordFragmentToCheckOTPLostPasswordFragment) object;
      if (arguments.containsKey("UserCode") != that.arguments.containsKey("UserCode")) {
        return false;
      }
      if (getUserCode() != null ? !getUserCode().equals(that.getUserCode()) : that.getUserCode() != null) {
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
      result = 31 * result + (getUserCode() != null ? getUserCode().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionLostPasswordFragmentToCheckOTPLostPasswordFragment(actionId=" + getActionId() + "){"
          + "UserCode=" + getUserCode()
          + "}";
    }
  }
}
