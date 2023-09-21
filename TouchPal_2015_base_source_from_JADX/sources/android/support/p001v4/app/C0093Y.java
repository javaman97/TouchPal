package android.support.p001v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.app.C0086T;
import android.support.p001v4.app.C0127ag;
import android.util.Log;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.app.Y */
/* compiled from: NotificationCompatJellybean */
class C0093Y {

    /* renamed from: a */
    public static final String f242a = "NotificationCompat";

    /* renamed from: b */
    static final String f243b = "android.support.localOnly";

    /* renamed from: c */
    static final String f244c = "android.support.actionExtras";

    /* renamed from: d */
    static final String f245d = "android.support.remoteInputs";

    /* renamed from: e */
    static final String f246e = "android.support.groupKey";

    /* renamed from: f */
    static final String f247f = "android.support.isGroupSummary";

    /* renamed from: g */
    static final String f248g = "android.support.sortKey";

    /* renamed from: h */
    static final String f249h = "android.support.useSideChannel";

    /* renamed from: i */
    private static final String f250i = "icon";

    /* renamed from: j */
    private static final String f251j = "title";

    /* renamed from: k */
    private static final String f252k = "actionIntent";

    /* renamed from: l */
    private static final String f253l = "extras";

    /* renamed from: m */
    private static final String f254m = "remoteInputs";

    /* renamed from: n */
    private static final Object f255n = new Object();

    /* renamed from: o */
    private static Field f256o;

    /* renamed from: p */
    private static boolean f257p;

    /* renamed from: q */
    private static final Object f258q = new Object();

    /* renamed from: r */
    private static Class<?> f259r;

    /* renamed from: s */
    private static Field f260s;

    /* renamed from: t */
    private static Field f261t;

    /* renamed from: u */
    private static Field f262u;

    /* renamed from: v */
    private static Field f263v;

    /* renamed from: w */
    private static boolean f264w;

    C0093Y() {
    }

    /* renamed from: android.support.v4.app.Y$a */
    /* compiled from: NotificationCompatJellybean */
    public static class C0094a implements C0060O, C0061P {

        /* renamed from: a */
        private Notification.Builder f265a;

        /* renamed from: b */
        private final Bundle f266b;

        /* renamed from: c */
        private List<Bundle> f267c = new ArrayList();

