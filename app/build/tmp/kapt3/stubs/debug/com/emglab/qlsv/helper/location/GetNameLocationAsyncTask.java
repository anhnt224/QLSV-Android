package com.emglab.qlsv.helper.location;

import java.lang.System;

@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u00020\u00042\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\r\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004H\u0014R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/emglab/qlsv/helper/location/GetNameLocationAsyncTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "context", "Landroid/content/Context;", "callBack", "Lkotlin/Function1;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "doInBackground", "params", "", "([Ljava/lang/Double;)Ljava/lang/String;", "getNameLocation", "mLat", "mLon", "onPostExecute", "address", "app_debug"})
public final class GetNameLocationAsyncTask extends android.os.AsyncTask<java.lang.Double, java.lang.Void, java.lang.String> {
    private android.content.Context context;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> callBack = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String doInBackground(@org.jetbrains.annotations.NotNull()
    java.lang.Double... params) {
        return null;
    }
    
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    private final java.lang.String getNameLocation(double mLat, double mLon) {
        return null;
    }
    
    public GetNameLocationAsyncTask(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callBack) {
        super();
    }
}