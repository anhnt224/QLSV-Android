// Generated by data binding compiler. Do not edit!
package com.emglab.qlsv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.emglab.qlsv.R;
import com.emglab.qlsv.common.Status;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;
import me.relex.circleindicator.CircleIndicator2;

public abstract class THome2FragmentBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView homeMenu;

  @NonNull
  public final ImageView imageView17;

  @NonNull
  public final CircleIndicator2 indicator;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout15;

  @NonNull
  public final ProgressBar progressBar2;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final MaterialButton retryButton;

  @NonNull
  public final TextView titleTextView;

  @NonNull
  public final TextView titleWelcome;

  @Bindable
  protected Status mGetActivityStatus;

  protected THome2FragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView homeMenu, ImageView imageView17, CircleIndicator2 indicator,
      LinearLayout linearLayout, LinearLayout linearLayout15, ProgressBar progressBar2,
      RecyclerView recyclerView, MaterialButton retryButton, TextView titleTextView,
      TextView titleWelcome) {
    super(_bindingComponent, _root, _localFieldCount);
    this.homeMenu = homeMenu;
    this.imageView17 = imageView17;
    this.indicator = indicator;
    this.linearLayout = linearLayout;
    this.linearLayout15 = linearLayout15;
    this.progressBar2 = progressBar2;
    this.recyclerView = recyclerView;
    this.retryButton = retryButton;
    this.titleTextView = titleTextView;
    this.titleWelcome = titleWelcome;
  }

  public abstract void setGetActivityStatus(@Nullable Status getActivityStatus);

  @Nullable
  public Status getGetActivityStatus() {
    return mGetActivityStatus;
  }

  @NonNull
  public static THome2FragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.t_home2_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static THome2FragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<THome2FragmentBinding>inflateInternal(inflater, R.layout.t_home2_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static THome2FragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.t_home2_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static THome2FragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<THome2FragmentBinding>inflateInternal(inflater, R.layout.t_home2_fragment, null, false, component);
  }

  public static THome2FragmentBinding bind(@NonNull View view) {
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
  public static THome2FragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (THome2FragmentBinding)bind(component, view, R.layout.t_home2_fragment);
  }
}
