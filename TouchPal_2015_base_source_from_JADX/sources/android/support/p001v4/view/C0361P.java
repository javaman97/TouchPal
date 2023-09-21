package android.support.p001v4.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.P */
/* compiled from: ViewGroupCompat */
public class C0361P {

    /* renamed from: a */
    public static final int f846a = 0;

    /* renamed from: b */
    public static final int f847b = 1;

    /* renamed from: c */
    static final C0364c f848c;

    /* renamed from: android.support.v4.view.P$c */
    /* compiled from: ViewGroupCompat */
    interface C0364c {
        /* renamed from: a */
        int mo1115a(ViewGroup viewGroup);

        /* renamed from: a */
        void mo1116a(ViewGroup viewGroup, int i);

        /* renamed from: a */
        void mo1113a(ViewGroup viewGroup, boolean z);

        /* renamed from: a */
        boolean mo1114a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);
    }

    /* renamed from: android.support.v4.view.P$e */
    /* compiled from: ViewGroupCompat */
    static class C0366e implements C0364c {
        C0366e() {
        }

        /* renamed from: a */
        public boolean mo1114a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return true;
        }

        /* renamed from: a */
        public void mo1113a(ViewGroup viewGroup, boolean z) {
        }

        /* renamed from: a */
        public int mo1115a(ViewGroup viewGroup) {
            return 0;
        }

        /* renamed from: a */
        public void mo1116a(ViewGroup viewGroup, int i) {
        }
    }

    /* renamed from: android.support.v4.view.P$a */
    /* compiled from: ViewGroupCompat */
    static class C0362a extends C0366e {
        C0362a() {
        }

        /* renamed from: a */
        public void mo1113a(ViewGroup viewGroup, boolean z) {
            C0372Q.m1690a(viewGroup, z);
        }
    }

    /* renamed from: android.support.v4.view.P$b */
    /* compiled from: ViewGroupCompat */
    static class C0363b extends C0362a {
        C0363b() {
        }

        /* renamed from: a */
        public boolean mo1114a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return C0373R.m1691a(viewGroup, view, accessibilityEvent);
        }
    }

    /* renamed from: android.support.v4.view.P$d */
    /* compiled from: ViewGroupCompat */
    static class C0365d extends C0363b {
        C0365d() {
        }

        /* renamed from: a */
        public int mo1115a(ViewGroup viewGroup) {
            return C0374S.m1692a(viewGroup);
        }

        /* renamed from: a */
        public void mo1116a(ViewGroup viewGroup, int i) {
            C0374S.m1693a(viewGroup, i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            f848c = new C0365d();
        } else if (i >= 14) {
            f848c = new C0363b();
        } else if (i >= 11) {
            f848c = new C0362a();
        } else {
            f848c = new C0366e();
        }
    }

    private C0361P() {
    }

    /* renamed from: a */
    public static boolean m1667a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f848c.mo1114a(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public static void m1666a(ViewGroup viewGroup, boolean z) {
        f848c.mo1113a(viewGroup, z);
    }

    /* renamed from: a */
    public static int m1664a(ViewGroup viewGroup) {
        return f848c.mo1115a(viewGroup);
    }

    /* renamed from: a */
    public static void m1665a(ViewGroup viewGroup, int i) {
        f848c.mo1116a(viewGroup, i);
    }
}
