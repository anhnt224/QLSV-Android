package com.emglab.qlsv.utilities.noti

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import java.util.*

object AlarmScheduler {
    private const val TAG = "_ALARM"

    /**
     * Schedule alarm for [ReminderData]
     *
     * @param context       current application context
     * @param reminderData  ReminderData to use for the alarm
     */
    fun scheduleAlarmForReminder(context: Context, reminderData: ReminderData){
        // get the AlarmManager reference
        val alarmMgr = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager

        //Schedule alarm based on the reminderData
        val alarmIntent = createPendingIntent(context, reminderData)

        scheduleAlarm(context, reminderData, alarmIntent, alarmMgr)
    }

    /**
     * schedule a single alarm
     */
    private fun scheduleAlarm(context: Context, reminderData: ReminderData, alarmIntent: PendingIntent?, alarmManager: AlarmManager){
        val datetimeToAlarm = Calendar.getInstance(Locale("vi", "VN"))
        datetimeToAlarm.time = reminderData.getDate()

        alarmManager.set(
            AlarmManager.RTC_WAKEUP,
            datetimeToAlarm.timeInMillis,
            alarmIntent
        )
    }

    fun scheduleAlarm(context: Context, time: Date){
        val datetimeToAlarm = Calendar.getInstance(Locale("vi", "VN"))
        datetimeToAlarm.time = time

        // get the AlarmManager reference
        val alarmMgr = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager

        //Schedule alarm based on the reminderData
        val alarmIntent = createPendingIntent(context, ReminderData())

        alarmMgr.set(
            AlarmManager.RTC_WAKEUP,
            datetimeToAlarm.timeInMillis,
            alarmIntent
        )
    }

    /**
     * Creates a [PendingIntent] for the Alarm using the [ReminderData]
     *
     * @param context       current application context
     * @param reminderData  ReminderData for the notification
     */
    private fun createPendingIntent(context: Context, reminderData: ReminderData): PendingIntent? {
        val intent = Intent(context.applicationContext, AlarmReceiver::class.java).apply {
            type = reminderData.id
        }

        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            PendingIntent.getBroadcast(context, (0..100000).random(), intent, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_MUTABLE)
        } else {
            PendingIntent.getBroadcast(context, (0..100000).random(), intent, PendingIntent.FLAG_UPDATE_CURRENT)
        }
    }


}