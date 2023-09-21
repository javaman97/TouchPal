package android.support.p001v4.app;

import android.app.Notification;
import android.app.NotificationManager;

/* renamed from: android.support.v4.app.ab */
/* compiled from: NotificationManagerCompatEclair */
class C0117ab {
    C0117ab() {
    }

    /* renamed from: a */
    static void m460a(NotificationManager notificationManager, String str, int i) {
        notificationManager.cancel(str, i);
    }

    /* renamed from: a */
    public static void m461a(NotificationManager notificationManager, String str, int i, Notification notification) {
        notificationManager.notify(str, i, notification);
    }
}
