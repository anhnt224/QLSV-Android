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
import com.emglab.qlsv.models.entity.ActivityGroup;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemActivityGroupByUpdateSvGroupBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imgCheck;

  @NonNull
  public final ImageView imgUnCheck;

  @NonNull
  public final TextView txtAGDesc;

  @Bindable
  protected ActivityGroup mActivityGroup;

  @Bindable
  protected Boolean mCheck;

  @Bindable
  protected View.OnClickListener mClickListener;

  protected ListItemActivityGroupByUpdateSvGroupBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView imgCheck, ImageView imgUnCheck, TextView txtAGDesc) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgCheck = imgCheck;
    this.imgUnCheck = imgUnCheck;
    this.txtAGDesc = txtAGDesc;
  }

  public abstract void setActivityGroup(@Nullable ActivityGroup activityGroup);

  @Nullable
  public ActivityGroup getActivityGroup() {
    return mActivityGroup;
  }

  public abstract void setCheck(@Nullable Boolean check);

  @Nullable
  public Boolean getCheck() {
    return mCheck;
  }

  public abstract void setClickListener(@Nullable View.OnClickListener clickListener);

  @Nullable
  public View.OnClickListener getClickListener() {
    return mClickListener;
  }

  @NonNull
  public static ListItemActivityGroupByUpdateSvGroupBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_activity_group_by_update_sv_group, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemActivityGroupByUpdateSvGroupBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemActivityGroupByUpdateSvGroupBinding>inflateInternal(inflater, R.layout.list_item_activity_group_by_update_sv_group, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemActivityGroupByUpdateSvGroupBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_activity_group_by_update_sv_group, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemActivityGroupByUpdateSvGroupBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<ListItemActivityGroupByUpdateSvGroupBinding>inflateInternal(inflater, R.layout.list_item_activity_group_by_update_sv_group, null, false, component);
  }

  public static ListItemActivityGroupByUpdateSvGroupBinding bind(@NonNull View view) {
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
  public static ListItemActivityGroupByUpdateSvGroupBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ListItemActivityGroupByUpdateSvGroupBinding)bind(component, view, R.layout.list_item_activity_group_by_update_sv_group);
  }
}
