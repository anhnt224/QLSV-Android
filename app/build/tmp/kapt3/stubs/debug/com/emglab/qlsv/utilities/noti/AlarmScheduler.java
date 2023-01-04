package com.emglab.qlsv.utilities.noti;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J*\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/emglab/qlsv/utilities/noti/AlarmScheduler;", "", "()V", "TAG", "", "createPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "reminderData", "Lcom/emglab/qlsv/utilities/noti/ReminderData;", "scheduleAlarm", "", "alarmIntent", "alarmManager", "Landroid/app/AlarmManager;", "time", "Ljava/util/Date;", "scheduleAlarmForReminder", "app_debug"})
public final class AlarmScheduler {
    private static final java.lang.String TAG = "_ALARM";
    public static final com.emglab.qlsv.utilities.noti.AlarmScheduler INSTANCE = null;
    
    /**
     * * Schedule alarm for [ReminderData]
     *     *
     *     * @param context       current application context
     *     * @param reminderData  ReminderData to use for the alarm
     */
    public final void scheduleAlarmForReminder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.emglab.qlsv.utilities.noti.ReminderData reminderData) {
    }
    
    /**
     * * schedule a single alarm
     */
    private final void scheduleAlarm(android.content.Context context, com.emglab.qlsv.utilities.noti.ReminderData reminderData, android.app.PendingIntent alarmIntent, android.app.AlarmManager alarmManager) {
    }
    
    public final void scheduleAlarm(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Date time) {
    }
    
    /**
     * * Creates a [PendingIntent] for the Alarm using the [ReminderData]
     *     *
     *     * @param context       current application context
     *     * @param reminderData  ReminderData for the notification
     */
    private final android.app.PendingIntent createPendingIntent(android.content.Context context, com.emglab.qlsv.utilities.noti.ReminderData reminderData) {
        return null;
    }
    
    private AlarmScheduler() {
        super();
    }
}