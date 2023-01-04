package com.emglab.qlsv.ui.fragments.form;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.emglab.qlsv.models.entity.FormQuestion;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.HashMap;

public class ChooseDeliveryTypeFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ChooseDeliveryTypeFragmentArgs() {
  }

  private ChooseDeliveryTypeFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ChooseDeliveryTypeFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ChooseDeliveryTypeFragmentArgs __result = new ChooseDeliveryTypeFragmentArgs();
    bundle.setClassLoader(ChooseDeliveryTypeFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("forms")) {
      FormQuestion[] forms;
      Parcelable[] __array = bundle.getParcelableArray("forms");
      if (__array != null) {
        forms = new FormQuestion[__array.length];
        System.arraycopy(__array, 0, forms, 0, __array.length);
      } else {
        forms = null;
      }
      if (forms == null) {
        throw new IllegalArgumentException("Argument \"forms\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("forms", forms);
    } else {
      throw new IllegalArgumentException("Required argument \"forms\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public FormQuestion[] getForms() {
    return (FormQuestion[]) arguments.get("forms");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("forms")) {
      FormQuestion[] forms = (FormQuestion[]) arguments.get("forms");
      __result.putParcelableArray("forms", forms);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ChooseDeliveryTypeFragmentArgs that = (ChooseDeliveryTypeFragmentArgs) object;
    if (arguments.containsKey("forms") != that.arguments.containsKey("forms")) {
      return false;
    }
    if (getForms() != null ? !getForms().equals(that.getForms()) : that.getForms() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + java.util.Arrays.hashCode(getForms());
    return result;
  }

  @Override
  public String toString() {
    return "ChooseDeliveryTypeFragmentArgs{"
        + "forms=" + getForms()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ChooseDeliveryTypeFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull FormQuestion[] forms) {
      if (forms == null) {
        throw new IllegalArgumentException("Argument \"forms\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("forms", forms);
    }

    @NonNull
    public ChooseDeliveryTypeFragmentArgs build() {
      ChooseDeliveryTypeFragmentArgs result = new ChooseDeliveryTypeFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setForms(@NonNull FormQuestion[] forms) {
      if (forms == null) {
        throw new IllegalArgumentException("Argument \"forms\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("forms", forms);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public FormQuestion[] getForms() {
      return (FormQuestion[]) arguments.get("forms");
    }
  }
}
