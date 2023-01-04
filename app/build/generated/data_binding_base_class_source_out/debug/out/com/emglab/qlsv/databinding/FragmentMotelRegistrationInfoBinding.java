// Generated by data binding compiler. Do not edit!
package com.emglab.qlsv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.common.Status;
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistration;
import com.emglab.qlsv.modules.searchMotel.model.MotelRegistrationStatus;
import com.google.android.material.card.MaterialCardView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentMotelRegistrationInfoBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout feeLayout;

  @NonNull
  public final TextView feeTitle;

  @NonNull
  public final MaterialCardView statusCard;

  @NonNull
  public final TextView statusText;

  @NonNull
  public final TextView textView22;

  @NonNull
  public final TextView textView23;

  @NonNull
  public final TextView textView24;

  @NonNull
  public final TextView textView25;

  @NonNull
  public final TextView textView26;

  @NonNull
  public final TextView textView27;

  @NonNull
  public final TextView textView28;

  @NonNull
  public final TextView textView29;

  @Bindable
  protected MotelRegistration mMotelRegistration;

  @Bindable
  protected MotelRegistrationStatus mMotelRegistrationStatus;

  @Bindable
  protected Status mStatus;

  protected FragmentMotelRegistrationInfoBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout feeLayout, TextView feeTitle,
      MaterialCardView statusCard, TextView statusText, TextView textView22, TextView textView23,
      TextView textView24, TextView textView25, TextView textView26, TextView textView27,
      TextView textView28, TextView textView29) {
    super(_bindingComponent, _root, _localFieldCount);
    this.feeLayout = feeLayout;
    this.feeTitle = feeTitle;
    this.statusCard = statusCard;
    this.statusText = statusText;
    this.textView22 = textView22;
    this.textView23 = textView23;
    this.textView24 = textView24;
    this.textView25 = textView25;
    this.textView26 = textView26;
    this.textView27 = textView27;
    this.textView28 = textView28;
    this.textView29 = textView29;
  }

  public abstract void setMotelRegistration(@Nullable MotelRegistration motelRegistration);

  @Nullable
  public MotelRegistration getMotelRegistration() {
    return mMotelRegistration;
  }

  public abstract void setMotelRegistrationStatus(
      @Nullable MotelRegistrationStatus motelRegistrationStatus);

  @Nullable
  public MotelRegistrationStatus getMotelRegistrationStatus() {
    return mMotelRegistrationStatus;
  }

  public abstract void setStatus(@Nullable Status status);

  @Nullable
  public Status getStatus() {
    return mStatus;
  }

  @NonNull
  public static FragmentMotelRegistrationInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_motel_registration_info, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMotelRegistrationInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMotelRegistrationInfoBinding>inflateInternal(inflater, R.layout.fragment_motel_registration_info, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMotelRegistrationInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_motel_registration_info, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMotelRegistrationInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMotelRegistrationInfoBinding>inflateInternal(inflater, R.layout.fragment_motel_registration_info, null, false, component);
  }

  public static FragmentMotelRegistrationInfoBinding bind(@NonNull View view) {
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
  public static FragmentMotelRegistrationInfoBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentMotelRegistrationInfoBinding)bind(component, view, R.layout.fragment_motel_registration_info);
  }
}
