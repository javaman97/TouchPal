package android.support.p001v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.K */
/* compiled from: ViewCompatJB */
class C0353K {
    C0353K() {
    }

    /* renamed from: a */
    public static boolean m1641a(View view) {
        return view.hasTransientState();
    }

    /* renamed from: a */
    public static void m1640a(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* renamed from: b */
    public static void m1643b(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: a */
    public static void m1637a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidate(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m1638a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: a */
    public static void m1639a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: c */
    public static int m1644c(View view) {
        return view.getImportantForAccessibility();
    }

    /* renamed from: a */
    public static void m1636a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* renamed from: a */
    public static boolean m1642a(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    /* renamed from: d */
    public static Object m1645d(View view) {
        return view.getAccessibilityNodeProvider();
    }

    /* renamed from: e */
    public static ViewParent m1646e(View view) {
        return view.getParentForAccessibility();
    }

    /* renamed from: f */
    public static int m1647f(View view) {
        return view.getMinimumWidth();
    }

    /* renamed from: g */
    public static int m1648g(View view) {
        return view.getMinimumHeight();
    }
}
