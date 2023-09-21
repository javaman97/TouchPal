package android.support.p001v4.view.p017a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.support.p001v4.view.p017a.C0415e;
import android.view.accessibility.AccessibilityManager;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v4.view.a.c */
/* compiled from: AccessibilityManagerCompat */
public class C0409c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C0412c f1012a;

    /* renamed from: android.support.v4.view.a.c$c */
    /* compiled from: AccessibilityManagerCompat */
    interface C0412c {
        /* renamed from: a */
        Object mo1317a(C0413d dVar);

        /* renamed from: a */
        List<AccessibilityServiceInfo> mo1318a(AccessibilityManager accessibilityManager);

        /* renamed from: a */
        List<AccessibilityServiceInfo> mo1319a(AccessibilityManager accessibilityManager, int i);

        /* renamed from: a */
        boolean mo1320a(AccessibilityManager accessibilityManager, C0413d dVar);

        /* renamed from: b */
        boolean mo1321b(AccessibilityManager accessibilityManager);

        /* renamed from: b */
        boolean mo1322b(AccessibilityManager accessibilityManager, C0413d dVar);
    }

    /* renamed from: android.support.v4.view.a.c$d */
    /* compiled from: AccessibilityManagerCompat */
    public static abstract class C0413d {

        /* renamed from: a */
        final Object f1013a = C0409c.f1012a.mo1317a(this);

        /* renamed from: a */
        public abstract void mo1323a(boolean z);
    }

    /* renamed from: android.support.v4.view.a.c$b */
    /* compiled from: AccessibilityManagerCompat */
    static class C0411b implements C0412c {
        C0411b() {
        }

        /* renamed from: a */
        public Object mo1317a(C0413d dVar) {
            return null;
        }

        /* renamed from: a */
        public boolean mo1320a(AccessibilityManager accessibilityManager, C0413d dVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1322b(AccessibilityManager accessibilityManager, C0413d dVar) {
            return false;
        }

        /* renamed from: a */
        public List<AccessibilityServiceInfo> mo1319a(AccessibilityManager accessibilityManager, int i) {
            return Collections.emptyList();
        }

        /* renamed from: a */
        public List<AccessibilityServiceInfo> mo1318a(AccessibilityManager accessibilityManager) {
            return Collections.emptyList();
        }

        /* renamed from: b */
        public boolean mo1321b(AccessibilityManager accessibilityManager) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.a.c$a */
    /* compiled from: AccessibilityManagerCompat */
    static class C0410a extends C0411b {
        C0410a() {
        }

        /* renamed from: a */
        public Object mo1317a(C0413d dVar) {
            return C0415e.m1975a((C0415e.C0416a) new C0414d(this, dVar));
        }

        /* renamed from: a */
        public boolean mo1320a(AccessibilityManager accessibilityManager, C0413d dVar) {
            return C0415e.m1978a(accessibilityManager, dVar.f1013a);
        }

        /* renamed from: b */
        public boolean mo1322b(AccessibilityManager accessibilityManager, C0413d dVar) {
            return C0415e.m1980b(accessibilityManager, dVar.f1013a);
        }

        /* renamed from: a */
        public List<AccessibilityServiceInfo> mo1319a(AccessibilityManager accessibilityManager, int i) {
            return C0415e.m1977a(accessibilityManager, i);
        }

        /* renamed from: a */
        public List<AccessibilityServiceInfo> mo1318a(AccessibilityManager accessibilityManager) {
            return C0415e.m1976a(accessibilityManager);
        }

        /* renamed from: b */
        public boolean mo1321b(AccessibilityManager accessibilityManager) {
            return C0415e.m1979b(accessibilityManager);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f1012a = new C0410a();
        } else {
            f1012a = new C0411b();
        }
    }

    /* renamed from: a */
    public static boolean m1952a(AccessibilityManager accessibilityManager, C0413d dVar) {
        return f1012a.mo1320a(accessibilityManager, dVar);
    }

    /* renamed from: b */
    public static boolean m1954b(AccessibilityManager accessibilityManager, C0413d dVar) {
        return f1012a.mo1322b(accessibilityManager, dVar);
    }

    /* renamed from: a */
    public static List<AccessibilityServiceInfo> m1950a(AccessibilityManager accessibilityManager) {
        return f1012a.mo1318a(accessibilityManager);
    }

    /* renamed from: a */
    public static List<AccessibilityServiceInfo> m1951a(AccessibilityManager accessibilityManager, int i) {
        return f1012a.mo1319a(accessibilityManager, i);
    }

    /* renamed from: b */
    public static boolean m1953b(AccessibilityManager accessibilityManager) {
        return f1012a.mo1321b(accessibilityManager);
    }
}
