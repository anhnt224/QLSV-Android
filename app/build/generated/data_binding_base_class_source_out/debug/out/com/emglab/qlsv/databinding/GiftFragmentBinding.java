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
import com.emglab.qlsv.common.Status;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class GiftFragmentBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView giftList;

  @Bindable
  protected Status mLoadPublicGiftStatus;

  protected GiftFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView giftList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.giftList = giftList;
  }

  public abstract void setLoadPublicGiftStatus(@Nullable Status loadPublicGiftStatus);

  @Nullable
  public Status getLoadPublicGiftStatus() {
    return mLoadPublicGiftStatus;
  }

  @NonNull
  public static GiftFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.gift_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static GiftFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<GiftFragmentBinding>inflateInternal(inflater, R.layout.gift_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static GiftFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.gift_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static GiftFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<GiftFragmentBinding>inflateInternal(inflater, R.layout.gift_fragment, null, false, component);
  }

  public static GiftFragmentBinding bind(@NonNull View view) {
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
  public static GiftFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (GiftFragmentBinding)bind(component, view, R.layout.gift_fragment);
  }
}
