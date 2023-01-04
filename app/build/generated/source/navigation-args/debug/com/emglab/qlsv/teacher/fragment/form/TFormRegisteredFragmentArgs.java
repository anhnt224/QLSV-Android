package com.emglab.qlsv.teacher.fragment.form;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.emglab.qlsv.models.entity.Form;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TFormRegisteredFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private TFormRegisteredFragmentArgs() {
  }

  private TFormRegisteredFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static TFormRegisteredFragmentArgs fromBundle(@NonNull Bundle bundle) {
    TFormRegisteredFragmentArgs __result = new TFormRegisteredFragmentArgs();
    bundle.setClassLoader(TFormRegisteredFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("form")) {
      Form form;
      if (Parcelable.class.isAssignableFrom(Form.class) || Serializable.class.isAssignableFrom(Form.class)) {
        form = (Form) bundle.get("form");
      } else {
        throw new UnsupportedOperationException(Form.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (form == null) {
        throw new IllegalArgumentException("Argument \"form\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("form", form);
    } else {
      throw new IllegalArgumentException("Required argument \"form\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Form getForm() {
    return (Form) arguments.get("form");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    TFormRegisteredFragmentArgs that = (TFormRegisteredFragmentArgs) object;
    if (arguments.containsKey("form") != that.arguments.containsKey("form")) {
      return false;
    }
    if (getForm() != null ? !getForm().equals(that.getForm()) : that.getForm() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getForm() != null ? getForm().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "TFormRegisteredFragmentArgs{"
        + "form=" + getForm()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(TFormRegisteredFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Form form) {
      if (form == null) {
        throw new IllegalArgumentException("Argument \"form\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("form", form);
    }

    @NonNull
    public TFormRegisteredFragmentArgs build() {
      TFormRegisteredFragmentArgs result = new TFormRegisteredFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setForm(@NonNull Form form) {
      if (form == null) {
        throw new IllegalArgumentException("Argument \"form\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("form", form);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Form getForm() {
      return (Form) arguments.get("form");
    }
  }
}
