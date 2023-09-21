package android.support.p001v4.widget;

import android.os.Build;
import android.view.View;

/* renamed from: android.support.v4.widget.o */
/* compiled from: PopupMenuCompat */
public class C0577o {

    /* renamed from: a */
    static final C0580c f1428a;

    /* renamed from: android.support.v4.widget.o$c */
    /* compiled from: PopupMenuCompat */
    interface C0580c {
        /* renamed from: a */
        View.OnTouchListener mo1972a(Object obj);
    }

    /* renamed from: android.support.v4.widget.o$a */
    /* compiled from: PopupMenuCompat */
    static class C0578a implements C0580c {
        C0578a() {
        }

        /* renamed from: a */
        public View.OnTouchListener mo1972a(Object obj) {
            return null;
        }
    }

    /* renamed from: android.support.v4.widget.o$b */
    /* compiled from: PopupMenuCompat */
    static class C0579b extends C0578a {
        C0579b() {
        }

        /* renamed from: a */
        public View.OnTouchListener mo1972a(Object obj) {
            return C0581p.m3302a(obj);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f1428a = new C0579b();
        } else {
            f1428a = new C0578a();
        }
    }

    private C0577o() {
    }

    /* renamed from: a */
    public static View.OnTouchListener m3298a(Object obj) {
        return f1428a.mo1972a(obj);
    }
}
