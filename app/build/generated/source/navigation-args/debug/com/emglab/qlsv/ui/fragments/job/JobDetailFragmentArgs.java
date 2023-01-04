package com.emglab.qlsv.ui.fragments.job;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.emglab.qlsv.models.entity.Job;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class JobDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private JobDetailFragmentArgs() {
  }

  private JobDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static JobDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    JobDetailFragmentArgs __result = new JobDetailFragmentArgs();
    bundle.setClassLoader(JobDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("job")) {
      Job job;
      if (Parcelable.class.isAssignableFrom(Job.class) || Serializable.class.isAssignableFrom(Job.class)) {
        job = (Job) bundle.get("job");
      } else {
        throw new UnsupportedOperationException(Job.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (job == null) {
        throw new IllegalArgumentException("Argument \"job\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("job", job);
    } else {
      throw new IllegalArgumentException("Required argument \"job\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Job getJob() {
    return (Job) arguments.get("job");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("job")) {
      Job job = (Job) arguments.get("job");
      if (Parcelable.class.isAssignableFrom(Job.class) || job == null) {
        __result.putParcelable("job", Parcelable.class.cast(job));
      } else if (Serializable.class.isAssignableFrom(Job.class)) {
        __result.putSerializable("job", Serializable.class.cast(job));
      } else {
        throw new UnsupportedOperationException(Job.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
    JobDetailFragmentArgs that = (JobDetailFragmentArgs) object;
    if (arguments.containsKey("job") != that.arguments.containsKey("job")) {
      return false;
    }
    if (getJob() != null ? !getJob().equals(that.getJob()) : that.getJob() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getJob() != null ? getJob().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "JobDetailFragmentArgs{"
        + "job=" + getJob()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(JobDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Job job) {
      if (job == null) {
        throw new IllegalArgumentException("Argument \"job\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("job", job);
    }

    @NonNull
    public JobDetailFragmentArgs build() {
      JobDetailFragmentArgs result = new JobDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setJob(@NonNull Job job) {
      if (job == null) {
        throw new IllegalArgumentException("Argument \"job\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("job", job);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Job getJob() {
      return (Job) arguments.get("job");
    }
  }
}
