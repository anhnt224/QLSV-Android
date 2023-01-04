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
import com.emglab.qlsv.common.RetryCallback;
import com.emglab.qlsv.common.Status;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TStudentNoteFragmentBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected Status mStatus;

  @Bindable
  protected RetryCallback mRetryCallBack;

  protected TStudentNoteFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
  }

  public abstract void setStatus(@Nullable Status status);

  @Nullable
  public Status getStatus() {
    return mStatus;
  }

  public abstract void setRetryCallBack(@Nullable RetryCallback retryCallBack);

  @Nullable
  public RetryCallback getRetryCallBack() {
    return mRetryCallBack;
  }

  @NonNull
  public static TStudentNoteFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.t_student_note_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TStudentNoteFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TStudentNoteFragmentBinding>inflateInternal(inflater, R.layout.t_student_note_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static TStudentNoteFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.t_student_note_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TStudentNoteFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TStudentNoteFragmentBinding>inflateInternal(inflater, R.layout.t_student_note_fragment, null, false, component);
  }

  public static TStudentNoteFragmentBinding bind(@NonNull View view) {
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
  public static TStudentNoteFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (TStudentNoteFragmentBinding)bind(component, view, R.layout.t_student_note_fragment);
  }
}