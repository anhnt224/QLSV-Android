package com.emglab.qlsv.teacher.fragment.form;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.Form;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TListFormFragmentDirections {
  private TListFormFragmentDirections() {
  }

  @NonNull
  public static ActionTListFormFragmentToTFormDetailFragment actionTListFormFragmentToTFormDetailFragment(
      @NonNull Form form) {
    return new ActionTListFormFragmentToTFormDetailFragment(form);
  }

  @NonNull
  public static NavDirections actionTListFormFragmentToTListFormRegisteredFragment() {
    return new ActionOnlyNavDirections(R.id.action_TListFormFragment_to_TListFormRegisteredFragment);
  }

  public static class ActionTListFormFragmentToTFormDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTListFormFragmentToTFormDetailFragment(@NonNull Form form) {
      if (form == null) {
        throw new IllegalArgumentException("Argument \"form\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("form", form);
    }

    @NonNull
    public ActionTListFormFragmentToTFormDetailFragment setForm(@NonNull Form form) {
      if (form == null) {
        throw new IllegalArgumentException("Argument \"form\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("form", form);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("form")) {
        Form form = (Form) arguments.get("form");
        if (Parcelable.class.isAssignableFrom(Form.class) || form == null) {
          __result.putParcelable("form", Parcelable.class.cast(form));
        } else if (Serializable.class.isAssignableFrom(Form.class)) {
          __result.putSerializable("form", Serializable.class.cast(form));
        } else {
          throw new UnsupportedOperationException(Form.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_TListFormFragment_to_TFormDetailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Form getForm() {
      return (Form) arguments.get("form");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTListFormFragmentToTFormDetailFragment that = (ActionTListFormFragmentToTFormDetailFragment) object;
      if (arguments.containsKey("form") != that.arguments.containsKey("form")) {
        return false;
      }
      if (getForm() != null ? !getForm().equals(that.getForm()) : that.getForm() != null) {
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
      result = 31 * result + (getForm() != null ? getForm().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTListFormFragmentToTFormDetailFragment(actionId=" + getActionId() + "){"
          + "form=" + getForm()
          + "}";
    }
  }
}
