// Generated by data binding compiler. Do not edit!
package com.emglab.qlsv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.emglab.qlsv.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemDayOfWeekBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView textTitle;

  @NonNull
  public final LinearLayout titleView;

  protected ListItemDayOfWeekBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerView, TextView textTitle, LinearLayout titleView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
    this.textTitle = textTitle;
    this.titleView = titleView;
  }

  @NonNull
  public static ListItemDayOfWeekBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_day_of_week, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemDayOfWeekBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemDayOfWeekBinding>inflateInternal(inflater, R.layout.list_item_day_of_week, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemDayOfWeekBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_day_of_week, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemDayOfWeekBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemDayOfWeekBinding>inflateInternal(inflater, R.layout.list_item_day_of_week, null, false, component);
  }

  public static ListItemDayOfWeekBinding bind(@NonNull View view) {
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
  public static ListItemDayOfWeekBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemDayOfWeekBinding)bind(component, view, R.layout.list_item_day_of_week);
  }
}
