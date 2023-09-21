package android.support.p001v4.view;

import android.os.Build;
import android.os.Bundle;
import android.support.p001v4.view.p017a.C0418g;
import android.support.p001v4.view.p017a.C0429l;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.a */
/* compiled from: AccessibilityDelegateCompat */
public class C0399a {

    /* renamed from: b */
    private static final C0401b f992b;

    /* renamed from: c */
    private static final Object f993c = f992b.mo1303a();

    /* renamed from: a */
    final Object f994a = f992b.mo1304a(this);

    /* renamed from: android.support.v4.view.a$b */
    /* compiled from: AccessibilityDelegateCompat */
    interface C0401b {
        /* renamed from: a */
        C0429l mo1312a(Object obj, View view);

        /* renamed from: a */
        Object mo1303a();

        /* renamed from: a */
        Object mo1304a(C0399a aVar);

        /* renamed from: a */
        void mo1305a(Object obj, View view, int i);

        /* renamed from: a */
        void mo1306a(Object obj, View view, C0418g gVar);

        /* renamed from: a */
        boolean mo1313a(Object obj, View view, int i, Bundle bundle);

        /* renamed from: a */
        boolean mo1307a(Object obj, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        boolean mo1308a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo1309b(Object obj, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: c */
        void mo1310c(Object obj, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: d */
        void mo1311d(Object obj, View view, AccessibilityEvent accessibilityEvent);
    }

    /* renamed from: android.support.v4.view.a$d */
    /* compiled from: AccessibilityDelegateCompat */
    static class C0403d implements C0401b {
        C0403d() {
        }

        /* renamed from: a */
        public Object mo1303a() {
            return null;
        }

        /* renamed from: a */
        public Object mo1304a(C0399a aVar) {
            return null;
        }

        /* renamed from: a */
        public boolean mo1307a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return false;
        }

        /* renamed from: b */
        public void mo1309b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: a */
        public void mo1306a(Object obj, View view, C0418g gVar) {
        }

        /* renamed from: c */
        public void mo1310c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: a */
        public boolean mo1308a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return true;
        }

        /* renamed from: a */
        public void mo1305a(Object obj, View view, int i) {
        }

        /* renamed from: d */
        public void mo1311d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: a */
        public C0429l mo1312a(Object obj, View view) {
            return null;
        }

        /* renamed from: a */
        public boolean mo1313a(Object obj, View view, int i, Bundle bundle) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.a$a */
    /* compiled from: AccessibilityDelegateCompat */
    static class C0400a extends C0403d {
        C0400a() {
        }

        /* renamed from: a */
        public Object mo1303a() {
            return C0462d.m2629a();
        }

        /* renamed from: a */
        public Object mo1304a(C0399a aVar) {
            return C0462d.m2630a(new C0460b(this, aVar));
        }

        /* renamed from: a */
        public boolean mo1307a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return C0462d.m2633a(obj, view, accessibilityEvent);
        }

        /* renamed from: b */
        public void mo1309b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C0462d.m2635b(obj, view, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo1306a(Object obj, View view, C0418g gVar) {
            C0462d.m2632a(obj, view, gVar.mo1327a());
        }

        /* renamed from: c */
        public void mo1310c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C0462d.m2636c(obj, view, accessibilityEvent);
        }

        /* renamed from: a */
        public boolean mo1308a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return C0462d.m2634a(obj, viewGroup, view, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo1305a(Object obj, View view, int i) {
            C0462d.m2631a(obj, view, i);
        }

        /* renamed from: d */
        public void mo1311d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C0462d.m2637d(obj, view, accessibilityEvent);
        }
    }

    /* renamed from: android.support.v4.view.a$c */
    /* compiled from: AccessibilityDelegateCompat */
    static class C0402c extends C0400a {
        C0402c() {
        }

        /* renamed from: a */
        public Object mo1304a(C0399a aVar) {
            return C0465f.m2652a(new C0461c(this, aVar));
        }

        /* renamed from: a */
        public C0429l mo1312a(Object obj, View view) {
            Object a = C0465f.m2653a(obj, view);
            if (a != null) {
                return new C0429l(a);
            }
            return null;
        }

        /* renamed from: a */
        public boolean mo1313a(Object obj, View view, int i, Bundle bundle) {
            return C0465f.m2654a(obj, view, i, bundle);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f992b = new C0402c();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f992b = new C0400a();
        } else {
            f992b = new C0403d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo1297a() {
        return this.f994a;
    }

    /* renamed from: a */
    public void mo1298a(View view, int i) {
        f992b.mo1305a(f993c, view, i);
    }

    /* renamed from: a */
    public void mo1299a(View view, AccessibilityEvent accessibilityEvent) {
        f992b.mo1311d(f993c, view, accessibilityEvent);
    }

    /* renamed from: b */
    public boolean mo1301b(View view, AccessibilityEvent accessibilityEvent) {
        return f992b.mo1307a(f993c, view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo1302c(View view, AccessibilityEvent accessibilityEvent) {
        f992b.mo1310c(f993c, view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo1223d(View view, AccessibilityEvent accessibilityEvent) {
        f992b.mo1309b(f993c, view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1221a(View view, C0418g gVar) {
        f992b.mo1306a(f993c, view, gVar);
    }

    /* renamed from: a */
    public boolean mo1300a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f992b.mo1308a(f993c, viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public C0429l mo1296a(View view) {
        return f992b.mo1312a(f993c, view);
    }

    /* renamed from: a */
    public boolean mo1222a(View view, int i, Bundle bundle) {
        return f992b.mo1313a(f993c, view, i, bundle);
    }
}
