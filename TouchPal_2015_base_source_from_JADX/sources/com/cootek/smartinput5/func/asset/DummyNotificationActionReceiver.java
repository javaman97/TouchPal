package com.cootek.smartinput5.func.asset;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.p001v4.app.C0062Q;
import com.cootek.smartinput5.engine.Engine;
import com.emoji.keyboard.touchpal.R;

public class DummyNotificationActionReceiver extends BroadcastReceiver {
    public static String DUMMY_NOTIFICATION_ACTION = "com.cootek.smartinput5.func.asset.DummyNotificationActionReceiver.action";
    private static final int FAILED_NOTIFICATION_ID = 2131624559;
    private static final int NOTIFICATION_ID = 2131624561;

    public void onReceive(Context context, Intent intent) {
    }

    public static void showInitializingNotification(Context context) {
        try {
            C0062Q.C0070d dVar = new C0062Q.C0070d(context);
            dVar.mo254a((int) R.drawable.icon_small).mo270a(context.getText(R.string.extract_resource_initializing));
            dVar.mo260a(PendingIntent.getActivity(context, 0, new Intent(context, DummyNotificationActionReceiver.class), Engine.EXCEPTION_WARN));
            ((NotificationManager) context.getSystemService("notification")).notify(R.string.extract_resource_initializing, dVar.mo282c());
        } catch (Exception e) {
        }
    }

    public static void showExtracFailedNotification(Context context) {
        try {
            C0062Q.C0070d dVar = new C0062Q.C0070d(context);
            dVar.mo254a((int) R.drawable.icon_small).mo270a(context.getText(R.string.extract_failed_msg));
            dVar.mo260a(PendingIntent.getActivity(context, 0, new Intent(context, DummyNotificationActionReceiver.class), Engine.EXCEPTION_WARN));
            Notification c = dVar.mo282c();
            c.flags = 16;
            ((NotificationManager) context.getSystemService("notification")).notify(R.string.extract_failed_msg, c);
        } catch (Exception e) {
        }
    }

    public static void removeInitializingNotification(Context context) {
        try {
            ((NotificationManager) context.getSystemService("notification")).cancel(R.string.extract_resource_initializing);
        } catch (Exception e) {
        }
    }
}
