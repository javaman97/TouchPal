package android.support.p001v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.view.d */
/* compiled from: AccessibilityDelegateCompatIcs */
class C0462d {

    /* renamed from: android.support.v4.view.d$a */
    /* compiled from: AccessibilityDelegateCompatIcs */
    public interface C0463a {
        /* renamed from: a */
        void mo1573a(View view, int i);

        /* renamed from: a */
        void mo1574a(View view, Object obj);

        /* renamed from: a */
        boolean mo1575a(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        boolean mo1576a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo1577b(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: c */
        void mo1578c(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: d */
        void mo1579d(View view, AccessibilityEvent accessibilityEvent);
    }

    C0462d() {
    }

    /* renamed from: a */
    public static Object m2629a() {
        return new View.AccessibilityDelegate();
    }

    /* renamed from: a */
    public static Object m2630a(C0463a aVar) {
        return new C0464e(aVar);
    }

    /* renamed from: a */
    public static boolean m2633a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        return ((View.AccessibilityDelegate) obj).dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public static void m2635b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public static void m2632a(Object obj, View view, Object obj2) {
        ((View.AccessibilityDelegate) obj).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo) obj2);
    }

    /* renamed from: c */
    public static void m2636c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public static boolean m2634a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return ((View.AccessibilityDelegate) obj).onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public static void m2631a(Object obj, View view, int i) {
        ((View.AccessibilityDelegate) obj).sendAccessibilityEvent(view, i);
    }

    /* renamed from: d */
    public static void m2637d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
