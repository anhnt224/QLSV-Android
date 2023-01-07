// Generated by data binding compiler. Do not edit!
package com.emglab.qlsv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.emglab.qlsv.R;
import com.emglab.qlsv.common.Resource;
import com.emglab.qlsv.common.RetryCallback;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTMoreJobBinding extends ViewDataBinding {
  @NonNull
  public final LayoutLoadingBinding include4;

  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected Integer mNumber;

  @Bindable
  protected Resource mResource;

  @Bindable
  protected RetryCallback mCallback;

  protected FragmentTMoreJobBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LayoutLoadingBinding include4, RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.include4 = include4;
    this.recyclerView = recyclerView;
  }

  public abstract void setNumber(@Nullable Integer number);

  @Nullable
  public Integer getNumber() {
    return mNumber;
  }

  public abstract void setResource(@Nullable Resource resource);

  @Nullable
  public Resource getResource() {
    return mResource;
  }

  public abstract void setCallback(@Nullable RetryCallback callback);

  @Nullable
  public RetryCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static FragmentTMoreJobBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_t_more_job, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTMoreJobBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTMoreJobBinding>inflateInternal(inflater, R.layout.fragment_t_more_job, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTMoreJobBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_t_more_job, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTMoreJobBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTMoreJobBinding>inflateInternal(inflater, R.layout.fragment_t_more_job, null, false, component);
  }

  public static FragmentTMoreJobBinding bind(@NonNull View view) {
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
  public static FragmentTMoreJobBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTMoreJobBinding)bind(component, view, R.layout.fragment_t_more_job);
  }
}
