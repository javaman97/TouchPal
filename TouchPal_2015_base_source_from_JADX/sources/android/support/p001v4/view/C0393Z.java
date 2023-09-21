package android.support.p001v4.view;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.view.Z */
/* compiled from: ViewPropertyAnimatorCompat */
public class C0393Z {

    /* renamed from: a */
    static final C0398e f989a;

    /* renamed from: b */
    private static final String f990b = "ViewAnimatorCompat";

    /* renamed from: c */
    private WeakReference<View> f991c;

    /* renamed from: android.support.v4.view.Z$e */
    /* compiled from: ViewPropertyAnimatorCompat */
    interface C0398e {
        /* renamed from: a */
        long mo1264a(View view);

        /* renamed from: a */
        void mo1265a(View view, float f);

        /* renamed from: a */
        void mo1266a(View view, long j);

        /* renamed from: a */
        void mo1267a(View view, C0458ah ahVar);

        /* renamed from: a */
        void mo1268a(View view, Interpolator interpolator);

        /* renamed from: a */
        void mo1269a(View view, Runnable runnable);

        /* renamed from: b */
        Interpolator mo1270b(View view);

        /* renamed from: b */
        void mo1271b(View view, float f);

        /* renamed from: b */
        void mo1272b(View view, long j);

        /* renamed from: b */
        void mo1273b(View view, Runnable runnable);

        /* renamed from: c */
        long mo1274c(View view);

        /* renamed from: c */
        void mo1275c(View view, float f);

        /* renamed from: d */
        void mo1276d(View view);

        /* renamed from: d */
        void mo1277d(View view, float f);

        /* renamed from: e */
        void mo1278e(View view);

        /* renamed from: e */
        void mo1279e(View view, float f);

        /* renamed from: f */
        void mo1280f(View view);

        /* renamed from: f */
        void mo1281f(View view, float f);

        /* renamed from: g */
        void mo1282g(View view, float f);

        /* renamed from: h */
        void mo1283h(View view, float f);

        /* renamed from: i */
        void mo1284i(View view, float f);

        /* renamed from: j */
        void mo1285j(View view, float f);

        /* renamed from: k */
        void mo1286k(View view, float f);

        /* renamed from: l */
        void mo1287l(View view, float f);

        /* renamed from: m */
        void mo1288m(View view, float f);

        /* renamed from: n */
        void mo1289n(View view, float f);

        /* renamed from: o */
        void mo1290o(View view, float f);

        /* renamed from: p */
        void mo1291p(View view, float f);

        /* renamed from: q */
        void mo1292q(View view, float f);

        /* renamed from: r */
        void mo1293r(View view, float f);

        /* renamed from: s */
        void mo1294s(View view, float f);

        /* renamed from: t */
        void mo1295t(View view, float f);
    }

    C0393Z(View view) {
        this.f991c = new WeakReference<>(view);
    }

    /* renamed from: android.support.v4.view.Z$a */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class C0394a implements C0398e {
        C0394a() {
        }

        /* renamed from: a */
        public void mo1266a(View view, long j) {
        }

        /* renamed from: a */
        public void mo1265a(View view, float f) {
        }

        /* renamed from: b */
        public void mo1271b(View view, float f) {
        }

        /* renamed from: c */
        public void mo1275c(View view, float f) {
        }

        /* renamed from: a */
        public void mo1269a(View view, Runnable runnable) {
            runnable.run();
        }

        /* renamed from: a */
        public long mo1264a(View view) {
            return 0;
        }

        /* renamed from: a */
        public void mo1268a(View view, Interpolator interpolator) {
        }

        /* renamed from: b */
        public Interpolator mo1270b(View view) {
            return null;
        }

        /* renamed from: b */
        public void mo1272b(View view, long j) {
        }

        /* renamed from: c */
        public long mo1274c(View view) {
            return 0;
        }

        /* renamed from: d */
        public void mo1277d(View view, float f) {
        }

        /* renamed from: e */
        public void mo1279e(View view, float f) {
        }

        /* renamed from: f */
        public void mo1281f(View view, float f) {
        }

        /* renamed from: g */
        public void mo1282g(View view, float f) {
        }

        /* renamed from: h */
        public void mo1283h(View view, float f) {
        }

        /* renamed from: i */
        public void mo1284i(View view, float f) {
        }

        /* renamed from: j */
        public void mo1285j(View view, float f) {
        }

        /* renamed from: k */
        public void mo1286k(View view, float f) {
        }

        /* renamed from: l */
        public void mo1287l(View view, float f) {
        }

        /* renamed from: m */
        public void mo1288m(View view, float f) {
        }

        /* renamed from: n */
        public void mo1289n(View view, float f) {
        }

        /* renamed from: d */
        public void mo1276d(View view) {
        }

        /* renamed from: o */
        public void mo1290o(View view, float f) {
        }

        /* renamed from: p */
        public void mo1291p(View view, float f) {
        }

        /* renamed from: q */
        public void mo1292q(View view, float f) {
        }

        /* renamed from: r */
        public void mo1293r(View view, float f) {
        }

        /* renamed from: s */
        public void mo1294s(View view, float f) {
        }

        /* renamed from: t */
        public void mo1295t(View view, float f) {
        }

        /* renamed from: e */
        public void mo1278e(View view) {
        }

        /* renamed from: f */
        public void mo1280f(View view) {
        }

        /* renamed from: b */
        public void mo1273b(View view, Runnable runnable) {
            runnable.run();
        }

        /* renamed from: a */
        public void mo1267a(View view, C0458ah ahVar) {
        }
    }

