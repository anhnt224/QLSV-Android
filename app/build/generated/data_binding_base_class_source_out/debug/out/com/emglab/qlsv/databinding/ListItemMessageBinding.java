// Generated by data binding compiler. Do not edit!
package com.emglab.qlsv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.Message;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemMessageBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView txtEquipmentName;

  @Bindable
  protected Message mMessage;

  protected ListItemMessageBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView, TextView textView, TextView textView4, TextView txtEquipmentName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
    this.textView = textView;
    this.textView4 = textView4;
    this.txtEquipmentName = txtEquipmentName;
  }

  public abstract void setMessage(@Nullable Message message);

  @Nullable
  public Message getMessage() {
    return mMessage;
  }

  @NonNull
  public static ListItemMessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_message, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemMessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemMessageBinding>inflateInternal(inflater, R.layout.list_item_message, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemMessageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_message, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemMessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemMessageBinding>inflateInternal(inflater, R.layout.list_item_message, null, false, component);
  }

  public static ListItemMessageBinding bind(@NonNull View view) {
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
  public static ListItemMessageBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemMessageBinding)bind(component, view, R.layout.list_item_message);
  }
}
