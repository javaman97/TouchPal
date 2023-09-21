package android.support.p001v4.view.p017a;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.view.a.i */
/* compiled from: AccessibilityNodeInfoCompatJellyBean */
class C0426i {
    C0426i() {
    }

    /* renamed from: a */
    public static void m2291a(Object obj, View view, int i) {
        ((AccessibilityNodeInfo) obj).addChild(view, i);
    }

    /* renamed from: b */
    public static void m2297b(Object obj, View view, int i) {
        ((AccessibilityNodeInfo) obj).setSource(view, i);
    }

    /* renamed from: a */
    public static boolean m2293a(Object obj) {
        return ((AccessibilityNodeInfo) obj).isVisibleToUser();
    }

    /* renamed from: a */
    public static void m2292a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setVisibleToUser(z);
    }

    /* renamed from: a */
    public static boolean m2294a(Object obj, int i, Bundle bundle) {
        return ((AccessibilityNodeInfo) obj).performAction(i, bundle);
    }

    /* renamed from: a */
    public static void m2290a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).setMovementGranularities(i);
    }

    /* renamed from: b */
    public static int m2295b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getMovementGranularities();
    }

    /* renamed from: a */
    public static Object m2289a(View view, int i) {
        return AccessibilityNodeInfo.obtain(view, i);
    }

    /* renamed from: b */
    public static Object m2296b(Object obj, int i) {
        return ((AccessibilityNodeInfo) obj).findFocus(i);
    }

    /* renamed from: c */
    public static Object m2299c(Object obj, int i) {
        return ((AccessibilityNodeInfo) obj).focusSearch(i);
    }

    /* renamed from: c */
    public static void m2300c(Object obj, View view, int i) {
        ((AccessibilityNodeInfo) obj).setParent(view, i);
    }

    /* renamed from: c */
    public static boolean m2301c(Object obj) {
        return ((AccessibilityNodeInfo) obj).isAccessibilityFocused();
    }

    /* renamed from: b */
    public static void m2298b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setAccessibilityFocused(z);
    }
}
