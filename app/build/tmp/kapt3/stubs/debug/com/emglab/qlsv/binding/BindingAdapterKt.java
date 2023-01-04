package com.emglab.qlsv.binding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u001a\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u001a\u001a\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u001a\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\tH\u0007\u001a\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0007\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u001a\u0018\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u00a8\u0006\u0018"}, d2 = {"bindHtmlText", "", "view", "Landroid/widget/TextView;", "html", "", "bindIsGone", "Landroid/view/View;", "isGone", "", "converDateToStringDDMMYYYY", "textView", "date", "Ljava/util/Date;", "converDateToStringYYYYMMDDHHMMSS", "goneUnless", "visible", "setAnimatedVisibility", "target", "isVisible", "setTextWithAStatus", "AStatus", "", "setTextWithGStatus", "app_debug"})
public final class BindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"android:animatedVisibility"})
    public static final void setAnimatedVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View target, boolean isVisible) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"goneUnless"})
    public static final void goneUnless(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean visible) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"htmlText"})
    public static final void bindHtmlText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String html) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"converDateToStringDDMMYYYY"})
    public static final void converDateToStringDDMMYYYY(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.util.Date date) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"converDateToStringYYYYMMDDHHMMSS"})
    public static final void converDateToStringYYYYMMDDHHMMSS(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.util.Date date) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"isGone"})
    public static final void bindIsGone(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean isGone) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setTextWithAStatus"})
    public static final void setTextWithAStatus(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, int AStatus) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setTextWithGStatus"})
    public static final void setTextWithGStatus(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, int AStatus) {
    }
}