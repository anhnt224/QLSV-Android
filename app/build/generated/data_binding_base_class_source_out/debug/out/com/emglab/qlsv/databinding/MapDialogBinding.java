// Generated by data binding compiler. Do not edit!
package com.emglab.qlsv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.emglab.qlsv.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MapDialogBinding extends ViewDataBinding {
  @NonNull
  public final ScrollView ScrollView01;

  protected MapDialogBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ScrollView ScrollView01) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ScrollView01 = ScrollView01;
  }

  @NonNull
  public static MapDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.map_dialog, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MapDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MapDialogBinding>inflateInternal(inflater, R.layout.map_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static MapDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.map_dialog, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MapDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MapDialogBinding>inflateInternal(inflater, R.layout.map_dialog, null, false, component);
  }

  public static MapDialogBinding bind(@NonNull View view) {
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
  public static MapDialogBinding bind(@NonNull View view, @Nullable Object component) {
    return (MapDialogBinding)bind(component, view, R.layout.map_dialog);
  }
}
