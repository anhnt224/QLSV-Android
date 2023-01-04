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
import com.emglab.qlsv.common.RetryCallback;
import com.emglab.qlsv.common.Status;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentMotelRegistrationListBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final RecyclerView itemList;

  @Bindable
  protected Status mStatus;

  @Bindable
  protected RetryCallback mCallback;

  protected FragmentMotelRegistrationListBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FloatingActionButton fab, RecyclerView itemList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fab = fab;
    this.itemList = itemList;
  }

  public abstract void setStatus(@Nullable Status status);

  @Nullable
  public Status getStatus() {
    return mStatus;
  }

  public abstract void setCallback(@Nullable RetryCallback callback);

  @Nullable
  public RetryCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static FragmentMotelRegistrationListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_motel_registration_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMotelRegistrationListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMotelRegistrationListBinding>inflateInternal(inflater, R.layout.fragment_motel_registration_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMotelRegistrationListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_motel_registration_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMotelRegistrationListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMotelRegistrationListBinding>inflateInternal(inflater, R.layout.fragment_motel_registration_list, null, false, component);
  }

  public static FragmentMotelRegistrationListBinding bind(@NonNull View view) {
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
  public static FragmentMotelRegistrationListBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentMotelRegistrationListBinding)bind(component, view, R.layout.fragment_motel_registration_list);
  }
}
