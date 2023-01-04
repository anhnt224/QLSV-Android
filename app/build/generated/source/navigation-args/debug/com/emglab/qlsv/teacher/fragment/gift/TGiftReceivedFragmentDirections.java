package com.emglab.qlsv.teacher.fragment.gift;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.gift.Gift;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TGiftReceivedFragmentDirections {
  private TGiftReceivedFragmentDirections() {
  }

  @NonNull
  public static ActionTGiftReceivedFragmentToTGiftInfoFragment actionTGiftReceivedFragmentToTGiftInfoFragment(
      @NonNull Gift gift) {
    return new ActionTGiftReceivedFragmentToTGiftInfoFragment(gift);
  }

  @NonNull
  public static ActionTGiftReceivedFragmentToTGiftFragment actionTGiftReceivedFragmentToTGiftFragment(
      boolean reloadData) {
    return new ActionTGiftReceivedFragmentToTGiftFragment(reloadData);
  }

  public static class ActionTGiftReceivedFragmentToTGiftInfoFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTGiftReceivedFragmentToTGiftInfoFragment(@NonNull Gift gift) {
      if (gift == null) {
        throw new IllegalArgumentException("Argument \"gift\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("gift", gift);
    }

    @NonNull
    public ActionTGiftReceivedFragmentToTGiftInfoFragment setGift(@NonNull Gift gift) {
      if (gift == null) {
        throw new IllegalArgumentException("Argument \"gift\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("gift", gift);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_TGiftReceivedFragment_to_TGiftInfoFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Gift getGift() {
      return (Gift) arguments.get("gift");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTGiftReceivedFragmentToTGiftInfoFragment that = (ActionTGiftReceivedFragmentToTGiftInfoFragment) object;
      if (arguments.containsKey("gift") != that.arguments.containsKey("gift")) {
        return false;
      }
      if (getGift() != null ? !getGift().equals(that.getGift()) : that.getGift() != null) {
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
      result = 31 * result + (getGift() != null ? getGift().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTGiftReceivedFragmentToTGiftInfoFragment(actionId=" + getActionId() + "){"
          + "gift=" + getGift()
          + "}";
    }
  }

  public static class ActionTGiftReceivedFragmentToTGiftFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTGiftReceivedFragmentToTGiftFragment(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
    }

    @NonNull
    public ActionTGiftReceivedFragmentToTGiftFragment setReloadData(boolean reloadData) {
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
      return R.id.action_TGiftReceivedFragment_to_TGiftFragment;
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
      ActionTGiftReceivedFragmentToTGiftFragment that = (ActionTGiftReceivedFragmentToTGiftFragment) object;
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
      return "ActionTGiftReceivedFragmentToTGiftFragment(actionId=" + getActionId() + "){"
          + "reloadData=" + getReloadData()
          + "}";
    }
  }
}
