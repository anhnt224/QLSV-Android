package com.emglab.qlsv.teacher.fragment.gift;

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

public class TApplyGiftFragmentDirections {
  private TApplyGiftFragmentDirections() {
  }

  @NonNull
  public static ActionTApplyGiftFragmentToTGiftFragment actionTApplyGiftFragmentToTGiftFragment(
      boolean reloadData) {
    return new ActionTApplyGiftFragmentToTGiftFragment(reloadData);
  }

  @NonNull
  public static NavDirections actionTApplyGiftFragmentToTReceiverAddressFragment() {
    return new ActionOnlyNavDirections(R.id.action_TApplyGiftFragment_to_TReceiverAddressFragment);
  }

  public static class ActionTApplyGiftFragmentToTGiftFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTApplyGiftFragmentToTGiftFragment(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
    }

    @NonNull
    public ActionTApplyGiftFragmentToTGiftFragment setReloadData(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("reloadData")) {
        boolean reloadData = (boolean) arguments.get("reloadData");
        __result.putBoolean("reloadData", reloadData);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_TApplyGiftFragment_to_TGiftFragment;
    }

    @SuppressWarnings("unchecked")
    public boolean getReloadData() {
      return (boolean) arguments.get("reloadData");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTApplyGiftFragmentToTGiftFragment that = (ActionTApplyGiftFragmentToTGiftFragment) object;
      if (arguments.containsKey("reloadData") != that.arguments.containsKey("reloadData")) {
        return false;
      }
      if (getReloadData() != that.getReloadData()) {
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
      result = 31 * result + (getReloadData() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTApplyGiftFragmentToTGiftFragment(actionId=" + getActionId() + "){"
          + "reloadData=" + getReloadData()
          + "}";
    }
  }
}
