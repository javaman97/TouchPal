package android.support.p001v4.view.p017a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.a.a */
/* compiled from: AccessibilityEventCompat */
public class C0404a {

    /* renamed from: a */
    public static final int f995a = 128;

    /* renamed from: b */
    public static final int f996b = 256;

    /* renamed from: c */
    public static final int f997c = 512;

    /* renamed from: d */
    public static final int f998d = 1024;

    /* renamed from: e */
    public static final int f999e = 2048;

    /* renamed from: f */
    public static final int f1000f = 4096;

    /* renamed from: g */
    public static final int f1001g = 8192;

    /* renamed from: h */
    public static final int f1002h = 16384;

    /* renamed from: i */
    public static final int f1003i = 32768;

    /* renamed from: j */
    public static final int f1004j = 65536;

    /* renamed from: k */
    public static final int f1005k = 131072;

    /* renamed from: l */
    public static final int f1006l = 262144;

    /* renamed from: m */
    public static final int f1007m = 524288;

    /* renamed from: n */
    public static final int f1008n = 1048576;

    /* renamed from: o */
    public static final int f1009o = 2097152;

    /* renamed from: p */
    public static final int f1010p = -1;

    /* renamed from: q */
    private static final C0407c f1011q;

    /* renamed from: android.support.v4.view.a.a$c */
    /* compiled from: AccessibilityEventCompat */
    interface C0407c {
        /* renamed from: a */
        int mo1314a(AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        Object mo1315a(AccessibilityEvent accessibilityEvent, int i);

        /* renamed from: a */
        void mo1316a(AccessibilityEvent accessibilityEvent, Object obj);
    }

    /* renamed from: android.support.v4.view.a.a$b */
    /* compiled from: AccessibilityEventCompat */
    static class C0406b implements C0407c {
        C0406b() {
        }

        /* renamed from: a */
        public void mo1316a(AccessibilityEvent accessibilityEvent, Object obj) {
        }

        /* renamed from: a */
        public Object mo1315a(AccessibilityEvent accessibilityEvent, int i) {
            return null;
        }

        /* renamed from: a */
        public int mo1314a(AccessibilityEvent accessibilityEvent) {
            return 0;
        }
    }

    /* renamed from: android.support.v4.view.a.a$a */
    /* compiled from: AccessibilityEventCompat */
    static class C0405a extends C0406b {
        C0405a() {
        }

        /* renamed from: a */
        public void mo1316a(AccessibilityEvent accessibilityEvent, Object obj) {
            C0408b.m1948a(accessibilityEvent, obj);
        }

        /* renamed from: a */
        public Object mo1315a(AccessibilityEvent accessibilityEvent, int i) {
            return C0408b.m1947a(accessibilityEvent, i);
        }

        /* renamed from: a */
        public int mo1314a(AccessibilityEvent accessibilityEvent) {
            return C0408b.m1946a(accessibilityEvent);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f1011q = new C0405a();
        } else {
            f1011q = new C0406b();
        }
    }

    private C0404a() {
    }

    /* renamed from: a */
    public static int m1933a(AccessibilityEvent accessibilityEvent) {
        return f1011q.mo1314a(accessibilityEvent);
    }

    /* renamed from: a */
    public static void m1935a(AccessibilityEvent accessibilityEvent, C0442s sVar) {
        f1011q.mo1316a(accessibilityEvent, sVar.mo1474a());
    }

    /* renamed from: a */
    public static C0442s m1934a(AccessibilityEvent accessibilityEvent, int i) {
        return new C0442s(f1011q.mo1315a(accessibilityEvent, i));
    }

    /* renamed from: b */
    public static C0442s m1936b(AccessibilityEvent accessibilityEvent) {
        return new C0442s(accessibilityEvent);
    }
}
