package android.support.p001v4.widget;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.support.p001v4.widget.C0599x;
import android.view.View;

/* renamed from: android.support.v4.widget.u */
/* compiled from: SearchViewCompat */
public class C0590u {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C0595e f1436a;

    /* renamed from: android.support.v4.widget.u$e */
    /* compiled from: SearchViewCompat */
    interface C0595e {
        /* renamed from: a */
        View mo2009a(Context context);

        /* renamed from: a */
        CharSequence mo2010a(View view);

        /* renamed from: a */
        Object mo2011a(C0591a aVar);

        /* renamed from: a */
        Object mo2012a(C0592b bVar);

        /* renamed from: a */
        void mo2013a(View view, int i);

        /* renamed from: a */
        void mo2014a(View view, ComponentName componentName);

        /* renamed from: a */
        void mo2015a(View view, CharSequence charSequence);

        /* renamed from: a */
        void mo2016a(View view, CharSequence charSequence, boolean z);

        /* renamed from: a */
        void mo2017a(View view, boolean z);

        /* renamed from: a */
        void mo2018a(Object obj, Object obj2);

        /* renamed from: b */
        void mo2025b(View view, int i);

        /* renamed from: b */
        void mo2019b(View view, boolean z);

        /* renamed from: b */
        void mo2020b(Object obj, Object obj2);

        /* renamed from: b */
        boolean mo2021b(View view);

        /* renamed from: c */
        void mo2026c(View view, int i);

        /* renamed from: c */
        void mo2022c(View view, boolean z);

        /* renamed from: c */
        boolean mo2023c(View view);

        /* renamed from: d */
        boolean mo2024d(View view);
    }

    /* renamed from: android.support.v4.widget.u$f */
    /* compiled from: SearchViewCompat */
    static class C0596f implements C0595e {
        C0596f() {
        }

        /* renamed from: a */
        public View mo2009a(Context context) {
            return null;
        }

        /* renamed from: a */
        public void mo2014a(View view, ComponentName componentName) {
        }

        /* renamed from: b */
        public void mo2025b(View view, int i) {
        }

        /* renamed from: c */
        public void mo2026c(View view, int i) {
        }

        /* renamed from: a */
        public Object mo2012a(C0592b bVar) {
            return null;
        }

        /* renamed from: a */
        public void mo2018a(Object obj, Object obj2) {
        }

        /* renamed from: a */
        public Object mo2011a(C0591a aVar) {
            return null;
        }

        /* renamed from: b */
        public void mo2020b(Object obj, Object obj2) {
        }

        /* renamed from: a */
        public CharSequence mo2010a(View view) {
            return null;
        }

        /* renamed from: a */
        public void mo2016a(View view, CharSequence charSequence, boolean z) {
        }

        /* renamed from: a */
        public void mo2015a(View view, CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo2017a(View view, boolean z) {
        }

        /* renamed from: b */
        public boolean mo2021b(View view) {
            return true;
        }

        /* renamed from: b */
        public void mo2019b(View view, boolean z) {
        }

        /* renamed from: c */
        public boolean mo2023c(View view) {
            return false;
        }

        /* renamed from: c */
        public void mo2022c(View view, boolean z) {
        }

        /* renamed from: d */
        public boolean mo2024d(View view) {
            return false;
        }

        /* renamed from: a */
        public void mo2013a(View view, int i) {
        }
    }

    /* renamed from: android.support.v4.widget.u$c */
    /* compiled from: SearchViewCompat */
    static class C0593c extends C0596f {
        C0593c() {
        }

        /* renamed from: a */
        public View mo2009a(Context context) {
            return C0599x.m3467a(context);
        }

        /* renamed from: a */
        public void mo2014a(View view, ComponentName componentName) {
            C0599x.m3472a(view, componentName);
        }

        /* renamed from: a */
        public Object mo2012a(C0592b bVar) {
            return C0599x.m3470a((C0599x.C0601b) new C0597v(this, bVar));
        }

        /* renamed from: a */
        public void mo2018a(Object obj, Object obj2) {
            C0599x.m3476a(obj, obj2);
        }

        /* renamed from: a */
        public Object mo2011a(C0591a aVar) {
            return C0599x.m3469a((C0599x.C0600a) new C0598w(this, aVar));
        }

        /* renamed from: b */
        public void mo2020b(Object obj, Object obj2) {
            C0599x.m3478b(obj, obj2);
        }

        /* renamed from: a */
        public CharSequence mo2010a(View view) {
            return C0599x.m3468a(view);
        }

        /* renamed from: a */
        public void mo2016a(View view, CharSequence charSequence, boolean z) {
            C0599x.m3474a(view, charSequence, z);
        }

