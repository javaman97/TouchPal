package android.support.p001v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;

/* renamed from: android.support.v4.app.V */
/* compiled from: NotificationCompatGingerbread */
class C0090V {
    C0090V() {
    }

    /* renamed from: a */
    public static Notification m361a(Notification notification, Context context, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        notification.setLatestEventInfo(context, charSequence, charSequence2, pendingIntent);
        notification.fullScreenIntent = pendingIntent2;
        return notification;
    }
}
