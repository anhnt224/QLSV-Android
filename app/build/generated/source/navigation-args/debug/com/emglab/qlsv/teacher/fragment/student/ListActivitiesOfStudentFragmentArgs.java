package com.emglab.qlsv.teacher.fragment.student;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.emglab.qlsv.models.entity.Student;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ListActivitiesOfStudentFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ListActivitiesOfStudentFragmentArgs() {
  }

  private ListActivitiesOfStudentFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ListActivitiesOfStudentFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ListActivitiesOfStudentFragmentArgs __result = new ListActivitiesOfStudentFragmentArgs();
    bundle.setClassLoader(ListActivitiesOfStudentFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("student")) {
      Student student;
      if (Parcelable.class.isAssignableFrom(Student.class) || Serializable.class.isAssignableFrom(Student.class)) {
        student = (Student) bundle.get("student");
      } else {
        throw new UnsupportedOperationException(Student.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (student == null) {
        throw new IllegalArgumentException("Argument \"student\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("student", student);
    } else {
      throw new IllegalArgumentException("Required argument \"student\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Student getStudent() {
    return (Student) arguments.get("student");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("student")) {
      Student student = (Student) arguments.get("student");
      if (Parcelable.class.isAssignableFrom(Student.class) || student == null) {
        __result.putParcelable("student", Parcelable.class.cast(student));
      } else if (Serializable.class.isAssignableFrom(Student.class)) {
        __result.putSerializable("student", Serializable.class.cast(student));
      } else {
        throw new UnsupportedOperationException(Student.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
    ListActivitiesOfStudentFragmentArgs that = (ListActivitiesOfStudentFragmentArgs) object;
    if (arguments.containsKey("student") != that.arguments.containsKey("student")) {
      return false;
    }
    if (getStudent() != null ? !getStudent().equals(that.getStudent()) : that.getStudent() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getStudent() != null ? getStudent().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ListActivitiesOfStudentFragmentArgs{"
        + "student=" + getStudent()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ListActivitiesOfStudentFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Student student) {
      if (student == null) {
        throw new IllegalArgumentException("Argument \"student\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("student", student);
    }

    @NonNull
    public ListActivitiesOfStudentFragmentArgs build() {
      ListActivitiesOfStudentFragmentArgs result = new ListActivitiesOfStudentFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setStudent(@NonNull Student student) {
      if (student == null) {
        throw new IllegalArgumentException("Argument \"student\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("student", student);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Student getStudent() {
      return (Student) arguments.get("student");
    }
  }
}
