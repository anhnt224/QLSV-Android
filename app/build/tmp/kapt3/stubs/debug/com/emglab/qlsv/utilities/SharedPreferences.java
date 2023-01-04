package com.emglab.qlsv.utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fJ\u0016\u0010\u0015\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fJ\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/emglab/qlsv/utilities/SharedPreferences;", "", "()V", "FULL_NAME", "", "LOGOUT", "SHARED_PREFERENCES_NAME", "getSHARED_PREFERENCES_NAME", "()Ljava/lang/String;", "TOKEN", "USER_CODE", "getFullName", "context", "Landroid/content/Context;", "getLogout", "", "getToken", "getUserCode", "logout", "", "saveFullName", "saveLogout", "saveToken", "token", "saveUserCode", "userCode", "app_debug"})
public final class SharedPreferences {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SHARED_PREFERENCES_NAME = "SHARED_PREFERENCES_NAME";
    private static final java.lang.String USER_CODE = "USER_CODE";
    private static final java.lang.String FULL_NAME = "FULL_NAME";
    private static final java.lang.String TOKEN = "TOKEN";
    private static final java.lang.String LOGOUT = "LOGOUT";
    public static final com.emglab.qlsv.utilities.SharedPreferences INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSHARED_PREFERENCES_NAME() {
        return null;
    }
    
    public final void saveUserCode(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String userCode) {
    }
    
    public final void saveToken(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void saveLogout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int logout) {
    }
    
    public final void saveFullName(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int logout) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserCode(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullName(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final int getLogout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public final void logout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private SharedPreferences() {
        super();
    }
}