package com.emglab.qlsv.ui.fragments.job;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ApplyJobFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ApplyJobFragmentArgs() {
  }

  private ApplyJobFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ApplyJobFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ApplyJobFragmentArgs __result = new ApplyJobFragmentArgs();
    bundle.setClassLoader(ApplyJobFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("jobID")) {
      int jobID;
      jobID = bundle.getInt("jobID");
      __result.arguments.put("jobID", jobID);
    } else {
      throw new IllegalArgumentException("Required argument \"jobID\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("jobTitle")) {
      String jobTitle;
      jobTitle = bundle.getString("jobTitle");
      if (jobTitle == null) {
        throw new IllegalArgumentException("Argument \"jobTitle\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("jobTitle", jobTitle);
    } else {
      throw new IllegalArgumentException("Required argument \"jobTitle\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("company")) {
      String company;
      company = bundle.getString("company");
      if (company == null) {
        throw new IllegalArgumentException("Argument \"company\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("company", company);
    } else {
      throw new IllegalArgumentException("Required argument \"company\" is missing and does not have an android:defaultValue");
    }
    return __result;
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ApplyJobFragmentArgs that = (ApplyJobFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getJobID();
    result = 31 * result + (getJobTitle() != null ? getJobTitle().hashCode() : 0);
    result = 31 * result + (getCompany() != null ? getCompany().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ApplyJobFragmentArgs{"
        + "jobID=" + getJobID()
        + ", jobTitle=" + getJobTitle()
        + ", company=" + getCompany()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ApplyJobFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int jobID, @NonNull String jobTitle, @NonNull String company) {
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
    public ApplyJobFragmentArgs build() {
      ApplyJobFragmentArgs result = new ApplyJobFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setJobID(int jobID) {
      this.arguments.put("jobID", jobID);
      return this;
    }

    @NonNull
    public Builder setJobTitle(@NonNull String jobTitle) {
      if (jobTitle == null) {
        throw new IllegalArgumentException("Argument \"jobTitle\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("jobTitle", jobTitle);
      return this;
    }

    @NonNull
    public Builder setCompany(@NonNull String company) {
      if (company == null) {
        throw new IllegalArgumentException("Argument \"company\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("company", company);
      return this;
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
  }
}
