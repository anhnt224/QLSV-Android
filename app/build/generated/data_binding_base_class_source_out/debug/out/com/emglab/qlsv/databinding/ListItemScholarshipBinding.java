// Generated by data binding compiler. Do not edit!
package com.emglab.qlsv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.ScholarShip;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemScholarshipBinding extends ViewDataBinding {
  @NonNull
  public final ImageView icon;

  @NonNull
  public final LinearLayout linearLayout4;

  @Bindable
  protected ScholarShip mScholarShip;

  protected ListItemScholarshipBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView icon, LinearLayout linearLayout4) {
    super(_bindingComponent, _root, _localFieldCount);
    this.icon = icon;
    this.linearLayout4 = linearLayout4;
  }

  public abstract void setScholarShip(@Nullable ScholarShip scholarShip);

  @Nullable
  public ScholarShip getScholarShip() {
    return mScholarShip;
  }

  @NonNull
  public static ListItemScholarshipBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_scholarship, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemScholarshipBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemScholarshipBinding>inflateInternal(inflater, R.layout.list_item_scholarship, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemScholarshipBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_scholarship, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemScholarshipBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemScholarshipBinding>inflateInternal(inflater, R.layout.list_item_scholarship, null, false, component);
  }

  public static ListItemScholarshipBinding bind(@NonNull View view) {
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
  public static ListItemScholarshipBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemScholarshipBinding)bind(component, view, R.layout.list_item_scholarship);
  }
}
