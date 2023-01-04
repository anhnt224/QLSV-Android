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

public class StudentInfoFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private StudentInfoFragmentArgs() {
  }

  private StudentInfoFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static StudentInfoFragmentArgs fromBundle(@NonNull Bundle bundle) {
    StudentInfoFragmentArgs __result = new StudentInfoFragmentArgs();
    bundle.setClassLoader(StudentInfoFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("studentId")) {
      String studentId;
      studentId = bundle.getString("studentId");
      if (studentId == null) {
        throw new IllegalArgumentException("Argument \"studentId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("studentId", studentId);
    } else {
      throw new IllegalArgumentException("Required argument \"studentId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getStudentId() {
    return (String) arguments.get("studentId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("studentId")) {
      String studentId = (String) arguments.get("studentId");
      __result.putString("studentId", studentId);
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
    StudentInfoFragmentArgs that = (StudentInfoFragmentArgs) object;
    if (arguments.containsKey("studentId") != that.arguments.containsKey("studentId")) {
      return false;
    }
    if (getStudentId() != null ? !getStudentId().equals(that.getStudentId()) : that.getStudentId() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getStudentId() != null ? getStudentId().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "StudentInfoFragmentArgs{"
        + "studentId=" + getStudentId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(StudentInfoFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String studentId) {
      if (studentId == null) {
        throw new IllegalArgumentException("Argument \"studentId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentId", studentId);
    }

    @NonNull
    public StudentInfoFragmentArgs build() {
      StudentInfoFragmentArgs result = new StudentInfoFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setStudentId(@NonNull String studentId) {
      if (studentId == null) {
        throw new IllegalArgumentException("Argument \"studentId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentId", studentId);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getStudentId() {
      return (String) arguments.get("studentId");
    }
  }
}
