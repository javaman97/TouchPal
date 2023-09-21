package android.support.p001v4.view;

import android.view.KeyEvent;

/* renamed from: android.support.v4.view.n */
/* compiled from: KeyEventCompatHoneycomb */
class C0487n {
    C0487n() {
    }

    /* renamed from: a */
    public static int m2769a(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    /* renamed from: a */
    public static boolean m2770a(int i, int i2) {
        return KeyEvent.metaStateHasModifiers(i, i2);
    }

    /* renamed from: b */
    public static boolean m2771b(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
