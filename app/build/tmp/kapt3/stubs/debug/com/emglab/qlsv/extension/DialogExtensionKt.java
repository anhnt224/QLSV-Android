package com.emglab.qlsv.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0007\u001a,\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u001a2\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u001a@\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u00a8\u0006\u0012"}, d2 = {"showDatePickerDialog", "", "Landroid/content/Context;", "select", "Lkotlin/Function1;", "Ljava/util/Calendar;", "showDialog", "title", "", "message", "positive", "Lkotlin/Function0;", "showEditextDialog", "showListDialog", "arr", "Ljava/util/ArrayList;", "index", "", "app_debug"})
public final class DialogExtensionKt {
    
    public static final void showEditextDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> positive) {
    }
    
    public static final void showDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> positive) {
    }
    
    public static final void showListDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> arr, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> index) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final void showDatePickerDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.util.Calendar, kotlin.Unit> select) {
    }
}