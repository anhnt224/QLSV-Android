// Generated by data binding compiler. Do not edit!
package com.emglab.qlsv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.emglab.qlsv.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class THomeFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final TextView textFullName;

  @NonNull
  public final CardView viewActivity;

  @NonNull
  public final CardView viewCriteria;

  @NonNull
  public final ConstraintLayout viewForm;

  @NonNull
  public final CardView viewJob;

  @NonNull
  public final CardView viewScholarShip;

  @NonNull
  public final CardView viewTimetable;

  protected THomeFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5,
      ImageView imageView6, ImageView imageView7, TextView textFullName, CardView viewActivity,
      CardView viewCriteria, ConstraintLayout viewForm, CardView viewJob, CardView viewScholarShip,
      CardView viewTimetable) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.imageView7 = imageView7;
    this.textFullName = textFullName;
    this.viewActivity = viewActivity;
    this.viewCriteria = viewCriteria;
    this.viewForm = viewForm;
    this.viewJob = viewJob;
    this.viewScholarShip = viewScholarShip;
    this.viewTimetable = viewTimetable;
  }

  @NonNull
  public static THomeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.t_home_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static THomeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<THomeFragmentBinding>inflateInternal(inflater, R.layout.t_home_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static THomeFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.t_home_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static THomeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<THomeFragmentBinding>inflateInternal(inflater, R.layout.t_home_fragment, null, false, component);
  }

  public static THomeFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static THomeFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (THomeFragmentBinding)bind(component, view, R.layout.t_home_fragment);
  }
}
