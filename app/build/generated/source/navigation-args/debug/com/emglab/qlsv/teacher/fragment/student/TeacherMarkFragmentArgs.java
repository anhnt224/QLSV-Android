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

public class TeacherMarkFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private TeacherMarkFragmentArgs() {
  }

  private TeacherMarkFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static TeacherMarkFragmentArgs fromBundle(@NonNull Bundle bundle) {
    TeacherMarkFragmentArgs __result = new TeacherMarkFragmentArgs();
    bundle.setClassLoader(TeacherMarkFragmentArgs.class.getClassLoader());
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
    if (bundle.containsKey("studentName")) {
      String studentName;
      studentName = bundle.getString("studentName");
      if (studentName == null) {
        throw new IllegalArgumentException("Argument \"studentName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("studentName", studentName);
    } else {
      throw new IllegalArgumentException("Required argument \"studentName\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("semester")) {
      String semester;
      semester = bundle.getString("semester");
      if (semester == null) {
        throw new IllegalArgumentException("Argument \"semester\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("semester", semester);
    } else {
      throw new IllegalArgumentException("Required argument \"semester\" is missing and does not have an android:defaultValue");
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
  public String getStudentName() {
    return (String) arguments.get("studentName");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getSemester() {
    return (String) arguments.get("semester");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("studentId")) {
      String studentId = (String) arguments.get("studentId");
      __result.putString("studentId", studentId);
    }
    if (arguments.containsKey("studentName")) {
      String studentName = (String) arguments.get("studentName");
      __result.putString("studentName", studentName);
    }
    if (arguments.containsKey("semester")) {
      String semester = (String) arguments.get("semester");
      __result.putString("semester", semester);
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
    TeacherMarkFragmentArgs that = (TeacherMarkFragmentArgs) object;
    if (arguments.containsKey("studentId") != that.arguments.containsKey("studentId")) {
      return false;
    }
    if (getStudentId() != null ? !getStudentId().equals(that.getStudentId()) : that.getStudentId() != null) {
      return false;
    }
    if (arguments.containsKey("studentName") != that.arguments.containsKey("studentName")) {
      return false;
    }
    if (getStudentName() != null ? !getStudentName().equals(that.getStudentName()) : that.getStudentName() != null) {
      return false;
    }
    if (arguments.containsKey("semester") != that.arguments.containsKey("semester")) {
      return false;
    }
    if (getSemester() != null ? !getSemester().equals(that.getSemester()) : that.getSemester() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getStudentId() != null ? getStudentId().hashCode() : 0);
    result = 31 * result + (getStudentName() != null ? getStudentName().hashCode() : 0);
    result = 31 * result + (getSemester() != null ? getSemester().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "TeacherMarkFragmentArgs{"
        + "studentId=" + getStudentId()
        + ", studentName=" + getStudentName()
        + ", semester=" + getSemester()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(TeacherMarkFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String studentId, @NonNull String studentName,
        @NonNull String semester) {
      if (studentId == null) {
        throw new IllegalArgumentException("Argument \"studentId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentId", studentId);
      if (studentName == null) {
        throw new IllegalArgumentException("Argument \"studentName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentName", studentName);
      if (semester == null) {
        throw new IllegalArgumentException("Argument \"semester\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("semester", semester);
    }

    @NonNull
    public TeacherMarkFragmentArgs build() {
      TeacherMarkFragmentArgs result = new TeacherMarkFragmentArgs(arguments);
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

    @NonNull
    public Builder setStudentName(@NonNull String studentName) {
      if (studentName == null) {
        throw new IllegalArgumentException("Argument \"studentName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentName", studentName);
      return this;
    }

    @NonNull
    public Builder setSemester(@NonNull String semester) {
      if (semester == null) {
        throw new IllegalArgumentException("Argument \"semester\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("semester", semester);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getStudentId() {
      return (String) arguments.get("studentId");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getStudentName() {
      return (String) arguments.get("studentName");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getSemester() {
      return (String) arguments.get("semester");
    }
  }
}
