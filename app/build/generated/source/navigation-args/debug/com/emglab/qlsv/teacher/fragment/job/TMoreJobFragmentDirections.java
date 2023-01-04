package com.emglab.qlsv.teacher.fragment.job;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.Job;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TMoreJobFragmentDirections {
  private TMoreJobFragmentDirections() {
  }

  @NonNull
  public static ActionTMoreJobFragmentToTJobDetailFragment actionTMoreJobFragmentToTJobDetailFragment(
      @NonNull Job job) {
    return new ActionTMoreJobFragmentToTJobDetailFragment(job);
  }

  public static class ActionTMoreJobFragmentToTJobDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTMoreJobFragmentToTJobDetailFragment(@NonNull Job job) {
      if (job == null) {
        throw new IllegalArgumentException("Argument \"job\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("job", job);
    }

    @NonNull
    public ActionTMoreJobFragmentToTJobDetailFragment setJob(@NonNull Job job) {
      if (job == null) {
        throw new IllegalArgumentException("Argument \"job\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("job", job);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_TMoreJobFragment_to_TJobDetailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Job getJob() {
      return (Job) arguments.get("job");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTMoreJobFragmentToTJobDetailFragment that = (ActionTMoreJobFragmentToTJobDetailFragment) object;
      if (arguments.containsKey("job") != that.arguments.containsKey("job")) {
        return false;
      }
      if (getJob() != null ? !getJob().equals(that.getJob()) : that.getJob() != null) {
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
      result = 31 * result + (getJob() != null ? getJob().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTMoreJobFragmentToTJobDetailFragment(actionId=" + getActionId() + "){"
          + "job=" + getJob()
          + "}";
    }
  }
}
