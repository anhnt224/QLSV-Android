package com.emglab.qlsv.utilities.noti;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u0010"}, d2 = {"Lcom/emglab/qlsv/utilities/noti/NotificationHelper;", "", "()V", "buildNotification", "Landroidx/core/app/NotificationCompat$Builder;", "context", "Landroid/content/Context;", "reminderData", "Lcom/emglab/qlsv/utilities/noti/ReminderData;", "createNotification", "", "createNotificationChannel", "importance", "", "showBadge", "", "app_debug"})
public final class NotificationHelper {
    public static final com.emglab.qlsv.utilities.noti.NotificationHelper INSTANCE = null;
    
    /**
     * * Sets up the notification channels for API 26+.
     *     * Note: This uses package name + channel name to create unique channelId's.
     *     *
     *     * @param context     application context
     *     * @param importance  importance level for the notificaiton channel
     *     * @param showBadge   whether the channel should have a notification badge
     */
    public final void createNotificationChannel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int importance, boolean showBadge, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.utilities.noti.ReminderData reminderData) {
    }
    
    /**
     * * Creates a notification for [ReminderData] with a full notification tap
     *     *
     *     * @param context      current application context
     *     * @param reminderData ReminderData for this notification
     */
    public final void createNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.utilities.noti.ReminderData reminderData) {
    }
    
    private final androidx.core.app.NotificationCompat.Builder buildNotification(android.content.Context context, com.emglab.qlsv.utilities.noti.ReminderData reminderData) {
        return null;
    }
    
    private NotificationHelper() {
        super();
    }
}