package com.emglab.qlsv.ui.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
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

public class Home2FragmentDirections {
  private Home2FragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHome2FragmentToListActivityFragment() {
    return new ActionOnlyNavDirections(R.id.action_home2Fragment_to_listActivityFragment);
  }

  @NonNull
  public static NavDirections actionHome2FragmentToListScholarShipsFragment() {
    return new ActionOnlyNavDirections(R.id.action_home2Fragment_to_listScholarShipsFragment);
  }

  @NonNull
  public static ActionHome2FragmentToActivityDetailByUserUnitFragment actionHome2FragmentToActivityDetailByUserUnitFragment(
      int AId) {
    return new ActionHome2FragmentToActivityDetailByUserUnitFragment(AId);
  }

  @NonNull
  public static NavDirections actionHome2FragmentToListJobsFragment() {
    return new ActionOnlyNavDirections(R.id.action_home2Fragment_to_listJobsFragment);
  }

  @NonNull
  public static NavDirections actionHome2FragmentToListFormsFragment() {
    return new ActionOnlyNavDirections(R.id.action_home2Fragment_to_listFormsFragment);
  }

  @NonNull
  public static NavDirections actionHome2FragmentToTrainingPointFragment() {
    return new ActionOnlyNavDirections(R.id.action_home2Fragment_to_trainingPointFragment);
  }

  @NonNull
  public static NavDirections actionHome2FragmentToTimeTableFragment() {
    return new ActionOnlyNavDirections(R.id.action_home2Fragment_to_timeTableFragment);
  }

  @NonNull
  public static NavDirections actionHome2FragmentToRunDashboardFragment() {
    return new ActionOnlyNavDirections(R.id.action_home2Fragment_to_runDashboardFragment);
  }

  @NonNull
  public static NavDirections actionHome2FragmentToListAddressFragment() {
    return new ActionOnlyNavDirections(R.id.action_home2Fragment_to_listAddressFragment);
  }

  @NonNull
  public static ActionHome2FragmentToCriteriaFragment actionHome2FragmentToCriteriaFragment(
      @NonNull Semester semester, @NonNull Semester[] semesters) {
    return new ActionHome2FragmentToCriteriaFragment(semester, semesters);
  }

  @NonNull
  public static ActionHome2FragmentToGiftFragment actionHome2FragmentToGiftFragment(
      boolean reloadData) {
    return new ActionHome2FragmentToGiftFragment(reloadData);
  }

  @NonNull
  public static ActionHome2FragmentToGiftGivenFragment actionHome2FragmentToGiftGivenFragment(
      boolean reloadData) {
    return new ActionHome2FragmentToGiftGivenFragment(reloadData);
  }

  @NonNull
  public static ActionHome2FragmentToActivityDetailByUserUnitFragment2 actionHome2FragmentToActivityDetailByUserUnitFragment2(
      int AId) {
    return new ActionHome2FragmentToActivityDetailByUserUnitFragment2(AId);
  }

  @NonNull
  public static NavDirections actionHome2FragmentToSearchMotelFragment() {
    return new ActionOnlyNavDirections(R.id.action_home2Fragment_to_searchMotelFragment);
  }

  @NonNull
  public static NavDirections actionHome2FragmentToMoreJobFragment() {
    return new ActionOnlyNavDirections(R.id.action_home2Fragment_to_moreJobFragment);
  }

  @NonNull
  public static NavDirections actionHome2FragmentToTutorFragment() {
    return new ActionOnlyNavDirections(R.id.action_home2Fragment_to_tutorFragment);
  }

  @NonNull
  public static NavDirections actionHome2FragmentToMotelRegistrationListFragment() {
    return new ActionOnlyNavDirections(R.id.action_home2Fragment_to_motelRegistrationListFragment);
  }

  public static class ActionHome2FragmentToActivityDetailByUserUnitFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHome2FragmentToActivityDetailByUserUnitFragment(int AId) {
      this.arguments.put("AId", AId);
    }

