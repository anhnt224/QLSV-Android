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
import com.emglab.qlsv.common.Status;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTGiftReceivedBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected Status mLoadPublicGiftStatus;

  @Bindable
  protected Integer mNumber;

  protected FragmentTGiftReceivedBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
  }

  public abstract void setLoadPublicGiftStatus(@Nullable Status loadPublicGiftStatus);

  @Nullable
  public Status getLoadPublicGiftStatus() {
    return mLoadPublicGiftStatus;
  }

  public abstract void setNumber(@Nullable Integer number);

  @Nullable
  public Integer getNumber() {
    return mNumber;
  }

  @NonNull
  public static FragmentTGiftReceivedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_t_gift_received, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTGiftReceivedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTGiftReceivedBinding>inflateInternal(inflater, R.layout.fragment_t_gift_received, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTGiftReceivedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_t_gift_received, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTGiftReceivedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTGiftReceivedBinding>inflateInternal(inflater, R.layout.fragment_t_gift_received, null, false, component);
  }

  public static FragmentTGiftReceivedBinding bind(@NonNull View view) {
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
  public static FragmentTGiftReceivedBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTGiftReceivedBinding)bind(component, view, R.layout.fragment_t_gift_received);
  }
}