    /* renamed from: android.support.v4.view.Z$b */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class C0395b extends C0394a {
        C0395b() {
        }

        /* renamed from: a */
        public void mo1266a(View view, long j) {
            C0454ad.m2580a(view, j);
        }

        /* renamed from: a */
        public void mo1265a(View view, float f) {
            C0454ad.m2579a(view, f);
        }

        /* renamed from: b */
        public void mo1271b(View view, float f) {
            C0454ad.m2584b(view, f);
        }

        /* renamed from: c */
        public void mo1275c(View view, float f) {
            C0454ad.m2587c(view, f);
        }

        /* renamed from: a */
        public long mo1264a(View view) {
            return C0454ad.m2578a(view);
        }

        /* renamed from: a */
        public void mo1268a(View view, Interpolator interpolator) {
            C0454ad.m2582a(view, interpolator);
        }

        /* renamed from: b */
        public void mo1272b(View view, long j) {
            C0454ad.m2585b(view, j);
        }

        /* renamed from: c */
        public long mo1274c(View view) {
            return C0454ad.m2583b(view);
        }

        /* renamed from: d */
        public void mo1277d(View view, float f) {
            C0454ad.m2589d(view, f);
        }

        /* renamed from: e */
        public void mo1279e(View view, float f) {
            C0454ad.m2590e(view, f);
        }

        /* renamed from: f */
        public void mo1281f(View view, float f) {
            C0454ad.m2591f(view, f);
        }

        /* renamed from: g */
        public void mo1282g(View view, float f) {
            C0454ad.m2592g(view, f);
        }

        /* renamed from: h */
        public void mo1283h(View view, float f) {
            C0454ad.m2593h(view, f);
        }

        /* renamed from: i */
        public void mo1284i(View view, float f) {
            C0454ad.m2594i(view, f);
        }

        /* renamed from: j */
        public void mo1285j(View view, float f) {
            C0454ad.m2595j(view, f);
        }

        /* renamed from: k */
        public void mo1286k(View view, float f) {
            C0454ad.m2596k(view, f);
        }

        /* renamed from: l */
        public void mo1287l(View view, float f) {
            C0454ad.m2597l(view, f);
        }

        /* renamed from: m */
        public void mo1288m(View view, float f) {
            C0454ad.m2598m(view, f);
        }

        /* renamed from: n */
        public void mo1289n(View view, float f) {
            C0454ad.m2599n(view, f);
        }

        /* renamed from: d */
        public void mo1276d(View view) {
            C0454ad.m2586c(view);
        }

        /* renamed from: o */
        public void mo1290o(View view, float f) {
            C0454ad.m2600o(view, f);
        }

        /* renamed from: p */
        public void mo1291p(View view, float f) {
            C0454ad.m2601p(view, f);
        }

        /* renamed from: q */
        public void mo1292q(View view, float f) {
            C0454ad.m2602q(view, f);
        }

        /* renamed from: r */
        public void mo1293r(View view, float f) {
            C0454ad.m2603r(view, f);
        }

        /* renamed from: s */
        public void mo1294s(View view, float f) {
            C0454ad.m2604s(view, f);
        }

        /* renamed from: t */
        public void mo1295t(View view, float f) {
            C0454ad.m2605t(view, f);
        }

        /* renamed from: e */
        public void mo1278e(View view) {
            C0454ad.m2588d(view);
        }

        /* renamed from: a */
        public void mo1267a(View view, C0458ah ahVar) {
            C0454ad.m2581a(view, ahVar);
        }

        /* renamed from: a */
        public void mo1269a(View view, Runnable runnable) {
            mo1267a(view, (C0458ah) new C0451aa(this, runnable));
        }

        /* renamed from: b */
        public void mo1273b(View view, Runnable runnable) {
            mo1267a(view, (C0458ah) new C0452ab(this, runnable));
        }

        /* renamed from: f */
        public void mo1280f(View view) {
            mo1267a(view, (C0458ah) new C0453ac(this, C0333F.m1364g(view)));
        }
    }

