package com.emglab.qlsv.teacher.fragment.student;

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

public class StudentInfoFragmentDirections {
  private StudentInfoFragmentDirections() {
  }

  @NonNull
  public static ActionStudentInfoFragmentToTStudentNoteFragment actionStudentInfoFragmentToTStudentNoteFragment(
      @NonNull String studentID) {
    return new ActionStudentInfoFragmentToTStudentNoteFragment(studentID);
  }

  public static class ActionStudentInfoFragmentToTStudentNoteFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionStudentInfoFragmentToTStudentNoteFragment(@NonNull String studentID) {
      if (studentID == null) {
        throw new IllegalArgumentException("Argument \"studentID\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("studentID", studentID);
    }

    @NonNull
    public ActionStudentInfoFragmentToTStudentNoteFragment setStudentID(@NonNull String studentID) {
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
      return R.id.action_studentInfoFragment_to_TStudentNoteFragment;
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
      ActionStudentInfoFragmentToTStudentNoteFragment that = (ActionStudentInfoFragmentToTStudentNoteFragment) object;
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
      return "ActionStudentInfoFragmentToTStudentNoteFragment(actionId=" + getActionId() + "){"
          + "studentID=" + getStudentID()
          + "}";
    }
  }
}
