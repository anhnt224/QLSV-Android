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
import com.emglab.qlsv.R;
import com.emglab.qlsv.models.entity.Question;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemFormQuestionBinding extends ViewDataBinding {
  @Bindable
  protected Question mQuestion;

  @Bindable
  protected Integer mIndex;

  protected ListItemFormQuestionBinding(Object _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setQuestion(@Nullable Question question);

  @Nullable
  public Question getQuestion() {
    return mQuestion;
  }

  public abstract void setIndex(@Nullable Integer index);

  @Nullable
  public Integer getIndex() {
    return mIndex;
  }

  @NonNull
  public static ListItemFormQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_form_question, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemFormQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemFormQuestionBinding>inflateInternal(inflater, R.layout.list_item_form_question, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemFormQuestionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_form_question, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemFormQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemFormQuestionBinding>inflateInternal(inflater, R.layout.list_item_form_question, null, false, component);
  }

  public static ListItemFormQuestionBinding bind(@NonNull View view) {
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
  public static ListItemFormQuestionBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemFormQuestionBinding)bind(component, view, R.layout.list_item_form_question);
  }
}
