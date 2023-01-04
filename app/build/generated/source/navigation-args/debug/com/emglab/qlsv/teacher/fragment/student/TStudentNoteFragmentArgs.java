package com.emglab.qlsv.teacher.fragment.student;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TStudentNoteFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private TStudentNoteFragmentArgs() {
  }

  private TStudentNoteFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static TStudentNoteFragmentArgs fromBundle(@NonNull Bundle bundle) {
    TStudentNoteFragmentArgs __result = new TStudentNoteFragmentArgs();
    bundle.setClassLoader(TStudentNoteFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("studentID")) {
      String studentID;
      studentID = bundle.getString("studentID");
      if (studentID == null) {
        throw new IllegalArgumentException("Argument \"studentID\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("studentID", studentID);
    } else {
      throw new IllegalArgumentException("Required argument \"studentID\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getStudentID() {
    return (String) arguments.get("studentID");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("studentID")) {
      String studentID = (String) arguments.get("studentID");
      __result.putString("studentID", studentID);
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
    TStudentNoteFragmentArgs that = (TStudentNoteFragmentArgs) object;
    if (arguments.containsKey("studentID") != that.arguments.containsKey("studentID")) {
      return false;
    }
    if (getStudentID() != null ? !getStudentID().equals(that.getStudentID()) : that.getStudentID() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getStudentID() != null ? getStudentID().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "TStudentNoteFragmentArgs{"
        + "studentID=" + getStudentID()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(TStudentNoteFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String studentID) {
      if (studentID == null) {
        throw new IllegalArgumentException("Argument \"studentID\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentID", studentID);
    }

    @NonNull
    public TStudentNoteFragmentArgs build() {
      TStudentNoteFragmentArgs result = new TStudentNoteFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setStudentID(@NonNull String studentID) {
      if (studentID == null) {
        throw new IllegalArgumentException("Argument \"studentID\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentID", studentID);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getStudentID() {
      return (String) arguments.get("studentID");
    }
  }
}
