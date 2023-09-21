package com.iflytek.cloud.util.p088a;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import com.iflytek.cloud.util.ContactManager;
import com.iflytek.cloud.util.p088a.p090b.C4024a;
import com.iflytek.cloud.util.p088a.p090b.C4025b;
import com.iflytek.cloud.util.p088a.p091c.C4027a;

/* renamed from: com.iflytek.cloud.util.a.b */
public class C4021b extends ContactManager {

    /* renamed from: a */
    private static C4021b f16423a = null;

    /* renamed from: b */
    private static Context f16424b = null;

    /* renamed from: c */
    private static int f16425c = 4;

    /* renamed from: d */
    private static C4027a f16426d = null;

    /* renamed from: e */
    private static C4018a f16427e = null;

    /* renamed from: f */
    private static C4023b f16428f;

    /* renamed from: g */
    private static C4022a f16429g;

    /* renamed from: i */
    private static ContactManager.ContactListener f16430i = null;

    /* renamed from: h */
    private HandlerThread f16431h = null;

    /* renamed from: j */
    private Handler f16432j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f16433k = 0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f16434l = 0;

    /* renamed from: com.iflytek.cloud.util.a.b$a */
    private class C4022a extends ContentObserver {
        public C4022a(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            C3990a.m17031a("iFly_ContactManager", "CallLogObserver | onChange");
            if (System.currentTimeMillis() - C4021b.this.f16434l < 5000) {
                C3990a.m17031a("iFly_ContactManager", "onChange too much");
                return;
            }
            long unused = C4021b.this.f16434l = System.currentTimeMillis();
            C4021b.this.m17136c();
        }
    }

    /* renamed from: com.iflytek.cloud.util.a.b$b */
    private class C4023b extends ContentObserver {
        public C4023b(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            C3990a.m17031a("iFly_ContactManager", "ContactObserver_Contact| onChange");
            if (System.currentTimeMillis() - C4021b.this.f16433k < 5000) {
                C3990a.m17031a("iFly_ContactManager", "onChange too much");
                return;
            }
            long unused = C4021b.this.f16433k = System.currentTimeMillis();
            C4021b.this.m17133b();
            C4021b.this.m17136c();
        }
    }

    private C4021b() {
        if (Build.VERSION.SDK_INT > f16425c) {
            f16426d = new C4025b(f16424b);
        } else {
            f16426d = new C4024a(f16424b);
        }
        f16427e = new C4018a(f16424b, f16426d);
        this.f16431h = new HandlerThread("ContactManager_worker");
        this.f16431h.start();
        this.f16432j = new Handler(this.f16431h.getLooper());
        this.f16431h.setPriority(1);
        f16428f = new C4023b(this.f16432j);
        f16429g = new C4022a(this.f16432j);
    }

    /* renamed from: a */
    public static C4021b m17129a() {
        return f16423a;
    }

    /* renamed from: a */
    public static C4021b m17130a(Context context, ContactManager.ContactListener contactListener) {
        f16430i = contactListener;
        f16424b = context;
        if (f16423a == null) {
            f16423a = new C4021b();
            f16424b.getContentResolver().registerContentObserver(f16426d.mo14771a(), true, f16428f);
            f16424b.getContentResolver().registerContentObserver(f16426d.mo14779f(), true, f16429g);
        }
        return f16423a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17133b() {
        if (f16430i != null && f16427e != null) {
            String a = C4029e.m17155a(f16427e.mo14759a(), 10);
            String str = f16424b.getFilesDir().getParent() + '/' + "name.txt";
            String a2 = C4028d.m17153a(str);
            if (a == null || a2 == null || !a.equals(a2)) {
                C4028d.m17152a(str, a, true);
                f16430i.onContactQueryFinish(a, true);
                return;
            }
            C3990a.m17031a("iFly_ContactManager", "contact name is not change.");
            f16430i.onContactQueryFinish(a, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17136c() {
        if (f16427e != null) {
            f16427e.mo14758a(10);
        }
    }

    public void asyncQueryAllContactsName() {
        this.f16432j.post(new C4026c(this));
    }

    public String queryAllContactsName() {
        if (f16427e == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] a = f16427e.mo14759a();
        int length = a.length;
        for (int i = 0; i < length; i++) {
            sb.append(a[i] + 10);
        }
        return sb.toString();
    }
}
