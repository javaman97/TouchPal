package android.support.p001v4.view;

import android.os.Build;
import android.view.ViewConfiguration;

/* renamed from: android.support.v4.view.N */
/* compiled from: ViewConfigurationCompat */
public class C0356N {

    /* renamed from: a */
    static final C0359c f845a;

    /* renamed from: android.support.v4.view.N$c */
    /* compiled from: ViewConfigurationCompat */
    interface C0359c {
        /* renamed from: a */
        int mo1112a(ViewConfiguration viewConfiguration);
    }

    /* renamed from: android.support.v4.view.N$a */
    /* compiled from: ViewConfigurationCompat */
    static class C0357a implements C0359c {
        C0357a() {
        }

        /* renamed from: a */
        public int mo1112a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledTouchSlop();
        }
    }

    /* renamed from: android.support.v4.view.N$b */
    /* compiled from: ViewConfigurationCompat */
    static class C0358b implements C0359c {
        C0358b() {
        }

        /* renamed from: a */
        public int mo1112a(ViewConfiguration viewConfiguration) {
            return C0360O.m1663a(viewConfiguration);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f845a = new C0358b();
        } else {
            f845a = new C0357a();
        }
    }

    /* renamed from: a */
    public static int m1659a(ViewConfiguration viewConfiguration) {
        return f845a.mo1112a(viewConfiguration);
    }
}
