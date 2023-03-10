// Generated by data binding compiler. Do not edit!
package com.emglab.qlsv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.Form;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TFormDetailFragmentBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton buttonRegister;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @Bindable
  protected Form mForm;

  protected TFormDetailFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton buttonRegister, CardView cardView2, TextView textView6, TextView textView7) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonRegister = buttonRegister;
    this.cardView2 = cardView2;
    this.textView6 = textView6;
    this.textView7 = textView7;
  }

  public abstract void setForm(@Nullable Form form);

  @Nullable
  public Form getForm() {
    return mForm;
  }

  @NonNull
  public static TFormDetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.t_form_detail_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TFormDetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TFormDetailFragmentBinding>inflateInternal(inflater, R.layout.t_form_detail_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static TFormDetailFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.t_form_detail_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TFormDetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TFormDetailFragmentBinding>inflateInternal(inflater, R.layout.t_form_detail_fragment, null, false, component);
  }

  public static TFormDetailFragmentBinding bind(@NonNull View view) {
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
  public static TFormDetailFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (TFormDetailFragmentBinding)bind(component, view, R.layout.t_form_detail_fragment);
  }
}
