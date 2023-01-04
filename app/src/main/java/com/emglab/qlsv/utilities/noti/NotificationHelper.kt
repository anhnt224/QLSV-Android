package com.emglab.qlsv.utilities.noti

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.emglab.qlsv.LoginActivity
import com.emglab.qlsv.R

object NotificationHelper {
    /**
     * Sets up the notification channels for API 26+.
     * Note: This uses package name + channel name to create unique channelId's.
     *
     * @param context     application context
     * @param importance  importance level for the notificaiton channel
     * @param showBadge   whether the channel should have a notification badge
     */
    fun createNotificationChannel(context: Context, importance: Int, showBadge: Boolean, reminderData: ReminderData) {

        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val channelId = "${context.packageName}-${reminderData.type}"
            val channel = NotificationChannel(channelId, reminderData.type, importance)
            channel.setShowBadge(showBadge)

            // Register the channel with the system
            val notificationManager = context.getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(channel)
        }
    }

    /**
     * Creates a notification for [ReminderData] with a full notification tap
     *
     * @param context      current application context
     * @param reminderData ReminderData for this notification
     */

    fun createNotification(context: Context, reminderData: ReminderData) {
        // create the notification
        val notificationBuilder = buildNotification(context, reminderData)

        val notificationManager = NotificationManagerCompat.from(context)
        notificationManager.notify((0..1000000).random(), notificationBuilder.build())
    }



    private fun buildNotification(context: Context, reminderData: ReminderData): NotificationCompat.Builder {
        val channelId = "${context.packageName}-${reminderData.type}"

        return NotificationCompat.Builder(context, channelId).apply {
            setSmallIcon(R.mipmap.ic_icon_app_bk_touch)
            setContentTitle(reminderData.title)
            setContentText(reminderData.content)

            if(reminderData.note.isNotEmpty()){
                setStyle(NotificationCompat.BigTextStyle().bigText(reminderData.note))
            }

            // Launches the app to open the reminder edit screen when tapping the whole notification
            val intent = Intent(context, LoginActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }

            val pendingIntent = PendingIntent.getActivity(context, 0, intent, 0)
            setContentIntent(pendingIntent)
        }
    }
}