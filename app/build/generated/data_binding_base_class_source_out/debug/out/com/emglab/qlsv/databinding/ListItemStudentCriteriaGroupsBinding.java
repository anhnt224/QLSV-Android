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
import com.emglab.qlsv.models.entity.CriteriaGroup;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemStudentCriteriaGroupsBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected CriteriaGroup mCriteriaGroup;

  protected ListItemStudentCriteriaGroupsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
  }

  public abstract void setCriteriaGroup(@Nullable CriteriaGroup criteriaGroup);

  @Nullable
  public CriteriaGroup getCriteriaGroup() {
    return mCriteriaGroup;
  }

  @NonNull
  public static ListItemStudentCriteriaGroupsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_student_criteria_groups, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemStudentCriteriaGroupsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemStudentCriteriaGroupsBinding>inflateInternal(inflater, R.layout.list_item_student_criteria_groups, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemStudentCriteriaGroupsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_student_criteria_groups, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemStudentCriteriaGroupsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemStudentCriteriaGroupsBinding>inflateInternal(inflater, R.layout.list_item_student_criteria_groups, null, false, component);
  }

  public static ListItemStudentCriteriaGroupsBinding bind(@NonNull View view) {
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
  public static ListItemStudentCriteriaGroupsBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ListItemStudentCriteriaGroupsBinding)bind(component, view, R.layout.list_item_student_criteria_groups);
  }
}
