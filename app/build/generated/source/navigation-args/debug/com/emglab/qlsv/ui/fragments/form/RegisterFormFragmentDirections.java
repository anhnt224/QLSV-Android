package com.emglab.qlsv.ui.fragments.form;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.FormQuestion;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RegisterFormFragmentDirections {
  private RegisterFormFragmentDirections() {
  }

  @NonNull
  public static ActionRegisterFormFragmentToChooseDeliveryTypeFragment actionRegisterFormFragmentToChooseDeliveryTypeFragment(
      @NonNull FormQuestion[] forms) {
    return new ActionRegisterFormFragmentToChooseDeliveryTypeFragment(forms);
  }

  public static class ActionRegisterFormFragmentToChooseDeliveryTypeFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionRegisterFormFragmentToChooseDeliveryTypeFragment(@NonNull FormQuestion[] forms) {
      if (forms == null) {
        throw new IllegalArgumentException("Argument \"forms\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("forms", forms);
    }

    @NonNull
    public ActionRegisterFormFragmentToChooseDeliveryTypeFragment setForms(
        @NonNull FormQuestion[] forms) {
      if (forms == null) {
        throw new IllegalArgumentException("Argument \"forms\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("forms", forms);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("forms")) {
        FormQuestion[] forms = (FormQuestion[]) arguments.get("forms");
        __result.putParcelableArray("forms", forms);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_registerFormFragment_to_chooseDeliveryTypeFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public FormQuestion[] getForms() {
      return (FormQuestion[]) arguments.get("forms");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionRegisterFormFragmentToChooseDeliveryTypeFragment that = (ActionRegisterFormFragmentToChooseDeliveryTypeFragment) object;
      if (arguments.containsKey("forms") != that.arguments.containsKey("forms")) {
        return false;
      }
      if (getForms() != null ? !getForms().equals(that.getForms()) : that.getForms() != null) {
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
      result = 31 * result + java.util.Arrays.hashCode(getForms());
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionRegisterFormFragmentToChooseDeliveryTypeFragment(actionId=" + getActionId() + "){"
          + "forms=" + getForms()
          + "}";
    }
  }
}
