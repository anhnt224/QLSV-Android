package com.emglab.qlsv.ui.fragments.criteria;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.Semester;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TrainingPointFragmentDirections {
  private TrainingPointFragmentDirections() {
  }

  @NonNull
  public static ActionTrainingPointFragmentToCriteriaFragment actionTrainingPointFragmentToCriteriaFragment(
      @NonNull Semester semester, @NonNull Semester[] semesters) {
    return new ActionTrainingPointFragmentToCriteriaFragment(semester, semesters);
  }

  public static class ActionTrainingPointFragmentToCriteriaFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTrainingPointFragmentToCriteriaFragment(@NonNull Semester semester,
        @NonNull Semester[] semesters) {
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
    public ActionTrainingPointFragmentToCriteriaFragment setSemester(@NonNull Semester semester) {
      if (semester == null) {
        throw new IllegalArgumentException("Argument \"semester\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("semester", semester);
      return this;
    }

    @NonNull
    public ActionTrainingPointFragmentToCriteriaFragment setSemesters(
        @NonNull Semester[] semesters) {
      if (semesters == null) {
        throw new IllegalArgumentException("Argument \"semesters\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("semesters", semesters);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_trainingPointFragment_to_criteriaFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTrainingPointFragmentToCriteriaFragment that = (ActionTrainingPointFragmentToCriteriaFragment) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getSemester() != null ? getSemester().hashCode() : 0);
      result = 31 * result + java.util.Arrays.hashCode(getSemesters());
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTrainingPointFragmentToCriteriaFragment(actionId=" + getActionId() + "){"
          + "semester=" + getSemester()
          + ", semesters=" + getSemesters()
          + "}";
    }
  }
}
