package com.emglab.qlsv.teacher.fragment.form;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.emglab.qlsv.models.entity.Form;
import com.emglab.qlsv.models.entity.Question;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.HashMap;

public class TEditFormFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private TEditFormFragmentArgs() {
  }

  private TEditFormFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static TEditFormFragmentArgs fromBundle(@NonNull Bundle bundle) {
    TEditFormFragmentArgs __result = new TEditFormFragmentArgs();
    bundle.setClassLoader(TEditFormFragmentArgs.class.getClassLoader());
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
    if (bundle.containsKey("questions")) {
      Question[] questions;
      Parcelable[] __array = bundle.getParcelableArray("questions");
      if (__array != null) {
        questions = new Question[__array.length];
        System.arraycopy(__array, 0, questions, 0, __array.length);
      } else {
        questions = null;
      }
      if (questions == null) {
        throw new IllegalArgumentException("Argument \"questions\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("questions", questions);
    } else {
      throw new IllegalArgumentException("Required argument \"questions\" is missing and does not have an android:defaultValue");
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
  public Question[] getQuestions() {
    return (Question[]) arguments.get("questions");
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
    if (arguments.containsKey("questions")) {
      Question[] questions = (Question[]) arguments.get("questions");
      __result.putParcelableArray("questions", questions);
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
    TEditFormFragmentArgs that = (TEditFormFragmentArgs) object;
    if (arguments.containsKey("form") != that.arguments.containsKey("form")) {
      return false;
    }
    if (getForm() != null ? !getForm().equals(that.getForm()) : that.getForm() != null) {
      return false;
    }
    if (arguments.containsKey("questions") != that.arguments.containsKey("questions")) {
      return false;
    }
    if (getQuestions() != null ? !getQuestions().equals(that.getQuestions()) : that.getQuestions() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getForm() != null ? getForm().hashCode() : 0);
    result = 31 * result + java.util.Arrays.hashCode(getQuestions());
    return result;
  }

  @Override
  public String toString() {
    return "TEditFormFragmentArgs{"
        + "form=" + getForm()
        + ", questions=" + getQuestions()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(TEditFormFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Form form, @NonNull Question[] questions) {
      if (form == null) {
        throw new IllegalArgumentException("Argument \"form\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("form", form);
      if (questions == null) {
        throw new IllegalArgumentException("Argument \"questions\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("questions", questions);
    }

    @NonNull
    public TEditFormFragmentArgs build() {
      TEditFormFragmentArgs result = new TEditFormFragmentArgs(arguments);
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

    @NonNull
    public Builder setQuestions(@NonNull Question[] questions) {
      if (questions == null) {
        throw new IllegalArgumentException("Argument \"questions\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("questions", questions);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Form getForm() {
      return (Form) arguments.get("form");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Question[] getQuestions() {
      return (Question[]) arguments.get("questions");
    }
  }
}
