package android.support.p001v4.view.p017a;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.view.a.l */
/* compiled from: AccessibilityNodeProviderCompat */
public class C0429l {

    /* renamed from: a */
    private static final C0430a f1049a;

    /* renamed from: b */
    private final Object f1050b;

    /* renamed from: android.support.v4.view.a.l$a */
    /* compiled from: AccessibilityNodeProviderCompat */
    interface C0430a {
        /* renamed from: a */
        Object mo1459a(C0429l lVar);
    }

    /* renamed from: android.support.v4.view.a.l$d */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C0433d implements C0430a {
        C0433d() {
        }

        /* renamed from: a */
        public Object mo1459a(C0429l lVar) {
            return null;
        }
    }

    /* renamed from: android.support.v4.view.a.l$b */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C0431b extends C0433d {
        C0431b() {
        }

        /* renamed from: a */
        public Object mo1459a(C0429l lVar) {
            return C0436o.m2322a(new C0434m(this, lVar));
        }
    }

    /* renamed from: android.support.v4.view.a.l$c */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C0432c extends C0433d {
        C0432c() {
        }

        /* renamed from: a */
        public Object mo1459a(C0429l lVar) {
            return C0439q.m2329a(new C0435n(this, lVar));
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f1049a = new C0432c();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f1049a = new C0431b();
        } else {
            f1049a = new C0433d();
        }
    }

    public C0429l() {
        this.f1050b = f1049a.mo1459a(this);
    }

    public C0429l(Object obj) {
        this.f1050b = obj;
    }

    /* renamed from: a */
    public Object mo1455a() {
        return this.f1050b;
    }

    /* renamed from: a */
    public C0418g mo1454a(int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo1457a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: a */
    public List<C0418g> mo1456a(String str, int i) {
        return null;
    }

    /* renamed from: b */
    public C0418g mo1458b(int i) {
        return null;
    }
}
