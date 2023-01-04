// Generated by data binding compiler. Do not edit!
package com.emglab.qlsv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.common.Resource;
import com.emglab.qlsv.common.RetryCallback;
import com.emglab.qlsv.common.Status;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutLoadingBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView13;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ConstraintLayout progressOverlay;

  @NonNull
  public final TextView textView10;

  @Bindable
  protected Status mStatus;

  @Bindable
  protected Resource mResource;

  @Bindable
  protected RetryCallback mCallback;

  protected LayoutLoadingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView13, ProgressBar progressBar, ConstraintLayout progressOverlay,
      TextView textView10) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView13 = imageView13;
    this.progressBar = progressBar;
    this.progressOverlay = progressOverlay;
    this.textView10 = textView10;
  }

  public abstract void setStatus(@Nullable Status status);

  @Nullable
  public Status getStatus() {
    return mStatus;
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
  public static LayoutLoadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_loading, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutLoadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutLoadingBinding>inflateInternal(inflater, R.layout.layout_loading, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutLoadingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_loading, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutLoadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutLoadingBinding>inflateInternal(inflater, R.layout.layout_loading, null, false, component);
  }

  public static LayoutLoadingBinding bind(@NonNull View view) {
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
  public static LayoutLoadingBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutLoadingBinding)bind(component, view, R.layout.layout_loading);
  }
}
