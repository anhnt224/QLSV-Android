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
import com.emglab.qlsv.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutEmptyDataBinding extends ViewDataBinding {
  @Bindable
  protected Integer mNumber;

  @Bindable
  protected String mTitle;

  protected LayoutEmptyDataBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setNumber(@Nullable Integer number);

  @Nullable
  public Integer getNumber() {
    return mNumber;
  }

  public abstract void setTitle(@Nullable String title);

  @Nullable
  public String getTitle() {
    return mTitle;
  }

  @NonNull
  public static LayoutEmptyDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_empty_data, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutEmptyDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutEmptyDataBinding>inflateInternal(inflater, R.layout.layout_empty_data, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutEmptyDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_empty_data, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutEmptyDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutEmptyDataBinding>inflateInternal(inflater, R.layout.layout_empty_data, null, false, component);
  }

  public static LayoutEmptyDataBinding bind(@NonNull View view) {
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
  public static LayoutEmptyDataBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutEmptyDataBinding)bind(component, view, R.layout.layout_empty_data);
  }
}