    @NonNull
    public ActionHome2FragmentToActivityDetailByUserUnitFragment setAId(int AId) {
      this.arguments.put("AId", AId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("AId")) {
        int AId = (int) arguments.get("AId");
        __result.putInt("AId", AId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_home2Fragment_to_activityDetailByUserUnitFragment;
    }

    @SuppressWarnings("unchecked")
    public int getAId() {
      return (int) arguments.get("AId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHome2FragmentToActivityDetailByUserUnitFragment that = (ActionHome2FragmentToActivityDetailByUserUnitFragment) object;
      if (arguments.containsKey("AId") != that.arguments.containsKey("AId")) {
        return false;
      }
      if (getAId() != that.getAId()) {
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
      result = 31 * result + getAId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHome2FragmentToActivityDetailByUserUnitFragment(actionId=" + getActionId() + "){"
          + "AId=" + getAId()
          + "}";
    }
  }

  public static class ActionHome2FragmentToCriteriaFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHome2FragmentToCriteriaFragment(@NonNull Semester semester,
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
    public ActionHome2FragmentToCriteriaFragment setSemester(@NonNull Semester semester) {
      if (semester == null) {
        throw new IllegalArgumentException("Argument \"semester\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("semester", semester);
      return this;
    }

    @NonNull
    public ActionHome2FragmentToCriteriaFragment setSemesters(@NonNull Semester[] semesters) {
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
      return R.id.action_home2Fragment_to_criteriaFragment;
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
      ActionHome2FragmentToCriteriaFragment that = (ActionHome2FragmentToCriteriaFragment) object;
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
      return "ActionHome2FragmentToCriteriaFragment(actionId=" + getActionId() + "){"
          + "semester=" + getSemester()
          + ", semesters=" + getSemesters()
          + "}";
    }
  }

  public static class ActionHome2FragmentToGiftFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHome2FragmentToGiftFragment(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
    }

    @NonNull
    public ActionHome2FragmentToGiftFragment setReloadData(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("reloadData")) {
        boolean reloadData = (boolean) arguments.get("reloadData");
        __result.putBoolean("reloadData", reloadData);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_home2Fragment_to_giftFragment;
    }

    @SuppressWarnings("unchecked")
    public boolean getReloadData() {
      return (boolean) arguments.get("reloadData");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHome2FragmentToGiftFragment that = (ActionHome2FragmentToGiftFragment) object;
      if (arguments.containsKey("reloadData") != that.arguments.containsKey("reloadData")) {
        return false;
      }
      if (getReloadData() != that.getReloadData()) {
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
      result = 31 * result + (getReloadData() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHome2FragmentToGiftFragment(actionId=" + getActionId() + "){"
          + "reloadData=" + getReloadData()
          + "}";
    }
  }

  public static class ActionHome2FragmentToGiftGivenFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHome2FragmentToGiftGivenFragment(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
    }

    @NonNull
    public ActionHome2FragmentToGiftGivenFragment setReloadData(boolean reloadData) {
      this.arguments.put("reloadData", reloadData);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("reloadData")) {
        boolean reloadData = (boolean) arguments.get("reloadData");
        __result.putBoolean("reloadData", reloadData);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_home2Fragment_to_giftGivenFragment;
    }

    @SuppressWarnings("unchecked")
    public boolean getReloadData() {
      return (boolean) arguments.get("reloadData");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHome2FragmentToGiftGivenFragment that = (ActionHome2FragmentToGiftGivenFragment) object;
      if (arguments.containsKey("reloadData") != that.arguments.containsKey("reloadData")) {
        return false;
      }
      if (getReloadData() != that.getReloadData()) {
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
      result = 31 * result + (getReloadData() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHome2FragmentToGiftGivenFragment(actionId=" + getActionId() + "){"
          + "reloadData=" + getReloadData()
          + "}";
    }
  }

  public static class ActionHome2FragmentToActivityDetailByUserUnitFragment2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHome2FragmentToActivityDetailByUserUnitFragment2(int AId) {
      this.arguments.put("AId", AId);
    }

    @NonNull
    public ActionHome2FragmentToActivityDetailByUserUnitFragment2 setAId(int AId) {
      this.arguments.put("AId", AId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("AId")) {
        int AId = (int) arguments.get("AId");
        __result.putInt("AId", AId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_home2Fragment_to_activityDetailByUserUnitFragment2;
    }

    @SuppressWarnings("unchecked")
    public int getAId() {
      return (int) arguments.get("AId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHome2FragmentToActivityDetailByUserUnitFragment2 that = (ActionHome2FragmentToActivityDetailByUserUnitFragment2) object;
      if (arguments.containsKey("AId") != that.arguments.containsKey("AId")) {
        return false;
      }
      if (getAId() != that.getAId()) {
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
      result = 31 * result + getAId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHome2FragmentToActivityDetailByUserUnitFragment2(actionId=" + getActionId() + "){"
          + "AId=" + getAId()
          + "}";
    }
  }
}
