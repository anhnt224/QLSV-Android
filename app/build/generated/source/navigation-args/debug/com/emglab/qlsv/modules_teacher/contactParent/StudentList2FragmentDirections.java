package com.emglab.qlsv.modules_teacher.contactParent;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class StudentList2FragmentDirections {
  private StudentList2FragmentDirections() {
  }

  @NonNull
  public static ActionStudentList2FragmentToStudentInfoFragment actionStudentList2FragmentToStudentInfoFragment(
      @NonNull String studentId) {
    return new ActionStudentList2FragmentToStudentInfoFragment(studentId);
  }

  @NonNull
  public static ActionStudentList2FragmentToTStudentNoteFragment actionStudentList2FragmentToTStudentNoteFragment(
      @NonNull String studentID) {
    return new ActionStudentList2FragmentToTStudentNoteFragment(studentID);
  }

  public static class ActionStudentList2FragmentToStudentInfoFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionStudentList2FragmentToStudentInfoFragment(@NonNull String studentId) {
      if (studentId == null) {
        throw new IllegalArgumentException("Argument \"studentId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentId", studentId);
    }

    @NonNull
    public ActionStudentList2FragmentToStudentInfoFragment setStudentId(@NonNull String studentId) {
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
      return R.id.action_studentList2Fragment_to_studentInfoFragment;
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
      ActionStudentList2FragmentToStudentInfoFragment that = (ActionStudentList2FragmentToStudentInfoFragment) object;
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
      return "ActionStudentList2FragmentToStudentInfoFragment(actionId=" + getActionId() + "){"
          + "studentId=" + getStudentId()
          + "}";
    }
  }

  public static class ActionStudentList2FragmentToTStudentNoteFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionStudentList2FragmentToTStudentNoteFragment(@NonNull String studentID) {
      if (studentID == null) {
        throw new IllegalArgumentException("Argument \"studentID\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentID", studentID);
    }

    @NonNull
    public ActionStudentList2FragmentToTStudentNoteFragment setStudentID(
        @NonNull String studentID) {
      if (studentID == null) {
        throw new IllegalArgumentException("Argument \"studentID\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentID", studentID);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("studentID")) {
        String studentID = (String) arguments.get("studentID");
        __result.putString("studentID", studentID);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_studentList2Fragment_to_TStudentNoteFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getStudentID() {
      return (String) arguments.get("studentID");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionStudentList2FragmentToTStudentNoteFragment that = (ActionStudentList2FragmentToTStudentNoteFragment) object;
      if (arguments.containsKey("studentID") != that.arguments.containsKey("studentID")) {
        return false;
      }
      if (getStudentID() != null ? !getStudentID().equals(that.getStudentID()) : that.getStudentID() != null) {
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
      result = 31 * result + (getStudentID() != null ? getStudentID().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionStudentList2FragmentToTStudentNoteFragment(actionId=" + getActionId() + "){"
          + "studentID=" + getStudentID()
          + "}";
    }
  }
}
