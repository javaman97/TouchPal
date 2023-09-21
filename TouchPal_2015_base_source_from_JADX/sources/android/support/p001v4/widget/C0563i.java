package android.support.p001v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;

/* renamed from: android.support.v4.widget.i */
/* compiled from: EdgeEffectCompat */
public class C0563i {

    /* renamed from: b */
    private static final C0566c f1412b;

    /* renamed from: a */
    private Object f1413a;

    /* renamed from: android.support.v4.widget.i$c */
    /* compiled from: EdgeEffectCompat */
    interface C0566c {
        /* renamed from: a */
        Object mo1953a(Context context);

        /* renamed from: a */
        void mo1954a(Object obj, int i, int i2);

        /* renamed from: a */
        boolean mo1955a(Object obj);

        /* renamed from: a */
        boolean mo1956a(Object obj, float f);

        /* renamed from: a */
        boolean mo1957a(Object obj, int i);

        /* renamed from: a */
        boolean mo1958a(Object obj, Canvas canvas);

        /* renamed from: b */
        void mo1959b(Object obj);

        /* renamed from: c */
        boolean mo1960c(Object obj);
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f1412b = new C0565b();
        } else {
            f1412b = new C0564a();
        }
    }

    /* renamed from: android.support.v4.widget.i$a */
    /* compiled from: EdgeEffectCompat */
    static class C0564a implements C0566c {
        C0564a() {
        }

        /* renamed from: a */
        public Object mo1953a(Context context) {
            return null;
        }

        /* renamed from: a */
        public void mo1954a(Object obj, int i, int i2) {
        }

        /* renamed from: a */
        public boolean mo1955a(Object obj) {
            return true;
        }

        /* renamed from: b */
        public void mo1959b(Object obj) {
        }

        /* renamed from: a */
        public boolean mo1956a(Object obj, float f) {
            return false;
        }

        /* renamed from: c */
        public boolean mo1960c(Object obj) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1957a(Object obj, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1958a(Object obj, Canvas canvas) {
            return false;
        }
    }

    /* renamed from: android.support.v4.widget.i$b */
    /* compiled from: EdgeEffectCompat */
    static class C0565b implements C0566c {
        C0565b() {
        }

        /* renamed from: a */
        public Object mo1953a(Context context) {
            return C0567j.m3252a(context);
        }

        /* renamed from: a */
        public void mo1954a(Object obj, int i, int i2) {
            C0567j.m3253a(obj, i, i2);
        }

        /* renamed from: a */
        public boolean mo1955a(Object obj) {
            return C0567j.m3254a(obj);
        }

        /* renamed from: b */
        public void mo1959b(Object obj) {
            C0567j.m3258b(obj);
        }

        /* renamed from: a */
        public boolean mo1956a(Object obj, float f) {
            return C0567j.m3255a(obj, f);
        }

        /* renamed from: c */
        public boolean mo1960c(Object obj) {
            return C0567j.m3259c(obj);
        }

        /* renamed from: a */
        public boolean mo1957a(Object obj, int i) {
            return C0567j.m3256a(obj, i);
        }

        /* renamed from: a */
        public boolean mo1958a(Object obj, Canvas canvas) {
            return C0567j.m3257a(obj, canvas);
        }
    }

    public C0563i(Context context) {
        this.f1413a = f1412b.mo1953a(context);
    }

    /* renamed from: a */
    public void mo1946a(int i, int i2) {
        f1412b.mo1954a(this.f1413a, i, i2);
    }

    /* renamed from: a */
    public boolean mo1947a() {
        return f1412b.mo1955a(this.f1413a);
    }

    /* renamed from: b */
    public void mo1951b() {
        f1412b.mo1959b(this.f1413a);
    }

    /* renamed from: a */
    public boolean mo1948a(float f) {
        return f1412b.mo1956a(this.f1413a, f);
    }

    /* renamed from: c */
    public boolean mo1952c() {
        return f1412b.mo1960c(this.f1413a);
    }

    /* renamed from: a */
    public boolean mo1949a(int i) {
        return f1412b.mo1957a(this.f1413a, i);
    }

    /* renamed from: a */
    public boolean mo1950a(Canvas canvas) {
        return f1412b.mo1958a(this.f1413a, canvas);
    }
}
