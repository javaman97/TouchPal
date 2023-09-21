package com.cootek.smartinput5.net;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.net.s */
/* compiled from: DownloadNotificationManager */
public class C2364s {

    /* renamed from: a */
    private static final String f10408a = "DownloadNotification";

    /* renamed from: b */
    private static int f10409b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C2364s f10410c;

    /* renamed from: d */
    private NotificationManager f10411d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f10412e;

    /* renamed from: f */
    private HashSet<Integer> f10413f = new HashSet<>();

    /* renamed from: com.cootek.smartinput5.net.s$a */
    /* compiled from: DownloadNotificationManager */
    public static class C2365a {

        /* renamed from: a */
        public static final String[] f10414a = {"com.emoji.keyboard.touchpal.INTERNAL_ACTION.download_notification.run", "com.emoji.keyboard.touchpal.INTERNAL_ACTION.download_notification.cancel"};

        /* renamed from: b */
        public static final int f10415b = 0;

        /* renamed from: c */
        public static final int f10416c = 1;

        /* renamed from: g */
        private static final String f10417g = "TYPE";

        /* renamed from: h */
        private static final String f10418h = "STATUS";

        /* renamed from: i */
        private static final String f10419i = "APPID";

        /* renamed from: d */
        public final int f10420d = C2364s.m10845f();

        /* renamed from: e */
        public final Notification f10421e = new Notification();

        /* renamed from: f */
        public RemoteViews f10422f;

        public C2365a() {
            this.f10421e.icon = R.drawable.icon_downloading;
        }

        /* renamed from: c */
        public void mo7718c() {
        }

        /* renamed from: d */
        public void mo7719d() {
        }

        /* renamed from: e */
        public void mo7720e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public PendingIntent mo8030a(int i, int i2, int i3) {
            Intent intent = new Intent(C2364s.f10410c.f10412e, DownloadReceiver.class);
            intent.setAction(f10414a[i2]);
            intent.putExtra(f10417g, i);
            intent.putExtra(f10418h, i3);
            return PendingIntent.getBroadcast(C2364s.f10410c.f10412e, this.f10420d, intent, Engine.EXCEPTION_WARN);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public PendingIntent mo8031a(int i, int i2, int i3, String str) {
            Intent intent = new Intent(C2364s.f10410c.f10412e, DownloadReceiver.class);
            intent.setAction(f10414a[i2]);
            intent.putExtra(f10417g, i);
            intent.putExtra(f10418h, i3);
            intent.putExtra(f10419i, str);
            return PendingIntent.getBroadcast(C2364s.f10410c.f10412e, this.f10420d, intent, Engine.EXCEPTION_WARN);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static int m10845f() {
        int i = f10409b;
        f10409b = i + 1;
        return i;
    }

    /* renamed from: a */
    static void m10841a(Context context) {
        f10410c = new C2364s(context);
    }

    /* renamed from: a */
    public static C2364s m10840a() {
        if (f10410c == null && C1368X.m6313b() != null) {
            m10841a(C1368X.m6313b());
        }
        return f10410c;
    }

    /* renamed from: b */
    static void m10842b() {
        if (f10410c != null) {
            f10410c.mo8029c();
        }
        f10410c = null;
    }

    private C2364s(Context context) {
        this.f10412e = context;
        this.f10411d = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    public void mo8027a(C2365a aVar) {
        if (aVar != null) {
            aVar.mo7718c();
            this.f10411d.notify(aVar.f10420d, aVar.f10421e);
            this.f10413f.add(Integer.valueOf(aVar.f10420d));
        }
    }

    /* renamed from: b */
    public void mo8028b(C2365a aVar) {
        if (aVar != null) {
            this.f10411d.cancel(aVar.f10420d);
            this.f10413f.remove(Integer.valueOf(aVar.f10420d));
        }
    }

    /* renamed from: c */
    public void mo8029c() {
        Iterator<Integer> it = this.f10413f.iterator();
        while (it.hasNext()) {
            this.f10411d.cancel(it.next().intValue());
        }
    }
}
