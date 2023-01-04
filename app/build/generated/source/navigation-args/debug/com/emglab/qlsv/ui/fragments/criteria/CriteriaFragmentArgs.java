package com.emglab.qlsv.ui.fragments.criteria;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.emglab.qlsv.models.entity.Semester;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.HashMap;

public class CriteriaFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private CriteriaFragmentArgs() {
  }

  private CriteriaFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static CriteriaFragmentArgs fromBundle(@NonNull Bundle bundle) {
    CriteriaFragmentArgs __result = new CriteriaFragmentArgs();
    bundle.setClassLoader(CriteriaFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("semester")) {
      Semester semester;
      if (Parcelable.class.isAssignableFrom(Semester.class) || Serializable.class.isAssignableFrom(Semester.class)) {
        semester = (Semester) bundle.get("semester");
      } else {
        throw new UnsupportedOperationException(Semester.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (semester == null) {
        throw new IllegalArgumentException("Argument \"semester\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("semester", semester);
    } else {
      throw new IllegalArgumentException("Required argument \"semester\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("semesters")) {
      Semester[] semesters;
      Parcelable[] __array = bundle.getParcelableArray("semesters");
      if (__array != null) {
        semesters = new Semester[__array.length];
        System.arraycopy(__array, 0, semesters, 0, __array.length);
      } else {
        semesters = null;
      }
      if (semesters == null) {
        throw new IllegalArgumentException("Argument \"semesters\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("semesters", semesters);
    } else {
      throw new IllegalArgumentException("Required argument \"semesters\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Semester getSemester() {
    return (Semester) arguments.get("semester");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Semester[] getSemesters() {
    return (Semester[]) arguments.get("semesters");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("semester")) {
      Semester semester = (Semester) arguments.get("semester");
      if (Parcelable.class.isAssignableFrom(Semester.class) || semester == null) {
        __result.putParcelable("semester", Parcelable.class.cast(semester));
      } else if (Serializable.class.isAssignableFrom(Semester.class)) {
        __result.putSerializable("semester", Serializable.class.cast(semester));
      } else {
        throw new UnsupportedOperationException(Semester.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    if (arguments.containsKey("semesters")) {
      Semester[] semesters = (Semester[]) arguments.get("semesters");
      __result.putParcelableArray("semesters", semesters);
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
    CriteriaFragmentArgs that = (CriteriaFragmentArgs) object;
    if (arguments.containsKey("semester") != that.arguments.containsKey("semester")) {
      return false;
    }
    if (getSemester() != null ? !getSemester().equals(that.getSemester()) : that.getSemester() != null) {
      return false;
    }
    if (arguments.containsKey("semesters") != that.arguments.containsKey("semesters")) {
      return false;
    }
    if (getSemesters() != null ? !getSemesters().equals(that.getSemesters()) : that.getSemesters() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getSemester() != null ? getSemester().hashCode() : 0);
    result = 31 * result + java.util.Arrays.hashCode(getSemesters());
    return result;
  }

  @Override
  public String toString() {
    return "CriteriaFragmentArgs{"
        + "semester=" + getSemester()
        + ", semesters=" + getSemesters()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(CriteriaFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Semester semester, @NonNull Semester[] semesters) {
      if (semester == null) {
        throw new IllegalArgumentException("Argument \"semester\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("semester", semester);
      if (semesters == null) {
        throw new IllegalArgumentException("Argument \"semesters\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("semesters", semesters);
    }

    @NonNull
    public CriteriaFragmentArgs build() {
      CriteriaFragmentArgs result = new CriteriaFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setSemester(@NonNull Semester semester) {
      if (semester == null) {
        throw new IllegalArgumentException("Argument \"semester\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("semester", semester);
      return this;
    }

    @NonNull
    public Builder setSemesters(@NonNull Semester[] semesters) {
      if (semesters == null) {
        throw new IllegalArgumentException("Argument \"semesters\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("semesters", semesters);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Semester getSemester() {
      return (Semester) arguments.get("semester");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Semester[] getSemesters() {
      return (Semester[]) arguments.get("semesters");
    }
  }
}
