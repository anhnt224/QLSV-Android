// Generated by data binding compiler. Do not edit!
package com.emglab.qlsv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.Form;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemFormRegisteredBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton buttonRate;

  @NonNull
  public final ImageView imageView12;

  @NonNull
  public final LinearLayout linearLayout7;

  @NonNull
  public final LinearLayout linearLayout8;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final TextView textStatus;

  @Bindable
  protected Form mForm;

  protected ListItemFormRegisteredBinding(Object _bindingComponent, View _root,
      int _localFieldCount, MaterialButton buttonRate, ImageView imageView12,
      LinearLayout linearLayout7, LinearLayout linearLayout8, RatingBar ratingBar,
      TextView textStatus) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonRate = buttonRate;
    this.imageView12 = imageView12;
    this.linearLayout7 = linearLayout7;
    this.linearLayout8 = linearLayout8;
    this.ratingBar = ratingBar;
    this.textStatus = textStatus;
  }

  public abstract void setForm(@Nullable Form form);

  @Nullable
  public Form getForm() {
    return mForm;
  }

  @NonNull
  public static ListItemFormRegisteredBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_form_registered, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemFormRegisteredBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemFormRegisteredBinding>inflateInternal(inflater, R.layout.list_item_form_registered, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemFormRegisteredBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_form_registered, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemFormRegisteredBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemFormRegisteredBinding>inflateInternal(inflater, R.layout.list_item_form_registered, null, false, component);
  }

  public static ListItemFormRegisteredBinding bind(@NonNull View view) {
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
  public static ListItemFormRegisteredBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemFormRegisteredBinding)bind(component, view, R.layout.list_item_form_registered);
  }
}