    /* renamed from: android.support.v4.view.Z$d */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class C0397d extends C0395b {
        C0397d() {
        }

        /* renamed from: b */
        public void mo1273b(View view, Runnable runnable) {
            C0456af.m2607a(view, runnable);
        }

        /* renamed from: a */
        public void mo1269a(View view, Runnable runnable) {
            C0456af.m2608b(view, runnable);
        }

        /* renamed from: f */
        public void mo1280f(View view) {
            C0456af.m2606a(view);
        }
    }

    /* renamed from: android.support.v4.view.Z$c */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class C0396c extends C0397d {
        C0396c() {
        }

        /* renamed from: b */
        public Interpolator mo1270b(View view) {
            return C0457ag.m2609a(view);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            f989a = new C0396c();
        } else if (i >= 16) {
            f989a = new C0397d();
        } else if (i >= 14) {
            f989a = new C0395b();
        } else {
            f989a = new C0394a();
        }
    }

    /* renamed from: a */
    public C0393Z mo1234a(long j) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1266a(view, j);
        }
        return this;
    }

    /* renamed from: a */
    public C0393Z mo1233a(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1265a(view, f);
        }
        return this;
    }

    /* renamed from: b */
    public C0393Z mo1238b(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1277d(view, f);
        }
        return this;
    }

    /* renamed from: c */
    public C0393Z mo1243c(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1271b(view, f);
        }
        return this;
    }

    /* renamed from: d */
    public C0393Z mo1244d(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1275c(view, f);
        }
        return this;
    }

    /* renamed from: a */
    public C0393Z mo1237a(Runnable runnable) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1269a(view, runnable);
        }
        return this;
    }

    /* renamed from: a */
    public long mo1232a() {
        View view = (View) this.f991c.get();
        if (view != null) {
            return f989a.mo1264a(view);
        }
        return 0;
    }

    /* renamed from: a */
    public C0393Z mo1236a(Interpolator interpolator) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1268a(view, interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public Interpolator mo1241b() {
        View view = (View) this.f991c.get();
        if (view != null) {
            return f989a.mo1270b(view);
        }
        return null;
    }

    /* renamed from: b */
    public C0393Z mo1239b(long j) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1272b(view, j);
        }
        return this;
    }

    /* renamed from: c */
    public long mo1242c() {
        View view = (View) this.f991c.get();
        if (view != null) {
            return f989a.mo1274c(view);
        }
        return 0;
    }

    /* renamed from: e */
    public C0393Z mo1246e(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1279e(view, f);
        }
        return this;
    }

    /* renamed from: f */
    public C0393Z mo1249f(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1281f(view, f);
        }
        return this;
    }

    /* renamed from: g */
    public C0393Z mo1250g(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1282g(view, f);
        }
        return this;
    }

    /* renamed from: h */
    public C0393Z mo1251h(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1283h(view, f);
        }
        return this;
    }

    /* renamed from: i */
    public C0393Z mo1252i(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1284i(view, f);
        }
        return this;
    }

    /* renamed from: j */
    public C0393Z mo1253j(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1285j(view, f);
        }
        return this;
    }

    /* renamed from: k */
    public C0393Z mo1254k(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1286k(view, f);
        }
        return this;
    }

    /* renamed from: l */
    public C0393Z mo1255l(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1287l(view, f);
        }
        return this;
    }

    /* renamed from: m */
    public C0393Z mo1256m(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1288m(view, f);
        }
        return this;
    }

    /* renamed from: n */
    public C0393Z mo1257n(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1289n(view, f);
        }
        return this;
    }

    /* renamed from: d */
    public void mo1245d() {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1276d(view);
        }
    }

    /* renamed from: o */
    public C0393Z mo1258o(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1290o(view, f);
        }
        return this;
    }

    /* renamed from: p */
    public C0393Z mo1259p(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1291p(view, f);
        }
        return this;
    }

    /* renamed from: q */
    public C0393Z mo1260q(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1292q(view, f);
        }
        return this;
    }

    /* renamed from: r */
    public C0393Z mo1261r(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1293r(view, f);
        }
        return this;
    }

    /* renamed from: s */
    public C0393Z mo1262s(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1294s(view, f);
        }
        return this;
    }

    /* renamed from: t */
    public C0393Z mo1263t(float f) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1295t(view, f);
        }
        return this;
    }

    /* renamed from: e */
    public void mo1247e() {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1278e(view);
        }
    }

    /* renamed from: f */
    public C0393Z mo1248f() {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1280f(view);
        }
        return this;
    }

    /* renamed from: b */
    public C0393Z mo1240b(Runnable runnable) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1273b(view, runnable);
        }
        return this;
    }

    /* renamed from: a */
    public C0393Z mo1235a(C0458ah ahVar) {
        View view = (View) this.f991c.get();
        if (view != null) {
            f989a.mo1267a(view, ahVar);
        }
        return this;
    }
}