        /* renamed from: a */
        public void mo2015a(View view, CharSequence charSequence) {
            C0599x.m3473a(view, charSequence);
        }

        /* renamed from: a */
        public void mo2017a(View view, boolean z) {
            C0599x.m3475a(view, z);
        }

        /* renamed from: b */
        public boolean mo2021b(View view) {
            return C0599x.m3479b(view);
        }

        /* renamed from: b */
        public void mo2019b(View view, boolean z) {
            C0599x.m3477b(view, z);
        }

        /* renamed from: c */
        public boolean mo2023c(View view) {
            return C0599x.m3481c(view);
        }

        /* renamed from: c */
        public void mo2022c(View view, boolean z) {
            C0599x.m3480c(view, z);
        }

        /* renamed from: d */
        public boolean mo2024d(View view) {
            return C0599x.m3482d(view);
        }

        /* renamed from: a */
        public void mo2013a(View view, int i) {
            C0599x.m3471a(view, i);
        }
    }

    /* renamed from: android.support.v4.widget.u$d */
    /* compiled from: SearchViewCompat */
    static class C0594d extends C0593c {
        C0594d() {
        }

        /* renamed from: a */
        public View mo2009a(Context context) {
            return SearchViewCompatIcs.m3060a(context);
        }

        /* renamed from: b */
        public void mo2025b(View view, int i) {
            SearchViewCompatIcs.m3061a(view, i);
        }

        /* renamed from: c */
        public void mo2026c(View view, int i) {
            SearchViewCompatIcs.m3062b(view, i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f1436a = new C0594d();
        } else if (Build.VERSION.SDK_INT >= 11) {
            f1436a = new C0593c();
        } else {
            f1436a = new C0596f();
        }
    }

    private C0590u(Context context) {
    }

    /* renamed from: a */
    public static View m3390a(Context context) {
        return f1436a.mo2009a(context);
    }

    /* renamed from: a */
    public static void m3393a(View view, ComponentName componentName) {
        f1436a.mo2014a(view, componentName);
    }

    /* renamed from: a */
    public static void m3392a(View view, int i) {
        f1436a.mo2025b(view, i);
    }

    /* renamed from: b */
    public static void m3399b(View view, int i) {
        f1436a.mo2026c(view, i);
    }

    /* renamed from: a */
    public static void m3395a(View view, C0592b bVar) {
        f1436a.mo2018a((Object) view, bVar.f1438a);
    }

    /* renamed from: android.support.v4.widget.u$b */
    /* compiled from: SearchViewCompat */
    public static abstract class C0592b {

        /* renamed from: a */
        final Object f1438a = C0590u.f1436a.mo2012a(this);

        /* renamed from: a */
        public boolean mo2007a(String str) {
            return false;
        }

        /* renamed from: b */
        public boolean mo2008b(String str) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m3394a(View view, C0591a aVar) {
        f1436a.mo2020b((Object) view, aVar.f1437a);
    }

    /* renamed from: android.support.v4.widget.u$a */
    /* compiled from: SearchViewCompat */
    public static abstract class C0591a {

        /* renamed from: a */
        final Object f1437a = C0590u.f1436a.mo2011a(this);

        /* renamed from: a */
        public boolean mo2006a() {
            return false;
        }
    }

    /* renamed from: a */
    public static CharSequence m3391a(View view) {
        return f1436a.mo2010a(view);
    }

    /* renamed from: a */
    public static void m3397a(View view, CharSequence charSequence, boolean z) {
        f1436a.mo2016a(view, charSequence, z);
    }

    /* renamed from: a */
    public static void m3396a(View view, CharSequence charSequence) {
        f1436a.mo2015a(view, charSequence);
    }

    /* renamed from: a */
    public static void m3398a(View view, boolean z) {
        f1436a.mo2017a(view, z);
    }

    /* renamed from: b */
    public static boolean m3401b(View view) {
        return f1436a.mo2021b(view);
    }

    /* renamed from: b */
    public static void m3400b(View view, boolean z) {
        f1436a.mo2019b(view, z);
    }

    /* renamed from: c */
    public static boolean m3404c(View view) {
        return f1436a.mo2023c(view);
    }

    /* renamed from: c */
    public static void m3403c(View view, boolean z) {
        f1436a.mo2022c(view, z);
    }

    /* renamed from: d */
    public static boolean m3405d(View view) {
        return f1436a.mo2024d(view);
    }

    /* renamed from: c */
    public static void m3402c(View view, int i) {
        f1436a.mo2013a(view, i);
    }
}
