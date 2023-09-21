package android.support.p001v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p001v4.app.C0086T;
import android.support.p001v4.app.C0127ag;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.app.Z */
/* compiled from: NotificationCompatKitKat */
class C0095Z {
    C0095Z() {
    }

    /* renamed from: android.support.v4.app.Z$a */
    /* compiled from: NotificationCompatKitKat */
    public static class C0096a implements C0060O, C0061P {

        /* renamed from: a */
        private Notification.Builder f268a;

        /* renamed from: b */
        private Bundle f269b;

        /* renamed from: c */
        private List<Bundle> f270c = new ArrayList();

        public C0096a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2) {
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            Notification.Builder lights = new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
            if ((notification.flags & 2) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            Notification.Builder ongoing = lights.setOngoing(z5);
            if ((notification.flags & 8) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z6);
            if ((notification.flags & 16) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z7).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 128) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f268a = deleteIntent.setFullScreenIntent(pendingIntent2, z8).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z);
            this.f269b = new Bundle();
            if (bundle != null) {
                this.f269b.putAll(bundle);
            }
            if (z3) {
                this.f269b.putBoolean(C0089U.f236a, true);
            }
            if (str != null) {
                this.f269b.putString(C0089U.f237b, str);
                if (z4) {
                    this.f269b.putBoolean(C0089U.f238c, true);
                } else {
                    this.f269b.putBoolean(C0106aa.f290a, true);
                }
            }
            if (str2 != null) {
                this.f269b.putString(C0089U.f239d, str2);
            }
        }

        /* renamed from: a */
        public void mo228a(C0086T.C0087a aVar) {
            this.f270c.add(C0093Y.m364a(this.f268a, aVar));
        }

        /* renamed from: a */
        public Notification.Builder mo229a() {
            return this.f268a;
        }

        /* renamed from: b */
        public Notification mo348b() {
            SparseArray<Bundle> a = C0093Y.m370a(this.f270c);
            if (a != null) {
                this.f269b.putSparseParcelableArray(C0089U.f240e, a);
            }
            this.f268a.setExtras(this.f269b);
            return this.f268a.build();
        }
    }

    /* renamed from: a */
    public static Bundle m386a(Notification notification) {
        return notification.extras;
    }

    /* renamed from: b */
    public static int m388b(Notification notification) {
        if (notification.actions != null) {
            return notification.actions.length;
        }
        return 0;
    }

    /* renamed from: a */
    public static C0086T.C0087a m387a(Notification notification, int i, C0086T.C0087a.C0088a aVar, C0127ag.C0128a.C0129a aVar2) {
        Notification.Action action = notification.actions[i];
        Bundle bundle = null;
        SparseArray sparseParcelableArray = notification.extras.getSparseParcelableArray(C0089U.f240e);
        if (sparseParcelableArray != null) {
            bundle = (Bundle) sparseParcelableArray.get(i);
        }
        return C0093Y.m369a(aVar, aVar2, action.icon, action.title, action.actionIntent, bundle);
    }

    /* renamed from: c */
    public static boolean m389c(Notification notification) {
        return notification.extras.getBoolean(C0089U.f236a);
    }

    /* renamed from: d */
    public static String m390d(Notification notification) {
        return notification.extras.getString(C0089U.f237b);
    }

    /* renamed from: e */
    public static boolean m391e(Notification notification) {
        return notification.extras.getBoolean(C0089U.f238c);
    }

    /* renamed from: f */
    public static String m392f(Notification notification) {
        return notification.extras.getString(C0089U.f239d);
    }
}
