package com.cootek.smartinput5.func.learnmanager;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.cootek.smartinput5.engine.Engine;
import com.emoji.keyboard.touchpal.R;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.learnmanager.f */
/* compiled from: LearnTextNotificationManager */
public class C1823f {

    /* renamed from: a */
    private static final int f6074a = 2;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C1823f f6075b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f6076c;

    /* renamed from: d */
    private NotificationManager f6077d;

    /* renamed from: e */
    private HashSet<Integer> f6078e = new HashSet<>();

    /* renamed from: f */
    private C1824a[] f6079f = new C1824a[2];

    /* renamed from: com.cootek.smartinput5.func.learnmanager.f$a */
    /* compiled from: LearnTextNotificationManager */
    public static class C1824a {

        /* renamed from: b */
        public static final String[] f6080b = {"com.emoji.keyboard.touchpal.INTERNAL_ACTION.learn_text_notification.run", "com.emoji.keyboard.touchpal.INTERNAL_ACTION.learn_text_notification.cancel"};

        /* renamed from: c */
        public static final String f6081c = "notificationType";

        /* renamed from: d */
        public static final int f6082d = 0;

        /* renamed from: e */
        public static final int f6083e = 1;

        /* renamed from: f */
        public static final int f6084f = 0;

        /* renamed from: g */
        public static final int f6085g = 1;

        /* renamed from: h */
        public static final int f6086h = 0;

        /* renamed from: i */
        public static final int f6087i = 1;

        /* renamed from: j */
        public static final int f6088j = 2;

        /* renamed from: k */
        public final int f6089k;

        /* renamed from: l */
        public final Notification f6090l = new Notification();

        public C1824a(int i) {
            this.f6089k = i;
            this.f6090l.icon = R.drawable.icon_small;
        }

        /* renamed from: b */
        public void mo6844b() {
        }

        /* renamed from: a */
        public void mo6843a() {
        }

        /* renamed from: c */
        public void mo6871c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public PendingIntent mo6870a(int i) {
            Intent intent = new Intent(C1823f.f6075b.f6076c, LearnTextReceiver.class);
            intent.setAction(f6080b[i]);
            intent.putExtra(f6081c, this.f6089k);
            return PendingIntent.getBroadcast(C1823f.f6075b.f6076c, this.f6089k, intent, Engine.EXCEPTION_WARN);
        }
    }

    private C1823f(Context context) {
        this.f6076c = context;
        this.f6077d = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    public static void m8405a(Context context) {
        if (f6075b == null) {
            f6075b = new C1823f(context);
        }
    }

    /* renamed from: a */
    public static C1823f m8404a() {
        return f6075b;
    }

    /* renamed from: a */
    public void mo6866a(C1824a aVar) {
        if (aVar != null) {
            aVar.mo6844b();
            this.f6077d.notify(aVar.f6089k, aVar.f6090l);
            this.f6079f[aVar.f6089k] = aVar;
            this.f6078e.add(Integer.valueOf(aVar.f6089k));
        }
    }

    /* renamed from: b */
    public void mo6868b(C1824a aVar) {
        if (aVar != null) {
            this.f6077d.cancel(aVar.f6089k);
            this.f6078e.remove(Integer.valueOf(aVar.f6089k));
        }
    }

    /* renamed from: b */
    public void mo6867b() {
        Iterator<Integer> it = this.f6078e.iterator();
        while (it.hasNext()) {
            this.f6077d.cancel(it.next().intValue());
        }
    }

    /* renamed from: c */
    public static void m8406c() {
        if (f6075b != null) {
            f6075b.mo6867b();
        }
        f6075b = null;
    }

    /* renamed from: d */
    public C1824a[] mo6869d() {
        return this.f6079f;
    }
}
