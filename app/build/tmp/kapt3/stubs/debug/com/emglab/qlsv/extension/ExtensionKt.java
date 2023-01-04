package com.emglab.qlsv.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000~\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\u0007\u001a\u001e\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\f\u001a\f\u0010\r\u001a\u00020\u0004*\u00020\u000eH\u0007\u001a\f\u0010\u000f\u001a\u00020\u0004*\u00020\u000eH\u0007\u001a\f\u0010\u0010\u001a\u00020\u0004*\u00020\u000eH\u0007\u001a\f\u0010\u0011\u001a\u00020\u000e*\u00020\u0004H\u0007\u001a\f\u0010\u0012\u001a\u00020\u000e*\u00020\u0004H\u0007\u001a\n\u0010\u0013\u001a\u00020\u0004*\u00020\u0014\u001a\n\u0010\u0015\u001a\u00020\u0004*\u00020\u0004\u001a\f\u0010\u0016\u001a\u00020\u0004*\u00020\u000eH\u0007\u001a\f\u0010\u0017\u001a\u00020\u0014*\u00020\u000eH\u0007\u001a\f\u0010\u0018\u001a\u00020\u0004*\u00020\u000eH\u0007\u001a\f\u0010\u0019\u001a\u00020\u0004*\u00020\u000eH\u0007\u001a\n\u0010\u001a\u001a\u00020\u0004*\u00020\u000e\u001a\n\u0010\u001b\u001a\u00020\u0001*\u00020\u0007\u001a\u0012\u0010\u001c\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f\u001a\n\u0010\u001c\u001a\u00020\u0001*\u00020\u0007\u001a\n\u0010 \u001a\u00020!*\u00020\u0007\u001a\u0012\u0010\"\u001a\u00020\u0001*\u00020#2\u0006\u0010$\u001a\u00020\u0004\u001a\n\u0010%\u001a\u00020\u0001*\u00020\u0007\u001a\u0012\u0010&\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\'\u001a\u00020(\u001a\u0012\u0010)\u001a\u00020\u0001*\u00020\u00072\u0006\u0010*\u001a\u00020\u0004\u001a`\u0010+\u001a\u00020\u0001*\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u00142\b\b\u0002\u0010/\u001a\u00020\u00042\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001012\b\b\u0002\u00102\u001a\u00020\u00042\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u000101\u001a0\u00104\u001a\u00020\u0001*\u00020\u00072\u0006\u00105\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0004072\u0006\u00108\u001a\u00020\u0014\u001a.\u00109\u001a\u00020\u0001*\u00020\u00072\u0010\b\u0002\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001012\u0010\b\u0002\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u000101\u001a`\u0010<\u001a\u00020\u0001*\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u00142\b\b\u0002\u0010/\u001a\u00020\u00042\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001012\b\b\u0002\u00102\u001a\u00020\u00042\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u000101\u001aB\u0010=\u001a\u00020\u0001*\u00020\u00072\u0006\u0010-\u001a\u00020\u00042\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020\u00062\b\b\u0002\u0010A\u001a\u00020\u00042\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u000101\u001a\u0012\u0010C\u001a\u00020\u0001*\u00020D2\u0006\u0010E\u001a\u00020\u0004\u001a\u0012\u0010C\u001a\u00020\u0001*\u00020\u00072\u0006\u0010E\u001a\u00020\u0004\u001a\n\u0010F\u001a\u00020\u0004*\u00020G\u001a\n\u0010F\u001a\u00020\u0004*\u00020\u0014\u001a\u000e\u0010H\u001a\u0004\u0018\u00010\u000e*\u00020\u0004H\u0007\u001a\f\u0010I\u001a\u00020\u0004*\u00020\u000eH\u0007\u001a\f\u0010J\u001a\u00020\u0004*\u00020\u000eH\u0007\u001a\f\u0010K\u001a\u00020\u0004*\u00020\u000eH\u0007\u001a\f\u0010L\u001a\u00020\u000e*\u00020\u0004H\u0007\u001a\f\u0010M\u001a\u00020\u0004*\u00020\u000eH\u0007\u001a\f\u0010N\u001a\u00020\u0004*\u00020\u000eH\u0007\u00a8\u0006O"}, d2 = {"bind", "", "Landroid/widget/TextView;", "text", "", "checkCameraPermission", "", "Landroidx/fragment/app/Fragment;", "checkLocationPermission", "checkResource", "T", "resource", "Lcom/emglab/qlsv/common/Resource;", "converDateToStringDDMMYYYY", "Ljava/util/Date;", "converDateToStringddMMHHmm", "convertDateToStringDateTime", "convertStringToDate", "convertStringToDateDDMMYYYY", "convertTimeSSToHHMMSS", "", "firstChar", "getDateStr", "getDayOfMonth", "getMonthDayStr", "getTimeQuery", "getYearStr", "handleTokenInvalid", "hideKeyboard", "Landroid/content/Context;", "view", "Landroid/view/View;", "initLoadingDialog", "Landroid/app/Dialog;", "loadFromURL", "Landroid/widget/ImageView;", "url", "logout", "logoutClick", "sharedPrefsHelper", "Lcom/emglab/qlsv/helper/SharedPrefsHelper;", "openLink", "link", "showActionDialog", "title", "message", "icon", "positiveButtonTitle", "handlePositiveButtonTap", "Lkotlin/Function0;", "negativeButtonTitle", "handleNegativeButtonTap", "showDialog", "context", "arr", "Ljava/util/ArrayList;", "index", "showDialogClickImage", "handleSeeButton", "handleDeleteButton", "showDialogMotel", "showNotificationDialog", "type", "Lcom/emglab/qlsv/models/entity/NotificationDialogType;", "cancelable", "doneButtonText", "handleDone", "showToast", "Landroidx/appcompat/app/AppCompatActivity;", "str", "toCurrency", "", "toDate", "toDateQuery", "toDateStr", "toStringTime", "toTimeQuery", "toTimeQueryStr", "toTimeStr", "app_debug"})
public final class ExtensionKt {
    
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String str) {
    }
    
    public static final void showDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> arr, int index) {
    }
    
    public static final boolean checkLocationPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver) {
        return false;
    }
    
    public static final boolean checkCameraPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver) {
        return false;
    }
    
    public static final <T extends java.lang.Object>boolean checkResource(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.common.Resource<? extends T> resource) {
        return false;
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String str) {
    }
    
    public static final void logout(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver) {
    }
    
    public static final void handleTokenInvalid(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver) {
    }
    
    public static final void logoutClick(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.helper.SharedPrefsHelper sharedPrefsHelper) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String toTimeQueryStr(@org.jetbrains.annotations.NotNull()
    java.util.Date $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String getTimeQuery(@org.jetbrains.annotations.NotNull()
    java.util.Date $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String convertDateToStringDateTime(@org.jetbrains.annotations.NotNull()
    java.util.Date $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String toStringTime(@org.jetbrains.annotations.NotNull()
    java.util.Date $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String toDateQuery(@org.jetbrains.annotations.NotNull()
    java.util.Date $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String toDateStr(@org.jetbrains.annotations.NotNull()
    java.util.Date $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String toTimeStr(@org.jetbrains.annotations.NotNull()
    java.util.Date $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String getMonthDayStr(@org.jetbrains.annotations.NotNull()
    java.util.Date $receiver) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final int getDayOfMonth(@org.jetbrains.annotations.NotNull()
    java.util.Date $receiver) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String getDateStr(@org.jetbrains.annotations.NotNull()
    java.util.Date $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String converDateToStringDDMMYYYY(@org.jetbrains.annotations.NotNull()
    java.util.Date $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String converDateToStringddMMHHmm(@org.jetbrains.annotations.NotNull()
    java.util.Date $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getYearStr(@org.jetbrains.annotations.NotNull()
    java.util.Date $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.util.Date convertStringToDateDDMMYYYY(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.util.Date convertStringToDate(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.util.Date toDate(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.util.Date toTimeQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String firstChar(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String convertTimeSSToHHMMSS(int $receiver) {
        return null;
    }
    
    public static final void bind(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public static final void loadFromURL(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public static final void showDialogMotel(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int icon, @org.jetbrains.annotations.NotNull()
    java.lang.String positiveButtonTitle, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> handlePositiveButtonTap, @org.jetbrains.annotations.NotNull()
    java.lang.String negativeButtonTitle, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> handleNegativeButtonTap) {
    }
    
    public static final void showActionDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int icon, @org.jetbrains.annotations.NotNull()
    java.lang.String positiveButtonTitle, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> handlePositiveButtonTap, @org.jetbrains.annotations.NotNull()
    java.lang.String negativeButtonTitle, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> handleNegativeButtonTap) {
    }
    
    public static final void showDialogClickImage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> handleSeeButton, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> handleDeleteButton) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.app.Dialog initLoadingDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver) {
        return null;
    }
    
    public static final void showNotificationDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.models.entity.NotificationDialogType type, boolean cancelable, @org.jetbrains.annotations.NotNull()
    java.lang.String doneButtonText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> handleDone) {
    }
    
    public static final void openLink(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String link) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toCurrency(double $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toCurrency(int $receiver) {
        return null;
    }
}