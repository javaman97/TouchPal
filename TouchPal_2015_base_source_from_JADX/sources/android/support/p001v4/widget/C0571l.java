package android.support.p001v4.widget;

import android.os.Build;
import android.view.View;

/* renamed from: android.support.v4.widget.l */
/* compiled from: ListPopupWindowCompat */
public class C0571l {

    /* renamed from: a */
    static final C0574c f1426a;

    /* renamed from: android.support.v4.widget.l$c */
    /* compiled from: ListPopupWindowCompat */
    interface C0574c {
        /* renamed from: a */
        View.OnTouchListener mo1971a(Object obj, View view);
    }

    /* renamed from: android.support.v4.widget.l$a */
    /* compiled from: ListPopupWindowCompat */
    static class C0572a implements C0574c {
        C0572a() {
        }

        /* renamed from: a */
        public View.OnTouchListener mo1971a(Object obj, View view) {
            return null;
        }
    }

    /* renamed from: android.support.v4.widget.l$b */
    /* compiled from: ListPopupWindowCompat */
    static class C0573b extends C0572a {
        C0573b() {
        }

        /* renamed from: a */
        public View.OnTouchListener mo1971a(Object obj, View view) {
            return C0575m.m3294a(obj, view);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f1426a = new C0573b();
        } else {
            f1426a = new C0572a();
        }
    }

    private C0571l() {
    }

    /* renamed from: a */
    public static View.OnTouchListener m3290a(Object obj, View view) {
        return f1426a.mo1971a(obj, view);
    }
}
