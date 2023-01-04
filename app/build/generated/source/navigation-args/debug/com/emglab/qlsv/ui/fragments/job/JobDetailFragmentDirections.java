package com.emglab.qlsv.ui.fragments.job;

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

public class JobDetailFragmentDirections {
  private JobDetailFragmentDirections() {
  }

  @NonNull
  public static ActionJobDetailFragmentToApplyJobFragment actionJobDetailFragmentToApplyJobFragment(
      int jobID, @NonNull String jobTitle, @NonNull String company) {
    return new ActionJobDetailFragmentToApplyJobFragment(jobID, jobTitle, company);
  }

  public static class ActionJobDetailFragmentToApplyJobFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionJobDetailFragmentToApplyJobFragment(int jobID, @NonNull String jobTitle,
        @NonNull String company) {
      this.arguments.put("jobID", jobID);
      if (jobTitle == null) {
        throw new IllegalArgumentException("Argument \"jobTitle\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("jobTitle", jobTitle);
      if (company == null) {
        throw new IllegalArgumentException("Argument \"company\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("company", company);
    }

    @NonNull
    public ActionJobDetailFragmentToApplyJobFragment setJobID(int jobID) {
      this.arguments.put("jobID", jobID);
      return this;
    }

    @NonNull
    public ActionJobDetailFragmentToApplyJobFragment setJobTitle(@NonNull String jobTitle) {
      if (jobTitle == null) {
        throw new IllegalArgumentException("Argument \"jobTitle\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("jobTitle", jobTitle);
      return this;
    }

    @NonNull
    public ActionJobDetailFragmentToApplyJobFragment setCompany(@NonNull String company) {
      if (company == null) {
        throw new IllegalArgumentException("Argument \"company\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("company", company);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("jobID")) {
        int jobID = (int) arguments.get("jobID");
        __result.putInt("jobID", jobID);
      }
      if (arguments.containsKey("jobTitle")) {
        String jobTitle = (String) arguments.get("jobTitle");
        __result.putString("jobTitle", jobTitle);
      }
      if (arguments.containsKey("company")) {
        String company = (String) arguments.get("company");
        __result.putString("company", company);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_jobDetailFragment_to_applyJobFragment;
    }

    @SuppressWarnings("unchecked")
    public int getJobID() {
      return (int) arguments.get("jobID");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getJobTitle() {
      return (String) arguments.get("jobTitle");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCompany() {
      return (String) arguments.get("company");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionJobDetailFragmentToApplyJobFragment that = (ActionJobDetailFragmentToApplyJobFragment) object;
      if (arguments.containsKey("jobID") != that.arguments.containsKey("jobID")) {
        return false;
      }
      if (getJobID() != that.getJobID()) {
        return false;
      }
      if (arguments.containsKey("jobTitle") != that.arguments.containsKey("jobTitle")) {
        return false;
      }
      if (getJobTitle() != null ? !getJobTitle().equals(that.getJobTitle()) : that.getJobTitle() != null) {
        return false;
      }
      if (arguments.containsKey("company") != that.arguments.containsKey("company")) {
        return false;
      }
      if (getCompany() != null ? !getCompany().equals(that.getCompany()) : that.getCompany() != null) {
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
      result = 31 * result + getJobID();
      result = 31 * result + (getJobTitle() != null ? getJobTitle().hashCode() : 0);
      result = 31 * result + (getCompany() != null ? getCompany().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionJobDetailFragmentToApplyJobFragment(actionId=" + getActionId() + "){"
          + "jobID=" + getJobID()
          + ", jobTitle=" + getJobTitle()
          + ", company=" + getCompany()
          + "}";
    }
  }
}
