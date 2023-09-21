package android.support.p001v4.view;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.view.J */
/* compiled from: ViewCompatICS */
class C0352J {
    C0352J() {
    }

    /* renamed from: a */
    public static boolean m1632a(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    /* renamed from: b */
    public static boolean m1635b(View view, int i) {
        return view.canScrollVertically(i);
    }

    /* renamed from: a */
    public static void m1631a(View view, Object obj) {
        view.setAccessibilityDelegate((View.AccessibilityDelegate) obj);
    }

    /* renamed from: a */
    public static void m1630a(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m1633b(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m1634b(View view, Object obj) {
        view.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo) obj);
    }
}
