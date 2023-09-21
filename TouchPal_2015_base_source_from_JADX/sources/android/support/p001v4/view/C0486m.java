package android.support.p001v4.view;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: android.support.v4.view.m */
/* compiled from: KeyEventCompatEclair */
class C0486m {
    C0486m() {
    }

    /* renamed from: a */
    public static Object m2765a(View view) {
        return view.getKeyDispatcherState();
    }

    /* renamed from: a */
    public static boolean m2767a(KeyEvent keyEvent, KeyEvent.Callback callback, Object obj, Object obj2) {
        return keyEvent.dispatch(callback, (KeyEvent.DispatcherState) obj, obj2);
    }

    /* renamed from: a */
    public static void m2766a(KeyEvent keyEvent) {
        keyEvent.startTracking();
    }

    /* renamed from: b */
    public static boolean m2768b(KeyEvent keyEvent) {
        return keyEvent.isTracking();
    }
}
