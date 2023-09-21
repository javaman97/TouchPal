package android.support.p001v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.app.C0086T;
import android.support.p001v4.app.C0127ag;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.S */
/* compiled from: NotificationCompatApi20 */
class C0084S {
    C0084S() {
    }

    /* renamed from: android.support.v4.app.S$a */
    /* compiled from: NotificationCompatApi20 */
    public static class C0085a implements C0060O, C0061P {

        /* renamed from: a */
        private Notification.Builder f235a;

        public C0085a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2) {
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
            this.f235a = deleteIntent.setFullScreenIntent(pendingIntent2, z8).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z3).setExtras(bundle).setGroup(str).setGroupSummary(z4).setSortKey(str2);
        }

        /* renamed from: a */
        public void mo228a(C0086T.C0087a aVar) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.mo230a(), aVar.mo231b(), aVar.mo232c());
            if (aVar.mo235f() != null) {
                for (RemoteInput addRemoteInput : C0126af.m489a(aVar.mo235f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.mo233d() != null) {
                builder.addExtras(aVar.mo233d());
            }
            this.f235a.addAction(builder.build());
        }

        /* renamed from: a */
        public Notification.Builder mo229a() {
            return this.f235a;
        }

        /* renamed from: b */
        public Notification mo346b() {
            return this.f235a.build();
        }
    }

    /* renamed from: a */
    public static C0086T.C0087a m344a(Notification notification, int i, C0086T.C0087a.C0088a aVar, C0127ag.C0128a.C0129a aVar2) {
        return m343a(notification.actions[i], aVar, aVar2);
    }

    /* renamed from: a */
    private static C0086T.C0087a m343a(Notification.Action action, C0086T.C0087a.C0088a aVar, C0127ag.C0128a.C0129a aVar2) {
        return aVar.mo344b(action.icon, action.title, action.actionIntent, action.getExtras(), C0126af.m490a(action.getRemoteInputs(), aVar2));
    }

    /* renamed from: a */
    private static Notification.Action m342a(C0086T.C0087a aVar) {
        Notification.Action.Builder addExtras = new Notification.Action.Builder(aVar.mo230a(), aVar.mo231b(), aVar.mo232c()).addExtras(aVar.mo233d());
        C0127ag.C0128a[] f = aVar.mo235f();
        if (f != null) {
            for (RemoteInput addRemoteInput : C0126af.m489a(f)) {
                addExtras.addRemoteInput(addRemoteInput);
            }
        }
        return addExtras.build();
    }

    /* renamed from: a */
    public static C0086T.C0087a[] m347a(ArrayList<Parcelable> arrayList, C0086T.C0087a.C0088a aVar, C0127ag.C0128a.C0129a aVar2) {
        if (arrayList == null) {
            return null;
        }
        C0086T.C0087a[] b = aVar.mo345b(arrayList.size());
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= b.length) {
                return b;
            }
            b[i2] = m343a((Notification.Action) arrayList.get(i2), aVar, aVar2);
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    public static ArrayList<Parcelable> m345a(C0086T.C0087a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        ArrayList<Parcelable> arrayList = new ArrayList<>(aVarArr.length);
        for (C0086T.C0087a a : aVarArr) {
            arrayList.add(m342a(a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m346a(Notification notification) {
        return (notification.flags & 256) != 0;
    }

    /* renamed from: b */
    public static String m348b(Notification notification) {
        return notification.getGroup();
    }

    /* renamed from: c */
    public static boolean m349c(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    /* renamed from: d */
    public static String m350d(Notification notification) {
        return notification.getSortKey();
    }
}
