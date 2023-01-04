package com.emglab.qlsv.models.entity.gift;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/emglab/qlsv/models/entity/gift/GiftRegisteredStatus;", "", "title", "", "value", "", "bgColor", "titleColor", "(Ljava/lang/String;ILjava/lang/String;III)V", "getBgColor", "()I", "getTitle", "()Ljava/lang/String;", "getTitleColor", "getValue", "UNREGISTERED", "APPROVED", "NEW", "CANCELED", "CANCEL_REQUEST", "OTHER", "app_debug"})
public enum GiftRegisteredStatus {
    /*public static final*/ UNREGISTERED /* = new UNREGISTERED(null, 0, 0, 0) */ /*enum*/ (null, 0, 0, 0),
    /*public static final*/ APPROVED /* = new APPROVED(null, 0, 0, 0) */ /*enum*/ (null, 0, 0, 0),
    /*public static final*/ NEW /* = new NEW(null, 0, 0, 0) */ /*enum*/ (null, 0, 0, 0),
    /*public static final*/ CANCELED /* = new CANCELED(null, 0, 0, 0) */ /*enum*/ (null, 0, 0, 0),
    /*public static final*/ CANCEL_REQUEST /* = new CANCEL_REQUEST(null, 0, 0, 0) */ /*enum*/ (null, 0, 0, 0),
    /*public static final*/ OTHER /* = new OTHER(null, 0, 0, 0) */ /*enum*/ (null, 0, 0, 0);
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private final int value = 0;
    private final int bgColor = 0;
    private final int titleColor = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getValue() {
        return 0;
    }
    
    public final int getBgColor() {
        return 0;
    }
    
    public final int getTitleColor() {
        return 0;
    }
    
    GiftRegisteredStatus(java.lang.String title, int value, int bgColor, int titleColor) {
    }
}