        public C0094a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2) {
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
            this.f265a = deleteIntent.setFullScreenIntent(pendingIntent2, z8).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z);
            this.f266b = new Bundle();
            if (bundle != null) {
                this.f266b.putAll(bundle);
            }
            if (z3) {
                this.f266b.putBoolean("android.support.localOnly", true);
            }
            if (str != null) {
                this.f266b.putString("android.support.groupKey", str);
                if (z4) {
                    this.f266b.putBoolean("android.support.isGroupSummary", true);
                } else {
                    this.f266b.putBoolean("android.support.useSideChannel", true);
                }
            }
            if (str2 != null) {
                this.f266b.putString("android.support.sortKey", str2);
            }
        }

        /* renamed from: a */
        public void mo228a(C0086T.C0087a aVar) {
            this.f267c.add(C0093Y.m364a(this.f265a, aVar));
        }

        /* renamed from: a */
        public Notification.Builder mo229a() {
            return this.f265a;
        }

        /* renamed from: b */
        public Notification mo347b() {
            Notification build = this.f265a.build();
            Bundle a = C0093Y.m365a(build);
            Bundle bundle = new Bundle(this.f266b);
            for (String str : this.f266b.keySet()) {
                if (a.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a.putAll(bundle);
            SparseArray<Bundle> a2 = C0093Y.m370a(this.f267c);
            if (a2 != null) {
                C0093Y.m365a(build).putSparseParcelableArray("android.support.actionExtras", a2);
            }
            return build;
        }
    }

    /* renamed from: a */
    public static void m373a(C0061P p, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(p.mo229a()).setBigContentTitle(charSequence).bigText(charSequence3);
        if (z) {
            bigText.setSummaryText(charSequence2);
        }
    }

    /* renamed from: a */
    public static void m372a(C0061P p, CharSequence charSequence, boolean z, CharSequence charSequence2, Bitmap bitmap, Bitmap bitmap2, boolean z2) {
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(p.mo229a()).setBigContentTitle(charSequence).bigPicture(bitmap);
        if (z2) {
            bigPicture.bigLargeIcon(bitmap2);
        }
        if (z) {
            bigPicture.setSummaryText(charSequence2);
        }
    }

    /* renamed from: a */
    public static void m374a(C0061P p, CharSequence charSequence, boolean z, CharSequence charSequence2, ArrayList<CharSequence> arrayList) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(p.mo229a()).setBigContentTitle(charSequence);
        if (z) {
            bigContentTitle.setSummaryText(charSequence2);
        }
        Iterator<CharSequence> it = arrayList.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }

    /* renamed from: a */
    public static SparseArray<Bundle> m370a(List<Bundle> list) {
        SparseArray<Bundle> sparseArray = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m365a(Notification notification) {
        synchronized (f255n) {
            if (f257p) {
                return null;
            }
            try {
                if (f256o == null) {
                    Field declaredField = Notification.class.getDeclaredField(f253l);
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(f242a, "Notification.extras field is not of type Bundle");
                        f257p = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f256o = declaredField;
                }
                Bundle bundle = (Bundle) f256o.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f256o.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e(f242a, "Unable to access notification extras", e);
                f257p = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e(f242a, "Unable to access notification extras", e2);
                f257p = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    public static C0086T.C0087a m369a(C0086T.C0087a.C0088a aVar, C0127ag.C0128a.C0129a aVar2, int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        C0127ag.C0128a[] aVarArr = null;
        if (bundle != null) {
            aVarArr = C0130ah.m503a(C0162k.m653a(bundle, "android.support.remoteInputs"), aVar2);
        }
        return aVar.mo344b(i, charSequence, pendingIntent, bundle, aVarArr);
    }

    /* renamed from: a */
    public static Bundle m364a(Notification.Builder builder, C0086T.C0087a aVar) {
        builder.addAction(aVar.mo230a(), aVar.mo231b(), aVar.mo232c());
        Bundle bundle = new Bundle(aVar.mo233d());
        if (aVar.mo235f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", C0130ah.m502a(aVar.mo235f()));
        }
        return bundle;
    }

    /* renamed from: b */
    public static int m377b(Notification notification) {
        int length;
        synchronized (f258q) {
            Object[] g = m382g(notification);
            length = g != null ? g.length : 0;
        }
        return length;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p001v4.app.C0086T.C0087a m367a(android.app.Notification r8, int r9, android.support.p001v4.app.C0086T.C0087a.C0088a r10, android.support.p001v4.app.C0127ag.C0128a.C0129a r11) {
        /*
            r6 = 0
            java.lang.Object r7 = f258q
            monitor-enter(r7)
            java.lang.Object[] r0 = m382g(r8)     // Catch:{ IllegalAccessException -> 0x003d }
            r1 = r0[r9]     // Catch:{ IllegalAccessException -> 0x003d }
            android.os.Bundle r0 = m365a((android.app.Notification) r8)     // Catch:{ IllegalAccessException -> 0x003d }
            if (r0 == 0) goto L_0x004e
            java.lang.String r2 = "android.support.actionExtras"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r2)     // Catch:{ IllegalAccessException -> 0x003d }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r0.get(r9)     // Catch:{ IllegalAccessException -> 0x003d }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ IllegalAccessException -> 0x003d }
            r5 = r0
        L_0x001f:
            java.lang.reflect.Field r0 = f261t     // Catch:{ IllegalAccessException -> 0x003d }
            int r2 = r0.getInt(r1)     // Catch:{ IllegalAccessException -> 0x003d }
            java.lang.reflect.Field r0 = f262u     // Catch:{ IllegalAccessException -> 0x003d }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ IllegalAccessException -> 0x003d }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ IllegalAccessException -> 0x003d }
            java.lang.reflect.Field r0 = f263v     // Catch:{ IllegalAccessException -> 0x003d }
            java.lang.Object r4 = r0.get(r1)     // Catch:{ IllegalAccessException -> 0x003d }
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4     // Catch:{ IllegalAccessException -> 0x003d }
            r0 = r10
            r1 = r11
            android.support.v4.app.T$a r0 = m369a(r0, r1, r2, r3, r4, r5)     // Catch:{ IllegalAccessException -> 0x003d }
            monitor-exit(r7)     // Catch:{ all -> 0x004b }
        L_0x003c:
            return r0
        L_0x003d:
            r0 = move-exception
            java.lang.String r1 = "NotificationCompat"
            java.lang.String r2 = "Unable to access notification actions"
            android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x004b }
            r0 = 1
            f264w = r0     // Catch:{ all -> 0x004b }
            monitor-exit(r7)     // Catch:{ all -> 0x004b }
            r0 = r6
            goto L_0x003c
        L_0x004b:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004b }
            throw r0
        L_0x004e:
            r5 = r6
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.app.C0093Y.m367a(android.app.Notification, int, android.support.v4.app.T$a$a, android.support.v4.app.ag$a$a):android.support.v4.app.T$a");
    }

    /* renamed from: g */
    private static Object[] m382g(Notification notification) {
        synchronized (f258q) {
            if (!m375a()) {
                return null;
            }
            try {
                Object[] objArr = (Object[]) f260s.get(notification);
                return objArr;
            } catch (IllegalAccessException e) {
                Log.e(f242a, "Unable to access notification actions", e);
                f264w = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    private static boolean m375a() {
        boolean z = true;
        if (f264w) {
            return false;
        }
        try {
            if (f260s == null) {
                f259r = Class.forName("android.app.Notification$Action");
                f261t = f259r.getDeclaredField(f250i);
                f262u = f259r.getDeclaredField("title");
                f263v = f259r.getDeclaredField(f252k);
                f260s = Notification.class.getDeclaredField("actions");
                f260s.setAccessible(true);
            }
        } catch (ClassNotFoundException e) {
            Log.e(f242a, "Unable to access notification actions", e);
            f264w = true;
        } catch (NoSuchFieldException e2) {
            Log.e(f242a, "Unable to access notification actions", e2);
            f264w = true;
        }
        if (f264w) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public static C0086T.C0087a[] m376a(ArrayList<Parcelable> arrayList, C0086T.C0087a.C0088a aVar, C0127ag.C0128a.C0129a aVar2) {
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
            b[i2] = m368a((Bundle) arrayList.get(i2), aVar, aVar2);
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    private static C0086T.C0087a m368a(Bundle bundle, C0086T.C0087a.C0088a aVar, C0127ag.C0128a.C0129a aVar2) {
        return aVar.mo344b(bundle.getInt(f250i), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable(f252k), bundle.getBundle(f253l), C0130ah.m503a(C0162k.m653a(bundle, f254m), aVar2));
    }

    /* renamed from: a */
    public static ArrayList<Parcelable> m371a(C0086T.C0087a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        ArrayList<Parcelable> arrayList = new ArrayList<>(aVarArr.length);
        for (C0086T.C0087a a : aVarArr) {
            arrayList.add(m366a(a));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Bundle m366a(C0086T.C0087a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(f250i, aVar.mo230a());
        bundle.putCharSequence("title", aVar.mo231b());
        bundle.putParcelable(f252k, aVar.mo232c());
        bundle.putBundle(f253l, aVar.mo233d());
        bundle.putParcelableArray(f254m, C0130ah.m502a(aVar.mo235f()));
        return bundle;
    }

    /* renamed from: c */
    public static boolean m378c(Notification notification) {
        return m365a(notification).getBoolean("android.support.localOnly");
    }

    /* renamed from: d */
    public static String m379d(Notification notification) {
        return m365a(notification).getString("android.support.groupKey");
    }

    /* renamed from: e */
    public static boolean m380e(Notification notification) {
        return m365a(notification).getBoolean("android.support.isGroupSummary");
    }

    /* renamed from: f */
    public static String m381f(Notification notification) {
        return m365a(notification).getString("android.support.sortKey");
    }
}
