package com.emglab.qlsv.teacher.fragment.student;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.Student;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ListStudentFragmentDirections {
  private ListStudentFragmentDirections() {
  }

  @NonNull
  public static ActionListStudentFragmentToListActivitiesOfStudentFragment actionListStudentFragmentToListActivitiesOfStudentFragment(
      @NonNull Student student) {
    return new ActionListStudentFragmentToListActivitiesOfStudentFragment(student);
  }

  @NonNull
  public static ActionListStudentFragmentToTeacherMarkFragment actionListStudentFragmentToTeacherMarkFragment(
      @NonNull String studentId, @NonNull String studentName, @NonNull String semester) {
    return new ActionListStudentFragmentToTeacherMarkFragment(studentId, studentName, semester);
  }

  @NonNull
  public static ActionListStudentFragmentToStudentInfoFragment actionListStudentFragmentToStudentInfoFragment(
      @NonNull String studentId) {
    return new ActionListStudentFragmentToStudentInfoFragment(studentId);
  }

  public static class ActionListStudentFragmentToListActivitiesOfStudentFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionListStudentFragmentToListActivitiesOfStudentFragment(@NonNull Student student) {
      if (student == null) {
        throw new IllegalArgumentException("Argument \"student\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("student", student);
    }

    @NonNull
    public ActionListStudentFragmentToListActivitiesOfStudentFragment setStudent(
        @NonNull Student student) {
      if (student == null) {
        throw new IllegalArgumentException("Argument \"student\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("student", student);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_listStudentFragment_to_listActivitiesOfStudentFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Student getStudent() {
      return (Student) arguments.get("student");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionListStudentFragmentToListActivitiesOfStudentFragment that = (ActionListStudentFragmentToListActivitiesOfStudentFragment) object;
      if (arguments.containsKey("student") != that.arguments.containsKey("student")) {
        return false;
      }
      if (getStudent() != null ? !getStudent().equals(that.getStudent()) : that.getStudent() != null) {
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
      result = 31 * result + (getStudent() != null ? getStudent().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionListStudentFragmentToListActivitiesOfStudentFragment(actionId=" + getActionId() + "){"
          + "student=" + getStudent()
          + "}";
    }
  }

  public static class ActionListStudentFragmentToTeacherMarkFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionListStudentFragmentToTeacherMarkFragment(@NonNull String studentId,
        @NonNull String studentName, @NonNull String semester) {
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
    public ActionListStudentFragmentToTeacherMarkFragment setStudentId(@NonNull String studentId) {
      if (studentId == null) {
        throw new IllegalArgumentException("Argument \"studentId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentId", studentId);
      return this;
    }

    @NonNull
    public ActionListStudentFragmentToTeacherMarkFragment setStudentName(
        @NonNull String studentName) {
      if (studentName == null) {
        throw new IllegalArgumentException("Argument \"studentName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentName", studentName);
      return this;
    }

    @NonNull
    public ActionListStudentFragmentToTeacherMarkFragment setSemester(@NonNull String semester) {
      if (semester == null) {
        throw new IllegalArgumentException("Argument \"semester\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("semester", semester);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_listStudentFragment_to_teacherMarkFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionListStudentFragmentToTeacherMarkFragment that = (ActionListStudentFragmentToTeacherMarkFragment) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionListStudentFragmentToTeacherMarkFragment(actionId=" + getActionId() + "){"
          + "studentId=" + getStudentId()
          + ", studentName=" + getStudentName()
          + ", semester=" + getSemester()
          + "}";
    }
  }

  public static class ActionListStudentFragmentToStudentInfoFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionListStudentFragmentToStudentInfoFragment(@NonNull String studentId) {
      if (studentId == null) {
        throw new IllegalArgumentException("Argument \"studentId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentId", studentId);
    }

    @NonNull
    public ActionListStudentFragmentToStudentInfoFragment setStudentId(@NonNull String studentId) {
      if (studentId == null) {
        throw new IllegalArgumentException("Argument \"studentId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentId", studentId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("studentId")) {
        String studentId = (String) arguments.get("studentId");
        __result.putString("studentId", studentId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_listStudentFragment_to_studentInfoFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getStudentId() {
      return (String) arguments.get("studentId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionListStudentFragmentToStudentInfoFragment that = (ActionListStudentFragmentToStudentInfoFragment) object;
      if (arguments.containsKey("studentId") != that.arguments.containsKey("studentId")) {
        return false;
      }
      if (getStudentId() != null ? !getStudentId().equals(that.getStudentId()) : that.getStudentId() != null) {
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
      result = 31 * result + (getStudentId() != null ? getStudentId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionListStudentFragmentToStudentInfoFragment(actionId=" + getActionId() + "){"
          + "studentId=" + getStudentId()
          + "}";
    }
  }
}
